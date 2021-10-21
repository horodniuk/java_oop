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

package academy.devonline.java.section041_oop;

import java.math.BigDecimal;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class ProductTest {
    public static void main(String[] args) {
        Product[] products = null;

        for (Product product : products) {

            //product.price = new BigDecimal("-23.23");
            //product.setPrice(new BigDecimal("-23.23"));

            System.out.println(product.getName());
            System.out.println(product.getDescription());
            System.out.println(product.getPrice());
        }
    }

}
