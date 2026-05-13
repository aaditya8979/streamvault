package com.monetization.ads.exo.source.dash;

import yads.c30;
import yads.e6;
import yads.fc2;
import yads.fm1;
import yads.i30;
import yads.ib3;
import yads.lo2;
import yads.ni;
import yads.p63;
import yads.r63;
import yads.s63;
import yads.yl1;
import yads.zb;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends s63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f51022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f51023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f51025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f51026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f51027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c30 f51028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fm1 f51029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yl1 f51030l;

    public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, c30 c30Var, fm1 fm1Var, yl1 yl1Var) {
        ni.b(c30Var.f88309d == (yl1Var != null));
        this.f51021c = j10;
        this.f51022d = j11;
        this.f51023e = j12;
        this.f51024f = i10;
        this.f51025g = j13;
        this.f51026h = j14;
        this.f51027i = j15;
        this.f51028j = c30Var;
        this.f51029k = fm1Var;
        this.f51030l = yl1Var;
    }

    @Override // yads.s63
    public final int a() {
        return this.f51028j.f88318m.size();
    }

    @Override // yads.s63
    public final int a(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f51024f) >= 0 && iIntValue < a()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // yads.s63
    public final Object a(int i10) {
        ni.a(i10, a());
        return Integer.valueOf(this.f51024f + i10);
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        ni.a(i10, a());
        String str = z10 ? ((fc2) this.f51028j.f88318m.get(i10)).f89530a : null;
        Integer numValueOf = z10 ? Integer.valueOf(this.f51024f + i10) : null;
        long jA = ib3.a(this.f51028j.b(i10));
        long jA2 = ib3.a(((fc2) this.f51028j.f88318m.get(i10)).f89531b - ((fc2) this.f51028j.f88318m.get(0)).f89531b) - this.f51025g;
        p63Var.getClass();
        return p63Var.a(str, numValueOf, 0, jA, jA2, e6.f89106h, false);
    }

    @Override // yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        long j11;
        i30 i30VarD;
        ni.a(i10, 1);
        long jA = this.f51027i;
        c30 c30Var = this.f51028j;
        if (c30Var.f88309d && c30Var.f88310e != -9223372036854775807L && c30Var.f88307b == -9223372036854775807L) {
            if (j10 > 0) {
                jA += j10;
                if (jA > this.f51026h) {
                    j11 = -9223372036854775807L;
                }
            }
            long j12 = this.f51025g + jA;
            long jA2 = ib3.a(c30Var.b(0));
            int i11 = 0;
            while (i11 < this.f51028j.f88318m.size() - 1 && j12 >= jA2) {
                j12 -= jA2;
                i11++;
                jA2 = ib3.a(this.f51028j.b(i11));
            }
            fc2 fc2Var = (fc2) this.f51028j.f88318m.get(i11);
            int size = fc2Var.f89532c.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                }
                if (((zb) fc2Var.f89532c.get(i12)).f97447b == 2) {
                    break;
                }
                i12++;
            }
            if (i12 != -1 && (i30VarD = ((lo2) ((zb) fc2Var.f89532c.get(i12)).f97448c.get(0)).d()) != null && i30VarD.c(jA2) != 0) {
                jA = (i30VarD.a(i30VarD.a(j12, jA2)) + jA) - j12;
            }
            j11 = jA;
        } else {
            j11 = jA;
        }
        Object obj = r63.f94295s;
        fm1 fm1Var = this.f51029k;
        c30 c30Var2 = this.f51028j;
        return r63Var.a(obj, fm1Var, c30Var2, this.f51021c, this.f51022d, this.f51023e, true, c30Var2.f88309d && c30Var2.f88310e != -9223372036854775807L && c30Var2.f88307b == -9223372036854775807L, this.f51030l, j11, this.f51026h, 0, a() - 1, this.f51025g);
    }

    @Override // yads.s63
    public final int b() {
        return 1;
    }
}
