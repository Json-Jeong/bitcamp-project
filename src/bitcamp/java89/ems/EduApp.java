package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");

    Scanner keyScan = new Scanner(System.in);

    Teacher teacher = new Teacher();

    System.out.print("이름? ");
    teacher.name = keyScan.nextLine();
    System.out.print("분야? ");
    teacher.language = keyScan.nextLine();
    System.out.print("경력? ");
    teacher.career = keyScan.nextLine();
    System.out.print("저서? ");
    teacher.writing = keyScan.nextLine();

    System.out.printf("\n[　　　　　%s　　　　　]\n", teacher.name);
    System.out.printf("강의 분야: %s\n", teacher.language);
    System.out.printf("강의 경력: %s\n", teacher.career);
    System.out.printf("출간 저서: %s\n", teacher.writing);
  }
}
