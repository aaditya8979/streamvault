package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import s7.m0;

/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f22484e = new u(1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f.a<u> f22485f = new f.a() { // from class: d6.p1
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.u.d(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22488d;

    public u(float f10) {
        this(f10, 1.0f);
    }

    public u(@FloatRange(from = 0.0d, fromInclusive = false) float f10, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        s7.a.a(f10 > 0.0f);
        s7.a.a(f11 > 0.0f);
        this.f22486b = f10;
        this.f22487c = f11;
        this.f22488d = Math.round(f10 * 1000.0f);
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ u d(Bundle bundle) {
        return new u(bundle.getFloat(c(0), 1.0f), bundle.getFloat(c(1), 1.0f));
    }

    public long b(long j10) {
        return j10 * ((long) this.f22488d);
    }

    @CheckResult
    public u e(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        return new u(f10, this.f22487c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f22486b == uVar.f22486b && this.f22487c == uVar.f22487c;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f22486b)) * 31) + Float.floatToRawIntBits(this.f22487c);
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(c(0), this.f22486b);
        bundle.putFloat(c(1), this.f22487c);
        return bundle;
    }

    public String toString() {
        return m0.z("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f22486b), Float.valueOf(this.f22487c));
    }
}
