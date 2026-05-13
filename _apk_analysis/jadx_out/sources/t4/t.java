package t4;

import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f84933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f84935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84936e;

    public t(int i10, int i11) {
        this.f84932a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f84935d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f84933b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f84935d;
            int length = bArr2.length;
            int i13 = this.f84936e;
            if (length < i13 + i12) {
                this.f84935d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f84935d, this.f84936e, i12);
            this.f84936e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f84933b) {
            return false;
        }
        this.f84936e -= i10;
        this.f84933b = false;
        this.f84934c = true;
        return true;
    }

    public boolean c() {
        return this.f84934c;
    }

    public void d() {
        this.f84933b = false;
        this.f84934c = false;
    }

    public void e(int i10) {
        a6.a.f(!this.f84933b);
        boolean z10 = i10 == this.f84932a;
        this.f84933b = z10;
        if (z10) {
            this.f84936e = 3;
            this.f84934c = false;
        }
    }
}
