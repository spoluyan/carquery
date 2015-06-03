package pw.spn.carquery.service;

import java.util.List;

import pw.spn.carquery.model.BodyType;
import pw.spn.carquery.model.Make;
import pw.spn.carquery.model.Model;
import pw.spn.carquery.model.ModelDetails;
import pw.spn.carquery.model.SearchQuery;

public class CarQueryServiceImpl implements CarQueryService {

    public List<Integer> getYears() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Make> getMakes() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Make> getMakes(boolean solidInUS) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Make> getMakes(int year) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Make> getMakes(int year, boolean solidInUS) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Model> getModels(Make make) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Model> getModels(Make make, int year) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Model> getModels(Make make, int year, boolean solidInUS) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Model> getModels(Make make, BodyType body) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Model> getModels(Make make, int year, BodyType body) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Model> getModels(Make make, int year, boolean solidInUS, BodyType body) {
        // TODO Auto-generated method stub
        return null;
    }

    public ModelDetails getModelDetails(String modelId) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<ModelDetails> search(SearchQuery query) {
        // TODO Auto-generated method stub
        return null;
    }

}
