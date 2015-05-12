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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.util.UUID;

@Configuration
public class CatalogFactory {

    @Bean
    Catalog catalog(@Value("${serviceBroker.serviceId}") String serviceId,
                    @Value("${serviceBroker.planId}") String planId) {
        // @formatter:off
        return new Catalog()
            .service()
                .id(UUID.fromString(serviceId))
                .name("dynatrace")
                .description("Manage and monitor your apps")
                .bindable(true)
                .tags("dynatrace", "management", "monitoring", "apm")
                .metadata()
                    .displayName("DynaTrace")
                    .imageUrl(URI.create("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTiBIZfa-LBmUTk_w78c3n-RHFRfTeLDVd-Mog1xh6cVGbxxud6gQ"))
                    .longDescription("DynaTracce is the all-in-one web app performance tool that lets you see " +
                                     "performance from the end user experience, through servers, and down to the " +
                                     "line of code.")
                    .providerDisplayName("DYNATRACE LLC.")
                    .documentationUrl(URI.create("http://www.dynatrace.com/en/resources/webinars.html"))
                    .supportUrl(URI.create("https://support.dynatrace.com/"))
                    .and()
                .plan()
                    .id(UUID.fromString(planId))
                    .name("standard")
                    .description("Broker for static Dynatrace credentials")
                    .metadata()
                        .bullets("JVM Performance analyzer", "Database call response time & throughput",
                                 "Performance data API access")
                        .displayName("Standard")
                        .and()
                    .free(true)
                    .and()
                .and();
        // @formatter:on
    }

}
