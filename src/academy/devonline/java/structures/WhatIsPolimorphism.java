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

package academy.devonline.java.structures;

import java.util.ArrayList;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class WhatIsPolimorphism {
    public static void main(String[] args) {
        DataStructure productsUser = getAllProductsSelectedByUser(); // получаем ссылку на товар со всеми продуктами
        createOrder(productsUser); // мы хотим создать заказ
    }

    private static DataStructure getAllProductsSelectedByUser() {
        DataStructure dynaArray = new DynaArray();
        for (int i = 0; i < 3; i++) {
            dynaArray.add(i);
        }
        return dynaArray;
    }

    private static void createOrder(DataStructure productsUser) {
        if (productsUser.size() > 5 ){
            if (productsUser.contains(7)){
                System.out.println("price with discond 50%");
            }
            else {
                System.out.println("price with discond 10%");
            }
        } else {
            System.out.println("price without discond");
        }
    }


}
