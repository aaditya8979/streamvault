package t7;

import androidx.annotation.Nullable;
import s7.a0;

/* JADX INFO: compiled from: DolbyVisionConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85094c;

    public d(int i10, int i11, String str) {
        this.f85092a = i10;
        this.f85093b = i11;
        this.f85094c = str;
    }

    @Nullable
    public static d a(a0 a0Var) {
        String str;
        a0Var.Q(2);
        int iD = a0Var.D();
        int i10 = iD >> 1;
        int iD2 = ((a0Var.D() >> 3) & 31) | ((iD & 1) << 5);
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iD2 >= 10 ? "." : ".0");
        sb2.append(iD2);
        return new d(i10, iD2, sb2.toString());
    }
}
