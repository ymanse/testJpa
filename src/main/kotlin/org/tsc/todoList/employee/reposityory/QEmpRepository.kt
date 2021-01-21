package org.tsc.todoList.employee.reposityory;

import org.tsc.todoList.employee.Employee

interface QEmpRepository{
    fun selectAllEmployees(): List<Employee>;
}