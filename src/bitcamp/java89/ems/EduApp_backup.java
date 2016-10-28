package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp {
  static Teacher[] teachers = new Teacher[100];
  static int length = 0;

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");
    controller();
  }

  static void controller() {
    System.out.print("명령> ");
      quit : switch (keyScan.nextLine()) {
        case "add" :
          inTeacherInfo();
          System.out.println("add sucess");
          controller();
          break;
        case "list" :
          printTeacherList(teachers, length);
          System.out.printf("\nlist sucess\n");
          controller();
          break;
        case "view" :
          System.out.print("검색어(이름)> ");
          pirntTeacherView(teachers, length);
          break;
        case "quit" :
          System.out.printf("\ngood-bye~\n");
          break quit;
        default :
          System.out.printf("\n명령어가 잘못되었습니다."
          + " 사용 가능한 명령어는 'add', 'list', 'view', 'quit' 입니다. \n");
          controller();
          break;
      }
  }

  static void inTeacherInfo() {
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
    controller();
  }

  static void printTeacherList(Teacher[] teachers, int length) {
    for (int i = 0; i < length; i++) {
      Teacher teacher = teachers[i];

      System.out.printf("%s, %s, %s, %s\n",
      teacher.name,
      teacher.language,
      teacher.career,
      teacher.writing);
    }
    controller();
  }

  static void pirntTeacherView(Teacher[] teachers, int length) {
    String name = keyScan.nextLine();
    for (int i = 0; i < length; i++) {
      Teacher teacher = teachers[i];
        if (name.equals(teacher.name))
          System.out.printf("\n 강사 이름: %s\n 강의 분야: %s\n 강사 경력: %s\n 출판 저서: %s\n",
          teacher.name,
          teacher.language,
          teacher.career,
          teacher.writing);
    }
    controller();
  }
}
