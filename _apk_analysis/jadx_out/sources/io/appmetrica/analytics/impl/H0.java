package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes7.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f65301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f65304f;

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i10, String str3, String str4) {
        this.f65299a = str;
        this.f65300b = str2;
        this.f65301c = counterConfigurationReporterType;
        this.f65302d = i10;
        this.f65303e = str3;
        this.f65304f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return tn.p.f(this.f65299a, h02.f65299a) && tn.p.f(this.f65300b, h02.f65300b) && this.f65301c == h02.f65301c && this.f65302d == h02.f65302d && tn.p.f(this.f65303e, h02.f65303e) && tn.p.f(this.f65304f, h02.f65304f);
    }

    public final int hashCode() {
        int iHashCode = (this.f65303e.hashCode() + ((Integer.hashCode(this.f65302d) + ((this.f65301c.hashCode() + ((this.f65300b.hashCode() + (this.f65299a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f65304f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f65299a + ", packageName=" + this.f65300b + ", reporterType=" + this.f65301c + ", processID=" + this.f65302d + ", processSessionID=" + this.f65303e + ", errorEnvironment=" + this.f65304f + ')';
    }
}
