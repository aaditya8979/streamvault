package master.flame.danmaku.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import ep.c;
import ep.d;
import ep.f;
import ep.g;
import fp.k;
import java.util.LinkedList;
import java.util.Locale;
import jp.a;
import lp.b;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: loaded from: classes10.dex */
public class DanmakuView extends View implements f, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d f74078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f74079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f74080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f74082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.a f74083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f74084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f74085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mp.a f74086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f74087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f74088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f74089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f74090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f74091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f74092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f74093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedList<Long> f74094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f74095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f74096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Runnable f74097u;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = DanmakuView.this.f74080d;
            if (cVar == null) {
                return;
            }
            DanmakuView.j(DanmakuView.this);
            if (DanmakuView.this.f74096t > 4 || DanmakuView.super.isShown()) {
                cVar.P();
            } else {
                cVar.postDelayed(this, DanmakuView.this.f74096t * 100);
            }
        }
    }

    public DanmakuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74082f = true;
        this.f74088l = true;
        this.f74089m = 0;
        this.f74090n = new Object();
        this.f74091o = false;
        this.f74092p = false;
        this.f74096t = 0;
        this.f74097u = new a();
        n();
    }

    public DanmakuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f74082f = true;
        this.f74088l = true;
        this.f74089m = 0;
        this.f74090n = new Object();
        this.f74091o = false;
        this.f74092p = false;
        this.f74096t = 0;
        this.f74097u = new a();
        n();
    }

    public static /* synthetic */ int j(DanmakuView danmakuView) {
        int i10 = danmakuView.f74096t;
        danmakuView.f74096t = i10 + 1;
        return i10;
    }

    @Override // ep.f
    public void a(fp.c cVar) {
        if (this.f74080d != null) {
            this.f74080d.u(cVar);
        }
    }

    @Override // ep.f
    public void b(ip.a aVar, DanmakuContext danmakuContext) {
        r();
        this.f74080d.S(danmakuContext);
        this.f74080d.T(aVar);
        this.f74080d.R(this.f74078b);
        this.f74080d.J();
    }

    @Override // ep.g
    public long c() {
        if (!this.f74081e) {
            return 0L;
        }
        if (!isShown()) {
            return -1L;
        }
        long jB = b.b();
        o();
        return b.b() - jB;
    }

    @Override // ep.g
    public void clear() {
        if (e()) {
            if (this.f74088l && Thread.currentThread().getId() != this.f74093q) {
                p();
            } else {
                this.f74095s = true;
                q();
            }
        }
    }

    @Override // ep.f
    public boolean d() {
        return this.f74080d != null && this.f74080d.E();
    }

    @Override // ep.g
    public boolean e() {
        return this.f74081e;
    }

    @Override // ep.g
    public boolean f() {
        return this.f74082f;
    }

    @Override // ep.f
    public void g(Long l10) {
        if (this.f74080d != null) {
            this.f74080d.Q(l10);
        }
    }

    public DanmakuContext getConfig() {
        if (this.f74080d == null) {
            return null;
        }
        return this.f74080d.z();
    }

    public long getCurrentTime() {
        if (this.f74080d != null) {
            return this.f74080d.A();
        }
        return 0L;
    }

    @Override // ep.f
    public k getCurrentVisibleDanmakus() {
        if (this.f74080d != null) {
            return this.f74080d.B();
        }
        return null;
    }

    @Override // ep.f
    public f.a getOnDanmakuClickListener() {
        return this.f74083g;
    }

    public View getView() {
        return this;
    }

    @Override // ep.g
    public int getViewHeight() {
        return super.getHeight();
    }

    @Override // ep.g
    public int getViewWidth() {
        return super.getWidth();
    }

    @Override // ep.f
    public float getXOff() {
        return this.f74084h;
    }

    @Override // ep.f
    public float getYOff() {
        return this.f74085i;
    }

    @Override // ep.f
    public void h(boolean z10) {
        this.f74082f = z10;
    }

    @Override // ep.f
    public void hide() {
        this.f74088l = false;
        if (this.f74080d == null) {
            return;
        }
        this.f74080d.C(false);
    }

    @Override // android.view.View, ep.g
    @SuppressLint({"NewApi"})
    public boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override // ep.f
    public boolean isPaused() {
        if (this.f74080d != null) {
            return this.f74080d.F();
        }
        return false;
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f74088l && super.isShown();
    }

    public final float l() {
        long jB = b.b();
        this.f74094r.addLast(Long.valueOf(jB));
        Long lPeekFirst = this.f74094r.peekFirst();
        if (lPeekFirst == null) {
            return 0.0f;
        }
        float fLongValue = jB - lPeekFirst.longValue();
        if (this.f74094r.size() > 50) {
            this.f74094r.removeFirst();
        }
        if (fLongValue > 0.0f) {
            return (this.f74094r.size() * 1000) / fLongValue;
        }
        return 0.0f;
    }

    public synchronized Looper m(int i10) {
        HandlerThread handlerThread = this.f74079c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f74079c = null;
        }
        if (i10 == 1) {
            return Looper.getMainLooper();
        }
        int i11 = i10 != 2 ? i10 != 3 ? 0 : 19 : -8;
        HandlerThread handlerThread2 = new HandlerThread("DFM Handler Thread #" + i11, i11);
        this.f74079c = handlerThread2;
        handlerThread2.start();
        return this.f74079c.getLooper();
    }

    public final void n() {
        this.f74093q = Thread.currentThread().getId();
        setBackgroundColor(0);
        setDrawingCacheBackgroundColor(0);
        d.e(true, false);
        this.f74086j = mp.a.j(this);
    }

    public void o() {
        if (this.f74088l) {
            q();
            synchronized (this.f74090n) {
                while (!this.f74091o && this.f74080d != null) {
                    try {
                        this.f74090n.wait(200L);
                    } catch (InterruptedException unused) {
                        if (!this.f74088l || this.f74080d == null || this.f74080d.F()) {
                            break;
                        } else {
                            Thread.currentThread().interrupt();
                        }
                        this.f74091o = false;
                    }
                }
                this.f74091o = false;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f74088l && !this.f74092p) {
            super.onDraw(canvas);
            return;
        }
        if (this.f74095s) {
            d.a(canvas);
            this.f74095s = false;
        } else if (this.f74080d != null) {
            a.b bVarX = this.f74080d.x(canvas);
            if (this.f74087k) {
                if (this.f74094r == null) {
                    this.f74094r = new LinkedList<>();
                }
                d.d(canvas, String.format(Locale.getDefault(), "fps %.2f,time:%d s,cache:%d,miss:%d", Float.valueOf(l()), Long.valueOf(getCurrentTime() / 1000), Long.valueOf(bVarX.f72529r), Long.valueOf(bVarX.f72530s)));
            }
        }
        this.f74092p = false;
        x();
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f74080d != null) {
            this.f74080d.G(i12 - i10, i13 - i11);
        }
        this.f74081e = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK = this.f74086j.k(motionEvent);
        return !zK ? super.onTouchEvent(motionEvent) : zK;
    }

    public final void p() {
        this.f74095s = true;
        o();
    }

    @Override // ep.f
    public void pause() {
        if (this.f74080d != null) {
            this.f74080d.removeCallbacks(this.f74097u);
            this.f74080d.I();
        }
    }

    @SuppressLint({"NewApi"})
    public final void q() {
        this.f74092p = true;
        postInvalidateOnAnimation();
    }

    public final void r() {
        if (this.f74080d == null) {
            this.f74080d = new c(m(this.f74089m), this, this.f74088l);
        }
    }

    @Override // ep.f
    public void release() {
        v();
        LinkedList<Long> linkedList = this.f74094r;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    @Override // ep.f
    public void resume() {
        if (this.f74080d != null && this.f74080d.E()) {
            this.f74096t = 0;
            this.f74080d.post(this.f74097u);
        } else if (this.f74080d == null) {
            s();
        }
    }

    public void s() {
        v();
        start();
    }

    @Override // ep.f
    public void setCallback(c.d dVar) {
        this.f74078b = dVar;
        if (this.f74080d != null) {
            this.f74080d.R(dVar);
        }
    }

    public void setDrawingThreadType(int i10) {
        this.f74089m = i10;
    }

    public void setOnDanmakuClickListener(f.a aVar) {
        this.f74083g = aVar;
    }

    @Override // ep.f
    public void show() {
        t(null);
    }

    @Override // ep.f
    public void start() {
        u(0L);
    }

    public void t(Long l10) {
        this.f74088l = true;
        this.f74095s = false;
        if (this.f74080d == null) {
            return;
        }
        this.f74080d.U(l10);
    }

    @Override // ep.f
    public void toggle() {
        if (this.f74081e) {
            if (this.f74080d == null) {
                start();
            } else if (this.f74080d.F()) {
                resume();
            } else {
                pause();
            }
        }
    }

    public void u(long j10) {
        c cVar = this.f74080d;
        if (cVar == null) {
            r();
            cVar = this.f74080d;
        } else {
            cVar.removeCallbacksAndMessages(null);
        }
        if (cVar != null) {
            cVar.obtainMessage(1, Long.valueOf(j10)).sendToTarget();
        }
    }

    public void v() {
        w();
    }

    public final synchronized void w() {
        if (this.f74080d == null) {
            return;
        }
        c cVar = this.f74080d;
        this.f74080d = null;
        x();
        if (cVar != null) {
            cVar.L();
        }
        HandlerThread handlerThread = this.f74079c;
        this.f74079c = null;
        if (handlerThread != null) {
            try {
                handlerThread.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            handlerThread.quit();
        }
    }

    public final void x() {
        synchronized (this.f74090n) {
            this.f74091o = true;
            this.f74090n.notifyAll();
        }
    }
}
