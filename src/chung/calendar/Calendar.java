package chung.calendar;
import java.util.Scanner;
public class Calendar {
	public static void main(String[] args) {
		System.out.println("Calendar");
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//입력 받은 월의 최대 일수 출력
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int [] calendar = new int[12];
			if(month==1) {
				System.out.println("1월은 31일까지 있습니다.");
			}
			else if(month==2) {
				System.out.println("2월은 28일까지 있습니다.");
			}
			else if(month==3) {
				System.out.println("3월은 31일까지 있습니다.");
			}
			else if(month==4) {
				System.out.println("4월은 30일까지 있습니다.");
			}
			else if(month==5) {
				System.out.println("5월은 31일까지 있습니다.");
			}
			else if(month==6) {
				System.out.println("6월은 30일까지 있습니다.");
			}
			else if(month==7) {
				System.out.println("7월은 31일까지 있습니다.");
			}
			else if(month==8) {
				System.out.println("8월은 31일까지 있습니다.");
			}
			else if(month==9) {
				System.out.println("9월은 30일까지 있습니다.");
			}
			else if(month==10) {
				System.out.println("10월은 31일까지 있습니다.");
			}
			else if(month==11) {
				System.out.println("11월은 30일까지 있습니다.");
			}
			else if(month==12) {
				System.out.println("12월은 31일까지 있습니다.");
			}
		for(int i=1; i<calendar.length; i++) {
			
		}

		scanner.close();
	}

}
