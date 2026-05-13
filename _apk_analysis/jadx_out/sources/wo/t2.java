package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class t2 extends k2<short[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public short[] f86620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86621b;

    public t2(@NotNull short[] sArr) {
        tn.p.k(sArr, "bufferWithData");
        this.f86620a = sArr;
        this.f86621b = sArr.length;
        b(10);
    }

    @Override // wo.k2
    public void b(int i10) {
        short[] sArr = this.f86620a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, zn.n.e(i10, sArr.length * 2));
            tn.p.j(sArrCopyOf, "copyOf(...)");
            this.f86620a = sArrCopyOf;
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86621b;
    }

    public final void e(short s10) {
        k2.c(this, 0, 1, null);
        short[] sArr = this.f86620a;
        int iD = d();
        this.f86621b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // wo.k2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f86620a, d());
        tn.p.j(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
