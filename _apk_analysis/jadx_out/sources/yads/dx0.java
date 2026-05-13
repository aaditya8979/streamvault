package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@so.k
public final class dx0 {

    @NotNull
    public static final cx0 Companion = new cx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f89019d;

    public /* synthetic */ dx0(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            wo.c2.a(i10, 15, bx0.f88181a.getDescriptor());
        }
        this.f89016a = str;
        this.f89017b = str2;
        this.f89018c = str3;
        this.f89019d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx0)) {
            return false;
        }
        dx0 dx0Var = (dx0) obj;
        return tn.p.f(this.f89016a, dx0Var.f89016a) && tn.p.f(this.f89017b, dx0Var.f89017b) && tn.p.f(this.f89018c, dx0Var.f89018c) && tn.p.f(this.f89019d, dx0Var.f89019d);
    }

    public final int hashCode() {
        return this.f89019d.hashCode() + k4.a(this.f89018c, k4.a(this.f89017b, this.f89016a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FontUrls(regular=" + this.f89016a + ", bold=" + this.f89017b + ", light=" + this.f89018c + ", medium=" + this.f89019d + ")";
    }
}
