package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlToolExtraElemenvalueEntity BaseEntity
 * @author system
 */
public class MlToolExtraElemenvalueEntity   {
	/**
     * 主键id
     */
	private String id;	
	/**
     * 扩展要素id
     */
	private String elementId;	
	/**
     * 要素值
     */
	private String elementValue;	
	/**
     * 所属模板id
     */
	private String templateId;	
	/**
     * 所属事项记录id
     */
	private String matterRecordId;	
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
	public String getElementId(){
		return elementId;
	}
	public void setElementId(String elementId){
		this.elementId = elementId;
	}
	public String getElementValue(){
		return elementValue;
	}
	public void setElementValue(String elementValue){
		this.elementValue = elementValue;
	}
	public String getTemplateId(){
		return templateId;
	}
	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}
	public String getMatterRecordId(){
		return matterRecordId;
	}
	public void setMatterRecordId(String matterRecordId){
		this.matterRecordId = matterRecordId;
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