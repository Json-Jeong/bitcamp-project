package bitcamp.java89.ems;

import java.util.Scanner;

public class TeacherController {
  Teacher[] teachers = new Teacher[100];
  int length = 0;
  Scanner keyScan;

  public TeacherController(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void doView() {
    System.out.print("검색어(이름)> ");
    String name = this.keyScan.nextLine().toLowerCase();
    for (int i = 0; i < this.length; i++) {
      if (teachers[i].name.toLowerCase().equals(name)) {
        System.out.printf("강사 이름: %s\n", this.teachers[i].name);
        System.out.printf("강의 분야: %s\n", this.teachers[i].language);
        System.out.printf("강의 경력: %s\n", this.teachers[i].career);
        System.out.printf("출간 저서: %s\n", this.teachers[i].writing);
        break;
      }
    }
  }

  public void doList() {
    for (int i = 0; i < length; i++) {
      Teacher teacher = this.teachers[i];

      System.out.printf("%s, %s, %s, %s\n",
      teacher.name,
      teacher.language,
      teacher.career,
      teacher.writing);
    }
  }

  public void doAdd() {
    while (this.length < this.teachers.length) {
      Teacher teacher = new Teacher();

      System.out.print("이름? ");
      teacher.name = this.keyScan.nextLine();
      System.out.print("분야? ");
      teacher.language = this.keyScan.nextLine();
      System.out.print("경력? ");
      teacher.career = this.keyScan.nextLine();
      System.out.print("저서? ");
      teacher.writing = this.keyScan.nextLine();

      teachers[length++] = teacher;

      System.out.print("계속 입력하시겠습니까(y/n)");
      if (!this.keyScan.nextLine().equals("y")) {
        break;
      }
    }
  }
}
