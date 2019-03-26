package testEnum;

public class UseEnumStrategy {

	public static void main(String[] args) {

//		System.out.println(Strategy.STRATEGY_A.execute(15, 12, "soma"));
//		
//		System.out.println(Strategy.STRATEGY_A.execute(15, 12, "subtração"));
		
		Strategy.SOMAR.execute(11.5, 11);
	}
}
