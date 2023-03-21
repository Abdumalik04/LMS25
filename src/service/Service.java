package service;

import dataBaza.Group;
import dataBaza.Student;

import java.util.List;

public interface Service {
    void newGroup();
    void  searchGroup();
    void updateGroup();
    void getAllGroups();
    void newStudentGroup();
    void updateStudent();
    void findStudent();
    void getAllStudentGroupName();
    void getAllLessonsStudent();
    void deleteStudent();
    void AddNewLessonGroup();
    void GetLessonByName();
    void getAllLessonByName();
    void deleteLesson();
    void deleteGroup();
}
