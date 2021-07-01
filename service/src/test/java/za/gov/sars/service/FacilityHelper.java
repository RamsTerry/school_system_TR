/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.service;

import java.util.Date;
import za.gov.sars.domain.Facility;
import za.gov.sars.persistence.FacilityRepository;

/**
 *
 * @author S2028398
 */
public class FacilityHelper {

    public static void addFacility(FacilityRepository facilityRepository) {

        Facility facility1 = new Facility();
        facility1.setCreatedBy("Test");
        facility1.setCreatedDate(new Date());
        facility1.setName("Staff Room");
        facility1.setLocation("Admin Block Section C");
        facilityRepository.save(facility1);

        Facility facility2 = new Facility();
        facility2.setCreatedBy("Test");
        facility2.setCreatedDate(new Date());
        facility2.setName("Class Room");
        facility2.setLocation("Class Block B");
        facilityRepository.save(facility2);

        Facility facility3 = new Facility();
        facility3.setCreatedBy("Test");
        facility3.setCreatedDate(new Date());
        facility3.setName("Class Room");
        facility3.setLocation("Class Block A");
        facilityRepository.save(facility3);

        Facility facility4 = new Facility();
        facility4.setCreatedBy("Test");
        facility4.setCreatedDate(new Date());
        facility4.setName("Conference Hall");
        facility4.setLocation("Class Block C");
        facilityRepository.save(facility4);

        Facility facility5 = new Facility();
        facility5.setCreatedBy("Test");
        facility5.setCreatedDate(new Date());
        facility5.setName("Class Room");
        facility5.setLocation("Class Block B");
        facilityRepository.save(facility5);

        Facility facility6 = new Facility();
        facility6.setCreatedBy("Test");
        facility6.setCreatedDate(new Date());
        facility6.setName("Strong Room");
        facility6.setLocation("Section B");
        facilityRepository.save(facility6);

        Facility facility7 = new Facility();
        facility7.setCreatedBy("Test");
        facility7.setCreatedDate(new Date());
        facility7.setName("Toilet");
        facility7.setLocation("Section O");
        facilityRepository.save(facility7);

        Facility facility8 = new Facility();
        facility8.setCreatedBy("Test");
        facility8.setCreatedDate(new Date());
        facility8.setName("Offices");
        facility8.setLocation("Block F");
        facilityRepository.save(facility8);
    }
}
