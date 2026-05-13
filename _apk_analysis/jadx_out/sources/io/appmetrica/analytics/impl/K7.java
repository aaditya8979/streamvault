package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class K7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f65471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65473c;

    public K7(String str, HashMap map, String str2) {
        this.f65472b = str;
        this.f65471a = map;
        this.f65473c = str2;
    }

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f65471a + ", mDeeplink='" + this.f65472b + "', mUnparsedReferrer='" + this.f65473c + "'}";
    }
}
