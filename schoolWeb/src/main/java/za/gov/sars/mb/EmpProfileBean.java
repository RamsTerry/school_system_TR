/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.mb;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import za.gov.sars.common.PersonType;
import za.gov.sars.common.SystemUserType;
import za.gov.sars.domain.Employee;
import za.gov.sars.domain.SystemUser;
import za.gov.sars.service.EmployeeServiceLocal;
import za.gov.sars.service.LoginServiceLocal;

/**
 *
 * @author S2028398
 */
@ManagedBean
@ViewScoped
public class EmpProfileBean extends BaseBean {

    @Autowired //to be able to allow the communication in between
    private EmployeeServiceLocal employeeService;

        
    private Employee employee;


    @PostConstruct
    public void init() {
//        employee = employeeService.findById(getActiveUser).getId());
        employee = employeeService.listAll().get(employeeService.listAll().size() - 1);
        
    }

    public void updateEmpProfile(Employee emp) {

        if (emp.getId() != null) {

            employeeService.update(emp);
        }
        if(emp.getPersonType().equals(PersonType.SYSTEM_USER)&& emp.getEmployeeType().equals(SystemUserType.ADMIN)){
        redirect("adminDash");
        }else if(emp.getPersonType().equals(PersonType.EMPLOYEE)&& emp.getEmployeeType().equals(SystemUserType.ADMIN)){
        redirect("officeAdminDash");
        }else if (emp.getEmployeeType().equals(SystemUserType.PRINCIPAL)) {
            redirecting("principalDash");
        } else if (emp.getEmployeeType().equals(SystemUserType.HOD)) {
            redirecting("hodDash");
        } else if (emp.getEmployeeType().equals(SystemUserType.EDUCATOR)) {
            redirecting("educatorDash");
        }
    }

    public void cancel(Employee emp) {
         if(emp.getPersonType().equals(PersonType.SYSTEM_USER)&& emp.getEmployeeType().equals(SystemUserType.ADMIN)){
        redirect("adminDash");
        }else if(emp.getPersonType().equals(PersonType.EMPLOYEE)&& emp.getEmployeeType().equals(SystemUserType.ADMIN)){
        redirect("officeAdminDash");
        }else if (emp.getEmployeeType().equals(SystemUserType.PRINCIPAL)) {
            redirecting("principalDash");
        } else if (emp.getEmployeeType().equals(SystemUserType.HOD)) {
            redirecting("hodDash");
        } else if (emp.getEmployeeType().equals(SystemUserType.EDUCATOR)) {
            redirecting("educatorDash");
        } 
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


}
