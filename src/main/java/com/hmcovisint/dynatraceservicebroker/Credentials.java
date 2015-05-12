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

/**
 * A holder for credential information such as the dynatrace server and profile name for the agent
 */
public final class Credentials {

    private final String server;
    private final String profile;

    
	/**
     * Creates a new instance with a given server and profile
     *
     * @param server the server to end point of collector and port
     * @param profile the profile name for the agent
     */
    public Credentials(String server , String profile) {
        this.server = server;
        this.profile = profile;
    }

  

    /**
     * Returns the server 
     *
     * @return the server with hostip:port
     */
    public String getServer() {
		return server;
	}

    /**
     * Returns the profile 
     *
     * @return the profile name
     */
	public String getProfile() {
		return profile;
	}

}
