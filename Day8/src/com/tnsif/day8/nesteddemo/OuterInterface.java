package com.tnsif.day8.nesteddemo;

public interface OuterInterface {

	void calArea();
	
	interface InnerInterface{
		int id = 20;
		void print();
	}
}
