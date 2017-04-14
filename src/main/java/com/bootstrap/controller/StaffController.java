package com.bootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.bootstrap.service.StaffService;
import com.bootstrap.util.Page;
import com.bootstrap.util.PageParam;

/**
 * controller
 * @author gcg
 * 
 * 2017年4月14日 下午4:16:39
 */
@Controller
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private StaffService staffService;
	
	@RequestMapping("/index.do")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/staff/index");
		return mv;
	}
	
	@RequestMapping("/list.do")
	@ResponseBody
	public JSONObject list(int limit, int offset,String order) {
		JSONObject result = new JSONObject();
		PageParam pageParam = new PageParam(offset, limit, null, order);
		
		Page page = this.staffService.find(pageParam);
		result.put("total", page.getTotal());
		result.put("rows", page.getRows());
		return result;
	}
	
}