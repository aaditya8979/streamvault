package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes11.dex */
public final class l20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f91871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f91872b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public l20(MediaCodec.CryptoInfo cryptoInfo) {
        this.f91871a = cryptoInfo;
    }

    public final void a(int i10, int i11) {
        this.f91872b.set(i10, i11);
        this.f91871a.setPattern(this.f91872b);
    }
}
