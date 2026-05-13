package l7;

import g7.i;
import java.util.Collections;
import java.util.List;
import s7.m0;

/* JADX INFO: compiled from: SsaSubtitle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<List<g7.b>> f73745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Long> f73746c;

    public d(List<List<g7.b>> list, List<Long> list2) {
        this.f73745b = list;
        this.f73746c = list2;
    }

    @Override // g7.i
    public List<g7.b> getCues(long j10) {
        int iF = m0.f(this.f73746c, Long.valueOf(j10), true, false);
        return iF == -1 ? Collections.emptyList() : this.f73745b.get(iF);
    }

    @Override // g7.i
    public long getEventTime(int i10) {
        s7.a.a(i10 >= 0);
        s7.a.a(i10 < this.f73746c.size());
        return this.f73746c.get(i10).longValue();
    }

    @Override // g7.i
    public int getEventTimeCount() {
        return this.f73746c.size();
    }

    @Override // g7.i
    public int getNextEventTimeIndex(long j10) {
        int iD = m0.d(this.f73746c, Long.valueOf(j10), false, false);
        if (iD < this.f73746c.size()) {
            return iD;
        }
        return -1;
    }
}
