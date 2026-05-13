package f6;

import com.google.android.exoplayer2.ParserException;
import s7.z;

/* JADX INFO: compiled from: AacUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f61470a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f61471b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: AacUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61474c;

        public b(int i10, int i11, String str) {
            this.f61472a = i10;
            this.f61473b = i11;
            this.f61474c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static int b(z zVar) {
        int iH = zVar.h(5);
        return iH == 31 ? zVar.h(6) + 32 : iH;
    }

    public static int c(z zVar) throws ParserException {
        int iH = zVar.h(4);
        if (iH == 15) {
            return zVar.h(24);
        }
        if (iH < 13) {
            return f61470a[iH];
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static b d(z zVar, boolean z10) throws ParserException {
        int iB = b(zVar);
        int iC = c(zVar);
        int iH = zVar.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(zVar);
            iB = b(zVar);
            if (iB == 22) {
                iH = zVar.h(4);
            }
        }
        if (z10) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + iB);
                }
            }
            f(zVar, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = zVar.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f61471b[iH];
        if (i10 != -1) {
            return new b(iC, i10, str);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static b e(byte[] bArr) throws ParserException {
        return d(new z(bArr), false);
    }

    public static void f(z zVar, int i10, int i11) {
        if (zVar.g()) {
            s7.q.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.g()) {
            zVar.r(14);
        }
        boolean zG = zVar.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            zVar.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                zVar.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                zVar.r(3);
            }
            zVar.r(1);
        }
    }
}
