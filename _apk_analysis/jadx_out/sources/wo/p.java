package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class p extends k2<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public char[] f86582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86583b;

    public p(@NotNull char[] cArr) {
        tn.p.k(cArr, "bufferWithData");
        this.f86582a = cArr;
        this.f86583b = cArr.length;
        b(10);
    }

    @Override // wo.k2
    public void b(int i10) {
        char[] cArr = this.f86582a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, zn.n.e(i10, cArr.length * 2));
            tn.p.j(cArrCopyOf, "copyOf(...)");
            this.f86582a = cArrCopyOf;
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86583b;
    }

    public final void e(char c10) {
        k2.c(this, 0, 1, null);
        char[] cArr = this.f86582a;
        int iD = d();
        this.f86583b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // wo.k2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f86582a, d());
        tn.p.j(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
