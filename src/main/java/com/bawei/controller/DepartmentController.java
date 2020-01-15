package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.entity.Plan;
import com.bawei.service.DepartmentService;
import com.github.pagehelper.PageInfo;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	//列表
	@RequestMapping("list")
	private String list(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "5") Integer pageSize,Model model,Plan p) {
		
	 PageInfo<Plan>  info = departmentService.list(page,pageSize,p);
		model.addAttribute("info", info);
	 model.addAttribute("p",p);
		return "list";
	}
	//按照ID查询
	@GetMapping("seleceById")
	private String seleceById(@RequestParam("id") Integer id,Model model) {
	Plan p = departmentService.seleceById(id);
	 model.addAttribute("p",p);
		return "seleceById";
	}
	//去添加界面
	@GetMapping("add")
	public String selectdepar(Model model,Plan p) {
   List<Plan> list = departmentService.selectdepar();
   model.addAttribute("list",list);
   model.addAttribute("p",p);
		return "insert";
	}
	//添加
	@PostMapping("insert")
	public String insert(Plan p) {
	  departmentService.insert(p);
		return "redirect:list";
	}
	//ajax的批量删除
	@ResponseBody
	@RequestMapping("del")
	public int del(@RequestParam("ids") String ids) {
	 int i =	departmentService.del(ids);
		return i;
	}

	//去修改界面
	@GetMapping("updateByid")
	public String updateByid(Model model,@RequestParam("id") Integer id) {
   List<Plan> list = departmentService.selectdepar();
   Plan p = departmentService.seleceById(id);
	 model.addAttribute("p",p);
	 model.addAttribute("list",list);
		return "update";
	}
	//修改
	@PostMapping("update")
	public String update(Plan p) {
		departmentService.update(p);
		return "redirect:list";
	}
	
}
