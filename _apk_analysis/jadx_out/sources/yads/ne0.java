package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class ne0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f92833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f92834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ym1 f92835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f92836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f92837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oe0 f92838g;

    public ne0(oe0 oe0Var, String str, int i10, ym1 ym1Var) {
        this.f92838g = oe0Var;
        this.f92832a = str;
        this.f92833b = i10;
        this.f92834c = ym1Var == null ? -1L : ym1Var.f94495d;
        if (ym1Var == null || !ym1Var.a()) {
            return;
        }
        this.f92835d = ym1Var;
    }

    public final boolean a(ye yeVar) {
        long j10 = this.f92834c;
        if (j10 == -1) {
            return false;
        }
        ym1 ym1Var = yeVar.f97093d;
        if (ym1Var == null) {
            return this.f92833b != yeVar.f97092c;
        }
        if (ym1Var.f94495d > j10) {
            return true;
        }
        if (this.f92835d == null) {
            return false;
        }
        int iA = yeVar.f97091b.a(ym1Var.f94492a);
        int iA2 = yeVar.f97091b.a(this.f92835d.f94492a);
        ym1 ym1Var2 = yeVar.f97093d;
        if (ym1Var2.f94495d < this.f92835d.f94495d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!ym1Var2.a()) {
            int i10 = yeVar.f97093d.f94496e;
            return i10 == -1 || i10 > this.f92835d.f94493b;
        }
        ym1 ym1Var3 = yeVar.f97093d;
        int i11 = ym1Var3.f94493b;
        int i12 = ym1Var3.f94494c;
        ym1 ym1Var4 = this.f92835d;
        int i13 = ym1Var4.f94493b;
        return i11 > i13 || (i11 == i13 && i12 > ym1Var4.f94494c);
    }
}
