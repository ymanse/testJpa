package org.tsc.todoList.employee

import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

@Service
@Slf4j
class EmpServiceImpl (val qEmpRepository: QEmpRepository) : EmpService{
    override fun selectAllEmployees(): List<Employee> {
        return qEmpRepository.selectAllEmployees()
    }
}