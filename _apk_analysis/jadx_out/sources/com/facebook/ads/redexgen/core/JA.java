package com.facebook.ads.redexgen.core;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JA {
    public static String[] A08 = {"QrT", "qnQt5WyeAQ09x35f49C3fjiJNyL2Wwm", "MYPg", "kl", "gHVF4DBtkYKODoSVDn", "z4XgsVt0P4PakGRoUHMjSa47eQapG64R", "b9pv7rqD0c4j71TLmNGUCRckoksDVk", "PMM3oo9z0bIH04LH4O"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<J9> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public JA(int i10, int i11) {
        A0C(i10);
        this.A01 = i11;
    }

    private SpannableString A04() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        int i13 = -1;
        boolean z10 = false;
        int i14 = -1;
        for (int i15 = 0; i15 < this.A06.size(); i15++) {
            J9 j92 = this.A06.get(i15);
            boolean z11 = j92.A02;
            int i16 = j92.A01;
            if (i16 != 8) {
                z10 = i16 == 7;
                if (i16 != 7) {
                    i14 = C14370v.A0Q[i16];
                }
            }
            int i17 = j92.A00;
            if (i17 != (i15 + 1 < this.A06.size() ? this.A06.get(i15 + 1).A00 : length)) {
                if (i10 != -1 && !z11) {
                    A06(spannableStringBuilder, i10, i17);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    A05(spannableStringBuilder, i11, i17);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i14 != i13) {
                    A07(spannableStringBuilder, i12, i17, i13);
                    i13 = i14;
                    i12 = i17;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            A06(spannableStringBuilder, i10, length);
        }
        if (i11 != -1 && i11 != length) {
            A05(spannableStringBuilder, i11, length);
        }
        if (i12 != length) {
            A07(spannableStringBuilder, i12, length, i13);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        if (i12 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.C3157o2 A08(int r10) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.JA.A08(int):com.facebook.ads.redexgen.X.o2");
    }

    public final void A09() {
        int length = this.A05.length();
        if (length > 0) {
            this.A05.delete(length - 1, length);
            for (int size = this.A06.size() - 1; size >= 0; size--) {
                J9 j92 = this.A06.get(size);
                String[] strArr = A08;
                if (strArr[2].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[7] = "VxqvNxDPFU2KcS189G";
                strArr2[1] = "CD1791pAkSaTS5HjwfKDVAxBa1qJnUw";
                if (j92.A00 != length) {
                    return;
                }
                j92.A00--;
            }
        }
    }

    public final void A0A() {
        this.A07.add(A04());
        this.A05.setLength(0);
        this.A06.clear();
        int iMin = Math.min(this.A01, this.A03);
        while (this.A07.size() >= iMin) {
            this.A07.remove(0);
        }
    }

    public final void A0B(char c10) {
        if (this.A05.length() < 32) {
            this.A05.append(c10);
        }
    }

    public final void A0C(int i10) {
        this.A00 = i10;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0D(int i10) {
        this.A00 = i10;
    }

    public final void A0E(int i10) {
        this.A01 = i10;
    }

    public final void A0F(int i10, boolean z10) {
        this.A06.add(new J9(i10, z10, this.A05.length()));
    }

    public final boolean A0G() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }
}
