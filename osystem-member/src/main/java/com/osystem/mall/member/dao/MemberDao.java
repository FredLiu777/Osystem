package com.osystem.mall.member.dao;

import com.osystem.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author FredLiu
 * @email liulesheng777@gmail.com
 * @date 2020-07-29 20:02:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
