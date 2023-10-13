package juyuan.service;

import juyuan.entity.Student;

public interface StudentService {

    /**
     * 新增
     */
    void save(Student student);


    /**
     * 删除
     */
    void deleteById(Integer id);


    /**
     * 修改
     */
    void update(Student student);

    void updateById(String name, Integer id);

    /**
     * 查询
     */
    Student getById(Integer id);


}
