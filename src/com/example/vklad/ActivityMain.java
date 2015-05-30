package com.example.vklad;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class ActivityMain extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();
		TabHost.TabSpec tabSpec;
		tabSpec = tabHost.newTabSpec("tag1");
		tabSpec.setIndicator("Вкладка 1");
		tabSpec.setContent(R.id.tvTab1);
		tabHost.addTab(tabSpec);
		
        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Вкладка 2", getResources().getDrawable(R.drawable.tab_icon_selector));
		tabSpec.setContent(R.id.tvTab2);
		tabHost.addTab(tabSpec);

		tabSpec = tabHost.newTabSpec("tag3");
		tabSpec.setIndicator("Вкладка 3", getResources().getDrawable(R.drawable.tab_icon_selector));
		tabSpec.setContent(R.id.tvTab3);
		tabHost.addTab(tabSpec);

	}
}