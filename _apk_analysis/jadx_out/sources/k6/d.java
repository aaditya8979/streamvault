package k6;

import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: AviStreamHeaderChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f72988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f72989f;

    public d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f72984a = i10;
        this.f72985b = i11;
        this.f72986c = i12;
        this.f72987d = i13;
        this.f72988e = i14;
        this.f72989f = i15;
    }

    public static d c(a0 a0Var) {
        int iQ = a0Var.q();
        a0Var.Q(12);
        int iQ2 = a0Var.q();
        int iQ3 = a0Var.q();
        int iQ4 = a0Var.q();
        a0Var.Q(4);
        int iQ5 = a0Var.q();
        int iQ6 = a0Var.q();
        a0Var.Q(8);
        return new d(iQ, iQ2, iQ3, iQ4, iQ5, iQ6);
    }

    public long a() {
        return m0.F0(this.f72988e, ((long) this.f72986c) * 1000000, this.f72987d);
    }

    public int b() {
        int i10 = this.f72984a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        q.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f72984a));
        return -1;
    }

    @Override // k6.a
    public int getType() {
        return 1752331379;
    }
}
