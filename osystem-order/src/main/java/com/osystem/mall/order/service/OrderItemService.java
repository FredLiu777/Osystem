package com.osystem.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.osystem.common.utils.PageUtils;
import com.osystem.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:13:36
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

