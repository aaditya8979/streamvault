package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends k2<long[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f86500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86501b;

    public e1(@NotNull long[] jArr) {
        tn.p.k(jArr, "bufferWithData");
        this.f86500a = jArr;
        this.f86501b = jArr.length;
        b(10);
    }

    @Override // wo.k2
    public void b(int i10) {
        long[] jArr = this.f86500a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, zn.n.e(i10, jArr.length * 2));
            tn.p.j(jArrCopyOf, "copyOf(...)");
            this.f86500a = jArrCopyOf;
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86501b;
    }

    public final void e(long j10) {
        k2.c(this, 0, 1, null);
        long[] jArr = this.f86500a;
        int iD = d();
        this.f86501b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // wo.k2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f86500a, d());
        tn.p.j(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
