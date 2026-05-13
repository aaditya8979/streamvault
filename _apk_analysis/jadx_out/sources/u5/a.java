package u5;

import a6.k0;
import a6.t;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.List;
import n5.c;
import n5.e;

/* JADX INFO: compiled from: Tx3gDecoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f85487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f85489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f85490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f85491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f85492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f85493u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f85487o = new t();
        if (list == null || list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f85489q = 0;
            this.f85490r = -1;
            this.f85491s = "sans-serif";
            this.f85488p = false;
            this.f85492t = 0.85f;
            return;
        }
        byte[] bArr = list.get(0);
        this.f85489q = bArr[24];
        this.f85490r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f85491s = "Serif".equals(k0.A(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f85493u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f85488p = z10;
        if (!z10) {
            this.f85492t = 0.85f;
            return;
        }
        float f10 = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10;
        this.f85492t = f10;
        this.f85492t = k0.p(f10, 0.0f, 0.95f);
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

    public static void B(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i10, int i11, int i12) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, i12 | 33);
        }
    }

    public static String C(t tVar) throws SubtitleDecoderException {
        char cE;
        y(tVar.a() >= 2);
        int iE = tVar.E();
        return iE == 0 ? "" : (tVar.a() < 2 || !((cE = tVar.e()) == 65279 || cE == 65534)) ? tVar.w(iE, Charset.forName("UTF-8")) : tVar.w(iE, Charset.forName(C.UTF16_NAME));
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

    @Override // n5.c
    public e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f85487o.J(bArr, i10);
        String strC = C(this.f85487o);
        if (strC.isEmpty()) {
            return b.f85494c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strC);
        A(spannableStringBuilder, this.f85489q, 0, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        z(spannableStringBuilder, this.f85490r, -1, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        B(spannableStringBuilder, this.f85491s, "sans-serif", 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        float fP = this.f85492t;
        while (this.f85487o.a() >= 8) {
            int iC = this.f85487o.c();
            int iJ = this.f85487o.j();
            int iJ2 = this.f85487o.j();
            if (iJ2 == 1937013100) {
                y(this.f85487o.a() >= 2);
                int iE = this.f85487o.E();
                for (int i11 = 0; i11 < iE; i11++) {
                    x(this.f85487o, spannableStringBuilder);
                }
            } else if (iJ2 == 1952608120 && this.f85488p) {
                y(this.f85487o.a() >= 2);
                fP = k0.p(this.f85487o.E() / this.f85493u, 0.0f, 0.95f);
            }
            this.f85487o.L(iC + iJ);
        }
        return new b(new n5.b(spannableStringBuilder, null, fP, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f));
    }

    public final void x(t tVar, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        y(tVar.a() >= 12);
        int iE = tVar.E();
        int iE2 = tVar.E();
        tVar.M(2);
        int iY = tVar.y();
        tVar.M(1);
        int iJ = tVar.j();
        A(spannableStringBuilder, iY, this.f85489q, iE, iE2, 0);
        z(spannableStringBuilder, iJ, this.f85490r, iE, iE2, 0);
    }
}
