package juyuan.service.Impl;

import juyuan.entity.Student;
import juyuan.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements juyuan.service.StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 新增
     */
    public void save(Student student) {
        studentMapper.insert(student);
    }

    /**
     * 删除
     */
    public void deleteById(Integer id) {
        studentMapper.deleteById(id);
    }



    /**
     * 修改
     */
    public void update(Student student) {
        studentMapper.update(student);
    }

    public void updateById(String name, Integer id) {
        studentMapper.updateByid(name, id);
    }

    /**
     * 查询
     */
    public Student getById(Integer id) {
        Student student = studentMapper.getById(id);
        return student;
    }




}
