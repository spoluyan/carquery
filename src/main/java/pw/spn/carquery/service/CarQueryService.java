package pw.spn.carquery.service;

import java.util.List;

import pw.spn.carquery.model.GetMakesRequest;
import pw.spn.carquery.model.GetModelsRequest;
import pw.spn.carquery.model.Make;
import pw.spn.carquery.model.Model;
import pw.spn.carquery.model.ModelDetails;
import pw.spn.carquery.model.SearchRequest;

public interface CarQueryService {
    List<Integer> getYears();

    List<Make> getMakes(GetMakesRequest request);

    List<Model> getModels(GetModelsRequest request);

    ModelDetails getModelDetails(String modelId);

    List<ModelDetails> search(SearchRequest query);
}
