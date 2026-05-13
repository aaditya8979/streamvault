package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2084Qo {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C2726gb<AbstractC2076Qg, C2082Qm> A00 = new C2726gb<>();
    public final OS<AbstractC2076Qg> A01 = new OS<>();

    static {
        A02();
    }

    private QJ A00(AbstractC2076Qg abstractC2076Qg, int i10) {
        C2082Qm c2082QmA0B;
        QJ qj2;
        int iA08 = this.A00.A08(abstractC2076Qg);
        if (iA08 >= 0 && (c2082QmA0B = this.A00.A0B(iA08)) != null) {
            int i11 = c2082QmA0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i11 & i10) != 0) {
                c2082QmA0B.A00 &= ~i10;
                if (i10 == 4) {
                    qj2 = c2082QmA0B.A02;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException(A01(0, 29, 14));
                    }
                    qj2 = c2082QmA0B.A01;
                }
                if ((c2082QmA0B.A00 & 12) == 0) {
                    this.A00.A0A(iA08);
                    C2082Qm.A02(c2082QmA0B);
                }
                return qj2;
            }
        }
        return null;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    public final QJ A03(AbstractC2076Qg abstractC2076Qg) {
        return A00(abstractC2076Qg, 8);
    }

    public final QJ A04(AbstractC2076Qg abstractC2076Qg) {
        return A00(abstractC2076Qg, 4);
    }

    public final AbstractC2076Qg A05(long j10) {
        return this.A01.A08(j10);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C2082Qm.A01();
    }

    public final void A08(long j10, AbstractC2076Qg abstractC2076Qg) {
        this.A01.A0B(j10, abstractC2076Qg);
    }

    public final void A09(AbstractC2076Qg abstractC2076Qg) {
        C2082Qm c2082QmA00 = this.A00.get(abstractC2076Qg);
        if (c2082QmA00 == null) {
            c2082QmA00 = C2082Qm.A00();
            this.A00.put(abstractC2076Qg, c2082QmA00);
        }
        c2082QmA00.A00 |= 1;
    }

    public final void A0A(AbstractC2076Qg abstractC2076Qg) {
        C2082Qm c2082Qm = this.A00.get(abstractC2076Qg);
        if (c2082Qm == null) {
            return;
        }
        c2082Qm.A00 &= -2;
    }

    public final void A0B(AbstractC2076Qg abstractC2076Qg) {
        int iA06 = this.A01.A06() - 1;
        while (true) {
            if (iA06 < 0) {
                break;
            }
            if (abstractC2076Qg == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
            iA06--;
        }
        C2082Qm c2082QmRemove = this.A00.remove(abstractC2076Qg);
        if (c2082QmRemove != null) {
            C2082Qm.A02(c2082QmRemove);
        }
    }

    public final void A0C(AbstractC2076Qg abstractC2076Qg) {
        A0A(abstractC2076Qg);
    }

    public final void A0D(AbstractC2076Qg abstractC2076Qg, QJ qj2) {
        C2082Qm c2082QmA00 = this.A00.get(abstractC2076Qg);
        if (c2082QmA00 == null) {
            c2082QmA00 = C2082Qm.A00();
            this.A00.put(abstractC2076Qg, c2082QmA00);
        }
        c2082QmA00.A00 |= 2;
        c2082QmA00.A02 = qj2;
    }

    public final void A0E(AbstractC2076Qg abstractC2076Qg, QJ qj2) {
        C2082Qm c2082QmA00 = this.A00.get(abstractC2076Qg);
        if (c2082QmA00 == null) {
            c2082QmA00 = C2082Qm.A00();
            this.A00.put(abstractC2076Qg, c2082QmA00);
        }
        c2082QmA00.A01 = qj2;
        c2082QmA00.A00 |= 8;
    }

    public final void A0F(AbstractC2076Qg abstractC2076Qg, QJ qj2) {
        C2082Qm c2082QmA00 = this.A00.get(abstractC2076Qg);
        if (c2082QmA00 == null) {
            c2082QmA00 = C2082Qm.A00();
            this.A00.put(abstractC2076Qg, c2082QmA00);
        }
        c2082QmA00.A02 = qj2;
        c2082QmA00.A00 |= 4;
    }

    public final void A0G(InterfaceC2083Qn interfaceC2083Qn) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC2076Qg abstractC2076QgA09 = this.A00.A09(size);
            C2082Qm c2082QmA0A = this.A00.A0A(size);
            if ((c2082QmA0A.A00 & 3) == 3) {
                interfaceC2083Qn.AJo(abstractC2076QgA09);
            } else if ((c2082QmA0A.A00 & 1) != 0) {
                if (c2082QmA0A.A02 == null) {
                    interfaceC2083Qn.AJo(abstractC2076QgA09);
                } else {
                    interfaceC2083Qn.AGR(abstractC2076QgA09, c2082QmA0A.A02, c2082QmA0A.A01);
                }
            } else if ((c2082QmA0A.A00 & 14) == 14) {
                interfaceC2083Qn.AGP(abstractC2076QgA09, c2082QmA0A.A02, c2082QmA0A.A01);
            } else if ((c2082QmA0A.A00 & 12) == 12) {
                interfaceC2083Qn.AGT(abstractC2076QgA09, c2082QmA0A.A02, c2082QmA0A.A01);
            } else if ((c2082QmA0A.A00 & 4) != 0) {
                interfaceC2083Qn.AGR(abstractC2076QgA09, c2082QmA0A.A02, null);
            } else if ((c2082QmA0A.A00 & 8) != 0) {
                QJ qj2 = c2082QmA0A.A02;
                if (A03[4].charAt(6) == 'y') {
                    throw new RuntimeException();
                }
                A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                interfaceC2083Qn.AGP(abstractC2076QgA09, qj2, c2082QmA0A.A01);
            } else {
                continue;
            }
            C2082Qm.A02(c2082QmA0A);
        }
    }

    public final boolean A0H(AbstractC2076Qg abstractC2076Qg) {
        C2082Qm c2082Qm = this.A00.get(abstractC2076Qg);
        return (c2082Qm == null || (c2082Qm.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC2076Qg abstractC2076Qg) {
        C2082Qm c2082Qm = this.A00.get(abstractC2076Qg);
        return (c2082Qm == null || (c2082Qm.A00 & 4) == 0) ? false : true;
    }
}
