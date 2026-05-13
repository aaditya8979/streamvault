package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class sz2 implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u30 f95022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r33 f95023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f95024c;

    public sz2(p30 p30Var, u30 u30Var) {
        vf1.a();
        this.f95022a = u30Var;
        this.f95023b = new r33(p30Var);
    }

    @Override // yads.bg1
    public final void a() {
        int i10;
        r33 r33Var;
        byte[] bArr;
        r33 r33Var2 = this.f95023b;
        r33Var2.f94278b = 0L;
        try {
            r33Var2.a(this.f95022a);
            do {
                i10 = (int) this.f95023b.f94278b;
                byte[] bArr2 = this.f95024c;
                if (bArr2 == null) {
                    this.f95024c = new byte[1024];
                } else if (i10 == bArr2.length) {
                    this.f95024c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                r33Var = this.f95023b;
                bArr = this.f95024c;
            } while (r33Var.read(bArr, i10, bArr.length - i10) != -1);
        } finally {
            s30.a(this.f95023b);
        }
    }

    @Override // yads.bg1
    public final void b() {
    }
}
