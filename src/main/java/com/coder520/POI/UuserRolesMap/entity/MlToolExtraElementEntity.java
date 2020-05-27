package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlToolExtraElementEntity BaseEntity
 * @author system
 */
public class MlToolExtraElementEntity   {
	/**
     * 主键id
     */
	private String id;	
	/**
     * 要素名称
     */
	private String elementName;	
	/**
     * 要素key
     */
	private String elementKey;	
	/**
     * 是否必填
     */
	private String isRequired;	
	/**
     * 是否只读
     */
	private String isReadonly;	
	/**
     * 是否可覆盖
     */
	private String isOverlap;	
	/**
     * 长度
     */
	private Integer elementLength;	
	/**
     * 控件显示宽度
     */
	private Integer htmlControl;	
	/**
     * 要素控件类型
     */
	private String controlType;	
	/**
     * 关联组件
     */
	private String relatedControl;	
	/**
     * 调用交易码
     */
	private String apiUri;	
	/**
     * 请求参数
     */
	private String requestParameter;	
	/**
     * 控件取值
     */
	private String controlValue;	
	/**
     * 数字最小值
     */
	private Integer numberMin;	
	/**
     * 数字最大值
     */
	private Integer numberMax;	
	/**
     * 数字步长
     */
	private Integer numberStep;	
	/**
     * 默认值
     */
	private String defaultValue;	
	/**
     * 所属分类id
     */
	private String classificationId;	
	/**
     * 排序码
     */
	private Integer sortCode;	
	/**
     * 所属模板id
     */
	private String templateId;	
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
	public String getElementName(){
		return elementName;
	}
	public void setElementName(String elementName){
		this.elementName = elementName;
	}
	public String getElementKey(){
		return elementKey;
	}
	public void setElementKey(String elementKey){
		this.elementKey = elementKey;
	}
	public String getIsRequired(){
		return isRequired;
	}
	public void setIsRequired(String isRequired){
		this.isRequired = isRequired;
	}
	public String getIsReadonly(){
		return isReadonly;
	}
	public void setIsReadonly(String isReadonly){
		this.isReadonly = isReadonly;
	}
	public String getIsOverlap(){
		return isOverlap;
	}
	public void setIsOverlap(String isOverlap){
		this.isOverlap = isOverlap;
	}
	public Integer getElementLength(){
		return elementLength;
	}
	public void setElementLength(Integer elementLength){
		this.elementLength = elementLength;
	}
	public Integer getHtmlControl(){
		return htmlControl;
	}
	public void setHtmlControl(Integer htmlControl){
		this.htmlControl = htmlControl;
	}
	public String getControlType(){
		return controlType;
	}
	public void setControlType(String controlType){
		this.controlType = controlType;
	}
	public String getRelatedControl(){
		return relatedControl;
	}
	public void setRelatedControl(String relatedControl){
		this.relatedControl = relatedControl;
	}
	public String getApiUri(){
		return apiUri;
	}
	public void setApiUri(String apiUri){
		this.apiUri = apiUri;
	}
	public String getRequestParameter(){
		return requestParameter;
	}
	public void setRequestParameter(String requestParameter){
		this.requestParameter = requestParameter;
	}
	public String getControlValue(){
		return controlValue;
	}
	public void setControlValue(String controlValue){
		this.controlValue = controlValue;
	}
	public Integer getNumberMin(){
		return numberMin;
	}
	public void setNumberMin(Integer numberMin){
		this.numberMin = numberMin;
	}
	public Integer getNumberMax(){
		return numberMax;
	}
	public void setNumberMax(Integer numberMax){
		this.numberMax = numberMax;
	}
	public Integer getNumberStep(){
		return numberStep;
	}
	public void setNumberStep(Integer numberStep){
		this.numberStep = numberStep;
	}
	public String getDefaultValue(){
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue){
		this.defaultValue = defaultValue;
	}
	public String getClassificationId(){
		return classificationId;
	}
	public void setClassificationId(String classificationId){
		this.classificationId = classificationId;
	}
	public Integer getSortCode(){
		return sortCode;
	}
	public void setSortCode(Integer sortCode){
		this.sortCode = sortCode;
	}
	public String getTemplateId(){
		return templateId;
	}
	public void setTemplateId(String templateId){
		this.templateId = templateId;
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