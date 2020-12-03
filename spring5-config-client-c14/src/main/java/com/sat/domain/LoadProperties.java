package com.sat.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class LoadProperties {
	//只有git中存在的属性
	private String loading_default;
	private String loading_dev;
	
	
	
	//vault write secret/application loading_git_vault_default=vault-git-1 loading_vault_default=default-vault-1
	//vault write secret/applicationTwo loading_git_vault_default=vault-git-2 loading_vault_default=default-vault-2
	//vault write secret/application,dev loading_vault_dev=vault-dev
	//vault write secret/applicationTwo,dev loading_vault_dev=vault-dev-2
	
	//git和vault中都有的属性
	private String loading_git_vault_default;
	
	
	
	//只有Vault中存在的属性
	private String loading_vault_default;
//	private String loading_vault_dev;
	public static String loading_vault_dev;//测试静态变量的赋值和刷新，是可以的，但是set方法不能时static
	public String getLoading_default() {
		return loading_default;
	}
	public void setLoading_default(String loading_default) {
		this.loading_default = loading_default;
	}
	public String getLoading_dev() {
		return loading_dev;
	}
	public void setLoading_dev(String loading_dev) {
		this.loading_dev = loading_dev;
	}
	public String getLoading_git_vault_default() {
		return loading_git_vault_default;
	}
	public void setLoading_git_vault_default(String loading_git_vault_default) {
		this.loading_git_vault_default = loading_git_vault_default;
	}
	public String getLoading_vault_default() {
		return loading_vault_default;
	}
	public void setLoading_vault_default(String loading_vault_default) {
		this.loading_vault_default = loading_vault_default;
	}
//	public String getLoading_vault_dev() {
//		return loading_vault_dev;
//	}
//	public void setLoading_vault_dev(String loading_vault_dev) {
//		this.loading_vault_dev = loading_vault_dev;
//	}
	public String getLoading_vault_dev() {
		return loading_vault_dev;
	}
	public void setLoading_vault_dev(String loading_vault_dev) {
		LoadProperties.loading_vault_dev = loading_vault_dev;
	}
	
	
	
	
}
