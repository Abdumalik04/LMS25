import dataBaza.Group;
import service.Gender;
import service.ServiceMethod;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ServiceMethod serviceMethod = new ServiceMethod();
     /*
        LocalTime localTime = LocalTime.now();
        if (localTime.)
        */
        while (true) {
            System.out.println(""" 
                    1->Группанын атын жазыныз
                    2-> Кайсы группаны издеп жатасыз
                    3->Группанын атын озгортосуз
                    4->Бардык группаны чыгарыныз
                    5->Бир студенти группага кошуу
                    6->Студенттин атын озгортуу
                    7->Студентти аты м-н издоо
                    8->Группанын атын жазып Студентти алыныз 
                    9->Студенттке сабак кошуу
                    10->Бир студентти очуру""");
            int s = new Scanner(System.in).nextInt();
            switch (s) {
                case 1 -> serviceMethod.newGroup();
                case 2 -> serviceMethod.searchGroup();
                case 3 -> serviceMethod.updateGroup();
                case 4 -> serviceMethod.getAllGroups();
                case 5 -> serviceMethod.newStudentGroup();
                case 6 -> serviceMethod.updateStudent();
                case 7 -> serviceMethod.findStudent();
                case 8->serviceMethod.getAllStudentGroupName();
                case 9->serviceMethod.getAllLessonsStudent();
                case 10->serviceMethod.deleteStudent();
            }
        }
    }
}