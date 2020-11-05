public class Tester {

	public static void main(String[] args){

		SuperArray test = new SuperArray();
		SuperArray test1 = new SuperArray();

		System.out.println();
		String[] words = new String[] {"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta", "Iota", "Kappa"};
		for(int i = 0; i < words.length; i++){
			test.add(words[i]);
		}
		System.out.println("SuperArray 1: " + test);
		test.add("Lambda");
		System.out.println("SuperArray 1 (with Lambda): " + test);
		System.out.println("Size (should return 11): " + test.size());
		System.out.println("Value at index 5 (should return \"Zeta\"): " + test.get(5));
		test.set(4, "Mu");
		System.out.println("SuperArray 1 (with Mu instead of Epsilon): " + test);
		System.out.println("Element at index 4 (should return \"Mu\"): " + test.get(4));
		System.out.println("isEmpty test (should return false): " + test.isEmpty());
		System.out.println("isEmpty test (should return true): " + test1.isEmpty());
		System.out.println("Contains \"Delta\"? " + test.contains("Delta"));
		System.out.println("Contains \"Word\"? " + test.contains("Word"));
		test1.add("Hello");
		test1.add("There");
		System.out.println("SuperArray 2: " + test1);
		test1.clear();
		System.out.println("Cleared SuperArray 2: " + test1);
		System.out.println("SuperArray 1: " + test);
		test.remove(2);
		System.out.println("SuperArray 1 (with 2nd index removed): " + test);
		test.remove(test.size());
		System.out.println("SuperArray 1 (with last index removed): " + test);
		System.out.println("Index of Eta (should return 5): " + test.indexOf("Eta"));
		System.out.println("Index of Computer (should return -1): " + test.indexOf("Computer"));
		String[] arr = test.toArray();
		arr[0] = "Regular Array";
		System.out.println("toArray test (should return \"Regular Array\"): " + arr[0]);
		test.add(4, "Alpha");
		test.add(8, "Beta");
		System.out.println("SuperArray 1 (with added Alpha and Beta): " + test);
		System.out.println("Last index of Alpha (should be 4): " + test.lastIndexOf("Alpha"));
		System.out.println("Last index of Beta (should be 8): " + test.lastIndexOf("Beta"));
		for(int i = 0; i < test.size() - 1; i++){
			test1.add(test.get(i));
		}
		System.out.println("SuperArray2: " + test1);
		System.out.println("Are the two arrays the same? (should be false) " + test.equals(test1));
		test1.add(test.get(test.size() - 1));
		System.out.println("Are the two arrays the same now? (should be true) " + test.equals(test1));

	}
}