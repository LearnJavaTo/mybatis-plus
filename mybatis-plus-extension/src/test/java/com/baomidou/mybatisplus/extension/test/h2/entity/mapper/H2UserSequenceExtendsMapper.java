package com.baomidou.mybatisplus.extension.test.h2.entity.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.test.h2.entity.persistent.H2UserSequenceExtendTO;
import com.baomidou.mybatisplus.extension.test.h2.entity.persistent.H2UserSequenceExtendTO;

/**
 * <p>
 * </p>
 *
 * @author yuxiaobin
 * @date 2017/6/26
 */
public interface H2UserSequenceExtendsMapper extends BaseMapper<H2UserSequenceExtendTO> {

    @Insert(
        "insert into h2user(name,version) values(#{name},#{version})"
    )
    int myInsertWithNameVersion(@Param("name" ) String name, @Param("version" ) int version);

    @Update(
        "update h2user set name=#{name} where test_id=#{id}"
    )
    int myUpdateWithNameId(@Param("id" ) Long id, @Param("name" ) String name);
}
