package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.u;
import com.ironsource.Z7;
import e6.s1;
import f6.r;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public interface AudioSink {

    public static final class ConfigurationException extends Exception {
        public final m format;

        public ConfigurationException(String str, m mVar) {
            super(str);
            this.format = mVar;
        }

        public ConfigurationException(Throwable th2, m mVar) {
            super(th2);
            this.format = mVar;
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final m format;
        public final boolean isRecoverable;

        public InitializationException(int i10, int i11, int i12, int i13, m mVar, boolean z10, @Nullable Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(Z7.f30794r);
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(z10 ? " (recoverable)" : "");
            super(sb2.toString(), exc);
            this.audioTrackState = i10;
            this.isRecoverable = z10;
            this.format = mVar;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.actualPresentationTimeUs = j10;
            this.expectedPresentationTimeUs = j11;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final m format;
        public final boolean isRecoverable;

        public WriteException(int i10, m mVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.isRecoverable = z10;
            this.errorCode = i10;
            this.format = mVar;
        }
    }

    public interface a {
        default void onAudioSinkError(Exception exc) {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull() {
        }

        default void onPositionAdvancing(long j10) {
        }

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z10);

        void onUnderrun(int i10, long j10, long j11);
    }

    boolean a(m mVar);

    void b(u uVar);

    void c(com.google.android.exoplayer2.audio.a aVar);

    void d();

    void disableTunneling();

    void e(r rVar);

    void enableTunnelingV21();

    void f(a aVar);

    void flush();

    int g(m mVar);

    long getCurrentPositionUs(boolean z10);

    u getPlaybackParameters();

    void h(m mVar, int i10, @Nullable int[] iArr) throws ConfigurationException;

    boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws WriteException, InitializationException;

    void handleDiscontinuity();

    boolean hasPendingData();

    default void i(@Nullable s1 s1Var) {
    }

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void reset();

    void setAudioSessionId(int i10);

    default void setOutputStreamOffsetUs(long j10) {
    }

    @RequiresApi(23)
    default void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z10);

    void setVolume(float f10);
}
