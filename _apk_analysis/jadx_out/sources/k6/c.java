package k6;

import s7.a0;

/* JADX INFO: compiled from: AviMainHeaderChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72983d;

    public c(int i10, int i11, int i12, int i13) {
        this.f72980a = i10;
        this.f72981b = i11;
        this.f72982c = i12;
        this.f72983d = i13;
    }

    public static c b(a0 a0Var) {
        int iQ = a0Var.q();
        a0Var.Q(8);
        int iQ2 = a0Var.q();
        int iQ3 = a0Var.q();
        a0Var.Q(4);
        int iQ4 = a0Var.q();
        a0Var.Q(12);
        return new c(iQ, iQ2, iQ3, iQ4);
    }

    public boolean a() {
        return (this.f72981b & 16) == 16;
    }

    @Override // k6.a
    public int getType() {
        return 1751742049;
    }
}
