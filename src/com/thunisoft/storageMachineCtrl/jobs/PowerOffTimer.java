package com.thunisoft.storageMachineCtrl.jobs;

import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 断电定时器
 * @author wuzhe
 *
 */
@Component
@PropertySource("classpath:props/config.properties")
public class PowerOffTimer {
	
	/**
	 * 定时关闭
	 */
	@Scheduled(cron = "${powerOffCron}")
	public void powerOff(){
	}
}
