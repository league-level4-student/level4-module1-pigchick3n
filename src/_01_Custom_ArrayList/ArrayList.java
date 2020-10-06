package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[]arrayT;
	public ArrayList() {
		arrayT=(T[]) new Object[0];
	}
	public T get(int loc) throws IndexOutOfBoundsException {
		return arrayT[loc];
		
	}
	
	public void add(T val) {
		T[] duplArr=(T[]) new Object[arrayT.length+1];
		for(int i=0;i<arrayT.length;i++) {
			duplArr[i]=arrayT[i];
		}
		duplArr[arrayT.length]=val;
		arrayT=duplArr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}