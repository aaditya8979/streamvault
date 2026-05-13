package p5;

import java.util.List;
import n5.e;

/* JADX INFO: compiled from: DvbSubtitle.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<n5.b> f77051b;

    public c(List<n5.b> list) {
        this.f77051b = list;
    }

    @Override // n5.e
    public List<n5.b> getCues(long j10) {
        return this.f77051b;
    }

    @Override // n5.e
    public long getEventTime(int i10) {
        return 0L;
    }

    @Override // n5.e
    public int getEventTimeCount() {
        return 1;
    }

    @Override // n5.e
    public int getNextEventTimeIndex(long j10) {
        return -1;
    }
}
