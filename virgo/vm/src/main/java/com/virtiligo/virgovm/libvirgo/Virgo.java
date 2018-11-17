/**
 * Copyright (c) Bugra Kadirhan. All rights reserved.
 * See LICENSE file at root of the repository.
 */
 
package com.virtiligo.virgovm.libvirgo;

import com.virtiligo.virgovm.libvirgo.exceptions.*;

public class Virgo
{
    /**
     * Returns if the feature supported.
     */
    public static native boolean isFeatureSupported(String feature);
    
    /**
     * Toggle feature usage.
     */
    public static native void toggleFeature(String feature, boolean isEnabled)
        throws FeatureNotSupportedException;
        
    /**
     * Returns if the feature is enabled or not.
     * Throws exception if the feature is not supported.
     */
    public static native boolean isFeatureEnabled(String feature)
        throws FeatureNotSupportedException;
}
