package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f21601e = new i(0, 0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f.a<i> f21602f = new f.a() { // from class: d6.f
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.i.c(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21605d;

    public i(int i10, int i11, int i12) {
        this.f21603b = i10;
        this.f21604c = i11;
        this.f21605d = i12;
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ i c(Bundle bundle) {
        return new i(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f21603b == iVar.f21603b && this.f21604c == iVar.f21604c && this.f21605d == iVar.f21605d;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21603b) * 31) + this.f21604c) * 31) + this.f21605d;
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), this.f21603b);
        bundle.putInt(b(1), this.f21604c);
        bundle.putInt(b(2), this.f21605d);
        return bundle;
    }
}
