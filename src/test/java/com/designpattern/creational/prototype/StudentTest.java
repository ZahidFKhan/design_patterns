package com.designpattern.creational.prototype;

import static org.junit.jupiter.api.Assertions.*;

import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

  @Test
  void testStudentsAreEqualUsingCopyConstructor() {
    Student actualStudent = new Student(12, 12000, "Zahid");
    Student clonedStudent = new Student(actualStudent);
    Assertions.assertThat(actualStudent).isEqualTo(clonedStudent);
  }

  @Test
  @SneakyThrows
  void testStudentsAreEqual() {
    Student actualStudent = new Student(12, 12000, "Zahid");
    Student clonedStudent = (Student) actualStudent.clone();
    Assertions.assertThat(actualStudent).isEqualTo(clonedStudent);
  }
}
