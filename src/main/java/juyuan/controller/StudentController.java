package juyuan.controller;

import juyuan.entity.Student;
import juyuan.result.Result;
import juyuan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 新增
     */
    @PostMapping
    public Result save(@RequestBody Student student){
        studentService.save(student);

        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping
    public Result deleteById(@RequestParam Integer id){
        studentService.deleteById(id);

        return Result.success();
    }


    /**
     * 修改
     */
    @PutMapping
    public Result update(@RequestBody Student student){
        studentService.update(student);

        return Result.success();
    }
//    @PutMapping
//    public Result updateById(@RequestParam String name, @RequestParam Integer id){
//        studentService.updateById(name, id);
//
//        return Result.success();
//    }

    /**
     * 查询
     */
    @GetMapping("/{id}")
    public Result<Student> getById(@PathVariable Integer id){

        Student student = studentService.getById(id);

        return Result.success(student);
    }

}
