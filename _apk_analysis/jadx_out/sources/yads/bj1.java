package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class bj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f88027c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj1 f88028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aj1 f88029b = new aj1();

    public bj1(rg1 rg1Var) {
        this.f88028a = new cj1(rg1Var);
    }

    public final String a() {
        String strA;
        synchronized (f88027c) {
            strA = this.f88028a.a();
            if (strA == null) {
                this.f88029b.getClass();
                strA = aj1.a();
                this.f88028a.a(strA);
            }
        }
        return strA;
    }
}
