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

package academy.devonline.java.section031_polymorphism;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class SumCalculator    {
    static  long  sum(ArrayElemenentsProvider arrayElemenentsProvider){
        long arraySumm = 0;
        while (arrayElemenentsProvider.hasMoreElement()){
            arraySumm += arrayElemenentsProvider.nextElement();
        }
        return arraySumm;
    }

    public static void main(String[] args) {
       ArrayElemenentsProvider arrayElemenentsProvider = new FromRAMArrayElementsProvider(new int[]{1, 2, 3, 4, 5});
       ArrayElemenentsProvider rederFile = new FromClasspathResourceArrayElementsProvider("data.txt");
        System.out.println(sum(arrayElemenentsProvider));
        System.out.println(sum(rederFile));
    }





}
