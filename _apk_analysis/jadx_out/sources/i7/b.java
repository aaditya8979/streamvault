package i7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import g7.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s7.m0;
import s7.q;
import s7.z;

/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f63950h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f63951i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f63952j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f63953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f63954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f63955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0785b f63956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f63957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f63958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f63959g;

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f63961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f63962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f63963d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f63960a = i10;
            this.f63961b = iArr;
            this.f63962c = iArr2;
            this.f63963d = iArr3;
        }
    }

    /* JADX INFO: renamed from: i7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class C0785b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f63968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f63969f;

        public C0785b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f63964a = i10;
            this.f63965b = i11;
            this.f63966c = i12;
            this.f63967d = i13;
            this.f63968e = i14;
            this.f63969f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f63972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f63973d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f63970a = i10;
            this.f63971b = z10;
            this.f63972c = bArr;
            this.f63973d = bArr2;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f63977d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f63974a = i10;
            this.f63975b = i11;
            this.f63976c = i12;
            this.f63977d = sparseArray;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63979b;

        public e(int i10, int i11) {
            this.f63978a = i10;
            this.f63979b = i11;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f63984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f63985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f63986g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f63987h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f63988i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f63989j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f63990k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f63980a = i10;
            this.f63981b = z10;
            this.f63982c = i11;
            this.f63983d = i12;
            this.f63984e = i13;
            this.f63985f = i14;
            this.f63986g = i15;
            this.f63987h = i16;
            this.f63988i = i17;
            this.f63989j = i18;
            this.f63990k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f63990k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f63990k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f63995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f63996f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f63991a = i10;
            this.f63992b = i11;
            this.f63993c = i12;
            this.f63994d = i13;
            this.f63995e = i14;
            this.f63996f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f63999c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f64000d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f64001e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f64002f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f64003g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public C0785b f64004h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public d f64005i;

        public h(int i10, int i11) {
            this.f63997a = i10;
            this.f63998b = i11;
        }

        public void a() {
            this.f63999c.clear();
            this.f64000d.clear();
            this.f64001e.clear();
            this.f64002f.clear();
            this.f64003g.clear();
            this.f64004h = null;
            this.f64005i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f63953a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f63954b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f63955c = new Canvas();
        this.f63956d = new C0785b(719, 575, 0, 719, 0, 575);
        this.f63957e = new a(0, c(), d(), e());
        this.f63958f = new h(i10, i11);
    }

    public static byte[] a(int i10, int i11, z zVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zVar.h(i11);
        }
        return bArr;
    }

    public static int[] c() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int g(z zVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int iH3 = zVar.h(2);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (zVar.g()) {
                    iH = zVar.h(3) + 3;
                    iH2 = zVar.h(2);
                } else {
                    if (zVar.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int iH4 = zVar.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = zVar.h(4) + 12;
                            iH2 = zVar.h(2);
                        } else if (iH4 != 3) {
                            z10 = z11;
                        } else {
                            iH = zVar.h(8) + 29;
                            iH2 = zVar.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    public static int h(z zVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int iH2 = zVar.h(4);
            int i14 = 2;
            if (iH2 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (zVar.g()) {
                if (zVar.g()) {
                    int iH3 = zVar.h(2);
                    if (iH3 != 0) {
                        if (iH3 != 1) {
                            if (iH3 == 2) {
                                iH = zVar.h(4) + 9;
                                iH2 = zVar.h(4);
                            } else if (iH3 != 3) {
                                z10 = z11;
                                iH2 = 0;
                                i12 = 0;
                            } else {
                                iH = zVar.h(8) + 25;
                                iH2 = zVar.h(4);
                            }
                        }
                        z10 = z11;
                        i12 = i14;
                        iH2 = 0;
                    } else {
                        z10 = z11;
                        i12 = 1;
                        iH2 = 0;
                    }
                } else {
                    iH = zVar.h(2) + 4;
                    iH2 = zVar.h(4);
                }
                z10 = z11;
                i12 = iH;
            } else {
                int iH4 = zVar.h(3);
                if (iH4 != 0) {
                    i14 = iH4 + 2;
                    z10 = z11;
                    i12 = i14;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    public static int i(z zVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int iH2 = zVar.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (zVar.g()) {
                z10 = z11;
                iH = zVar.h(7);
                iH2 = zVar.h(8);
            } else {
                int iH3 = zVar.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i12, i11, i12 + iH, i11 + 1, paint);
            }
            i12 += iH;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    public static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        z zVar = new z(bArr);
        int iG = i11;
        int i13 = i12;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (zVar.b() != 0) {
            int iH = zVar.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        if (i10 == 3) {
                            bArr3 = bArrA == null ? f63951i : bArrA;
                        } else if (i10 != 2) {
                            bArr2 = null;
                            iG = g(zVar, iArr, bArr2, iG, i13, paint, canvas);
                            zVar.c();
                        } else {
                            bArr3 = bArrA3 == null ? f63950h : bArrA3;
                        }
                        bArr2 = bArr3;
                        iG = g(zVar, iArr, bArr2, iG, i13, paint, canvas);
                        zVar.c();
                        break;
                    case 17:
                        iG = h(zVar, iArr, i10 == 3 ? bArrA2 == null ? f63952j : bArrA2 : null, iG, i13, paint, canvas);
                        zVar.c();
                        break;
                    case 18:
                        iG = i(zVar, iArr, null, iG, i13, paint, canvas);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA3 = a(4, 4, zVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, zVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, zVar);
                                break;
                        }
                        break;
                }
            } else {
                i13 += 2;
                iG = i11;
            }
        }
    }

    public static void k(c cVar, a aVar, int i10, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f63963d : i10 == 2 ? aVar.f63962c : aVar.f63961b;
        j(cVar.f63972c, iArr, i10, i11, i12, paint, canvas);
        j(cVar.f63973d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    public static a l(z zVar, int i10) {
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = zVar.h(8);
        zVar.r(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i14 > 0) {
            int iH6 = zVar.h(i12);
            int iH7 = zVar.h(i12);
            int i15 = i14 - 2;
            int[] iArr = (iH7 & 128) != 0 ? iArrC : (iH7 & 64) != 0 ? iArrD : iArrE;
            if ((iH7 & 1) != 0) {
                iH3 = zVar.h(i12);
                iH4 = zVar.h(i12);
                iH = zVar.h(i12);
                iH2 = zVar.h(i12);
                i11 = i15 - 4;
            } else {
                int iH8 = zVar.h(6) << i13;
                int iH9 = zVar.h(4) << 4;
                iH = zVar.h(4) << 4;
                i11 = i15 - 2;
                iH2 = zVar.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), m0.p((int) (d10 + (1.402d * d11)), 0, 255), m0.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), m0.p((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    public static C0785b m(z zVar) {
        int i10;
        int i11;
        int i12;
        int iH;
        zVar.r(4);
        boolean zG = zVar.g();
        zVar.r(3);
        int iH2 = zVar.h(16);
        int iH3 = zVar.h(16);
        if (zG) {
            int iH4 = zVar.h(16);
            int iH5 = zVar.h(16);
            int iH6 = zVar.h(16);
            iH = zVar.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new C0785b(iH2, iH3, i10, i12, i11, iH);
    }

    public static c n(z zVar) {
        byte[] bArr;
        int iH = zVar.h(16);
        zVar.r(4);
        int iH2 = zVar.h(2);
        boolean zG = zVar.g();
        zVar.r(1);
        byte[] bArr2 = m0.f79492f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = zVar.h(16);
                int iH4 = zVar.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    zVar.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    zVar.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        zVar.r(zVar.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    public static d o(z zVar, int i10) {
        int iH = zVar.h(8);
        int iH2 = zVar.h(4);
        int iH3 = zVar.h(2);
        zVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = zVar.h(8);
            zVar.r(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(zVar.h(16), zVar.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    public static f p(z zVar, int i10) {
        int iH;
        int iH2;
        int iH3 = zVar.h(8);
        zVar.r(4);
        boolean zG = zVar.g();
        zVar.r(3);
        int i11 = 16;
        int iH4 = zVar.h(16);
        int iH5 = zVar.h(16);
        int iH6 = zVar.h(3);
        int iH7 = zVar.h(3);
        int i12 = 2;
        zVar.r(2);
        int iH8 = zVar.h(8);
        int iH9 = zVar.h(8);
        int iH10 = zVar.h(4);
        int iH11 = zVar.h(2);
        zVar.r(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int iH12 = zVar.h(i11);
            int iH13 = zVar.h(i12);
            int iH14 = zVar.h(i12);
            int iH15 = zVar.h(12);
            int i14 = iH11;
            zVar.r(4);
            int iH16 = zVar.h(12);
            i13 -= 6;
            if (iH13 == 1 || iH13 == 2) {
                i13 -= 2;
                iH = zVar.h(8);
                iH2 = zVar.h(8);
            } else {
                iH = 0;
                iH2 = 0;
            }
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH, iH2));
            iH11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    public static void q(z zVar, h hVar) {
        f fVar;
        int iH = zVar.h(8);
        int iH2 = zVar.h(16);
        int iH3 = zVar.h(16);
        int iD = zVar.d() + iH3;
        if (iH3 * 8 > zVar.b()) {
            q.i("DvbParser", "Data field length exceeds limit");
            zVar.r(zVar.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f63997a) {
                    d dVar = hVar.f64005i;
                    d dVarO = o(zVar, iH3);
                    if (dVarO.f63976c != 0) {
                        hVar.f64005i = dVarO;
                        hVar.f63999c.clear();
                        hVar.f64000d.clear();
                        hVar.f64001e.clear();
                    } else if (dVar != null && dVar.f63975b != dVarO.f63975b) {
                        hVar.f64005i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f64005i;
                if (iH2 == hVar.f63997a && dVar2 != null) {
                    f fVarP = p(zVar, iH3);
                    if (dVar2.f63976c == 0 && (fVar = hVar.f63999c.get(fVarP.f63980a)) != null) {
                        fVarP.a(fVar);
                    }
                    hVar.f63999c.put(fVarP.f63980a, fVarP);
                }
                break;
            case 18:
                if (iH2 == hVar.f63997a) {
                    a aVarL = l(zVar, iH3);
                    hVar.f64000d.put(aVarL.f63960a, aVarL);
                } else if (iH2 == hVar.f63998b) {
                    a aVarL2 = l(zVar, iH3);
                    hVar.f64002f.put(aVarL2.f63960a, aVarL2);
                }
                break;
            case 19:
                if (iH2 == hVar.f63997a) {
                    c cVarN = n(zVar);
                    hVar.f64001e.put(cVarN.f63970a, cVarN);
                } else if (iH2 == hVar.f63998b) {
                    c cVarN2 = n(zVar);
                    hVar.f64003g.put(cVarN2.f63970a, cVarN2);
                }
                break;
            case 20:
                if (iH2 == hVar.f63997a) {
                    hVar.f64004h = m(zVar);
                }
                break;
        }
        zVar.s(iD - zVar.d());
    }

    public List<g7.b> b(byte[] bArr, int i10) {
        int i11;
        SparseArray<g> sparseArray;
        z zVar = new z(bArr, i10);
        while (zVar.b() >= 48 && zVar.h(8) == 15) {
            q(zVar, this.f63958f);
        }
        h hVar = this.f63958f;
        d dVar = hVar.f64005i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0785b c0785b = hVar.f64004h;
        if (c0785b == null) {
            c0785b = this.f63956d;
        }
        Bitmap bitmap = this.f63959g;
        if (bitmap == null || c0785b.f63964a + 1 != bitmap.getWidth() || c0785b.f63965b + 1 != this.f63959g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0785b.f63964a + 1, c0785b.f63965b + 1, Bitmap.Config.ARGB_8888);
            this.f63959g = bitmapCreateBitmap;
            this.f63955c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f63977d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f63955c.save();
            e eVarValueAt = sparseArray2.valueAt(i12);
            f fVar = this.f63958f.f63999c.get(sparseArray2.keyAt(i12));
            int i13 = eVarValueAt.f63978a + c0785b.f63966c;
            int i14 = eVarValueAt.f63979b + c0785b.f63968e;
            this.f63955c.clipRect(i13, i14, Math.min(fVar.f63982c + i13, c0785b.f63967d), Math.min(fVar.f63983d + i14, c0785b.f63969f));
            a aVar = this.f63958f.f64000d.get(fVar.f63986g);
            if (aVar == null && (aVar = this.f63958f.f64002f.get(fVar.f63986g)) == null) {
                aVar = this.f63957e;
            }
            SparseArray<g> sparseArray3 = fVar.f63990k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i15);
                g gVarValueAt = sparseArray3.valueAt(i15);
                c cVar = this.f63958f.f64001e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f63958f.f64003g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f63985f, gVarValueAt.f63993c + i13, i14 + gVarValueAt.f63994d, cVar2.f63971b ? null : this.f63953a, this.f63955c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f63981b) {
                int i16 = fVar.f63985f;
                this.f63954b.setColor(i16 == 3 ? aVar.f63963d[fVar.f63987h] : i16 == 2 ? aVar.f63962c[fVar.f63988i] : aVar.f63961b[fVar.f63989j]);
                this.f63955c.drawRect(i13, i14, fVar.f63982c + i13, fVar.f63983d + i14, this.f63954b);
            }
            arrayList.add(new b.C0768b().f(Bitmap.createBitmap(this.f63959g, i13, i14, fVar.f63982c, fVar.f63983d)).k(i13 / c0785b.f63964a).l(0).h(i14 / c0785b.f63965b, 0).i(0).n(fVar.f63982c / c0785b.f63964a).g(fVar.f63983d / c0785b.f63965b).a());
            this.f63955c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f63955c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f63958f.a();
    }
}
