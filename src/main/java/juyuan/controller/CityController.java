package juyuan.controller;

import juyuan.entity.City;
import juyuan.entity.CityAndCountry;
import juyuan.entity.Student;
import juyuan.result.Result;
import juyuan.service.CityService;
import juyuan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/city")
public class CityController {
    @Autowired
    private CityService cityService;
    /**
     * 新增.
     */
    @PostMapping
    public Result save(@RequestBody City city){
        cityService.save(city);

        return Result.success();
    }
    /**
     * 删除
     */
    @DeleteMapping
    public Result deleteById(@RequestParam Integer id){
        cityService.deleteById(id);

        return Result.success();
    }

    /**
     * 修改
     */
    @PutMapping
    public Result update(@RequestBody City city){
        cityService.update(city);

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
    public Result<City> getById(@PathVariable Integer id){

        City city = cityService.getById(id);

        return Result.success(city);
    }
    /**
     * 多表联查
     */
    @GetMapping("/all")
    public List<CityAndCountry> getCityAndCountry(){



        return cityService.getCityAndCountry();
    }


}
