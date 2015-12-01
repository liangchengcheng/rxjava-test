package mddemo.library.com.activityanimation_master;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

/**
 * 从15年4月份在现在的公司之后就差不多对rx有所了解，在学习的过程中也见过很多的github的项目是基于rx的响应式
 * 编程，但是公司的一些情况（你懂的）很多东西都用不上，什么md特效什么mvp模式 mvvm数据绑定甚至recyclerview
 * 几乎都没用上，最近新的项目还没开，于是今天我打算整理一下我对rx的一些知识。
 * 【https://github.com/lzyzsd/Awesome-RxJava】很赞
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
