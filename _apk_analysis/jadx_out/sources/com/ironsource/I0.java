package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29570a;

    public I0(long j10) {
        this.f29570a = j10;
    }

    public static /* synthetic */ I0 a(I0 i02, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = i02.f29570a;
        }
        return i02.a(j10);
    }

    public final long a() {
        return this.f29570a;
    }

    @NotNull
    public final I0 a(long j10) {
        return new I0(j10);
    }

    public final long b() {
        return this.f29570a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I0) && this.f29570a == ((I0) obj).f29570a;
    }

    public int hashCode() {
        return Long.hashCode(this.f29570a);
    }

    @NotNull
    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f29570a + ")";
    }
}
