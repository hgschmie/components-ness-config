/**
 * Copyright (C) 2012 Ness Computing, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.likeness.config;


import com.google.inject.AbstractModule;

/**
 * Binding configuration to Guice. This is a pretty simple module right now but
 * it might grow over time.
 *
 * To get access to the System configuration, import this module.
 *
 */
public class ConfigModule extends AbstractModule
{
    private final Config config;

    public ConfigModule()
    {
        this.config = Config.getConfig();
    }

    public ConfigModule(final Config config)
    {
        this.config = config;
    }

    @Override
    public void configure()
    {
        bind(Config.class).toInstance(config);
    }

    protected Config getConfig()
    {
        return config;
    }
}
