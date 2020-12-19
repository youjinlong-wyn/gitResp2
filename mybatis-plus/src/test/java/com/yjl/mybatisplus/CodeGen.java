package com.yjl.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

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
        String projectPath = "D:/idea project/gitResp2/mybatis-plus";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("jlyou");
        gc.setOpen(false);

        // 是否覆盖【请注意，这里是true覆盖，请勿在实际代码中使用，建议在其他地方生产，copy过来】
        gc.setFileOverride(true);
        gc.setServiceName("I%sService"); // I{User}Service,IConfigService
        gc.setIdType(IdType.AUTO);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);

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
        pc.setModuleName("core");
        pc.setParent("com.jlyou");

        //entity包的名称，可以叫entity 或者 domian
        //根据上面的配置 entity包的路径为 com.jlyou.core.entity
        pc.setEntity("entity");

        //根据上面的配置 mapper包的路径为 com.jlyou.core.mapper
        pc.setMapper("mapper");

        //根据上面的配置 service 包的路径为 com.jlyou.core.service
        pc.setService("service");

        //根据上面的配置 controller 包的路径为 com.jlyou.core.controller
        pc.setController("controller");
        mpg.setPackageInfo(pc);
        //-----------------------------------------------3、包的配置 end ---------------------------------------------------


        //-----------------------------------------------4、策略配置 start ---------------------------------------------------
        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();

        //设置表名称,这里是... 变长参数、动态参数，可以是一个或者多个表名称
        strategy.setInclude("user");
        //驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //自动lombok
        strategy.setEntityLombokModel(true);
        //逻辑删除字段
        strategy.setLogicDeleteFieldName("deleted");
        //乐观锁字段
        strategy.setVersionFieldName("version");

        //-----------------------------自动填充配置 start -----------------------------
        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        TableFill updateTime = new TableFill("update_timie", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(createTime);
        tableFills.add(updateTime);
        strategy.setTableFillList(tableFills);
        //-----------------------------自动填充配置 end -----------------------------

        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true); // localhost:8080/hello_id_2
        mpg.setStrategy(strategy);
        //-----------------------------------------------4、策略配置 end --------------------------------------------------


        mpg.execute(); //执行
    }


}