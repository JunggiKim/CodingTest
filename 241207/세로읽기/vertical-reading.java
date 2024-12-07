
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();


		String[] input1 = br.readLine().split("");
		String[] input2 = br.readLine().split("");
		String[] input3 = br.readLine().split("");
		String[] input4 = br.readLine().split("");


		int i = 0;
		while (true) {

			if (input1.length > i) {
				sb.append(input1[i]);
			}
			if (input2.length > i) {
				sb.append(input2[i]);
			}
			if (input3.length > i) {
				sb.append(input3[i]);
			}
			if (input4.length > i) {
				sb.append(input4[i]);
			}

			if (input1.length < i &&
					input2.length < i &&
					input3.length < i &&
					input4.length < i
			) {
				break;
			}

			i++;
		}


		System.out.println(sb.toString());
    }
}