package org.ravi.hackerrank.interviewprepkit.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SalesByMatch {

	private static final Scanner scanner = new Scanner(System.in);

//	private static int sockMerchant(int n, int[] ar) {
	protected static int sockMerchant(int n, int[] ar) { // changed to give visibility to jUnit

		int[] socksColorListArray = new int[n];

		int noOfPairs = 0;
		int noOfNonPairs = 0;

		for (int i = 0; i < n; i++) {
			socksColorListArray[i] = ar[i];
		}

		Arrays.sort(socksColorListArray);

		System.out.println(n);
		System.out.println(socksColorListArray.toString());

		for (int i = 0; i < n; i++) {
			if (i < n - 1 && socksColorListArray[i] == socksColorListArray[i + 1]) {
				++noOfPairs;
				++i;
			} else {
				noOfNonPairs = noOfNonPairs + 1;
			}
		}
		return noOfPairs;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int[] ar = new int[n];
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
		int result = sockMerchant(n, ar);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
	}
}
