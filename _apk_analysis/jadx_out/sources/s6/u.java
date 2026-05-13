package s6;

import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f79411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79412e;

    public u(int i10, int i11) {
        this.f79408a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f79411d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f79409b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f79411d;
            int length = bArr2.length;
            int i13 = this.f79412e;
            if (length < i13 + i12) {
                this.f79411d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f79411d, this.f79412e, i12);
            this.f79412e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f79409b) {
            return false;
        }
        this.f79412e -= i10;
        this.f79409b = false;
        this.f79410c = true;
        return true;
    }

    public boolean c() {
        return this.f79410c;
    }

    public void d() {
        this.f79409b = false;
        this.f79410c = false;
    }

    public void e(int i10) {
        s7.a.g(!this.f79409b);
        boolean z10 = i10 == this.f79408a;
        this.f79409b = z10;
        if (z10) {
            this.f79412e = 3;
            this.f79410c = false;
        }
    }
}
