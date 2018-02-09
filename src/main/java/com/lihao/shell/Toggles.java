package com.lihao.shell;

import java.util.Calendar;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

@ShellComponent
public class Toggles {
	@ShellMethodAvailability
	public Availability availabilityOnWeekdays() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? Availability.available()
				: Availability.unavailable("today is not Sunday");
	}

	@ShellMethod("foo.")
	public void foo() {
	}

	@ShellMethod("bar.")
	public void bar() {
	}
}