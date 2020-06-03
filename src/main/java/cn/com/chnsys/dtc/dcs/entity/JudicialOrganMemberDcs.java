package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  JudicialOrganMember
 * @version 1.0.0
 */
public class JudicialOrganMemberDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private String userId;
    /**
	*
	*/
	private String memberId;
    /**
	*参考15法标标准代码GF2015-01035
	*/
	private Integer role;
    /**
	*
	*/
	private Integer version;
    /**
	*
	*/
	private String caseId;
    /**
	*
	*/
	private String userName;
	
	/**
	*
	*/
	private String trailId;
    
    public void setUserId(String userId){
        this.userId=userId;
    }
    public String getUserId(){
        return this.userId;
    }
    public void setMemberId(String memberId){
        this.memberId=memberId;
    }
    public String getMemberId(){
        return this.memberId;
    }
    public void setRole(Integer role){
        this.role=role;
    }
    public Integer getRole(){
        return this.role;
    }
    public void setVersion(Integer version){
        this.version=version;
    }
    public Integer getVersion(){
        return this.version;
    }
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return this.userName;
    }
    
	public String getTrailId() {
		return trailId;
	}
	public void setTrailId(String trailId) {
		this.trailId = trailId;
	}
	@Override
    public String toString() {
        return "[JudicialOrganMember = ]"+" userId =" +userId+" memberId =" +memberId+" role =" +role+" version =" +version
        		+" caseId =" +caseId+" userName =" +userName+" trailId = " +trailId;
    }
}
