package com.osystem.mall.order.dao;

import com.osystem.mall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:13:35
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
