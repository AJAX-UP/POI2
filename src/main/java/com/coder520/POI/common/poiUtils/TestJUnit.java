package com.coder520.POI.common.poiUtils;

import com.coder520.POI.UuserRolesMap.dao.MlToolLogMapper;
import com.coder520.POI.UuserRolesMap.entity.MlToolLogEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-cfg.xml"})
public class TestJUnit {
//	@Autowired
//	private MlMatterInfoMapper mlMatterInfoMapper;

	@Autowired
	private MlToolLogMapper mlToolLogMapper;


	@Test
	public void creatLabInfo(){
		String filePath="D:\\山东省级政务2020-4-29.xls";
		Excel2Data excel2Data=new Excel2Data(filePath);
		List<MlToolLogEntity> labInfoList = excel2Data.CreateMatterInfoList();
		int sum =0;
		for (MlToolLogEntity labInfo: labInfoList) {
			mlToolLogMapper.insertMlToolLog(labInfo);
		}

	}
}
