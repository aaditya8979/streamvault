package e4;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e5.r;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.a f60141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f60142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f60143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f60145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f60146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f60147g;

    public i0(r.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f60141a = aVar;
        this.f60142b = j10;
        this.f60143c = j11;
        this.f60144d = j12;
        this.f60145e = j13;
        this.f60146f = z10;
        this.f60147g = z11;
    }

    public i0 a(long j10) {
        return j10 == this.f60143c ? this : new i0(this.f60141a, this.f60142b, j10, this.f60144d, this.f60145e, this.f60146f, this.f60147g);
    }

    public i0 b(long j10) {
        return j10 == this.f60142b ? this : new i0(this.f60141a, j10, this.f60143c, this.f60144d, this.f60145e, this.f60146f, this.f60147g);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f60142b == i0Var.f60142b && this.f60143c == i0Var.f60143c && this.f60144d == i0Var.f60144d && this.f60145e == i0Var.f60145e && this.f60146f == i0Var.f60146f && this.f60147g == i0Var.f60147g && a6.k0.c(this.f60141a, i0Var.f60141a);
    }

    public int hashCode() {
        return ((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f60141a.hashCode()) * 31) + ((int) this.f60142b)) * 31) + ((int) this.f60143c)) * 31) + ((int) this.f60144d)) * 31) + ((int) this.f60145e)) * 31) + (this.f60146f ? 1 : 0)) * 31) + (this.f60147g ? 1 : 0);
    }
}
