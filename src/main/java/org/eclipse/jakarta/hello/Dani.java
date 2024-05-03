package org.eclipse.jakarta.hello;

public class Dani {

	private final String name;
	
	public Dani(String name) {
        this.name = name;
	}


	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Dani{");
		sb.append("name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}