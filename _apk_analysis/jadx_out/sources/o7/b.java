package o7;

import g7.i;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Tx3gSubtitle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f76280c = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g7.b> f76281b;

    public b() {
        this.f76281b = Collections.emptyList();
    }

    public b(g7.b bVar) {
        this.f76281b = Collections.singletonList(bVar);
    }

    @Override // g7.i
    public List<g7.b> getCues(long j10) {
        return j10 >= 0 ? this.f76281b : Collections.emptyList();
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
