package com.osystem.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.osystem.common.utils.PageUtils;
import com.osystem.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:13:35
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

