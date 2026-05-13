package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;

/* JADX INFO: compiled from: ThumbRating.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f.a<b0> f21370e = new f.a() { // from class: d6.a2
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.b0.e(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21372d;

    public b0() {
        this.f21371c = false;
        this.f21372d = false;
    }

    public b0(boolean z10) {
        this.f21371c = true;
        this.f21372d = z10;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static b0 e(Bundle bundle) {
        s7.a.a(bundle.getInt(c(0), -1) == 3);
        return bundle.getBoolean(c(1), false) ? new b0(bundle.getBoolean(c(2), false)) : new b0();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f21372d == b0Var.f21372d && this.f21371c == b0Var.f21371c;
    }

    public int hashCode() {
        return y7.i.b(Boolean.valueOf(this.f21371c), Boolean.valueOf(this.f21372d));
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), 3);
        bundle.putBoolean(c(1), this.f21371c);
        bundle.putBoolean(c(2), this.f21372d);
        return bundle;
    }
}
