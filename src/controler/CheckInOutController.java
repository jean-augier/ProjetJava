package controler;

import java.util.Iterator;

import com.polyjava.poo.*;

public class CheckInOutController {
	public static boolean createCheckInOut(String idEmp, Company cmpy) {
		
		Iterator<Department> iterDep = cmpy.getDepartmentList().iterator();
		Iterator<Employee> iterEmp;
		Employee emp;
		
	    while (iterDep.hasNext()) {
	    	iterEmp = iterDep.next().getEmployeeList().iterator();
	    	while (iterEmp.hasNext()) {
	    		emp = iterEmp.next();
	    		if(emp.getIdEmployee() == Integer.parseInt(idEmp)) {
	    			CheckInOut check = new CheckInOut(emp);
	    			System.out.println("check créé");
	    			System.out.println(check);
	    			return true;
	    		}
	    	}
	    }
	    System.out.println("non trouvé");
		return false;
	}
}
