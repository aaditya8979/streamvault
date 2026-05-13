package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f19276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19279d = 0;

    public x(w wVar) {
        Charset charset = l1.f19181a;
        if (wVar == null) {
            throw new NullPointerException("input");
        }
        this.f19276a = wVar;
        wVar.f19265d = this;
    }

    public static void c(int i10) throws n1 {
        if ((i10 & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public static void d(int i10) throws n1 {
        if ((i10 & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() throws m1 {
        b(2);
        return this.f19276a.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) throws m1 {
        b(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) throws m1 {
        b(3);
        return c(p2.f19204c.a(cls), h0Var);
    }

    public final void a(int i10) throws n1 {
        if (this.f19276a.b() != i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof u1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f19276a.v()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iB = this.f19276a.b() + this.f19276a.u();
            do {
                list.add(Long.valueOf(this.f19276a.v()));
            } while (this.f19276a.b() < iB);
            a(iB);
            return;
        }
        u1 u1Var = (u1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 0) {
            do {
                u1Var.a(this.f19276a.v());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iB2 = this.f19276a.b() + this.f19276a.u();
        do {
            u1Var.a(this.f19276a.v());
        } while (this.f19276a.b() < iB2);
        a(iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) throws m1 {
        int iT;
        int i10 = this.f19277b;
        if ((i10 & 7) != 3) {
            int i11 = n1.f19193a;
            throw new m1();
        }
        do {
            list.add(c(t2Var, h0Var));
            if (this.f19276a.c() || this.f19279d != 0) {
                return;
            } else {
                iT = this.f19276a.t();
            }
        } while (iT == i10);
        this.f19279d = iT;
    }

    public final void a(List list, boolean z10) throws m1 {
        String strR;
        int iT;
        int iT2;
        if ((this.f19277b & 7) != 2) {
            int i10 = n1.f19193a;
            throw new m1();
        }
        if ((list instanceof q1) && !z10) {
            q1 q1Var = (q1) list;
            do {
                b(2);
                q1Var.a(this.f19276a.e());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        do {
            if (z10) {
                b(2);
                strR = this.f19276a.s();
            } else {
                b(2);
                strR = this.f19276a.r();
            }
            list.add(strR);
            if (this.f19276a.c()) {
                return;
            } else {
                iT = this.f19276a.t();
            }
        } while (iT == this.f19277b);
        this.f19279d = iT;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() throws m1 {
        b(0);
        return this.f19276a.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) throws m1 {
        b(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) throws m1 {
        b(2);
        return d(p2.f19204c.a(cls), h0Var);
    }

    public final void b(int i10) throws m1 {
        if ((this.f19277b & 7) == i10) {
            return;
        }
        int i11 = n1.f19193a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) throws m1 {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) throws m1 {
        int iT;
        int i10 = this.f19277b;
        if ((i10 & 7) != 2) {
            int i11 = n1.f19193a;
            throw new m1();
        }
        do {
            list.add(d(t2Var, h0Var));
            if (this.f19276a.c() || this.f19279d != 0) {
                return;
            } else {
                iT = this.f19276a.t();
            }
        } while (iT == i10);
        this.f19279d = iT;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() throws m1 {
        b(0);
        return this.f19276a.u();
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i10 = this.f19278c;
        this.f19278c = ((this.f19277b >>> 3) << 3) | 4;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f19277b == this.f19278c) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f19278c = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f19276a.p()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iB = this.f19276a.b() + this.f19276a.u();
            do {
                list.add(Integer.valueOf(this.f19276a.p()));
            } while (this.f19276a.b() < iB);
            a(iB);
            return;
        }
        a1 a1Var = (a1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 0) {
            do {
                a1Var.c(this.f19276a.p());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iB2 = this.f19276a.b() + this.f19276a.u();
        do {
            a1Var.c(this.f19276a.p());
        } while (this.f19276a.b() < iB2);
        a(iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() throws m1 {
        b(0);
        return this.f19276a.k();
    }

    public final Object d(t2 t2Var, h0 h0Var) throws n1 {
        int iU = this.f19276a.u();
        w wVar = this.f19276a;
        if (wVar.f19262a >= wVar.f19263b) {
            throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = wVar.d(iU);
        Object objA = t2Var.a();
        this.f19276a.f19262a++;
        t2Var.a(objA, this, h0Var);
        t2Var.c(objA);
        this.f19276a.a(0);
        r5.f19262a--;
        this.f19276a.c(iD);
        return objA;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof q0)) {
            int i10 = this.f19277b & 7;
            if (i10 == 2) {
                int iU = this.f19276a.u();
                c(iU);
                int iB = this.f19276a.b() + iU;
                do {
                    list.add(Float.valueOf(this.f19276a.j()));
                } while (this.f19276a.b() < iB);
                return;
            }
            if (i10 != 5) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            do {
                list.add(Float.valueOf(this.f19276a.j()));
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT = this.f19276a.t();
                }
            } while (iT == this.f19277b);
            this.f19279d = iT;
            return;
        }
        q0 q0Var = (q0) list;
        int i12 = this.f19277b & 7;
        if (i12 == 2) {
            int iU2 = this.f19276a.u();
            c(iU2);
            int iB2 = this.f19276a.b() + iU2;
            do {
                q0Var.a(this.f19276a.j());
            } while (this.f19276a.b() < iB2);
            return;
        }
        if (i12 != 5) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        do {
            q0Var.a(this.f19276a.j());
            if (this.f19276a.c()) {
                return;
            } else {
                iT2 = this.f19276a.t();
            }
        } while (iT2 == this.f19277b);
        this.f19279d = iT2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.f19277b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 2) {
                int iU = this.f19276a.u();
                c(iU);
                int iB = this.f19276a.b() + iU;
                do {
                    list.add(Integer.valueOf(this.f19276a.h()));
                } while (this.f19276a.b() < iB);
                return;
            }
            if (i10 != 5) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(this.f19276a.h()));
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT = this.f19276a.t();
                }
            } while (iT == this.f19277b);
            this.f19279d = iT;
            return;
        }
        a1 a1Var = (a1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 2) {
            int iU2 = this.f19276a.u();
            c(iU2);
            int iB2 = this.f19276a.b() + iU2;
            do {
                a1Var.c(this.f19276a.h());
            } while (this.f19276a.b() < iB2);
            return;
        }
        if (i12 != 5) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        do {
            a1Var.c(this.f19276a.h());
            if (this.f19276a.c()) {
                return;
            } else {
                iT2 = this.f19276a.t();
            }
        } while (iT2 == this.f19277b);
        this.f19279d = iT2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() throws m1 {
        b(0);
        return this.f19276a.v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 2) {
                int iU = this.f19276a.u();
                c(iU);
                int iB = this.f19276a.b() + iU;
                do {
                    list.add(Integer.valueOf(this.f19276a.n()));
                } while (this.f19276a.b() < iB);
                return;
            }
            if (i10 != 5) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(this.f19276a.n()));
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT = this.f19276a.t();
                }
            } while (iT == this.f19277b);
            this.f19279d = iT;
            return;
        }
        a1 a1Var = (a1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 2) {
            int iU2 = this.f19276a.u();
            c(iU2);
            int iB2 = this.f19276a.b() + iU2;
            do {
                a1Var.c(this.f19276a.n());
            } while (this.f19276a.b() < iB2);
            return;
        }
        if (i12 != 5) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        do {
            a1Var.c(this.f19276a.n());
            if (this.f19276a.c()) {
                return;
            } else {
                iT2 = this.f19276a.t();
            }
        } while (iT2 == this.f19277b);
        this.f19279d = iT2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() throws m1 {
        b(1);
        return this.f19276a.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof u1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f19276a.q()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iB = this.f19276a.b() + this.f19276a.u();
            do {
                list.add(Long.valueOf(this.f19276a.q()));
            } while (this.f19276a.b() < iB);
            a(iB);
            return;
        }
        u1 u1Var = (u1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 0) {
            do {
                u1Var.a(this.f19276a.q());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iB2 = this.f19276a.b() + this.f19276a.u();
        do {
            u1Var.a(this.f19276a.q());
        } while (this.f19276a.b() < iB2);
        a(iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() throws m1 {
        b(1);
        return this.f19276a.f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) throws m1 {
        int iT;
        if ((this.f19277b & 7) != 2) {
            int i10 = n1.f19193a;
            throw new m1();
        }
        do {
            b(2);
            list.add(this.f19276a.e());
            if (this.f19276a.c()) {
                return;
            } else {
                iT = this.f19276a.t();
            }
        } while (iT == this.f19277b);
        this.f19279d = iT;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f19276a.u()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iB = this.f19276a.b() + this.f19276a.u();
            do {
                list.add(Integer.valueOf(this.f19276a.u()));
            } while (this.f19276a.b() < iB);
            a(iB);
            return;
        }
        a1 a1Var = (a1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 0) {
            do {
                a1Var.c(this.f19276a.u());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iB2 = this.f19276a.b() + this.f19276a.u();
        do {
            a1Var.c(this.f19276a.u());
        } while (this.f19276a.b() < iB2);
        a(iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean i() {
        int i10;
        if (this.f19276a.c() || (i10 = this.f19277b) == this.f19278c) {
            return false;
        }
        return this.f19276a.e(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() throws m1 {
        b(0);
        return this.f19276a.p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof d0)) {
            int i10 = this.f19277b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.f19276a.f()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iU = this.f19276a.u();
            d(iU);
            int iB = this.f19276a.b() + iU;
            do {
                list.add(Double.valueOf(this.f19276a.f()));
            } while (this.f19276a.b() < iB);
            return;
        }
        d0 d0Var = (d0) list;
        int i12 = this.f19277b & 7;
        if (i12 == 1) {
            do {
                d0Var.a(this.f19276a.f());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iU2 = this.f19276a.u();
        d(iU2);
        int iB2 = this.f19276a.b() + iU2;
        do {
            d0Var.a(this.f19276a.f());
        } while (this.f19276a.b() < iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() throws m1 {
        b(5);
        return this.f19276a.j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof u1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f19276a.l()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iB = this.f19276a.b() + this.f19276a.u();
            do {
                list.add(Long.valueOf(this.f19276a.l()));
            } while (this.f19276a.b() < iB);
            a(iB);
            return;
        }
        u1 u1Var = (u1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 0) {
            do {
                u1Var.a(this.f19276a.l());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iB2 = this.f19276a.b() + this.f19276a.u();
        do {
            u1Var.a(this.f19276a.l());
        } while (this.f19276a.b() < iB2);
        a(iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() throws m1 {
        b(0);
        return this.f19276a.q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof j)) {
            int i10 = this.f19277b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f19276a.d()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iB = this.f19276a.b() + this.f19276a.u();
            do {
                list.add(Boolean.valueOf(this.f19276a.d()));
            } while (this.f19276a.b() < iB);
            a(iB);
            return;
        }
        j jVar = (j) list;
        int i12 = this.f19277b & 7;
        if (i12 == 0) {
            do {
                jVar.a(this.f19276a.d());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iB2 = this.f19276a.b() + this.f19276a.u();
        do {
            jVar.a(this.f19276a.d());
        } while (this.f19276a.b() < iB2);
        a(iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() throws m1 {
        b(5);
        return this.f19276a.n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof u1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f19276a.o()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iU = this.f19276a.u();
            d(iU);
            int iB = this.f19276a.b() + iU;
            do {
                list.add(Long.valueOf(this.f19276a.o()));
            } while (this.f19276a.b() < iB);
            return;
        }
        u1 u1Var = (u1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 1) {
            do {
                u1Var.a(this.f19276a.o());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iU2 = this.f19276a.u();
        d(iU2);
        int iB2 = this.f19276a.b() + iU2;
        do {
            u1Var.a(this.f19276a.o());
        } while (this.f19276a.b() < iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() throws m1 {
        b(2);
        return this.f19276a.r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof u1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f19276a.i()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iU = this.f19276a.u();
            d(iU);
            int iB = this.f19276a.b() + iU;
            do {
                list.add(Long.valueOf(this.f19276a.i()));
            } while (this.f19276a.b() < iB);
            return;
        }
        u1 u1Var = (u1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 1) {
            do {
                u1Var.a(this.f19276a.i());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iU2 = this.f19276a.u();
        d(iU2);
        int iB2 = this.f19276a.b() + iU2;
        do {
            u1Var.a(this.f19276a.i());
        } while (this.f19276a.b() < iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() throws m1 {
        b(0);
        return this.f19276a.l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f19276a.k()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iB = this.f19276a.b() + this.f19276a.u();
            do {
                list.add(Integer.valueOf(this.f19276a.k()));
            } while (this.f19276a.b() < iB);
            a(iB);
            return;
        }
        a1 a1Var = (a1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 0) {
            do {
                a1Var.c(this.f19276a.k());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iB2 = this.f19276a.b() + this.f19276a.u();
        do {
            a1Var.c(this.f19276a.k());
        } while (this.f19276a.b() < iB2);
        a(iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() throws m1 {
        b(2);
        return this.f19276a.s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i10 = this.f19277b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f19276a.g()));
                    if (this.f19276a.c()) {
                        return;
                    } else {
                        iT = this.f19276a.t();
                    }
                } while (iT == this.f19277b);
                this.f19279d = iT;
                return;
            }
            if (i10 != 2) {
                int i11 = n1.f19193a;
                throw new m1();
            }
            int iB = this.f19276a.b() + this.f19276a.u();
            do {
                list.add(Integer.valueOf(this.f19276a.g()));
            } while (this.f19276a.b() < iB);
            a(iB);
            return;
        }
        a1 a1Var = (a1) list;
        int i12 = this.f19277b & 7;
        if (i12 == 0) {
            do {
                a1Var.c(this.f19276a.g());
                if (this.f19276a.c()) {
                    return;
                } else {
                    iT2 = this.f19276a.t();
                }
            } while (iT2 == this.f19277b);
            this.f19279d = iT2;
            return;
        }
        if (i12 != 2) {
            int i13 = n1.f19193a;
            throw new m1();
        }
        int iB2 = this.f19276a.b() + this.f19276a.u();
        do {
            a1Var.c(this.f19276a.g());
        } while (this.f19276a.b() < iB2);
        a(iB2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() throws m1 {
        b(5);
        return this.f19276a.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) throws m1 {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() throws m1 {
        b(0);
        return this.f19276a.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() {
        int i10 = this.f19279d;
        if (i10 != 0) {
            this.f19277b = i10;
            this.f19279d = 0;
        } else {
            this.f19277b = this.f19276a.t();
        }
        int i11 = this.f19277b;
        if (i11 == 0 || i11 == this.f19278c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() throws m1 {
        b(1);
        return this.f19276a.o();
    }
}
