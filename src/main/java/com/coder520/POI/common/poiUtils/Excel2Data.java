package com.coder520.POI.common.poiUtils;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import com.coder520.POI.LabEquipment.entity.LabEquipment;
import com.coder520.POI.LabInfo.entity.LabInfo;
import com.coder520.POI.UuserRolesMap.entity.MlMatterInfoEntity;
import com.coder520.POI.UuserRolesMap.entity.MlToolLogEntity;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import com.coder520.POI.user.entity.User;

public class Excel2Data {
	private String filePath;
	HSSFWorkbook wb;
	public Excel2Data(String filePath) {
		this.filePath=filePath;
	}
	@SuppressWarnings("null")
	public List<MlToolLogEntity> CreateMatterInfoList(){
		List<MlToolLogEntity> matterInfoEntity =new ArrayList<MlToolLogEntity>();
		try {
			wb = new HSSFWorkbook(new FileInputStream(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("解析Excel文件出错");
			e.printStackTrace();
		}
		HSSFSheet sheet=wb.getSheet("sheet1");
		int rowLength=sheet.getLastRowNum();
		for (int i = 2; i <=50; i++) {
			MlToolLogEntity obj = new MlToolLogEntity();
			HSSFRow row=sheet.getRow(i);
			HSSFCell cell=row.getCell(0);
			obj.setId(String.valueOf(i));
			HSSFCell cell1=row.getCell(1);
			obj.setTaskGuid(cell1.getStringCellValue());
//			HSSFCell cell2=row.getCell(2);
//			//user.setBirthday(cell2.getDateCellValue());
//			HSSFCell cell3=row.getCell(3);
//			//user.setSex(cell3.getStringCellValue());
//			HSSFCell cell4=row.getCell(4);
//			//user.setAddress(cell4.getStringCellValue());
			matterInfoEntity.add(obj);
		}
		return matterInfoEntity;
	}
}
