public class SuperArray {

	private String[] data;
	private int size;

	public SuperArray(){
		data = new String[10];
		size = 0;
	}

	public SuperArray(int InitialCapacity){
		data = new String[InitialCapacity];
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

	public boolean isEmpty(){
		if(size == 0)
			return true;
		else
			return false;
	}

	public String toString(){
		String output = "[";
		for(int i = 0; i < size; i++){
			output += data[i];
			if( i < size - 1)
				output += ", ";
		}
		output += "]";
		return output;
	}

	public boolean contains(String s){
		for(int i = 0; i < size; i++){
			if(data[i].equals(s))
				return true;
		}
		return false;
	}

	public void clear(){
		data = new String[data.length];
		size = 0;
	}

	public void add(int index, String element){
		if(size == data.length)
			resize();
		for(int i = size; i >= 0; i--){
			if(i > index)
				data[i + 1] = data[i];
			if(i == index)
				data[i] = element;
		}
		size += 1;
	}

	public String remove(int index){
		String value = data[index];
		for(int i = index; i < size - 1; i++){
			data[i] = data[i + 1];
		}
		size -= 1;
		data[size] = null;
		return value;
	}

	public int indexOf(String s){
		for(int i = 0; i < size; i++){
			if(data[i].equals(s))
				return i;
		}
		return -1;
	}

	public String[] toArray(){
		String[] arr = new String[data.length];
		for(int i = 0; i < size; i++){
			arr[i] = data[i];
		}
		return arr;
	}
}

	