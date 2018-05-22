package com.dwyanewang;

import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface CityDao {

    int insert(@Param("pojo") City pojo);

    List<City> select(@Param("pojo") City pojo);

    int update(@Param("pojo") City pojo);

    int delete(Long id);
}
