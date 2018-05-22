package com.dwyanewang;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import com.dwyanewang.CityDao;

@Service
public class CityService {

    @Resource
    private CityDao cityDao;

    public int insert(City pojo){
        return cityDao.insert(pojo);
    }


    public List<City> select(City pojo){
        return cityDao.select(pojo);
    }

    public int update(City pojo){
        return cityDao.update(pojo);
    }

    public int delete(Long id){
        return cityDao.delete(id);
    }
}
