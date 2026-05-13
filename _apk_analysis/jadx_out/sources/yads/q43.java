package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class q43 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o20[] f93888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f93889c;

    public q43(o20[] o20VarArr, long[] jArr) {
        this.f93888b = o20VarArr;
        this.f93889c = jArr;
    }

    @Override // yads.r43
    public final int a() {
        return this.f93889c.length;
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f93889c, j10, false);
        if (iA < this.f93889c.length) {
            return iA;
        }
        return -1;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f93889c;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        o20 o20Var;
        int iB = ib3.b(this.f93889c, j10, false);
        return (iB == -1 || (o20Var = this.f93888b[iB]) == o20.f93083s) ? Collections.emptyList() : Collections.singletonList(o20Var);
    }
}
