package com.example.slt_android_04_lifecycle;

import android.R.integer;
import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";
	private EditText et;
	private int position=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et = (EditText)findViewById(R.id.editText1);
		Log.e(TAG, "~~~~~~~~~onCreate~~~~~~~~~~~~~~");//生成错误的日志
		Log.v(TAG, "我是调试的，我很啰嗦，任何消息我都会输出，我黑色");
		Log.d(TAG, "我是调试的，输出DEBUG信息，我蓝色");
		Log.i(TAG, "我是一般性消息，我绿色");
		Log.w(TAG, "我是警告消息，我橙色");
		
		if(savedInstanceState != null){
			position = savedInstanceState.getInt("position");//20
		}
		
		Log.e(TAG, position+"");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.e(TAG, "~~~~~~~~~onStart~~~~~~~~~~~~~~");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.e(TAG, "~~~~~~~~~onRestart~~~~~~~~~~~~~~");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.e(TAG, "~~~~~~~~~onResume~~~~~~~~~~~~~~");
	}
	
	//保存持久化的数据
	@Override
	protected void onPause() {
		super.onPause();
		Log.e(TAG, "~~~~~~~~~onPause~~~~~~~~~~~~~~");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.e(TAG, "~~~~~~~~~onStop~~~~~~~~~~~~~~");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e(TAG, "~~~~~~~~~onDestory~~~~~~~~~~~~~~");
	}
	
	//保存的是临时状态（看视频，竖屏切换横屏，视频进度/电源键关了屏幕）
	@Override
	protected  void  onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("position", 20);
		Log.e(TAG, "~~~~~~~~~onSaveInstanceState~~~~~~~~~~~~~~");
	}
	
}
