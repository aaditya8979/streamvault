package yads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes4.dex */
public final class uh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv0 f95650a = new kv0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh3 f95651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final th3 f95652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f95653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f95654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f95655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f95656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f95657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f95658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f95659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f95660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f95661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f95662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f95663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f95664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f95665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f95666q;

    public uh3(Context context) {
        qh3 qh3VarA = a(context);
        this.f95651b = qh3VarA;
        this.f95652c = qh3VarA != null ? th3.a() : null;
        this.f95660k = -9223372036854775807L;
        this.f95661l = -9223372036854775807L;
        this.f95655f = -1.0f;
        this.f95658i = 1.0f;
        this.f95659j = 0;
    }

    public static qh3 a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        sh3 sh3VarA = ib3.f90737a >= 17 ? sh3.a(applicationContext) : null;
        if (sh3VarA != null) {
            return sh3VarA;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null) {
            return new rh3(windowManager);
        }
        return null;
    }

    public final void a() {
        this.f95653d = true;
        this.f95662m = 0L;
        this.f95665p = -1L;
        this.f95663n = -1L;
        if (this.f95651b != null) {
            th3 th3Var = this.f95652c;
            th3Var.getClass();
            th3Var.f95236c.sendEmptyMessage(1);
            this.f95651b.a(new ph3() { // from class: bt.va
                @Override // yads.ph3
                public final void a(Display display) {
                    this.f6354a.a(display);
                }
            });
        }
        a(false);
    }

    public final void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f95660k = refreshRate;
            this.f95661l = (refreshRate * 80) / 100;
        } else {
            ih1.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f95660k = -9223372036854775807L;
            this.f95661l = -9223372036854775807L;
        }
    }

    public final void a(boolean z10) {
        Surface surface;
        if (ib3.f90737a < 30 || (surface = this.f95654e) == null || this.f95659j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f95653d) {
            float f11 = this.f95656g;
            if (f11 != -1.0f) {
                f10 = this.f95658i * f11;
            }
        }
        if (z10 || this.f95657h != f10) {
            this.f95657h = f10;
            oh3.a(surface, f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r10 = this;
            int r0 = yads.ib3.f90737a
            r1 = 30
            if (r0 < r1) goto L95
            android.view.Surface r0 = r10.f95654e
            if (r0 != 0) goto Lc
            goto L95
        Lc:
            yads.kv0 r0 = r10.f95650a
            yads.jv0 r0 = r0.f91756a
            boolean r0 = r0.a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L3b
            yads.kv0 r0 = r10.f95650a
            yads.jv0 r3 = r0.f91756a
            boolean r3 = r3.a()
            if (r3 == 0) goto L39
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            yads.jv0 r0 = r0.f91756a
            long r5 = r0.f91383e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L32
            goto L35
        L32:
            long r7 = r0.f91384f
            long r7 = r7 / r5
        L35:
            double r5 = (double) r7
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L3d
        L39:
            r0 = r2
            goto L3d
        L3b:
            float r0 = r10.f95655f
        L3d:
            float r3 = r10.f95656g
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L44
            return
        L44:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L86
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L86
            yads.kv0 r1 = r10.f95650a
            yads.jv0 r1 = r1.f91756a
            boolean r1 = r1.a()
            if (r1 == 0) goto L77
            yads.kv0 r1 = r10.f95650a
            yads.jv0 r2 = r1.f91756a
            boolean r2 = r2.a()
            if (r2 == 0) goto L65
            yads.jv0 r1 = r1.f91756a
            long r1 = r1.f91384f
            goto L6a
        L65:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6a:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L77
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L79
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
        L79:
            float r2 = r10.f95656g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L95
            goto L8f
        L86:
            if (r4 == 0) goto L89
            goto L8f
        L89:
            yads.kv0 r2 = r10.f95650a
            int r2 = r2.f91760e
            if (r2 < r1) goto L95
        L8f:
            r10.f95656g = r0
            r0 = 0
            r10.a(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.uh3.b():void");
    }
}
