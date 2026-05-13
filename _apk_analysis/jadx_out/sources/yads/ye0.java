package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ye0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97101c;

    public ye0(int i10, mx0 mx0Var) {
        this.f97100b = (mx0Var.f92602e & 1) != 0;
        this.f97101c = if0.a(false, i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ye0 ye0Var = (ye0) obj;
        return fy.a(lq.a(this.f97101c, ye0Var.f97101c)).a(this.f97100b, ye0Var.f97100b).a();
    }
}
