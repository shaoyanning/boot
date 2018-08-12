package cn.boot.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.boot.model.Product;

@Repository
public class ProductDao {
	@Resource
	private JdbcTemplate jdbcTemplate;

	public void save(Product product) {
		String sql = "insert into product (pro_name,pro_price) values (?,?)";
		jdbcTemplate.update(sql, new Object[] { product.getName(), product.getPrice() });
	}

}
