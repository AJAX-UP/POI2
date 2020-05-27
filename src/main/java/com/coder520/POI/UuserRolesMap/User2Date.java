package com.coder520.POI.UuserRolesMap;

import com.coder520.POI.LabDepartment.dao.LabDepartmentMapper;
import com.coder520.POI.LabDepartment.entity.LabDepartment;
import com.coder520.POI.LabInfo.dao.LabInfoMapper;
import com.coder520.POI.LabInfo.entity.LabInfo;
import com.coder520.POI.TeacherBaseInfo.dao.TeacherBaseInfoMapper;
import com.coder520.POI.TeacherBaseInfo.entity.TeacherBaseInfo;
import com.coder520.POI.UuserRolesMap.entity.UuserRolesMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by yang on 2017/10/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-cfg.xml")
public class User2Date {
    @Autowired
    TeacherBaseInfoMapper teacherBaseInfoMapper;
    @Autowired
    LabInfoMapper labInfoMapper;
    @Autowired
    LabDepartmentMapper labDepartmentMapper;

    @Test
    //@Transactional
    public void creatUuserRolesMapMapper(){
    }

    @Test
    //@Transactional
    public void creatTeacherAndUser() throws ParseException {

    }

}
