/*
 * Copyright (c) 2009-2017 Mark Struberg and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.microprofile.impl.config.converters;

import javax.annotation.Priority;

import org.eclipse.microprofile.config.spi.Converter;


/**
 * @author <a href="mailto:struberg@apache.org">Mark Struberg</a>
 */
@Priority(1)
public class BooleanConverter implements Converter<Boolean> {

    public static final BooleanConverter INSTANCE = new BooleanConverter();

    @Override
    public Boolean convert(String value) {
        if (value != null) {
            return "TRUE".equalsIgnoreCase(value)
                || "1".equalsIgnoreCase(value)
                || "YES".equalsIgnoreCase(value)
                || "Y".equalsIgnoreCase(value)
                || "JA".equalsIgnoreCase(value)
                || "J".equalsIgnoreCase(value)
                || "OUI".equalsIgnoreCase(value);
        }

        return null;
    }
}