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
 * ����������
 *
 * @author: jlyou
 * @date: 2020-12-19 14:45
 **/
public class CodeGen {
    public static void main(String[] args) { // ��Ҫ����һ�� �����Զ������� ����
        // ��Ҫ����һ�� �����Զ������� ����
        AutoGenerator mpg = new AutoGenerator();


        //------------------------------------------------1��ȫ������ start --------------------------------------------------
        //1��ȫ������
        GlobalConfig gc = new GlobalConfig();
        String projectPath = "D:/idea project/gitResp2/mybatis-plus";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("jlyou");
        gc.setOpen(false);

        // �Ƿ񸲸ǡ���ע�⣬������true���ǣ�������ʵ�ʴ�����ʹ�ã������������ط�������copy������
        gc.setFileOverride(true);
        gc.setServiceName("I%sService"); // I{User}Service,IConfigService
        gc.setIdType(IdType.AUTO);
        gc.setDateType(DateType.ONLY_DATE);
        //����Ҫʹ��swagger
        gc.setSwagger2(false);

        // �Զ����ļ�������ע�� %s ���Զ�����ʵ�����ԣ�
        // gc.setEntityName("%sEntity");
        // gc.setMapperName("%sDao")
        // gc.setXmlName("%sDao")
        // gc.setServiceName("MP%sService")
        // gc.setServiceImplName("%sServiceDiy")
        // gc.setControllerName("%sAction")

        // ����activeRecordģʽ
        gc.setActiveRecord(true);
        // XML ResultMap: mapper.xml���ɲ�ѯӳ����
        gc.setBaseResultMap(true);
        // XML ColumnList: mapper.xml���ɲ�ѯ�����
        gc.setBaseColumnList(true);
        mpg.setGlobalConfig(gc);
        //-----------------------------------------------1��ȫ������ start --------------------------------------------------

        //-----------------------------------------------2����������Դ start --------------------------------------------------
        //2����������Դ
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://8.133.182.106:3306/testMyBatisPlus?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("china76!");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);
        //-----------------------------------------------2����������Դ end --------------------------------------------------


        //-----------------------------------------------3���������� start --------------------------------------------------
        //3����������
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("core");
        pc.setParent("com.jlyou");

        //entity�������ƣ����Խ�entity ���� domian
        //������������� entity����·��Ϊ com.jlyou.core.entity
        pc.setEntity("entity");

        //������������� mapper����·��Ϊ com.jlyou.core.mapper
        pc.setMapper("mapper");

        //������������� service ����·��Ϊ com.jlyou.core.service
        pc.setService("service");

        //������������� controller ����·��Ϊ com.jlyou.core.controller
        pc.setController("controller");
        mpg.setPackageInfo(pc);
        //-----------------------------------------------3���������� end ---------------------------------------------------


        //-----------------------------------------------4���������� start ---------------------------------------------------
        //4����������
        StrategyConfig strategy = new StrategyConfig();

        //���ñ�����,������... �䳤��������̬������������һ�����߶��������
        strategy.setInclude("user");
        //�շ�����
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //�շ�����
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //�Զ�lombok
        strategy.setEntityLombokModel(true);
        //�߼�ɾ���ֶ�
        strategy.setLogicDeleteFieldName("deleted");
        //�ֹ����ֶ�
        strategy.setVersionFieldName("version");

        //-----------------------------�Զ�������� start -----------------------------
        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        TableFill updateTime = new TableFill("update_timie", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(createTime);
        tableFills.add(updateTime);
        strategy.setTableFillList(tableFills);
        //-----------------------------�Զ�������� end -----------------------------

        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true); // localhost:8080/hello_id_2
        mpg.setStrategy(strategy);
        //-----------------------------------------------4���������� end --------------------------------------------------


        mpg.execute(); //ִ��
    }


}