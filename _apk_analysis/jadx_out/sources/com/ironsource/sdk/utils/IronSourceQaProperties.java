package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f34008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f34009b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f34008a == null) {
            f34008a = new IronSourceQaProperties();
        }
        return f34008a;
    }

    public static boolean isInitialized() {
        return f34008a != null;
    }

    public Map<String, String> getParameters() {
        return f34009b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f34009b.put(str, str2);
    }
}
