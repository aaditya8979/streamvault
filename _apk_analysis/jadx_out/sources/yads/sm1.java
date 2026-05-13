package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes12.dex */
public final class sm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym1 f94869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f94871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f94874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f94875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f94876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f94877i;

    public sm1(ym1 ym1Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        ni.a(!z13 || z11);
        ni.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        ni.a(z14);
        this.f94869a = ym1Var;
        this.f94870b = j10;
        this.f94871c = j11;
        this.f94872d = j12;
        this.f94873e = j13;
        this.f94874f = z10;
        this.f94875g = z11;
        this.f94876h = z12;
        this.f94877i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sm1.class != obj.getClass()) {
            return false;
        }
        sm1 sm1Var = (sm1) obj;
        return this.f94870b == sm1Var.f94870b && this.f94871c == sm1Var.f94871c && this.f94872d == sm1Var.f94872d && this.f94873e == sm1Var.f94873e && this.f94874f == sm1Var.f94874f && this.f94875g == sm1Var.f94875g && this.f94876h == sm1Var.f94876h && this.f94877i == sm1Var.f94877i && ib3.a(this.f94869a, sm1Var.f94869a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f94869a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f94870b)) * 31) + ((int) this.f94871c)) * 31) + ((int) this.f94872d)) * 31) + ((int) this.f94873e)) * 31) + (this.f94874f ? 1 : 0)) * 31) + (this.f94875g ? 1 : 0)) * 31) + (this.f94876h ? 1 : 0)) * 31) + (this.f94877i ? 1 : 0);
    }
}
