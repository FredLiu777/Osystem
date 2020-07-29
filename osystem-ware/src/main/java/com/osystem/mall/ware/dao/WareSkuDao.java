package com.osystem.mall.ware.dao;

import com.osystem.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:19:59
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
