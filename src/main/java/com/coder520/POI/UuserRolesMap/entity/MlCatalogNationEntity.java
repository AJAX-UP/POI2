package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlCatalogNationEntity BaseEntity
 * @author system
 */
public class MlCatalogNationEntity   {
	/**
     * 主键（记录唯一标识）
     */
	private String id;	
	/**
     * 事项名称
     */
	private String name;	
	/**
     * 基本编码
     */
	private String basicCode;	
	/**
     * 事项类型
     */
	private String type;	
	/**
     * 国家设定依据
     */
	private String basis;	
	/**
     * 国家行使层级
     */
	private String exeLevel;	
	/**
     * 目录状态
     */
	private String flag;	
	/**
     * 事项版本
     */
	private Integer version;	
	/**
     * 计划生效日期
     */
	private Date validDate;	
	/**
     * 计划取消日期
     */
	private Date invalidDate;	
	/**
     * 中央业务指导部门代码
     */
	private String centralDept;	
	/**
     * 目录层级
     */
	private String strLevel;	
	/**
     * 是否有下级目录
     */
	private String hasChild;	
	/**
     * 是否为办理项
     */
	private String isHandle;	
	/**
     * 父目录ID（父目录的主键）
     */
	private String parentid;	
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
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getBasicCode(){
		return basicCode;
	}
	public void setBasicCode(String basicCode){
		this.basicCode = basicCode;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getBasis(){
		return basis;
	}
	public void setBasis(String basis){
		this.basis = basis;
	}
	public String getExeLevel(){
		return exeLevel;
	}
	public void setExeLevel(String exeLevel){
		this.exeLevel = exeLevel;
	}
	public String getFlag(){
		return flag;
	}
	public void setFlag(String flag){
		this.flag = flag;
	}
	public Integer getVersion(){
		return version;
	}
	public void setVersion(Integer version){
		this.version = version;
	}
	public Date getValidDate(){
		return validDate;
	}
	public void setValidDate(Date validDate){
		this.validDate = validDate;
	}
	public Date getInvalidDate(){
		return invalidDate;
	}
	public void setInvalidDate(Date invalidDate){
		this.invalidDate = invalidDate;
	}
	public String getCentralDept(){
		return centralDept;
	}
	public void setCentralDept(String centralDept){
		this.centralDept = centralDept;
	}
	public String getStrLevel(){
		return strLevel;
	}
	public void setStrLevel(String strLevel){
		this.strLevel = strLevel;
	}
	public String getHasChild(){
		return hasChild;
	}
	public void setHasChild(String hasChild){
		this.hasChild = hasChild;
	}
	public String getIsHandle(){
		return isHandle;
	}
	public void setIsHandle(String isHandle){
		this.isHandle = isHandle;
	}
	public String getParentid(){
		return parentid;
	}
	public void setParentid(String parentid){
		this.parentid = parentid;
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