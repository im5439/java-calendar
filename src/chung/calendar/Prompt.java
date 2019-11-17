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

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = -1;
		int year = -1;

		while (true) {
			System.out.println("년도을 입력하세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month);

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
