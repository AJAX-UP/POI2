package com.coder520.POI.common.poiUtils;

import com.coder520.POI.LabDepartment.dao.LabDepartmentMapper;
import com.coder520.POI.LabEquipment.dao.LabEquipmentMapper;
import com.coder520.POI.LabEquipment.entity.LabEquipment;
import com.coder520.POI.LabEquipmentList.dao.LabEquipmentListMapper;
import com.coder520.POI.LabInfo.dao.LabInfoMapper;
import com.coder520.POI.LabInfo.entity.LabInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by yang on 2017/10/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-cfg.xml")
public class labEquipment2Date {
    @Autowired
    private LabInfoMapper labInfoMapper;
    @Autowired
    private LabDepartmentMapper labDepartmentMapper;
    @Autowired
    private LabEquipmentMapper labEquipmentMapper;
    @Autowired
    private LabEquipmentListMapper labEquipmentListMapper;

    @Test
    public void creatLabEquipment() throws ParseException {


    }
}
