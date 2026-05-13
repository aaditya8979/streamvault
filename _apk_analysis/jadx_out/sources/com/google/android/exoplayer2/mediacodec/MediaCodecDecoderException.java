package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderException;
import s7.m0;

/* JADX INFO: loaded from: classes11.dex */
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final d codecInfo;

    @Nullable
    public final String diagnosticInfo;

    public MediaCodecDecoderException(Throwable th2, @Nullable d dVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(dVar == null ? null : dVar.f21854a);
        super(sb2.toString(), th2);
        this.codecInfo = dVar;
        this.diagnosticInfo = m0.f79487a >= 21 ? a(th2) : null;
    }

    @Nullable
    @RequiresApi(21)
    public static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
