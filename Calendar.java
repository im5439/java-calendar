package PT;

import java.util.Scanner;

public class Calendar {
	public int[] MAXDAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public int[] LEAPSYEARS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 윤년 인지 아닌지 판단
	public boolean isLeapyear(int year) {
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
			return true;
		else
			return false;
	}

	public int MaxdayofMonth(int year, int month) {
		if (isLeapyear(year))
			return LEAPSYEARS[month - 1];
		else
			return MAXDAYS[month - 1];
	}

	// 달의 첫 요일을 구해서 돌려줌
	public int getStartDay(int year, int month) {
		int monthsum = 0;
		int leapyear = 0;
		int daysum = 1;

		for (int i = 1; i < year; i++) {
			monthsum += 365;
			if (isLeapyear(i) == true) {
				leapyear += 1;
			}
		}
		for (int k = 1; k < month; k++) {
			daysum += getNumberofDaysMonth(year, k);
		}
		return (monthsum + leapyear + daysum) % 7;
	}

	// 달의 마지막 일수 계산
	public int getNumberofDaysMonth(int year, int month) {
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if (month == 2 && isLeapyear(year) == true) {
			return 29;
		} else if (month == 2 && isLeapyear(year) == false) {
			return 28;
		} else {
			return 31;
		}
	}

	// 달력 출력
	public void printcalendar(int year, int month) {
		System.out.printf("    <<%4d년 %3d월>>\n", year, month);
		System.out.println("  일   월   화   수   목   금   토");

		int count = 0;
		for (int i = 1; i <= getNumberofDaysMonth(year, month); i++) {
			if (i < 2) {
				for (int j = 1; j <= getStartDay(year, month); j++) {
					System.out.print("   ");
					count += 1;
				}
			}
			System.out.printf("%3d", i);
			count += 1;
			if (count == 7) {
				System.out.println();
				count = 0;
			}
		}
		System.out.println();
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int year = 2019;
		int month = 1;

		while (true) {
			System.out.println("년도를 입력하세요.(EXIT : -1)");
			System.out.print("YEAR>");
			year = scanner.nextInt();
			if (year == -1) {
				break;
			}

			System.out.println("달을 입력하세요.");
			System.out.print("MONTH>");
			month = scanner.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("잘못입력되었습니다.");
				continue;
			}

			cal.printcalendar(year, month);
		}
		scanner.close();
		System.out.println("END");
	}

}
