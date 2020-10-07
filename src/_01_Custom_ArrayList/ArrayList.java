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
		T[] ArrayT2=(T[]) new Object[arrayT.length+1];
		for(int i=0;i<arrayT.length;i++) {
			ArrayT2[i]=arrayT[i];
		}
		ArrayT2[arrayT.length]=val;
		arrayT	=ArrayT2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] ArrayT2=(T[]) new Object[arrayT.length+1];
		for(int i=0;i<loc;i++) {
			ArrayT2[i]=arrayT[i];
		}
		for(int i=loc;i<arrayT.length;i++) {
			ArrayT2[i+1]=arrayT[i];
		}
		ArrayT2[loc]=val;
		arrayT=ArrayT2;
	}
	
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] ArrayT2=(T[]) new Object[arrayT.length];
		for(int i=0;i<loc;i++) {
			ArrayT2[i]=arrayT[i];
		}
		for(int i=loc+1;i<arrayT.length;i++) {
			ArrayT2[i]=arrayT[i];
		}
		ArrayT2[loc]=val;
		arrayT=ArrayT2;
	}
	
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] ArrayT2=(T[]) new Object[arrayT.length-1];
		for(int i=0;i<loc;i++) {
			ArrayT2[i]=arrayT[i];
		}
		for(int i=loc;i<arrayT.length-1;i++) {
			ArrayT2[i]=arrayT[i+1];
		}
		arrayT=ArrayT2;
	}
	
	public boolean contains(T val) {
		boolean result=false;
		for(T sub:arrayT) {
			if(sub==val) {
				result=true;
			}
		}
		return result;
		
	}
public int size(){
		
		return arrayT.length;
}
}