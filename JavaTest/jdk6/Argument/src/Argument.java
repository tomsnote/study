package com.test.argument;

public class Argument {

	int size = 10000;

	public static void main(String[] args) throws Exception {
		// 로드한 상태에서
		Argument test = new Argument();
		test.test1();
//		test.test2();
	}

	private void test1() throws Exception {
		System.gc();
		String[] args = { "s", "c", "f" };
		double div = 0.001;
		double start = System.nanoTime();
		long preMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		// ====================================================================================================
		String[] options = new String[size];
		for (int i = 0; i < size; i++)
			options[i] = Character.toString((char) ('a' + i));
//		Set<String> tree = new TreeSet<String>();

		// 메모리 로드
//		for (String opt : options) {
//			tree.add(opt);
//		}

		// 옵션별로 로드된 메모리 확인
		for (String arg : args) {
			for (String opt : options)
				if (opt.equals(arg))
					System.out.println(arg);
		}

		System.gc();
		// ====================================================================================================
		long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		double end = (System.nanoTime() - start) * div;
		System.out.println("메모리 : " + (preMemory - afterMemory) * div);
		System.out.println("시간 : " + end + "us");
	}

	void test2() throws Exception {
		System.gc();
		String[] args = { "s", "c", "f" };

		double div = 0.001;
		double start = System.nanoTime();
		long preMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		// ====================================================================================================
		for (String arg : args) {
			for (int i = 0; i < size; i++) {
				if (arg.equals(Character.toString((char) ('a' + i))))
					System.out.println(arg);
			}
		}

		System.gc();
		// ====================================================================================================
		long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		double end = (System.nanoTime() - start) * div;
		System.out.println("메모리 : " + (preMemory - afterMemory) * div);
		System.out.println("시간 : " + end + "us");
	}

}
