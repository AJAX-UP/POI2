package com.coder520.POI.common.poiUtils;

import com.coder520.POI.UuserRolesMap.dao.*;
import com.coder520.POI.UuserRolesMap.entity.MlMatterInfoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
		Excel2Data excel2Data=new Excel2Data(filePath);
		List<MlMatterInfoEntity> labInfoList = excel2Data.CreateMatterInfoList();
		int sum =0;
		for (MlMatterInfoEntity labInfo: labInfoList) {
			MlMatterInfoMapper.insertMlMatterInfo(labInfo);
		}

	}
}
