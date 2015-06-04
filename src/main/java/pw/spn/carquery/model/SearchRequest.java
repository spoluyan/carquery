package pw.spn.carquery.model;

public class SearchRequest {
    private BodyType bodyType;
    private Integer doors;
    private DriveType driveType;
    private EnginePosition enginePosition;
    private EngineType engineType;
    private FuelType fuelType;
    private boolean fullResults = true;
    private String keyword;
    private String makeID;
    private MinMaxInterval cylinders;
    private MinMaxInterval litersPer100km;
    private MinMaxInterval powerPS;
    private MinMaxInterval topSpeedKmPerH;
    private MinMaxInterval torqueNm;
    private MinMaxInterval weightKg;
    private MinMaxInterval yearInterval;
    private String modelName;
    private Integer numberOfSeats;
    private boolean solidInUS;
    private Integer year;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    public EnginePosition getEnginePosition() {
        return enginePosition;
    }

    public void setEnginePosition(EnginePosition enginePosition) {
        this.enginePosition = enginePosition;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isFullResults() {
        return fullResults;
    }

    public void setFullResults(boolean fullResults) {
        this.fullResults = fullResults;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getMakeID() {
        return makeID;
    }

    public void setMakeID(String makeID) {
        this.makeID = makeID;
    }

    public MinMaxInterval getCylinders() {
        return cylinders;
    }

    public void setCylinders(MinMaxInterval cylinders) {
        this.cylinders = cylinders;
    }

    public MinMaxInterval getLitersPer100km() {
        return litersPer100km;
    }

    public void setLitersPer100km(MinMaxInterval litersPer100km) {
        this.litersPer100km = litersPer100km;
    }

    public MinMaxInterval getPowerPS() {
        return powerPS;
    }

    public void setPowerPS(MinMaxInterval powerPS) {
        this.powerPS = powerPS;
    }

    public MinMaxInterval getTopSpeedKmPerH() {
        return topSpeedKmPerH;
    }

    public void setTopSpeedKmPerH(MinMaxInterval topSpeedKmPerH) {
        this.topSpeedKmPerH = topSpeedKmPerH;
    }

    public MinMaxInterval getTorqueNm() {
        return torqueNm;
    }

    public void setTorqueNm(MinMaxInterval torqueNm) {
        this.torqueNm = torqueNm;
    }

    public MinMaxInterval getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(MinMaxInterval weightKg) {
        this.weightKg = weightKg;
    }

    public MinMaxInterval getYearInterval() {
        return yearInterval;
    }

    public void setYearInterval(MinMaxInterval yearInterval) {
        this.yearInterval = yearInterval;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isSolidInUS() {
        return solidInUS;
    }

    public void setSolidInUS(boolean solidInUS) {
        this.solidInUS = solidInUS;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public static Builder newBuilder() {
        return new SearchRequest().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setBodyType(BodyType bodyType) {
            SearchRequest.this.bodyType = bodyType;
            return this;
        }

        public Builder setDoors(Integer doors) {
            SearchRequest.this.doors = doors;
            return this;
        }

        public Builder setDriveType(DriveType driveType) {
            SearchRequest.this.driveType = driveType;
            return this;
        }

        public Builder setEnginePosition(EnginePosition enginePosition) {
            SearchRequest.this.enginePosition = enginePosition;
            return this;
        }

        public Builder setEngineType(EngineType engineType) {
            SearchRequest.this.engineType = engineType;
            return this;
        }

        public Builder setFuelType(FuelType fuelType) {
            SearchRequest.this.fuelType = fuelType;
            return this;
        }

        public Builder setFullResults(boolean fullResults) {
            SearchRequest.this.fullResults = fullResults;
            return this;
        }

        public Builder setKeyword(String keyword) {
            SearchRequest.this.keyword = keyword;
            return this;
        }

        public Builder setMakeID(String makeID) {
            SearchRequest.this.makeID = makeID;
            return this;
        }

        public Builder setCylinders(MinMaxInterval cylinders) {
            SearchRequest.this.cylinders = cylinders;
            return this;
        }

        public Builder setLitersPer100km(MinMaxInterval litersPer100km) {
            SearchRequest.this.litersPer100km = litersPer100km;
            return this;
        }

        public Builder setPowerPS(MinMaxInterval powerPS) {
            SearchRequest.this.powerPS = powerPS;
            return this;
        }

        public Builder setTopSpeedKmPerH(MinMaxInterval topSpeedKmPerH) {
            SearchRequest.this.topSpeedKmPerH = topSpeedKmPerH;
            return this;
        }

        public Builder setTorqueNm(MinMaxInterval torqueNm) {
            SearchRequest.this.torqueNm = torqueNm;
            return this;
        }

        public Builder setWeightKg(MinMaxInterval weightKg) {
            SearchRequest.this.weightKg = weightKg;
            return this;
        }

        public Builder setYearInterval(MinMaxInterval yearInterval) {
            SearchRequest.this.yearInterval = yearInterval;
            return this;
        }

        public Builder setModelName(String modelName) {
            SearchRequest.this.modelName = modelName;
            return this;
        }

        public Builder setNumberOfSeats(Integer numberOfSeats) {
            SearchRequest.this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder setSolidInUS(boolean solidInUS) {
            SearchRequest.this.solidInUS = solidInUS;
            return this;
        }

        public Builder setYear(Integer year) {
            SearchRequest.this.year = year;
            return this;
        }

        public SearchRequest build() {
            return SearchRequest.this;
        }
    }
}
