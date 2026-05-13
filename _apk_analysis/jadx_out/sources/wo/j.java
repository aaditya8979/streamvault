package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class j extends k2<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public byte[] f86546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86547b;

    public j(@NotNull byte[] bArr) {
        tn.p.k(bArr, "bufferWithData");
        this.f86546a = bArr;
        this.f86547b = bArr.length;
        b(10);
    }

    @Override // wo.k2
    public void b(int i10) {
        byte[] bArr = this.f86546a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, zn.n.e(i10, bArr.length * 2));
            tn.p.j(bArrCopyOf, "copyOf(...)");
            this.f86546a = bArrCopyOf;
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86547b;
    }

    public final void e(byte b10) {
        k2.c(this, 0, 1, null);
        byte[] bArr = this.f86546a;
        int iD = d();
        this.f86547b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // wo.k2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f86546a, d());
        tn.p.j(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
