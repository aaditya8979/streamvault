package i7;

import g7.i;
import java.util.List;

/* JADX INFO: compiled from: DvbSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g7.b> f64006b;

    public c(List<g7.b> list) {
        this.f64006b = list;
    }

    @Override // g7.i
    public List<g7.b> getCues(long j10) {
        return this.f64006b;
    }

    @Override // g7.i
    public long getEventTime(int i10) {
        return 0L;
    }

    @Override // g7.i
    public int getEventTimeCount() {
        return 1;
    }

    @Override // g7.i
    public int getNextEventTimeIndex(long j10) {
        return -1;
    }
}
