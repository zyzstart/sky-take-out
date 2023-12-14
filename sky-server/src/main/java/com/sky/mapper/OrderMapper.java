package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zyzstart
 * @creat 2023-12-15 0:03
 */
@Mapper
public interface OrderMapper {
    void insert(Orders orders);
}
