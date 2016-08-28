package com.baszek91gmail.myglapp;

import android.annotation.SuppressLint;
import android.opengl.GLSurfaceView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private GLSurfaceView myGLSourceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myGLSourceView = new MyGLSourceView(this);

        setContentView(myGLSourceView);

    }
}
