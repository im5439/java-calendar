/**
	 * - 월을 입력하면 해당월의 달력을 출력한다.
	 * - 달력의 모양은 1단계에서 착상한 모양으로 만든다.
	 * - 1일은 일요일로 전해도 무방하다.
	 * - -1을 입력받기 전까지 반복 입력받는다.
	 * - 프롬프트를 출력한다.
	 */

package chung.calendar;

import java.util.Scanner;

public class Prompt {
	/**
	 * ?
	 * 
	 * @param week 요일명
	 * @return 0~6 (0=Sunday, 6= Saturday)
	 */
	public int parseDay(String week) {
		if (week.equals("su"))
			return 0;
		else if (week.equals("mo"))
			return 1;
		else if (week.equals("tu"))
			return 2;
		else if (week.equals("we"))
			return 3;
		else if (week.equals("th"))
			return 4;
		else if (week.equals("fr"))
			return 5;
		else if (week.equals("sa"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = 2019;
		int weekday = 0;

		while (true) {

			System.out.println("년도을 입력하세요.(exit: -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1)
				break;

			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			System.out.println("첫째날의 요일을 입력하세요.(SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);

			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			cal.printCalendar(year, month, weekday);

		}
		System.out.println("Bye~");

		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
