package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final cn.m<char[]> f97969a = new cn.m<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97970b;

    public final void a(@NotNull char[] cArr) {
        tn.p.k(cArr, "array");
        synchronized (this) {
            if (this.f97970b + cArr.length < j.f97950a) {
                this.f97970b += cArr.length;
                this.f97969a.addLast(cArr);
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    @NotNull
    public final char[] b(int i10) {
        char[] cArrS;
        synchronized (this) {
            cArrS = this.f97969a.s();
            if (cArrS != null) {
                this.f97970b -= cArrS.length;
            } else {
                cArrS = null;
            }
        }
        return cArrS == null ? new char[i10] : cArrS;
    }
}
