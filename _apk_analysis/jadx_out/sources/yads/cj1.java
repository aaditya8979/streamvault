package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class cj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg1 f88473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88474b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f88475c;

    public cj1(rg1 rg1Var) {
        this.f88473a = rg1Var;
    }

    public final String a() {
        String str;
        synchronized (this.f88474b) {
            if (this.f88475c == null) {
                this.f88475c = ((tg1) this.f88473a).c("YmadMauid");
            }
            str = this.f88475c;
        }
        return str;
    }

    public final void a(String str) {
        synchronized (this.f88474b) {
            this.f88475c = str;
            ((tg1) this.f88473a).a("YmadMauid", str);
            bn.r rVar = bn.r.f5635a;
        }
    }
}
