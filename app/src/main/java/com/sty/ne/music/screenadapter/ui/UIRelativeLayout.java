package com.sty.ne.music.screenadapter.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by tian on 2019/10/24.
 */

public class UIRelativeLayout extends RelativeLayout {
    private boolean flag = true;
    public UIRelativeLayout(Context context) {
        super(context);
    }

    public UIRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UIRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //可能会多次测量，只需要缩放一次
        if(flag) {
            float scaleX = UIUtils.getInstance().getHorizontalScaleValue(); //计算水平缩放系数
            float scaleY = UIUtils.getInstance().getVerticalScaleValue(); //计算水平缩放系数
            int childCount = this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = this.getChildAt(i);
                LayoutParams layoutParams = (LayoutParams) child.getLayoutParams();
                layoutParams.width = (int) (layoutParams.width * scaleX);
                layoutParams.height = (int) (layoutParams.height * scaleY);
                layoutParams.leftMargin = (int) (layoutParams.leftMargin * scaleX);
                layoutParams.rightMargin = (int) (layoutParams.rightMargin * scaleX);
                layoutParams.topMargin = (int) (layoutParams.topMargin * scaleY);
                layoutParams.bottomMargin = (int) (layoutParams.bottomMargin * scaleY);
                //padding view
                //child.setPadding()
                //child.setLayoutParams(layoutParams);
            }
            flag = false;
        }

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
