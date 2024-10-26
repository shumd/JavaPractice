package beforeIDE;

class Utils{
	// Возведение в степень 
	public static double pow(double number, double power){
		boolean isNegative = power < 0;
		double result = number;
		
		if(power == 0) return 1;
		
		if(isNegative) power *= -1;
		
		for(int i = 1; i < power; i++){
			result *= result;	
		}
		
		if(isNegative) return 1/result;
		return result;
	}
	
	// Умножение
	public static double mult(double num1, double num2){
		return num1*num2;
	}
	
	// Деление
	public static double div(double num1, double num2) throws Exception{
		if (num2 == 0) throw new Exception("division by zero :(");
		return num1/num2;
	}
	
	// Сумма
	public static double sum(double num1, double num2){
		return num1+num2;	
	}
	
	// Разность
	public static double sub(double num1, double num2){
		return num1-num2;	
	}

	// Сложение массивов
	public static int[] concat(int[] arr1, int[] arr2){
		int[] res = new int[arr1.length + arr2.length];
		int counter = 0;

		for(int el : arr1) res[counter++] = el;
		for(int el : arr2) res[counter++] = el;

		return res;
	}
}