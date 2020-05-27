package com.coder520.POI.UuserRolesMap.entity;


import java.util.Date;

/**
 * MlMatterInfoEntity BaseEntity
 * @author system
 */
public class MlMatterInfoEntity   {
	/**
     * 	主键（记录唯一标识）	
     */
	private String id;	
	/**
     * 	实施清单唯一标识	
     */
	private String matterid;	
	/**
     * 	事项名称	
     */
	private String taskName;	
	/**
     * 	基本编码	
     */
	private String catalogCode;	
	/**
     * 	地方基本目录基本编码	
     */
	private String localCatalogCode;	
	/**
     * 	事项类型	
     */
	private String taskType;	
	/**
     * 	设定依据	
     */
	private String byLaw;	
	/**
     * 	权力来源	
     */
	private String powerSource;	
	/**
     * 	行使层级	
     */
	private String useLevel;	
	/**
     * 	实施编码	
     */
	private String taskCode;	
	/**
     * 	地方实施编码	
     */
	private String localTaskCode;	
	/**
     * 	业务办理项编码	
     */
	private String taskHandleItem;	
	/**
     * 	事项版本	
     */
	private Integer taskVersion;	
	/**
     * 	实施主体机构代码	
     */
	private String deptCode;	
	/**
     * 	中央业务指导部门代码	
     */
	private String centralDept;	
	/**
     * 	实施主体性质	
     */
	private String deptType;	
	/**
     * 	委托部门	
     */
	private String entrustName;	
	/**
     * 	法定办结时限	
     */
	private Integer anticipateDay;	
	/**
     * 	法定办结时限单位	
     */
	private String anticipateType;	
	/**
     * 	法定办结时限说明	
     */
	private String anticipateExplain;	
	/**
     * 	承诺办结时限	
     */
	private Integer promiseDay;	
	/**
     * 	承诺办结时限单位	
     */
	private String promiseType;	
	/**
     * 	承诺办结时限说明	
     */
	private String promiseExplain;	
	/**
     * 	受理条件（原予以受理的法定条件）	
     */
	private String acceptCondition;	
	/**
     * 	是否涉及征收（税）费减免的审批	
     */
	private String isPermitReduce;	
	/**
     * 	征收种类	
     */
	private String collectType;	
	/**
     * 	办理流程-流程图	
     */
	private String handleFlow;	
	/**
     * 	线下办理流程图	
     */
	private String offlineFlow;	
	/**
     * 	线下办理流程说明	
     */
	private String offlineExplain;	
	/**
     * 	网上办理流程图	
     */
	private String onlineFlow;	
	/**
     * 	网上办理流程说明	
     */
	private String onlineExplain;	
	/**
     * 	特别程序说明	
     */
	private String specialProcedure;	
	/**
     * 	是否收费	
     */
	private String isFee;	
	/**
     * 	收费依据	
     */
	private String feeBasis;	
	/**
     * 	服务对象	
     */
	private String serverType;	
	/**
     * 	办件类型	
     */
	private String projectType;	
	/**
     * 	办理形式	
     */
	private String handleType;	
	/**
     * 	到办事现场次数	
     */
	private Integer limitSceneNum;	
	/**
     * 	是否通过政务服务网办理	
     */
	private String isHandleByGovNet;	
	/**
     * 	政务服务网地址	
     */
	private String govNetUrl;	
	/**
     * 	是否通过部门业务系统办理	
     */
	private String isHandleByDeptSys;	
	/**
     * 	部门业务系统名称	
     */
	private String deptSysName;	
	/**
     * 	部门业务系统地址	
     */
	private String deptSysUrl;	
	/**
     * 	业务系统运行网络	
     */
	private String deptSysType;	
	/**
     * 	移动端是否对接单点登录	
     */
	private String appIsSingleLogin;	
	/**
     * 	移动端办理地址	
     */
	private String mobileTerminalUrl;	
	/**
     * 	计算机端是否对接单点登录	
     */
	private String isSingleLogin;	
	/**
     * 	计算机端在线办理跳转地址	
     */
	private String linkAddr;	
	/**
     * 	办理地点	
     */
	private String transactAddr;	
	/**
     * 	办理时间	
     */
	private String transactTime;	
	/**
     * 	交通指引	
     */
	private String trafficGuide;	
	/**
     * 	咨询方式	
     */
	private String linkWay;	
	/**
     * 	监督投诉方式	
     */
	private String superviseWay;	
	/**
     * 	处罚的行为、种类、幅度	
     */
	private String punishmentMethod;	
	/**
     * 	计划生效日期	
     */
	private Date planEffectiveDate;
	/**
     * 	计划取消日期	
     */
	private Date planCancelDate;	
	/**
     * 	是否进驻政务大厅	
     */
	private String isEntryCenter;	
	/**
     * 	大厅名称	
     */
	private String centerName;	
	/**
     * 	是否通办	
     */
	private String isHandle;	
	/**
     * 	通办范围	
     */
	private String handleArea;	
	/**
     * 	数量限制	
     */
	private String limitExplain;	
	/**
     * 	审批结果类型	
     */
	private String resultType;	
	/**
     * 	审批结果名称	
     */
	private String resultName;	
	/**
     * 	审批结果样本	
     */
	private String resultGuid;	
	/**
     * 	是否支持预约办理	
     */
	private String isSchedule;	
	/**
     * 	该事项每天可预约办理量	
     */
	private Integer scheduleNum;	
	/**
     * 	预约规则说明	
     */
	private String scheduleRule;	
	/**
     * 	是否支持网上支付	
     */
	private String isPayOnline;	
	/**
     * 	是否支持物流快递	
     */
	private String isExpress;	
	/**
     * 	是否支持自助终端办理	
     */
	private String isServiceTerminals;	
	/**
     * 	是否支持申报材料邮寄	
     */
	private String isMailMaterial;	
	/**
     * 	是否支持办件结果邮寄	
     */
	private String isMailResult;	
	/**
     * 	面向自然人事项主题分类	
     */
	private String userTopicType;	
	/**
     * 	面向自然人地方特色主题分类	
     */
	private String userCharacterTopicType;	
	/**
     * 	面向法人事项主题分类 	
     */
	private String corpTopicType;	
	/**
     * 	面向法人地方特色主题分类	
     */
	private String corpCharacterTopicType;	
	/**
     * 	是否网办	
     */
	private String isOnline;	
	/**
     * 	网上办理深度	
     */
	private String onlineHandleDepth;	
	/**
     * 	网办地址	
     */
	private String onlineHandleUrl;	
	/**
     * 	必须现场办理原因说明	
     */
	private String limitSceneExplain;	
	/**
     * 	乡镇街道名称	
     */
	private String townName;	
	/**
     * 	乡镇街道代码	
     */
	private String townCode;	
	/**
     * 	村居社区名称	
     */
	private String villageName;	
	/**
     * 	村居社区代码	
     */
	private String villageCode;	
	/**
     * 	金融服务标识	
     */
	private String financeFlag;	
	/**
     * 	咨询电话号码	
     */
	private String consultPhone;	
	/**
     * 	网络咨询方式	
     */
	private String netConsultWay;	
	/**
     * 	咨询电子邮件	
     */
	private String consultMail;	
	/**
     * 	咨询微信公众号	
     */
	private String consultWechat;	
	/**
     * 	投诉电话号码	
     */
	private String complainPhone;	
	/**
     * 	网络投诉方式	
     */
	private String netComplainWay;	
	/**
     * 	投诉电子邮件	
     */
	private String complainMail;	
	/**
     * 	投诉信函地址	
     */
	private String complainLetterAddr;	
	/**
     * 	依法享有的权利	
     */
	private String rightEnjoyByLaw;	
	/**
     * 	依法履行的义务	
     */
	private String dutyPerformByLaw;	
	/**
     * 	行政复议部门	
     */
	private String administrativeReviewDept;	
	/**
     * 	行政复议地址	
     */
	private String administrativeReviewAddr;	
	/**
     * 	行政复议电话	
     */
	private String administrativeReviewPhone;	
	/**
     * 	行政复议网址	
     */
	private String administrativeReviewUrl;	
	/**
     * 	行政诉讼部门	
     */
	private String administrativeLitigationDept;	
	/**
     * 	行政诉讼地址	
     */
	private String administrativeLitigationAddr;	
	/**
     * 	行政诉讼电话	
     */
	private String administrativeLitigationPhone;	
	/**
     * 	行政诉讼网址	
     */
	private String administrativeLitigationUrl;	
	/**
     * 	所在层级	
     */
	private String strLevel;	
	/**
     * 	事项状态	
     */
	private String taskState;	
	/**
     * 	审核状态	
     */
	private String auditStatus;	
	/**
     * 	是否删除	
     */
	private String isdel;	
	/**
     * 	添加时间	
     */
	private Date addtime;	
	/**
     * 	发布时间	
     */
	private Date publishtime;	
	/**
     * 	区域代码（实施清单所属局委所在区域）	
     */
	private String regncode;	
	/**
     * 	操作员部门	
     */
	private String userOrgCode;	
	/**
     * 	操作员用户id	
     */
	private String userId;	
	/**
     * 	数据来源	
     */
	private String dataSource;	
	/**
     * 	上级事项的id	
     */
	private String parentMatterid;	
	/**
     * 	事项的分组id（根事项的id）	
     */
	private String groupId;	
	/**
     * 	是否有下级事项	
     */
	private String hasChild;	
	/**
     * 	事项分类	
     */
	private String matterType;	
	/**
     * 	是否为模板	
     */
	private String isTemplate;	
	/**
     * 	联办机构	
     */
	private String otherDept;	
	/**
     * 	是否存在中介服务	
     */
	private String isExistIntermediary;	
	/**
     * 	中介服务内容	
     */
	private String intermediaryContent;	
	/**
     * 	中介服务名称	
     */
	private String serviceType;	
	/**
     * 	目录层级	
     */
	private String currentLevel;	
	/**
     * 	目录所属机构	
     */
	private String currentDeptCode;	
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
	public String getMatterid(){
		return matterid;
	}
	public void setMatterid(String matterid){
		this.matterid = matterid;
	}
	public String getTaskName(){
		return taskName;
	}
	public void setTaskName(String taskName){
		this.taskName = taskName;
	}
	public String getCatalogCode(){
		return catalogCode;
	}
	public void setCatalogCode(String catalogCode){
		this.catalogCode = catalogCode;
	}
	public String getLocalCatalogCode(){
		return localCatalogCode;
	}
	public void setLocalCatalogCode(String localCatalogCode){
		this.localCatalogCode = localCatalogCode;
	}
	public String getTaskType(){
		return taskType;
	}
	public void setTaskType(String taskType){
		this.taskType = taskType;
	}
	public String getByLaw(){
		return byLaw;
	}
	public void setByLaw(String byLaw){
		this.byLaw = byLaw;
	}
	public String getPowerSource(){
		return powerSource;
	}
	public void setPowerSource(String powerSource){
		this.powerSource = powerSource;
	}
	public String getUseLevel(){
		return useLevel;
	}
	public void setUseLevel(String useLevel){
		this.useLevel = useLevel;
	}
	public String getTaskCode(){
		return taskCode;
	}
	public void setTaskCode(String taskCode){
		this.taskCode = taskCode;
	}
	public String getLocalTaskCode(){
		return localTaskCode;
	}
	public void setLocalTaskCode(String localTaskCode){
		this.localTaskCode = localTaskCode;
	}
	public String getTaskHandleItem(){
		return taskHandleItem;
	}
	public void setTaskHandleItem(String taskHandleItem){
		this.taskHandleItem = taskHandleItem;
	}
	public Integer getTaskVersion(){
		return taskVersion;
	}
	public void setTaskVersion(Integer taskVersion){
		this.taskVersion = taskVersion;
	}
	public String getDeptCode(){
		return deptCode;
	}
	public void setDeptCode(String deptCode){
		this.deptCode = deptCode;
	}
	public String getCentralDept(){
		return centralDept;
	}
	public void setCentralDept(String centralDept){
		this.centralDept = centralDept;
	}
	public String getDeptType(){
		return deptType;
	}
	public void setDeptType(String deptType){
		this.deptType = deptType;
	}
	public String getEntrustName(){
		return entrustName;
	}
	public void setEntrustName(String entrustName){
		this.entrustName = entrustName;
	}
	public Integer getAnticipateDay(){
		return anticipateDay;
	}
	public void setAnticipateDay(Integer anticipateDay){
		this.anticipateDay = anticipateDay;
	}
	public String getAnticipateType(){
		return anticipateType;
	}
	public void setAnticipateType(String anticipateType){
		this.anticipateType = anticipateType;
	}
	public String getAnticipateExplain(){
		return anticipateExplain;
	}
	public void setAnticipateExplain(String anticipateExplain){
		this.anticipateExplain = anticipateExplain;
	}
	public Integer getPromiseDay(){
		return promiseDay;
	}
	public void setPromiseDay(Integer promiseDay){
		this.promiseDay = promiseDay;
	}
	public String getPromiseType(){
		return promiseType;
	}
	public void setPromiseType(String promiseType){
		this.promiseType = promiseType;
	}
	public String getPromiseExplain(){
		return promiseExplain;
	}
	public void setPromiseExplain(String promiseExplain){
		this.promiseExplain = promiseExplain;
	}
	public String getAcceptCondition(){
		return acceptCondition;
	}
	public void setAcceptCondition(String acceptCondition){
		this.acceptCondition = acceptCondition;
	}
	public String getIsPermitReduce(){
		return isPermitReduce;
	}
	public void setIsPermitReduce(String isPermitReduce){
		this.isPermitReduce = isPermitReduce;
	}
	public String getCollectType(){
		return collectType;
	}
	public void setCollectType(String collectType){
		this.collectType = collectType;
	}
	public String getHandleFlow(){
		return handleFlow;
	}
	public void setHandleFlow(String handleFlow){
		this.handleFlow = handleFlow;
	}
	public String getOfflineFlow(){
		return offlineFlow;
	}
	public void setOfflineFlow(String offlineFlow){
		this.offlineFlow = offlineFlow;
	}
	public String getOfflineExplain(){
		return offlineExplain;
	}
	public void setOfflineExplain(String offlineExplain){
		this.offlineExplain = offlineExplain;
	}
	public String getOnlineFlow(){
		return onlineFlow;
	}
	public void setOnlineFlow(String onlineFlow){
		this.onlineFlow = onlineFlow;
	}
	public String getOnlineExplain(){
		return onlineExplain;
	}
	public void setOnlineExplain(String onlineExplain){
		this.onlineExplain = onlineExplain;
	}
	public String getSpecialProcedure(){
		return specialProcedure;
	}
	public void setSpecialProcedure(String specialProcedure){
		this.specialProcedure = specialProcedure;
	}
	public String getIsFee(){
		return isFee;
	}
	public void setIsFee(String isFee){
		this.isFee = isFee;
	}
	public String getFeeBasis(){
		return feeBasis;
	}
	public void setFeeBasis(String feeBasis){
		this.feeBasis = feeBasis;
	}
	public String getServerType(){
		return serverType;
	}
	public void setServerType(String serverType){
		this.serverType = serverType;
	}
	public String getProjectType(){
		return projectType;
	}
	public void setProjectType(String projectType){
		this.projectType = projectType;
	}
	public String getHandleType(){
		return handleType;
	}
	public void setHandleType(String handleType){
		this.handleType = handleType;
	}
	public Integer getLimitSceneNum(){
		return limitSceneNum;
	}
	public void setLimitSceneNum(Integer limitSceneNum){
		this.limitSceneNum = limitSceneNum;
	}
	public String getIsHandleByGovNet(){
		return isHandleByGovNet;
	}
	public void setIsHandleByGovNet(String isHandleByGovNet){
		this.isHandleByGovNet = isHandleByGovNet;
	}
	public String getGovNetUrl(){
		return govNetUrl;
	}
	public void setGovNetUrl(String govNetUrl){
		this.govNetUrl = govNetUrl;
	}
	public String getIsHandleByDeptSys(){
		return isHandleByDeptSys;
	}
	public void setIsHandleByDeptSys(String isHandleByDeptSys){
		this.isHandleByDeptSys = isHandleByDeptSys;
	}
	public String getDeptSysName(){
		return deptSysName;
	}
	public void setDeptSysName(String deptSysName){
		this.deptSysName = deptSysName;
	}
	public String getDeptSysUrl(){
		return deptSysUrl;
	}
	public void setDeptSysUrl(String deptSysUrl){
		this.deptSysUrl = deptSysUrl;
	}
	public String getDeptSysType(){
		return deptSysType;
	}
	public void setDeptSysType(String deptSysType){
		this.deptSysType = deptSysType;
	}
	public String getAppIsSingleLogin(){
		return appIsSingleLogin;
	}
	public void setAppIsSingleLogin(String appIsSingleLogin){
		this.appIsSingleLogin = appIsSingleLogin;
	}
	public String getMobileTerminalUrl(){
		return mobileTerminalUrl;
	}
	public void setMobileTerminalUrl(String mobileTerminalUrl){
		this.mobileTerminalUrl = mobileTerminalUrl;
	}
	public String getIsSingleLogin(){
		return isSingleLogin;
	}
	public void setIsSingleLogin(String isSingleLogin){
		this.isSingleLogin = isSingleLogin;
	}
	public String getLinkAddr(){
		return linkAddr;
	}
	public void setLinkAddr(String linkAddr){
		this.linkAddr = linkAddr;
	}
	public String getTransactAddr(){
		return transactAddr;
	}
	public void setTransactAddr(String transactAddr){
		this.transactAddr = transactAddr;
	}
	public String getTransactTime(){
		return transactTime;
	}
	public void setTransactTime(String transactTime){
		this.transactTime = transactTime;
	}
	public String getTrafficGuide(){
		return trafficGuide;
	}
	public void setTrafficGuide(String trafficGuide){
		this.trafficGuide = trafficGuide;
	}
	public String getLinkWay(){
		return linkWay;
	}
	public void setLinkWay(String linkWay){
		this.linkWay = linkWay;
	}
	public String getSuperviseWay(){
		return superviseWay;
	}
	public void setSuperviseWay(String superviseWay){
		this.superviseWay = superviseWay;
	}
	public String getPunishmentMethod(){
		return punishmentMethod;
	}
	public void setPunishmentMethod(String punishmentMethod){
		this.punishmentMethod = punishmentMethod;
	}
	public Date getPlanEffectiveDate(){
		return planEffectiveDate;
	}
	public void setPlanEffectiveDate(Date planEffectiveDate){
		this.planEffectiveDate = planEffectiveDate;
	}
	public Date getPlanCancelDate(){
		return planCancelDate;
	}
	public void setPlanCancelDate(Date planCancelDate){
		this.planCancelDate = planCancelDate;
	}
	public String getIsEntryCenter(){
		return isEntryCenter;
	}
	public void setIsEntryCenter(String isEntryCenter){
		this.isEntryCenter = isEntryCenter;
	}
	public String getCenterName(){
		return centerName;
	}
	public void setCenterName(String centerName){
		this.centerName = centerName;
	}
	public String getIsHandle(){
		return isHandle;
	}
	public void setIsHandle(String isHandle){
		this.isHandle = isHandle;
	}
	public String getHandleArea(){
		return handleArea;
	}
	public void setHandleArea(String handleArea){
		this.handleArea = handleArea;
	}
	public String getLimitExplain(){
		return limitExplain;
	}
	public void setLimitExplain(String limitExplain){
		this.limitExplain = limitExplain;
	}
	public String getResultType(){
		return resultType;
	}
	public void setResultType(String resultType){
		this.resultType = resultType;
	}
	public String getResultName(){
		return resultName;
	}
	public void setResultName(String resultName){
		this.resultName = resultName;
	}
	public String getResultGuid(){
		return resultGuid;
	}
	public void setResultGuid(String resultGuid){
		this.resultGuid = resultGuid;
	}
	public String getIsSchedule(){
		return isSchedule;
	}
	public void setIsSchedule(String isSchedule){
		this.isSchedule = isSchedule;
	}
	public Integer getScheduleNum(){
		return scheduleNum;
	}
	public void setScheduleNum(Integer scheduleNum){
		this.scheduleNum = scheduleNum;
	}
	public String getScheduleRule(){
		return scheduleRule;
	}
	public void setScheduleRule(String scheduleRule){
		this.scheduleRule = scheduleRule;
	}
	public String getIsPayOnline(){
		return isPayOnline;
	}
	public void setIsPayOnline(String isPayOnline){
		this.isPayOnline = isPayOnline;
	}
	public String getIsExpress(){
		return isExpress;
	}
	public void setIsExpress(String isExpress){
		this.isExpress = isExpress;
	}
	public String getIsServiceTerminals(){
		return isServiceTerminals;
	}
	public void setIsServiceTerminals(String isServiceTerminals){
		this.isServiceTerminals = isServiceTerminals;
	}
	public String getIsMailMaterial(){
		return isMailMaterial;
	}
	public void setIsMailMaterial(String isMailMaterial){
		this.isMailMaterial = isMailMaterial;
	}
	public String getIsMailResult(){
		return isMailResult;
	}
	public void setIsMailResult(String isMailResult){
		this.isMailResult = isMailResult;
	}
	public String getUserTopicType(){
		return userTopicType;
	}
	public void setUserTopicType(String userTopicType){
		this.userTopicType = userTopicType;
	}
	public String getUserCharacterTopicType(){
		return userCharacterTopicType;
	}
	public void setUserCharacterTopicType(String userCharacterTopicType){
		this.userCharacterTopicType = userCharacterTopicType;
	}
	public String getCorpTopicType(){
		return corpTopicType;
	}
	public void setCorpTopicType(String corpTopicType){
		this.corpTopicType = corpTopicType;
	}
	public String getCorpCharacterTopicType(){
		return corpCharacterTopicType;
	}
	public void setCorpCharacterTopicType(String corpCharacterTopicType){
		this.corpCharacterTopicType = corpCharacterTopicType;
	}
	public String getIsOnline(){
		return isOnline;
	}
	public void setIsOnline(String isOnline){
		this.isOnline = isOnline;
	}
	public String getOnlineHandleDepth(){
		return onlineHandleDepth;
	}
	public void setOnlineHandleDepth(String onlineHandleDepth){
		this.onlineHandleDepth = onlineHandleDepth;
	}
	public String getOnlineHandleUrl(){
		return onlineHandleUrl;
	}
	public void setOnlineHandleUrl(String onlineHandleUrl){
		this.onlineHandleUrl = onlineHandleUrl;
	}
	public String getLimitSceneExplain(){
		return limitSceneExplain;
	}
	public void setLimitSceneExplain(String limitSceneExplain){
		this.limitSceneExplain = limitSceneExplain;
	}
	public String getTownName(){
		return townName;
	}
	public void setTownName(String townName){
		this.townName = townName;
	}
	public String getTownCode(){
		return townCode;
	}
	public void setTownCode(String townCode){
		this.townCode = townCode;
	}
	public String getVillageName(){
		return villageName;
	}
	public void setVillageName(String villageName){
		this.villageName = villageName;
	}
	public String getVillageCode(){
		return villageCode;
	}
	public void setVillageCode(String villageCode){
		this.villageCode = villageCode;
	}
	public String getFinanceFlag(){
		return financeFlag;
	}
	public void setFinanceFlag(String financeFlag){
		this.financeFlag = financeFlag;
	}
	public String getConsultPhone(){
		return consultPhone;
	}
	public void setConsultPhone(String consultPhone){
		this.consultPhone = consultPhone;
	}
	public String getNetConsultWay(){
		return netConsultWay;
	}
	public void setNetConsultWay(String netConsultWay){
		this.netConsultWay = netConsultWay;
	}
	public String getConsultMail(){
		return consultMail;
	}
	public void setConsultMail(String consultMail){
		this.consultMail = consultMail;
	}
	public String getConsultWechat(){
		return consultWechat;
	}
	public void setConsultWechat(String consultWechat){
		this.consultWechat = consultWechat;
	}
	public String getComplainPhone(){
		return complainPhone;
	}
	public void setComplainPhone(String complainPhone){
		this.complainPhone = complainPhone;
	}
	public String getNetComplainWay(){
		return netComplainWay;
	}
	public void setNetComplainWay(String netComplainWay){
		this.netComplainWay = netComplainWay;
	}
	public String getComplainMail(){
		return complainMail;
	}
	public void setComplainMail(String complainMail){
		this.complainMail = complainMail;
	}
	public String getComplainLetterAddr(){
		return complainLetterAddr;
	}
	public void setComplainLetterAddr(String complainLetterAddr){
		this.complainLetterAddr = complainLetterAddr;
	}
	public String getRightEnjoyByLaw(){
		return rightEnjoyByLaw;
	}
	public void setRightEnjoyByLaw(String rightEnjoyByLaw){
		this.rightEnjoyByLaw = rightEnjoyByLaw;
	}
	public String getDutyPerformByLaw(){
		return dutyPerformByLaw;
	}
	public void setDutyPerformByLaw(String dutyPerformByLaw){
		this.dutyPerformByLaw = dutyPerformByLaw;
	}
	public String getAdministrativeReviewDept(){
		return administrativeReviewDept;
	}
	public void setAdministrativeReviewDept(String administrativeReviewDept){
		this.administrativeReviewDept = administrativeReviewDept;
	}
	public String getAdministrativeReviewAddr(){
		return administrativeReviewAddr;
	}
	public void setAdministrativeReviewAddr(String administrativeReviewAddr){
		this.administrativeReviewAddr = administrativeReviewAddr;
	}
	public String getAdministrativeReviewPhone(){
		return administrativeReviewPhone;
	}
	public void setAdministrativeReviewPhone(String administrativeReviewPhone){
		this.administrativeReviewPhone = administrativeReviewPhone;
	}
	public String getAdministrativeReviewUrl(){
		return administrativeReviewUrl;
	}
	public void setAdministrativeReviewUrl(String administrativeReviewUrl){
		this.administrativeReviewUrl = administrativeReviewUrl;
	}
	public String getAdministrativeLitigationDept(){
		return administrativeLitigationDept;
	}
	public void setAdministrativeLitigationDept(String administrativeLitigationDept){
		this.administrativeLitigationDept = administrativeLitigationDept;
	}
	public String getAdministrativeLitigationAddr(){
		return administrativeLitigationAddr;
	}
	public void setAdministrativeLitigationAddr(String administrativeLitigationAddr){
		this.administrativeLitigationAddr = administrativeLitigationAddr;
	}
	public String getAdministrativeLitigationPhone(){
		return administrativeLitigationPhone;
	}
	public void setAdministrativeLitigationPhone(String administrativeLitigationPhone){
		this.administrativeLitigationPhone = administrativeLitigationPhone;
	}
	public String getAdministrativeLitigationUrl(){
		return administrativeLitigationUrl;
	}
	public void setAdministrativeLitigationUrl(String administrativeLitigationUrl){
		this.administrativeLitigationUrl = administrativeLitigationUrl;
	}
	public String getStrLevel(){
		return strLevel;
	}
	public void setStrLevel(String strLevel){
		this.strLevel = strLevel;
	}
	public String getTaskState(){
		return taskState;
	}
	public void setTaskState(String taskState){
		this.taskState = taskState;
	}
	public String getAuditStatus(){
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus){
		this.auditStatus = auditStatus;
	}
	public String getIsdel(){
		return isdel;
	}
	public void setIsdel(String isdel){
		this.isdel = isdel;
	}
	public Date getAddtime(){
		return addtime;
	}
	public void setAddtime(Date addtime){
		this.addtime = addtime;
	}
	public Date getPublishtime(){
		return publishtime;
	}
	public void setPublishtime(Date publishtime){
		this.publishtime = publishtime;
	}
	public String getRegncode(){
		return regncode;
	}
	public void setRegncode(String regncode){
		this.regncode = regncode;
	}
	public String getUserOrgCode(){
		return userOrgCode;
	}
	public void setUserOrgCode(String userOrgCode){
		this.userOrgCode = userOrgCode;
	}
	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getDataSource(){
		return dataSource;
	}
	public void setDataSource(String dataSource){
		this.dataSource = dataSource;
	}
	public String getParentMatterid(){
		return parentMatterid;
	}
	public void setParentMatterid(String parentMatterid){
		this.parentMatterid = parentMatterid;
	}
	public String getGroupId(){
		return groupId;
	}
	public void setGroupId(String groupId){
		this.groupId = groupId;
	}
	public String getHasChild(){
		return hasChild;
	}
	public void setHasChild(String hasChild){
		this.hasChild = hasChild;
	}
	public String getMatterType(){
		return matterType;
	}
	public void setMatterType(String matterType){
		this.matterType = matterType;
	}
	public String getIsTemplate(){
		return isTemplate;
	}
	public void setIsTemplate(String isTemplate){
		this.isTemplate = isTemplate;
	}
	public String getOtherDept(){
		return otherDept;
	}
	public void setOtherDept(String otherDept){
		this.otherDept = otherDept;
	}
	public String getIsExistIntermediary(){
		return isExistIntermediary;
	}
	public void setIsExistIntermediary(String isExistIntermediary){
		this.isExistIntermediary = isExistIntermediary;
	}
	public String getIntermediaryContent(){
		return intermediaryContent;
	}
	public void setIntermediaryContent(String intermediaryContent){
		this.intermediaryContent = intermediaryContent;
	}
	public String getServiceType(){
		return serviceType;
	}
	public void setServiceType(String serviceType){
		this.serviceType = serviceType;
	}
	public String getCurrentLevel(){
		return currentLevel;
	}
	public void setCurrentLevel(String currentLevel){
		this.currentLevel = currentLevel;
	}
	public String getCurrentDeptCode(){
		return currentDeptCode;
	}
	public void setCurrentDeptCode(String currentDeptCode){
		this.currentDeptCode = currentDeptCode;
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