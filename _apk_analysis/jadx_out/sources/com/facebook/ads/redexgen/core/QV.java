package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QV {
    public SparseArray<QU> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
    }

    private QU A01(int i10) {
        QU qu = this.A00.get(i10);
        if (qu != null) {
            return qu;
        }
        QU qu2 = new QU();
        this.A00.put(i10, qu2);
        return qu2;
    }

    private final void A02() {
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            this.A00.valueAt(i10).A03.clear();
        }
    }

    public final AbstractC2076Qg A03(int i10) {
        QU qu = this.A00.get(i10);
        if (qu == null || qu.A03.isEmpty()) {
            return null;
        }
        return qu.A03.remove(r1.size() - 1);
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        QU quA01 = A01(i10);
        quA01.A01 = A00(quA01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        QU quA01 = A01(i10);
        quA01.A02 = A00(quA01.A02, j10);
    }

    public final void A07(QC qc2) {
        this.A01++;
    }

    public final void A08(QC qc2, QC qc3, boolean z10) {
        if (qc2 != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (qc3 != null) {
            A07(qc3);
        }
    }

    public final void A09(AbstractC2076Qg abstractC2076Qg) {
        int iA0N = abstractC2076Qg.A0N();
        ArrayList<AbstractC2076Qg> arrayList = A01(iA0N).A03;
        if (this.A00.get(iA0N).A00 <= arrayList.size()) {
            return;
        }
        abstractC2076Qg.A0W();
        arrayList.add(abstractC2076Qg);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
