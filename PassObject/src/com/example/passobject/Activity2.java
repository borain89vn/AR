package com.example.passobject;

import android.app.Activity;
import android.os.Bundle;

public class Activity2 extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Person b ;
		b= getIntent().getParcelableExtra("person");
		String s;
		s=b.getAddress();///edit
	}

}
