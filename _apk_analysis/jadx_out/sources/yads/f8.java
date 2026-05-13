package yads;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f89506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f89511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f89512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f89513h;

    public f8(boolean z10, boolean z11, String str, long j10, int i10, boolean z12, Set set, Map map) {
        this.f89506a = z10;
        this.f89507b = z11;
        this.f89508c = str;
        this.f89509d = j10;
        this.f89510e = i10;
        this.f89511f = z12;
        this.f89512g = set;
        this.f89513h = map;
    }

    public final boolean a() {
        return this.f89506a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.f89506a == f8Var.f89506a && this.f89507b == f8Var.f89507b && tn.p.f(this.f89508c, f8Var.f89508c) && this.f89509d == f8Var.f89509d && this.f89510e == f8Var.f89510e && this.f89511f == f8Var.f89511f && tn.p.f(this.f89512g, f8Var.f89512g) && tn.p.f(this.f89513h, f8Var.f89513h);
    }

    public final int hashCode() {
        return this.f89513h.hashCode() + ((this.f89512g.hashCode() + ((Boolean.hashCode(this.f89511f) + nd3.a(this.f89510e, (Long.hashCode(this.f89509d) + k4.a(this.f89508c, (Boolean.hashCode(this.f89507b) + (Boolean.hashCode(this.f89506a) * 31)) * 31, 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.f89506a + ", debug=" + this.f89507b + ", apiKey=" + this.f89508c + ", validationTimeoutInSec=" + this.f89509d + ", usagePercent=" + this.f89510e + ", blockAdOnInternalError=" + this.f89511f + ", enabledAdUnits=" + this.f89512g + ", adNetworksCustomParameters=" + this.f89513h + ")";
    }
}
