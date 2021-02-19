package work.error.javabasics;

import com.baomidou.mybatisplus.extension.service.IService;
import work.error.javabasics.entity.Org;

public interface OrgService extends IService<Org> {

    Org selectOrgByCode(String orgCode);


}
