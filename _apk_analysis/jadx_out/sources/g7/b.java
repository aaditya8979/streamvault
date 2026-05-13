package g7;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.f;

/* JADX INFO: compiled from: Cue.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f62135s = new C0768b().o("").a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f.a<b> f62136t = new f.a() { // from class: g7.a
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return b.c(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final CharSequence f62137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f62138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f62139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Bitmap f62140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f62141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f62142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f62143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f62144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f62145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f62146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f62147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f62148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f62149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f62150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f62151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f62152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f62153r;

    /* JADX INFO: renamed from: g7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cue.java */
    public static final class C0768b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public CharSequence f62154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Bitmap f62155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f62156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f62157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f62158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f62159f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f62160g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f62161h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f62162i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f62163j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f62164k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f62165l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f62166m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f62167n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @ColorInt
        public int f62168o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f62169p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f62170q;

        public C0768b() {
            this.f62154a = null;
            this.f62155b = null;
            this.f62156c = null;
            this.f62157d = null;
            this.f62158e = -3.4028235E38f;
            this.f62159f = Integer.MIN_VALUE;
            this.f62160g = Integer.MIN_VALUE;
            this.f62161h = -3.4028235E38f;
            this.f62162i = Integer.MIN_VALUE;
            this.f62163j = Integer.MIN_VALUE;
            this.f62164k = -3.4028235E38f;
            this.f62165l = -3.4028235E38f;
            this.f62166m = -3.4028235E38f;
            this.f62167n = false;
            this.f62168o = ViewCompat.MEASURED_STATE_MASK;
            this.f62169p = Integer.MIN_VALUE;
        }

        public C0768b(b bVar) {
            this.f62154a = bVar.f62137b;
            this.f62155b = bVar.f62140e;
            this.f62156c = bVar.f62138c;
            this.f62157d = bVar.f62139d;
            this.f62158e = bVar.f62141f;
            this.f62159f = bVar.f62142g;
            this.f62160g = bVar.f62143h;
            this.f62161h = bVar.f62144i;
            this.f62162i = bVar.f62145j;
            this.f62163j = bVar.f62150o;
            this.f62164k = bVar.f62151p;
            this.f62165l = bVar.f62146k;
            this.f62166m = bVar.f62147l;
            this.f62167n = bVar.f62148m;
            this.f62168o = bVar.f62149n;
            this.f62169p = bVar.f62152q;
            this.f62170q = bVar.f62153r;
        }

        public b a() {
            return new b(this.f62154a, this.f62156c, this.f62157d, this.f62155b, this.f62158e, this.f62159f, this.f62160g, this.f62161h, this.f62162i, this.f62163j, this.f62164k, this.f62165l, this.f62166m, this.f62167n, this.f62168o, this.f62169p, this.f62170q);
        }

        public C0768b b() {
            this.f62167n = false;
            return this;
        }

        public int c() {
            return this.f62160g;
        }

        public int d() {
            return this.f62162i;
        }

        @Nullable
        public CharSequence e() {
            return this.f62154a;
        }

        public C0768b f(Bitmap bitmap) {
            this.f62155b = bitmap;
            return this;
        }

        public C0768b g(float f10) {
            this.f62166m = f10;
            return this;
        }

        public C0768b h(float f10, int i10) {
            this.f62158e = f10;
            this.f62159f = i10;
            return this;
        }

        public C0768b i(int i10) {
            this.f62160g = i10;
            return this;
        }

        public C0768b j(@Nullable Layout.Alignment alignment) {
            this.f62157d = alignment;
            return this;
        }

        public C0768b k(float f10) {
            this.f62161h = f10;
            return this;
        }

        public C0768b l(int i10) {
            this.f62162i = i10;
            return this;
        }

        public C0768b m(float f10) {
            this.f62170q = f10;
            return this;
        }

        public C0768b n(float f10) {
            this.f62165l = f10;
            return this;
        }

        public C0768b o(CharSequence charSequence) {
            this.f62154a = charSequence;
            return this;
        }

        public C0768b p(@Nullable Layout.Alignment alignment) {
            this.f62156c = alignment;
            return this;
        }

        public C0768b q(float f10, int i10) {
            this.f62164k = f10;
            this.f62163j = i10;
            return this;
        }

        public C0768b r(int i10) {
            this.f62169p = i10;
            return this;
        }

        public C0768b s(@ColorInt int i10) {
            this.f62168o = i10;
            this.f62167n = true;
            return this;
        }
    }

    public b(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            s7.a.e(bitmap);
        } else {
            s7.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f62137b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f62137b = charSequence.toString();
        } else {
            this.f62137b = null;
        }
        this.f62138c = alignment;
        this.f62139d = alignment2;
        this.f62140e = bitmap;
        this.f62141f = f10;
        this.f62142g = i10;
        this.f62143h = i11;
        this.f62144i = f11;
        this.f62145j = i12;
        this.f62146k = f13;
        this.f62147l = f14;
        this.f62148m = z10;
        this.f62149n = i14;
        this.f62150o = i13;
        this.f62151p = f12;
        this.f62152q = i15;
        this.f62153r = f15;
    }

    public static final b c(Bundle bundle) {
        C0768b c0768b = new C0768b();
        CharSequence charSequence = bundle.getCharSequence(d(0));
        if (charSequence != null) {
            c0768b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(d(1));
        if (alignment != null) {
            c0768b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(d(2));
        if (alignment2 != null) {
            c0768b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(d(3));
        if (bitmap != null) {
            c0768b.f(bitmap);
        }
        if (bundle.containsKey(d(4)) && bundle.containsKey(d(5))) {
            c0768b.h(bundle.getFloat(d(4)), bundle.getInt(d(5)));
        }
        if (bundle.containsKey(d(6))) {
            c0768b.i(bundle.getInt(d(6)));
        }
        if (bundle.containsKey(d(7))) {
            c0768b.k(bundle.getFloat(d(7)));
        }
        if (bundle.containsKey(d(8))) {
            c0768b.l(bundle.getInt(d(8)));
        }
        if (bundle.containsKey(d(10)) && bundle.containsKey(d(9))) {
            c0768b.q(bundle.getFloat(d(10)), bundle.getInt(d(9)));
        }
        if (bundle.containsKey(d(11))) {
            c0768b.n(bundle.getFloat(d(11)));
        }
        if (bundle.containsKey(d(12))) {
            c0768b.g(bundle.getFloat(d(12)));
        }
        if (bundle.containsKey(d(13))) {
            c0768b.s(bundle.getInt(d(13)));
        }
        if (!bundle.getBoolean(d(14), false)) {
            c0768b.b();
        }
        if (bundle.containsKey(d(15))) {
            c0768b.r(bundle.getInt(d(15)));
        }
        if (bundle.containsKey(d(16))) {
            c0768b.m(bundle.getFloat(d(16)));
        }
        return c0768b.a();
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public C0768b b() {
        return new C0768b();
    }

    public boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f62137b, bVar.f62137b) && this.f62138c == bVar.f62138c && this.f62139d == bVar.f62139d && ((bitmap = this.f62140e) != null ? !((bitmap2 = bVar.f62140e) == null || !bitmap.sameAs(bitmap2)) : bVar.f62140e == null) && this.f62141f == bVar.f62141f && this.f62142g == bVar.f62142g && this.f62143h == bVar.f62143h && this.f62144i == bVar.f62144i && this.f62145j == bVar.f62145j && this.f62146k == bVar.f62146k && this.f62147l == bVar.f62147l && this.f62148m == bVar.f62148m && this.f62149n == bVar.f62149n && this.f62150o == bVar.f62150o && this.f62151p == bVar.f62151p && this.f62152q == bVar.f62152q && this.f62153r == bVar.f62153r;
    }

    public int hashCode() {
        return y7.i.b(this.f62137b, this.f62138c, this.f62139d, this.f62140e, Float.valueOf(this.f62141f), Integer.valueOf(this.f62142g), Integer.valueOf(this.f62143h), Float.valueOf(this.f62144i), Integer.valueOf(this.f62145j), Float.valueOf(this.f62146k), Float.valueOf(this.f62147l), Boolean.valueOf(this.f62148m), Integer.valueOf(this.f62149n), Integer.valueOf(this.f62150o), Float.valueOf(this.f62151p), Integer.valueOf(this.f62152q), Float.valueOf(this.f62153r));
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(d(0), this.f62137b);
        bundle.putSerializable(d(1), this.f62138c);
        bundle.putSerializable(d(2), this.f62139d);
        bundle.putParcelable(d(3), this.f62140e);
        bundle.putFloat(d(4), this.f62141f);
        bundle.putInt(d(5), this.f62142g);
        bundle.putInt(d(6), this.f62143h);
        bundle.putFloat(d(7), this.f62144i);
        bundle.putInt(d(8), this.f62145j);
        bundle.putInt(d(9), this.f62150o);
        bundle.putFloat(d(10), this.f62151p);
        bundle.putFloat(d(11), this.f62146k);
        bundle.putFloat(d(12), this.f62147l);
        bundle.putBoolean(d(14), this.f62148m);
        bundle.putInt(d(13), this.f62149n);
        bundle.putInt(d(15), this.f62152q);
        bundle.putFloat(d(16), this.f62153r);
        return bundle;
    }
}
