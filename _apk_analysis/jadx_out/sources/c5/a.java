package c5;

import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: RenderMeasure.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6504g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6507j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6498a = "RenderMeasure";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6505h = 4;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[PHI: r7
      0x0073: PHI (r7v1 float) = (r7v0 float), (r7v2 float) binds: [B:30:0x0070, B:26:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.a.a(int, int):void");
    }

    public void b(int i10, View view) {
        int i11;
        int i12;
        int i13 = this.f6500c;
        float f10 = (i13 == 0 || (i12 = this.f6499b) == 0) ? 1.0f : (i12 * this.f6507j) / i13;
        if (i10 != 0 && ((i11 = this.f6506i) == 90 || i11 == 270)) {
            f10 = 1.0f / f10;
        }
        if (f10 < 1.0f) {
            h(i10);
            view.setRotation(i10);
        }
    }

    public int c() {
        return this.f6504g;
    }

    public int d() {
        return this.f6503f;
    }

    public int e() {
        return this.f6505h;
    }

    public void f(int i10) {
        this.f6505h = i10;
    }

    public void g(float f10) {
        this.f6507j = f10;
    }

    public void h(int i10) {
        this.f6506i = i10;
    }

    public void i(int i10, int i11) {
        this.f6501d = i10;
        this.f6502e = i11;
    }

    public void j(int i10, int i11) {
        Log.d("RenderMeasure", "videoWidth = " + i10 + " videoHeight = " + i11);
        this.f6499b = i10;
        this.f6500c = i11;
    }
}
