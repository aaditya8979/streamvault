package yads;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class x93 extends fz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jb2 f96689m = new jb2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f96690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f96691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f96692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f96693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f96694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f96695s;

    public x93(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f96691o = 0;
            this.f96692p = -1;
            this.f96693q = "sans-serif";
            this.f96690n = false;
            this.f96694r = 0.85f;
            this.f96695s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f96691o = bArr[24];
        this.f96692p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f96693q = "Serif".equals(ib3.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f96695s = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f96690n = z10;
        if (z10) {
            this.f96694r = ib3.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10);
        } else {
            this.f96694r = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    @Override // yads.fz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.r43 a(byte[] r23, int r24, boolean r25) throws yads.t43 {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.x93.a(byte[], int, boolean):yads.r43");
    }
}
