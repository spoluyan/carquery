package pw.spn.carquery.model;

public class GetMakesRequest {
    private Integer year;
    private boolean solidInUS;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public boolean isSolidInUS() {
        return solidInUS;
    }

    public void setSolidInUS(boolean solidInUS) {
        this.solidInUS = solidInUS;
    }

    public static Builder newBuilder() {
        return new GetMakesRequest().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setYear(Integer year) {
            GetMakesRequest.this.year = year;
            return this;
        }

        public Builder setSolidInUS(boolean solidInUS) {
            GetMakesRequest.this.solidInUS = solidInUS;
            return this;
        }

        public GetMakesRequest build() {
            return GetMakesRequest.this;
        }
    }
}
