package com.lihao.shell;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.shell.jline.DefaultShellApplicationRunner;

@Order(DefaultShellApplicationRunner.PRECEDENCE - 100) // Runs before InteractiveShellApplicationRunner
public class ScriptShellApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	}

}
