package cn.boot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.boot.dao.ProductDao;
import cn.boot.model.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Resource
	private ProductDao productDao;

	@RequestMapping("/save")
	@ResponseBody
	public String save(Product product) {
		// ctrl + 2,l
		productDao.save(product);
		return "插入成功";
	}
}
