package k6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import com.google.common.collect.ImmutableList;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: StreamFormatChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f73004a;

    public g(m mVar) {
        this.f73004a = mVar;
    }

    @Nullable
    public static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    @Nullable
    public static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    @Nullable
    public static a c(a0 a0Var) {
        a0Var.Q(4);
        int iQ = a0Var.q();
        int iQ2 = a0Var.q();
        a0Var.Q(4);
        int iQ3 = a0Var.q();
        String strA = a(iQ3);
        if (strA != null) {
            m.b bVar = new m.b();
            bVar.j0(iQ).Q(iQ2).e0(strA);
            return new g(bVar.E());
        }
        q.i("StreamFormatChunk", "Ignoring track with unsupported compression " + iQ3);
        return null;
    }

    @Nullable
    public static a d(int i10, a0 a0Var) {
        if (i10 == 2) {
            return c(a0Var);
        }
        if (i10 == 1) {
            return e(a0Var);
        }
        q.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + m0.g0(i10));
        return null;
    }

    @Nullable
    public static a e(a0 a0Var) {
        int iV = a0Var.v();
        String strB = b(iV);
        if (strB == null) {
            q.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + iV);
            return null;
        }
        int iV2 = a0Var.v();
        int iQ = a0Var.q();
        a0Var.Q(6);
        int iW = m0.W(a0Var.J());
        int iV3 = a0Var.v();
        byte[] bArr = new byte[iV3];
        a0Var.j(bArr, 0, iV3);
        m.b bVar = new m.b();
        bVar.e0(strB).H(iV2).f0(iQ);
        if ("audio/raw".equals(strB) && iW != 0) {
            bVar.Y(iW);
        }
        if ("audio/mp4a-latm".equals(strB) && iV3 > 0) {
            bVar.T(ImmutableList.of(bArr));
        }
        return new g(bVar.E());
    }

    @Override // k6.a
    public int getType() {
        return 1718776947;
    }
}
