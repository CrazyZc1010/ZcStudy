package springBoot.zc.mapper.mapper1;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import springBoot.zc.entity.Form;

/**
 * <p>
 * 表单表，记录表单，的基本信息，包括生成页面的基本信息，存储表单提交数据的的建表语句，以及表单修改，创建时间属于租户，目录等 Mapper 接口
 * </p>
 *
 * @author zc
 * @since 2020-07-23
 */
@Mapper
public interface FormMapper extends BaseMapper<Form> {

	Integer selectForm();
}
