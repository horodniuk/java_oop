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
public class WhyInstanceOfIsBadPractice {
    public static void main(String[] args) {
      Parent parent = new Child1() {

      };
      parent.doSomsing();
     /* if (parent instanceof Child1){
          System.out.println("Child1");
      }
        if (parent instanceof Child2){
            System.out.println("Child2");
        }*/
    }

    public interface Parent{
        public void doSomsing();
    }

    public static class Child1 implements Parent{

        @Override
        public void doSomsing() {
            System.out.println("Child1");
        }
    }

    public static class Child2 implements Parent{
        @Override
        public void doSomsing() {
            System.out.println("Child2");
        }
    }
}
