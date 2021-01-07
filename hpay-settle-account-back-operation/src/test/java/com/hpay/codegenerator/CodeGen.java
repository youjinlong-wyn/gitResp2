package com.hpay.codegenerator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码生成器
 *
 * @author: jlyou
 * @date: 2020-12-19 14:45
 **/
public class CodeGen {
    public static void main(String[] args) { // 需要构建一个 代码自动生成器 对象
        // 需要构建一个 代码自动生成器 对象
        AutoGenerator mpg = new AutoGenerator();


        //------------------------------------------------1、全局配置 start --------------------------------------------------
        //1、全局配置
        GlobalConfig gc = new GlobalConfig();
        //String projectPath = "V:\\idea project\\账账通支撑\\hpay-settle-account-back-operation";
        String projectPath = "D:\\idea project\\gitResp2\\hpay-settle-account-back-operation";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("jlyou");
        gc.setOpen(false);

        // 是否覆盖【请注意，这里是true覆盖，请勿在实际代码中使用，建议在其他地方生产，copy过来】
        gc.setFileOverride(true);
        gc.setServiceName("I%sService"); // I{User}Service,IConfigService
        gc.setIdType(IdType.INPUT);
        gc.setDateType(DateType.ONLY_DATE);
        //不需要使用swagger
        gc.setSwagger2(false);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setEntityName("%sEntity");
        // gc.setMapperName("%sDao")
        // gc.setXmlName("%sDao")
        // gc.setServiceName("MP%sService")
        // gc.setServiceImplName("%sServiceDiy")
        // gc.setControllerName("%sAction")

        // 开启activeRecord模式
        gc.setActiveRecord(true);
        // XML ResultMap: mapper.xml生成查询映射结果
        gc.setBaseResultMap(true);
        // XML ColumnList: mapper.xml生成查询结果列
        gc.setBaseColumnList(true);
        mpg.setGlobalConfig(gc);
        //-----------------------------------------------1、全局配置 start --------------------------------------------------

        //-----------------------------------------------2、设置数据源 start --------------------------------------------------
        //2、设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        //dsc.setUrl("jdbc:oracle:thin:@10.148.181.247:1521/hpdb23");
        //dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
        //dsc.setUsername("hpay");
        //dsc.setPassword("handpay");
        //dsc.setDbType(DbType.ORACLE);

        dsc.setUrl("jdbc:mysql://8.133.182.106:3306/testMyBatisPlus?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("china76!");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);
        //-----------------------------------------------2、设置数据源 end --------------------------------------------------


        //-----------------------------------------------3、包的配置 start --------------------------------------------------
        //3、包的配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("accountbackoperation");
        pc.setParent("com.hpay.settlement");

        //entity包的名称，可以叫entity 或者 domian
        //根据上面的配置 entity包的路径为 com.hpay.settlement.accountbackoperation.entity
        pc.setEntity("db.entity");

        //根据上面的配置 mapper包的路径为 com.hpay.settlement.accountbackoperation.mapper
        pc.setMapper("db.mapper");

        //根据上面的配置 service 包的路径为com.hpay.settlement.accountbackoperation.service
        pc.setService("service");

        //根据上面的配置 controller 包的路径为 com.hpay.settlement.accountbackoperation.controller
        pc.setController("controller");
        mpg.setPackageInfo(pc);
        //-----------------------------------------------3、包的配置 end ---------------------------------------------------


        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/" //+ pc.getModuleName() + "/"
                        + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        templateConfig.setEntity("/templates/settle_entity.java");
        templateConfig.setService("/templates/settle_service.java");
        templateConfig.setServiceImpl("/templates/settle_serviceImpl.java");
        templateConfig.setController(null);
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);


        //-----------------------------------------------4、策略配置 start ---------------------------------------------------
        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();

        //设置表名称,这里是... 变长参数、动态参数，可以是一个或者多个表名称
        //strategy.setInclude("SVS_ACCOUNT", "SVS_ACCOUNT_BALANCE", "SVS_BALANCE_UPDATE_LOG", "SVS_ACCOUNT_DAY_BALANCE");
        strategy.setInclude("user");
        //驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //自动lombok
        strategy.setEntityLombokModel(true);
        //逻辑删除字段
        //strategy.setLogicDeleteFieldName("deleted");
        //乐观锁字段
        //strategy.setVersionFieldName("version");

        //-----------------------------自动填充配置 start -----------------------------
        //TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        //TableFill updateTime = new TableFill("update_timie", FieldFill.INSERT_UPDATE);
        //ArrayList<TableFill> tableFills = new ArrayList<>();
        //tableFills.add(createTime);
        //tableFills.add(updateTime);
        //strategy.setTableFillList(tableFills);
        //-----------------------------自动填充配置 end -----------------------------

        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true); // localhost:8080/hello_id_2
        mpg.setStrategy(strategy);
        //-----------------------------------------------4、策略配置 end --------------------------------------------------


        mpg.setTemplateEngine(new SettleTemplateEngineWapper());

        mpg.execute(); //执行
    }


}