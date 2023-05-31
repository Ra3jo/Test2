package com.example.test.CONTROLLER;

import com.example.test.ENTITY.Integration;
import com.example.test.SERVICE.IntegrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/integration")
public class IntegrationController {
    private IntegrationService integrationService;

    public IntegrationController(IntegrationService integrationService) {
        this.integrationService = integrationService;
    }
    // create controller
    @PostMapping
    public ResponseEntity<Integration>createIntegration(@RequestBody Integration integration){
        return new ResponseEntity<>(integrationService.createIntegration(integration), HttpStatus.CREATED);

    }
    // get all controller
    @GetMapping
    public List<Integration>getAllIntegration(){
        return integrationService.getAllIntegration();
    }
    // get controller by id
    @GetMapping("{id}")
    public ResponseEntity<Integration>getIntegrationById(@PathVariable Long id){
        return  new ResponseEntity<>(integrationService.getIntegrationById(id),HttpStatus.OK);
    }
    // update controller
    @PutMapping("{id}")
    public ResponseEntity<Integration>updateIntegration(@PathVariable Long id, @RequestBody Integration integration){
        return  new ResponseEntity<>(integrationService.updateIntegration(id,integration),HttpStatus.OK);
    }
    //delete controller
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteIntegration(@PathVariable Long id){
        integrationService.deleteIntegration(id);
        return new ResponseEntity<>("DeletedSuccessfully",HttpStatus.OK);
    }
}
