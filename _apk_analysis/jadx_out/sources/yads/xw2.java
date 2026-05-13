package yads;

import com.ironsource.C3978d4;

/* JADX INFO: loaded from: classes2.dex */
public final class xw2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xw2 f96907c = new xw2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96909b;

    public xw2(long j10, long j11) {
        this.f96908a = j10;
        this.f96909b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xw2.class != obj.getClass()) {
            return false;
        }
        xw2 xw2Var = (xw2) obj;
        return this.f96908a == xw2Var.f96908a && this.f96909b == xw2Var.f96909b;
    }

    public final int hashCode() {
        return (((int) this.f96908a) * 31) + ((int) this.f96909b);
    }

    public final String toString() {
        return "[timeUs=" + this.f96908a + ", position=" + this.f96909b + C3978d4.j.f31385e;
    }
}
