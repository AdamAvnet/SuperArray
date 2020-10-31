public class SuperArray {

	private String[] data;
	private int size;

	public SuperArray(){
		data = new String[10];
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean add(String element){
		if(size == data.length)
			resize();
		data[size] = element;
		size += 1;
		return true;
	}

	public String get(int index){
		return data[index];
	}

	public String set(int index, String element){
		String oldvalue = data[index];
		data[index] = element;
		return oldvalue;
	}

	private void resize(){
		String[] newdata = new String[2 * data.length];
		for(int i = 0; i < data.length; i++){
			newdata[i] = data[i];
		}
		data = newdata;
	}
}

	