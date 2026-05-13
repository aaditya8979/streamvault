package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* JADX INFO: loaded from: classes7.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f65265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f65269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H0 f65270f;

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, H0 h02) {
        this.f65265a = nativeCrashSource;
        this.f65266b = str;
        this.f65267c = str2;
        this.f65268d = str3;
        this.f65269e = j10;
        this.f65270f = h02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return this.f65265a == g02.f65265a && tn.p.f(this.f65266b, g02.f65266b) && tn.p.f(this.f65267c, g02.f65267c) && tn.p.f(this.f65268d, g02.f65268d) && this.f65269e == g02.f65269e && tn.p.f(this.f65270f, g02.f65270f);
    }

    public final int hashCode() {
        return this.f65270f.hashCode() + ((Long.hashCode(this.f65269e) + ((this.f65268d.hashCode() + ((this.f65267c.hashCode() + ((this.f65266b.hashCode() + (this.f65265a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f65265a + ", handlerVersion=" + this.f65266b + ", uuid=" + this.f65267c + ", dumpFile=" + this.f65268d + ", creationTime=" + this.f65269e + ", metadata=" + this.f65270f + ')';
    }
}
