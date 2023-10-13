package juyuan.mapper;

import juyuan.annotation.AutoFill;
import juyuan.entity.City;
import juyuan.entity.CityAndCountry;
import juyuan.entity.Student;
import juyuan.enumeration.OperationType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CityMapper {




    /**
     * 新增
     */
    @Insert("insert into city (city_id, city, country_id, last_update)" +
            "values" +
            "(#{cityId},#{city},#{countryId},#{lastUpdate})")
    void insert(City city);


    /**
     * 删除
     */
    @Delete("delete from city where city_id = #{id}")
    void deleteById(Integer id);




    /**
     * 修改
     */
    @AutoFill(value = OperationType.UPDATE)
    void update(City city);


    @Update("update city set city = #{city} where city_id = #{id} ")
    void updateByid(String city, Integer id);


    /**
     * 查询
     */
    @Select("select * from city where city_id = #{id}")
    City getById(Integer id);

    @Select("select * from city, country where city.country_id = country.country_id")
    List<CityAndCountry> getCityAndCountry();
}
