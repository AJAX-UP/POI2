package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlMatterProcessLinkEntity BaseEntity
 * @author system
 */
public class MlMatterProcessLinkEntity   {
	/**
     * 	主键（记录唯一标识）	
     */
	private String id;	
	/**
     * 	事项记录唯一标识	
     */
	private String taskGuid;	
	/**
     * 	环节名称	
     */
	private String linkName;	
	/**
     * 	办理处室	
     */
	private String handleDeptName;	
	/**
     * 	办理人	
     */
	private String handlePersonName;	
	/**
     * 	办理时限	
     */
	private Integer handleDay;	
	/**
     * 	办理时限单位	
     */
	private String handleType;	
	/**
     * 	有无特别程序	
     */
	private String isSpecial;	
	/**
     * 	特别程序说明	
     */
	private String specialExplain;	
	/**
     * 	排序码	
     */
	private Integer orderNum;	
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
	public String getTaskGuid(){
		return taskGuid;
	}
	public void setTaskGuid(String taskGuid){
		this.taskGuid = taskGuid;
	}
	public String getLinkName(){
		return linkName;
	}
	public void setLinkName(String linkName){
		this.linkName = linkName;
	}
	public String getHandleDeptName(){
		return handleDeptName;
	}
	public void setHandleDeptName(String handleDeptName){
		this.handleDeptName = handleDeptName;
	}
	public String getHandlePersonName(){
		return handlePersonName;
	}
	public void setHandlePersonName(String handlePersonName){
		this.handlePersonName = handlePersonName;
	}
	public Integer getHandleDay(){
		return handleDay;
	}
	public void setHandleDay(Integer handleDay){
		this.handleDay = handleDay;
	}
	public String getHandleType(){
		return handleType;
	}
	public void setHandleType(String handleType){
		this.handleType = handleType;
	}
	public String getIsSpecial(){
		return isSpecial;
	}
	public void setIsSpecial(String isSpecial){
		this.isSpecial = isSpecial;
	}
	public String getSpecialExplain(){
		return specialExplain;
	}
	public void setSpecialExplain(String specialExplain){
		this.specialExplain = specialExplain;
	}
	public Integer getOrderNum(){
		return orderNum;
	}
	public void setOrderNum(Integer orderNum){
		this.orderNum = orderNum;
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