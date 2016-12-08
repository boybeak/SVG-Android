package com.android.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_airline_seat_flat_angled extends SVGRenderer {

    public ic_airline_seat_flat_angled(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(22.25f, 14.29f);
        mPath.rLineTo(-0.69f, 1.89f);
        mPath.lineTo(9.2f, 11.71f);
        mPath.rLineTo(2.08f, -5.66f);
        mPath.rLineTo(8.56f, 3.09f);
        mPath.rCubicTo(2.1f, 0.76f, 3.18f, 3.06f, 2.41f, 5.15f);
        mPath.close();
        mPath.moveTo(22.25f, 14.29f);
        mPath.moveTo(1.5f, 12.14f);
        mPath.lineTo(8.0f, 14.48f);
        mPath.lineTo(8.0f, 19.0f);
        mPath.rLineTo(8.0f, 0f);
        mPath.rLineTo(0f, -1.63f);
        mPath.lineTo(20.52f, 19.0f);
        mPath.rLineTo(0.69f, -1.89f);
        mPath.rLineTo(-19.02f, -6.86f);
        mPath.rLineTo(-0.69f, 1.89f);
        mPath.close();
        mPath.moveTo(1.5f, 12.14f);
        mPath.rMoveTo(5.8f, -1.94f);
        mPath.rCubicTo(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        mPath.cubicTo(7.99f, 4.71f, 6.2f, 4.08f, 4.7f, 4.8f);
        mPath.rCubicTo(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        mPath.rCubicTo(0.71f, 1.49f, 2.5f, 2.12f, 4.0f, 1.4f);
        mPath.close();
        mPath.moveTo(7.3f, 10.200001f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}