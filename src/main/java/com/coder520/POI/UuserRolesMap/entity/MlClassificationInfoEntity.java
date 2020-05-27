package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlClassificationInfoEntity BaseEntity
 * @author system
 */
public class MlClassificationInfoEntity   {
	/**
     * 主键id
     */
	private String typeid;	
	/**
     * 分类名称
     */
	private String typename;	
	/**
     * 分类代码
     */
	private String typeCode;	
	/**
     * 排序码
     */
	private Integer sortcode;	
	/**
     * 类型
     */
	private String categoryid;	
	/**
     * 父级ID
     */
	private String parentid;	
	/**
     * 是否禁用
     */
	private Integer isdisable;	
	/**
     * 是否删除
     */
	private Integer isDel;	
	/**
     * 服务对象
     */
	private String serviceObject;	
	/**
     * 是否热门
     */
	private String ishot;	
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
    
	public String getTypeid(){
		return typeid;
	}
	public void setTypeid(String typeid){
		this.typeid = typeid;
	}
	public String getTypename(){
		return typename;
	}
	public void setTypename(String typename){
		this.typename = typename;
	}
	public String getTypeCode(){
		return typeCode;
	}
	public void setTypeCode(String typeCode){
		this.typeCode = typeCode;
	}
	public Integer getSortcode(){
		return sortcode;
	}
	public void setSortcode(Integer sortcode){
		this.sortcode = sortcode;
	}
	public String getCategoryid(){
		return categoryid;
	}
	public void setCategoryid(String categoryid){
		this.categoryid = categoryid;
	}
	public String getParentid(){
		return parentid;
	}
	public void setParentid(String parentid){
		this.parentid = parentid;
	}
	public Integer getIsdisable(){
		return isdisable;
	}
	public void setIsdisable(Integer isdisable){
		this.isdisable = isdisable;
	}
	public Integer getIsDel(){
		return isDel;
	}
	public void setIsDel(Integer isDel){
		this.isDel = isDel;
	}
	public String getServiceObject(){
		return serviceObject;
	}
	public void setServiceObject(String serviceObject){
		this.serviceObject = serviceObject;
	}
	public String getIshot(){
		return ishot;
	}
	public void setIshot(String ishot){
		this.ishot = ishot;
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