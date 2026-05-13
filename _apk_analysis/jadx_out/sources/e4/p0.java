package e4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import e4.o0;
import java.io.IOException;

/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes11.dex */
public interface p0 extends o0.b {
    default void c(float f10) throws ExoPlaybackException {
    }

    void d(Format[] formatArr, e5.i0 i0Var, long j10) throws ExoPlaybackException;

    void disable();

    void e(r0 r0Var, Format[] formatArr, e5.i0 i0Var, long j10, boolean z10, long j11) throws ExoPlaybackException;

    q0 getCapabilities();

    @Nullable
    a6.o getMediaClock();

    long getReadingPositionUs();

    int getState();

    @Nullable
    e5.i0 getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void render(long j10, long j11) throws ExoPlaybackException;

    void reset();

    void resetPosition(long j10) throws ExoPlaybackException;

    void setCurrentStreamFinal();

    void setIndex(int i10);

    void start() throws ExoPlaybackException;

    void stop() throws ExoPlaybackException;
}
