package yads;

import java.util.Comparator;
import java.util.TreeSet;
import yads.bf1;
import yads.zr;

/* JADX INFO: loaded from: classes10.dex */
public final class bf1 implements ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f87980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet f87981b = new TreeSet(new Comparator() { // from class: bt.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return bf1.a((zr) obj, (zr) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f87982c;

    public bf1(long j10) {
        this.f87980a = j10;
    }

    public static int a(zr zrVar, zr zrVar2) {
        long j10 = zrVar.f97756g;
        long j11 = zrVar2.f97756g;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!zrVar.f97751b.equals(zrVar2.f97751b)) {
            return zrVar.f97751b.compareTo(zrVar2.f97751b);
        }
        long j12 = zrVar.f97752c - zrVar2.f97752c;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public final void a(nr nrVar, long j10) {
        while (this.f87982c + j10 > this.f87980a && !this.f87981b.isEmpty()) {
            zr zrVar = (zr) this.f87981b.first();
            vy2 vy2Var = (vy2) nrVar;
            synchronized (vy2Var) {
                vy2Var.b(zrVar);
            }
        }
    }
}
