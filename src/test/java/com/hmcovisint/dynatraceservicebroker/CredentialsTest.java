/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hmcovisint.dynatraceservicebroker;

import java.io.IOException;
import java.util.Map;

import com.hmcovisint.dynatraceservicebroker.Credentials;

import static org.junit.Assert.assertEquals;

public final class CredentialsTest extends AbstractSerializationTest<Credentials> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals("54.200.253.18:9998", m.get("server"));
        assertEquals("hm-dyna-agent", m.get("profile"));
    }

    @Override
    protected Credentials getInstance() {
        return new Credentials("54.200.253.18:9998", "hm-dyna-agent");
    }

}
