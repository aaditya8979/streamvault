package o5;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CeaSubtitle.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements n5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<n5.b> f76195b;

    public f(List<n5.b> list) {
        this.f76195b = list;
    }

    @Override // n5.e
    public List<n5.b> getCues(long j10) {
        return j10 >= 0 ? this.f76195b : Collections.emptyList();
    }

    @Override // n5.e
    public long getEventTime(int i10) {
        a6.a.a(i10 == 0);
        return 0L;
    }

    @Override // n5.e
    public int getEventTimeCount() {
        return 1;
    }

    @Override // n5.e
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
