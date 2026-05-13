package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@so.k
public final class zu1 {

    @NotNull
    public static final yu1 Companion = new yu1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97774d;

    public /* synthetic */ zu1(int i10, long j10, String str, String str2, String str3) {
        if (15 != (i10 & 15)) {
            wo.c2.a(i10, 15, xu1.f96875a.getDescriptor());
        }
        this.f97771a = j10;
        this.f97772b = str;
        this.f97773c = str2;
        this.f97774d = str3;
    }

    public zu1(long j10, String str, String str2, String str3) {
        this.f97771a = j10;
        this.f97772b = str;
        this.f97773c = str2;
        this.f97774d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        return this.f97771a == zu1Var.f97771a && tn.p.f(this.f97772b, zu1Var.f97772b) && tn.p.f(this.f97773c, zu1Var.f97773c) && tn.p.f(this.f97774d, zu1Var.f97774d);
    }

    public final int hashCode() {
        return this.f97774d.hashCode() + k4.a(this.f97773c, k4.a(this.f97772b, Long.hashCode(this.f97771a) * 31, 31), 31);
    }

    public final String toString() {
        return "MobileAdsSdkLog(timestamp=" + this.f97771a + ", type=" + this.f97772b + ", tag=" + this.f97773c + ", text=" + this.f97774d + ")";
    }
}
