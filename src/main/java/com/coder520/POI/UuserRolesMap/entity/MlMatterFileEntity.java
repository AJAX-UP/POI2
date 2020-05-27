package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlMatterFileEntity BaseEntity
 * @author system
 */
public class MlMatterFileEntity   {
	/**
     * 材料ID（记录唯一标识）
     */
	private String id;	
	/**
     * 事项记录唯一标识
     */
	private String taskGuid;	
	/**
     * 材料名称
     */
	private String materialName;	
	/**
     * 材料类型
     */
	private String materialType;	
	/**
     * 材料形式
     */
	private String materialFormat;	
	/**
     * 材料必要性
     */
	private String isNeed;	
	/**
     * 空白表格
     */
	private String formGuid;	
	/**
     * 示例样表
     */
	private String exampleGuid;	
	/**
     * 来源渠道
     */
	private String sourceType;	
	/**
     * 来源渠道说明
     */
	private String sourceExplain;	
	/**
     * 纸质材料份数
     */
	private Integer pageNum;	
	/**
     * 纸质材料规格
     */
	private String pageFormat;	
	/**
     * 填报须知
     */
	private String fillExplain;	
	/**
     * 受理标准
     */
	private String acceptStand;	
	/**
     * 要求提供材料的依据
     */
	private String byLaw;	
	/**
     * 备注
     */
	private String remark;	
	/**
     * 排序码
     */
	private Integer orderNum;	
	/**
     * 非必要时办理情形
     */
	private String handleCase;	
	/**
     * 是否需要本人到现场填写
     */
	private String isSelf;	
	/**
     * 目录材料关联ID
     */
	private String catalogFileId;	
	/**
     * 复印件要求说明
     */
	private String copyExplain;	
	/**
     * 是否删除
     */
	private String isdel;	
	/**
     * 材料原件份数
     */
	private Integer originalnum;	
	/**
     * 材料复印件份数
     */
	private Integer copiesnum;	
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
	public String getMaterialName(){
		return materialName;
	}
	public void setMaterialName(String materialName){
		this.materialName = materialName;
	}
	public String getMaterialType(){
		return materialType;
	}
	public void setMaterialType(String materialType){
		this.materialType = materialType;
	}
	public String getMaterialFormat(){
		return materialFormat;
	}
	public void setMaterialFormat(String materialFormat){
		this.materialFormat = materialFormat;
	}
	public String getIsNeed(){
		return isNeed;
	}
	public void setIsNeed(String isNeed){
		this.isNeed = isNeed;
	}
	public String getFormGuid(){
		return formGuid;
	}
	public void setFormGuid(String formGuid){
		this.formGuid = formGuid;
	}
	public String getExampleGuid(){
		return exampleGuid;
	}
	public void setExampleGuid(String exampleGuid){
		this.exampleGuid = exampleGuid;
	}
	public String getSourceType(){
		return sourceType;
	}
	public void setSourceType(String sourceType){
		this.sourceType = sourceType;
	}
	public String getSourceExplain(){
		return sourceExplain;
	}
	public void setSourceExplain(String sourceExplain){
		this.sourceExplain = sourceExplain;
	}
	public Integer getPageNum(){
		return pageNum;
	}
	public void setPageNum(Integer pageNum){
		this.pageNum = pageNum;
	}
	public String getPageFormat(){
		return pageFormat;
	}
	public void setPageFormat(String pageFormat){
		this.pageFormat = pageFormat;
	}
	public String getFillExplain(){
		return fillExplain;
	}
	public void setFillExplain(String fillExplain){
		this.fillExplain = fillExplain;
	}
	public String getAcceptStand(){
		return acceptStand;
	}
	public void setAcceptStand(String acceptStand){
		this.acceptStand = acceptStand;
	}
	public String getByLaw(){
		return byLaw;
	}
	public void setByLaw(String byLaw){
		this.byLaw = byLaw;
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
	public String getHandleCase(){
		return handleCase;
	}
	public void setHandleCase(String handleCase){
		this.handleCase = handleCase;
	}
	public String getIsSelf(){
		return isSelf;
	}
	public void setIsSelf(String isSelf){
		this.isSelf = isSelf;
	}
	public String getCatalogFileId(){
		return catalogFileId;
	}
	public void setCatalogFileId(String catalogFileId){
		this.catalogFileId = catalogFileId;
	}
	public String getCopyExplain(){
		return copyExplain;
	}
	public void setCopyExplain(String copyExplain){
		this.copyExplain = copyExplain;
	}
	public String getIsdel(){
		return isdel;
	}
	public void setIsdel(String isdel){
		this.isdel = isdel;
	}
	public Integer getOriginalnum(){
		return originalnum;
	}
	public void setOriginalnum(Integer originalnum){
		this.originalnum = originalnum;
	}
	public Integer getCopiesnum(){
		return copiesnum;
	}
	public void setCopiesnum(Integer copiesnum){
		this.copiesnum = copiesnum;
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