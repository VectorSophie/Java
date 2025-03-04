package kosa.mission;

import java.util.Scanner;

public class mission06 {

	public static void main(String[] args) {
		String m_id = "kosa";
		String m_pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String id = sc.nextLine();
		System.out.println("비밀번호: ");
		String pass = sc.nextLine();
		
		if (id.trim().equals(m_id) && pass.trim().equals(m_pass)) {
			System.out.println("로그인 성공");
		} else if (!id.trim().equals(m_id)) {
			System.out.println("아이디 없음");
		} else {
			System.out.println("비밀번호 불일치");
		}
		sc.close();
	}
}
