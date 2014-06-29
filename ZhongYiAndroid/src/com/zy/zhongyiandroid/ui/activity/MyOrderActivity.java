package com.zy.zhongyiandroid.ui.activity;




import com.zy.zhongyiandroid.R;
import com.zy.zhongyiandroid.ui.widget.Header;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MyOrderActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_myorder);
		initHeader();
	}
	public static void startActivity(Context c){
		Intent i = new Intent(c,MyOrderActivity.class);
		c.startActivity(i);
	}
	public void initHeader() {
		Header mHeader = (Header) this.findViewById(R.id.header);
		if (mHeader != null) {
			mHeader.setTitle(R.string.my_order);
			
		}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}


}
