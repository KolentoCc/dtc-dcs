package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  Department
 * @version 1.0.0
 */
public class DepartmentDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private Integer isBusniss;
    private String parentId;
    private Integer valid;
    private Integer isLeaf;
    private String description;
    private String departmentName;
    private String departmentId;
    private Integer unitCode;
    
    
    public void setIsBusniss(Integer isBusniss){
        this.isBusniss=isBusniss;
    }
    public Integer getIsBusniss(){
        return this.isBusniss;
    }
    public void setParentId(String parentId){
        this.parentId=parentId;
    }
    public String getParentId(){
        return this.parentId;
    }
    public void setValid(Integer valid){
        this.valid=valid;
    }
    public Integer getValid(){
        return this.valid;
    }
    public void setIsLeaf(Integer isLeaf){
        this.isLeaf=isLeaf;
    }
    public Integer getIsLeaf(){
        return this.isLeaf;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
    public void setDepartmentId(String departmentId){
        this.departmentId=departmentId;
    }
    public String getDepartmentId(){
        return this.departmentId;
    }
    public void setUnitCode(Integer unitCode){
        this.unitCode=unitCode;
    }
    public Integer getUnitCode(){
        return this.unitCode;
    }
    
    @Override
    public String toString() {
        return "[Department = ]"+" isBusniss =" +isBusniss+" parentId =" +parentId+" valid =" +valid+" isLeaf =" +isLeaf+" description =" +description+" departmentName =" +departmentName+" departmentId =" +departmentId+" unitCode =" +unitCode;
    }
}
