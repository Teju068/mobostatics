package mobostatics.barcharts.simplebarchart.barcharts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import mobostatics.barcharts.simplebarchart.drawcomponents.DrawLabels;
import mobostatics.barcharts.simplebarchart.drawcomponents.DrawLines;
import mobostatics.barcharts.simplebarchart.models.BarChartModel;
import mobostatics.barcharts.simplebarchart.utils.BarChartLabels;
import mobostatics.barcharts.simplebarchart.utils.BarChartMargins;
import mobostatslibs.BuildConfig;

public class SimpleBarChart extends View {

    private static final String TAG = SimpleBarChart.class.getSimpleName();
    private long mViewHeight;
    private long mViewWidth;
    private Canvas mMoboCanvas;
    private BarChartLabels mBarChartLabels;
    private BarChartMargins mBarChartMargins;
    private Paint mLinePaint;

    /**
     * Simple constructor to use when creating a view from code.
     *
     * @param context The Context the view is running in, through which it can
     *                access the current theme, resources, etc.
     */
    public SimpleBarChart(Context context) {
        super(context);
    }

    /**
     * Constructor that is called when inflating a view from XML. This is called
     * when a view is being constructed from an XML file, supplying attributes
     * that were specified in the XML file. This version uses a default style of
     * 0, so the only attribute values applied are those in the Context's Theme
     * and the given AttributeSet.
     * <p>
     * <p>
     * The method onFinishInflate() will be called after all children have been
     * added.
     *
     * @param context The Context the view is running in, through which it can
     *                access the current theme, resources, etc.
     * @param attrs   The attributes of the XML tag that is inflating the view.
     */
    public SimpleBarChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Perform inflation from XML and apply a class-specific base style from a
     * theme attribute. This constructor of View allows subclasses to use their
     * own base style when they are inflating. For example, a Button class's
     * constructor would call this version of the super class constructor and
     * supply <code>R.attr.buttonStyle</code> for <var>defStyleAttr</var>; this
     * allows the theme's button style to modify all of the base view attributes
     * (in particular its background) as well as the Button class's attributes.
     *
     * @param context      The Context the view is running in, through which it can
     *                     access the current theme, resources, etc.
     * @param attrs        The attributes of the XML tag that is inflating the view.
     * @param defStyleAttr An attribute in the current theme that contains a
     *                     reference to a style resource that supplies default values for
     *                     the view. Can be 0 to not look for defaults.
     */
    public SimpleBarChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * Test Draw
     */
    public void onDraw(Canvas canvas) {

        mMoboCanvas = canvas;
        drawBarCharts(getBarChartModel());
    }

    /**
     * set Background Color of Complete View Bar chart
     * @param color integer
     */
    public void setBarBackgroundColor(int color){
        this.setBackgroundColor(color);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        mViewHeight = this.getHeight();
        mViewWidth = this.getWidth();
        if (BuildConfig.DEBUG) {
            Log.d(TAG, "Height:" + this.getHeight());
            Log.d(TAG, "Width:" + this.getWidth());
        }
        notifyGraphChanged();
    }

    /**
     * Refresh the layout with correct parameters
     */
    public void notifyGraphChanged(){
        this.invalidate();
    }

    /**
     * Set Bar Charts margins
     */
    public void setBarChartMargins(BarChartMargins barChartMargins){
        this.mBarChartMargins = barChartMargins;
    }

    /**
     * Set Bar labels
     */
    public void setBarChartLabels(BarChartLabels barChartLabels){
        this.mBarChartLabels = barChartLabels;
    }

    /**
     *  get Bar chart model
     */
    public BarChartModel getBarChartModel(){
        BarChartModel barChartModel = new BarChartModel(mMoboCanvas,mBarChartMargins,mBarChartLabels,mViewHeight,mViewWidth,mLinePaint);
        return  barChartModel;
    }

    /**
     *  set Axis Line Color ( Paint)
     */
    public void setLinePaint(Paint paint){
        mLinePaint = paint;
    }

    /**
     * To Draw the Bar Chart based on the value provided
     */
    private void drawBarCharts(BarChartModel barChartModel){

        /**
         *  Draw X Axis and Y Axis Line
         */
        DrawLines drawLines = new DrawLines();
        drawLines.drawBarCharLines(barChartModel);

        /**
         * Draw X Axis and Y Axis Labels
         */
        DrawLabels drawLabels = new DrawLabels();
        drawLabels.drawBarChartLabels(barChartModel);

        /**
         * Draw Bars
         */
    }
}
