package com.springcore.Ref;

public class B {
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public B() {
		super();
	}

	@Override
	public String toString() {
		return "getting called from B [y=" + y + "]";
	}
	

	
	
}
