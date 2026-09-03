/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *   2011-12-28 - Mark Struberg & Gerhard Petracek
 *      Initially authored in Apache DeltaSpike as ConfigResolver fb0131106481f0b9a8fd
 *   2015-04-30 - Ron Smeral
 *      Typesafe Config authored in Apache DeltaSpike 25b2b8cc0c955a28743f
 *   2016-07-14 - Mark Struberg
 *      Extracted the Config part out of Apache DeltaSpike and proposed as Microprofile-Config
 *   2016-11-14 - Emily Jiang / IBM Corp
 *      Experiments with separate methods per type, JavaDoc, method renaming
 *   2018-04-04 - Mark Struberg, Manfred Huber, Alex Falb, Gerhard Petracek
 *      ConfigSnapshot added. Initially authored in Apache DeltaSpike fdd1e3dcd9a12ceed831dd
 *      Additional reviews and feedback by Tomas Langer.
 */

/**
 * MicroProfile Config API.
 *
 * <p>
 * {@code @ConfigProperty} and {@code @ConfigProperties} are meta-annotated with
 * {@code jakarta.inject.Qualifier} / {@code jakarta.enterprise.util.Nonbinding} and
 * {@code ConfigProperties.Literal} extends {@code AnnotationLiteral}, so the Inject and CDI modules
 * are required transitively: consumers must read them for the API to be fully resolvable on the
 * module path.
 */
module org.eclipse.microprofile.config {
    requires transitive jakarta.cdi;
    requires transitive jakarta.inject;

    exports org.eclipse.microprofile.config;
    exports org.eclipse.microprofile.config.inject;
    exports org.eclipse.microprofile.config.spi;

    uses org.eclipse.microprofile.config.spi.ConfigProviderResolver;
}
