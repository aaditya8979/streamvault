package h7;

import g7.i;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CeaSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g7.b> f63095b;

    public f(List<g7.b> list) {
        this.f63095b = list;
    }

    @Override // g7.i
    public List<g7.b> getCues(long j10) {
        return j10 >= 0 ? this.f63095b : Collections.emptyList();
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
