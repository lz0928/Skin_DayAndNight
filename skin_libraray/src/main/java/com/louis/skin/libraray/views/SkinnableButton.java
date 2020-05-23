package com.louis.skin.libraray.views;


import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.louis.skin.libraray.core.ViewMatch;
import com.louis.skin.libraray.model.AttrsBean;

public class SkinnableButton extends AppCompatButton implements ViewMatch {

    private AttrsBean mAttrsBean;

    public SkinnableButton(Context context) {
        super(context);
    }

    public SkinnableButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SkinnableButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void skinnableView() {

    }
}
