
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
     		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int result = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).max().getAsInt();


		System.out.println(result);
   
    }
}