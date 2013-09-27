import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD
{
    public static void main(String[] args) throws IOException {
	int N;
	int M;

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	// Read and store input
	String line1 = input.readLine();
	N = Integer.valueOf(line1.split(" ")[0]);
	M = Integer.valueOf(line1.split(" ")[1]);

	for (int i = 0; i < N; i++) {
	    String line2 = input.readLine();

	    // Store value
	}

	for (int i = 0; i < M; i++) {
	    String line3 = input.readLine();

	    // Store value
	}

	String terminationLine = input.readLine();

	if (terminationLine.equals("0 0")) {
	    // Compare and count the number of collisions

	    // Then print the number

	}


    }
}
