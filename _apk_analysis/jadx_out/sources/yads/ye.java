package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s63 f97091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ym1 f97093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f97094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s63 f97095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f97096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ym1 f97097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f97098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f97099j;

    public ye(long j10, s63 s63Var, int i10, ym1 ym1Var, long j11, s63 s63Var2, int i11, ym1 ym1Var2, long j12, long j13) {
        this.f97090a = j10;
        this.f97091b = s63Var;
        this.f97092c = i10;
        this.f97093d = ym1Var;
        this.f97094e = j11;
        this.f97095f = s63Var2;
        this.f97096g = i11;
        this.f97097h = ym1Var2;
        this.f97098i = j12;
        this.f97099j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ye.class != obj.getClass()) {
            return false;
        }
        ye yeVar = (ye) obj;
        return this.f97090a == yeVar.f97090a && this.f97092c == yeVar.f97092c && this.f97094e == yeVar.f97094e && this.f97096g == yeVar.f97096g && this.f97098i == yeVar.f97098i && this.f97099j == yeVar.f97099j && l92.a(this.f97091b, yeVar.f97091b) && l92.a(this.f97093d, yeVar.f97093d) && l92.a(this.f97095f, yeVar.f97095f) && l92.a(this.f97097h, yeVar.f97097h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f97090a), this.f97091b, Integer.valueOf(this.f97092c), this.f97093d, Long.valueOf(this.f97094e), this.f97095f, Integer.valueOf(this.f97096g), this.f97097h, Long.valueOf(this.f97098i), Long.valueOf(this.f97099j)});
    }
}
