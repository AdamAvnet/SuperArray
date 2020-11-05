public class Demo{
	public static void removeDuplicates(SuperArray s){
		for(int i = s.size() - 1;  i >= 0; i--){
			if(s.indexOf(s.get(i)) != s.lastIndexOf(s.get(i)))
				s.remove(i);
		}

	}
	
	public static SuperArray findOverlap(SuperArray a, SuperArray b){
		SuperArray sarr = new SuperArray();
		for(int i = 0; i < a.size(); i++){
			if(b.contains(a.get(i)) && !(sarr.contains(a.get(i))))
				sarr.add(a.get(i));
		}
		return sarr;
	}

	public static SuperArray zip(SuperArray a, SuperArray b){
		SuperArray sarr = new SuperArray();
		for(int i = 0; i < a.size() && i < b.size(); i++){
				sarr.add(a.get(i));
				sarr.add(b.get(i));
		}
		if(b.size() > a.size()){
			for(int i = a.size(); i < b.size(); i++){
				sarr.add(b.get(i));
			}
		}else{
			for(int i = b.size(); i < a.size(); i++){
				sarr.add(a.get(i));
			}
		}
		return sarr;
	}

	public static void main(String[] args){
		SuperArray test = new SuperArray();
		SuperArray test1 = new SuperArray();
		String[] words = new String[] {"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Delta", "Alpha"};
		for(int i = 0; i < words.length; i++){
			test.add(words[i]);
		}
		String[] words1 = new String[] {"one", "two", "Gamma", "three", "Alpha", "two", "four", "one"};
		for(int i = 0; i < words1.length; i++){
			test1.add(words1[i]);
		} 
		System.out.println();
		System.out.println("SuperArray1: " + test);
		System.out.println("SuperArray2: " + test1);
		System.out.println("findOverlap test: " + findOverlap(test, test1));
		System.out.println("zip test: " + zip(test, test1));
		removeDuplicates(test);
		removeDuplicates(test1);
		System.out.println("SuperArray1 without duplicates: " + test);
		System.out.println("SuperArray2 without duplicates: " + test1);
	}
}