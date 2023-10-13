package juyuan.mapper;

import juyuan.entity.Student;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentMapper {




    /**
     * 新增
     */
    @Insert("insert into student (student_id, name, gender, age, score, phone)" +
            "values" +
            "(#{studentId},#{name},#{gender},#{age},#{score},#{phone})")
    void insert(Student student);


    /**
     * 删除
     */
    @Delete("delete from student where student_id = #{id}")
    void deleteById(Integer id);




    /**
     * 修改
     */
    void update(Student student);


    @Update("update student set name = #{name} where sutdent_id = #{id} ")
    void updateByid(String name, Integer id);


    /**
     * 查询
     */
    @Select("select * from student where student_id = #{id}")
    Student getById(Integer id);

}
