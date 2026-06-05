package com.loose.coupling;

public class webserviceprovider implements UserDataProvider {
    @Override
    public String getDetails() {
        return "Fetched details from webservice";
    }
}
