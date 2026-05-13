package s5;

import a6.k0;
import java.util.Collections;
import java.util.List;
import n5.e;

/* JADX INFO: compiled from: SubripSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5.b[] f79074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f79075c;

    public b(n5.b[] bVarArr, long[] jArr) {
        this.f79074b = bVarArr;
        this.f79075c = jArr;
    }

    @Override // n5.e
    public List<n5.b> getCues(long j10) {
        n5.b bVar;
        int iH = k0.h(this.f79075c, j10, true, false);
        return (iH == -1 || (bVar = this.f79074b[iH]) == n5.b.f75125p) ? Collections.emptyList() : Collections.singletonList(bVar);
    }

    @Override // n5.e
    public long getEventTime(int i10) {
        a6.a.a(i10 >= 0);
        a6.a.a(i10 < this.f79075c.length);
        return this.f79075c[i10];
    }

    @Override // n5.e
    public int getEventTimeCount() {
        return this.f79075c.length;
    }

    @Override // n5.e
    public int getNextEventTimeIndex(long j10) {
        int iE = k0.e(this.f79075c, j10, false, false);
        if (iE < this.f79075c.length) {
            return iE;
        }
        return -1;
    }
}
