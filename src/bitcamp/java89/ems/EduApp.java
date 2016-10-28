package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");

    Teacher[] teachers = new Teacher[100];
    int length = 0;

    Scanner keyScan = new Scanner(System.in);

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
    printTeacherList(teachers, length);
  }

  static void printTeacherList(Teacher[] teachers, int length) {
    for (int i = 0; i < length; i++) {
      Teacher teacher = teachers[i];

      System.out.printf("\n[%s]\n강의 분야: %s, 강의 경력: %s, 출간 저서: %s\n",
      teacher.name,
      teacher.language,
      teacher.career,
      teacher.writing);
    }
  }
}
