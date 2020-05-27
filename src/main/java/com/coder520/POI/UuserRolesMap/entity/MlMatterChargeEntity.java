package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlMatterChargeEntity BaseEntity
 * @author system
 */
public class MlMatterChargeEntity   {
	/**
     * 主键（记录唯一标识）
     */
	private String id;	
	/**
     * 事项记录唯一标识
     */
	private String taskGuid;	
	/**
     * 收费项目名称
     */
	private String feeName;	
	/**
     * 收费标准
     */
	private String feeStand;	
	/**
     * 收费依据
     */
	private String byLaw;	
	/**
     * 是否允许减免
     */
	private String isDesc;	
	/**
     * 允许减免的依据
     */
	private String descExplain;	
	/**
     * 备注
     */
	private String remark;	
	/**
     * 排序码
     */
	private Integer orderNum;	
	/**
     * 目录收费关联ID
     */
	private String catalogChargeId;	
	/**
     * 是否删除
     */
	private String isdel;	
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
	public String getFeeName(){
		return feeName;
	}
	public void setFeeName(String feeName){
		this.feeName = feeName;
	}
	public String getFeeStand(){
		return feeStand;
	}
	public void setFeeStand(String feeStand){
		this.feeStand = feeStand;
	}
	public String getByLaw(){
		return byLaw;
	}
	public void setByLaw(String byLaw){
		this.byLaw = byLaw;
	}
	public String getIsDesc(){
		return isDesc;
	}
	public void setIsDesc(String isDesc){
		this.isDesc = isDesc;
	}
	public String getDescExplain(){
		return descExplain;
	}
	public void setDescExplain(String descExplain){
		this.descExplain = descExplain;
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public Integer getOrderNum(){
		return orderNum;
	}
	public void setOrderNum(Integer orderNum){
		this.orderNum = orderNum;
	}
	public String getCatalogChargeId(){
		return catalogChargeId;
	}
	public void setCatalogChargeId(String catalogChargeId){
		this.catalogChargeId = catalogChargeId;
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