package org.tsc.todoList.employee

import org.springframework.stereotype.Service
import org.tsc.todoList.employee.reposityory.EmpRepository

@Service
class EmpServiceImpl(val empRepository: EmpRepository) : EmpService{
    override fun selectAllEmployees(): List<Employee> {
        return empRepository.selectAllEmployees()
    }
}