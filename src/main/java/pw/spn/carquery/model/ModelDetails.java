package pw.spn.carquery.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import pw.spn.carquery.json.StringToBodyTypeDeserializer;
import pw.spn.carquery.json.StringToBooleanDeserializer;
import pw.spn.carquery.json.StringToDriveTypeDeserializer;
import pw.spn.carquery.json.StringToEnginePositionDeserializer;
import pw.spn.carquery.json.StringToEngineTypeDeserializer;
import pw.spn.carquery.json.StringToFloatDeserializer;
import pw.spn.carquery.json.StringToFuelTypeDeserializer;
import pw.spn.carquery.json.StringToIntegerDeserializer;
import pw.spn.carquery.json.StringToTransmissionTypeDeserializer;

@JsonIgnoreProperties({ "model_co2", "model_make_display" })
public class ModelDetails implements Serializable {
    private static final long serialVersionUID = 6523783339042442362L;

    @JsonProperty("model_id")
    private String modelID;

    @JsonProperty("model_make_id")
    private String makeID;

    @JsonProperty("model_name")
    private String name;

    @JsonProperty("model_trim")
    private String modelTrim;

    @JsonProperty("model_year")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer year;

    @JsonProperty("model_body")
    @JsonDeserialize(using = StringToBodyTypeDeserializer.class)
    private BodyType bodyType;

    @JsonProperty("model_engine_position")
    @JsonDeserialize(using = StringToEnginePositionDeserializer.class)
    private EnginePosition enginePosition;

    @JsonProperty("model_engine_cc")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer engineCubicCentimetres;

    @JsonProperty("model_engine_ci")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer engineCubicInches;

    @JsonProperty("model_engine_cyl")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer cylinders;

    @JsonProperty("model_engine_type")
    @JsonDeserialize(using = StringToEngineTypeDeserializer.class)
    private EngineType engineType;

    @JsonProperty("model_engine_valves_per_cyl")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer valvesPerCylinder;

    @JsonProperty("model_engine_power_ps")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer powerPS;

    @JsonProperty("model_engine_power_rpm")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer powerRPM;

    @JsonProperty("model_engine_torque_nm")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer torqueNm;

    @JsonProperty("model_engine_torque_rpm")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer torqueRPM;

    @JsonProperty("model_engine_bore_mm")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float engineBoreMm;

    @JsonProperty("model_engine_bore_in")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float engineBoreIn;

    @JsonProperty("model_engine_stroke_mm")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float engineStrokeMm;

    @JsonProperty("model_engine_stroke_in")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float engineStrokeIn;

    @JsonProperty("model_engine_compression")
    private String engineCompression;

    @JsonProperty("model_engine_fuel")
    @JsonDeserialize(using = StringToFuelTypeDeserializer.class)
    private FuelType fuleType;

    @JsonProperty("model_top_speed_kph")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer topSpeedKmPH;

    @JsonProperty("model_top_speed_mph")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer topSpeedMPH;

    @JsonProperty("model_0_to_100_kph")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float zeroTo100InSeconds;

    @JsonProperty("model_drive")
    @JsonDeserialize(using = StringToDriveTypeDeserializer.class)
    private DriveType driveType;

    @JsonProperty("model_transmission_type")
    @JsonDeserialize(using = StringToTransmissionTypeDeserializer.class)
    private TransmissionType transmissionType;

    @JsonProperty("model_seats")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer seats;

    @JsonProperty("model_doors")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer doors;

    @JsonProperty("model_weight_kg")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer weightKg;

    @JsonProperty("model_weight_lbs")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer weightLbs;

    @JsonProperty("model_length_mm")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer lengthMm;

    @JsonProperty("model_length_in")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float lengthIn;

    @JsonProperty("model_width_mm")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer widthMm;

    @JsonProperty("model_width_in")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float widthIn;

    @JsonProperty("model_height_mm")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer heightMm;

    @JsonProperty("model_height_in")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float heightIn;

    @JsonProperty("model_wheelbase_mm")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer wheelBaseMm;

    @JsonProperty("model_wheelbase_in")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float wheelBaseIn;

    @JsonProperty("model_lkm_hwy")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float litersPer100kmHighway;

    @JsonProperty("model_mpg_hwy")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer milesPerGallonHighway;

    @JsonProperty("model_lkm_mixed")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float litersPer100kmMixed;

    @JsonProperty("model_mpg_mixed")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer milesPerGallonMixed;

    @JsonProperty("model_lkm_city")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float litersPer100kmCity;

    @JsonProperty("model_mpg_city")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer milesPerGallonCity;

    @JsonProperty("model_fuel_cap_l")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer fuelCapasityLiters;

    @JsonProperty("model_fuel_cap_g")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float fuelCapasityGallons;

    @JsonProperty("model_sold_in_us")
    @JsonDeserialize(using = StringToBooleanDeserializer.class)
    private boolean solidInUS;

    @JsonProperty("model_engine_l")
    @JsonDeserialize(using = StringToFloatDeserializer.class)
    private Float engineVolumeLiters;

    @JsonProperty("model_engine_valves")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer engineValves;

    @JsonProperty("model_engine_power_hp")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer powerHP;

    @JsonProperty("model_engine_power_kw")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer powerKW;

    @JsonProperty("model_engine_torque_lbft")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer torqueLbFeet;

    @JsonProperty("model_engine_torque_kgm")
    @JsonDeserialize(using = StringToIntegerDeserializer.class)
    private Integer torqueKgM;

    @JsonProperty("make_display")
    private String makeName;

    @JsonProperty("make_country")
    private String makeCountry;

    @JsonProperty("ExtColors")
    private String[] exterierColors;

    @JsonProperty("IntColors")
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

    public String getModelTrim() {
        return modelTrim;
    }

    public void setModelTrim(String modelTrim) {
        this.modelTrim = modelTrim;
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

    public Float getEngineBoreIn() {
        return engineBoreIn;
    }

    public void setEngineBoreIn(Float engineBoreIn) {
        this.engineBoreIn = engineBoreIn;
    }

    public Float getEngineStrokeMm() {
        return engineStrokeMm;
    }

    public void setEngineStrokeMm(Float engineStrokeMm) {
        this.engineStrokeMm = engineStrokeMm;
    }

    public Float getEngineStrokeIn() {
        return engineStrokeIn;
    }

    public void setEngineStrokeIn(Float engineStrokeIn) {
        this.engineStrokeIn = engineStrokeIn;
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

    public Float getWheelBaseIn() {
        return wheelBaseIn;
    }

    public void setWheelBaseIn(Float wheelBaseIn) {
        this.wheelBaseIn = wheelBaseIn;
    }

    public Float getLitersPer100kmHighway() {
        return litersPer100kmHighway;
    }

    public void setLitersPer100kmHighway(Float litersPer100kmHighway) {
        this.litersPer100kmHighway = litersPer100kmHighway;
    }

    public Integer getMilesPerGallonHighway() {
        return milesPerGallonHighway;
    }

    public void setMilesPerGallonHighway(Integer milesPerGallonHighway) {
        this.milesPerGallonHighway = milesPerGallonHighway;
    }

    public Float getLitersPer100kmMixed() {
        return litersPer100kmMixed;
    }

    public void setLitersPer100kmMixed(Float litersPer100kmMixed) {
        this.litersPer100kmMixed = litersPer100kmMixed;
    }

    public Integer getMilesPerGallonMixed() {
        return milesPerGallonMixed;
    }

    public void setMilesPerGallonMixed(Integer milesPerGallonMixed) {
        this.milesPerGallonMixed = milesPerGallonMixed;
    }

    public Float getLitersPer100kmCity() {
        return litersPer100kmCity;
    }

    public void setLitersPer100kmCity(Float litersPer100kmCity) {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modelID == null) ? 0 : modelID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ModelDetails other = (ModelDetails) obj;
        if (modelID == null) {
            if (other.modelID != null)
                return false;
        } else if (!modelID.equals(other.modelID))
            return false;
        return true;
    }
}
