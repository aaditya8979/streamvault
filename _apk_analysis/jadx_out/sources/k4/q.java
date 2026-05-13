package k4;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: MpegAudioHeader.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f72904h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f72905i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f72906j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f72907k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f72908l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f72909m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f72910n = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f72912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f72917g;

    public static int a(int i10) {
        int i11;
        int i12;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return c(i11, i12);
    }

    public static int b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f72905i[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f72906j[i13 - 1] : f72907k[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f72908l[i13 - 1] : f72909m[i13 - 1] : f72910n[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static int c(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean d(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static boolean e(int i10, q qVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i18 = f72905i[i14];
        if (i11 == 2) {
            i18 /= 2;
        } else if (i11 == 0) {
            i18 /= 4;
        }
        int i19 = i18;
        int i20 = (i10 >>> 9) & 1;
        int iC = c(i11, i12);
        if (i12 == 3) {
            i15 = i11 == 3 ? f72906j[i13 - 1] : f72907k[i13 - 1];
            i17 = (((i15 * 12) / i19) + i20) * 4;
        } else {
            if (i11 == 3) {
                i15 = i12 == 2 ? f72908l[i13 - 1] : f72909m[i13 - 1];
                i16 = (i15 * 144) / i19;
            } else {
                i15 = f72910n[i13 - 1];
                i16 = ((i12 == 1 ? 72 : 144) * i15) / i19;
            }
            i17 = i16 + i20;
        }
        qVar.f(i11, f72904h[3 - i12], i17, i19, ((i10 >> 6) & 3) == 3 ? 1 : 2, i15, iC);
        return true;
    }

    public final void f(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.f72911a = i10;
        this.f72912b = str;
        this.f72913c = i11;
        this.f72914d = i12;
        this.f72915e = i13;
        this.f72916f = i14;
        this.f72917g = i15;
    }
}
