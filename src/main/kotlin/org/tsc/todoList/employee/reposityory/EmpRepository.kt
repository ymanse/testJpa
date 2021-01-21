package org.tsc.todoList.employee.reposityory

import org.springframework.data.jpa.repository.JpaRepository
import org.tsc.todoList.employee.Employee
import java.util.*

interface EmpRepository
  : JpaRepository<Employee, Long>
  , QEmpRepository
{
  fun findByName(nm:String) : List<Employee>;
}