package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlToolLogEntity BaseEntity
 * @author system
 */
public class MlToolLogEntity   {
	/**
     * 	主键（记录唯一标识）	
     */
	private String id;	
	/**
     * 	账户所属机构代码	
     */
	private String deptCode;	
	/**
     * 	账号类别	
     */
	private String accountType;	
	/**
     * 	事项记录唯一标识	
     */
	private String taskGuid;	
	/**
     * 	更改操作	
     */
	private String updateContent;	
	/**
     * 	更改时间	
     */
	private Date updateTime;
	/**
     * 	是否删除	
     */
	private String isdel;	
	/**
     * 	租户标识	
     */
	private String tenant;	
	/**
     * 	时间戳	
     */
	private Date tms;	
	/**
     * 	版本号	
     */
	private Integer vno;	
	/**
     * 	交易发起渠道类型	
     */
	private String txnIttChnlCgyCode;	
	/**
     * 	交易发起渠道编号	
     */
	private String txnIttChnlId;	
	/**
     * 	DAC校验	
     */
	private String dacVerf;	
    
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getDeptCode(){
		return deptCode;
	}
	public void setDeptCode(String deptCode){
		this.deptCode = deptCode;
	}
	public String getAccountType(){
		return accountType;
	}
	public void setAccountType(String accountType){
		this.accountType = accountType;
	}
	public String getTaskGuid(){
		return taskGuid;
	}
	public void setTaskGuid(String taskGuid){
		this.taskGuid = taskGuid;
	}
	public String getUpdateContent(){
		return updateContent;
	}
	public void setUpdateContent(String updateContent){
		this.updateContent = updateContent;
	}
	public Date getUpdateTime(){
		return updateTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	public String getIsdel(){
		return isdel;
	}
	public void setIsdel(String isdel){
		this.isdel = isdel;
	}
	public String getTenant(){
		return tenant;
	}
	public void setTenant(String tenant){
		this.tenant = tenant;
	}
	public Date getTms(){
		return tms;
	}
	public void setTms(Date tms){
		this.tms = tms;
	}
	public Integer getVno(){
		return vno;
	}
	public void setVno(Integer vno){
		this.vno = vno;
	}
	public String getTxnIttChnlCgyCode(){
		return txnIttChnlCgyCode;
	}
	public void setTxnIttChnlCgyCode(String txnIttChnlCgyCode){
		this.txnIttChnlCgyCode = txnIttChnlCgyCode;
	}
	public String getTxnIttChnlId(){
		return txnIttChnlId;
	}
	public void setTxnIttChnlId(String txnIttChnlId){
		this.txnIttChnlId = txnIttChnlId;
	}
	public String getDacVerf(){
		return dacVerf;
	}
	public void setDacVerf(String dacVerf){
		this.dacVerf = dacVerf;
	}
}