package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class k63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj2 f91497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f91498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic0 f91499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv f91500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw f91501e;

    public /* synthetic */ k63(sj2 sj2Var, u2 u2Var, ic0 ic0Var, yv yvVar) {
        this(sj2Var, u2Var, ic0Var, yvVar, new lw());
    }

    public k63(sj2 sj2Var, u2 u2Var, ic0 ic0Var, yv yvVar, lw lwVar) {
        this.f91497a = sj2Var;
        this.f91498b = u2Var;
        this.f91499c = ic0Var;
        this.f91500d = yvVar;
        this.f91501e = lwVar;
    }

    public final yv a() {
        return this.f91500d;
    }

    public final lw b() {
        return this.f91501e;
    }

    public final ic0 c() {
        return this.f91499c;
    }

    public final sj2 d() {
        return this.f91497a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k63)) {
            return false;
        }
        k63 k63Var = (k63) obj;
        return tn.p.f(this.f91497a, k63Var.f91497a) && tn.p.f(this.f91498b, k63Var.f91498b) && tn.p.f(this.f91499c, k63Var.f91499c) && tn.p.f(this.f91500d, k63Var.f91500d) && tn.p.f(this.f91501e, k63Var.f91501e);
    }

    public final int hashCode() {
        return this.f91501e.hashCode() + ((this.f91500d.hashCode() + ((this.f91499c.hashCode() + ((this.f91498b.hashCode() + (this.f91497a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.f91497a + ", adBlockDurationProvider=" + this.f91498b + ", defaultContentDelayProvider=" + this.f91499c + ", closableAdChecker=" + this.f91500d + ", closeTimerProgressIncrementer=" + this.f91501e + ")";
    }
}
