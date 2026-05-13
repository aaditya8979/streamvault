package o7;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g7.b;
import g7.h;
import g7.i;
import java.util.List;
import s7.a0;
import s7.m0;
import s7.q;
import y7.c;

/* JADX INFO: compiled from: Tx3gDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f76273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f76274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f76275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f76276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f76277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f76278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f76279u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f76273o = new a0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f76275q = 0;
            this.f76276r = -1;
            this.f76277s = "sans-serif";
            this.f76274p = false;
            this.f76278t = 0.85f;
            this.f76279u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f76275q = bArr[24];
        this.f76276r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f76277s = "Serif".equals(m0.B(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f76279u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f76274p = z10;
        if (z10) {
            this.f76278t = m0.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f76278t = 0.85f;
        }
    }

    public static void A(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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

    public static void B(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    public static String C(a0 a0Var) throws SubtitleDecoderException {
        char cG;
        y(a0Var.a() >= 2);
        int iJ = a0Var.J();
        return iJ == 0 ? "" : (a0Var.a() < 2 || !((cG = a0Var.g()) == 65279 || cG == 65534)) ? a0Var.B(iJ, c.f87337c) : a0Var.B(iJ, c.f87340f);
    }

    public static void y(boolean z10) throws SubtitleDecoderException {
        if (!z10) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    public static void z(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    @Override // g7.h
    public i w(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f76273o.N(bArr, i10);
        String strC = C(this.f76273o);
        if (strC.isEmpty()) {
            return b.f76280c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strC);
        A(spannableStringBuilder, this.f76275q, 0, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        z(spannableStringBuilder, this.f76276r, -1, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        B(spannableStringBuilder, this.f76277s, 0, spannableStringBuilder.length());
        float fO = this.f76278t;
        while (this.f76273o.a() >= 8) {
            int iE = this.f76273o.e();
            int iN = this.f76273o.n();
            int iN2 = this.f76273o.n();
            if (iN2 == 1937013100) {
                y(this.f76273o.a() >= 2);
                int iJ = this.f76273o.J();
                for (int i11 = 0; i11 < iJ; i11++) {
                    x(this.f76273o, spannableStringBuilder);
                }
            } else if (iN2 == 1952608120 && this.f76274p) {
                y(this.f76273o.a() >= 2);
                fO = m0.o(this.f76273o.J() / this.f76279u, 0.0f, 0.95f);
            }
            this.f76273o.P(iE + iN);
        }
        return new b(new b.C0768b().o(spannableStringBuilder).h(fO, 0).i(0).a());
    }

    public final void x(a0 a0Var, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        int length;
        y(a0Var.a() >= 12);
        int iJ = a0Var.J();
        int iJ2 = a0Var.J();
        a0Var.Q(2);
        int iD = a0Var.D();
        a0Var.Q(1);
        int iN = a0Var.n();
        if (iJ2 > spannableStringBuilder.length()) {
            q.i("Tx3gDecoder", "Truncating styl end (" + iJ2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            length = spannableStringBuilder.length();
        } else {
            length = iJ2;
        }
        if (iJ < length) {
            int i10 = length;
            A(spannableStringBuilder, iD, this.f76275q, iJ, i10, 0);
            z(spannableStringBuilder, iN, this.f76276r, iJ, i10, 0);
            return;
        }
        q.i("Tx3gDecoder", "Ignoring styl with start (" + iJ + ") >= end (" + length + ").");
    }
}
