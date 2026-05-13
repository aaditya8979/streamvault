package k6;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.r2;
import s7.a0;

/* JADX INFO: compiled from: ListChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<a> f73002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73003b;

    public f(int i10, ImmutableList<a> immutableList) {
        this.f73003b = i10;
        this.f73002a = immutableList;
    }

    @Nullable
    public static a a(int i10, int i11, a0 a0Var) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, a0Var);
            case 1751742049:
                return c.b(a0Var);
            case 1752331379:
                return d.c(a0Var);
            case 1852994675:
                return h.a(a0Var);
            default:
                return null;
        }
    }

    public static f c(int i10, a0 a0Var) {
        ImmutableList.a aVar = new ImmutableList.a();
        int iF = a0Var.f();
        int iB = -2;
        while (a0Var.a() > 8) {
            int iQ = a0Var.q();
            int iE = a0Var.e() + a0Var.q();
            a0Var.O(iE);
            a aVarC = iQ == 1414744396 ? c(a0Var.q(), a0Var) : a(iQ, iB, a0Var);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            a0Var.P(iE);
            a0Var.O(iF);
        }
        return new f(i10, aVar.m());
    }

    @Nullable
    public <T extends a> T b(Class<T> cls) {
        r2<a> it = this.f73002a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // k6.a
    public int getType() {
        return this.f73003b;
    }
}
