package com.feigdev.actionbartabs;


import android.os.Bundle;
import android.support.v4.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ActionBar.Tab;
import android.widget.Toast;

public class SimpleActionBarTabsActivity extends FragmentActivity implements ActionBar.TabListener {
    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
    	getSupportActionBar().setDisplayUseLogoEnabled(false);
    	getSupportActionBar().setDisplayShowTitleEnabled(true);
    	getSupportActionBar().setDisplayShowHomeEnabled(true);
    	getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    	
    	ActionBar.Tab newTab0 = getSupportActionBar().newTab();
    	newTab0.setText("Tab 0 title");
    	ActionBar.Tab newTab1 = getSupportActionBar().newTab();
    	newTab1.setText("Tab 1 title");
    	ActionBar.Tab newTab2 = getSupportActionBar().newTab();
    	newTab2.setText("Tab 2 title");
    	ActionBar.Tab newTab3 = getSupportActionBar().newTab();
    	newTab3.setText("Tab 3 title");
    	ActionBar.Tab newTab4 = getSupportActionBar().newTab();
    	newTab4.setText("Tab 4 title");
    	ActionBar.Tab newTab5 = getSupportActionBar().newTab();
    	newTab5.setText("Tab 5 title");
    	ActionBar.Tab newTab6 = getSupportActionBar().newTab();
    	newTab6.setText("Tab 6 title");
    	
    	newTab0.setTabListener(this);
    	newTab1.setTabListener(this);
    	newTab2.setTabListener(this);
    	newTab3.setTabListener(this);
    	newTab4.setTabListener(this);
    	newTab5.setTabListener(this);
    	newTab6.setTabListener(this);
    	
    	getSupportActionBar().addTab(newTab0);
    	getSupportActionBar().addTab(newTab1);
    	getSupportActionBar().addTab(newTab2);
    	getSupportActionBar().addTab(newTab3);
    	getSupportActionBar().addTab(newTab4);
    	getSupportActionBar().addTab(newTab5);
    	getSupportActionBar().addTab(newTab6);
    	
    }
    
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		toastText("tab " + String.valueOf(tab.getPosition()) + " clicked");
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}
	
	private void toastText(String message){
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
	}
	
}