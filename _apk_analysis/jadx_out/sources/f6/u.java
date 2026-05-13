package f6;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: MpegAudioUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f61542a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f61543b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f61544c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f61545d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f61546e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f61547f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f61548g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: MpegAudioUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f61550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f61551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f61552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f61553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f61554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f61555g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!u.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f61549a = i11;
            this.f61550b = u.f61542a[3 - i12];
            int i15 = u.f61543b[i14];
            this.f61552d = i15;
            if (i11 == 2) {
                this.f61552d = i15 / 2;
            } else if (i11 == 0) {
                this.f61552d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f61555g = u.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? u.f61544c[i13 - 1] : u.f61545d[i13 - 1];
                this.f61554f = i17;
                this.f61551c = (((i17 * 12) / this.f61552d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? u.f61546e[i13 - 1] : u.f61547f[i13 - 1];
                    this.f61554f = i18;
                    this.f61551c = ((i18 * 144) / this.f61552d) + i16;
                } else {
                    int i19 = u.f61548g[i13 - 1];
                    this.f61554f = i19;
                    this.f61551c = (((i12 == 1 ? 72 : 144) * i19) / this.f61552d) + i16;
                }
            }
            this.f61553e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f61543b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f61544c[i13 - 1] : f61545d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f61546e[i13 - 1] : f61547f[i13 - 1] : f61548g[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static int k(int i10, int i11) {
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

    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
