package t7;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import s7.m0;

/* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7.e f85140a = new t7.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final b f85141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final e f85142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Surface f85144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f85145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f85146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f85147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f85148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f85150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f85151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f85152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f85153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f85154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f85155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f85156q;

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    @RequiresApi(30)
    public static final class a {
        @DoNotInline
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                s7.q.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public interface b {

        /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
        public interface a {
            void a(@Nullable Display display);
        }

        void a(a aVar);

        void unregister();
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public static final class c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowManager f85157b;

        public c(WindowManager windowManager) {
            this.f85157b = windowManager;
        }

        @Nullable
        public static b b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // t7.k.b
        public void a(b.a aVar) {
            aVar.a(this.f85157b.getDefaultDisplay());
        }

        @Override // t7.k.b
        public void unregister() {
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    @RequiresApi(17)
    public static final class d implements b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DisplayManager f85158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public b.a f85159c;

        public d(DisplayManager displayManager) {
            this.f85158b = displayManager;
        }

        @Nullable
        public static b c(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // t7.k.b
        public void a(b.a aVar) {
            this.f85159c = aVar;
            this.f85158b.registerDisplayListener(this, m0.u());
            aVar.a(b());
        }

        public final Display b() {
            return this.f85158b.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f85159c;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }

        @Override // t7.k.b
        public void unregister() {
            this.f85158b.unregisterDisplayListener(this);
            this.f85159c = null;
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f85160g = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f85161b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f85162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HandlerThread f85163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Choreographer f85164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f85165f;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f85163d = handlerThread;
            handlerThread.start();
            Handler handlerT = m0.t(handlerThread.getLooper(), this);
            this.f85162c = handlerT;
            handlerT.sendEmptyMessage(0);
        }

        public static e d() {
            return f85160g;
        }

        public void a() {
            this.f85162c.sendEmptyMessage(1);
        }

        public final void b() {
            Choreographer choreographer = this.f85164e;
            if (choreographer != null) {
                int i10 = this.f85165f + 1;
                this.f85165f = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.f85164e = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                s7.q.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f85161b = j10;
            ((Choreographer) s7.a.e(this.f85164e)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f85162c.sendEmptyMessage(2);
        }

        public final void f() {
            Choreographer choreographer = this.f85164e;
            if (choreographer != null) {
                int i10 = this.f85165f - 1;
                this.f85165f = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f85161b = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            }
            if (i10 == 1) {
                b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public k(@Nullable Context context) {
        b bVarF = f(context);
        this.f85141b = bVarF;
        this.f85142c = bVarF != null ? e.d() : null;
        this.f85150k = -9223372036854775807L;
        this.f85151l = -9223372036854775807L;
        this.f85145f = -1.0f;
        this.f85148i = 1.0f;
        this.f85149j = 0;
    }

    public static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    public static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    @Nullable
    public static b f(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b bVarC = m0.f79487a >= 17 ? d.c(applicationContext) : null;
        return bVarC == null ? c.b(applicationContext) : bVarC;
    }

    public long b(long j10) {
        long j11;
        if (this.f85155p == -1 || !this.f85140a.e()) {
            j11 = j10;
        } else {
            long jA = this.f85156q + ((long) ((this.f85140a.a() * (this.f85152m - this.f85155p)) / this.f85148i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f85153n = this.f85152m;
        this.f85154o = j11;
        e eVar = this.f85142c;
        if (eVar == null || this.f85150k == -9223372036854775807L) {
            return j11;
        }
        long j12 = eVar.f85161b;
        return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f85150k) - this.f85151l;
    }

    public final void d() {
        Surface surface;
        if (m0.f79487a < 30 || (surface = this.f85144e) == null || this.f85149j == Integer.MIN_VALUE || this.f85147h == 0.0f) {
            return;
        }
        this.f85147h = 0.0f;
        a.a(surface, 0.0f);
    }

    public void g(float f10) {
        this.f85145f = f10;
        this.f85140a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f85153n;
        if (j11 != -1) {
            this.f85155p = j11;
            this.f85156q = this.f85154o;
        }
        this.f85152m++;
        this.f85140a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f85148i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f85143d = true;
        n();
        if (this.f85141b != null) {
            ((e) s7.a.e(this.f85142c)).a();
            this.f85141b.a(new b.a() { // from class: t7.j
                @Override // t7.k.b.a
                public final void a(Display display) {
                    this.f85139a.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f85143d = false;
        b bVar = this.f85141b;
        if (bVar != null) {
            bVar.unregister();
            ((e) s7.a.e(this.f85142c)).e();
        }
        d();
    }

    public void m(@Nullable Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f85144e == surface) {
            return;
        }
        d();
        this.f85144e = surface;
        r(true);
    }

    public final void n() {
        this.f85152m = 0L;
        this.f85155p = -1L;
        this.f85153n = -1L;
    }

    public void o(int i10) {
        if (this.f85149j == i10) {
            return;
        }
        this.f85149j = i10;
        r(true);
    }

    public final void p(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f85150k = refreshRate;
            this.f85151l = (refreshRate * 80) / 100;
        } else {
            s7.q.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f85150k = -9223372036854775807L;
            this.f85151l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r7 = this;
            int r0 = s7.m0.f79487a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f85144e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            t7.e r0 = r7.f85140a
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
            t7.e r0 = r7.f85140a
            float r0 = r0.b()
            goto L1d
        L1b:
            float r0 = r7.f85145f
        L1d:
            float r2 = r7.f85146g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            t7.e r1 = r7.f85140a
            boolean r1 = r1.e()
            if (r1 == 0) goto L49
            t7.e r1 = r7.f85140a
            long r1 = r1.d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f85146g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            t7.e r2 = r7.f85140a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f85146g = r0
            r7.r(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.k.q():void");
    }

    public final void r(boolean z10) {
        Surface surface;
        if (m0.f79487a < 30 || (surface = this.f85144e) == null || this.f85149j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f85143d) {
            float f11 = this.f85146g;
            if (f11 != -1.0f) {
                f10 = this.f85148i * f11;
            }
        }
        if (z10 || this.f85147h != f10) {
            this.f85147h = f10;
            a.a(surface, f10);
        }
    }
}
