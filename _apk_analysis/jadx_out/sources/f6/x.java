package f6;

import s7.m0;

/* JADX INFO: compiled from: WavUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public final class x {
    public static int a(int i10, int i11) {
        if (i10 != 1) {
            if (i10 == 3) {
                return i11 == 32 ? 4 : 0;
            }
            if (i10 != 65534) {
                return 0;
            }
        }
        return m0.W(i11);
    }
}
