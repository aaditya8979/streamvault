package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class e01 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f89050e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f89051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f89054d = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f89051a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f89054d;
            int length = bArr2.length;
            int i13 = this.f89052b + i12;
            if (length < i13) {
                this.f89054d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f89054d, this.f89052b, i12);
            this.f89052b += i12;
        }
    }
}
