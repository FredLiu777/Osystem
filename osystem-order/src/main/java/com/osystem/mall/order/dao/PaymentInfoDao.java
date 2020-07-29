package com.osystem.mall.order.dao;

import com.osystem.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:13:35
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
