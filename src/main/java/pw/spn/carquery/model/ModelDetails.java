package pw.spn.carquery.model;

import java.io.Serializable;
import java.util.Arrays;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
        result = prime * result + ((cylinders == null) ? 0 : cylinders.hashCode());
        result = prime * result + ((doors == null) ? 0 : doors.hashCode());
        result = prime * result + ((driveType == null) ? 0 : driveType.hashCode());
        result = prime * result + ((engineBoreMm == null) ? 0 : engineBoreMm.hashCode());
        result = prime * result + ((engineCompression == null) ? 0 : engineCompression.hashCode());
        result = prime * result + ((engineCubicCentimetres == null) ? 0 : engineCubicCentimetres.hashCode());
        result = prime * result + ((engineCubicInches == null) ? 0 : engineCubicInches.hashCode());
        result = prime * result + ((enginePosition == null) ? 0 : enginePosition.hashCode());
        result = prime * result + ((engineStrokeMm == null) ? 0 : engineStrokeMm.hashCode());
        result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
        result = prime * result + ((engineValves == null) ? 0 : engineValves.hashCode());
        result = prime * result + ((engineVolumeLiters == null) ? 0 : engineVolumeLiters.hashCode());
        result = prime * result + Arrays.hashCode(exterierColors);
        result = prime * result + ((fuelCapasityGallons == null) ? 0 : fuelCapasityGallons.hashCode());
        result = prime * result + ((fuelCapasityLiters == null) ? 0 : fuelCapasityLiters.hashCode());
        result = prime * result + ((fuleType == null) ? 0 : fuleType.hashCode());
        result = prime * result + ((heightIn == null) ? 0 : heightIn.hashCode());
        result = prime * result + ((heightMm == null) ? 0 : heightMm.hashCode());
        result = prime * result + Arrays.hashCode(interierColors);
        result = prime * result + ((lengthIn == null) ? 0 : lengthIn.hashCode());
        result = prime * result + ((lengthMm == null) ? 0 : lengthMm.hashCode());
        result = prime * result + ((litersPer100kmCity == null) ? 0 : litersPer100kmCity.hashCode());
        result = prime * result + ((litersPer100kmHighway == null) ? 0 : litersPer100kmHighway.hashCode());
        result = prime * result + ((litersPer100kmMixed == null) ? 0 : litersPer100kmMixed.hashCode());
        result = prime * result + ((makeCountry == null) ? 0 : makeCountry.hashCode());
        result = prime * result + ((makeID == null) ? 0 : makeID.hashCode());
        result = prime * result + ((makeName == null) ? 0 : makeName.hashCode());
        result = prime * result + ((milesPerGallonCity == null) ? 0 : milesPerGallonCity.hashCode());
        result = prime * result + ((milesPerGallonHighway == null) ? 0 : milesPerGallonHighway.hashCode());
        result = prime * result + ((milesPerGallonMixed == null) ? 0 : milesPerGallonMixed.hashCode());
        result = prime * result + ((modelID == null) ? 0 : modelID.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((powerHP == null) ? 0 : powerHP.hashCode());
        result = prime * result + ((powerKW == null) ? 0 : powerKW.hashCode());
        result = prime * result + ((powerPS == null) ? 0 : powerPS.hashCode());
        result = prime * result + ((powerRPM == null) ? 0 : powerRPM.hashCode());
        result = prime * result + ((seats == null) ? 0 : seats.hashCode());
        result = prime * result + (solidInUS ? 1231 : 1237);
        result = prime * result + ((topSpeedKmPH == null) ? 0 : topSpeedKmPH.hashCode());
        result = prime * result + ((topSpeedMPH == null) ? 0 : topSpeedMPH.hashCode());
        result = prime * result + ((torqueKgM == null) ? 0 : torqueKgM.hashCode());
        result = prime * result + ((torqueLbFeet == null) ? 0 : torqueLbFeet.hashCode());
        result = prime * result + ((torqueNm == null) ? 0 : torqueNm.hashCode());
        result = prime * result + ((torqueRPM == null) ? 0 : torqueRPM.hashCode());
        result = prime * result + ((transmissionType == null) ? 0 : transmissionType.hashCode());
        result = prime * result + ((valvesPerCylinder == null) ? 0 : valvesPerCylinder.hashCode());
        result = prime * result + ((weightKg == null) ? 0 : weightKg.hashCode());
        result = prime * result + ((weightLbs == null) ? 0 : weightLbs.hashCode());
        result = prime * result + ((wheelBaseIn == null) ? 0 : wheelBaseIn.hashCode());
        result = prime * result + ((wheelBaseMm == null) ? 0 : wheelBaseMm.hashCode());
        result = prime * result + ((widthIn == null) ? 0 : widthIn.hashCode());
        result = prime * result + ((widthMm == null) ? 0 : widthMm.hashCode());
        result = prime * result + ((year == null) ? 0 : year.hashCode());
        result = prime * result + ((zeroTo100InSeconds == null) ? 0 : zeroTo100InSeconds.hashCode());
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
        if (bodyType != other.bodyType)
            return false;
        if (cylinders == null) {
            if (other.cylinders != null)
                return false;
        } else if (!cylinders.equals(other.cylinders))
            return false;
        if (doors == null) {
            if (other.doors != null)
                return false;
        } else if (!doors.equals(other.doors))
            return false;
        if (driveType != other.driveType)
            return false;
        if (engineBoreMm == null) {
            if (other.engineBoreMm != null)
                return false;
        } else if (!engineBoreMm.equals(other.engineBoreMm))
            return false;
        if (engineCompression == null) {
            if (other.engineCompression != null)
                return false;
        } else if (!engineCompression.equals(other.engineCompression))
            return false;
        if (engineCubicCentimetres == null) {
            if (other.engineCubicCentimetres != null)
                return false;
        } else if (!engineCubicCentimetres.equals(other.engineCubicCentimetres))
            return false;
        if (engineCubicInches == null) {
            if (other.engineCubicInches != null)
                return false;
        } else if (!engineCubicInches.equals(other.engineCubicInches))
            return false;
        if (enginePosition != other.enginePosition)
            return false;
        if (engineStrokeMm == null) {
            if (other.engineStrokeMm != null)
                return false;
        } else if (!engineStrokeMm.equals(other.engineStrokeMm))
            return false;
        if (engineType != other.engineType)
            return false;
        if (engineValves == null) {
            if (other.engineValves != null)
                return false;
        } else if (!engineValves.equals(other.engineValves))
            return false;
        if (engineVolumeLiters == null) {
            if (other.engineVolumeLiters != null)
                return false;
        } else if (!engineVolumeLiters.equals(other.engineVolumeLiters))
            return false;
        if (!Arrays.equals(exterierColors, other.exterierColors))
            return false;
        if (fuelCapasityGallons == null) {
            if (other.fuelCapasityGallons != null)
                return false;
        } else if (!fuelCapasityGallons.equals(other.fuelCapasityGallons))
            return false;
        if (fuelCapasityLiters == null) {
            if (other.fuelCapasityLiters != null)
                return false;
        } else if (!fuelCapasityLiters.equals(other.fuelCapasityLiters))
            return false;
        if (fuleType != other.fuleType)
            return false;
        if (heightIn == null) {
            if (other.heightIn != null)
                return false;
        } else if (!heightIn.equals(other.heightIn))
            return false;
        if (heightMm == null) {
            if (other.heightMm != null)
                return false;
        } else if (!heightMm.equals(other.heightMm))
            return false;
        if (!Arrays.equals(interierColors, other.interierColors))
            return false;
        if (lengthIn == null) {
            if (other.lengthIn != null)
                return false;
        } else if (!lengthIn.equals(other.lengthIn))
            return false;
        if (lengthMm == null) {
            if (other.lengthMm != null)
                return false;
        } else if (!lengthMm.equals(other.lengthMm))
            return false;
        if (litersPer100kmCity == null) {
            if (other.litersPer100kmCity != null)
                return false;
        } else if (!litersPer100kmCity.equals(other.litersPer100kmCity))
            return false;
        if (litersPer100kmHighway == null) {
            if (other.litersPer100kmHighway != null)
                return false;
        } else if (!litersPer100kmHighway.equals(other.litersPer100kmHighway))
            return false;
        if (litersPer100kmMixed == null) {
            if (other.litersPer100kmMixed != null)
                return false;
        } else if (!litersPer100kmMixed.equals(other.litersPer100kmMixed))
            return false;
        if (makeCountry == null) {
            if (other.makeCountry != null)
                return false;
        } else if (!makeCountry.equals(other.makeCountry))
            return false;
        if (makeID == null) {
            if (other.makeID != null)
                return false;
        } else if (!makeID.equals(other.makeID))
            return false;
        if (makeName == null) {
            if (other.makeName != null)
                return false;
        } else if (!makeName.equals(other.makeName))
            return false;
        if (milesPerGallonCity == null) {
            if (other.milesPerGallonCity != null)
                return false;
        } else if (!milesPerGallonCity.equals(other.milesPerGallonCity))
            return false;
        if (milesPerGallonHighway == null) {
            if (other.milesPerGallonHighway != null)
                return false;
        } else if (!milesPerGallonHighway.equals(other.milesPerGallonHighway))
            return false;
        if (milesPerGallonMixed == null) {
            if (other.milesPerGallonMixed != null)
                return false;
        } else if (!milesPerGallonMixed.equals(other.milesPerGallonMixed))
            return false;
        if (modelID == null) {
            if (other.modelID != null)
                return false;
        } else if (!modelID.equals(other.modelID))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (powerHP == null) {
            if (other.powerHP != null)
                return false;
        } else if (!powerHP.equals(other.powerHP))
            return false;
        if (powerKW == null) {
            if (other.powerKW != null)
                return false;
        } else if (!powerKW.equals(other.powerKW))
            return false;
        if (powerPS == null) {
            if (other.powerPS != null)
                return false;
        } else if (!powerPS.equals(other.powerPS))
            return false;
        if (powerRPM == null) {
            if (other.powerRPM != null)
                return false;
        } else if (!powerRPM.equals(other.powerRPM))
            return false;
        if (seats == null) {
            if (other.seats != null)
                return false;
        } else if (!seats.equals(other.seats))
            return false;
        if (solidInUS != other.solidInUS)
            return false;
        if (topSpeedKmPH == null) {
            if (other.topSpeedKmPH != null)
                return false;
        } else if (!topSpeedKmPH.equals(other.topSpeedKmPH))
            return false;
        if (topSpeedMPH == null) {
            if (other.topSpeedMPH != null)
                return false;
        } else if (!topSpeedMPH.equals(other.topSpeedMPH))
            return false;
        if (torqueKgM == null) {
            if (other.torqueKgM != null)
                return false;
        } else if (!torqueKgM.equals(other.torqueKgM))
            return false;
        if (torqueLbFeet == null) {
            if (other.torqueLbFeet != null)
                return false;
        } else if (!torqueLbFeet.equals(other.torqueLbFeet))
            return false;
        if (torqueNm == null) {
            if (other.torqueNm != null)
                return false;
        } else if (!torqueNm.equals(other.torqueNm))
            return false;
        if (torqueRPM == null) {
            if (other.torqueRPM != null)
                return false;
        } else if (!torqueRPM.equals(other.torqueRPM))
            return false;
        if (transmissionType != other.transmissionType)
            return false;
        if (valvesPerCylinder == null) {
            if (other.valvesPerCylinder != null)
                return false;
        } else if (!valvesPerCylinder.equals(other.valvesPerCylinder))
            return false;
        if (weightKg == null) {
            if (other.weightKg != null)
                return false;
        } else if (!weightKg.equals(other.weightKg))
            return false;
        if (weightLbs == null) {
            if (other.weightLbs != null)
                return false;
        } else if (!weightLbs.equals(other.weightLbs))
            return false;
        if (wheelBaseIn == null) {
            if (other.wheelBaseIn != null)
                return false;
        } else if (!wheelBaseIn.equals(other.wheelBaseIn))
            return false;
        if (wheelBaseMm == null) {
            if (other.wheelBaseMm != null)
                return false;
        } else if (!wheelBaseMm.equals(other.wheelBaseMm))
            return false;
        if (widthIn == null) {
            if (other.widthIn != null)
                return false;
        } else if (!widthIn.equals(other.widthIn))
            return false;
        if (widthMm == null) {
            if (other.widthMm != null)
                return false;
        } else if (!widthMm.equals(other.widthMm))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        } else if (!year.equals(other.year))
            return false;
        if (zeroTo100InSeconds == null) {
            if (other.zeroTo100InSeconds != null)
                return false;
        } else if (!zeroTo100InSeconds.equals(other.zeroTo100InSeconds))
            return false;
        return true;
    }
}
