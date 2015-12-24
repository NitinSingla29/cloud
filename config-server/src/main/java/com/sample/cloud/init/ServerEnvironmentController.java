package com.sample.cloud.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.server.EnvironmentController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${spring.cloud.config.server.prefix:}")
public class ServerEnvironmentController {

	@Autowired
	private EnvironmentController enviromentController;

	@RequestMapping("/")
	public Environment home() {
		return enviromentController.master("sample", "default");
	}
}
