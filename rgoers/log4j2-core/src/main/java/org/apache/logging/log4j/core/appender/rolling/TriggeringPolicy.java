/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.core.appender.rolling;

import org.apache.logging.log4j.core.LogEvent;

/**
 * A <code>TriggeringPolicy</code> controls the conditions under which rollover
 * occurs. Such conditions include time of day, file size, an
 * external event, the log request or a combination thereof.
 */
public interface TriggeringPolicy {

    public void initialize(final RollingFileManager manager);

    /**
     * Determines if a rollover may be appropriate at this time.  If
     * true is returned, RolloverPolicy.rollover will be called but it
     * can determine that a rollover is not warranted.
     *
     * @param event   A reference to the currently event.
     * @param manager The RollingFileManager for the active file.
     * @return true if a rollover should occur.
     */
    public boolean isTriggeringEvent(final LogEvent event);
}