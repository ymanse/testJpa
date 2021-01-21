package org.tsc.todoList.employee.reposityory;

import com.querydsl.jpa.impl.JPAQueryFactory
import org.tsc.todoList.employee.Employee
import org.tsc.todoList.employee.QEmployee
import javax.persistence.EntityManager

open class QEmpRepositoryImpl(
        val entityManager: EntityManager,
        val qf: JPAQueryFactory
): QEmpRepository {
    override fun selectAllEmployees(): List<Employee> {
        val empList = qf.selectFrom(QEmployee.employee)
                .fetch();
        return empList
    }
}