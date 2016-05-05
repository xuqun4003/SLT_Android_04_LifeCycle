package com.example.slt_android_04_lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends Activity {
private VideoView videoView;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);

		if(videoView == null){
			videoView = (VideoView)findViewById(R.id.videoView1);
			MediaController mediaController = new MediaController(this);
			videoView.setMediaController(mediaController);//为视频播放器添加控制条
			
			videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.ww);//设置播放路径
			videoView.requestFocus();//获取焦点
			
			
			
		}
		
		if(savedInstanceState != null && savedInstanceState.getInt("position") != 0)
		{
			videoView.seekTo(savedInstanceState.getInt("position"));//拖放进度为原保存的进度
		}
		videoView.start();//播放
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
		outState.putInt("position", videoView.getCurrentPosition());
		//将视频播放器的播放进度写入状态保存中去
	}
}
