package com.baszek91gmail.myglapp;

/**
 * Created by basze on 28.08.2016.
 */
import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSourceView extends GLSurfaceView {

    private MyGLRenderer glRenderer;
    public MyGLSourceView(Context context) {
        super(context);

        setEGLContextClientVersion(2);
        glRenderer = new MyGLRenderer();
        setRenderer(glRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
