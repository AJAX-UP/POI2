package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlMatterResultEntity BaseEntity
 * @author system
 */
public class MlMatterResultEntity   {
	/**
     * 主键id
     */
	private String id;	
	/**
     * 事项记录唯一标识
     */
	private String taskGuid;	
	/**
     * 办理结果名称
     */
	private String resultName;	
	/**
     * 办理结果样本
     */
	private String resultSamp;	
	/**
     * 是否删除
     */
	private String isdel;	
	/**
     * 目录办理结果关联ID
     */
	private String catalogResultId;	
	/**
     * 租户标识
     */
	private String tenant;	
	/**
     * 时间戳
     */
	private Date tms;	
	/**
     * 版本号
     */
	private Integer vno;	
	/**
     * 交易发起渠道类型
     */
	private String txnIttChnlCgyCode;	
	/**
     * 交易发起渠道编号
     */
	private String txnIttChnlId;	
	/**
     * DAC校验
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
	public String getResultName(){
		return resultName;
	}
	public void setResultName(String resultName){
		this.resultName = resultName;
	}
	public String getResultSamp(){
		return resultSamp;
	}
	public void setResultSamp(String resultSamp){
		this.resultSamp = resultSamp;
	}
	public String getIsdel(){
		return isdel;
	}
	public void setIsdel(String isdel){
		this.isdel = isdel;
	}
	public String getCatalogResultId(){
		return catalogResultId;
	}
	public void setCatalogResultId(String catalogResultId){
		this.catalogResultId = catalogResultId;
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