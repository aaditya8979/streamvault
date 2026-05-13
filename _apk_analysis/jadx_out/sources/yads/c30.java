package yads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class c30 implements dv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f88309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f88311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f88312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f88313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hb3 f88314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zx2 f88315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f88316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj2 f88317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f88318m;

    public c30(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, dj2 dj2Var, hb3 hb3Var, zx2 zx2Var, Uri uri, ArrayList arrayList) {
        this.f88306a = j10;
        this.f88307b = j11;
        this.f88308c = j12;
        this.f88309d = z10;
        this.f88310e = j13;
        this.f88311f = j14;
        this.f88312g = j15;
        this.f88313h = j16;
        this.f88317l = dj2Var;
        this.f88314i = hb3Var;
        this.f88316k = uri;
        this.f88315j = zx2Var;
        this.f88318m = arrayList;
    }

    public final c30 a(List list) {
        c30 c30Var = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new v33(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= c30Var.f88318m.size()) {
                break;
            }
            if (((v33) linkedList.peek()).f95914b != i10) {
                long jB = c30Var.b(i10);
                if (jB != -9223372036854775807L) {
                    j10 += jB;
                }
            } else {
                fc2 fc2Var = (fc2) c30Var.f88318m.get(i10);
                List list2 = fc2Var.f89532c;
                v33 v33Var = (v33) linkedList.poll();
                int i11 = v33Var.f95914b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = v33Var.f95915c;
                    zb zbVar = (zb) list2.get(i12);
                    List list3 = zbVar.f97448c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((lo2) list3.get(v33Var.f95916d));
                        v33Var = (v33) linkedList.poll();
                        if (v33Var.f95914b != i11) {
                            break;
                        }
                    } while (v33Var.f95915c == i12);
                    List list4 = list2;
                    arrayList2.add(new zb(zbVar.f97446a, zbVar.f97447b, arrayList3, zbVar.f97449d, zbVar.f97450e, zbVar.f97451f));
                    if (v33Var.f95914b != i11) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(v33Var);
                arrayList.add(new fc2(fc2Var.f89530a, fc2Var.f89531b - j10, arrayList2, fc2Var.f89533d));
            }
            i10++;
            c30Var = this;
        }
        long j11 = c30Var.f88307b;
        return new c30(c30Var.f88306a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, c30Var.f88308c, c30Var.f88309d, c30Var.f88310e, c30Var.f88311f, c30Var.f88312g, c30Var.f88313h, c30Var.f88317l, c30Var.f88314i, c30Var.f88315j, c30Var.f88316k, arrayList);
    }

    public final fc2 a(int i10) {
        return (fc2) this.f88318m.get(i10);
    }

    public final long b(int i10) {
        if (i10 != this.f88318m.size() - 1) {
            return ((fc2) this.f88318m.get(i10 + 1)).f89531b - ((fc2) this.f88318m.get(i10)).f89531b;
        }
        long j10 = this.f88307b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - ((fc2) this.f88318m.get(i10)).f89531b;
    }

    public final long c(int i10) {
        return ib3.a(b(i10));
    }
}
