package com.ls.drupalconapp.modelV2.requests;

import com.ls.drupal.AbstractDrupalEntityContainer;
import com.ls.drupal.DrupalClient;
import com.ls.drupalconapp.model.data.POI;
import com.ls.http.base.BaseRequest;

import java.util.Map;

public class PoisRequest extends AbstractDrupalEntityContainer<POI.Holder> {

    public PoisRequest(DrupalClient client) {
        super(client, new POI.Holder());
    }

    @Override
    protected String getPath() {
        return "getPOI";
    }

    @Override
    protected Map<String, String> getItemRequestPostParameters() {
        return null;
    }

    @Override
    protected Map<String, String> getItemRequestGetParameters(BaseRequest.RequestMethod method) {
        return null;
    }
}