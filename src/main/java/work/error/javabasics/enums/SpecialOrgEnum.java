package work.error.javabasics.enums;


import work.error.javabasics.utils.SpecialOrgEnumUtil;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public enum SpecialOrgEnum {

    SHOW_MEETING_ROOM_7(SpecialOrgEnumUtil.SHOW_FIELD_KEY, SpecialOrgEnumUtil.getShowField()),

    ;
    private final String des;

    private final List<String> orgIdList;

    SpecialOrgEnum(String des, List<String> orgIdList) {
        this.des = des;
        this.orgIdList = orgIdList;
    }

    public String getDes() {
        return des;
    }

    public List<String> getOrgIdList() {
        return orgIdList;
    }

    private static final ConcurrentHashMap<String, SpecialOrgEnum> stringSpecialOrgEnumConcurrentHashMap = new ConcurrentHashMap<>();

    static {
        SpecialOrgEnum[] specialOrgEnums = SpecialOrgEnum.values();
        for (SpecialOrgEnum specialOrgEnum : specialOrgEnums) {
            stringSpecialOrgEnumConcurrentHashMap.put(specialOrgEnum.getDes(), specialOrgEnum);
        }
    }


    public static List<String> getSpecialOrgIdList(String des) {
        return stringSpecialOrgEnumConcurrentHashMap.get(des).getOrgIdList();

    }

}
