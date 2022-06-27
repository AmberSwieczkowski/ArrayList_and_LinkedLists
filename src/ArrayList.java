import java.util.NoSuchElementException;

public class ArrayList<T> {

    //The initial capacity of the ArrayList.
    public static final int INITIAL_CAPACITY = 9;

    private T[] backingArray;
    private int size;

    public ArrayList() {
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the front of the list.
     * 
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Error: cannot add empty or null data");
        }
        if (size == backingArray.length) {
            doubleCapacity();
        }
        for (int i = backingArray.length - 1 ; i > 0; i--) {
            backingArray[i] = backingArray[i-1];
        }
        backingArray[0] = data;
        size++;
    }

    /**
     * Adds the data to the back of the list.
     * 
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Error: cannot add empty or null data");
        }
        if (size == backingArray.length) {
            doubleCapacity();
        }
        backingArray[size] = data;
        size++;
    }

    /**
     * Removes and returns the first data of the list.
     * 
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        if (size == 0) {
            throw new NoSuchElementException("Error: cannot remove data from empty list");
        }
        T prevData = backingArray[0];
        for (int i = 0; i < backingArray.length - 1; i++) {
                backingArray[i] = backingArray[i + 1];
        }
        if (size == backingArray.length) {
            backingArray[size - 1] = null;
        }
        size--;
        return prevData;
    }

    /**
     * Removes and returns the last data of the list.
     * 
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        if (size == 0) {
            throw new NoSuchElementException("Error: cannot remove data from empty list");
        }
        T prevData = backingArray[size - 1];
        backingArray[size - 1] = null;
        size--;
        return prevData;
    }

    /**
     * Returns the backing array of the list.
     * 
     * @return the backing array of the list
     */
    public T[] getBackingArray() {
        return backingArray;
    }

    /**
     * Returns the size of the list.
     * 
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }

    private void doubleCapacity() {
        int doubledCapacity = backingArray.length * 2;
        T[] doubledBackingArray = (T[]) new Object[doubledCapacity];
        for (int i = 0; i < backingArray.length; i++) {
            doubledBackingArray[i] = backingArray[i];
        }
        backingArray = doubledBackingArray;
    }

    // Delete everything below this
    public void print() {
        for (int i = 0; i < backingArray.length; i++) {
            System.out.println(backingArray[i]);
        }
    }

    public void clear() {
        for (int i = 0; i < backingArray.length; i++) {
            backingArray[i] = null;
            System.out.println(backingArray[i]);
        }
    }


}
