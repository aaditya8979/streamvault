package m7;

import g7.i;
import java.util.Collections;
import java.util.List;
import s7.m0;

/* JADX INFO: compiled from: SubripSubtitle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g7.b[] f74007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f74008c;

    public b(g7.b[] bVarArr, long[] jArr) {
        this.f74007b = bVarArr;
        this.f74008c = jArr;
    }

    @Override // g7.i
    public List<g7.b> getCues(long j10) {
        g7.b bVar;
        int i10 = m0.i(this.f74008c, j10, true, false);
        return (i10 == -1 || (bVar = this.f74007b[i10]) == g7.b.f62135s) ? Collections.emptyList() : Collections.singletonList(bVar);
    }

    @Override // g7.i
    public long getEventTime(int i10) {
        s7.a.a(i10 >= 0);
        s7.a.a(i10 < this.f74008c.length);
        return this.f74008c[i10];
    }

    @Override // g7.i
    public int getEventTimeCount() {
        return this.f74008c.length;
    }

    @Override // g7.i
    public int getNextEventTimeIndex(long j10) {
        int iE = m0.e(this.f74008c, j10, false, false);
        if (iE < this.f74008c.length) {
            return iE;
        }
        return -1;
    }
}
