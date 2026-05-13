package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes9.dex */
public final class Ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66302b;

    public Ze(String str, String str2) {
        this.f66301a = str;
        this.f66302b = a(str2);
    }

    public final String a(String str) {
        if (str == null) {
            return this.f66301a;
        }
        return this.f66301a + str;
    }
}
