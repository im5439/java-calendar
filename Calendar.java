package PT;

import java.util.Scanner;

public class Calendar {

	
	// ���� ���� �ƴ��� �Ǵ�
	public boolean isLeapyear(int year) {
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
			return true;
		else
			return false;
	}

	// ���� ������ �ϼ� ���
	public int MaxdayofMonth(int year, int month) {
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
	
	// ���� ù ������ ���ؼ� ������
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
			daysum += MaxdayofMonth(year, k);
		}

		return (monthsum + leapyear + daysum) % 7;
	}


	// �޷� ���
	public void printcalendar(int year, int month) {
		System.out.printf("    <<%4d�� %3d��>>\n", year, month);
		System.out.println("  ��   ��   ȭ   ��   ��   ��   ��");

		int count = 0;
		for (int i = 1; i <= MaxdayofMonth(year, month); i++) {
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
			System.out.println("�⵵�� �Է��ϼ���.(EXIT : -1)");
			System.out.print("YEAR>");
			year = scanner.nextInt();
			if (year == -1) {
				break;
			}

			System.out.println("���� �Է��ϼ���.");
			System.out.print("MONTH>");
			month = scanner.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("�߸��ԷµǾ����ϴ�.");
				continue;
			}

			cal.printcalendar(year, month);
		}
		scanner.close();
		System.out.println("END");
	}

}
