package ru.hogwards.shcool.services.api;

import ru.hogwards.shcool.model.Student;

import java.util.Collection;

public interface StudentService {
    Student addStudent(Student student);
    Student getStudent(long id);
    Student editStudent(Student student);
    Student removeStudent(long id);

    Collection<Student> getStudentsByAge(int age);
}
