package com.lihao.shell;

import javax.validation.constraints.Size;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent("aaaa")
public class MyCommands {

	@ShellMethod("Add two integers together.")
	public int add(int a, int b) {
		return a + b;
	}

	@ShellMethod(value = "Add numbers.", key = "sum")
	public int aaa(int a, int b) {
		return a + b;
	}

	@ShellMethod("test1")
	public String test1() {
		return "aaa";
	}

	@ShellMethod(value = "Display stuff.", prefix = "-")
	public String echo(int a, int b, @ShellOption(value = { "--third", "--aaa" }, defaultValue = "1") int c) {
		return String.format("You said a=%d, b=%d, c=%d", a, b, c);
	}

	@ShellMethod("Add Numbers.")
	public float add2(@ShellOption(arity = 3) float[] numbers) {
		return numbers[0] + numbers[1] + numbers[2];
	}

	// 1 shutdown --force
	// 2 shutdown
	@ShellMethod("Terminate the system.")
	public String shutdown(boolean force) {
		return "You said " + force;
	}
	
	
	// change-password hello
	@ShellMethod("Change password.")
	public String changePassword(@Size(min = 8, max = 40) String password) {
		return "Password successfully set to " + password;
	}
	
	private boolean connected;

    @ShellMethod("Connect to the server.")
    public void connect(String user, String password) {
        connected = true;
    }

    @ShellMethod("Download the nuclear codes.")
    public void download() {
    }

    public Availability downloadAvailability() {
        return connected
            ? Availability.available()
            : Availability.unavailable("you are not connected");
    }
}
