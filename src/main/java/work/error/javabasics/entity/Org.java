package work.error.javabasics.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author 杜佳佳
 * @Date 2021/2/19-16:31
 * @@Version 1.0
 */
@Data
public class Org extends Model<Org> {
    private String id;
    /**
     * 组织code
     */
    private String code;
    /**
     * 组织名称
     */
    private String name;

    @TableLogic
    private String delFlag;


    /**
     * 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
