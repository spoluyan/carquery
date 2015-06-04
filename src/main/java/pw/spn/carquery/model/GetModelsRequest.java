package pw.spn.carquery.model;


public class GetModelsRequest {
    private Make make;
    private Integer year;
    private boolean solidInUS;
    private BodyType bodyType;

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public static Builder newBuilder() {
        return new GetModelsRequest().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setMake(Make make) {
            GetModelsRequest.this.make = make;
            return this;
        }

        public Builder setYear(Integer year) {
            GetModelsRequest.this.year = year;
            return this;
        }

        public Builder setSolidInUS(boolean solidInUS) {
            GetModelsRequest.this.solidInUS = solidInUS;
            return this;
        }

        public Builder setBodyType(BodyType bodyType) {
            GetModelsRequest.this.bodyType = bodyType;
            return this;
        }

        public GetModelsRequest build() {
            return GetModelsRequest.this;
        }
    }
}
