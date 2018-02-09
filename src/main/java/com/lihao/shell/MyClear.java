package com.lihao.shell;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.commands.Clear.Command;

public class MyClear implements Command {

	@ShellMethod("Clear the screen, only better.")
    public void clear() {
        // ...
    }
}
