package cn.boot.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.boot.model.Product;

public interface ProductDao {

	public void save(Product product);

}
