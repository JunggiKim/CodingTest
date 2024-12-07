import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int number = Integer.parseInt(br.readLine());

		int flag = number % 2 == 0 ? 2 : 3;

		sb.append(number).append(" ");

		example2(number, flag , sb);

		System.out.println(sb.toString());

	}


    private static int example2(int number, int tempFlag , StringBuilder sb) {

	int tempResult = number / tempFlag;

		sb.append(tempResult).append(" ");
		int flag = tempResult % 2 == 0 ? 2 : 3;

		if (tempResult == 1) {
			return tempResult;
		}
		return example2(tempResult, flag , sb);
	}
}