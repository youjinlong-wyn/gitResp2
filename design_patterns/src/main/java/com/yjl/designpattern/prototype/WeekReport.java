package com.yjl.designpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-06 12:33
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WeekReport implements Cloneable, Serializable {
    private int id;
    private String emp;
    private String summary;
    private String plan;
    private String suggestion;
    private Date time;

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(this);
            oos.close();

            InputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(in);
            Object clone = ois.readObject();
            ois.close();

            return clone;

        } catch (Exception e) {
            e.printStackTrace();

            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) throws CloneNotSupportedException {
        WeekReport wr = new WeekReport();
        wr.setEmp("游金龙");
        wr.setSummary("学完设计模式");
        wr.setPlan("学习完设计模式");
        wr.setSuggestion("");
        wr.setTime(new Date());

        System.out.println(wr);

        WeekReport wr2 = (WeekReport) wr.clone();
        System.out.println(wr2);


    }


}


