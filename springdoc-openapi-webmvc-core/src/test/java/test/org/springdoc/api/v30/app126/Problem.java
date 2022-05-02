/*
 *
 *  *
 *  *  *
 *  *  *  * Copyright 2019-2022 the original author or authors.
 *  *  *  *
 *  *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *  * you may not use this file except in compliance with the License.
 *  *  *  * You may obtain a copy of the License at
 *  *  *  *
 *  *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *  *
 *  *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *  * See the License for the specific language governing permissions and
 *  *  *  * limitations under the License.
 *  *  *
 *  *
 *
 */

package test.org.springdoc.api.v30.app126;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

public interface Problem {

    URI DEFAULT_TYPE = URI.create("about:blank");

    /**
     * An absolute URI that identifies the problem type. When dereferenced,
     * it SHOULD provide human-readable documentation for the problem type
     * (e.g., using HTML). When this member is not present, its value is
     * assumed to be "about:blank".
     *
     * @return an absolute URI that identifies this problem's type
     */
    default URI getType() {
        return DEFAULT_TYPE;
    }

    /**
     * A short, human-readable summary of the problem type. It SHOULD NOT
     * change from occurrence to occurrence of the problem, except for
     * purposes of localisation.
     *
     * @return a short, human-readable summary of this problem
     */
    default String getTitle() {
        return null;
    }

    /**
     * The HTTP status code generated by the origin server for this
     * occurrence of the problem.
     *
     * @return the HTTP status code
     */
    default Integer getStatus() {
        return null;
    }

    /**
     * A human readable explanation specific to this occurrence of the problem.
     *
     * @return A human readable explaination of this problem
     */
    default String getDetail() {
        return null;
    }

    /**
     * An absolute URI that identifies the specific occurrence of the problem.
     * It may or may not yield further information if dereferenced.
     *
     * @return an absolute URI that identifies this specific problem
     */
    default URI getInstance() {
        return null;
    }

    /**
     * Optional, additional attributes of the problem. Implementations can choose to ignore this in favor of concrete,
     * typed fields.
     *
     * @return additional parameters
     */
    default Map<String, Object> getParameters() {
        return Collections.emptyMap();
    }

}