package p7;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Mp4WebvttSubtitle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements g7.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g7.b> f77092b;

    public b(List<g7.b> list) {
        this.f77092b = Collections.unmodifiableList(list);
    }

    @Override // g7.i
    public List<g7.b> getCues(long j10) {
        return j10 >= 0 ? this.f77092b : Collections.emptyList();
    }

    @Override // g7.i
    public long getEventTime(int i10) {
        s7.a.a(i10 == 0);
        return 0L;
    }

    @Override // g7.i
    public int getEventTimeCount() {
        return 1;
    }

    @Override // g7.i
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
