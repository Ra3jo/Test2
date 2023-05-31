package com.example.test.SERVICE;

import com.example.test.ENTITY.Integration;
import com.example.test.EXCEPTION.ResourceNotFoundException;
import com.example.test.REPOSITORYY.IntegrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntegrationServiceImpl implements IntegrationService{
    private IntegrationRepository integrationRepository;

    public IntegrationServiceImpl(IntegrationRepository integrationRepository) {
        this.integrationRepository = integrationRepository;
    }
// create Service impl
    @Override
    public Integration createIntegration(Integration integration) {
        return integrationRepository.save(integration);
    }
//  get all service
    @Override
    public List<Integration> getAllIntegration() {
        return integrationRepository.findAll();
    }
    // get service by id

    @Override
    public Integration getIntegrationById(Long id) {
        Integration integration=integrationRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("NotFound"));
        return integration;
    }
//  update service impl
    @Override
    public Integration updateIntegration(Long id, Integration integration) {
        Integration existingIntegration=integrationRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("NotFound"));
        existingIntegration.setProduct(integration.getProduct());
        existingIntegration.setLocation(integration.getLocation());
        existingIntegration.setAddress(integration.getAddress());
        Integration updateIntegration=integrationRepository.save(existingIntegration);
        return updateIntegration;
    }
    // delete service impl


    @Override
    public void deleteIntegration(Long id) {
        Integration deleteIntegration=integrationRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("NotFound"));
integrationRepository.delete(deleteIntegration);
    }
}
