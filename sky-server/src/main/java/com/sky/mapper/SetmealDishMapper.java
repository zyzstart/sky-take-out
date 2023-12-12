package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    void insertBatch(List<SetmealDish> setmealDishes);
    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);


    /**
     * 根据套餐id查询套餐和菜品的关联关系
     * @param setmealId
     * @return
     */
    @Select("select * from setmeal_dish where setmeal_id = #{setmealId}")
    List<SetmealDish> getBySetmealId(Long setmealId);
}
