package j5;

import a6.g0;
import android.util.SparseArray;

/* JADX INFO: compiled from: TimestampAdjusterProvider.java */
/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<g0> f72306a = new SparseArray<>();

    public g0 a(int i10) {
        g0 g0Var = this.f72306a.get(i10);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(Long.MAX_VALUE);
        this.f72306a.put(i10, g0Var2);
        return g0Var2;
    }

    public void b() {
        this.f72306a.clear();
    }
}
