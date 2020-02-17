/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.extensions.dynamodb.mappingclient.converter.string.bundled;

import java.math.BigDecimal;
import software.amazon.awssdk.annotations.Immutable;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.annotations.ThreadSafe;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.converter.string.StringConverter;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.converter.TypeToken;

/**
 * A converter between {@link BigDecimal} and {@link String}.
 *
 * <p>
 * This converts values using {@link BigDecimal#toString()} and {@link BigDecimal#BigDecimal(String)}.
 */
@SdkPublicApi
@ThreadSafe
@Immutable
public class BigDecimalStringConverter implements StringConverter<BigDecimal> {
    private BigDecimalStringConverter() { }

    public static BigDecimalStringConverter create() {
        return new BigDecimalStringConverter();
    }

    @Override
    public TypeToken<BigDecimal> type() {
        return TypeToken.of(BigDecimal.class);
    }

    @Override
    public BigDecimal fromString(String string) {
        return new BigDecimal(string);
    }
}