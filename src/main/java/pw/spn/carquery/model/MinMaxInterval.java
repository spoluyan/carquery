package pw.spn.carquery.model;

public class MinMaxInterval {
    private Integer min;
    private Integer max;

    public static MinMaxInterval of(Integer min, Integer max) {
        return new MinMaxInterval(min, max);
    }

    public MinMaxInterval(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }
}
