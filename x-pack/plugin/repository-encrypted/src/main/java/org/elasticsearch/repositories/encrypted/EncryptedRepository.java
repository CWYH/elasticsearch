/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.repositories.encrypted;

public class EncryptedRepository {
    static final int GCM_TAG_LENGTH_IN_BYTES = 16;
    static final int GCM_IV_LENGTH_IN_BYTES = 12;
    static final int AES_BLOCK_SIZE_IN_BYTES = 128;
    static final String GCM_ENCRYPTION_SCHEME = "AES/GCM/NoPadding";
    static final long PACKET_START_COUNTER = Long.MIN_VALUE;
    static final int MAX_PACKET_LENGTH_IN_BYTES = 1 << 30;
}
