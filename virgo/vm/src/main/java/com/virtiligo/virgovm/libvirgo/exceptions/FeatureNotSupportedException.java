/**
 * Copyright (c) Bugra Kadirhan. All rights reserved.
 * See LICENSE file at root of the repository.
 */

package com.virtiligo.virgovm.libvirgo.exceptions;

public class FeatureNotSupportedException extends Exception
{
    private String _featureId;
    
    public FeatureNotSupportedException(String feature)
    {
        _featureId = feature;
    }
    
    public String getFeature()
    {
        return _featureId;
    }
}
