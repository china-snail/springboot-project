package com.thunisoft.storageMachineCtrl.settings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:props/config.properties")
public class Config {
	
	/**
	 * 程序启动端口
	 */
	@Value("${lancherPort}")
	private Integer lancherPort;
	
	/**
	 * 定时断电表达式
	 */
	@Value("${powerOffCron}")
	private String powerOffCron;
	
	/**
	 * 存储设备IP
	 */
	@Value("${storageDevice.ip}")
	private String deviceIp;
	
	/**
	 * 存储设备端口
	 */
	@Value("${storageDevice.port}")
	private Integer devicePort;
	
	/**
	 * 存储设备用户名
	 */
	@Value("${storageDevice.username}")
	private String deviceUsername;
	
	/**
	 * 存储设备密码
	 */
	@Value("${storageDevice.password}")
	private String devicePwd;
	
	/**
	 * 存储映射本地路径
	 */
	@Value("${reflectLocalPath}")
	private String reflectLocalPath;

	public Integer getLancherPort() {
		return lancherPort;
	}

	public String getPowerOffCron() {
		return powerOffCron;
	}

	public String getDeviceIp() {
		return deviceIp;
	}
	
	public Integer getDevicePort() {
		return devicePort;
	}

	public String getDeviceUsername() {
		return deviceUsername;
	}


	public String getDevicePwd() {
		return devicePwd;
	}

	public String getReflectLocalPath() {
		return reflectLocalPath;
	}

}
