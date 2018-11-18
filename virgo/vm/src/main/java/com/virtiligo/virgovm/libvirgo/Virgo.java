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
        
    /**
     * Checks for application tier (paid or free).
     *
     * Checking for paid version at the native side
     *  is required as we build different versions of
     *  the libvirgo depending on the tier.
     *  (we don't compile paid features in free build)
     */
    public static native boolean isPaid();
}
