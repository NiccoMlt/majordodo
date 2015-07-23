/*
 Licensed to Diennea S.r.l. under one
 or more contributor license agreements. See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership. Diennea S.r.l. licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.

 */
package majordodo.embedded;

import java.util.HashMap;
import java.util.Map;

/**
 * utility
 *
 * @author enrico.olivelli
 */
public abstract class AbstractEmbeddedServiceConfiguration {

    public static String KEY_ZKADDRESS = "zk.address";
    public static String KEY_ZKSESSIONTIMEOUT = "zk.sessiontimeout";
    public static String KEY_ZKPATH = "zk.path";

    public static final String MODE_SIGLESERVER = "singleserver";
    public static final String MODE_CLUSTERED = "clustered";
    public static final String MODE_JVMONLY = "jvmonly";

    public static final String KEY_MODE = "mode";

    private final Map<String, Object> properties = new HashMap<>();

    public Map<String, Object> getProperties() {
        return properties;
    }

    public String getStringProperty(String key, String defaultValue) {
        Object value = properties.get(key);
        if (value == null) {
            return defaultValue;
        }
        return value.toString();
    }

    public int getIntProperty(String key, int defaultValue) {
        Object value = properties.get(key);
        if (value == null) {
            return defaultValue;
        }
        return Integer.parseInt(value.toString());
    }
}
