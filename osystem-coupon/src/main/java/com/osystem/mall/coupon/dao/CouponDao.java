package com.osystem.mall.coupon.dao;

import com.osystem.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 19:42:34
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
