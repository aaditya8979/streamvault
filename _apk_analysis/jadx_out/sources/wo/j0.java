package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends k2<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public float[] f86548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86549b;

    public j0(@NotNull float[] fArr) {
        tn.p.k(fArr, "bufferWithData");
        this.f86548a = fArr;
        this.f86549b = fArr.length;
        b(10);
    }

    @Override // wo.k2
    public void b(int i10) {
        float[] fArr = this.f86548a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, zn.n.e(i10, fArr.length * 2));
            tn.p.j(fArrCopyOf, "copyOf(...)");
            this.f86548a = fArrCopyOf;
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86549b;
    }

    public final void e(float f10) {
        k2.c(this, 0, 1, null);
        float[] fArr = this.f86548a;
        int iD = d();
        this.f86549b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // wo.k2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f86548a, d());
        tn.p.j(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
