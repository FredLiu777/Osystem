package com.osystem.mall.order.dao;

import com.osystem.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:13:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
