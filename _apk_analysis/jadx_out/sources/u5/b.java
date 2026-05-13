package u5;

import java.util.Collections;
import java.util.List;
import n5.e;

/* JADX INFO: compiled from: Tx3gSubtitle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f85494c = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<n5.b> f85495b;

    public b() {
        this.f85495b = Collections.emptyList();
    }

    public b(n5.b bVar) {
        this.f85495b = Collections.singletonList(bVar);
    }

    @Override // n5.e
    public List<n5.b> getCues(long j10) {
        return j10 >= 0 ? this.f85495b : Collections.emptyList();
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
