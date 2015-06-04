package pw.spn.carquery.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import pw.spn.carquery.model.BodyType;
import pw.spn.carquery.model.GetMakesRequest;
import pw.spn.carquery.model.GetModelsRequest;
import pw.spn.carquery.model.Make;
import pw.spn.carquery.model.Model;
import pw.spn.carquery.model.ModelDetails;
import pw.spn.carquery.model.SearchRequest;

public class CarQueryServiceTest {
    private static final int TEST_YEAR = 2000;
    private static final Make TEST_MAKE = createTestMake();
    private static final Model TEST_MODEL = createTestModel();
    private static final BodyType TEST_BODY_TYPE = BodyType.SUV;
    private static final String TEST_MODEL_ID = "11459";
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
        // TODO add other fields
        details.setModelID(TEST_MODEL_ID);
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
        ModelDetails details = carQueryService.getModelDetails(TEST_MODEL_ID);
        Assert.assertNotNull(details);
        Assert.assertEquals(TEST_MODEL_DETAILS, details);
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
