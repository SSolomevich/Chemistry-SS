package com.solomevich.android.chemistryss;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/**
 * Created by 15 on 24.09.2017.
 */

public class RowTableView extends View {

    private Drawable image;
    private float scaleFactor = 1.0f;
    private ScaleGestureDetector scaleGestureDetector;

    public  RowTableView(Context context) {
        super(context);
        image = context.getResources().getDrawable(R.drawable.ryadnapryazheniymetallov);
        setFocusable(true);
        image.setBounds(0, 0, image.getIntrinsicWidth()-1000, image.getIntrinsicHeight());
        scaleGestureDetector = new ScaleGestureDetector(context, new  RowTableView.ScaleListener());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.scale(scaleFactor, scaleFactor);
        image.draw(canvas);
        canvas.restore();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        scaleGestureDetector.onTouchEvent(event);
        invalidate();
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scaleFactor *= detector.getScaleFactor();
            scaleFactor = Math.max(0.1f, Math.min(scaleFactor, 5.0f));
            invalidate();
            return true;
        }
    }
}
