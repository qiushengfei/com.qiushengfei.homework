package com.bawei.service;

import java.util.List;

import com.bawei.entity.Plan;
import com.github.pagehelper.PageInfo;

public interface DepartmentService {

	boolean insert(Plan p);

	PageInfo<Plan> list(Integer page, Integer pageSize, Plan p);

	Plan seleceById(Integer id);

	List<Plan> selectdepar();

	int del(String ids);

	boolean update(Plan p);

}
