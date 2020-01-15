package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.DepartmentDao;
import com.bawei.entity.Plan;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public boolean insert(Plan p) {
		return departmentDao.insert(p);
	}

	@Override
	public PageInfo<Plan> list(Integer page, Integer pageSize, Plan p) {
		PageHelper.startPage(page, pageSize);
		List<Plan> list = departmentDao.list(p);
		return new PageInfo<>(list);
	}

	@Override
	public Plan seleceById(Integer id) {
		
		return departmentDao.seleceById(id);
	}

	@Override
	public List<Plan> selectdepar() {
		return departmentDao.selectdepar();
	}

	@Override
	public int del(String ids) {
		// TODO Auto-generated method stub
		return departmentDao.del(ids);
	}

	@Override
	public boolean update(Plan p) {
		// TODO Auto-generated method stub
		return departmentDao.update(p);
	}

}
