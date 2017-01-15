package challenges.root_of_the_problem;

import java.util.Scanner;

/**
 * "Root of the Problem" Solution:
 *
 * Each node id and the sum of each node's children are given.
 * The root node id will not be included in any children sum of any node.
 * Therefore, if we add all the given ids and subtract all the sums of children,
 * we are left with the root node id.
 *
 * @author Andre Hernandez
 *
 */

public class RootOfTheProblem {

	private static int MIN_ID = 1;
	private static int MAX_ID = 1000;
	private static int MIN_T = 1;
	private static int MAX_T = 50;
	private static int MIN_N = 1;
	private static int MAX_N = 30;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();

			if (t < MIN_T || t > MAX_T) {
				System.exit(1);
			}

			// Each test case
			while (t > 0) {
				int n = sc.nextInt();
				int rootId = 0;
				int sumTotal = 0;
				int idTotal = 0;

				if (n < MIN_N || n > MAX_N) {
					System.exit(1);
				}

				// Each node
				while (n > 0) {
					int id = sc.nextInt();
					int sum = sc.nextInt();

					if (id < MIN_ID || id > MAX_ID) {
						System.exit(1);
					}

					idTotal += id;
					sumTotal += sum;
					n--;
				}
				// Difference is root id, as it will not be included in any sum
				rootId = idTotal - sumTotal;
				System.out.println(rootId);
				t--;
			}
		}
	}

}
