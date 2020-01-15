package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.entity.Plan;

public interface DepartmentDao {

	boolean insert(Plan p);

	List<Plan> list(Plan p);

	Plan seleceById(Integer id);

	List<Plan> selectdepar();

	int del(@Param("ids") String ids);

	boolean update(Plan p);

}
