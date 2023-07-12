package multi;

import java.util.Scanner;

public class Multiple_imp implements Multiple {
	Scanner n = new Scanner(System.in);
	
	@Override
	public void even(int start, int end) {
		int len = 0;
		for(int i =start;i<end;i++) {
			if(i%2==0) {
				len++;
			}
		}
		int[] even = new int[len];
		int x =0;
		for(int i =start;i<end;i++) {
			if(i%2==0) {
				even[x] = i;
				x++;
			}
		}
		String str = "[";
		for(x = 0; x<even.length;x++) {
			str+=even[x];
			if(x!=even.length-1) {
				str+=",";
			}
		}
		str+="]";
		
		System.out.println(str);
	}

	@Override
	public void odd(int start, int end) {
		int len = 0;
		for(int i =start;i<end;i++) {
			if(i%2==1) {
				len++;
			}
		}
		int[] even = new int[len];
		int x =0;
		for(int i =start;i<end;i++) {
			if(i%2==1) {
				even[x] = i;
				x++;
			}
		}
		String str = "[";
		for(int n = 0; n<even.length;n++) {
			str+=even[n];
			if(n!=even.length-1) {
				str+=",";
			}
		}
		str+="]";
		
		System.out.println(str);

	}


	@Override
	public int start() {
		System.out.println(
				"""
				[ 짝수, 홀수 출력 프로그램 ]
				▶ 시작 숫자를 입력해주세요 : 		
						""");
		int start = n.nextInt();
		return start;
	}

	@Override
	public int end() {
		System.out.println("▶ 시작 숫자를 입력해주세요 : ");
		int end = n.nextInt();
		return end;
	}

}
