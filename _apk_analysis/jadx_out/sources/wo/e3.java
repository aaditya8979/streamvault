package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e3 extends k2<bn.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public byte[] f86503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86504b;

    public e3(byte[] bArr) {
        tn.p.k(bArr, "bufferWithData");
        this.f86503a = bArr;
        this.f86504b = bn.j.p(bArr);
        b(10);
    }

    public /* synthetic */ e3(byte[] bArr, tn.i iVar) {
        this(bArr);
    }

    @Override // wo.k2
    public /* bridge */ /* synthetic */ bn.j a() {
        return bn.j.a(f());
    }

    @Override // wo.k2
    public void b(int i10) {
        if (bn.j.p(this.f86503a) < i10) {
            byte[] bArr = this.f86503a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, zn.n.e(i10, bn.j.p(bArr) * 2));
            tn.p.j(bArrCopyOf, "copyOf(...)");
            this.f86503a = bn.j.g(bArrCopyOf);
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86504b;
    }

    public final void e(byte b10) {
        k2.c(this, 0, 1, null);
        byte[] bArr = this.f86503a;
        int iD = d();
        this.f86504b = iD + 1;
        bn.j.t(bArr, iD, b10);
    }

    @NotNull
    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f86503a, d());
        tn.p.j(bArrCopyOf, "copyOf(...)");
        return bn.j.g(bArrCopyOf);
    }
}
