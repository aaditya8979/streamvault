package n7;

import g7.i;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s7.m0;

/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f75250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f75251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, g> f75252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, e> f75253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f75254f;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f75250b = dVar;
        this.f75253e = map2;
        this.f75254f = map3;
        this.f75252d = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f75251c = dVar.j();
    }

    @Override // g7.i
    public List<g7.b> getCues(long j10) {
        return this.f75250b.h(j10, this.f75252d, this.f75253e, this.f75254f);
    }

    @Override // g7.i
    public long getEventTime(int i10) {
        return this.f75251c[i10];
    }

    @Override // g7.i
    public int getEventTimeCount() {
        return this.f75251c.length;
    }

    @Override // g7.i
    public int getNextEventTimeIndex(long j10) {
        int iE = m0.e(this.f75251c, j10, false, false);
        if (iE < this.f75251c.length) {
            return iE;
        }
        return -1;
    }
}
