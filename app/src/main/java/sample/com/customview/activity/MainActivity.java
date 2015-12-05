package sample.com.customview.activity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import sample.com.customview.R;

public class MainActivity extends ListActivity  {

	private ArrayList<String> customViewList = new ArrayList<String>(Arrays.asList("Custom Font View", "Custom Image View", "Custom Pie Chart"));


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, customViewList);
		setListAdapter(adapter);
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);

		if (((TextView)v).getText().equals(customViewList.get(position))) {
			Intent intent = new Intent(MainActivity.this, CustomFontViewActivity.class);
			startActivity(intent);
		}
	}
}
