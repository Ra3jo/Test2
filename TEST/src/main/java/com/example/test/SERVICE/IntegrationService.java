package com.example.test.SERVICE;

import com.example.test.ENTITY.Integration;

import java.util.List;

public interface IntegrationService {
    // create integration
    Integration createIntegration(Integration integration);
    // get all integration
    List<Integration>getAllIntegration();
    // get by id
    Integration getIntegrationById(Long id);
    // update Integration
    Integration updateIntegration(Long id, Integration integration);
    // delete integration
    void deleteIntegration(Long id);
}
