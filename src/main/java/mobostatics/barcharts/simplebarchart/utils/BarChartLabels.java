package mobostatics.barcharts.simplebarchart.utils;

/**
 * <p>
 *    This class sets the label for Bar chart
 * </p>
 *
 * @author Teju_Vishwamara
 */
public class BarChartLabels {

    private String graphName;
    private String xAxisTitle;
    private String yAxisTitle;

    public BarChartLabels(){
        graphName = BarChartConstants.DEFAULT_GRAPH_NAME;
        xAxisTitle = BarChartConstants.DEFAULT_X_AXIS_TITLE;
        yAxisTitle = BarChartConstants.DEFAULT_Y_AXIS_TITLE;

    }
    public String getGraphName() {
        return graphName;
    }

    public void setGraphName(String graphName) {
        this.graphName = graphName;
    }

    public String getXAxisTitle() {
        return xAxisTitle;
    }

    public void setXAxisTitle(String xAxisTitle) {
        this.xAxisTitle = xAxisTitle;
    }

    public String getYAxisTitle() {
        return yAxisTitle;
    }

    public void setYAxisTitle(String yAxisTitle) {
        this.yAxisTitle = yAxisTitle;
    }
}
