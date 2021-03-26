package org.ravi.hackerrank.interviewprepkit.warmup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	/*
	 * Complete the 'countingValleys' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER steps 2. STRING path
	 */

	public static int countingValleys(int steps, String path) {

		int valleyCount = 0;
		int level = 0;

		for (char step : path.toCharArray()) {
			if (step == 'U') {
				++level;
			}

			if (step == 'D') {
				--level;
			}

			if (level == 0 && step == 'U') {
				++valleyCount;
			}
		}
		return valleyCount;
	}
}

public class CountingValleys {

	// PMD, Check Style, FindBugs
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int steps = Integer.parseInt(bufferedReader.readLine().trim());

		String path = bufferedReader.readLine();

		int result = Result.countingValleys(steps, path);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}