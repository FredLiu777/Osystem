package com.osystem.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.osystem.common.utils.PageUtils;
import com.osystem.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 19:42:33
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

