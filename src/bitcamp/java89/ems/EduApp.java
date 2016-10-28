package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp {
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    TeacherController teacherController = new TeacherController(keyScan);

    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");

    teacherController.doAutoAdd();

    loop:
    while (true) {
      System.out.print("명령> ");

      switch (keyScan.nextLine().toLowerCase()) {
        case "menu" : doMenu(); break;
        case "go 2" : teacherController.service(); break;
        case "quit" :
          System.out.println("Good bye!");
          break loop;
        default :
          System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }
  public static void doMenu() {
    System.out.println("[메뉴]");
    System.out.println("2. 강사관리");
    System.out.println("메뉴 이동은 'go 메뉴번호'를 입력하세요.");

  }
}
