package com.google.android.exoplayer.mediacodec;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: compiled from: MediaCodecSelector.java */
/* JADX INFO: loaded from: classes9.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20216a = new a();

    /* JADX INFO: compiled from: MediaCodecSelector.java */
    public class a implements b {
        @Override // com.google.android.exoplayer.mediacodec.b
        public List<com.google.android.exoplayer.mediacodec.a> getDecoderInfos(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
            return MediaCodecUtil.n(str, z10, z11);
        }

        @Override // com.google.android.exoplayer.mediacodec.b
        @Nullable
        public com.google.android.exoplayer.mediacodec.a getPassthroughDecoderInfo() throws MediaCodecUtil.DecoderQueryException {
            return MediaCodecUtil.s();
        }
    }

    List<com.google.android.exoplayer.mediacodec.a> getDecoderInfos(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException;

    @Nullable
    com.google.android.exoplayer.mediacodec.a getPassthroughDecoderInfo() throws MediaCodecUtil.DecoderQueryException;
}
