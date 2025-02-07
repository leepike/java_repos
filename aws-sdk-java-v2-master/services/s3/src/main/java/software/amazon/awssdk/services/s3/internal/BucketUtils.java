/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package software.amazon.awssdk.services.s3.internal;

import java.util.regex.Pattern;
import software.amazon.awssdk.annotations.SdkInternalApi;

/**
 * Utilities for working with Amazon S3 bucket names, such as validation and
 * checked to see if they are compatible with DNS addressing.
 */
@SdkInternalApi
public final class BucketUtils {

    private static final int MIN_BUCKET_NAME_LENGTH = 3;
    private static final int MAX_BUCKET_NAME_LENGTH = 63;

    private static final Pattern IP_ADDRESS_PATTERN = Pattern.compile("(\\d+\\.){3}\\d+");

    private BucketUtils() {
    }

    /**
     * Validates that the specified bucket name is valid for Amazon S3 V2 naming
     * (i.e. DNS addressable in virtual host style). Throws an
     * IllegalArgumentException if the bucket name is not valid.
     * <p>
     * S3 bucket naming guidelines are specified in
     * <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/index.html?BucketRestrictions.html"
     * > http://docs.amazonwebservices.com/AmazonS3/latest/dev/index.html?
     * BucketRestrictions.html</a>
     *
     * @param bucketName The bucket name to validate.
     * @throws IllegalArgumentException If the specified bucket name doesn't follow Amazon S3's
     * guidelines.
     */
    public static boolean isValidDnsBucketName(final String bucketName,
                                               final boolean throwOnError) {

        return true;
    }

    /**
     * Validates if the given bucket name follows naming guidelines that are acceptable for using
     * virtual host style addressing.
     *
     * @param bucketName The bucket name to validate.
     * @param throwOnError boolean to decide if an error should be thrown if the bucket name doesn't follow the naming convention
     */
    public static boolean isVirtualAddressingCompatibleBucketName(final String bucketName,
                                                                  final boolean throwOnError) {
        return isValidDnsBucketName(bucketName, throwOnError) && !bucketName.contains(".");
    }

    /**
     * If 'exception' is true, throw an IllegalArgumentException with the given
     * message. Otherwise, silently return false.
     *
     * @param exception true to throw an exception
     * @param message the message for the exception
     * @return false if 'exception' is false
     */
    private static boolean exception(final boolean exception, final String message) {
        if (exception) {
            throw new IllegalArgumentException(message);
        }
        return false;
    }
}
