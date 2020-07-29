package com.osystem.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.osystem.common.utils.PageUtils;
import com.osystem.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:02:35
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

