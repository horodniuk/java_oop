package academy.devonline.java.structures;

class DynaArrayTest {
    public static void main(String[] args) {

        DynaArray array = new DynaArray();
        array.add(new int[]{4, 5, 6});


      //  System.out.println(array.get(50))
        //  System.out.println(array.get(1));

        array.set(5, 100);
        System.out.println(array);

        array.set(2, 100);
        System.out.println(array);


    }


}

