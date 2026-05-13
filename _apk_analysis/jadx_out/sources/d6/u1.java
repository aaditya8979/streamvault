package d6;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.ExoPlaybackException;

/* JADX INFO: compiled from: RendererCapabilities.java */
/* JADX INFO: loaded from: classes6.dex */
public interface u1 {
    static int create(int i10) {
        return create(i10, 0, 0);
    }

    static int create(int i10, int i11, int i12) {
        return create(i10, i11, i12, 0, 128);
    }

    @SuppressLint({"WrongConstant"})
    static int create(int i10, int i11, int i12, int i13, int i14) {
        return i10 | i11 | i12 | i13 | i14;
    }

    @SuppressLint({"WrongConstant"})
    static int getAdaptiveSupport(int i10) {
        return i10 & 24;
    }

    @SuppressLint({"WrongConstant"})
    static int getDecoderSupport(int i10) {
        return i10 & 384;
    }

    @SuppressLint({"WrongConstant"})
    static int getFormatSupport(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int getHardwareAccelerationSupport(int i10) {
        return i10 & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int getTunnelingSupport(int i10) {
        return i10 & 32;
    }

    int a(com.google.android.exoplayer2.m mVar) throws ExoPlaybackException;

    String getName();

    int getTrackType();

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;
}
