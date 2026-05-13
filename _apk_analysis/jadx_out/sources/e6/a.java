package e6;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.v;
import java.util.List;
import r7.d;

/* JADX INFO: compiled from: AnalyticsCollector.java */
/* JADX INFO: loaded from: classes8.dex */
public interface a extends v.d, com.google.android.exoplayer2.source.j, d.a, com.google.android.exoplayer2.drm.b {
    void H(List<i.b> list, @Nullable i.b bVar);

    void a(com.google.android.exoplayer2.m mVar, @Nullable g6.g gVar);

    void b(g6.e eVar);

    void d(com.google.android.exoplayer2.m mVar, @Nullable g6.g gVar);

    void h(g6.e eVar);

    void i(g6.e eVar);

    void j(g6.e eVar);

    void n(com.google.android.exoplayer2.v vVar, Looper looper);

    void notifySeekStarted();

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDecoderReleased(String str);

    void onAudioPositionAdvancing(long j10);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i10, long j10, long j11);

    void onDroppedFrames(int i10, long j10);

    void onRenderedFirstFrame(Object obj, long j10);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDecoderReleased(String str);

    void onVideoFrameProcessingOffset(long j10, int i10);

    void release();

    void w(b bVar);
}
