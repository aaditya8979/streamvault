package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import io.bidmachine.iab.utils.Utils;

/* JADX INFO: loaded from: classes6.dex */
public class MraidScreenMetrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f69260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f69261b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f69262c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f69263d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f69264e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f69265f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f69266g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f69267h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f69268i = new Rect();

    public MraidScreenMetrics(@NonNull Context context) {
        this.f69260a = context.getResources().getDisplayMetrics().density;
    }

    private boolean a(Rect rect, Rect rect2, int i10, int i11, int i12, int i13) {
        if (rect.left == i10 && rect.top == i11 && i10 + i12 == rect.right && i11 + i13 == rect.bottom) {
            return false;
        }
        rect.set(i10, i11, i12 + i10, i13 + i11);
        a(rect, rect2);
        return true;
    }

    public Rect a() {
        return this.f69266g;
    }

    public void a(Rect rect, Rect rect2) {
        rect2.set(Utils.pixelsToIntDips(rect.left, this.f69260a), Utils.pixelsToIntDips(rect.top, this.f69260a), Utils.pixelsToIntDips(rect.right, this.f69260a), Utils.pixelsToIntDips(rect.bottom, this.f69260a));
    }

    public boolean a(int i10, int i11) {
        if (this.f69261b.width() == i10 && this.f69261b.height() == i11) {
            return false;
        }
        this.f69261b.set(0, 0, i10, i11);
        a(this.f69261b, this.f69262c);
        return true;
    }

    public boolean a(int i10, int i11, int i12, int i13) {
        return a(this.f69265f, this.f69266g, i10, i11, i12, i13);
    }

    public Rect b() {
        return this.f69267h;
    }

    public boolean b(int i10, int i11, int i12, int i13) {
        return a(this.f69267h, this.f69268i, i10, i11, i12, i13);
    }

    public Rect c() {
        return this.f69268i;
    }

    public boolean c(int i10, int i11, int i12, int i13) {
        return a(this.f69263d, this.f69264e, i10, i11, i12, i13);
    }

    public Rect d() {
        return this.f69264e;
    }

    public Rect e() {
        return this.f69262c;
    }

    public float getDensity() {
        return this.f69260a;
    }
}
