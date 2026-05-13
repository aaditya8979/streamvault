package no;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static final int a(@NotNull m mVar, byte b10, int i10, int i11) {
        tn.p.k(mVar, "<this>");
        boolean z10 = false;
        if (!(i10 >= 0 && i10 < mVar.j())) {
            throw new IllegalArgumentException(String.valueOf(i10).toString());
        }
        if (i10 <= i11 && i11 <= mVar.j()) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(i11).toString());
        }
        int iF = mVar.f();
        byte[] bArrB = mVar.b(true);
        while (i10 < i11) {
            if (bArrB[iF + i10] == b10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final boolean b(@NotNull m mVar) {
        tn.p.k(mVar, "<this>");
        return mVar.j() == 0;
    }
}
