/*
 * This code is to be used exclusively in connection with Ping Identity Corporation software or services. 
 * Ping Identity Corporation only offers such software or services to legal entities who have entered into 
 * a binding license agreement with Ping Identity Corporation.
 *
 * Copyright 2024 Ping Identity Corporation. All Rights Reserved
 */
package org.forgerock.am.marketplace.pingone;


/**
 * PingOne protect evaluation Flow Type.
 */
public enum FlowType {

    /**
     * Registration.
     */
    REGISTRATION,
    /**
     * Authentication.
     */
    AUTHENTICATION,
    /**
     * Access.
     */
    ACCESS,
    /**
     * Authorization.
     */
    AUTHORIZATION,
    /**
     * Transaction.
     */
    TRANSACTION;

}