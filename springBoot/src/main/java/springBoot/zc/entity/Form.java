package springBoot.zc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.util.List;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 表单表，记录表单，的基本信息，包括生成页面的基本信息，存储表单提交数据的的建表语句，以及表单修改，创建时间属于租户，目录等
 * </p>
 *
 * @author zc
 * @since 2020-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Form  {

    private static final long serialVersionUID=1L;

    /**
     * 表单编号，主键，唯一标识一个表单
     */
    @TableId(value = "form_id", type = IdType.AUTO)
    private Integer formId;

    /**
     * 表单名称，标题
     */
    private String formTitle;

    /**
     * 表单类型  1为新增 2为流程中
     */
    private String formType;

    /**
     * 存放流程设计器（前端）提交的，生成表单页面的全部信息
     */
    private String pageInfo;

    /**
     * 建表语句
     */
    private String tableSql;

    private String tenantId;

    /**
     * 所属表单目录id
     */
    private Integer catalogId;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;

    private String createUser;

    /**
     * 1已删除，0未删除
     */
    private Integer delFlag;

    /**
     * 1为移动端，0为PC端
     */
    private String placeType;

    /**
     * 表单是否发布，0为未发布
     */
    private String publishFlag;

    /**
     * 是否绑定标识，0为未绑定
     */
    private String bindFlag;

    /**
     * 是否为起草页，0为否
     */
    private String startForm;
    
    //流程定义id
    private Integer processDefId;
    //流程定义名称
    private String processDefName;
    //关联关系中的活动id，与流程引擎中的活动（环节）id一致
    private String activityDefId;
    //流程中活动（环节）的名称，有就填
    private String activityDefName;
    //表单页面 对应 存数据的表的名称（每个版本一张表）
    private String formTbName;
    //是否包含改派
    private String reassignFlag;
    //是否包含抄送
    private String copyToFlag;
    //是否包含子流程
    private String subProcessFlag;
    //子流程id
    private Integer subProcessId;
    
    private String tableColumn;
    
}
