package yads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yads.lo3;

/* JADX INFO: loaded from: classes2.dex */
public final class to3 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f95309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f95310d;

    public to3(ArrayList arrayList) {
        this.f95308b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f95309c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            lo3 lo3Var = (lo3) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f95309c;
            jArr[i11] = lo3Var.f92055b;
            jArr[i11 + 1] = lo3Var.f92056c;
        }
        long[] jArr2 = this.f95309c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f95310d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // yads.r43
    public final int a() {
        return this.f95310d.length;
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f95310d, j10, false);
        if (iA < this.f95310d.length) {
            return iA;
        }
        return -1;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f95310d;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f95308b.size(); i10++) {
            long[] jArr = this.f95309c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                lo3 lo3Var = (lo3) this.f95308b.get(i10);
                o20 o20Var = lo3Var.f92054a;
                if (o20Var.f93089f == -3.4028235E38f) {
                    arrayList2.add(lo3Var);
                } else {
                    arrayList.add(o20Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: bt.ma
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((lo3) obj).f92055b, ((lo3) obj2).f92055b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            o20 o20Var2 = ((lo3) arrayList2.get(i12)).f92054a;
            o20Var2.getClass();
            arrayList.add(new o20(o20Var2.f93085b, o20Var2.f93086c, o20Var2.f93087d, o20Var2.f93088e, (-1) - i12, 1, o20Var2.f93091h, o20Var2.f93092i, o20Var2.f93093j, o20Var2.f93098o, o20Var2.f93099p, o20Var2.f93094k, o20Var2.f93095l, o20Var2.f93096m, o20Var2.f93097n, o20Var2.f93100q, o20Var2.f93101r));
        }
        return arrayList;
    }
}
