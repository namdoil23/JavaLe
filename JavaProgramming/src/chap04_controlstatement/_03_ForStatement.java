package chap04_controlstatement;

public class _03_ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1 ~ 100까지의 합
		int sum = 0;
		
		int i;
		
		for(i = 1; i <= 1000; i++) {
			sum += i;
//     		0 , 1
//			1 , 2
//			
//			
//			
		}
		
		System.out.println("1~100까지의 합: " + sum);
		System.out.println("마지막 i의 값: " + i);
		System.out.println("--------------");
		
		// 2. 1~100까지 정수 중 2와 3의 공배수를 모두 출력하는 for문을 작성하세요.
		
		for(int j = 1; j <= 100; j++) {
			if(j % 6 == 0)
//			sum = j*6;	
			System.out.println(j);
			
			
		}
				
		// 3. 정수 312의 모든 약수를 출력하는 for문을 작성하세요.	
			int num = 312;
			
			for(int k = 1; k <= num; k++) {
				if(num % k == 0) {
//					나눴을때 0값이 되면 k값의 약수가 된다
					
					System.out.println(k);
					
			}		
	}
		// 4. for문 변형
		int l = 1;
		sum = 0;
		
		// 무한 반복되는 for문의 형태
		// break문을 이용해서 특정 조건이 됐을 때 for문을 종료시킨다.
		for( ; ; ) {
			sum += l++;
//			0 , 1
//			1 , 2
//			3 , 3
//			6 , 4
//			10, 5
			
			
			if(l > 1000) {
				break;
				
			}
		}
				System.out.println("1~1000까지의 합: " + sum);
				
				
				
			
		}
		
	}



