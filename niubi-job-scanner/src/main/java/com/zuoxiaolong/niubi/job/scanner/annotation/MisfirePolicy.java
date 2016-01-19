/*
 * Copyright 2002-2016 the original author or authors.
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

package com.zuoxiaolong.niubi.job.scanner.annotation;

/**
 * 当容器处于暂停时,对于错过的任务的执行策略.
 *
 * @author Xiaolong Zuo
 * @since 16/1/9 04:24
 */
public enum MisfirePolicy {

    DoNothing {
        @Override
        public int getIntValue() {
            return 2;
        }
    }, IgnoreMisfires {
        @Override
        public int getIntValue() {
            return -1;
        }
    }, FireAndProceed {
        @Override
        public int getIntValue() {
            return 1;
        }
    }, None {
        @Override
        public int getIntValue() {
            return 0;
        }
    };

    public abstract int getIntValue();

}
