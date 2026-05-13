package d6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.i;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.b f59638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f59641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f59642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f59643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f59644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f59645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f59646i;

    public i1(i.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        s7.a.a(!z13 || z11);
        s7.a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        s7.a.a(z14);
        this.f59638a = bVar;
        this.f59639b = j10;
        this.f59640c = j11;
        this.f59641d = j12;
        this.f59642e = j13;
        this.f59643f = z10;
        this.f59644g = z11;
        this.f59645h = z12;
        this.f59646i = z13;
    }

    public i1 a(long j10) {
        return j10 == this.f59640c ? this : new i1(this.f59638a, this.f59639b, j10, this.f59641d, this.f59642e, this.f59643f, this.f59644g, this.f59645h, this.f59646i);
    }

    public i1 b(long j10) {
        return j10 == this.f59639b ? this : new i1(this.f59638a, j10, this.f59640c, this.f59641d, this.f59642e, this.f59643f, this.f59644g, this.f59645h, this.f59646i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f59639b == i1Var.f59639b && this.f59640c == i1Var.f59640c && this.f59641d == i1Var.f59641d && this.f59642e == i1Var.f59642e && this.f59643f == i1Var.f59643f && this.f59644g == i1Var.f59644g && this.f59645h == i1Var.f59645h && this.f59646i == i1Var.f59646i && s7.m0.c(this.f59638a, i1Var.f59638a);
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f59638a.hashCode()) * 31) + ((int) this.f59639b)) * 31) + ((int) this.f59640c)) * 31) + ((int) this.f59641d)) * 31) + ((int) this.f59642e)) * 31) + (this.f59643f ? 1 : 0)) * 31) + (this.f59644g ? 1 : 0)) * 31) + (this.f59645h ? 1 : 0)) * 31) + (this.f59646i ? 1 : 0);
    }
}
