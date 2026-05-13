package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.ironsource.Gc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class QK {
    public static byte[] A06;
    public static String[] A07 = {Gc.f29437e, "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", "v", "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public QI A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    static {
        A09();
    }

    public static int A06(AbstractC2076Qg abstractC2076Qg) {
        int i10 = abstractC2076Qg.A0C & 14;
        if (abstractC2076Qg.A0f()) {
            return 4;
        }
        if ((i10 & 4) != 0) {
            return i10;
        }
        int iA0P = abstractC2076Qg.A0P();
        int iA0M = abstractC2076Qg.A0M();
        return (iA0P == -1 || iA0M == -1 || iA0P == iA0M) ? i10 : i10 | 2048;
    }

    private final QJ A07() {
        return new QJ();
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 109);
            String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A06 = new byte[]{76, 75, 30, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public final long A0A() {
        return this.A00;
    }

    public final long A0B() {
        return this.A01;
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D() {
        return this.A03;
    }

    public final QJ A0E(C2073Qd c2073Qd, AbstractC2076Qg abstractC2076Qg) {
        return A07().A01(abstractC2076Qg);
    }

    public final QJ A0F(C2073Qd c2073Qd, AbstractC2076Qg abstractC2076Qg, int i10, List<Object> list) {
        return A07().A01(abstractC2076Qg);
    }

    public final void A0G() {
        if (0 < this.A05.size()) {
            this.A05.get(0);
            throw new NullPointerException(A08(0, 20, 112));
        }
        this.A05.clear();
    }

    public abstract void A0H();

    public abstract void A0I();

    public final void A0J(QI qi2) {
        this.A04 = qi2;
    }

    public final void A0K(AbstractC2076Qg abstractC2076Qg) {
        if (this.A04 != null) {
            this.A04.ACK(abstractC2076Qg);
        }
    }

    public abstract void A0L(AbstractC2076Qg abstractC2076Qg);

    public abstract boolean A0M();

    public abstract boolean A0N(AbstractC2076Qg abstractC2076Qg);

    public abstract boolean A0O(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3);

    public abstract boolean A0P(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3);

    public abstract boolean A0Q(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3);

    public abstract boolean A0R(AbstractC2076Qg abstractC2076Qg, AbstractC2076Qg abstractC2076Qg2, QJ qj2, QJ qj3);

    public boolean A0S(AbstractC2076Qg abstractC2076Qg, List<Object> list) {
        return A0N(abstractC2076Qg);
    }
}
