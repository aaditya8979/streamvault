package p5;

import a6.k0;
import a6.m;
import a6.s;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f76995h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f76996i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f76997j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f76998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f76999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f77000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0923b f77001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f77002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f77003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f77004g;

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f77006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f77007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f77008d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f77005a = i10;
            this.f77006b = iArr;
            this.f77007c = iArr2;
            this.f77008d = iArr3;
        }
    }

    /* JADX INFO: renamed from: p5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class C0923b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f77012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f77013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f77014f;

        public C0923b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f77009a = i10;
            this.f77010b = i11;
            this.f77011c = i12;
            this.f77012d = i13;
            this.f77013e = i14;
            this.f77014f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f77016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f77017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f77018d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f77015a = i10;
            this.f77016b = z10;
            this.f77017c = bArr;
            this.f77018d = bArr2;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f77022d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f77019a = i10;
            this.f77020b = i11;
            this.f77021c = i12;
            this.f77022d = sparseArray;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77024b;

        public e(int i10, int i11) {
            this.f77023a = i10;
            this.f77024b = i11;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f77026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f77028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f77029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f77030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f77031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f77032h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f77033i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f77034j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f77035k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f77025a = i10;
            this.f77026b = z10;
            this.f77027c = i11;
            this.f77028d = i12;
            this.f77029e = i13;
            this.f77030f = i14;
            this.f77031g = i15;
            this.f77032h = i16;
            this.f77033i = i17;
            this.f77034j = i18;
            this.f77035k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f77035k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f77035k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f77039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f77040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f77041f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f77036a = i10;
            this.f77037b = i11;
            this.f77038c = i12;
            this.f77039d = i13;
            this.f77040e = i14;
            this.f77041f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f77044c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f77045d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f77046e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f77047f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f77048g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public C0923b f77049h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public d f77050i;

        public h(int i10, int i11) {
            this.f77042a = i10;
            this.f77043b = i11;
        }

        public void a() {
            this.f77044c.clear();
            this.f77045d.clear();
            this.f77046e.clear();
            this.f77047f.clear();
            this.f77048g.clear();
            this.f77049h = null;
            this.f77050i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f76998a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f76999b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f77000c = new Canvas();
        this.f77001d = new C0923b(719, 575, 0, 719, 0, 575);
        this.f77002e = new a(0, c(), d(), e());
        this.f77003f = new h(i10, i11);
    }

    public static byte[] a(int i10, int i11, s sVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) sVar.h(i11);
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

    public static int g(s sVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int iH3 = sVar.h(2);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (sVar.g()) {
                    iH = sVar.h(3) + 3;
                    iH2 = sVar.h(2);
                } else {
                    if (sVar.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int iH4 = sVar.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = sVar.h(4) + 12;
                            iH2 = sVar.h(2);
                        } else if (iH4 != 3) {
                            z10 = z11;
                        } else {
                            iH = sVar.h(8) + 29;
                            iH2 = sVar.h(2);
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

    public static int h(s sVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int iH2 = sVar.h(4);
            int i14 = 2;
            if (iH2 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (sVar.g()) {
                if (sVar.g()) {
                    int iH3 = sVar.h(2);
                    if (iH3 != 0) {
                        if (iH3 != 1) {
                            if (iH3 == 2) {
                                iH = sVar.h(4) + 9;
                                iH2 = sVar.h(4);
                            } else if (iH3 != 3) {
                                z10 = z11;
                                iH2 = 0;
                                i12 = 0;
                            } else {
                                iH = sVar.h(8) + 25;
                                iH2 = sVar.h(4);
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
                    iH = sVar.h(2) + 4;
                    iH2 = sVar.h(4);
                }
                z10 = z11;
                i12 = iH;
            } else {
                int iH4 = sVar.h(3);
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

    public static int i(s sVar, int[] iArr, @Nullable byte[] bArr, int i10, int i11, @Nullable Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int iH2 = sVar.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (sVar.g()) {
                z10 = z11;
                iH = sVar.h(7);
                iH2 = sVar.h(8);
            } else {
                int iH3 = sVar.h(7);
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
        s sVar = new s(bArr);
        int iG = i11;
        int i13 = i12;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (sVar.b() != 0) {
            int iH = sVar.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        if (i10 == 3) {
                            bArr3 = bArrA == null ? f76996i : bArrA;
                        } else if (i10 != 2) {
                            bArr2 = null;
                            iG = g(sVar, iArr, bArr2, iG, i13, paint, canvas);
                            sVar.c();
                        } else {
                            bArr3 = bArrA3 == null ? f76995h : bArrA3;
                        }
                        bArr2 = bArr3;
                        iG = g(sVar, iArr, bArr2, iG, i13, paint, canvas);
                        sVar.c();
                        break;
                    case 17:
                        iG = h(sVar, iArr, i10 == 3 ? bArrA2 == null ? f76997j : bArrA2 : null, iG, i13, paint, canvas);
                        sVar.c();
                        break;
                    case 18:
                        iG = i(sVar, iArr, null, iG, i13, paint, canvas);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA3 = a(4, 4, sVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, sVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, sVar);
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
        int[] iArr = i10 == 3 ? aVar.f77008d : i10 == 2 ? aVar.f77007c : aVar.f77006b;
        j(cVar.f77017c, iArr, i10, i11, i12, paint, canvas);
        j(cVar.f77018d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    public static a l(s sVar, int i10) {
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = sVar.h(8);
        sVar.q(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i14 > 0) {
            int iH6 = sVar.h(i12);
            int iH7 = sVar.h(i12);
            int i15 = i14 - 2;
            int[] iArr = (iH7 & 128) != 0 ? iArrC : (iH7 & 64) != 0 ? iArrD : iArrE;
            if ((iH7 & 1) != 0) {
                iH3 = sVar.h(i12);
                iH4 = sVar.h(i12);
                iH = sVar.h(i12);
                iH2 = sVar.h(i12);
                i11 = i15 - 4;
            } else {
                int iH8 = sVar.h(6) << i13;
                int iH9 = sVar.h(4) << 4;
                iH = sVar.h(4) << 4;
                i11 = i15 - 2;
                iH2 = sVar.h(i13) << 6;
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
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), k0.q((int) (d10 + (1.402d * d11)), 0, 255), k0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), k0.q((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    public static C0923b m(s sVar) {
        int i10;
        int i11;
        int i12;
        int iH;
        sVar.q(4);
        boolean zG = sVar.g();
        sVar.q(3);
        int iH2 = sVar.h(16);
        int iH3 = sVar.h(16);
        if (zG) {
            int iH4 = sVar.h(16);
            int iH5 = sVar.h(16);
            int iH6 = sVar.h(16);
            iH = sVar.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new C0923b(iH2, iH3, i10, i12, i11, iH);
    }

    public static c n(s sVar) {
        byte[] bArr;
        int iH = sVar.h(16);
        sVar.q(4);
        int iH2 = sVar.h(2);
        boolean zG = sVar.g();
        sVar.q(1);
        byte[] bArr2 = null;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = sVar.h(16);
                int iH4 = sVar.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    sVar.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    sVar.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        sVar.q(sVar.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    public static d o(s sVar, int i10) {
        int iH = sVar.h(8);
        int iH2 = sVar.h(4);
        int iH3 = sVar.h(2);
        sVar.q(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = sVar.h(8);
            sVar.q(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(sVar.h(16), sVar.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    public static f p(s sVar, int i10) {
        int iH;
        int iH2;
        int iH3 = sVar.h(8);
        sVar.q(4);
        boolean zG = sVar.g();
        sVar.q(3);
        int i11 = 16;
        int iH4 = sVar.h(16);
        int iH5 = sVar.h(16);
        int iH6 = sVar.h(3);
        int iH7 = sVar.h(3);
        int i12 = 2;
        sVar.q(2);
        int iH8 = sVar.h(8);
        int iH9 = sVar.h(8);
        int iH10 = sVar.h(4);
        int iH11 = sVar.h(2);
        sVar.q(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int iH12 = sVar.h(i11);
            int iH13 = sVar.h(i12);
            int iH14 = sVar.h(i12);
            int iH15 = sVar.h(12);
            int i14 = iH11;
            sVar.q(4);
            int iH16 = sVar.h(12);
            i13 -= 6;
            if (iH13 == 1 || iH13 == 2) {
                i13 -= 2;
                iH = sVar.h(8);
                iH2 = sVar.h(8);
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

    public static void q(s sVar, h hVar) {
        f fVar;
        int iH = sVar.h(8);
        int iH2 = sVar.h(16);
        int iH3 = sVar.h(16);
        int iD = sVar.d() + iH3;
        if (iH3 * 8 > sVar.b()) {
            m.h("DvbParser", "Data field length exceeds limit");
            sVar.q(sVar.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f77042a) {
                    d dVar = hVar.f77050i;
                    d dVarO = o(sVar, iH3);
                    if (dVarO.f77021c != 0) {
                        hVar.f77050i = dVarO;
                        hVar.f77044c.clear();
                        hVar.f77045d.clear();
                        hVar.f77046e.clear();
                    } else if (dVar != null && dVar.f77020b != dVarO.f77020b) {
                        hVar.f77050i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f77050i;
                if (iH2 == hVar.f77042a && dVar2 != null) {
                    f fVarP = p(sVar, iH3);
                    if (dVar2.f77021c == 0 && (fVar = hVar.f77044c.get(fVarP.f77025a)) != null) {
                        fVarP.a(fVar);
                    }
                    hVar.f77044c.put(fVarP.f77025a, fVarP);
                }
                break;
            case 18:
                if (iH2 == hVar.f77042a) {
                    a aVarL = l(sVar, iH3);
                    hVar.f77045d.put(aVarL.f77005a, aVarL);
                } else if (iH2 == hVar.f77043b) {
                    a aVarL2 = l(sVar, iH3);
                    hVar.f77047f.put(aVarL2.f77005a, aVarL2);
                }
                break;
            case 19:
                if (iH2 == hVar.f77042a) {
                    c cVarN = n(sVar);
                    hVar.f77046e.put(cVarN.f77015a, cVarN);
                } else if (iH2 == hVar.f77043b) {
                    c cVarN2 = n(sVar);
                    hVar.f77048g.put(cVarN2.f77015a, cVarN2);
                }
                break;
            case 20:
                if (iH2 == hVar.f77042a) {
                    hVar.f77049h = m(sVar);
                }
                break;
        }
        sVar.r(iD - sVar.d());
    }

    public List<n5.b> b(byte[] bArr, int i10) {
        int i11;
        SparseArray<g> sparseArray;
        s sVar = new s(bArr, i10);
        while (sVar.b() >= 48 && sVar.h(8) == 15) {
            q(sVar, this.f77003f);
        }
        h hVar = this.f77003f;
        d dVar = hVar.f77050i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0923b c0923b = hVar.f77049h;
        if (c0923b == null) {
            c0923b = this.f77001d;
        }
        Bitmap bitmap = this.f77004g;
        if (bitmap == null || c0923b.f77009a + 1 != bitmap.getWidth() || c0923b.f77010b + 1 != this.f77004g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0923b.f77009a + 1, c0923b.f77010b + 1, Bitmap.Config.ARGB_8888);
            this.f77004g = bitmapCreateBitmap;
            this.f77000c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f77022d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f77000c.save();
            e eVarValueAt = sparseArray2.valueAt(i12);
            f fVar = this.f77003f.f77044c.get(sparseArray2.keyAt(i12));
            int i13 = eVarValueAt.f77023a + c0923b.f77011c;
            int i14 = eVarValueAt.f77024b + c0923b.f77013e;
            this.f77000c.clipRect(i13, i14, Math.min(fVar.f77027c + i13, c0923b.f77012d), Math.min(fVar.f77028d + i14, c0923b.f77014f));
            a aVar = this.f77003f.f77045d.get(fVar.f77031g);
            if (aVar == null && (aVar = this.f77003f.f77047f.get(fVar.f77031g)) == null) {
                aVar = this.f77002e;
            }
            SparseArray<g> sparseArray3 = fVar.f77035k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i15);
                g gVarValueAt = sparseArray3.valueAt(i15);
                c cVar = this.f77003f.f77046e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f77003f.f77048g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f77030f, gVarValueAt.f77038c + i13, i14 + gVarValueAt.f77039d, cVar2.f77016b ? null : this.f76998a, this.f77000c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f77026b) {
                int i16 = fVar.f77030f;
                this.f76999b.setColor(i16 == 3 ? aVar.f77008d[fVar.f77032h] : i16 == 2 ? aVar.f77007c[fVar.f77033i] : aVar.f77006b[fVar.f77034j]);
                this.f77000c.drawRect(i13, i14, fVar.f77027c + i13, fVar.f77028d + i14, this.f76999b);
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f77004g, i13, i14, fVar.f77027c, fVar.f77028d);
            int i17 = c0923b.f77009a;
            float f10 = i13 / i17;
            int i18 = c0923b.f77010b;
            arrayList.add(new n5.b(bitmapCreateBitmap2, f10, 0, i14 / i18, 0, fVar.f77027c / i17, fVar.f77028d / i18));
            this.f77000c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f77000c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f77003f.a();
    }
}
