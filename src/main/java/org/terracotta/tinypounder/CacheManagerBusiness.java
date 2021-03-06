/*
 * Copyright Terracotta, Inc.
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
package org.terracotta.tinypounder;

import java.util.Collection;

public interface CacheManagerBusiness {
  Collection<String> retrieveCacheNames();

  void createCache(String alias, CacheConfiguration cacheConfiguration);

  void close();

  void destroy();

  void destroyCache(String alias);

  void removeCache(String alias);

  void clearCache(String alias);

  String retrieveHumanReadableConfiguration();

  void initializeCacheManager(String terracottaServerUrl, String cmName, String tinyPounderDiskPersistenceLocation, String defaultOffheapResource, String diskResource, String securityPath);

  boolean isCacheManagerAlive();

  String getStatus();

  void updatePoundingIntensity(String cacheAlias, int poundingIntensity);

  int retrievePoundingIntensity(String cacheAlias);
}
