package com.example.test31;


import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
	}

	private void initView() {
		final View view = findViewById(R.id.textView1);
		view.getViewTreeObserver().addOnGlobalLayoutListener(
				new OnGlobalLayoutListener() {

					@Override
					public void onGlobalLayout() {
//						view.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 250));
						int measuredHeight = view.getMeasuredHeight();
						int height = view.getHeight();
						Log.i("mytag", "measuredHeight:" + measuredHeight
								+ "  height:" + height);
					}
				});
	}

}
