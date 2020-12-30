package org.tsc.todoList.employee

import org.springframework.data.jpa.repository.JpaRepository

interface EmpRepository : JpaRepository<Employee, Long>{
}