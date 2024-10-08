package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		//System.out.println("\n=== TEST 2: department insert ===");
		//Department dp = new Department(null, "Phone");
		//departmentDao.insert(dp);
		
		//System.out.println("\n=== TEST 3: department update ===");
		//dep = departmentDao.findById(5);
		//dep.setName("Smartphone");
		//departmentDao.update(dep);
		
	
		System.out.println("\n=== TEST 4: department delete ===");
		departmentDao.deleteById(6);
		System.out.println("Done\n");
		
		
		System.out.println("\n=== TEST 5: department findAll ===");
		List<Department> list = departmentDao.findAll();
		
		for(Department dept : list) {
			System.out.println(dept);
		}
		
	}

}
