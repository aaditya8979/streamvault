package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;

/* JADX INFO: compiled from: HeartRating.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f.a<n> f22000e = new f.a() { // from class: d6.a1
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.n.e(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22002d;

    public n() {
        this.f22001c = false;
        this.f22002d = false;
    }

    public n(boolean z10) {
        this.f22001c = true;
        this.f22002d = z10;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static n e(Bundle bundle) {
        s7.a.a(bundle.getInt(c(0), -1) == 0);
        return bundle.getBoolean(c(1), false) ? new n(bundle.getBoolean(c(2), false)) : new n();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f22002d == nVar.f22002d && this.f22001c == nVar.f22001c;
    }

    public int hashCode() {
        return y7.i.b(Boolean.valueOf(this.f22001c), Boolean.valueOf(this.f22002d));
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), 0);
        bundle.putBoolean(c(1), this.f22001c);
        bundle.putBoolean(c(2), this.f22002d);
        return bundle;
    }
}
