package com.example.cylonz.recyclerview.View;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.cylonz.recyclerview.R;

import java.util.zip.Inflater;

/**
 * Created by Cylonz on 11/6/2559.
 */
public class cusview extends FrameLayout {

    TextView txt1;
    TextView txt2;
    TextView txt3;

    public cusview(Context context) {
        super(context);
    }

    public cusview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public cusview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public cusview(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    private void init(){
        inflate(getContext(), R.layout.cusview,this);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
    }

    public String getTxt1() {
        return txt1.getText().toString();
    }

    public void setTxt1(String text) {
        this.txt1.setText(text);
    }

    public String getTxt2() {
        return txt2.getText().toString();
    }

    public void setTxt2(String text) {
        this.txt2.setText(text);
    }

    public String getTxt3() {
        return txt3.getText().toString();
    }

    public void setTxt3(String text) {
        this.txt3.setText(text);
    }

}
