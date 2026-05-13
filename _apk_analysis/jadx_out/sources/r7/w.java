package r7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import r7.w;

/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<b> f78853h = new Comparator() { // from class: r7.u
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return w.g((w.b) obj, (w.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator<b> f78854i = new Comparator() { // from class: r7.v
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return w.h((w.b) obj, (w.b) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78855a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78861g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f78857c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f78856b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78858d = -1;

    /* JADX INFO: compiled from: SlidingPercentile.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f78862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f78863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f78864c;

        public b() {
        }
    }

    public w(int i10) {
        this.f78855a = i10;
    }

    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f78862a - bVar2.f78862a;
    }

    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f78864c, bVar2.f78864c);
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f78861g;
        if (i11 > 0) {
            b[] bVarArr = this.f78857c;
            int i12 = i11 - 1;
            this.f78861g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f78859e;
        this.f78859e = i13 + 1;
        bVar.f78862a = i13;
        bVar.f78863b = i10;
        bVar.f78864c = f10;
        this.f78856b.add(bVar);
        this.f78860f += i10;
        while (true) {
            int i14 = this.f78860f;
            int i15 = this.f78855a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f78856b.get(0);
            int i17 = bVar2.f78863b;
            if (i17 <= i16) {
                this.f78860f -= i17;
                this.f78856b.remove(0);
                int i18 = this.f78861g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f78857c;
                    this.f78861g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f78863b = i17 - i16;
                this.f78860f -= i16;
            }
        }
    }

    public final void d() {
        if (this.f78858d != 1) {
            Collections.sort(this.f78856b, f78853h);
            this.f78858d = 1;
        }
    }

    public final void e() {
        if (this.f78858d != 0) {
            Collections.sort(this.f78856b, f78854i);
            this.f78858d = 0;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f78860f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f78856b.size(); i11++) {
            b bVar = this.f78856b.get(i11);
            i10 += bVar.f78863b;
            if (i10 >= f11) {
                return bVar.f78864c;
            }
        }
        if (this.f78856b.isEmpty()) {
            return Float.NaN;
        }
        return this.f78856b.get(r5.size() - 1).f78864c;
    }

    public void i() {
        this.f78856b.clear();
        this.f78858d = -1;
        this.f78859e = 0;
        this.f78860f = 0;
    }
}
