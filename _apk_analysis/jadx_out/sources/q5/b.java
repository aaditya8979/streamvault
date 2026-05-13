package q5;

import java.util.List;
import n5.e;

/* JADX INFO: compiled from: PgsSubtitle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<n5.b> f77828b;

    public b(List<n5.b> list) {
        this.f77828b = list;
    }

    @Override // n5.e
    public List<n5.b> getCues(long j10) {
        return this.f77828b;
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
