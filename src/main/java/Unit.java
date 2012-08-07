package main.java;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/7/12
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Unit {
    M(1000), CM(10), MM(1);

    private int ratio;

    private Unit(int ratio) {
        this.ratio = ratio;
    }

    public int getRatio() {
        return ratio;
    }
}
