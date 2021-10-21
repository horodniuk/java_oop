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

package academy.devonline.java.section041_oop.restore;

/**
 * @author devonline
 * @link http://devonline.academy/java
 * java-oop
 */



public final class PasswordRestServise {
    final   private AccountRepository accountRepository;
    final   private AccountNotFoundByEmailHandler accountNotFoundByEmailHandler;
    final   private AccauntNotActiveHandler accauntNotActiveHandler;
    final   private VerificationCodeGenerator verificationCodeGenerator;
    final   private EmailServise emailServise;

    public PasswordRestServise(final AccountRepository accountRepository,
                               final AccountNotFoundByEmailHandler accountNotFoundByEmailHandler,
                               final AccauntNotActiveHandler accauntNotActiveHandler,
                               final VerificationCodeGenerator verificationCodeGenerator,
                               final EmailServise emailServise) {
        this.accountRepository = accountRepository;
        this.accountNotFoundByEmailHandler = accountNotFoundByEmailHandler;
        this.accauntNotActiveHandler = accauntNotActiveHandler;
        this.verificationCodeGenerator = verificationCodeGenerator;
        this.emailServise = emailServise;
    }

    public String reset(final String email) {
        final Accaunt accaunt = accountRepository.findByEmail(email);
        if (accaunt == null) {
            return accountNotFoundByEmailHandler.handle(email);
        } else if (accaunt.isNotActive()) {
            final String result = accauntNotActiveHandler.handle(accaunt);
            if (result != null) {
                return result;
            }
        }

        final String code = verificationCodeGenerator.generate();
        accaunt.setCode(code);
        accountRepository.update(accaunt);
        emailServise.sendPaswordResetEmail(email, code);
        return "password_reset_success.html";

    }
}
