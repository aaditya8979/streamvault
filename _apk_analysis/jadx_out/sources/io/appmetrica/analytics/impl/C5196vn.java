package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5196vn implements TempCacheStorage.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f67868d;

    public C5196vn(long j10, @NotNull String str, long j11, @NotNull byte[] bArr) {
        this.f67865a = j10;
        this.f67866b = str;
        this.f67867c = j11;
        this.f67868d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(C5196vn.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C5196vn c5196vn = (C5196vn) obj;
        if (this.f67865a == c5196vn.f67865a && tn.p.f(this.f67866b, c5196vn.f67866b) && this.f67867c == c5196vn.f67867c) {
            return Arrays.equals(this.f67868d, c5196vn.f67868d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.f67868d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f67865a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.f67866b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f67867c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f67868d) + ((Long.hashCode(this.f67867c) + ((this.f67866b.hashCode() + (Long.hashCode(this.f67865a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TempCacheEntry(id=" + this.f67865a + ", scope='" + this.f67866b + "', timestamp=" + this.f67867c + ", data=array[" + this.f67868d.length + "])";
    }
}
