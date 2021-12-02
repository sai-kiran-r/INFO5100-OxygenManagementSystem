/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Nithin Bharadwaj
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public void deleteEmployee(String name){
        Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()) {
          Employee ek = itr.next();
          if (ek.getName().equals(name)) {
            itr.remove();
          }
        }

    }
}