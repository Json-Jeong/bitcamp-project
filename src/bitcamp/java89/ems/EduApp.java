package step09.ex4;

import java.util.Scanner;

public class EduApp {
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    TeacherController.keyScan = keyScan;

    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");

    loop:
    while (true) {
      System.out.print("명령> ");

      switch (keyScan.nextLine().toLowerCase()) {
        case "add" : TeacherController.doAdd(); break;
        case "list" : TeacherController.doList(); break;
        case "view" : TeacherController.doView(); break;
        case "quit" :
          System.out.println("Good bye!");
          break loop;
        default :
          System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }
}
