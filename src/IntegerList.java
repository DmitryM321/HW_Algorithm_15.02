public interface IntegerList <Integer> {

     Integer add(Integer item);
     java.lang.Integer add(int index, int item);

     Integer set(int index, int item);

     Integer remove(Integer item);

     Integer remove(int item);

     boolean contains(Integer item);

     int indexOf(Integer item);

     int lastIndexOf(Integer item);

     Integer get(int index);

     boolean equals(IntegerList otherList);

     int size();

     boolean isEmpty();

     void clear();

     Integer[] toArray();

}
