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

import academy.devonline.java.section021_inheritance.SuperMethod;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class LateBinding {
    public static void main(String[] args) throws Exception {
       // String fullClassName = new Scanner (System.in).next();

        Parent parent =  new Child2();
        parent.doSomething();

    }

    public static class Parent {
        void doSomething(){
            System.out.println("Parent.doSomething");
        }
    }

    public static class Child1 extends Parent {
        //  @Override
        void doSomething(){
            System.out.println("Child1.doSomething");
        }
    }

   public static class Child2 extends Parent {
        //  @Override
        void doSomething(){
            System.out.println("Child2.doSomething");
        }
    }




}
