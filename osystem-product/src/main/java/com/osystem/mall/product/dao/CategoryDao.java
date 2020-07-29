package com.osystem.mall.product.dao;

import com.osystem.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 18:29:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
