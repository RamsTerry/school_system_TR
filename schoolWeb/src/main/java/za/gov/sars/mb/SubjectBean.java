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
import za.gov.sars.domain.Employee;
import za.gov.sars.domain.Grade;
import za.gov.sars.domain.Subject;
import za.gov.sars.service.EmployeeService;
import za.gov.sars.service.GradeServiceLocal;
import za.gov.sars.service.SubjectServiceLocal;

/**
 *
 * @author S2028398
 */
@ManagedBean
@ViewScoped
public class SubjectBean extends BaseBean{
    
    @Autowired
    private GradeServiceLocal gradeService;
    @Autowired
    private SubjectServiceLocal subjectService;
    @Autowired
    private EmployeeService employeeService;

    private List<Grade> grade = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    
    private Subject subject;
    
        @PostConstruct
    public void init(){
        this.resetView(false).setList(true);
        grade = gradeService.listAll();
        employees = employeeService.listAll();
       subjects = subjectService.listAll();
     
    }
    
    public void addOrUpdate(Subject sub){
        this.resetView(false).setAdd(true);
        if(sub != null){
            //sub.setUpdatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            sub.setUpdatedDate(new Date());
            subject = sub;
        }
        else{
            subject = new Subject();
            //subject.setCreatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            subject.setCreatedDate(new Date());

        }
    }
        public void save(Subject sub) {

        if (sub.getId() != null) {

            subjectService.update(sub);

        } else {

            subjectService.save(sub);

        }

        this.resetView(false).setList(true);

    }

    public void delete(Subject sub) {

        subjectService.deleteById(sub.getId());

        synchronize(sub);

        this.resetView(false).setList(true);

    }

    public void synchronize(Subject sub) {

        Iterator<Subject> subjectList = subjects.iterator();

        while (subjectList.hasNext()) {

            if (subjectList.next().getId().equals(sub.getId())) {

               subjectList.remove();

            }

        }

    }

    public void cancel(Subject sub) {

        if (subjects.contains(sub)) {

            subjects.remove(sub);

        }

        this.resetView(false).setList(true);

    }

    public List<Grade> getGrade() {
        return grade;
    }

    public void setGrade(List<Grade> grade) {
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
}

