package pw.spn.carquery.service;

import java.util.List;

import org.junit.Test;

public class CarQueryServiceTest {
    private CarQueryService carQueryService = new CarQueryServiceImpl();

    @Test
    public void testGetYears() {
        List<Integer> years = carQueryService.getYears();
    }
}
