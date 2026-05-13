package t5;

import a6.k0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements n5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f85030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f85031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, e> f85032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, c> f85033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f85034f;

    public f(b bVar, Map<String, e> map, Map<String, c> map2, Map<String, String> map3) {
        this.f85030b = bVar;
        this.f85033e = map2;
        this.f85034f = map3;
        this.f85032d = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f85031c = bVar.j();
    }

    @Override // n5.e
    public List<n5.b> getCues(long j10) {
        return this.f85030b.h(j10, this.f85032d, this.f85033e, this.f85034f);
    }

    @Override // n5.e
    public long getEventTime(int i10) {
        return this.f85031c[i10];
    }

    @Override // n5.e
    public int getEventTimeCount() {
        return this.f85031c.length;
    }

    @Override // n5.e
    public int getNextEventTimeIndex(long j10) {
        int iE = k0.e(this.f85031c, j10, false, false);
        if (iE < this.f85031c.length) {
            return iE;
        }
        return -1;
    }
}
