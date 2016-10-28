package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp {
  static Teacher[] teachers = new Teacher[100];
  static int length = 0;
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");


    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
        case "add" : doAdd(); break;
        case "list" : doList(); break;
        case "view" : doView(); break;
        case "quit" :
          System.out.println("Good bye!");
          break loop;
        default :
          System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }

  static void doView() {
    System.out.print("검색어(이름)> ");
    String name = keyScan.nextLine().toLowerCase();
    for (int i = 0; i < length; i++) {
      if (teachers[i].name.toLowerCase().equals(name)) {
        System.out.printf("강사 이름: %s\n", teachers[i].name);
        System.out.printf("강의 분야: %s\n", teachers[i].language);
        System.out.printf("강의 경력: %s\n", teachers[i].career);
        System.out.printf("출간 저서: %s\n", teachers[i].writing);
        break;
      }
    }
  }

  static void doList() {
    for (int i = 0; i < length; i++) {
      Teacher teacher = teachers[i];

      System.out.printf("%s, %s, %s, %s\n",
      teacher.name,
      teacher.language,
      teacher.career,
      teacher.writing);
    }
  }

  static void doAdd() {
    while (length < teachers.length) {
      Teacher teacher = new Teacher();

      System.out.print("이름? ");
      teacher.name = keyScan.nextLine();
      System.out.print("분야? ");
      teacher.language = keyScan.nextLine();
      System.out.print("경력? ");
      teacher.career = keyScan.nextLine();
      System.out.print("저서? ");
      teacher.writing = keyScan.nextLine();

      teachers[length++] = teacher;

      System.out.print("계속 입력하시겠습니까(y/n)");
      if (!keyScan.nextLine().equals("y")) {
        break;
      }
    }
  }
}
