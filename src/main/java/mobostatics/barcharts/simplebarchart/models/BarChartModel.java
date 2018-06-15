package mobostatics.barcharts.simplebarchart.models;

import android.graphics.Canvas;
import android.graphics.Paint;

import mobostatics.barcharts.simplebarchart.utils.BarChartLabels;
import mobostatics.barcharts.simplebarchart.utils.BarChartMargins;

public class BarChartModel {

    public Paint mPaint;
    public Canvas mMoboCanvas;
    public BarChartMargins mBarChartMargins;
    public BarChartLabels mBarChartLabels;
    public long mViewHeight;
    public long mViewWidth;

    public BarChartModel(Canvas moboCanvas, BarChartMargins barChartMargins, BarChartLabels barChartLabels, long viewHeight, long viewWidth, Paint paint){
        this.mMoboCanvas = moboCanvas;
        this.mBarChartLabels = barChartLabels;
        this.mBarChartMargins = barChartMargins;
        this.mViewHeight = viewHeight;
        this.mViewWidth = viewWidth;
        this.mPaint = paint;
    }

    public long getViewHeight() {
        return mViewHeight;
    }

    public void setViewHeight(long mViewHeight) {
        this.mViewHeight = mViewHeight;
    }

    public long getViewWidth() {
        return mViewWidth;
    }

    public void setViewWidth(long mViewWidth) {
        this.mViewWidth = mViewWidth;
    }

    public Canvas getMoboCanvas() {
        return mMoboCanvas;
    }

    private void setMoboCanvas(Canvas moboCanvas) {
        this.mMoboCanvas = moboCanvas;
    }

    public BarChartMargins getBarChartMargins() {
        return mBarChartMargins;
    }

    private void setBarChartMargins(BarChartMargins barChartMargins) {
        this.mBarChartMargins = barChartMargins;
    }

    public BarChartLabels getBarChartLabels() {
        return mBarChartLabels;
    }

    private void setBarChartLabels(BarChartLabels barChartLabels) {
        this.mBarChartLabels = barChartLabels;
    }

    public Paint getPaint() {
        return mPaint;
    }

    private void setPaint(Paint mPaint) {
        this.mPaint = mPaint;
    }
}
