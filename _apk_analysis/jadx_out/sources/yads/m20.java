package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public final class m20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f92214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f92215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f92217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f92218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f92219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f92220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f92221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f92222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l20 f92223j;

    public m20() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f92222i = cryptoInfo;
        this.f92223j = ib3.f90737a >= 24 ? new l20(cryptoInfo) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f92219f = i10;
        this.f92217d = iArr;
        this.f92218e = iArr2;
        this.f92215b = bArr;
        this.f92214a = bArr2;
        this.f92216c = i11;
        this.f92220g = i12;
        this.f92221h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f92222i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (ib3.f90737a >= 24) {
            l20 l20Var = this.f92223j;
            l20Var.getClass();
            l20Var.a(i12, i13);
        }
    }
}
