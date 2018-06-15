package mobostatics.barcharts.simplebarchart.utils;

import mobostatics.barcharts.simplebarchart.models.BarChartModel;

/**
 *  <p>
 *      This class sets the margin parameters for
 *      all the labels and titles
 *  </p>
 *  @author Teju_Vishwakarma
 */
public class BarChartMargins {

   private long barMargin;
   private long firstBarMargin;
   private long xAxisLabelMargin;
   private long yAxisLabelMargin;
   private long xAxisTitleMargin;
   private long yAxisTitleMargin;
   private long graphNameMargin;

    public long getXAxisLineMargin() {
        return xAxisLineMargin;
    }

    public void setXAxisLineMargin(long xAxisLineMargin) {
        this.xAxisLineMargin = xAxisLineMargin;
    }

    public long getYAxisLineMargin() {
        return yAxisLineMargin;
    }

    public void setYAxisLineMargin(long yAxisLineMargin) {
        this.yAxisLineMargin = yAxisLineMargin;
    }

    private long xAxisLineMargin;
   private long yAxisLineMargin;

    public BarChartMargins(){

        barMargin = BarChartConstants.BAR_MARGIN;
        firstBarMargin = BarChartConstants.FIRST_BAR_MARGIN;
        xAxisLabelMargin = BarChartConstants.X_AXIS_LABEL_MARGIN;
        yAxisLabelMargin = BarChartConstants.Y_AXIS_LABEL_MARGIN;
        xAxisTitleMargin = BarChartConstants.X_AXIS_TITLE_MARGIN;
        yAxisTitleMargin = BarChartConstants.Y_AXIS_TITLE_MARGIN;
        graphNameMargin = BarChartConstants.GRAPH_NAME_MARGIN;
        xAxisLineMargin = BarChartConstants.X_AXIS_LINE_MARGIN;
        yAxisLineMargin = BarChartConstants.Y_AXIS_LINE_MARGIN;

    }
    public long getBarMargin() {
        return barMargin;
    }

    public void setBarMargin(long barMargin) {
        this.barMargin = barMargin;
    }

    public long getFirstBarMargin() {
        return firstBarMargin;
    }

    public void setFirstBarMargin(long firstBarMargin) {
        this.firstBarMargin = firstBarMargin;
    }

    public long getXAxisLabelMargin() {
        return xAxisLabelMargin;
    }

    public void setXAxisLabelMargin(long xAxisLabelMargin) {
        this.xAxisLabelMargin = xAxisLabelMargin;
    }

    public long getYAxisLabelMargin() {
        return yAxisLabelMargin;
    }

    public void setYAxisLabelMargin(long yAxisLabelMargin) {
        this.yAxisLabelMargin = yAxisLabelMargin;
    }

    public long getXAxisTitleMargin() {
        return xAxisTitleMargin;
    }

    public void setXAxisTitleMargin(long xAxisTitleMargin) {
        this.xAxisTitleMargin = xAxisTitleMargin;
    }

    public long getYAxisTitleMargin() {
        return yAxisTitleMargin;
    }

    public void setYAxisTitleMargin(long yAxisTitleMargin) {
        this.yAxisTitleMargin = yAxisTitleMargin;
    }

    public long getGraphNameMargin() {
        return graphNameMargin;
    }

    public void setGraphNameMargin(long graphName) {
        this.graphNameMargin = graphName;
    }
}
