package com.google.android.exoplayer.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import e5.b0;
import j5.e;
import java.io.IOException;
import y5.m;

/* JADX INFO: loaded from: classes8.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    public interface a {
        HlsPlaylistTracker a(e eVar, m mVar, k5.e eVar2);
    }

    public interface b {
        boolean b(Uri uri, long j10);

        void onPlaylistChanged();
    }

    public interface c {
        void i(com.google.android.exoplayer.source.hls.playlist.c cVar);
    }

    void a(Uri uri, b0.a aVar, c cVar);

    @Nullable
    com.google.android.exoplayer.source.hls.playlist.b b();

    void c(b bVar);

    void d(b bVar);

    long getInitialStartTimeUs();

    @Nullable
    com.google.android.exoplayer.source.hls.playlist.c getPlaylistSnapshot(Uri uri, boolean z10);

    boolean isLive();

    boolean isSnapshotValid(Uri uri);

    void maybeThrowPlaylistRefreshError(Uri uri) throws IOException;

    void maybeThrowPrimaryPlaylistRefreshError() throws IOException;

    void refreshPlaylist(Uri uri);

    void stop();
}
