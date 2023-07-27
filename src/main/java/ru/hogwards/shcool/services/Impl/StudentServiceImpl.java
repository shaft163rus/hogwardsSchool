package ru.hogwards.shcool.services.Impl;

import org.springframework.stereotype.Service;
import ru.hogwards.shcool.model.Student;
import ru.hogwards.shcool.services.api.StudentService;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {
    private Map<Long, Student> students = new HashMap<>();
    private long id;

    @Override
    public Student addStudent(Student student) {
        student.setId(++id);
        students.put(student.getId(), student);
        return student;
    }

    @Override
    public Student getStudent(long id) {
        return students.get(id);
    }

    @Override
    public Student editStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    @Override
    public Student removeStudent(long id) {
        return students.remove(id);

    }

    @Override
    public Collection<Student> getStudentsByAge(int age) {
        List<Student> filteredStudentsList = new ArrayList<>();

        for (Map.Entry<Long, Student> entry : students.entrySet()) {
            Student student = entry.getValue();
            if (student.getAge() == age) {
                filteredStudentsList.add(student);
            }
        }
        return filteredStudentsList;
    }
}
