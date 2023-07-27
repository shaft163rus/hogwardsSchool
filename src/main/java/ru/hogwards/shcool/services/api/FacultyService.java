package ru.hogwards.shcool.services.api;

import ru.hogwards.shcool.model.Faculty;

import java.util.Collection;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);
    Faculty getFaculty(long id);
    Faculty editFaculty(Faculty faculty);
    Faculty removeFaculty(long id);

    Collection<Faculty> getFacultyByColor(String color);
}
