package mobostatics.barcharts.simplebarchart.drawcomponents;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Calendar;

import mobostatics.barcharts.simplebarchart.models.BarChartModel;

public class DrawLines {

    private BarChartModel mBarChartModel;
    private Canvas mMoboCanvas;
    public DrawLines(){ }

    public void drawBarCharLines(BarChartModel barChartModel){
        this.mBarChartModel = barChartModel;
        this.mMoboCanvas = barChartModel.getMoboCanvas();

        mMoboCanvas.drawLine(mBarChartModel.getBarChartMargins().getXAxisLabelMargin(),mBarChartModel.mViewHeight - mBarChartModel.getBarChartMargins().getYAxisLabelMargin(),mBarChartModel.mViewWidth,mBarChartModel.mViewHeight - mBarChartModel.getBarChartMargins().getYAxisLabelMargin(), mBarChartModel.getPaint());
        mMoboCanvas.drawLine(mBarChartModel.getBarChartMargins().getXAxisLabelMargin(),mBarChartModel.getBarChartMargins().getYAxisLabelMargin(),mBarChartModel.getBarChartMargins().getXAxisLabelMargin(),mBarChartModel.mViewHeight - mBarChartModel.getBarChartMargins().getYAxisLabelMargin(), mBarChartModel.getPaint());
    }
}
