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
		System.out.println("Super Array 1 (with 2nd index removed): " + test);
		System.out.println("Index of Eta (should return 5): " + test.indexOf("Eta"));
		System.out.println("Index of Computer (should return -1): " + test.indexOf("Computer"));
		String[] arr = test.toArray();
		arr[0] = "Regular Array";
		System.out.println("toArray test (should return \"Regular Array\"): " + arr[0]);
	}
}