package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pl0 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f93627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73[] f93628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f93629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f93631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f93632f = -9223372036854775807L;

    public pl0(List list) {
        this.f93627a = list;
        this.f93628b = new m73[list.size()];
    }

    @Override // yads.ul0
    public final void a() {
        this.f93629c = false;
        this.f93632f = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f93629c = true;
        if (j10 != -9223372036854775807L) {
            this.f93632f = j10;
        }
        this.f93631e = 0;
        this.f93630d = 2;
    }

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f93629c) {
            if (this.f93630d == 2) {
                if (jb2Var.f91149c - jb2Var.f91148b == 0) {
                    return;
                }
                if (jb2Var.m() != 32) {
                    this.f93629c = false;
                }
                this.f93630d--;
                if (!this.f93629c) {
                    return;
                }
            }
            if (this.f93630d == 1) {
                if (jb2Var.f91149c - jb2Var.f91148b == 0) {
                    return;
                }
                if (jb2Var.m() != 0) {
                    this.f93629c = false;
                }
                this.f93630d--;
                if (!this.f93629c) {
                    return;
                }
            }
            int i10 = jb2Var.f91148b;
            int i11 = jb2Var.f91149c - i10;
            for (m73 m73Var : this.f93628b) {
                jb2Var.e(i10);
                m73Var.a(i11, jb2Var);
            }
            this.f93631e += i11;
        }
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        for (int i10 = 0; i10 < this.f93628b.length; i10++) {
            i93 i93Var = (i93) this.f93627a.get(i10);
            l93Var.a();
            l93Var.b();
            m73 m73VarA = pq0Var.a(l93Var.f91914d, 3);
            lx0 lx0Var = new lx0();
            l93Var.b();
            lx0Var.f92138a = l93Var.f91915e;
            lx0Var.f92148k = "application/dvbsubs";
            lx0Var.f92150m = Collections.singletonList(i93Var.f90714b);
            lx0Var.f92140c = i93Var.f90713a;
            m73VarA.a(new mx0(lx0Var));
            this.f93628b[i10] = m73VarA;
        }
    }

    @Override // yads.ul0
    public final void b() {
        if (this.f93629c) {
            if (this.f93632f != -9223372036854775807L) {
                for (m73 m73Var : this.f93628b) {
                    m73Var.a(this.f93632f, 1, this.f93631e, 0, null);
                }
            }
            this.f93629c = false;
        }
    }
}
