package sg.bigo.ads.common.w;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import sg.bigo.ads.common.w.c;

/* JADX INFO: loaded from: classes7.dex */
@RequiresApi(api = 19)
final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator<C1030a> f82737g = new Comparator<C1030a>() { // from class: sg.bigo.ads.common.w.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C1030a c1030a, C1030a c1030a2) {
            return c1030a2.a() - c1030a.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f82738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f82739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c.C1032c> f82740c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.b[] f82742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f82743f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TimingLogger f82741d = null;

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.a$a, reason: collision with other inner class name */
    public class C1030a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82744a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f82746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f82747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f82748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f82749f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f82750g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f82751h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f82752i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f82753j;

        public C1030a(int i10, int i11) {
            this.f82746c = i10;
            this.f82744a = i11;
            c();
        }

        private int f() {
            return (this.f82744a + 1) - this.f82746c;
        }

        public final int a() {
            return ((this.f82749f - this.f82748e) + 1) * ((this.f82751h - this.f82750g) + 1) * ((this.f82753j - this.f82752i) + 1);
        }

        public final boolean b() {
            return f() > 1;
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f82738a;
            int[] iArr2 = aVar.f82739b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f82746c; i17 <= this.f82744a; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int iA = a.a(i18);
                int iB = a.b(i18);
                int iC = a.c(i18);
                if (iA > i11) {
                    i11 = iA;
                }
                if (iA < i10) {
                    i10 = iA;
                }
                if (iB > i12) {
                    i12 = iB;
                }
                if (iB < i15) {
                    i15 = iB;
                }
                if (iC > i13) {
                    i13 = iC;
                }
                if (iC < i16) {
                    i16 = iC;
                }
            }
            this.f82748e = i10;
            this.f82749f = i11;
            this.f82750g = i15;
            this.f82751h = i12;
            this.f82752i = i16;
            this.f82753j = i13;
            this.f82747d = i14;
        }

        public final int d() {
            int i10 = this.f82749f - this.f82748e;
            int i11 = this.f82751h - this.f82750g;
            int i12 = this.f82753j - this.f82752i;
            int i13 = (i10 < i11 || i10 < i12) ? (i11 < i10 || i11 < i12) ? -1 : -2 : -3;
            a aVar = a.this;
            int[] iArr = aVar.f82738a;
            int[] iArr2 = aVar.f82739b;
            a.a(iArr, i13, this.f82746c, this.f82744a);
            Arrays.sort(iArr, this.f82746c, this.f82744a + 1);
            a.a(iArr, i13, this.f82746c, this.f82744a);
            int i14 = this.f82747d / 2;
            int i15 = this.f82746c;
            int i16 = 0;
            while (true) {
                int i17 = this.f82744a;
                if (i15 > i17) {
                    return this.f82746c;
                }
                i16 += iArr2[iArr[i15]];
                if (i16 >= i14) {
                    return Math.min(i17 - 1, i15);
                }
                i15++;
            }
        }

        public final c.C1032c e() {
            a aVar = a.this;
            int[] iArr = aVar.f82738a;
            int[] iArr2 = aVar.f82739b;
            int i10 = 0;
            int iA = 0;
            int iB = 0;
            int iC = 0;
            for (int i11 = this.f82746c; i11 <= this.f82744a; i11++) {
                int i12 = iArr[i11];
                int i13 = iArr2[i12];
                i10 += i13;
                iA += a.a(i12) * i13;
                iB += a.b(i12) * i13;
                iC += i13 * a.c(i12);
            }
            if (i10 == 0) {
                return new c.C1032c(a.a(0, 0, 0), i10);
            }
            float f10 = i10;
            return new c.C1032c(a.a(Math.round(iA / f10), Math.round(iB / f10), Math.round(iC / f10)), i10);
        }
    }

    public a(int[] iArr, int i10, c.b[] bVarArr) {
        this.f82742e = bVarArr;
        int[] iArr2 = new int[32768];
        this.f82739b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int iB = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = iB;
            iArr2[iB] = iArr2[iB] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                b.a(d(i14), this.f82743f);
                if (a(this.f82743f)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f82738a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 > i10) {
            PriorityQueue priorityQueue = new PriorityQueue(i10, f82737g);
            priorityQueue.offer(new C1030a(0, this.f82738a.length - 1));
            a(priorityQueue, i10);
            this.f82740c = a(priorityQueue);
            return;
        }
        this.f82740c = new ArrayList();
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = iArr3[i17];
            this.f82740c.add(new c.C1032c(d(i18), iArr2[i18]));
        }
    }

    public static int a(int i10) {
        return (i10 >> 10) & 31;
    }

    public static int a(int i10, int i11, int i12) {
        return Color.rgb(b(i10, 5, 8), b(i11, 5, 8), b(i12, 5, 8));
    }

    private List<c.C1032c> a(Collection<C1030a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C1030a> it = collection.iterator();
        while (it.hasNext()) {
            c.C1032c c1032cE = it.next().e();
            if (!a(c1032cE.a())) {
                arrayList.add(c1032cE);
            }
        }
        return arrayList;
    }

    private static void a(PriorityQueue<C1030a> priorityQueue, int i10) {
        C1030a c1030aPoll;
        while (priorityQueue.size() < i10 && (c1030aPoll = priorityQueue.poll()) != null && c1030aPoll.b()) {
            if (!c1030aPoll.b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iD = c1030aPoll.d();
            C1030a c1030a = a.this.new C1030a(iD + 1, c1030aPoll.f82744a);
            c1030aPoll.f82744a = iD;
            c1030aPoll.c();
            priorityQueue.offer(c1030a);
            priorityQueue.offer(c1030aPoll);
        }
    }

    public static void a(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
            i11++;
        }
    }

    private boolean a(float[] fArr) {
        c.b[] bVarArr = this.f82742e;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.f82742e[i10].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int b(int i10) {
        return (i10 >> 5) & 31;
    }

    private static int b(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    public static int c(int i10) {
        return i10 & 31;
    }

    private static int d(int i10) {
        return a((i10 >> 10) & 31, (i10 >> 5) & 31, i10 & 31);
    }
}
