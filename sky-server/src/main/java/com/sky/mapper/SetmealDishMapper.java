package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zyzstart
 * @creat 2023-12-07 15:20
 */
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据dishId在套餐表中查询是否存在包含当前菜品的套餐
     */
    //select setmeaal_id from setmeal_dish where dish_id in  ( )
    // 动态sql写在xml中
    List<Long> getSetmealIdByDishIdS(List<Long> dishIds);
}
