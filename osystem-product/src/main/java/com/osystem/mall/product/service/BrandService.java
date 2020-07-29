package com.osystem.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.osystem.common.utils.PageUtils;
import com.osystem.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 18:29:33
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

