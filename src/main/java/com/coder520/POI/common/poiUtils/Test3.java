package com.coder520.POI.common.poiUtils;

import com.coder520.POI.LabDepartment.dao.LabDepartmentMapper;
import com.coder520.POI.LabDepartment.entity.LabDepartment;
import com.coder520.POI.LabInfo.dao.LabInfoMapper;
import com.coder520.POI.LabInfo.entity.LabInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by yang on 2017/10/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-cfg.xml")
public class Test3 {
    @Autowired
    private LabInfoMapper labInfoMapper;
    @Autowired
    private LabDepartmentMapper labDepartmentMapper;

    @Test
    //@Transactional
    public void creatLabInfo() throws FileNotFoundException, IOException, ParseException {


    }
}
