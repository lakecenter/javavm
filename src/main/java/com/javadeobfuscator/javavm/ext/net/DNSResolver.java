/*
 * Copyright 2017 Sam Sun <github-contact@samczsun.com>
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

package com.javadeobfuscator.javavm.ext.net;

import java.net.InetAddress;
import java.util.List;

/**
 * Represents a DNS resolver
 */
public interface DNSResolver {
    /**
     * Resolve the given {@param host} into one or more {@link InetAddress}. The resolved InetAddress-es should be
     * added into the {@param result} list
     *
     * @return true to continue resolving with remaining resolvers, or false to continue resolving
     */
    boolean resolve(String host, List<InetAddress> result);
}