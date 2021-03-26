package org.ravi.hackerrank.interviewprepkit.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

//	private static int jumpingOnClouds(int[] clouds) {
	protected static int jumpingOnClouds(int[] clouds) {

		int noOfSteps = 0;
		for (int i = 0; i < clouds.length - 1;) {
			if (i != clouds.length - 2 && clouds[i + 2] == 0) {
				++noOfSteps;
				i = i + 2;
			} else if (clouds[i + 1] == 0) {
				++noOfSteps;
				++i;
			}
		}
		return noOfSteps;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);

		System.out.println(result);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
