/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.mb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import za.gov.sars.domain.Facility;
import za.gov.sars.domain.Grade;
import za.gov.sars.domain.Subject;
import za.gov.sars.service.FacilityServiceLocal;
import za.gov.sars.service.GradeServiceLocal;
import za.gov.sars.service.SubjectServiceLocal;

/**
 *
 * @author S2028398
 */
@ManagedBean
@ViewScoped
public class FacilityBean extends BaseBean {

    @Autowired
    private FacilityServiceLocal facilityService;
    @Autowired
    private GradeServiceLocal gradeService;

    @Autowired
    private SubjectServiceLocal subjectService;

    private List<Subject> subjects = new ArrayList<>();
    private List<Grade> grades = new ArrayList<>();
    private List<Facility> facilities = new ArrayList<>();

    private Facility facility;

    @PostConstruct
    public void init() {
        this.resetView(false).setList(true);
        facilities = facilityService.listAll();
        subjects = subjectService.listAll();
        grades = gradeService.listAll();
    }

    public void addOrUpdate(Facility fc) {
        this.resetView(false).setAdd(true);
        if (fc != null) {
            //gr.setUpdatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            fc.setUpdatedDate(new Date());
            facility = fc;
        } else {
            facility = new Facility();
            //grade.setCreatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            facility.setCreatedDate(new Date());

        }
    }

    public void save(Facility fc) {

        if (fc.getId() != null) {

            facilityService.update(fc);

        } else {

            facilityService.save(fc);

        }

        this.resetView(false).setList(true);

    }

    public void delete(Facility fc) {

        facilityService.deleteById(fc.getId());

        synchronize(fc);

        this.resetView(false).setList(true);

    }

    public void synchronize(Facility fc) {

        Iterator<Facility> facilityList = facilities.iterator();

        while (facilityList.hasNext()) {

            if (facilityList.next().getId().equals(fc.getId())) {

                facilityList.remove();

            }

        }

    }

    public void cancel(Facility fc) {

        if (facilities.contains(fc)) {

            facilities.remove(fc);

        }

        this.resetView(false).setList(true);

    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

}
