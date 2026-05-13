package k5;

import com.google.android.exoplayer.upstream.g;

/* JADX INFO: compiled from: DefaultHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {
    @Override // k5.e
    public g.a<d> a(com.google.android.exoplayer.source.hls.playlist.b bVar) {
        return new com.google.android.exoplayer.source.hls.playlist.d(bVar);
    }

    @Override // k5.e
    public g.a<d> createPlaylistParser() {
        return new com.google.android.exoplayer.source.hls.playlist.d();
    }
}
