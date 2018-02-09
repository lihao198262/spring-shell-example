package com.lihao.shell;

import org.springframework.core.convert.converter.Converter;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;

@ShellComponent
class ConversionCommands {

	@ShellMethod("Shows conversion using Spring converter")
	public String conversionExample(DomainObject object) {
		return object.getClass().toString() + " " + object;
	}

}

class DomainObject {
	private final String value;

	DomainObject(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}
}

@Component
class CustomDomainConverter implements Converter<String, DomainObject> {

	@Override
	public DomainObject convert(String source) {
		return new DomainObject(source);
	}
}