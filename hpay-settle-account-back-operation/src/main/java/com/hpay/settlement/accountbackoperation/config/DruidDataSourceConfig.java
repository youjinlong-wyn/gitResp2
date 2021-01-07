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

        //����Դ����
        druidDataSource.setUrl("jdbc:mysql://8.133.182.106:3306/testMyBatisPlus?useUnicode=true&characterEncoding=utf8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("china76!");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //��ʼ��ʱ�����������ӵĸ���
        druidDataSource.setInitialSize(5);
        //# ������ӳ�����
        druidDataSource.setMaxActive(20);
        //��С������
        druidDataSource.setMinIdle(5);
        //# ��ȡ����ʱ���ȴ�ʱ�䣬��λ����
        druidDataSource.setMaxWait(60000L);
        //# ���ü����òŽ���һ�μ�⣬�����Ҫ�رյĿ������ӣ���λ�Ǻ���
        druidDataSource.setTimeBetweenEvictionRunsMillis(60 * 1000L);
        //# ���ӱ��ֿ��ж������������Сʱ��
        druidDataSource.setMinEvictableIdleTimeMillis(300 * 1000L);
        // ������������Ƿ���Ч��sql��Ҫ����һ����ѯ���
        druidDataSource.setValidationQuery(" select 'x' ");
        // ��������Ϊtrue����Ӱ�����ܣ����ұ�֤��ȫ�ԡ��������ӵ�ʱ���⣬�������ʱ�����timeBetweenEvictionRunsMillis��ִ��validationQuery��������Ƿ���Ч��
        druidDataSource.setTestWhileIdle(true);
        // ��������ʱִ��validationQuery��������Ƿ���Ч������������ûή�����ܡ�
        druidDataSource.setTestOnBorrow(false);
        // �黹����ʱִ��validationQuery��������Ƿ���Ч������������ûή�����ܡ�
        druidDataSource.setTestOnReturn(false);

        //druidDataSource.setFilters("stat,wall,slf4j");
        druidDataSource.setFilters("stat,slf4j");

        druidDataSource.setProxyFilters(Arrays.asList(statFilter()));


        /**
         * # ��4������key�ﲻ��druidҲ���ԣ������Ի�����������4������
         spring.datasource.druid.url=jdbc:mysql://localhost:3306/springboot?useUnicode=true&characterEncoding=utf-8&useSSL=false
         spring.datasource.druid.username=root
         spring.datasource.druid.password=root
         spring.datasource.druid.driver-class-name=com.mysql.jdbc.Driver

         # ��ʼ��ʱ�����������ӵĸ���
         spring.datasource.druid.initial-size=5
         # ������ӳ�����
         spring.datasource.druid.max-active=30
         # ��С���ӳ�����
         spring.datasource.druid.min-idle=5
         # ��ȡ����ʱ���ȴ�ʱ�䣬��λ����
         spring.datasource.druid.max-wait=60000
         # ���ü����òŽ���һ�μ�⣬�����Ҫ�رյĿ������ӣ���λ�Ǻ���
         spring.datasource.druid.time-between-eviction-runs-millis=60000
         # ���ӱ��ֿ��ж������������Сʱ��
         spring.datasource.druid.min-evictable-idle-time-millis=300000
         # ������������Ƿ���Ч��sql��Ҫ����һ����ѯ���
         spring.datasource.druid.validation-query=SELECT 1 FROM DUAL
         # ��������Ϊtrue����Ӱ�����ܣ����ұ�֤��ȫ�ԡ��������ӵ�ʱ���⣬�������ʱ�����timeBetweenEvictionRunsMillis��ִ��validationQuery��������Ƿ���Ч��
         spring.datasource.druid.test-while-idle=true
         # ��������ʱִ��validationQuery��������Ƿ���Ч������������ûή�����ܡ�
         spring.datasource.druid.test-on-borrow=false
         # �黹����ʱִ��validationQuery��������Ƿ���Ч������������ûή�����ܡ�
         spring.datasource.druid.test-on-return=false
         # �Ƿ񻺴�preparedStatement��Ҳ����PSCache��PSCache��֧���α�����ݿ����������޴󣬱���˵oracle����mysql�½���رա�
         spring.datasource.druid.pool-prepared-statements=true
         # Ҫ����PSCache���������ô���0��������0ʱ��poolPreparedStatements�Զ������޸�Ϊtrue��
         spring.datasource.druid.max-pool-prepared-statement-per-connection-size=50
         # ���ü��ͳ�����ص�filters��ȥ�����ؽ���sql�޷�ͳ��
         spring.datasource.druid.filters=stat,wall
         # ͨ��connectProperties��������mergeSql���ܣ���SQL��¼
         spring.datasource.druid.connection-properties=druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500
         # �ϲ����DruidDataSource�ļ������
         spring.datasource.druid.use-global-data-source-stat=true

         */


        return druidDataSource;
    }

    /**
     * ���� druid�ļ��ҳ����
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
        //��Ӱ�����
        //registrationBean.addInitParameter("allow", "127.0.0.1");
        //��¼�˺�
        registrationBean.addInitParameter("loginUsername", "admin");
        //��¼����
        registrationBean.addInitParameter("loginPassword", "123456");
        //�������ð�ť
        registrationBean.addInitParameter("resetEnable", "false");
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean webStatFilter() {
        WebStatFilter webStatFilter = new WebStatFilter();

        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        //��ӹ��˹���
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        ////�����Ҫ���Եĸ�ʽ��Ϣ
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");

        return filterRegistrationBean;
    }

    /**
     * ������sql��Filter��������sql���Դ�ӡ����
     *
     * @return
     */
    @Bean
    public Filter statFilter() {
        StatFilter statFilter = new StatFilter();
        //�趨�೤ʱ��������SQL ��λΪ����
        statFilter.setSlowSqlMillis(100);
        //�����Ƿ��ӡ��SQL��־
        statFilter.setLogSlowSql(true);
        //�Ƿ���־�ϲ�
        statFilter.setMergeSql(true);
        return statFilter;
    }

}
