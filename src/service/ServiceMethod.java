package service;

import dataBaza.Group;
import dataBaza.Lesson;
import dataBaza.Student;

import java.time.LocalTime;
import java.util.*;

public class ServiceMethod implements Service {
    int count;

    List<Group> groups = new LinkedList<>();
    List<Lesson> lessons = new LinkedList<>();
    List<Student>students=new ArrayList<>();

    @Override
    public void newGroup() {
        try {
            System.out.print("Группанун атын жазынуз:");
            String name = new Scanner(System.in).nextLine();
            for (Group d : groups) {
                if (d.getName().equals(name)) {
                    throw new NullPointerException("mundai at bar");
                }
            }
            System.out.print("Koментария таштай кетиниз:");
            String a = new Scanner(System.in).nextLine();
            Group gruppa = new Group(name,a,groups.size() + 1,students,lessons);
            groups.add(gruppa);
            System.out.println(gruppa.toString());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void searchGroup() {
        boolean isTrue = false;
        try {
            System.out.println("Кайсы группаны издеп жатасыз");
            String s = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                if (g.getName().equals(s)) {
                    System.out.println(g.toString());
                    isTrue = false;
                } else {
                    isTrue = true;
                }
            }
            if (isTrue) {
                throw new NullPointerException("Tura emes");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateGroup() {
        try {
            System.out.println("Кайсы группанын атын озгортосуз:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            for (Group s : groups) {
                if (s.getName().equals(name)) {
                    System.out.println("Группага жаны ат бериниз");
                    s.setName(scanner.nextLine());
                    System.out.println(s.toString());
                    System.out.println(" Группанын аты ийгиликтуу озгорулду");
                } else {
                    throw new NullPointerException("Группынын атын туура жазыныз?");
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getAllGroups() {
        for (Group s : groups) {
            System.out.println(s.toString());
        }
    }

    @Override
    public void newStudentGroup() {
        System.out.print("Группанын атын жазыныз:");

        try {
            String d = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                if (g.getName().equals(d)) {
                    Student student = new Student();
                    student.setId(++count);
                    System.out.print("Студенттин атын жазыныз:");
                    String firstName = new Scanner(System.in).nextLine();
                    student.setFirstName(firstName);
                    System.out.print("Фамилиясын жазыныз:");
                    String lastName = new Scanner(System.in).nextLine();
                    student.setLastName(lastName);
                    System.out.print("Email жазыныз:");
                    String email = new Scanner(System.in).nextLine();
                    if (email.contains("@")) {
                        student.setEmail(email);
                    } else {
                        throw new Exp("Password not conatain '@'");
                    }
                    System.out.print("Паролнузду жазыныз:(Только PIN KOD):");
                    String password = new Scanner(System.in).nextLine();
                    if (password.length() > 7) {
                        int p = Integer.parseInt(password);
                        student.setPassword(p);
                    } else {
                        throw new Exp("Password length 8");
                    }
                    System.out.println("Жынысынызды танданыз:\n" + "Male:\n" + "Female");
                    String s = new Scanner(System.in).nextLine().toUpperCase();
                    if (s.equalsIgnoreCase(Gender.MALE.name())) {
                        student.setGender(Gender.MALE);
                        System.out.println(student);
                    } else if (s.equalsIgnoreCase(Gender.FEMALE.name())) {
                        student.setGender(Gender.FEMALE);
                        System.out.println(student);
                    }
                    g.setStudents(List.of(student));
                    System.out.println(g.toString());
                }
            }


        } catch (Exp e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void updateStudent() {
        boolean isTrue=true;
        try {
            System.out.println("Кайсы группада студент керек");
            String name = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                if (g.getName().equals(name)) {
                    isTrue=true;
                    for (Student student : g.getStudents()) {
                        student.setId(groups.size());
                        System.out.println("Жаны ат жазыныз");
                        String newName = new Scanner(System.in).nextLine();
                        student.setFirstName(newName);
                        System.out.println("Жаны фамилияны жазыныз");
                        String newLastName = new Scanner(System.in).nextLine();
                        student.setLastName(newLastName);
                        g.setStudents(List.of(student));
                    }
                }else {
                    isTrue=false;
                }
                System.out.println(g.getStudents().toString());
            }
            if (isTrue){
                throw new Exp("Группанын атын туура терин!");
            }
        }catch (Exp e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void findStudent() {
        boolean isTrue = false;
        try {
            System.out.print("Студенттин атын жазыныз:");
            String student = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                for (Student s : g.getStudents()) {
                    if (s.getFirstName().equals(student)) {
                        if (s.getFirstName().equalsIgnoreCase(student)) {
                            System.out.println(s.toString());
                            isTrue = false;
                        }
                    } else {
                        isTrue = true;
                    }
                }
            }
            if (isTrue) {
                throw new Exp("Студенттин атын туура жазыныз!");
            }
        } catch (Exp e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void getAllStudentGroupName() {
        boolean isTrue = true;
        try {
            System.out.print("Группанын атын жазыныз:");
            String name = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                if (g.getName().equals(name)) {
                    System.out.println(g.toString());
                    isTrue = true;
                } else {
                    isTrue = false;
                }
            }
            if (isTrue) {
                throw new Exp("Группанын атын туура жазыныз");
            }
        } catch (Exp e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getAllLessonsStudent() {
        boolean isTrue = true;
        try {
            Lesson lesson = new Lesson(lessons.size() + 1);
            System.out.println("Студенттин Emailлын жазыныз:");
            String email = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                for (Student s : g.getStudents()) {
                    if (s.getEmail().equals(email)) {
                        isTrue = true;
                        System.out.print("Тема:");
                        String lessons = new Scanner(System.in).nextLine();
                        lesson.setName(lessons);
                        System.out.print("Сабактын атын жазыныз:");
                        String description = new Scanner(System.in).nextLine();
                        lesson.setDescription(description);
                        g.getLessons().add(lesson);
                        System.out.println(g.toString());

                    } else {
                        isTrue = false;
                    }

                }
            }
            if (isTrue) {
                throw new Exp("Мындай Email табылган жок! ");
            }
        } catch (Exp e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteStudent() {
        boolean isFalse = true;
        try {
            System.out.println(" Email жазыныз:");
            String email = new Scanner(System.in).nextLine();
            for (Group g : groups) {
                for (Student s : g.getStudents()) {
                    if (s.getEmail().equalsIgnoreCase(email)) {
                        g.getStudents().remove(s);
                        System.out.println("Student delete boldu");
                        isFalse = true;
                        break;
                    } else {
                        isFalse = false;
                    }
                }
                if (isFalse) {
throw new Exp("Kata chuktuuu");
                }
            }

        }catch (Exp s){
            System.out.println(s.getMessage());
        }
        }

        @Override
        public void AddNewLessonGroup () {
            System.out.println("Кайсы группага кошосуз");
            String a=new Scanner(System.in).nextLine();
            for(Group group:groups){
                if (group.getName().equals(a)){
                }
                for (Lesson l:group.getLessons()){

                }
            }

        }

        @Override
        public void GetLessonByName () {

        }

        @Override
        public void getAllLessonByName () {

        }

        @Override
        public void deleteLesson () {

        }

        @Override
        public void deleteGroup () {

        }


    }