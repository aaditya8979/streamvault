package yads;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes11.dex */
public final class c63 extends Spannable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f88371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88373c;

    public c63(Drawable drawable, int i10, int i11) {
        this.f88371a = drawable;
        this.f88372b = i10;
        this.f88373c = i11;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f88371a != null && this.f88372b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f88371a;
            int i10 = this.f88372b;
            drawable.setBounds(0, 0, i10, i10);
            oe oeVar = new oe(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i11 = this.f88373c;
            colorDrawable.setBounds(0, 0, i11, i11);
            oe oeVar2 = new oe(colorDrawable);
            spannableStringBuilder.setSpan(oeVar, 0, 1, 33);
            spannableStringBuilder.setSpan(oeVar2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
