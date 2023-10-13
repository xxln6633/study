package juyuan.service;

import juyuan.entity.City;
import juyuan.entity.CityAndCountry;
import juyuan.entity.Student;

import java.util.List;

public interface CityService {

    /**
     * 新增
     */
    void save(City city);


    /**
     * 删除
     */
    void deleteById(Integer id);


    /**
     * 修改
     */
    void update(City city);

    void updateById(String name, Integer id);

    /**
     * 查询
     */
    City getById(Integer id);

    /**
     * 多表联查
     */
    List<CityAndCountry> getCityAndCountry();
}
