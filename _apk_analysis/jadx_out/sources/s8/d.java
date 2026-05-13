package s8;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.zxing.FormatException;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: Version.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d[] f79581h = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f79586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f79587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f79588g;

    /* JADX INFO: compiled from: Version.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79590b;

        public b(int i10, int i11) {
            this.f79589a = i10;
            this.f79590b = i11;
        }

        public int a() {
            return this.f79589a;
        }

        public int b() {
            return this.f79590b;
        }
    }

    /* JADX INFO: compiled from: Version.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f79592b;

        public c(int i10, b bVar) {
            this.f79591a = i10;
            this.f79592b = new b[]{bVar};
        }

        public c(int i10, b bVar, b bVar2) {
            this.f79591a = i10;
            this.f79592b = new b[]{bVar, bVar2};
        }

        public b[] a() {
            return this.f79592b;
        }

        public int b() {
            return this.f79591a;
        }
    }

    public d(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f79582a = i10;
        this.f79583b = i11;
        this.f79584c = i12;
        this.f79585d = i13;
        this.f79586e = i14;
        this.f79587f = cVar;
        int iB = cVar.b();
        int iA = 0;
        for (b bVar : cVar.a()) {
            iA += bVar.a() * (bVar.b() + iB);
        }
        this.f79588g = iA;
    }

    public static d[] a() {
        int i10 = 1;
        int i11 = 5;
        int i12 = 8;
        d dVar = new d(3, 14, 14, 12, 12, new c(10, new b(i10, i12)));
        int i13 = 2;
        int i14 = 12;
        int i15 = 18;
        d dVar2 = new d(7, 22, 22, 20, 20, new c(20, new b(i10, 30)));
        int i16 = 6;
        int i17 = 36;
        int i18 = 62;
        int i19 = 56;
        int i20 = 68;
        b bVar = new b(i10, 5);
        b bVar2 = new b(i10, 10);
        b bVar3 = new b(i10, 16);
        return new d[]{new d(1, 10, 10, 8, 8, new c(i11, new b(i10, 3))), new d(2, 12, 12, 10, 10, new c(7, new b(i10, i11))), dVar, new d(4, 16, 16, 14, 14, new c(i14, new b(i10, i14))), new d(5, 18, 18, 16, 16, new c(14, new b(i10, i15))), new d(6, 20, 20, 18, 18, new c(i15, new b(i10, 22))), dVar2, new d(8, 24, 24, 22, 22, new c(24, new b(i10, i17))), new d(9, 26, 26, 24, 24, new c(28, new b(i10, 44))), new d(10, 32, 32, 14, 14, new c(i17, new b(i10, i18))), new d(11, 36, 36, 16, 16, new c(42, new b(i10, 86))), new d(12, 40, 40, 18, 18, new c(48, new b(i10, 114))), new d(13, 44, 44, 20, 20, new c(i19, new b(i10, 144))), new d(14, 48, 48, 22, 22, new c(i20, new b(i10, 174))), new d(15, 52, 52, 24, 24, new c(42, new b(i13, 102))), new d(16, 64, 64, 14, 14, new c(i19, new b(i13, 140))), new d(17, 72, 72, 16, 16, new c(i17, new b(4, 92))), new d(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new d(19, 88, 88, 20, 20, new c(i19, new b(4, 144))), new d(20, 96, 96, 22, 22, new c(i20, new b(4, 174))), new d(21, 104, 104, 24, 24, new c(i19, new b(i16, 136))), new d(22, 120, 120, 18, 18, new c(i20, new b(i16, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION))), new d(23, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 20, 20, new c(i18, new b(i12, 163))), new d(24, 144, 144, 22, 22, new c(i18, new b(i12, 156), new b(i13, 155))), new d(25, 8, 18, 6, 16, new c(7, bVar)), new d(26, 8, 32, 6, 14, new c(11, bVar2)), new d(27, 12, 26, 10, 24, new c(14, bVar3)), new d(28, 12, 36, 10, 16, new c(i15, new b(i10, 22))), new d(29, 16, 36, 14, 16, new c(24, new b(i10, 32))), new d(30, 16, 48, 14, 22, new c(28, new b(i10, 49)))};
    }

    public static d h(int i10, int i11) throws FormatException {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (d dVar : f79581h) {
            if (dVar.f79583b == i10 && dVar.f79584c == i11) {
                return dVar;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int b() {
        return this.f79586e;
    }

    public int c() {
        return this.f79585d;
    }

    public c d() {
        return this.f79587f;
    }

    public int e() {
        return this.f79584c;
    }

    public int f() {
        return this.f79583b;
    }

    public int g() {
        return this.f79588g;
    }

    public int i() {
        return this.f79582a;
    }

    public String toString() {
        return String.valueOf(this.f79582a);
    }
}
