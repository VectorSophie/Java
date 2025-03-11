package kosa.phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneManagerList {
    private List<PhoneBook> list;
    private Scanner sc;

    public PhoneManagerList() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addName() {
        System.out.println("1.전체 2.동창 3.직장");
        System.out.print("선택: ");
        int input = Integer.parseInt(sc.nextLine());

        System.out.print("이름: ");
        String Nombre = sc.nextLine();
        System.out.print("전화번호: ");
        String Numero = sc.nextLine();
        System.out.print("생년월일: ");
        String Cumple = sc.nextLine();

        switch (input) {
            case 1:
                list.add(new PhoneBook(Nombre, Numero, Cumple));
                break;
            case 2:
                System.out.print("전공: ");
                String major = sc.nextLine();
                System.out.print("학번: ");
                String year = sc.nextLine();
                list.add(new Colleague(Nombre, Numero, Cumple, major, year));
                break;
            case 3:
                System.out.print("부서: ");
                String dept = sc.nextLine();
                System.out.print("직급: ");
                String position = sc.nextLine();
                list.add(new Company(Nombre, Numero, Cumple, dept, position));
                break;
        }
        System.out.println("전화번호가 등록되었습니다");
    }

    public void showAll() {
        System.out.println("1.전체 2.동창 3.직장");
        System.out.print("선택: ");
        int input = Integer.parseInt(sc.nextLine());

        for (PhoneBook pb : list) {
            if (input == 1 || (input == 2 && pb instanceof Colleague) || (input == 3 && pb instanceof Company)) {
                pb.show();
            }
        }
    }

    public void searchName() {
        System.out.print("검색: ");
        String Target = sc.nextLine();
        for (PhoneBook pb : list) {
            if (pb.getName().equals(Target)) {
                pb.show();
                return;
            }
        }
        System.out.println("검색 결과가 없습니다.");
    }

    public void replaceName() {
        System.out.print("바꿀 대상 검색: ");
        String Target = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(Target)) {
                list.get(i).show();
                System.out.print("새 번호: ");
                String reNumero = sc.nextLine();
                list.set(i, new PhoneBook(list.get(i).getName(), reNumero, list.get(i).getBirth()));
                return;
            }
        }
        System.out.println("대상을 찾을 수 없습니다.");
    }

    public void deleteName() {
        System.out.print("삭제할 대상 검색: ");
        String Target = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(Target)) {
                list.get(i).show();
                list.remove(i);
                System.out.println("삭제 완료");
                return;
            }
        }
        System.out.println("대상을 찾을 수 없습니다.");
    }
}
