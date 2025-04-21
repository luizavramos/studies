package com.study.dataStructure.List.Exercise;

public class DynamicArray {
    private int[] fixedArray;
    private int capacity;
    private int _size;

    public DynamicArray() {
        capacity = 10;
        _size = 0;
        fixedArray = new int[capacity];
    }

    public int get(int i) {
        if (i < 0 || i >= _size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return fixedArray[i];
    }

    public void set(int i, int x) {
        if (i < 0 || i >= _size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        fixedArray[i] = x;
    }

    public int size() {
        return _size;
    }

    public void append(int x) {
        if (_size == capacity) {
            resize(capacity * 2);
        }
        fixedArray[_size] = x;
        _size++;
    }

    private void resize(int newCapacity) {
        int[] newFixedSizeArr = new int[newCapacity];
        for (int i = 0; i < _size; i++) {
            newFixedSizeArr[i] = fixedArray[i];
        }
        fixedArray = newFixedSizeArr;
        capacity = newCapacity;
    }

    public void popBack() {
        if (_size == 0) {
            throw new IndexOutOfBoundsException("Pop from empty array");
        }
        _size--;
        if (_size * 4 < capacity && capacity > 10) {
            resize(capacity / 2);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int pop(int i){

        //start with validation
        if(i < 0 || i >= _size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        int x = get(i);

        for (int j = i; j < size() - 1; j++){
            set(j, get(j+1));
        }
        popBack();
        return x;

    }

    public boolean contains(int x){
        for(int i = 0; i < size(); i++){
            if(get(i) == x){
                return true;
            }
        }
        return false;
    }

    public void insert(int i, int x){
        //validation
        if(i < 0 || i> size()){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        append(0); //make space

        for(int j = size() - 1; j > i; j--){
            set(j, get(j-1));
        }
        set(i,x);
    }

    public int remove(int x){
        for(int i = 0; i < size(); i++){
            if(get(i) == x){
                pop(i);
                return i;
            }
        }
        return -1;
    }

}
