package f6;

import com.google.android.exoplayer2.audio.AudioProcessor;

/* JADX INFO: compiled from: AudioProcessorChain.java */
/* JADX INFO: loaded from: classes9.dex */
public interface f {
    com.google.android.exoplayer2.u a(com.google.android.exoplayer2.u uVar);

    boolean applySkipSilenceEnabled(boolean z10);

    AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j10);

    long getSkippedOutputFrameCount();
}
