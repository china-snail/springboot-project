package com.thunisoft.storageMachineCtrl.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class StorageMachineController {
	
	
	@RequestMapping("/")
	public String welcome(){
		return "welcome";
	}
}