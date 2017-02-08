package com.thunisoft.storageMachineCtrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.thunisoft.storageMachineCtrl.settings.Config;


@SpringBootApplication
@EnableScheduling
public class Lancher implements EmbeddedServletContainerCustomizer {
	
	@Autowired  
	private Config config;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Lancher.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(config.getLancherPort());
	}
}
