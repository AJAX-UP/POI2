package com.coder520.POI.UuserRolesMap.dao;


import com.coder520.POI.UuserRolesMap.entity.MlToolLogEntity;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * MlToolLog Edit Dao
 * @author system
 */
@Repository("mlToolLogMapper")
public interface MlToolLogMapper {
	/**
     * add record
     * @author system
     * @param mlToolLog mlToolLog
     * @return int
     */
    public int insertMlToolLog(MlToolLogEntity mlToolLog);
    

}