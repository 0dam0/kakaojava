package kakao.oop;

public class Main {
	
	public static void main(String[] args) {
		MethodClass.noArgsMethod();
		MethodClass.oneArgsMethod(3);
		MethodClass.twoArgsMethod(2, "Message");
		
		MethodClass obj =
				new MethodClass();
		//리턴된 결과 가져오기
		int result = obj.addWithInteger(10, 30);
		System.out.println("결과:" + result);
		//리턴된 결과를 가지고 다른 작업을 수행할 수 있음
		result = obj.addWithInteger(result, 90);
		System.out.println("결과:" + result);
		
		int x = 10;
		MethodClass.callByValue(x);
		//기본형 메서드에게 넘겨준 경우는 데이터가 변경되지 않음
		
		int [] br = {10, 20, 30};
		MethodClass.callByReference(br);
		//배열을 메서드에게 넘기면 배열의 내용이 변경될 수 도 있음
		//메서드의 리턴이 없는 경우라면 print 메서드를 제외하고는
		//원본을 변경해주는 것.
		System.out.println("br[0]:" + br[0]); 		
	
		MethodClass o1 = new MethodClass();
		o1.thisMethod();
		
		//20번째 피보나치 수열의 값
		int f = MethodClass.noRecursionFibonacci(20);
		System.out.println("f:" + f);
		
		//f = MethodClass.recursionFibonacci(50);
		//System.out.println("f:" + f);
		
		
		//display 메서드의 매개변수가 String ... args 이므로
		//문자열을 몇 개 주어도 상관없음.
		MethodClass.display("곰");
		MethodClass.display("고래", "상어");
		MethodClass.display("거북이", "호랑이", "늑대");
	}
}