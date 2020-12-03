package com.sat.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sat.domain.LoadProperties;

@RestController
public class HelloController {
	private LoadProperties loadProperties;
	
	public HelloController(LoadProperties loadProperties) {
		this.loadProperties = loadProperties;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "loading_default:" + loadProperties.getLoading_default()
				+ "  loading_dev:" + loadProperties.getLoading_dev()
				+"  loading_vault_default:" + loadProperties.getLoading_vault_default()
				//测试静态变量的赋值和刷新
//				+ "  loading_vault_dev:" + loadProperties.getLoading_vault_dev()
				+ "  loading_vault_dev:" + LoadProperties.loading_vault_dev
				+ "  loading_git_vault_default:" + loadProperties.getLoading_git_vault_default();
	}
}
