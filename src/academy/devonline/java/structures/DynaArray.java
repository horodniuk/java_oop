package academy.devonline.java.structures;

import java.util.Arrays;

public final class DynaArray extends BaseDataStructure {
    private int[] result;

    public DynaArray(int size) {
        result = new int[size];
    }

    public DynaArray() {
        this(0);
    }

    @Override
    public void add(int value) {
        if (count == result.length) {
            grow(result.length == 0 ? 5 : result.length * 2);
        }
        result[count++] = value;
    }

    @Override
    public void add(int[] array) {
        add(array, array.length);
    }

    @Override
    public void add(DynaArray dynaArray) {
        add(dynaArray.result, dynaArray.count);
    }

    private void add(int[] array, int length) {
        if (result.length - count < length) {
            grow(count + length);
        }
        System.arraycopy(array, 0, result, count, length);
        count += length;
    }


    private void grow(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }
    @Override
    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }


    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        for (int i = 0; i < count; i++) {
            stringBuilder.append(result[i]);
            if (i < count - 1) {
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append(']').toString();
    }

    @Override
    public boolean remove(int value) {
        int index = indexOf(value);
        if (index != -1) {
            removeByIndex(index);
            return true;
        } else {
            return false;
        }
    }

    private void removeByIndex(int index) {
        if (index < count - 1) {
            System.arraycopy(result, index + 1, result, index, count - 1 - index);
        }
        count--;
    }

    private int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (result[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public boolean contains(int value) {
        return indexOf(value) != -1;
    }


    public void add(LinkedList list) {
        add(list.toArray());  // с помощью toArray преобразовуем в статический массив
    }


    public int get(int index) {
        if (count > index && index >= 0) {
            return result[index];
        } else {
            return -1;
        }
    }


    public void set(int index, int value) {
        if (count > index && index >= 0) {
            result[index] = value;
        }
    }

}