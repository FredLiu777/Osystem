package com.osystem.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.osystem.common.utils.PageUtils;
import com.osystem.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:19:59
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

