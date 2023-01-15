package net.projects.springboot.repository;

import net.projects.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //consists all crud db methods
}
