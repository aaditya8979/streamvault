package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class up {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ry1 f95737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j52 f95738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l72 f95739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j72 f95740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xz1 f95741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f32 f95742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t12 f95743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lu2 f95744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fy1 f95745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final va f95746j;

    public up(ry1 ry1Var, k12 k12Var, l72 l72Var, j72 j72Var, xz1 xz1Var, f32 f32Var, t12 t12Var, lu2 lu2Var, fy1 fy1Var, va vaVar) {
        this.f95737a = ry1Var;
        this.f95738b = k12Var;
        this.f95739c = l72Var;
        this.f95740d = j72Var;
        this.f95741e = xz1Var;
        this.f95742f = f32Var;
        this.f95743g = t12Var;
        this.f95744h = lu2Var;
        this.f95745i = fy1Var;
        this.f95746j = vaVar;
    }

    public final va a() {
        return this.f95746j;
    }

    public final t12 b() {
        return this.f95743g;
    }

    public final f32 c() {
        return this.f95742f;
    }

    public final ry1 d() {
        return this.f95737a;
    }

    public final xz1 e() {
        return this.f95741e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up)) {
            return false;
        }
        up upVar = (up) obj;
        return tn.p.f(this.f95737a, upVar.f95737a) && tn.p.f(this.f95738b, upVar.f95738b) && tn.p.f(this.f95739c, upVar.f95739c) && tn.p.f(this.f95740d, upVar.f95740d) && tn.p.f(this.f95741e, upVar.f95741e) && tn.p.f(this.f95742f, upVar.f95742f) && tn.p.f(this.f95743g, upVar.f95743g) && tn.p.f(this.f95744h, upVar.f95744h) && tn.p.f(this.f95745i, upVar.f95745i) && this.f95746j == upVar.f95746j;
    }

    public final fy1 f() {
        return this.f95745i;
    }

    public final j52 g() {
        return this.f95738b;
    }

    public final j72 h() {
        return this.f95740d;
    }

    public final int hashCode() {
        int iHashCode = (this.f95744h.hashCode() + ((this.f95743g.hashCode() + ((this.f95742f.hashCode() + ((this.f95741e.hashCode() + ((this.f95740d.hashCode() + ((this.f95739c.hashCode() + ((this.f95738b.hashCode() + (this.f95737a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        fy1 fy1Var = this.f95745i;
        return this.f95746j.hashCode() + ((iHashCode + (fy1Var == null ? 0 : fy1Var.hashCode())) * 31);
    }

    public final l72 i() {
        return this.f95739c;
    }

    public final lu2 j() {
        return this.f95744h;
    }

    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.f95737a + ", nativeValidator=" + this.f95738b + ", nativeVisualBlock=" + this.f95739c + ", nativeViewRenderer=" + this.f95740d + ", nativeAdFactoriesProvider=" + this.f95741e + ", forceImpressionConfigurator=" + this.f95742f + ", adViewRenderingValidator=" + this.f95743g + ", sdkEnvironmentModule=" + this.f95744h + ", nativeData=" + this.f95745i + ", adStructureType=" + this.f95746j + ")";
    }
}
