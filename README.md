# EmployeeReportGenerator
Generate Employee Reports

## Task Description

Implement following interface to generate Employee report. Below API needs to be implemented :
 * getEmployeeByLocation(String location)
 * getEmployeeByDesignation(String designation)
 * getAllSubOrdinatesOfEmployee(String employeeId)

```
        public interface IEmployeeReportGenerator {
   	    List<Employee> getEmployeeByLocation(String location);
   	    List<Employee> getEmployeeByDesignation(Designation designation);
   	    List<Employee> getAllSubOrdinatesOfEmployee(String employeeId);
   	}

```
	
An Employee can have list of subordinates who are also an employee :

- Employee will have:
	 - id
	 - name
	 - designation
	 - location
	 - managerId
	 - List of subordinate employees
	 
	 
- Sample Data :

| ID | NAME	     |   DESIGNATION	 |   LOCATION	   | MANAGERID
|----|-----------|-------------------|-----------------|---------------
| 1	 | James	 |   MANAGER	     |   Hamilton	   |   4
| 2	 | Josephine |	 VICE PRESIDENT	 |   Brighton	   |   13
| 3	 | Tom	     |   DIRECTOR	     |   Bridgeport	   |	
| 4	 | Lenna	 |   VICE PRESIDENT	 |   Los Angeles   |   7
| 5	 | Donette	 |   VICE PRESIDENT	 |   Hamilton	   |   7
| 6	 | Simona	 |   MANAGER	     |   Los Angeles   |   14
| 7	 | Mitsue	 |   DIRECTOR	     |   Chicago	   |	
| 8	 | Leota	 |   VICE PRESIDENT	 |   Brighton	   |   13
| 9	 | Sage	     |   MANAGER	     |   Brighton	   |   8
| 10 | Kris	     |   MANAGER	     |   Baltimore	   |   8
| 11 | Minna	 |   VICE PRESIDENT	 |   Kulpsville	   |   3
| 12 | Abel	     |   MANAGER	     |   Middle Island |   11
| 13 | Kiley	 |   DIRECTOR	     |   Los Angeles   |		
| 14 | Graciela	 |   VICE PRESIDENT	 |   Kulpsville	   |   3	 


Example: 

 * List<Employee> getEmployeeByLocation("Brighton") should return
 
   - Josephine
   - Leota
   - Sage
   
* List<Employee> getEmployeeByDesignation(Designation.DIRECTOR.getText()) should return 

   - Tom
   - Mitsue
   - Kiley  
   
* List<Employee> getAllSubOrdinateEmployeeById(13) should return

   - Leota
   - Sage
   - Kris

You can assume that Manager doesn't have any subordinates and the highest designation id Director.
	 
Sample project is given with Interface and empty classes. Your task is to implement- IEmployeeReportGenerator
 
 Good luck!
