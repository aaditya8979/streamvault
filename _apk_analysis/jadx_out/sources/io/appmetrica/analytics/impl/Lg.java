package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Lg implements RemoteConfigMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f65535b;

    public Lg(long j10, long j11) {
        this.f65534a = j10;
        this.f65535b = j11;
    }

    public static Lg a(Lg lg2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = lg2.f65534a;
        }
        if ((i10 & 2) != 0) {
            j11 = lg2.f65535b;
        }
        lg2.getClass();
        return new Lg(j10, j11);
    }

    public final long a() {
        return this.f65534a;
    }

    @NotNull
    public final Lg a(long j10, long j11) {
        return new Lg(j10, j11);
    }

    public final long b() {
        return this.f65535b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lg)) {
            return false;
        }
        Lg lg2 = (Lg) obj;
        return this.f65534a == lg2.f65534a && this.f65535b == lg2.f65535b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f65534a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f65535b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f65535b) + (Long.hashCode(this.f65534a) * 31);
    }

    @NotNull
    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f65534a + ", lastUpdateTime=" + this.f65535b + ')';
    }
}
