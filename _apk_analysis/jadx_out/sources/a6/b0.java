package a6;

import a6.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes7.dex */
public class b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<b> f3512h = new Comparator() { // from class: a6.z
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b0.g((b0.b) obj, (b0.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator<b> f3513i = new Comparator() { // from class: a6.a0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b0.h((b0.b) obj, (b0.b) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3514a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3520g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f3516c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f3515b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3517d = -1;

    /* JADX INFO: compiled from: SlidingPercentile.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f3523c;

        public b() {
        }
    }

    public b0(int i10) {
        this.f3514a = i10;
    }

    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f3521a - bVar2.f3521a;
    }

    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f3523c, bVar2.f3523c);
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f3520g;
        if (i11 > 0) {
            b[] bVarArr = this.f3516c;
            int i12 = i11 - 1;
            this.f3520g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f3518e;
        this.f3518e = i13 + 1;
        bVar.f3521a = i13;
        bVar.f3522b = i10;
        bVar.f3523c = f10;
        this.f3515b.add(bVar);
        this.f3519f += i10;
        while (true) {
            int i14 = this.f3519f;
            int i15 = this.f3514a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f3515b.get(0);
            int i17 = bVar2.f3522b;
            if (i17 <= i16) {
                this.f3519f -= i17;
                this.f3515b.remove(0);
                int i18 = this.f3520g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f3516c;
                    this.f3520g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f3522b = i17 - i16;
                this.f3519f -= i16;
            }
        }
    }

    public final void d() {
        if (this.f3517d != 1) {
            Collections.sort(this.f3515b, f3512h);
            this.f3517d = 1;
        }
    }

    public final void e() {
        if (this.f3517d != 0) {
            Collections.sort(this.f3515b, f3513i);
            this.f3517d = 0;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f3519f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3515b.size(); i11++) {
            b bVar = this.f3515b.get(i11);
            i10 += bVar.f3522b;
            if (i10 >= f11) {
                return bVar.f3523c;
            }
        }
        if (this.f3515b.isEmpty()) {
            return Float.NaN;
        }
        return this.f3515b.get(r5.size() - 1).f3523c;
    }

    public void i() {
        this.f3515b.clear();
        this.f3517d = -1;
        this.f3518e = 0;
        this.f3519f = 0;
    }
}
