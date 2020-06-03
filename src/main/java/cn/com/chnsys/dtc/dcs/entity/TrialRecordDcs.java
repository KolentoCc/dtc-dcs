package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.base.utils.FileFormat;
import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  TrialRecordDcs
 * @version 1.0.0
 */
public class TrialRecordDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*笔录ID
	*/
	private String noteId;
    /**
	*笔录路径
	*/
	private String notePath;
    /**
	* 
	*/
	private String storagePathId;
    /**
	*排期ID
	*/
	private String trialId;
    /**
	*笔录格式
	*/
	private FileFormat noteFormat;
    /**
	*显示顺序
	*/
	private Integer sortOrder;
    /**
	*笔录名称
	*/
	private String noteName;
    
    
    public void setNoteId(String noteId){
        this.noteId=noteId;
    }
    public String getNoteId(){
        return this.noteId;
    }

    public String getNotePath() {
		return notePath;
	}
	public void setNotePath(String notePath) {
		this.notePath = notePath;
	}
	public void setStoragePathId(String storagePathId){
        this.storagePathId=storagePathId;
    }
    public String getStoragePathId(){
        return this.storagePathId;
    }
    public void setTrialId(String trialId){
        this.trialId=trialId;
    }
    public String getTrialId(){
        return this.trialId;
    }

    public FileFormat getNoteFormat() {
		return noteFormat;
	}
	public void setNoteFormat(FileFormat noteFormat) {
		this.noteFormat = noteFormat;
	}
	public void setSortOrder(Integer sortOrder){
        this.sortOrder=sortOrder;
    }
    public Integer getSortOrder(){
        return this.sortOrder;
    }
    public void setNoteName(String noteName){
        this.noteName=noteName;
    }
    public String getNoteName(){
        return this.noteName;
    }
    
    @Override
    public String toString() {
        return "[TrialRecordDcs = ]"+" noteId =" +noteId+" notepath =" +notePath+" storagePathId =" +storagePathId+" trialId =" +trialId+" noteFormat =" +noteFormat+" sortOrder =" +sortOrder+" noteName =" +noteName;
    }
}
