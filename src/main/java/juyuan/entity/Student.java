package juyuan.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private Integer studentId;

    private String name;

    private String gender;

    private Integer age;

    private String score;

    private String phone;

}
