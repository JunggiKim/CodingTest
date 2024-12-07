import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();


		String[] stringNumbers = br.readLine().split(" ");


		int number1 = Integer.parseInt( stringNumbers[0]);
		int number2 = Integer.parseInt( stringNumbers[1]);


		System.out.println(example2(number1, number1, number2 - 1));


	}


	private static int example2(int liveNumber, int multiplyNumber , int countNumber ) {

		if(countNumber == 0){
			return liveNumber;
		}

		int tempResultNumber = liveNumber * multiplyNumber;
		return example2(tempResultNumber , multiplyNumber , countNumber - 1);
	}
}