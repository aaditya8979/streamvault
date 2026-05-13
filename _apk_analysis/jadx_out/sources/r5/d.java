package r5;

import a6.k0;
import java.util.Collections;
import java.util.List;
import n5.e;

/* JADX INFO: compiled from: SsaSubtitle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<List<n5.b>> f78662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Long> f78663c;

    public d(List<List<n5.b>> list, List<Long> list2) {
        this.f78662b = list;
        this.f78663c = list2;
    }

    @Override // n5.e
    public List<n5.b> getCues(long j10) {
        int iF = k0.f(this.f78663c, Long.valueOf(j10), true, false);
        return iF == -1 ? Collections.emptyList() : this.f78662b.get(iF);
    }

    @Override // n5.e
    public long getEventTime(int i10) {
        a6.a.a(i10 >= 0);
        a6.a.a(i10 < this.f78663c.size());
        return this.f78663c.get(i10).longValue();
    }

    @Override // n5.e
    public int getEventTimeCount() {
        return this.f78663c.size();
    }

    @Override // n5.e
    public int getNextEventTimeIndex(long j10) {
        int iD = k0.d(this.f78663c, Long.valueOf(j10), false, false);
        if (iD < this.f78663c.size()) {
            return iD;
        }
        return -1;
    }
}
