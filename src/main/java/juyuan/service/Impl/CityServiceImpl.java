package juyuan.service.Impl;

import juyuan.entity.City;
import juyuan.entity.CityAndCountry;
import juyuan.entity.Student;
import juyuan.mapper.CityMapper;
import juyuan.mapper.StudentMapper;
import juyuan.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    /**
     * 新增
     */
    public void save(City city) {
        cityMapper.insert(city);
    }

    /**
     * 删除
     */
    public void deleteById(Integer id) {
        cityMapper.deleteById(id);
    }

    /**
     * 修改
     */
    public void update(City city) {
        cityMapper.update(city);
    }

    public void updateById(String name, Integer id) {
        cityMapper.updateByid(name, id);
    }

    /**
     * 查询
     */
    public City getById(Integer id) {
        City city = cityMapper.getById(id);
        return city;
    }

    @Override
    public List<CityAndCountry> getCityAndCountry() {

        return cityMapper.getCityAndCountry();
    }


}
