package com.code.excercise;

import java.util.List;

/**
 * Apis to generate Employee report. Below API needs to be implemented :
 *  - getEmployeeByLocation(String location)
 *  - getEmployeeByDesignation(String designation)
 *  - getAllSubOrdinatesOfEmployee(String employeeId)
 *
 */
public interface IEmployeeReportGenerator {

    List<Employee> getEmployeeByLocation(String location);
    List<Employee> getEmployeeByDesignation(Designation designation);
    List<Employee> getAllSubOrdinatesOfEmployee(int employeeId);
}
