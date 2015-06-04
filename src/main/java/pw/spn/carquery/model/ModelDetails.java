package pw.spn.carquery.model;

import java.io.Serializable;

public class ModelDetails implements Serializable {
    private static final long serialVersionUID = 6523783339042442362L;

    private String modelID;
    private String makeID;
    private String name;
    private Integer year;
    private BodyType bodyType;
    private EnginePosition enginePosition;
    private Integer engineCubicCentimetres;
    private Integer engineCubicInches;
    private Integer cylinders;
    private EngineType engineType;
    private Integer valvesPerCylinder;
    private Integer powerPS;
    private Integer powerRPM;
    private Integer torqueNm;
    private Integer torqueRPM;
    private Float engineBoreMm;
    private Float engineStrokeMm;
    private String engineCompression;
    private FuelType fuleType;
    private Integer topSpeedKmPH;
    private Integer topSpeedMPH;
    private Float zeroTo100InSeconds;
    private DriveType driveType;
    private TransmissionType transmissionType;
    private Integer seats;
    private Integer doors;
    private Integer weightKg;
    private Integer weightLbs;
    private Integer lengthMm;
    private Float lengthIn;
    private Integer widthMm;
    private Float widthIn;
    private Integer heightMm;
    private Float heightIn;
    private Integer wheelBaseMm;
    private Integer wheelBaseIn;
    private Integer litersPer100kmHighway;
    private Integer milesPerGallonHighway;
    private Integer litersPer100kmMixed;
    private Integer milesPerGallonMixed;
    private Integer litersPer100kmCity;
    private Integer milesPerGallonCity;
    private Integer fuelCapasityLiters;
    private Float fuelCapasityGallons;
    private boolean solidInUS;
    private Float engineVolumeLiters;
    private Integer engineValves;
    private Integer powerHP;
    private Integer powerKW;
    private Integer torqueLbFeet;
    private Integer torqueKgM;
    private String makeName;
    private String makeCountry;
    private String[] exterierColors;
    private String[] interierColors;

    public String getModelID() {
        return modelID;
    }

    public void setModelID(String modelID) {
        this.modelID = modelID;
    }

    public String getMakeID() {
        return makeID;
    }

    public void setMakeID(String makeID) {
        this.makeID = makeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public EnginePosition getEnginePosition() {
        return enginePosition;
    }

    public void setEnginePosition(EnginePosition enginePosition) {
        this.enginePosition = enginePosition;
    }

    public Integer getEngineCubicCentimetres() {
        return engineCubicCentimetres;
    }

    public void setEngineCubicCentimetres(Integer engineCubicCentimetres) {
        this.engineCubicCentimetres = engineCubicCentimetres;
    }

    public Integer getEngineCubicInches() {
        return engineCubicInches;
    }

    public void setEngineCubicInches(Integer engineCubicInches) {
        this.engineCubicInches = engineCubicInches;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Integer getValvesPerCylinder() {
        return valvesPerCylinder;
    }

    public void setValvesPerCylinder(Integer valvesPerCylinder) {
        this.valvesPerCylinder = valvesPerCylinder;
    }

    public Integer getPowerPS() {
        return powerPS;
    }

    public void setPowerPS(Integer powerPS) {
        this.powerPS = powerPS;
    }

    public Integer getPowerRPM() {
        return powerRPM;
    }

    public void setPowerRPM(Integer powerRPM) {
        this.powerRPM = powerRPM;
    }

    public Integer getTorqueNm() {
        return torqueNm;
    }

    public void setTorqueNm(Integer torqueNm) {
        this.torqueNm = torqueNm;
    }

    public Integer getTorqueRPM() {
        return torqueRPM;
    }

    public void setTorqueRPM(Integer torqueRPM) {
        this.torqueRPM = torqueRPM;
    }

    public Float getEngineBoreMm() {
        return engineBoreMm;
    }

    public void setEngineBoreMm(Float engineBoreMm) {
        this.engineBoreMm = engineBoreMm;
    }

    public Float getEngineStrokeMm() {
        return engineStrokeMm;
    }

    public void setEngineStrokeMm(Float engineStrokeMm) {
        this.engineStrokeMm = engineStrokeMm;
    }

    public String getEngineCompression() {
        return engineCompression;
    }

    public void setEngineCompression(String engineCompression) {
        this.engineCompression = engineCompression;
    }

    public FuelType getFuleType() {
        return fuleType;
    }

    public void setFuleType(FuelType fuleType) {
        this.fuleType = fuleType;
    }

    public Integer getTopSpeedKmPH() {
        return topSpeedKmPH;
    }

    public void setTopSpeedKmPH(Integer topSpeedKmPH) {
        this.topSpeedKmPH = topSpeedKmPH;
    }

    public Integer getTopSpeedMPH() {
        return topSpeedMPH;
    }

    public void setTopSpeedMPH(Integer topSpeedMPH) {
        this.topSpeedMPH = topSpeedMPH;
    }

    public Float getZeroTo100InSeconds() {
        return zeroTo100InSeconds;
    }

    public void setZeroTo100InSeconds(Float zeroTo100InSeconds) {
        this.zeroTo100InSeconds = zeroTo100InSeconds;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Integer weightKg) {
        this.weightKg = weightKg;
    }

    public Integer getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(Integer weightLbs) {
        this.weightLbs = weightLbs;
    }

    public Integer getLengthMm() {
        return lengthMm;
    }

    public void setLengthMm(Integer lengthMm) {
        this.lengthMm = lengthMm;
    }

    public Float getLengthIn() {
        return lengthIn;
    }

    public void setLengthIn(Float lengthIn) {
        this.lengthIn = lengthIn;
    }

    public Integer getWidthMm() {
        return widthMm;
    }

    public void setWidthMm(Integer widthMm) {
        this.widthMm = widthMm;
    }

    public Float getWidthIn() {
        return widthIn;
    }

    public void setWidthIn(Float widthIn) {
        this.widthIn = widthIn;
    }

    public Integer getHeightMm() {
        return heightMm;
    }

    public void setHeightMm(Integer heightMm) {
        this.heightMm = heightMm;
    }

    public Float getHeightIn() {
        return heightIn;
    }

    public void setHeightIn(Float heightIn) {
        this.heightIn = heightIn;
    }

    public Integer getWheelBaseMm() {
        return wheelBaseMm;
    }

    public void setWheelBaseMm(Integer wheelBaseMm) {
        this.wheelBaseMm = wheelBaseMm;
    }

    public Integer getWheelBaseIn() {
        return wheelBaseIn;
    }

    public void setWheelBaseIn(Integer wheelBaseIn) {
        this.wheelBaseIn = wheelBaseIn;
    }

    public Integer getLitersPer100kmHighway() {
        return litersPer100kmHighway;
    }

    public void setLitersPer100kmHighway(Integer litersPer100kmHighway) {
        this.litersPer100kmHighway = litersPer100kmHighway;
    }

    public Integer getMilesPerGallonHighway() {
        return milesPerGallonHighway;
    }

    public void setMilesPerGallonHighway(Integer milesPerGallonHighway) {
        this.milesPerGallonHighway = milesPerGallonHighway;
    }

    public Integer getLitersPer100kmMixed() {
        return litersPer100kmMixed;
    }

    public void setLitersPer100kmMixed(Integer litersPer100kmMixed) {
        this.litersPer100kmMixed = litersPer100kmMixed;
    }

    public Integer getMilesPerGallonMixed() {
        return milesPerGallonMixed;
    }

    public void setMilesPerGallonMixed(Integer milesPerGallonMixed) {
        this.milesPerGallonMixed = milesPerGallonMixed;
    }

    public Integer getLitersPer100kmCity() {
        return litersPer100kmCity;
    }

    public void setLitersPer100kmCity(Integer litersPer100kmCity) {
        this.litersPer100kmCity = litersPer100kmCity;
    }

    public Integer getMilesPerGallonCity() {
        return milesPerGallonCity;
    }

    public void setMilesPerGallonCity(Integer milesPerGallonCity) {
        this.milesPerGallonCity = milesPerGallonCity;
    }

    public Integer getFuelCapasityLiters() {
        return fuelCapasityLiters;
    }

    public void setFuelCapasityLiters(Integer fuelCapasityLiters) {
        this.fuelCapasityLiters = fuelCapasityLiters;
    }

    public Float getFuelCapasityGallons() {
        return fuelCapasityGallons;
    }

    public void setFuelCapasityGallons(Float fuelCapasityGallons) {
        this.fuelCapasityGallons = fuelCapasityGallons;
    }

    public boolean isSolidInUS() {
        return solidInUS;
    }

    public void setSolidInUS(boolean solidInUS) {
        this.solidInUS = solidInUS;
    }

    public Float getEngineVolumeLiters() {
        return engineVolumeLiters;
    }

    public void setEngineVolumeLiters(Float engineVolumeLiters) {
        this.engineVolumeLiters = engineVolumeLiters;
    }

    public Integer getEngineValves() {
        return engineValves;
    }

    public void setEngineValves(Integer engineValves) {
        this.engineValves = engineValves;
    }

    public Integer getPowerHP() {
        return powerHP;
    }

    public void setPowerHP(Integer powerHP) {
        this.powerHP = powerHP;
    }

    public Integer getPowerKW() {
        return powerKW;
    }

    public void setPowerKW(Integer powerKW) {
        this.powerKW = powerKW;
    }

    public Integer getTorqueLbFeet() {
        return torqueLbFeet;
    }

    public void setTorqueLbFeet(Integer torqueLbFeet) {
        this.torqueLbFeet = torqueLbFeet;
    }

    public Integer getTorqueKgM() {
        return torqueKgM;
    }

    public void setTorqueKgM(Integer torqueKgM) {
        this.torqueKgM = torqueKgM;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public String getMakeCountry() {
        return makeCountry;
    }

    public void setMakeCountry(String makeCountry) {
        this.makeCountry = makeCountry;
    }

    public String[] getExterierColors() {
        return exterierColors;
    }

    public void setExterierColors(String[] exterierColors) {
        this.exterierColors = exterierColors;
    }

    public String[] getInterierColors() {
        return interierColors;
    }

    public void setInterierColors(String[] interierColors) {
        this.interierColors = interierColors;
    }
}
