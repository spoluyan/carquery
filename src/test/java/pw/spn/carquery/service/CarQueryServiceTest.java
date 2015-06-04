package pw.spn.carquery.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import pw.spn.carquery.model.BodyType;
import pw.spn.carquery.model.DriveType;
import pw.spn.carquery.model.EnginePosition;
import pw.spn.carquery.model.EngineType;
import pw.spn.carquery.model.FuelType;
import pw.spn.carquery.model.GetMakesRequest;
import pw.spn.carquery.model.GetModelsRequest;
import pw.spn.carquery.model.Make;
import pw.spn.carquery.model.Model;
import pw.spn.carquery.model.ModelDetails;
import pw.spn.carquery.model.SearchRequest;
import pw.spn.carquery.model.TransmissionType;

public class CarQueryServiceTest {
    private static final int TEST_YEAR = 2000;
    private static final Make TEST_MAKE = createTestMake();
    private static final Model TEST_MODEL = createTestModel();
    private static final BodyType TEST_BODY_TYPE = BodyType.SUV;
    private static final String TEST_MODEL_ID = "11459";
    private static final String TEST_INVALID_MODEL_ID = "-1";
    private static final ModelDetails TEST_MODEL_DETAILS = createTestModelDetails();
    private static final SearchRequest TEST_SEARCH_REQUEST = createTestSearchRequest();

    private static Make createTestMake() {
        Make make = new Make();
        make.setId("ford");
        make.setDisplayName("Ford");
        make.setCountry("USA");
        return make;
    }

    private static SearchRequest createTestSearchRequest() {
        return SearchRequest.newBuilder().setModelName(TEST_MODEL.getName()).setYear(TEST_YEAR)
                .setMakeID(TEST_MAKE.getId()).build();
    }

    private static ModelDetails createTestModelDetails() {
        ModelDetails details = new ModelDetails();
        details.setModelID(TEST_MODEL_ID);
        details.setMakeID("dodge");
        details.setName("Viper");
        details.setModelTrim("SRT-10");
        details.setYear(2009);
        details.setBodyType(BodyType.ROADSTER);
        details.setEnginePosition(EnginePosition.FRONT);
        details.setEngineCubicCentimetres(8285);
        details.setCylinders(10);
        details.setEngineType(EngineType.V);
        details.setValvesPerCylinder(2);
        details.setPowerPS(506);
        details.setPowerRPM(5600);
        details.setTorqueNm(711);
        details.setTorqueRPM(4200);
        details.setEngineBoreMm(102.4f);
        details.setEngineBoreIn(4.03f);
        details.setEngineStrokeMm(100.6f);
        details.setEngineStrokeIn(3.96f);
        details.setEngineCompression("10.0:1");
        details.setFuleType(FuelType.GASOLINE);
        details.setTopSpeedKmPH(314);
        details.setZeroTo100InSeconds(3.9f);
        details.setDriveType(DriveType.REAR);
        details.setTransmissionType(TransmissionType.MANUAL);
        details.setSeats(2);
        details.setDoors(2);
        details.setWeightKg(1602);
        details.setLengthMm(4470);
        details.setWidthMm(1950);
        details.setHeightMm(1220);
        details.setWheelBaseMm(2520);
        details.setLitersPer100kmHighway(11);
        details.setLitersPer100kmMixed(21);
        details.setLitersPer100kmCity(18);
        details.setFuelCapasityLiters(70);
        details.setSolidInUS(true);
        details.setEngineVolumeLiters(8.3f);
        details.setEngineCubicInches(506);
        details.setEngineValves(20);
        details.setPowerHP(499);
        details.setPowerKW(372);
        details.setTorqueLbFeet(524);
        details.setTorqueKgM(73);
        details.setTopSpeedMPH(195);
        details.setWeightLbs(3532);
        details.setLengthIn(176.0f);
        details.setWidthIn(76.8f);
        details.setHeightIn(48.0f);
        details.setWheelBaseIn(99.2f);
        details.setMilesPerGallonHighway(21);
        details.setMilesPerGallonCity(13);
        details.setMilesPerGallonMixed(11);
        details.setFuelCapasityGallons(18.5f);
        details.setMakeName("Dodge");
        details.setMakeCountry("USA");
        details.setExterierColors(new String[] {});
        details.setInterierColors(new String[] {});
        return details;
    }

    private static Model createTestModel() {
        Model model = new Model();
        model.setMakeID("ford");
        model.setName("Escape");
        return model;
    }

    private CarQueryService carQueryService = new CarQueryServiceImpl();

    @Test
    public void testGetYears() {
        List<Integer> years = carQueryService.getYears();
        Assert.assertNotNull(years);
        Assert.assertTrue(years.size() > 0);
    }

    @Test
    public void testGetMakes() {
        List<Make> allMakes = carQueryService.getMakes(GetMakesRequest.newBuilder().build());
        List<Make> makesByYear = carQueryService.getMakes(GetMakesRequest.newBuilder().setYear(TEST_YEAR).build());
        List<Make> makesSolidToUS = carQueryService.getMakes(GetMakesRequest.newBuilder().setSolidInUS(true).build());
        List<Make> makesSolidToUSByYear = carQueryService.getMakes(GetMakesRequest.newBuilder().setYear(TEST_YEAR)
                .setSolidInUS(true).build());

        Assert.assertNotNull(allMakes);
        Assert.assertTrue(allMakes.size() > 0);

        Assert.assertNotNull(makesByYear);
        Assert.assertTrue(makesByYear.size() > 0);
        Assert.assertNotEquals(allMakes.size(), makesByYear.size());

        Assert.assertNotNull(makesSolidToUS);
        Assert.assertTrue(makesSolidToUS.size() > 0);
        Assert.assertNotEquals(allMakes.size(), makesSolidToUS.size());

        Assert.assertNotNull(makesSolidToUSByYear);
        Assert.assertTrue(makesSolidToUSByYear.size() > 0);
        Assert.assertNotEquals(makesSolidToUS.size(), makesSolidToUSByYear.size());
    }

    @Test
    public void testGetModels() {
        List<Model> noModels = carQueryService.getModels(GetModelsRequest.newBuilder().build());
        List<Model> allModels = carQueryService.getModels(GetModelsRequest.newBuilder().setMake(TEST_MAKE).build());
        List<Model> modelsByYear = carQueryService.getModels(GetModelsRequest.newBuilder().setMake(TEST_MAKE)
                .setYear(TEST_YEAR).build());
        List<Model> modelsSolidToUS = carQueryService.getModels(GetModelsRequest.newBuilder().setMake(TEST_MAKE)
                .setSolidInUS(true).build());
        List<Model> modelsByType = carQueryService.getModels(GetModelsRequest.newBuilder().setMake(TEST_MAKE)
                .setBodyType(TEST_BODY_TYPE).build());
        List<Model> modelsByYearSolidToUS = carQueryService.getModels(GetModelsRequest.newBuilder().setMake(TEST_MAKE)
                .setYear(TEST_YEAR).setSolidInUS(true).build());
        List<Model> modelsByYearByType = carQueryService.getModels(GetModelsRequest.newBuilder().setMake(TEST_MAKE)
                .setYear(TEST_YEAR).setBodyType(TEST_BODY_TYPE).build());
        List<Model> modelsSolidToUSByType = carQueryService.getModels(GetModelsRequest.newBuilder().setMake(TEST_MAKE)
                .setSolidInUS(true).setBodyType(TEST_BODY_TYPE).build());
        List<Model> modelsByYearSolidToUSByType = carQueryService.getModels(GetModelsRequest.newBuilder()
                .setMake(TEST_MAKE).setYear(TEST_YEAR).setSolidInUS(true).setBodyType(TEST_BODY_TYPE).build());

        Assert.assertNotNull(noModels);
        Assert.assertEquals(0, noModels.size());

        Assert.assertNotNull(allModels);
        Assert.assertTrue(allModels.size() > 0);
        Assert.assertTrue(allModels.contains(TEST_MODEL));

        Assert.assertNotNull(modelsByYear);
        Assert.assertTrue(modelsByYear.size() > 0);
        Assert.assertTrue(modelsByYear.contains(TEST_MODEL));
        Assert.assertNotEquals(allModels.size(), modelsByYear.size());

        Assert.assertNotNull(modelsSolidToUS);
        Assert.assertTrue(modelsSolidToUS.size() > 0);
        Assert.assertTrue(modelsSolidToUS.contains(TEST_MODEL));
        Assert.assertNotEquals(allModels.size(), modelsSolidToUS.size());

        Assert.assertNotNull(modelsByType);
        Assert.assertTrue(modelsByType.size() > 0);
        Assert.assertTrue(modelsByType.contains(TEST_MODEL));
        Assert.assertNotEquals(allModels.size(), modelsByType.size());

        Assert.assertNotNull(modelsByYearSolidToUS);
        Assert.assertTrue(modelsByYearSolidToUS.size() > 0);
        Assert.assertTrue(modelsByYearSolidToUS.contains(TEST_MODEL));

        Assert.assertNotNull(modelsByYearByType);
        Assert.assertTrue(modelsByYearByType.size() > 0);
        Assert.assertTrue(modelsByYearByType.contains(TEST_MODEL));

        Assert.assertNotNull(modelsSolidToUSByType);
        Assert.assertTrue(modelsSolidToUSByType.size() > 0);
        Assert.assertTrue(modelsSolidToUSByType.contains(TEST_MODEL));

        Assert.assertNotNull(modelsByYearSolidToUSByType);
        Assert.assertTrue(modelsByYearSolidToUSByType.size() > 0);
        Assert.assertTrue(modelsByYearSolidToUSByType.contains(TEST_MODEL));
    }

    @Test
    public void testGetModelDetails() {
        ModelDetails noDetails = carQueryService.getModelDetails(null);
        Assert.assertNull(noDetails);

        noDetails = carQueryService.getModelDetails(TEST_INVALID_MODEL_ID);
        Assert.assertNotNull(noDetails);
        Assert.assertNull(noDetails.getModelID());

        ModelDetails details = carQueryService.getModelDetails(TEST_MODEL_ID);
        Assert.assertNotNull(details);
        Assert.assertTrue(TEST_MODEL_DETAILS.equals(details));
    }

    @Test
    public void testSearch() {
        List<ModelDetails> noResults = carQueryService.search(SearchRequest.newBuilder().build());

        List<ModelDetails> results = carQueryService.search(TEST_SEARCH_REQUEST);

        Assert.assertNotNull(noResults);
        Assert.assertEquals(0, noResults.size());

        Assert.assertNotNull(results);
        Assert.assertTrue(results.size() > 0);
        Assert.assertTrue(results.contains(TEST_MODEL_DETAILS));
    }
}
