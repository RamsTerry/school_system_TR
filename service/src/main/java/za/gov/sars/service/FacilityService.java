/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.gov.sars.domain.Facility;
import za.gov.sars.persistence.FacilityRepository;

/**
 *
 * @author S2028398
 */
@Service
public class FacilityService implements FacilityServiceLocal{
    
    @Autowired
    private FacilityRepository facilityRepository;

    @Override
    public Facility save(Facility facility) {
        return facilityRepository.save(facility);
    }

    @Override
    public Facility findById(Long id) {
        return facilityRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("The requested id [" + id + "] does not exist."));
    }

    @Override
    public Facility update(Facility facility) {
         return facilityRepository.save(facility);
    }

    @Override
    public void deleteAll() {
        facilityRepository.deleteAll();
    }

    @Override
    public Facility deleteById(Long id) {
              Facility faci = findById(id);
        if(faci != null){
            facilityRepository.deleteById(id);
        }
        return faci;
    }

 
    @Override
    public List<Facility> findFacilityByFacilityNum(String FacilityNum) {
        return facilityRepository.findAll();
    }

    @Override
    public List<Facility> listAll() {
        return facilityRepository.findAll();
    }

    @Override
    public boolean isExist(Facility facility) {
       return facilityRepository.findById(facility.getId()) != null;
    }

    @Override
    public long count() {
        return facilityRepository.count();
    }

    
}
