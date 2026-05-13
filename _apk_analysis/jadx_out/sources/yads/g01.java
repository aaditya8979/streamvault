package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class g01 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f89755f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f89756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89760e = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f89756a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f89760e;
            int length = bArr2.length;
            int i13 = this.f89758c + i12;
            if (length < i13) {
                this.f89760e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f89760e, this.f89758c, i12);
            this.f89758c += i12;
        }
    }
}
