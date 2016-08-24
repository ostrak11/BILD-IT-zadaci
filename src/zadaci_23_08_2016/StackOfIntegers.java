package zadaci_23_08_2016;

public class StackOfIntegers {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	//no-arg konstruktor
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}
	
	//konstruktor sa velicinom kapaciteta
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	//stavlja novi integer na vrh steka
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	
	//vraca i uklanja gornji element steka
	public int pop() {
		return elements[--size];
	}
	
	//vraca gornji elemenat steka
	public int peek() {
		return elements[size - 1];
	}
	
	//testira da li stek prazan	
	public boolean empty() {
		return size == 0;
	}
	
	//vraca velicinu steka
	public int getSize() {
		return size;
}
	
	
}
