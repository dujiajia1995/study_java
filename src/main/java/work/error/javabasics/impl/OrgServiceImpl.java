package work.error.javabasics.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import work.error.javabasics.OrgService;
import work.error.javabasics.entity.Org;

/**
 * @Author 杜佳佳
 * @Date 2021/2/19-16:30
 * @@Version 1.0
 */
@Service
public class OrgServiceImpl extends ServiceImpl<BaseMapper<Org>, Org> implements OrgService {
    @Override
    public Org selectOrgByCode(String orgCode) {

        QueryWrapper<Org> wrapper = new QueryWrapper<>();
        // code唯一，只会查询出一个结果
        String codeField = "code";
        wrapper.eq(codeField, orgCode);
        wrapper.eq("del_flag", "0");
        return this.getOne(wrapper);
    }
}
