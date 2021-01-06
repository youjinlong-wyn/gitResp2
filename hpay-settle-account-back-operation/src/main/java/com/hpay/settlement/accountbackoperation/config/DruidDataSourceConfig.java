package com.hpay.settlement.accountbackoperation.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

@Configuration
public class DruidDataSourceConfig {

    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();

        //数据源配置
        druidDataSource.setUrl("jdbc:mysql://8.133.182.106:3306/testMyBatisPlus?useUnicode=true&characterEncoding=utf8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("china76!");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //初始化时建立物理连接的个数
        druidDataSource.setInitialSize(5);
        //# 最大连接池数量
        druidDataSource.setMaxActive(20);
        //最小连接数
        druidDataSource.setMinIdle(5);
        //# 获取连接时最大等待时间，单位毫秒
        druidDataSource.setMaxWait(60000L);
        //# 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        druidDataSource.setTimeBetweenEvictionRunsMillis(60 * 1000L);
        //# 连接保持空闲而不被驱逐的最小时间
        druidDataSource.setMinEvictableIdleTimeMillis(300 * 1000L);
        // 用来检测连接是否有效的sql，要求是一个查询语句
        druidDataSource.setValidationQuery(" select 'x' ");
        // 建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
        druidDataSource.setTestWhileIdle(true);
        // 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
        druidDataSource.setTestOnBorrow(false);
        // 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
        druidDataSource.setTestOnReturn(false);

        //druidDataSource.setFilters("stat,wall,slf4j");
        druidDataSource.setFilters("stat,slf4j");

        druidDataSource.setProxyFilters(Arrays.asList(statFilter()));


        /**
         * # 这4个参数key里不带druid也可以，即可以还用上面的这个4个参数
         spring.datasource.druid.url=jdbc:mysql://localhost:3306/springboot?useUnicode=true&characterEncoding=utf-8&useSSL=false
         spring.datasource.druid.username=root
         spring.datasource.druid.password=root
         spring.datasource.druid.driver-class-name=com.mysql.jdbc.Driver

         # 初始化时建立物理连接的个数
         spring.datasource.druid.initial-size=5
         # 最大连接池数量
         spring.datasource.druid.max-active=30
         # 最小连接池数量
         spring.datasource.druid.min-idle=5
         # 获取连接时最大等待时间，单位毫秒
         spring.datasource.druid.max-wait=60000
         # 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
         spring.datasource.druid.time-between-eviction-runs-millis=60000
         # 连接保持空闲而不被驱逐的最小时间
         spring.datasource.druid.min-evictable-idle-time-millis=300000
         # 用来检测连接是否有效的sql，要求是一个查询语句
         spring.datasource.druid.validation-query=SELECT 1 FROM DUAL
         # 建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
         spring.datasource.druid.test-while-idle=true
         # 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
         spring.datasource.druid.test-on-borrow=false
         # 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
         spring.datasource.druid.test-on-return=false
         # 是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。
         spring.datasource.druid.pool-prepared-statements=true
         # 要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。
         spring.datasource.druid.max-pool-prepared-statement-per-connection-size=50
         # 配置监控统计拦截的filters，去掉后监控界面sql无法统计
         spring.datasource.druid.filters=stat,wall
         # 通过connectProperties属性来打开mergeSql功能；慢SQL记录
         spring.datasource.druid.connection-properties=druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500
         # 合并多个DruidDataSource的监控数据
         spring.datasource.druid.use-global-data-source-stat=true

         */


        return druidDataSource;
    }

    /**
     * 配置 druid的监控页功能
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
        //添加白名单
        //registrationBean.addInitParameter("allow", "127.0.0.1");
        //登录账号
        registrationBean.addInitParameter("loginUsername", "admin");
        //登录密码
        registrationBean.addInitParameter("loginPassword", "123456");
        //禁用重置按钮
        registrationBean.addInitParameter("resetEnable", "false");
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean webStatFilter() {
        WebStatFilter webStatFilter = new WebStatFilter();

        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        //添加过滤规则
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        ////添加需要忽略的格式信息
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");

        return filterRegistrationBean;
    }

    /**
     * 定义慢sql的Filter，出现慢sql可以打印出来
     *
     * @return
     */
    @Bean
    public Filter statFilter() {
        StatFilter statFilter = new StatFilter();
        //设定多长时间属于慢SQL 单位为毫秒
        statFilter.setSlowSqlMillis(100);
        //设置是否打印慢SQL日志
        statFilter.setLogSlowSql(true);
        //是否将日志合并
        statFilter.setMergeSql(true);
        return statFilter;
    }

}
