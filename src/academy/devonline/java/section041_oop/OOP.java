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

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public class OOP {
    public static void main(String[] args) {
        Class1 class1 = new Class1(new Class2(25));
        class1.doSomething1();
    }

    private interface Interface {

        void doSomething2();
    }

    private static class Class1 {

        private Interface object;

        public Class1(Interface object) {
            this.object = object;
        }

        public void doSomething1() {
            object.doSomething2();
        }
    }

    private static class Class2 implements Interface {

        private int value;

        public Class2(int value) {
            this.value = value;
        }

        @Override
        public void doSomething2() {
            System.out.println(value);
        }
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     * java-oop
     */
    public static class JavaBean {
        private String field1;

        private String exampleField2;

        private boolean logicValueField3;

        public String getField1() {
            return field1;
        }

        public String getField4() {
            return "Hello";
        }

        public void setField1(String field1) {
            this.field1 = field1;
        }

        public String getExampleField2() {
            return exampleField2;
        }

        public void setExampleField2(String exampleField2) {
            this.exampleField2 = exampleField2;
        }

        public boolean isLogicValueField3() {
            return logicValueField3;
        }

        public void setLogicValueField3(boolean logicValueField3) {
            this.logicValueField3 = logicValueField3;
        }
    }
}
