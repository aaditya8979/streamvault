package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f17374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f17375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f17376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f17377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f17378e;

    public b() {
        int i10 = z.f18822a;
        MediaCodec.CryptoInfo cryptoInfo = i10 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f17377d = cryptoInfo;
        this.f17378e = i10 >= 24 ? new a(cryptoInfo) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.f17375b = iArr;
        this.f17376c = iArr2;
        this.f17374a = bArr2;
        int i11 = z.f18822a;
        if (i11 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f17377d;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i11 >= 24) {
                a.a(this.f17378e);
            }
        }
    }
}
