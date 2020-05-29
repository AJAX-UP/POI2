package com.coder520.POI.common.poiUtils;

import com.coder520.POI.UuserRolesMap.dao.*;
import com.coder520.POI.UuserRolesMap.entity.MlMatterInfoEntity;
import com.coder520.POI.common.Utils.uuIdUtil;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
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
public class TestJUnitNoChildren {
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
		String filePath="D:\\山东省级政务2020-4-29无子项.xls";
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
			obj.setMatterid(obj.getId());
			if(i==2){
				//第一行直接保存
				HSSFRow row=sheet.getRow(i);
				MlMatterInfoMapper.insertMlMatterInfo(obj);
			}else if(i>2){
				obj.setId(uuIdUtil.getUuid());
				obj.setMatterid(obj.getId());
				HSSFRow row0=sheet.getRow(i-1);
				HSSFRow row=sheet.getRow(i);
				HSSFCell cell001=row0.getCell(3);
				HSSFCell cell002=row.getCell(3);
				if(!cell001.getStringCellValue().equals(cell002.getStringCellValue())){
					MlMatterInfoMapper.insertMlMatterInfo(obj);
				}
			}
		}

	}
	public  void addChildrenItem(HSSFSheet sheet,String parentId,String id){
		//parentId 是编码  id是数据库id

	}





	public String taskType(String type){
        String result="";
		switch(type){
			case "行政许可":result="01";break;
			case "行政处罚":result="02";break;
			case "行政强制":result="03";break;
			case "行政征收":result="04";break;
			case "行政给付":result="05";break;
			case "行政检查":result="06";break;
			case "行政确认":result="07";break;
			case "行政奖励":result="08";break;
			case "行政裁决":result="09";break;
			case "其他行政权力":result="10";break;
		}
		return result;
	}

	public String taskState(String type){
		String result="";
		switch(type){
			case "待提交":result="0";break;
			case "已审定":result="1";break;
			case "发布状态":result="1";break;
			case "已发布":result="2";break;
			case "审核驳回":result="3";break;
		}
		return result;
	}

	public String powerSource(String type){
		String result="";
		switch(type){
			case "法定本级行使":result="1";break;
			case "上级下放":result="2";break;
			case "上级授权":result="3";break;
			case "同级授权":result="4";break;
			case "上级委托":result="5";break;
			case "同级委托":result="6";break;
		}
		return result;
	}

	public String deptType(String type){
		String result="";
		switch(type){
			case "法定机关":result="1";break;
			case "授权组织":result="2";break;
			case "受委托组织":result="3";break;
		}
		return result;
	}

	public String projectType(String type){
		String result="5";
		switch(type){
			case "即办件":result="1";break;
			case "承诺件":result="2";break;
		}
		return result;
	}

	public String serverType(String type){
		String result="5";
		switch(type){
			case "自然人":result="1";break;
			case "企业法人":result="2";break;
			case "事业法人":result="3";break;
			case "社会组织法人":result="4";break;
			case "非法人企业":result="5";break;
			case "行政机关":result="6";break;
			case "其他组织":result="9";break;
		}
		return result;
	}
}
