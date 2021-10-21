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

package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.Accaunt;
import academy.devonline.java.section041_oop.restore.AccountRepository;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */
public final class FromRAMAccauntRepository implements AccountRepository {

    private DefaultAccaunt[] accaunts = {
            new DefaultAccaunt("test1@devonline.academy", true),
            new DefaultAccaunt("test2@devonline.academy", false)

    };

    @Override
    public Accaunt findByEmail(String email) {
        for (DefaultAccaunt account: accaunts) {
            if (email.equals(account.getEmail())){
                return account;
            }
        }
        return null;
    }

    @Override
    public void update(Accaunt accaunt) {
// do nothing
    }
}
