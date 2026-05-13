package yads;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f90103a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f90104b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f90105c = new StringBuilder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f90109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f90110h;

    public gt(int i10, int i11) {
        b(i10);
        this.f90110h = i11;
    }

    public final o20 a(int i10) {
        float f10;
        int i11 = this.f90107e + this.f90108f;
        int i12 = 32 - i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i13 = 0; i13 < this.f90104b.size(); i13++) {
            CharSequence charSequenceSubSequence = (CharSequence) this.f90104b.get(i13);
            int i14 = ib3.f90737a;
            if (charSequenceSubSequence.length() > i12) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
        }
        SpannableString spannableStringB = b();
        int i15 = ib3.f90737a;
        int length = spannableStringB.length();
        SpannableString spannableStringSubSequence = spannableStringB;
        if (length > i12) {
            spannableStringSubSequence = spannableStringB.subSequence(0, i12);
        }
        spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i12 - spannableStringBuilder.length();
        int i16 = i11 - length2;
        int i17 = i10 != Integer.MIN_VALUE ? i10 : (this.f90109g != 2 || (Math.abs(i16) >= 3 && length2 >= 0)) ? (this.f90109g != 2 || i16 <= 0) ? 0 : 2 : 1;
        if (i17 != 1) {
            if (i17 == 2) {
                i11 = 32 - length2;
            }
            f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i18 = this.f90106d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.f90109g == 1) {
            i18 -= this.f90110h - 1;
        }
        return new o20(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, Integer.MIN_VALUE, f11, i17, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
    }

    public final void a() {
        int length = this.f90105c.length();
        if (length > 0) {
            this.f90105c.delete(length - 1, length);
            for (int size = this.f90103a.size() - 1; size >= 0; size--) {
                ft ftVar = (ft) this.f90103a.get(size);
                int i10 = ftVar.f89673c;
                if (i10 != length) {
                    return;
                }
                ftVar.f89673c = i10 - 1;
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f90105c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 < this.f90103a.size()) {
            ft ftVar = (ft) this.f90103a.get(i14);
            boolean z11 = ftVar.f89672b;
            int i16 = ftVar.f89671a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i13 = ht.A[i16];
                }
                z10 = z12;
            }
            int i17 = ftVar.f89673c;
            i14++;
            if (i17 != (i14 < this.f90103a.size() ? ((ft) this.f90103a.get(i14)).f89673c : length)) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i15 = i17;
                    i12 = i13;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void b(int i10) {
        this.f90109g = i10;
        this.f90103a.clear();
        this.f90104b.clear();
        this.f90105c.setLength(0);
        this.f90106d = 15;
        this.f90107e = 0;
        this.f90108f = 0;
    }
}
