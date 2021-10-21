/*
 *  Copyright 2021 http://devonline.academy
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package academy.devonline.java.practice.lesson6;

import java.util.LinkedList;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class Fraction extends Number {
    private int num;
    private int den;

    private Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        normalize();
    }

    public void normalize() {
        if (den <= 0) {
            num *= -1;
            den *= -1;
        }
    }

    private double toDouble() {
        return (double) num / den;
    }

    public String toString() {
        return num + "/" + den;
    }

    public boolean isImproper() {
        return (((num < 0 )? -num : num)) >= den;
    }

    private boolean isFraction() {
        return (num % den != 0);
    }

    public Fraction multiply(Fraction secondArgument) {
        return new Fraction(this.num * secondArgument.num, this.den * secondArgument.den);
    }
    // 1/2 : 1/3   ->  1/2 * 3/1
    public Fraction devide(Fraction secondArgument) {
        return multiply(new Fraction (secondArgument.den, secondArgument.num) );
    }


    // 2/3 + 4/5 =  2 * 5 + 4 * 3 / 3 * 5
    public Fraction add(Fraction secondArgument) {
        return new Fraction(num * secondArgument.den + den * secondArgument.num, den * secondArgument.den
        );
    }
    public Fraction negate() {
        return new Fraction(-num, den);
    }

    // 2/3 + 4/5 =  2 * 5 - 4 * 3 / 3 * 5
    public Fraction subtract(Fraction secondArgument) {
        return add (secondArgument.negate());
    }





    public static void main(String[] args) {

        Fraction fraction = new Fraction(1, 3);
        Fraction fraction1 = new Fraction(5, 4);
        Fraction fraction2 = new Fraction(-4, 3);

     /*   System.out.println(new Fraction(1, 3).isImproper());  // 1/3
        System.out.println(new Fraction(-4, 3).isImproper());// 1/3

        System.out.println("--------------------------");
        System.out.println(new Fraction(-1, 3).isFraction()); // true
        System.out.println(new Fraction(4, 3).isFraction()); // true
*/
      /*  System.out.println(new Fraction(-4, 1).isFraction());
        System.out.println(new Fraction(10, 1).isFraction());
        System.out.println(new Fraction(-10, -2).isFraction());
        System.out.println(new Fraction(10, 20).isFraction());

        System.out.println(new Fraction(1, 2).multiply(new Fraction(1, 3)));*/ // 1/6 // два объекта - переисрользовать нельзя
        Fraction first = new Fraction(1, 2);
        Fraction second = new Fraction(1, 3);
        Fraction result = first.multiply(second);

       /* System.out.println(result); // 1/6
        System.out.println(first.multiply(new Fraction(1,3))); // обращатся могу неогран колличество через first

        System.out.println(new Fraction(1, 2).devide(new Fraction(1, 3)));

        System.out.println(new Fraction(2, 3).add(new Fraction(4, 5)));

        System.out.println(new Fraction(2, 3).subtract(new Fraction(4, 5)));*/

       Fraction number =  new Fraction(1, 6);

        System.out.println(number.intValue());
        System.out.println(number.longValue());
        System.out.println(number.floatValue());
        System.out.println(number.doubleValue());

    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue() ;
    }

    @Override
    public float floatValue() {
        return (float) doubleValue() ;
    }

    @Override
    public double doubleValue() {
        return (double) num / den;
    }
}


