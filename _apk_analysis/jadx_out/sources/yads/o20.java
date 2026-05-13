package yads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import yads.o20;
import yads.xq;

/* JADX INFO: loaded from: classes9.dex */
public final class o20 implements xq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o20 f93083s = new o20("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final wq f93084t = new wq() { // from class: bt.e7
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return o20.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f93085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f93086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f93087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f93088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f93089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f93090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f93091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f93092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f93093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f93094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f93095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f93096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f93097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f93098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f93099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f93100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f93101r;

    public o20(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            ni.a(bitmap);
        } else {
            ni.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f93085b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f93085b = charSequence.toString();
        } else {
            this.f93085b = null;
        }
        this.f93086c = alignment;
        this.f93087d = alignment2;
        this.f93088e = bitmap;
        this.f93089f = f10;
        this.f93090g = i10;
        this.f93091h = i11;
        this.f93092i = f11;
        this.f93093j = i12;
        this.f93094k = f13;
        this.f93095l = f14;
        this.f93096m = z10;
        this.f93097n = i14;
        this.f93098o = i13;
        this.f93099p = f12;
        this.f93100q = i15;
        this.f93101r = f15;
    }

    public static final o20 a(Bundle bundle) {
        float f10;
        int i10;
        float f11;
        int i11;
        boolean z10;
        int i12;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f10 = bundle.getFloat(Integer.toString(4, 36));
            i10 = bundle.getInt(Integer.toString(5, 36));
        } else {
            f10 = -3.4028235E38f;
            i10 = Integer.MIN_VALUE;
        }
        int i13 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f12 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i14 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            float f13 = bundle.getFloat(Integer.toString(10, 36));
            i11 = bundle.getInt(Integer.toString(9, 36));
            f11 = f13;
        } else {
            f11 = -3.4028235E38f;
            i11 = Integer.MIN_VALUE;
        }
        float f14 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f15 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle.containsKey(Integer.toString(13, 36))) {
            i12 = bundle.getInt(Integer.toString(13, 36));
            z10 = true;
        } else {
            z10 = false;
            i12 = -16777216;
        }
        return new o20(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f14, f15, bundle.getBoolean(Integer.toString(14, 36), false) ? z10 : false, i12, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || o20.class != obj.getClass()) {
            return false;
        }
        o20 o20Var = (o20) obj;
        return TextUtils.equals(this.f93085b, o20Var.f93085b) && this.f93086c == o20Var.f93086c && this.f93087d == o20Var.f93087d && ((bitmap = this.f93088e) != null ? !((bitmap2 = o20Var.f93088e) == null || !bitmap.sameAs(bitmap2)) : o20Var.f93088e == null) && this.f93089f == o20Var.f93089f && this.f93090g == o20Var.f93090g && this.f93091h == o20Var.f93091h && this.f93092i == o20Var.f93092i && this.f93093j == o20Var.f93093j && this.f93094k == o20Var.f93094k && this.f93095l == o20Var.f93095l && this.f93096m == o20Var.f93096m && this.f93097n == o20Var.f93097n && this.f93098o == o20Var.f93098o && this.f93099p == o20Var.f93099p && this.f93100q == o20Var.f93100q && this.f93101r == o20Var.f93101r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f93085b, this.f93086c, this.f93087d, this.f93088e, Float.valueOf(this.f93089f), Integer.valueOf(this.f93090g), Integer.valueOf(this.f93091h), Float.valueOf(this.f93092i), Integer.valueOf(this.f93093j), Float.valueOf(this.f93094k), Float.valueOf(this.f93095l), Boolean.valueOf(this.f93096m), Integer.valueOf(this.f93097n), Integer.valueOf(this.f93098o), Float.valueOf(this.f93099p), Integer.valueOf(this.f93100q), Float.valueOf(this.f93101r)});
    }
}
