package com.jacob.service.demo;


import android.app.Activity;
import android.os.Bundle;

import com.jacob.service.demo.service.Bootstrap;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Bootstrap.startAlwaysOnService(this, "Main");
	}


}
