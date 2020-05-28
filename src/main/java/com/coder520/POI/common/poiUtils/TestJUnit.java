package com.coder520.POI.common.poiUtils;

import com.coder520.POI.UuserRolesMap.dao.*;
import com.coder520.POI.UuserRolesMap.entity.MlMatterInfoEntity;
import com.coder520.POI.common.Utils.uuIdUtil;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-cfg.xml"})
public class TestJUnit {
	@Autowired
	private MlMatterInfoMapper MlMatterInfoMapper;

	@Autowired
	private MlMatterFileMapper mlMatterFileMapper;

	@Autowired
	private MlMatterProcessLinkMapper mlMatterProcessLinkMapper;

	@Autowired
	private MlMatterQuestionMapper mlMatterQuestionMapper;

	@Autowired
	private MlMatterResultMapper mlMatterResultMapper;

	@Test
	public void creatLabInfo(){
		String filePath="D:\\山东省级政务2020-4-29.xls";

		HSSFWorkbook wb=null;


		List<MlMatterInfoEntity> matterInfoEntity =new ArrayList<MlMatterInfoEntity>();
		try {
			wb = new HSSFWorkbook(new FileInputStream(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("解析Excel文件出错");
			e.printStackTrace();
		}
		HSSFSheet sheet=wb.getSheet("sheet1");
		int rowLength=sheet.getLastRowNum();
		for (int i = 2; i <=rowLength; i++) {
			MlMatterInfoEntity obj = new MlMatterInfoEntity();
			obj.setId(uuIdUtil.getUuid());
			if(i==2){
				//第一行直接保存
				HSSFRow row=sheet.getRow(i);
				HSSFCell cell0=row.getCell(113);
				if(cell0.getStringCellValue()!=null&&cell0.getStringCellValue().equals("有子项")){
					//有子项
					HSSFCell cell1=row.getCell(2);
					obj.setTaskName(cell1.getStringCellValue());
					HSSFCell cell2=row.getCell(3);
					if(cell2!=null){
						obj.setCatalogCode(cell2.getStringCellValue());
					}

					HSSFCell cell3=row.getCell(5);
					if(cell3!=null){
						obj.setTaskType(cell3.getStringCellValue());
					}

					HSSFCell cell4=row.getCell(53);
					if(cell4!=null){
						obj.setByLaw(cell4.getStringCellValue());
					}

					HSSFCell cell5=row.getCell(36);
					if(cell5!=null){
						obj.setPowerSource(cell5.getStringCellValue());
					}

					HSSFCell cell6=row.getCell(6);
					if(cell6!=null){
						obj.setUseLevel(cell6.getStringCellValue());
					}

					HSSFCell cell8=row.getCell(7);
					if(cell8!=null){
						obj.setTaskVersion((int)cell8.getNumericCellValue());
					}



					HSSFCell cell09=row.getCell(78);
					if(cell09!=null){
						if("".equals(cell09.getStringCellValue())){
							HSSFCell cell9=row.getCell(1);
							if(cell9!=null){
								obj.setDeptCode(cell9.getStringCellValue());
							}
						}else{
							obj.setDeptCode(cell09.getStringCellValue());
						}
					}


					HSSFCell cell10=row.getCell(35);
					if(cell10!=null){
						obj.setDeptType(cell10.getStringCellValue());
					}

					HSSFCell cell11=row.getCell(38);
					if(cell11!=null){
						obj.setAnticipateDay((int)cell11.getNumericCellValue());
					}
					HSSFCell cell12=row.getCell(39);
					if(cell12!=null){
						obj.setPromiseDay((int)cell12.getNumericCellValue());
					}


					HSSFCell cell13=row.getCell(57);
					if(cell13!=null){
						obj.setAcceptCondition(cell13.getStringCellValue());
					}

					HSSFCell cell14=row.getCell(58);
					if(cell14!=null){
						obj.setHandleFlow(cell14.getStringCellValue());
					}
					HSSFCell cell15=row.getCell(40);
					if(cell15!=null){
						obj.setIsFee(cell15.getStringCellValue());
					}

					HSSFCell cell16=row.getCell(11);
					if(cell16!=null){
						obj.setProjectType(cell16.getStringCellValue());
					}


					//处理服务对象
					StringBuffer str=new StringBuffer();
					List<String> list=new ArrayList<String>();
					HSSFCell cell17=row.getCell(12);
					HSSFCell cell18=row.getCell(13);
					HSSFCell cell19=row.getCell(14);
					HSSFCell cell20=row.getCell(15);
					HSSFCell cell21=row.getCell(16);
					HSSFCell cell22=row.getCell(17);
					HSSFCell cell23=row.getCell(18);
					if(cell17!=null){
						list.add(0,cell17.getStringCellValue());
					}

					if(cell18!=null){
						list.add(1,cell18.getStringCellValue());
					}

					if(cell19!=null){
						list.add(2,cell19.getStringCellValue());
					}

					if(cell20!=null){
						list.add(3,cell20.getStringCellValue());
					}

					if(cell21!=null){
						list.add(4,cell21.getStringCellValue());
					}
					if(cell22!=null){
						list.add(5,cell22.getStringCellValue());
					}

					if(cell23!=null){
						list.add(6,cell23.getStringCellValue());
					}

					for(int t=0;t<list.size();t++){
						if(!"".equals(list.get(t))){
							if("".equals(str)){
								str.append(list.get(t));
							}else{
								str.append("^"+list.get(t));
							}
						}
					}
					obj.setServerType(str.toString());

					//办理形式
					StringBuffer str1=new StringBuffer();
					List<String> list1=new ArrayList<String>();

					HSSFCell cell24=row.getCell(21);
					HSSFCell cell25=row.getCell(22);
					HSSFCell cell26=row.getCell(23);
					HSSFCell cell27=row.getCell(24);
					if(cell24!=null){
						list.add(0,cell24.getStringCellValue());
					}
					if(cell25!=null){
						list.add(1,cell25.getStringCellValue());
					}

					if(cell26!=null){
						list.add(2,cell26.getStringCellValue());
					}

					if(cell27!=null){
						list.add(3,cell27.getStringCellValue());
					}

					for(int t=0;t<list1.size();t++){
						if(!"".equals(list1.get(t))){
							if("".equals(str1)){
								str1.append(list1.get(t));
							}else{
								str1.append("^"+list1.get(t));
							}
						}
					}
					obj.setHandleType(str1.toString());


					HSSFCell cell28=row.getCell(51);
					if(cell28!=null){
						obj.setTransactAddr(cell28.getStringCellValue());
					}


					HSSFCell cell29=row.getCell(52);
					if(cell29!=null){
						obj.setTransactTime(cell29.getStringCellValue());
					}


					HSSFCell cell30=row.getCell(28);
					if(cell30!=null){
						obj.setIsEntryCenter(cell30.getStringCellValue());
					}


					HSSFCell cell31=row.getCell(19);
					if(cell31!=null){
						obj.setIsHandle(cell31.getStringCellValue());
					}


					HSSFCell cell32=row.getCell(19);
					if(cell32!=null){
						obj.setHandleArea(cell32.getStringCellValue());
					}


					HSSFCell cell33=row.getCell(82);
					if(cell33!=null){
						obj.setLimitExplain(cell33.getStringCellValue());
					}


					HSSFCell cell34=row.getCell(41);
					if(cell34!=null){
						obj.setResultType(cell34.getStringCellValue());
					}


					HSSFCell cell35=row.getCell(42);
					if(cell35!=null){
						obj.setResultName(cell35.getStringCellValue());
					}


					HSSFCell cell36=row.getCell(26);
					if(cell36!=null){
						obj.setIsPayOnline(cell36.getStringCellValue());
					}


					HSSFCell cell37=row.getCell(20);
					if(cell37!=null){
						obj.setIsExpress(cell37.getStringCellValue());
					}


					HSSFCell cell38=row.getCell(74);
					if(cell38!=null){
						obj.setConsultPhone(cell38.getStringCellValue());
					}


					HSSFCell cell39=row.getCell(75);
					if(cell39!=null){
						obj.setComplainPhone(cell39.getStringCellValue());
					}


					HSSFCell cell40=row.getCell(83);
					if(cell40!=null){
						obj.setAdministrativeReviewDept(cell40.getStringCellValue());
					}



					HSSFCell cell41=row.getCell(85);
					if(cell41!=null){
						obj.setAdministrativeReviewAddr(cell41.getStringCellValue());
					}


					HSSFCell cell42=row.getCell(84);
					if(cell42!=null){
						obj.setAdministrativeReviewPhone(cell42.getStringCellValue());
					}


					HSSFCell cell43=row.getCell(86);
					if(cell43!=null){
						obj.setAdministrativeReviewUrl(cell43.getStringCellValue());
					}


					HSSFCell cell44=row.getCell(87);
					if(cell44!=null){
						obj.setAdministrativeLitigationDept(cell44.getStringCellValue());
					}


					HSSFCell cell45=row.getCell(88);
					if(cell45!=null){
						obj.setAdministrativeLitigationAddr(cell45.getStringCellValue());
					}


					HSSFCell cell46=row.getCell(89);
					if(cell46!=null){
						obj.setAdministrativeLitigationPhone(cell46.getStringCellValue());
					}


					HSSFCell cell47=row.getCell(90);
					if(cell47!=null){
						obj.setAdministrativeLitigationUrl(cell47.getStringCellValue());
					}


					HSSFCell cell48=row.getCell(73);
					if(cell48!=null){
						obj.setTaskState(cell48.getStringCellValue());
					}


					HSSFCell cell49=row.getCell(113);
					if(cell49!=null){
						obj.setHasChild(cell49.getStringCellValue());
					}


					HSSFCell cell50=row.getCell(25);
					if(cell50!=null){
						obj.setIsExistIntermediary(cell50.getStringCellValue());
					}


					HSSFCell cell51=row.getCell(1);
					if(cell51!=null){
						obj.setCurrentDeptCode(cell51.getStringCellValue());
					}


					HSSFCell cell52=row.getCell(0);
					if(cell52!=null){
						obj.setCurrentLevel(cell52.getStringCellValue());
					}
					obj.setMatterType("1");
					obj.setAuditStatus("2");
					obj.setTenant("370000000000");
					MlMatterInfoMapper.insertMlMatterInfo(obj);
					addChildrenItem(sheet,cell2.getStringCellValue(),obj.getId());
				}
			}else if(i>2){

				obj.setId(uuIdUtil.getUuid());
				HSSFRow row0=sheet.getRow(i-1);
				HSSFRow row=sheet.getRow(i);
				HSSFCell cell001=row0.getCell(3);
				HSSFCell cell002=row.getCell(3);
				if(!cell001.getStringCellValue().equals(cell002.getStringCellValue())){

					HSSFCell cell0=row.getCell(113);
					if(cell0.getStringCellValue()!=null&&cell0.getStringCellValue().equals("有子项")){
						HSSFCell cell1=row.getCell(2);
						obj.setTaskName(cell1.getStringCellValue());
						HSSFCell cell2=row.getCell(3);
						if(cell2!=null){
							obj.setCatalogCode(cell2.getStringCellValue());
						}

						HSSFCell cell3=row.getCell(5);
						if(cell3!=null){
							obj.setTaskType(cell3.getStringCellValue());
						}

						HSSFCell cell4=row.getCell(53);
						if(cell4!=null){
							obj.setByLaw(cell4.getStringCellValue());
						}

						HSSFCell cell5=row.getCell(36);
						if(cell5!=null){
							obj.setPowerSource(cell5.getStringCellValue());
						}

						HSSFCell cell6=row.getCell(6);
						if(cell6!=null){
							obj.setUseLevel(cell6.getStringCellValue());
						}

						HSSFCell cell8=row.getCell(7);
						if(cell8!=null){
							obj.setTaskVersion((int)cell8.getNumericCellValue());
						}


						HSSFCell cell09=row.getCell(78);
						if(cell09!=null){
							if("".equals(cell09.getStringCellValue())){
								HSSFCell cell9=row.getCell(1);
								if(cell9!=null){
									obj.setDeptCode(cell9.getStringCellValue());
								}
							}else{
								obj.setDeptCode(cell09.getStringCellValue());
							}
						}


						HSSFCell cell10=row.getCell(35);
						if(cell10!=null){
							obj.setDeptType(cell10.getStringCellValue());
						}

						HSSFCell cell11=row.getCell(38);
						if(cell11!=null){
							obj.setAnticipateDay((int)cell11.getNumericCellValue());
						}
						HSSFCell cell12=row.getCell(39);
						if(cell12!=null){
							obj.setPromiseDay((int)cell12.getNumericCellValue());
						}


						HSSFCell cell13=row.getCell(57);
						if(cell13!=null){
							obj.setAcceptCondition(cell13.getStringCellValue());
						}

						HSSFCell cell14=row.getCell(58);
						if(cell14!=null){
							obj.setHandleFlow(cell14.getStringCellValue());
						}
						HSSFCell cell15=row.getCell(40);
						if(cell15!=null){
							obj.setIsFee(cell15.getStringCellValue());
						}

						HSSFCell cell16=row.getCell(11);
						if(cell16!=null){
							obj.setProjectType(cell16.getStringCellValue());
						}


						//处理服务对象
						StringBuffer str=new StringBuffer();
						List<String> list=new ArrayList<String>();
						HSSFCell cell17=row.getCell(12);
						HSSFCell cell18=row.getCell(13);
						HSSFCell cell19=row.getCell(14);
						HSSFCell cell20=row.getCell(15);
						HSSFCell cell21=row.getCell(16);
						HSSFCell cell22=row.getCell(17);
						HSSFCell cell23=row.getCell(18);
						if(cell17!=null){
							list.add(0,cell17.getStringCellValue());
						}

						if(cell18!=null){
							list.add(1,cell18.getStringCellValue());
						}

						if(cell19!=null){
							list.add(2,cell19.getStringCellValue());
						}

						if(cell20!=null){
							list.add(3,cell20.getStringCellValue());
						}

						if(cell21!=null){
							list.add(4,cell21.getStringCellValue());
						}
						if(cell22!=null){
							list.add(5,cell22.getStringCellValue());
						}

						if(cell23!=null){
							list.add(6,cell23.getStringCellValue());
						}

						for(int t=0;t<list.size();t++){
							if(!"".equals(list.get(t))){
								if("".equals(str)){
									str.append(list.get(t));
								}else{
									str.append("^"+list.get(t));
								}
							}
						}
						obj.setServerType(str.toString());

						//办理形式
						StringBuffer str1=new StringBuffer();
						List<String> list1=new ArrayList<String>();

						HSSFCell cell24=row.getCell(21);
						HSSFCell cell25=row.getCell(22);
						HSSFCell cell26=row.getCell(23);
						HSSFCell cell27=row.getCell(24);
						if(cell24!=null){
							list.add(0,cell24.getStringCellValue());
						}
						if(cell25!=null){
							list.add(1,cell25.getStringCellValue());
						}

						if(cell26!=null){
							list.add(2,cell26.getStringCellValue());
						}

						if(cell27!=null){
							list.add(3,cell27.getStringCellValue());
						}

						for(int t=0;t<list1.size();t++){
							if(!"".equals(list1.get(t))){
								if("".equals(str1)){
									str1.append(list1.get(t));
								}else{
									str1.append("^"+list1.get(t));
								}
							}
						}
						obj.setHandleType(str1.toString());


						HSSFCell cell28=row.getCell(51);
						if(cell28!=null){
							obj.setTransactAddr(cell28.getStringCellValue());
						}


						HSSFCell cell29=row.getCell(52);
						if(cell29!=null){
							obj.setTransactTime(cell29.getStringCellValue());
						}


						HSSFCell cell30=row.getCell(28);
						if(cell30!=null){
							obj.setIsEntryCenter(cell30.getStringCellValue());
						}


						HSSFCell cell31=row.getCell(19);
						if(cell31!=null){
							obj.setIsHandle(cell31.getStringCellValue());
						}


						HSSFCell cell32=row.getCell(19);
						if(cell32!=null){
							obj.setHandleArea(cell32.getStringCellValue());
						}


						HSSFCell cell33=row.getCell(82);
						if(cell33!=null){
							obj.setLimitExplain(cell33.getStringCellValue());
						}


						HSSFCell cell34=row.getCell(41);
						if(cell34!=null){
							obj.setResultType(cell34.getStringCellValue());
						}


						HSSFCell cell35=row.getCell(42);
						if(cell35!=null){
							obj.setResultName(cell35.getStringCellValue());
						}


						HSSFCell cell36=row.getCell(26);
						if(cell36!=null){
							obj.setIsPayOnline(cell36.getStringCellValue());
						}


						HSSFCell cell37=row.getCell(20);
						if(cell37!=null){
							obj.setIsExpress(cell37.getStringCellValue());
						}


						HSSFCell cell38=row.getCell(74);
						if(cell38!=null){
							obj.setConsultPhone(cell38.getStringCellValue());
						}


						HSSFCell cell39=row.getCell(75);
						if(cell39!=null){
							obj.setComplainPhone(cell39.getStringCellValue());
						}


						HSSFCell cell40=row.getCell(83);
						if(cell40!=null){
							obj.setAdministrativeReviewDept(cell40.getStringCellValue());
						}



						HSSFCell cell41=row.getCell(85);
						if(cell41!=null){
							obj.setAdministrativeReviewAddr(cell41.getStringCellValue());
						}


						HSSFCell cell42=row.getCell(84);
						if(cell42!=null){
							obj.setAdministrativeReviewPhone(cell42.getStringCellValue());
						}


						HSSFCell cell43=row.getCell(86);
						if(cell43!=null){
							obj.setAdministrativeReviewUrl(cell43.getStringCellValue());
						}


						HSSFCell cell44=row.getCell(87);
						if(cell44!=null){
							obj.setAdministrativeLitigationDept(cell44.getStringCellValue());
						}


						HSSFCell cell45=row.getCell(88);
						if(cell45!=null){
							obj.setAdministrativeLitigationAddr(cell45.getStringCellValue());
						}


						HSSFCell cell46=row.getCell(89);
						if(cell46!=null){
							obj.setAdministrativeLitigationPhone(cell46.getStringCellValue());
						}


						HSSFCell cell47=row.getCell(90);
						if(cell47!=null){
							obj.setAdministrativeLitigationUrl(cell47.getStringCellValue());
						}


						HSSFCell cell48=row.getCell(73);
						if(cell48!=null){
							obj.setTaskState(cell48.getStringCellValue());
						}


						HSSFCell cell49=row.getCell(113);
						if(cell49!=null){
							obj.setHasChild(cell49.getStringCellValue());
						}


						HSSFCell cell50=row.getCell(25);
						if(cell50!=null){
							obj.setIsExistIntermediary(cell50.getStringCellValue());
						}


						HSSFCell cell51=row.getCell(1);
						if(cell51!=null){
							obj.setCurrentDeptCode(cell51.getStringCellValue());
						}


						HSSFCell cell52=row.getCell(0);
						if(cell52!=null){
							obj.setCurrentLevel(cell52.getStringCellValue());
						}
						obj.setMatterType("1");
						obj.setAuditStatus("2");
						obj.setTenant("370000000000");
						MlMatterInfoMapper.insertMlMatterInfo(obj);
						addChildrenItem(sheet,cell002.getStringCellValue(),obj.getId());
					}
				}
			}
		}

	}
	public  void addChildrenItem(HSSFSheet sheet,String parentId,String id){
		//parentId 是编码  id是数据库id
		int rowLength=sheet.getLastRowNum();
		for (int i = 2; i <=rowLength; i++) {
			MlMatterInfoEntity obj = new MlMatterInfoEntity();
			HSSFRow row=sheet.getRow(i);
			HSSFCell cell00=row.getCell(3);
			obj.setId(uuIdUtil.getUuid());
			obj.setParentMatterid(id);
			if(cell00.getStringCellValue().equals(parentId)){
				//第一行直接保存
				HSSFCell cell0=row.getCell(113);
				if(cell0.getStringCellValue()!=null&&cell0.getStringCellValue().equals("有子项")){
					//有子项
					HSSFCell cell1=row.getCell(2);
					obj.setTaskName(cell1.getStringCellValue());
					HSSFCell cell2=row.getCell(3);
					if(cell2!=null){
						obj.setCatalogCode(cell2.getStringCellValue());
					}

					HSSFCell cell3=row.getCell(5);
					if(cell3!=null){
						obj.setTaskType(cell3.getStringCellValue());
					}

					HSSFCell cell4=row.getCell(53);
					if(cell4!=null){
						obj.setByLaw(cell4.getStringCellValue());
					}

					HSSFCell cell5=row.getCell(36);
					if(cell5!=null){
						obj.setPowerSource(cell5.getStringCellValue());
					}

					HSSFCell cell6=row.getCell(6);
					if(cell6!=null){
						obj.setUseLevel(cell6.getStringCellValue());
					}

					HSSFCell cell8=row.getCell(7);
					if(cell8!=null){
						obj.setTaskVersion((int)cell8.getNumericCellValue());
					}



					HSSFCell cell09=row.getCell(78);
					if(cell09!=null){
						if("".equals(cell09.getStringCellValue())){
							HSSFCell cell9=row.getCell(1);
							if(cell9!=null){
								obj.setDeptCode(cell9.getStringCellValue());
							}
						}else{
							obj.setDeptCode(cell09.getStringCellValue());
						}
					}


					HSSFCell cell10=row.getCell(35);
					if(cell10!=null){
						obj.setDeptType(cell10.getStringCellValue());
					}

					HSSFCell cell11=row.getCell(38);
					if(cell11!=null){
						obj.setAnticipateDay((int)cell11.getNumericCellValue());
					}
					HSSFCell cell12=row.getCell(39);
					if(cell12!=null){
						obj.setPromiseDay((int)cell12.getNumericCellValue());
					}


					HSSFCell cell13=row.getCell(57);
					if(cell13!=null){
						obj.setAcceptCondition(cell13.getStringCellValue());
					}

					HSSFCell cell14=row.getCell(58);
					if(cell14!=null){
						obj.setHandleFlow(cell14.getStringCellValue());
					}
					HSSFCell cell15=row.getCell(40);
					if(cell15!=null){
						obj.setIsFee(cell15.getStringCellValue());
					}

					HSSFCell cell16=row.getCell(11);
					if(cell16!=null){
						obj.setProjectType(cell16.getStringCellValue());
					}


					//处理服务对象
					StringBuffer str=new StringBuffer();
					List<String> list=new ArrayList<String>();
					HSSFCell cell17=row.getCell(12);
					HSSFCell cell18=row.getCell(13);
					HSSFCell cell19=row.getCell(14);
					HSSFCell cell20=row.getCell(15);
					HSSFCell cell21=row.getCell(16);
					HSSFCell cell22=row.getCell(17);
					HSSFCell cell23=row.getCell(18);
					if(cell17!=null){
						list.add(0,cell17.getStringCellValue());
					}

					if(cell18!=null){
						list.add(1,cell18.getStringCellValue());
					}

					if(cell19!=null){
						list.add(2,cell19.getStringCellValue());
					}

					if(cell20!=null){
						list.add(3,cell20.getStringCellValue());
					}

					if(cell21!=null){
						list.add(4,cell21.getStringCellValue());
					}
					if(cell22!=null){
						list.add(5,cell22.getStringCellValue());
					}

					if(cell23!=null){
						list.add(6,cell23.getStringCellValue());
					}

					for(int t=0;t<list.size();t++){
						if(!"".equals(list.get(t))){
							if("".equals(str)){
								str.append(list.get(t));
							}else{
								str.append("^"+list.get(t));
							}
						}
					}
					obj.setServerType(str.toString());

					//办理形式
					StringBuffer str1=new StringBuffer();
					List<String> list1=new ArrayList<String>();

					HSSFCell cell24=row.getCell(21);
					HSSFCell cell25=row.getCell(22);
					HSSFCell cell26=row.getCell(23);
					HSSFCell cell27=row.getCell(24);
					if(cell24!=null){
						list.add(0,cell24.getStringCellValue());
					}
					if(cell25!=null){
						list.add(1,cell25.getStringCellValue());
					}

					if(cell26!=null){
						list.add(2,cell26.getStringCellValue());
					}

					if(cell27!=null){
						list.add(3,cell27.getStringCellValue());
					}

					for(int t=0;t<list1.size();t++){
						if(!"".equals(list1.get(t))){
							if("".equals(str1)){
								str1.append(list1.get(t));
							}else{
								str1.append("^"+list1.get(t));
							}
						}
					}
					obj.setHandleType(str1.toString());


					HSSFCell cell28=row.getCell(51);
					if(cell28!=null){
						obj.setTransactAddr(cell28.getStringCellValue());
					}


					HSSFCell cell29=row.getCell(52);
					if(cell29!=null){
						obj.setTransactTime(cell29.getStringCellValue());
					}


					HSSFCell cell30=row.getCell(28);
					if(cell30!=null){
						obj.setIsEntryCenter(cell30.getStringCellValue());
					}


					HSSFCell cell31=row.getCell(19);
					if(cell31!=null){
						obj.setIsHandle(cell31.getStringCellValue());
					}


					HSSFCell cell32=row.getCell(19);
					if(cell32!=null){
						obj.setHandleArea(cell32.getStringCellValue());
					}


					HSSFCell cell33=row.getCell(82);
					if(cell33!=null){
						obj.setLimitExplain(cell33.getStringCellValue());
					}


					HSSFCell cell34=row.getCell(41);
					if(cell34!=null){
						obj.setResultType(cell34.getStringCellValue());
					}


					HSSFCell cell35=row.getCell(42);
					if(cell35!=null){
						obj.setResultName(cell35.getStringCellValue());
					}


					HSSFCell cell36=row.getCell(26);
					if(cell36!=null){
						obj.setIsPayOnline(cell36.getStringCellValue());
					}


					HSSFCell cell37=row.getCell(20);
					if(cell37!=null){
						obj.setIsExpress(cell37.getStringCellValue());
					}


					HSSFCell cell38=row.getCell(74);
					if(cell38!=null){
						obj.setConsultPhone(cell38.getStringCellValue());
					}


					HSSFCell cell39=row.getCell(75);
					if(cell39!=null){
						obj.setComplainPhone(cell39.getStringCellValue());
					}


					HSSFCell cell40=row.getCell(83);
					if(cell40!=null){
						obj.setAdministrativeReviewDept(cell40.getStringCellValue());
					}



					HSSFCell cell41=row.getCell(85);
					if(cell41!=null){
						obj.setAdministrativeReviewAddr(cell41.getStringCellValue());
					}


					HSSFCell cell42=row.getCell(84);
					if(cell42!=null){
						obj.setAdministrativeReviewPhone(cell42.getStringCellValue());
					}


					HSSFCell cell43=row.getCell(86);
					if(cell43!=null){
						obj.setAdministrativeReviewUrl(cell43.getStringCellValue());
					}


					HSSFCell cell44=row.getCell(87);
					if(cell44!=null){
						obj.setAdministrativeLitigationDept(cell44.getStringCellValue());
					}


					HSSFCell cell45=row.getCell(88);
					if(cell45!=null){
						obj.setAdministrativeLitigationAddr(cell45.getStringCellValue());
					}


					HSSFCell cell46=row.getCell(89);
					if(cell46!=null){
						obj.setAdministrativeLitigationPhone(cell46.getStringCellValue());
					}


					HSSFCell cell47=row.getCell(90);
					if(cell47!=null){
						obj.setAdministrativeLitigationUrl(cell47.getStringCellValue());
					}


					HSSFCell cell48=row.getCell(73);
					if(cell48!=null){
						obj.setTaskState(cell48.getStringCellValue());
					}


					HSSFCell cell49=row.getCell(113);
					if(cell49!=null){
						obj.setHasChild(cell49.getStringCellValue());
					}


					HSSFCell cell50=row.getCell(25);
					if(cell50!=null){
						obj.setIsExistIntermediary(cell50.getStringCellValue());
					}


					HSSFCell cell51=row.getCell(1);
					if(cell51!=null){
						obj.setCurrentDeptCode(cell51.getStringCellValue());
					}


					HSSFCell cell52=row.getCell(0);
					if(cell52!=null){
						obj.setCurrentLevel(cell52.getStringCellValue());
					}
					obj.setMatterType("1");
					obj.setAuditStatus("2");
					obj.setTenant("370000000000");
					MlMatterInfoMapper.insertMlMatterInfo(obj);
				}
			}
		}
	}
}
