package work.error.javabasics.enums;

import java.util.HashMap;
import java.util.Map;

public enum OrgEnum {

    FINANCE_CENTER("1111111111", "A1000", "财务中心"),
    HR("2222222222", "A2000", "人力资源中心"),

    ;
    /**
     * 中心id
     */
    private final String orgId;
    /**
     * 中心code
     */
    private final String orgCode;
    /**
     * 中心名称
     */
    private final String orgName;

    private static final Map<String, OrgEnum> orgIdEnumMap = new HashMap<>();

    static {
        OrgEnum[] orgEnums = OrgEnum.values();
        for (OrgEnum orgEnum : orgEnums) {
            orgIdEnumMap.put(orgEnum.getOrgId(), orgEnum);
        }
    }

    OrgEnum(String orgId, String orgCode, String orgName) {
        this.orgId = orgId;
        this.orgCode = orgCode;
        this.orgName = orgName;
    }

    public String getOrgId() {
        return orgId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public String getOrgName() {
        return orgName;
    }
}
