package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final cn.m<byte[]> f97959a = new cn.m<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97960b;

    public final void a(@NotNull byte[] bArr) {
        tn.p.k(bArr, "array");
        synchronized (this) {
            if (this.f97960b + bArr.length < j.f97950a) {
                this.f97960b += bArr.length / 2;
                this.f97959a.addLast(bArr);
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    @NotNull
    public final byte[] b(int i10) {
        byte[] bArrS;
        synchronized (this) {
            bArrS = this.f97959a.s();
            if (bArrS != null) {
                this.f97960b -= bArrS.length / 2;
            } else {
                bArrS = null;
            }
        }
        return bArrS == null ? new byte[i10] : bArrS;
    }
}
