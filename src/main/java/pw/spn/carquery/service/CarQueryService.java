package pw.spn.carquery.service;

import java.util.List;

import pw.spn.carquery.model.BodyType;
import pw.spn.carquery.model.Make;
import pw.spn.carquery.model.Model;
import pw.spn.carquery.model.ModelDetails;
import pw.spn.carquery.model.SearchQuery;

public interface CarQueryService {
    List<Integer> getYears();

    List<Make> getMakes();

    List<Make> getMakes(boolean solidInUS);

    List<Make> getMakes(int year);

    List<Make> getMakes(int year, boolean solidInUS);

    List<Model> getModels(Make make);

    List<Model> getModels(Make make, int year);

    List<Model> getModels(Make make, int year, boolean solidInUS);

    List<Model> getModels(Make make, BodyType body);

    List<Model> getModels(Make make, int year, BodyType body);

    List<Model> getModels(Make make, int year, boolean solidInUS, BodyType body);

    ModelDetails getModelDetails(String modelId);

    List<ModelDetails> search(SearchQuery query);
}
