package k5;

import com.google.android.exoplayer.offline.StreamKey;
import com.google.android.exoplayer.upstream.g;
import java.util.List;

/* JADX INFO: compiled from: FilteringHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f72956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<StreamKey> f72957b;

    public c(e eVar, List<StreamKey> list) {
        this.f72956a = eVar;
        this.f72957b = list;
    }

    @Override // k5.e
    public g.a<d> a(com.google.android.exoplayer.source.hls.playlist.b bVar) {
        return new b5.e(this.f72956a.a(bVar), this.f72957b);
    }

    @Override // k5.e
    public g.a<d> createPlaylistParser() {
        return new b5.e(this.f72956a.createPlaylistParser(), this.f72957b);
    }
}
