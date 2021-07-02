/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.mb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import za.gov.sars.common.AddressType;
import za.gov.sars.common.PersonType;
import za.gov.sars.common.SystemUserType;
import za.gov.sars.domain.Address;
import za.gov.sars.domain.ContactDetail;
import za.gov.sars.domain.Grade;
import za.gov.sars.domain.Student;
import za.gov.sars.domain.Subject;
import za.gov.sars.service.GradeServiceLocal;
import za.gov.sars.service.StudentServiceLocal;
import za.gov.sars.service.SubjectServiceLocal;

/**
 *
 * @author S2028398
 */
@ManagedBean
@ViewScoped
public class StudentBean extends BaseBean {

    @Autowired
    private StudentServiceLocal studentService;
    @Autowired
    private GradeServiceLocal gradeService;
    @Autowired
    private SubjectServiceLocal subjectService;

    private List<Student> students = new ArrayList<>();
    private List<PersonType> personType = new ArrayList<>();
    private List<AddressType> addressTypes = new ArrayList<>();
    private List<Grade> grades = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();

    private Student student;

    @PostConstruct
    public void init() {
        this.resetView(false).setList(true);
        students = studentService.listAll();
        personType = Arrays.asList(PersonType.values());
        addressTypes = Arrays.asList(AddressType.values());
        grades = gradeService.listAll();
        subjects = subjectService.listAll();
    }

    public void addOrUpdate(Student st) {
        this.resetView(false).setAdd(true);
        if (st != null) {
            //st.setUpdatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            st.setUpdatedDate(new Date());
            student = st;
        } else {
            student = new Student();
            // student.setCreatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            student.setCreatedDate(new Date());

            Address physicalAddress = new Address();
            physicalAddress.setAddressType(AddressType.RESIDENTIAL);
            // physicalAddress.setCreatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            physicalAddress.setCreatedDate(new Date());

            Address postalAddress = new Address();
            postalAddress.setAddressType(AddressType.POSTAL);
            //postalAddress.setCreatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            postalAddress.setCreatedDate(new Date());

            student.getAddressList().add(physicalAddress);
            student.getAddressList().add(postalAddress);

            ContactDetail contactDetail = new ContactDetail();
            // contactDetail.setCreatedBy(getActiveUser().getFirstName() + " " + getActiveUser().getLastName());
            contactDetail.setCreatedDate(new Date());

            students.add(0, student);
        }
    }

    public void save(Student st) {
        if (st.getId() != null) {
            studentService.update(st);
        } else {
            studentService.save(st);
        }
        this.resetView(false).setList(true);
    }

    public void delete(Student st) {
        studentService.deleteById(st.getId());
        synchronize(st);
        this.resetView(false).setList(true);
    }

    public void synchronize(Student st) {
        Iterator<Student> studentList = students.iterator();
        while (studentList.hasNext()) {
            if (studentList.next().getId().equals(st.getId())) {
                studentList.remove();
            }
        }
    }

    public void cancel(Student st) {
        if(st.getId()==null){
        if (students.contains(st)) {
            students.remove(st);
        }
        }
        this.resetView(false).setList(true);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<AddressType> getAddressTypes() {
        return addressTypes;
    }

    public void setAddressTypes(List<AddressType> addressTypes) {
        this.addressTypes = addressTypes;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<PersonType> getPersonType() {
        return personType;
    }

    public void setPersonType(List<PersonType> personType) {
        this.personType = personType;
    }

}
