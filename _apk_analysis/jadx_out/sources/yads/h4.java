package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 extends im3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f90234d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4 f90235c;

    public h4(m4 m4Var, e82 e82Var) {
        super(e82Var);
        this.f90235c = m4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(h4.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        tn.p.i(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        return this.f90235c == ((h4) obj).f90235c;
    }

    public final int hashCode() {
        return this.f90235c.hashCode();
    }
}
