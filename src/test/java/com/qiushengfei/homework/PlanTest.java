package com.qiushengfei.homework;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bawei.dao.DepartmentDao;
import com.bawei.entity.Plan;
import com.bawei.service.DepartmentService;
import com.qiushengfei.common.utils.FileUtil;

public class PlanTest {

	@Test
	public void test() {
		ApplicationContext as = new  ClassPathXmlApplicationContext("spring-beans.xml");
		DepartmentService bean = as.getBean(DepartmentService.class);
		//读取文件
		List<String> list = FileUtil.readTextFileToList("D:\\javalujing\\SSM\\com.qiushengfei.homework1\\src\\test\\resources//work1.txt");
		for (String string : list) {
			//||为转移字符 拆分需要加上//
			String[] split = string.split("\\|\\|");
			Plan p =  new Plan();
			p.setName(split[0]);
			p.setAmount(split[1]);
			p.setManager(split[2]);
			p.setContent(split[3]);
			if(split[4].equals("炸药厂")) {
				p.setDid(1);
			}else if(split[4].equals("生产服务中心")) {
				p.setDid(2);
			}else if(split[4].equals("洗选车间")) {
				p.setDid(3);
			}
			else if(split[4].equals("矸电公司")) {
				p.setDid(4);
			}else if(split[4].equals("大准铁路公司")) {
				p.setDid(5);
			}else if(split[4].equals("准能选煤厂")) {
				p.setDid(6);
			}
			bean.insert(p);
		}
		
		
		
		
		
	}
	
	@Test
	public void test1() {
		ApplicationContext as = new  ClassPathXmlApplicationContext("spring-beans.xml");
		 DepartmentDao bean = as.getBean(DepartmentDao.class);
		 Plan p = new Plan();
		 List<Plan> list = bean.list(p);
		 System.out.println(list);
		
	}

}
