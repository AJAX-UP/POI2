package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlToolTenantemplateEntity BaseEntity
 * @author system
 */
public class MlToolTenantemplateEntity   {
	/**
     * 主键id
     */
	private String id;	
	/**
     * 基本目录模板id
     */
	private String catalogTemplateId;	
	/**
     * 基本目录子项模板id
     */
	private String catalogChildTemplateId;	
	/**
     * 实施清单模板id
     */
	private String matterTemplateId;	
	/**
     * 目录申请材料模板id
     */
	private String catalogFileTemplateId;	
	/**
     * 目录收费项目模板id
     */
	private String catalogChargeTemplateId;	
	/**
     * 目录办理结果模板id
     */
	private String catalogResultTemplateId;	
	/**
     * 实施清单申请材料模板id
     */
	private String matterFileTemplateId;	
	/**
     * 实施清单收费项目模板id
     */
	private String matterChargeTemplateId;	
	/**
     * 实施清单办理结果模板id
     */
	private String matterResultTemplateId;	
	/**
     * 实施清单联办机构模板id
     */
	private String matterCooperTemplateId;	
	/**
     * 实施清单中介服务模板id
     */
	private String matterMediumTemplateId;	
	/**
     * 实施清单常见问题模板id
     */
	private String matterQuestionTemplateId;	
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
	public String getCatalogTemplateId(){
		return catalogTemplateId;
	}
	public void setCatalogTemplateId(String catalogTemplateId){
		this.catalogTemplateId = catalogTemplateId;
	}
	public String getCatalogChildTemplateId(){
		return catalogChildTemplateId;
	}
	public void setCatalogChildTemplateId(String catalogChildTemplateId){
		this.catalogChildTemplateId = catalogChildTemplateId;
	}
	public String getMatterTemplateId(){
		return matterTemplateId;
	}
	public void setMatterTemplateId(String matterTemplateId){
		this.matterTemplateId = matterTemplateId;
	}
	public String getCatalogFileTemplateId(){
		return catalogFileTemplateId;
	}
	public void setCatalogFileTemplateId(String catalogFileTemplateId){
		this.catalogFileTemplateId = catalogFileTemplateId;
	}
	public String getCatalogChargeTemplateId(){
		return catalogChargeTemplateId;
	}
	public void setCatalogChargeTemplateId(String catalogChargeTemplateId){
		this.catalogChargeTemplateId = catalogChargeTemplateId;
	}
	public String getCatalogResultTemplateId(){
		return catalogResultTemplateId;
	}
	public void setCatalogResultTemplateId(String catalogResultTemplateId){
		this.catalogResultTemplateId = catalogResultTemplateId;
	}
	public String getMatterFileTemplateId(){
		return matterFileTemplateId;
	}
	public void setMatterFileTemplateId(String matterFileTemplateId){
		this.matterFileTemplateId = matterFileTemplateId;
	}
	public String getMatterChargeTemplateId(){
		return matterChargeTemplateId;
	}
	public void setMatterChargeTemplateId(String matterChargeTemplateId){
		this.matterChargeTemplateId = matterChargeTemplateId;
	}
	public String getMatterResultTemplateId(){
		return matterResultTemplateId;
	}
	public void setMatterResultTemplateId(String matterResultTemplateId){
		this.matterResultTemplateId = matterResultTemplateId;
	}
	public String getMatterCooperTemplateId(){
		return matterCooperTemplateId;
	}
	public void setMatterCooperTemplateId(String matterCooperTemplateId){
		this.matterCooperTemplateId = matterCooperTemplateId;
	}
	public String getMatterMediumTemplateId(){
		return matterMediumTemplateId;
	}
	public void setMatterMediumTemplateId(String matterMediumTemplateId){
		this.matterMediumTemplateId = matterMediumTemplateId;
	}
	public String getMatterQuestionTemplateId(){
		return matterQuestionTemplateId;
	}
	public void setMatterQuestionTemplateId(String matterQuestionTemplateId){
		this.matterQuestionTemplateId = matterQuestionTemplateId;
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