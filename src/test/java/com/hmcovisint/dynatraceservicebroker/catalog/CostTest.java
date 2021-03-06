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

package com.hmcovisint.dynatraceservicebroker.catalog;

import com.hmcovisint.dynatraceservicebroker.AbstractSerializationTest;
import com.hmcovisint.dynatraceservicebroker.catalog.Cost;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public final class CostTest extends AbstractSerializationTest<Cost> {

    @Override
    protected void assertContents(Map m) {
        assertEquals(getAmount(), m.get("amount"));
        assertEquals(m.get("unit"), "TEST-UNIT");
    }

    @Override
    protected Cost getInstance() {
        return new Cost(null)
                .amount("currency-1", 1.0)
                .amount("currency-2", 2.0)
                .unit("TEST-UNIT");
    }

    private Map<String, Double> getAmount() {
        Map<String, Double> amount = new HashMap<>();
        amount.put("currency-1", 1.0);
        amount.put("currency-2", 2.0);

        return amount;
    }

}
