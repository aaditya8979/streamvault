package sg.bigo.ads.ad;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d<T extends Ad, U extends sg.bigo.ads.api.core.b> extends c<T, U> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public d<T, U>.a f80121y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f80122z;

    public final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f80128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f80129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f80130h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f80131i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f80132j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f80133k = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80123a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f80124b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f80125c = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f80134l = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f80126d = new Runnable() { // from class: sg.bigo.ads.ad.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f80028i || ((aVar.f80124b && aVar.f80125c) || (view = dVar.f80022c) == null)) {
                    aVar.a();
                    return;
                }
                Rect rect = new Rect();
                boolean z10 = sg.bigo.ads.common.ab.a.a(view, rect) || (d.this.p() && sg.bigo.ads.api.core.a.b(d.this.q()));
                if (z10) {
                    a aVar2 = a.this;
                    if (aVar2.f80123a == -1) {
                        aVar2.f80123a = u.a(view) ? 1 : 0;
                    }
                }
                if (z10) {
                    a aVar3 = a.this;
                    if (!aVar3.f80124b) {
                        a.a(aVar3, rect);
                    }
                    a aVar4 = a.this;
                    if (!aVar4.f80125c) {
                        a.b(aVar4, rect);
                    }
                }
                a aVar5 = a.this;
                if (aVar5.f80124b && aVar5.f80125c) {
                    aVar5.a();
                } else {
                    sg.bigo.ads.common.n.d.a(2, aVar5.f80126d, 500L);
                }
            }
        };

        public a() {
        }

        private float a(@NonNull Rect rect) {
            d dVar = d.this;
            if (dVar.f80022c == null || sg.bigo.ads.api.core.a.b(dVar.f80021b.f81860a.x())) {
                return 0.0f;
            }
            float height = d.this.f80022c.getHeight() * 1.0f * d.this.f80022c.getWidth();
            float fHeight = rect.height() * 1.0f * rect.width();
            if (height <= 0.0f) {
                return 0.0f;
            }
            return fHeight / height;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        
            if (r0 != 12) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void a(sg.bigo.ads.ad.d.a r7) {
            /*
                boolean r0 = r7.f80134l
                if (r0 != 0) goto L63
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.r()
                r1 = 2
                if (r0 != r1) goto L14
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                long r2 = sg.bigo.ads.ad.d.a(r0)
                goto L1a
            L14:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                long r2 = sg.bigo.ads.ad.d.b(r0)
            L1a:
                r7.f80128f = r2
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.r()
                if (r0 != r1) goto L2b
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = sg.bigo.ads.ad.d.c(r0)
                goto L31
            L2b:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = sg.bigo.ads.ad.d.d(r0)
            L31:
                r7.f80130h = r0
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.q()
                sg.bigo.ads.ad.d r2 = sg.bigo.ads.ad.d.this
                int r2 = r2.r()
                r3 = 0
                r4 = 1000(0x3e8, float:1.401E-42)
                r5 = 1
                if (r0 == r5) goto L54
                if (r0 == r1) goto L52
                r6 = 3
                if (r0 == r6) goto L52
                r6 = 4
                if (r0 == r6) goto L57
                r6 = 12
                if (r0 == r6) goto L54
                goto L59
            L52:
                r3 = r4
                goto L59
            L54:
                if (r2 == r1) goto L57
                goto L52
            L57:
                r3 = 2000(0x7d0, float:2.803E-42)
            L59:
                long r2 = (long) r3
                r7.f80129g = r2
                java.lang.Runnable r0 = r7.f80126d
                sg.bigo.ads.common.n.d.a(r1, r0)
                r7.f80134l = r5
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.d.a.a(sg.bigo.ads.ad.d$a):void");
        }

        public static /* synthetic */ void a(a aVar, Rect rect) {
            float fA;
            if (aVar.f80131i == 0) {
                aVar.f80131i = SystemClock.elapsedRealtime();
            }
            if (aVar.f80133k) {
                fA = 0.0f;
            } else {
                fA = aVar.a(rect);
                View view = d.this.f80022c;
                int i10 = aVar.f80130h;
                if ((view != null && view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0 && (i10 == 0 || ((float) i10) <= 100.0f * fA)) || (sg.bigo.ads.api.core.a.b(d.this.q()) && !d.this.f80027h)) {
                    aVar.f80133k = true;
                }
            }
            long jMax = aVar.f80123a == 1 ? Math.max(r.f82514a.a(1), aVar.f80128f) : aVar.f80128f;
            if (!aVar.f80133k || SystemClock.elapsedRealtime() - aVar.f80131i < jMax) {
                return;
            }
            if (fA == 0.0f) {
                fA = aVar.a(rect);
            }
            d.this.a("show_proportion", q.a("%.4f", Float.valueOf(fA)));
            d.this.a_();
            aVar.f80124b = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void b(sg.bigo.ads.ad.d.a r10, android.graphics.Rect r11) {
            /*
                long r0 = r10.f80132j
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Le
                long r0 = android.os.SystemClock.elapsedRealtime()
                r10.f80132j = r0
            Le:
                float r11 = r10.a(r11)
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                android.view.View r1 = r0.f80022c
                int r0 = r0.q()
                sg.bigo.ads.ad.d r2 = sg.bigo.ads.ad.d.this
                int r2 = r2.r()
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L71
                int r5 = r1.getMeasuredWidth()
                if (r5 <= 0) goto L71
                int r5 = r1.getMeasuredHeight()
                if (r5 <= 0) goto L71
                int r5 = r1.getHeight()
                int r1 = r1.getWidth()
                int r5 = r5 * r1
                r1 = 1050253722(0x3e99999a, float:0.3)
                r6 = 242000(0x3b150, float:3.39114E-40)
                r7 = 2
                r8 = 1056964608(0x3f000000, float:0.5)
                if (r0 == r4) goto L5e
                if (r0 == r7) goto L51
                r9 = 3
                if (r0 == r9) goto L57
                r9 = 4
                if (r0 == r9) goto L57
                r9 = 12
                if (r0 == r9) goto L5e
                goto L71
            L51:
                if (r5 <= r6) goto L59
                int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r0 <= 0) goto L71
            L57:
                r0 = r4
                goto L72
            L59:
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 <= 0) goto L71
                goto L57
            L5e:
                if (r2 != r7) goto L65
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 <= 0) goto L71
                goto L57
            L65:
                if (r5 <= r6) goto L6c
                int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r0 <= 0) goto L71
                goto L57
            L6c:
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 <= 0) goto L71
                goto L57
            L71:
                r0 = r3
            L72:
                if (r0 != 0) goto L86
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.q()
                boolean r0 = sg.bigo.ads.api.core.a.b(r0)
                if (r0 == 0) goto La8
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                boolean r0 = r0.f80027h
                if (r0 != 0) goto La8
            L86:
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r5 = r10.f80132j
                long r0 = r0 - r5
                long r5 = r10.f80129g
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 < 0) goto La8
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                java.lang.Object[] r1 = new java.lang.Object[r4]
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r1[r3] = r11
                java.lang.String r11 = "%.4f"
                java.lang.String r11 = sg.bigo.ads.common.utils.q.a(r11, r1)
                r0.d(r11)
                r10.f80125c = r4
            La8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.d.a.b(sg.bigo.ads.ad.d$a, android.graphics.Rect):void");
        }

        public final void a() {
            sg.bigo.ads.common.n.d.a(this.f80126d);
            this.f80134l = false;
        }

        public final void a(final View view, boolean z10) {
            d.this.f80022c = view;
            if (view == null) {
                return;
            }
            if (z10) {
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.d.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.a(a.this);
                    }
                });
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.d.a.3
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        a.a(a.this);
                        view.removeOnAttachStateChangeListener(this);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                        a.this.a();
                    }
                });
            }
        }
    }

    public d(@NonNull f fVar) {
        super(fVar);
        this.f80122z = false;
        this.f80121y = new a();
    }

    public static /* synthetic */ long a(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f80021b.f81860a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0L;
        }
        return bVarAA.b();
    }

    public static /* synthetic */ long b(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f80021b.f81860a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0L;
        }
        return bVarAA.d();
    }

    public static /* synthetic */ int c(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f80021b.f81860a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0;
        }
        return bVarAA.a();
    }

    public static /* synthetic */ int d(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f80021b.f81860a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0;
        }
        return bVarAA.c();
    }

    @Override // sg.bigo.ads.ad.c
    public void a() {
        super.a();
        this.f80121y.a();
        this.f80122z = false;
        this.f80121y = new a();
    }

    public final void a(View view, boolean z10) {
        this.f80121y.a(view, z10);
    }

    public final void d(String str) {
        if (this.f80122z) {
            return;
        }
        this.f80122z = true;
        String strJ = j();
        int iIntValue = ((Integer) b("render_style", 0)).intValue();
        if (a("06002029")) {
            sg.bigo.ads.core.d.b.a(this, str, strJ, iIntValue);
        }
        sg.bigo.ads.api.b.a aVar = this.f81824aa;
        if (aVar != null) {
            aVar.a(str, strJ, iIntValue);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.f80121y.a();
    }

    @Override // sg.bigo.ads.ad.c
    @CallSuper
    public final void m() {
        super.m();
        this.f80121y.a();
    }
}
