package b6;

import a6.t;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: DolbyVisionConfig.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5411c;

    public b(int i10, int i11, String str) {
        this.f5409a = i10;
        this.f5410b = i11;
        this.f5411c = str;
    }

    @Nullable
    public static b a(t tVar) {
        String str;
        tVar.M(2);
        int iY = tVar.y();
        int i10 = iY >> 1;
        int iY2 = ((tVar.y() >> 3) & 31) | ((iY & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        return new b(i10, iY2, str + ".0" + i10 + ".0" + iY2);
    }
}
