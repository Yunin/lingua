/*
 * Copyright 2018-2019 Peter M. Stahl pemistahl@googlemail.com
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

package com.github.pemistahl.lingua.report.lingua

import com.github.pemistahl.lingua.report.config.AbstractDanishDetectionAccuracyReport
import com.github.pemistahl.lingua.report.LanguageDetectorImplementation.LINGUA
import org.junit.jupiter.api.AfterAll

class DanishDetectionAccuracyReport : AbstractDanishDetectionAccuracyReport(LINGUA) {

    @AfterAll
    fun afterAll() = logger.info(statisticsReport())
}
