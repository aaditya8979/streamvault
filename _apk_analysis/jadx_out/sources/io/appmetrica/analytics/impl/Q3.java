package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes.dex */
public final class Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f65785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f65787e;

    public Q3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f65783a = str;
        this.f65784b = str2;
        this.f65785c = num;
        this.f65786d = str3;
        this.f65787e = counterConfigurationReporterType;
    }

    public static Q3 a(I3 i32) {
        return new Q3(i32.f65350b.getApiKey(), i32.f65349a.f65118a.getAsString("PROCESS_CFG_PACKAGE_NAME"), i32.f65349a.f65118a.getAsInteger("PROCESS_CFG_PROCESS_ID"), i32.f65349a.f65118a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), i32.f65350b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q3.class != obj.getClass()) {
            return false;
        }
        Q3 q32 = (Q3) obj;
        String str = this.f65783a;
        if (str == null ? q32.f65783a != null : !str.equals(q32.f65783a)) {
            return false;
        }
        if (!this.f65784b.equals(q32.f65784b)) {
            return false;
        }
        Integer num = this.f65785c;
        if (num == null ? q32.f65785c != null : !num.equals(q32.f65785c)) {
            return false;
        }
        String str2 = this.f65786d;
        if (str2 == null ? q32.f65786d == null : str2.equals(q32.f65786d)) {
            return this.f65787e == q32.f65787e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f65783a;
        int iHashCode = (this.f65784b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f65785c;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f65786d;
        return this.f65787e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f65783a + "', mPackageName='" + this.f65784b + "', mProcessID=" + this.f65785c + ", mProcessSessionID='" + this.f65786d + "', mReporterType=" + this.f65787e + '}';
    }
}
