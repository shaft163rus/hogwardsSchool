package ru.hogwards.shcool.services.Impl;

import org.springframework.stereotype.Service;
import ru.hogwards.shcool.model.Faculty;
import ru.hogwards.shcool.services.api.FacultyService;

import java.util.*;

@Service
public class FacultyServiceImpl implements FacultyService {

    private Map<Long, Faculty> facultyMap = new HashMap<>();
    private long id;

    @Override
    public Faculty addFaculty(Faculty faculty) {
        faculty.setId(++id);
        facultyMap.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty getFaculty(long id) {
        return facultyMap.get(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {
        facultyMap.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty removeFaculty(long id) {
        return facultyMap.remove(id);
    }

    @Override
    public Collection<Faculty> getFacultiesByColor(String color) {
        List<Faculty> filteredFacultyList = new ArrayList<>();

        for (Map.Entry<Long, Faculty> entry : facultyMap.entrySet()) {
            if (entry.getValue().getColor().equals(color)) {
                filteredFacultyList.add(entry.getValue());
            }
        }


        return filteredFacultyList;
    }
}
