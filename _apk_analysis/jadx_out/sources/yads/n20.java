package yads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class n20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f92694a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f92695b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Layout.Alignment f92696c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Layout.Alignment f92697d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f92698e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f92699f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f92700g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f92701h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f92702i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f92703j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f92704k = -3.4028235E38f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f92705l = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f92706m = -3.4028235E38f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f92707n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f92708o = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f92709p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f92710q;

    public final n20 a(float f10) {
        this.f92698e = f10;
        this.f92699f = 0;
        return this;
    }

    public final n20 a(int i10) {
        this.f92700g = i10;
        return this;
    }

    public final n20 a(Layout.Alignment alignment) {
        this.f92696c = alignment;
        return this;
    }

    public final n20 a(SpannableStringBuilder spannableStringBuilder) {
        this.f92694a = spannableStringBuilder;
        return this;
    }

    public final o20 a() {
        return new o20(this.f92694a, this.f92696c, this.f92697d, this.f92695b, this.f92698e, this.f92699f, this.f92700g, this.f92701h, this.f92702i, this.f92703j, this.f92704k, this.f92705l, this.f92706m, this.f92707n, this.f92708o, this.f92709p, this.f92710q);
    }

    public final n20 b() {
        this.f92705l = -3.4028235E38f;
        return this;
    }

    public final n20 b(float f10) {
        this.f92701h = f10;
        return this;
    }

    public final n20 b(int i10) {
        this.f92702i = i10;
        return this;
    }

    public final void c(int i10) {
        this.f92708o = i10;
        this.f92707n = true;
    }
}
