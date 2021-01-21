package org.tsc.todoList.employee

import javax.persistence.*

@Entity
@Table(name = "Employee")
data class Employee(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_NO")
    val id: Long,

    @Column(name = "EMP_NAME", nullable = false)
    var name: String
)