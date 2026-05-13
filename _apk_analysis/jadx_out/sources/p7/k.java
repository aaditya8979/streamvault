package p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s7.m0;

/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k implements g7.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e> f77144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f77145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f77146d;

    public k(List<e> list) {
        this.f77144b = Collections.unmodifiableList(new ArrayList(list));
        this.f77145c = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f77145c;
            jArr[i11] = eVar.f77115b;
            jArr[i11 + 1] = eVar.f77116c;
        }
        long[] jArr2 = this.f77145c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f77146d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public static /* synthetic */ int b(e eVar, e eVar2) {
        return Long.compare(eVar.f77115b, eVar2.f77115b);
    }

    @Override // g7.i
    public List<g7.b> getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f77144b.size(); i10++) {
            long[] jArr = this.f77145c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f77144b.get(i10);
                g7.b bVar = eVar.f77114a;
                if (bVar.f62141f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: p7.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.b((e) obj, (e) obj2);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f77114a.b().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // g7.i
    public long getEventTime(int i10) {
        s7.a.a(i10 >= 0);
        s7.a.a(i10 < this.f77146d.length);
        return this.f77146d[i10];
    }

    @Override // g7.i
    public int getEventTimeCount() {
        return this.f77146d.length;
    }

    @Override // g7.i
    public int getNextEventTimeIndex(long j10) {
        int iE = m0.e(this.f77146d, j10, false, false);
        if (iE < this.f77146d.length) {
            return iE;
        }
        return -1;
    }
}
