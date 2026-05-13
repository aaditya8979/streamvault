package e4;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f60258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f60259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t0 f60260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t0 f60261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t0 f60262g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f60263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f60264b;

    static {
        t0 t0Var = new t0(0L, 0L);
        f60258c = t0Var;
        f60259d = new t0(Long.MAX_VALUE, Long.MAX_VALUE);
        f60260e = new t0(Long.MAX_VALUE, 0L);
        f60261f = new t0(0L, Long.MAX_VALUE);
        f60262g = t0Var;
    }

    public t0(long j10, long j11) {
        a6.a.a(j10 >= 0);
        a6.a.a(j11 >= 0);
        this.f60263a = j10;
        this.f60264b = j11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f60263a == t0Var.f60263a && this.f60264b == t0Var.f60264b;
    }

    public int hashCode() {
        return (((int) this.f60263a) * 31) + ((int) this.f60264b);
    }
}
