package i4;

import a6.k0;
import android.annotation.TargetApi;
import android.media.MediaCodec;

/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f63689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f63690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f63692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f63693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f63696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f63697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0782b f63698j;

    /* JADX INFO: renamed from: i4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CryptoInfo.java */
    @TargetApi(24)
    public static final class C0782b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f63699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f63700b;

        public C0782b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f63699a = cryptoInfo;
            this.f63700b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public final void b(int i10, int i11) {
            this.f63700b.set(i10, i11);
            this.f63699a.setPattern(this.f63700b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f63697i = cryptoInfo;
        this.f63698j = k0.f3574a >= 24 ? new C0782b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f63697i;
    }

    public void b(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f63694f = i10;
        this.f63692d = iArr;
        this.f63693e = iArr2;
        this.f63690b = bArr;
        this.f63689a = bArr2;
        this.f63691c = i11;
        this.f63695g = i12;
        this.f63696h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f63697i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (k0.f3574a >= 24) {
            this.f63698j.b(i12, i13);
        }
    }
}
