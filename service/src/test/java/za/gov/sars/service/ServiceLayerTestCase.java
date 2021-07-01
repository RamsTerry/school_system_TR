/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import za.gov.sars.common.TestDataSourceConfiguration;
import za.gov.sars.persistence.EmployeeRepository;
import za.gov.sars.persistence.FacilityRepository;
import za.gov.sars.persistence.GradeRepository;
import za.gov.sars.persistence.LoginRepository;
import za.gov.sars.persistence.StudentRepository;
import za.gov.sars.persistence.SubjectRepository;

/**
 *
 * @author S2028398
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=TestDataSourceConfiguration.class)
public class ServiceLayerTestCase {
       @Autowired
       private FacilityRepository facilityRepository;
        @Autowired
       private GradeRepository gradeRepository;
         @Autowired
       private SubjectRepository subjectRepository;
             @Autowired
       private EmployeeRepository employeeRepository;
           @Autowired
       private StudentRepository studentRepository;
               @Autowired
       private LoginRepository loginRepository;
        
    
    public ServiceLayerTestCase() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestA(){
    FacilityHelper.addFacility(facilityRepository);
    }
        @Test
    public void TestB(){
    GradeHelper.addFacility(gradeRepository);
    }
        @Test
    public void TestC(){
    SubjectHelper.addFacility(subjectRepository);
    
    }
        @Test
    public void TestD(){
    EmployeeHelper.addFacility(employeeRepository, gradeRepository, subjectRepository);
    
    }
        @Test
    public void TestE(){
    
    SystemAdminHelper.addSystemAdmin(employeeRepository);
    }
        @Test
    public void TestF(){

  SystemUserHelper.addSystemUser(loginRepository, employeeRepository);
    }
        @Test
    public void TestG(){
    StudentHelper.addFacility(studentRepository, gradeRepository, subjectRepository);
    
    }    
}
