/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openflamingo.model.rest;

import java.io.Serializable;

/**
 * File Type Enumeration.
 *
 * @author Byoung Gon, Kim
 * @since 1.0
 */
public enum FileType implements Serializable {

    /**
     * 디렉토리 또는 파일 생성
     */
    DIRECTORY("directory"),

    /**
     * 디렉토리 또는 파일 삭제
     */
    FILE("file");

    /**
     * 문자열 값
     */
    public final String value;

    /**
     * 기본 생성자.
     *
     * @param value Enumeration 문자열 값
     */
    FileType(String value) {
        this.value = value;
    }
}