package yads;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import yads.uo;
import yads.vo;

/* JADX INFO: loaded from: classes2.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f96147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f96148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f96149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f96150d;

    public vo() {
        this(new Random());
    }

    public vo(Random random) {
        this.f96149c = new HashMap();
        this.f96150d = random;
        this.f96147a = new HashMap();
        this.f96148b = new HashMap();
    }

    public static int a(uo uoVar, uo uoVar2) {
        int iCompare = Integer.compare(uoVar.f95732c, uoVar2.f95732c);
        return iCompare != 0 ? iCompare : uoVar.f95731b.compareTo(uoVar2.f95731b);
    }

    public static void a(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public final ArrayList a(p51 p51Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a(jElapsedRealtime, this.f96147a);
        a(jElapsedRealtime, this.f96148b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < p51Var.size(); i10++) {
            uo uoVar = (uo) p51Var.get(i10);
            if (!this.f96147a.containsKey(uoVar.f95731b) && !this.f96148b.containsKey(Integer.valueOf(uoVar.f95732c))) {
                arrayList.add(uoVar);
            }
        }
        return arrayList;
    }

    public final uo b(p51 p51Var) {
        ArrayList arrayListA = a(p51Var);
        if (arrayListA.size() < 2) {
            Iterator it = arrayListA.iterator();
            return (uo) (it.hasNext() ? it.next() : null);
        }
        Collections.sort(arrayListA, new Comparator() { // from class: bt.ob
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return vo.a((uo) obj, (uo) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((uo) arrayListA.get(0)).f95732c;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayListA.size()) {
                break;
            }
            uo uoVar = (uo) arrayListA.get(i12);
            if (i11 == uoVar.f95732c) {
                arrayList.add(new Pair(uoVar.f95731b, Integer.valueOf(uoVar.f95733d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (uo) arrayListA.get(0);
            }
        }
        uo uoVar2 = (uo) this.f96149c.get(arrayList);
        if (uoVar2 == null) {
            List listSubList = arrayListA.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < listSubList.size(); i14++) {
                i13 += ((uo) listSubList.get(i14)).f95733d;
            }
            int iNextInt = this.f96150d.nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 >= listSubList.size()) {
                    uoVar2 = (uo) vd1.a(listSubList);
                    break;
                }
                uo uoVar3 = (uo) listSubList.get(i10);
                i15 += uoVar3.f95733d;
                if (iNextInt < i15) {
                    uoVar2 = uoVar3;
                    break;
                }
                i10++;
            }
            this.f96149c.put(arrayList, uoVar2);
        }
        return uoVar2;
    }
}
