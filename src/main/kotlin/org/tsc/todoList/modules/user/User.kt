package org.tsc.todoList.modules.user

import org.tsc.todoList.modules.model.Person
import javax.persistence.*

@Entity
@Table(name = "User")
class User : Person() {
  @Column(name = "AGE", nullable = false)
  val age: String = ""

  @Column(name = "PWD", nullable = false)
  val password: String = ""
}