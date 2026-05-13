package g6;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import s7.m0;

/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public byte[] f62084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public byte[] f62085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public int[] f62087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public int[] f62088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f62092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final b f62093j;

    /* JADX INFO: compiled from: CryptoInfo.java */
    @RequiresApi(24)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f62094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f62095b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f62094a = cryptoInfo;
            this.f62095b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public final void b(int i10, int i11) {
            this.f62095b.set(i10, i11);
            this.f62094a.setPattern(this.f62095b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f62092i = cryptoInfo;
        this.f62093j = m0.f79487a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f62092i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f62087d == null) {
            int[] iArr = new int[1];
            this.f62087d = iArr;
            this.f62092i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f62087d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f62089f = i10;
        this.f62087d = iArr;
        this.f62088e = iArr2;
        this.f62085b = bArr;
        this.f62084a = bArr2;
        this.f62086c = i11;
        this.f62090g = i12;
        this.f62091h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f62092i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (m0.f79487a >= 24) {
            ((b) s7.a.e(this.f62093j)).b(i12, i13);
        }
    }
}
