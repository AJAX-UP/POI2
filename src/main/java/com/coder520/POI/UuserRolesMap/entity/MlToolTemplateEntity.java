package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlToolTemplateEntity BaseEntity
 * @author system
 */
public class MlToolTemplateEntity   {
	/**
     * 主键id
     */
	private String id;	
	/**
     * 模板名称
     */
	private String templateName;	
	/**
     * 模板类型
     */
	private String templateType;	
	/**
     * 关联目录模板id
     */
	private String relCatalogTemplateId;	
	/**
     * 模板描述
     */
	private String description;	
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
	public String getTemplateName(){
		return templateName;
	}
	public void setTemplateName(String templateName){
		this.templateName = templateName;
	}
	public String getTemplateType(){
		return templateType;
	}
	public void setTemplateType(String templateType){
		this.templateType = templateType;
	}
	public String getRelCatalogTemplateId(){
		return relCatalogTemplateId;
	}
	public void setRelCatalogTemplateId(String relCatalogTemplateId){
		this.relCatalogTemplateId = relCatalogTemplateId;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description = description;
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