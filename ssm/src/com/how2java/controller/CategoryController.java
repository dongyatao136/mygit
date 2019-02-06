package com.how2java.controller;

//小伙子帅不帅
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
@Controller
@RequestMapping("")
public class CategoryController {
	//我还是我
	@Autowired
	CategoryService categoryService;
	//往前把大闹一场
	@RequestMapping("listCategorby")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list();
		//你说我是谁
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		//你是不是傻  
		return mav;
	}
}
