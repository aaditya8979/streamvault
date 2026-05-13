package master.flame.danmaku.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
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
import mp.a;

/* JADX INFO: loaded from: classes2.dex */
public class DanmakuSurfaceView extends SurfaceView implements f, g, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d f74051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceHolder f74052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HandlerThread f74053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f74054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f74055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f74056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.a f74057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f74058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f74059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f74060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f74061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f74062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f74063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedList<Long> f74064o;

    public DanmakuSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74056g = true;
        this.f74062m = true;
        this.f74063n = 0;
        k();
    }

    public DanmakuSurfaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f74056g = true;
        this.f74062m = true;
        this.f74063n = 0;
        k();
    }

    @Override // ep.f
    public void a(fp.c cVar) {
        c cVar2 = this.f74054e;
        if (cVar2 != null) {
            cVar2.u(cVar);
        }
    }

    @Override // ep.f
    public void b(ip.a aVar, DanmakuContext danmakuContext) {
        l();
        this.f74054e.S(danmakuContext);
        this.f74054e.T(aVar);
        this.f74054e.R(this.f74051b);
        this.f74054e.J();
    }

    @Override // ep.g
    public long c() {
        if (!this.f74055f) {
            return 0L;
        }
        if (!isShown()) {
            return -1L;
        }
        long jB = b.b();
        Canvas canvasLockCanvas = this.f74052c.lockCanvas();
        if (canvasLockCanvas != null) {
            c cVar = this.f74054e;
            if (cVar != null) {
                a.b bVarX = cVar.x(canvasLockCanvas);
                if (this.f74061l) {
                    if (this.f74064o == null) {
                        this.f74064o = new LinkedList<>();
                    }
                    b.b();
                    d.d(canvasLockCanvas, String.format(Locale.getDefault(), "fps %.2f,time:%d s,cache:%d,miss:%d", Float.valueOf(i()), Long.valueOf(getCurrentTime() / 1000), Long.valueOf(bVarX.f72529r), Long.valueOf(bVarX.f72530s)));
                }
            }
            if (this.f74055f) {
                this.f74052c.unlockCanvasAndPost(canvasLockCanvas);
            }
        }
        return b.b() - jB;
    }

    @Override // ep.g
    public void clear() {
        Canvas canvasLockCanvas;
        if (e() && (canvasLockCanvas = this.f74052c.lockCanvas()) != null) {
            d.a(canvasLockCanvas);
            this.f74052c.unlockCanvasAndPost(canvasLockCanvas);
        }
    }

    @Override // ep.f
    public boolean d() {
        c cVar = this.f74054e;
        return cVar != null && cVar.E();
    }

    @Override // ep.g
    public boolean e() {
        return this.f74055f;
    }

    @Override // ep.g
    public boolean f() {
        return this.f74056g;
    }

    @Override // ep.f
    public void g(Long l10) {
        c cVar = this.f74054e;
        if (cVar != null) {
            cVar.Q(l10);
        }
    }

    public DanmakuContext getConfig() {
        c cVar = this.f74054e;
        if (cVar == null) {
            return null;
        }
        return cVar.z();
    }

    public long getCurrentTime() {
        c cVar = this.f74054e;
        if (cVar != null) {
            return cVar.A();
        }
        return 0L;
    }

    @Override // ep.f
    public k getCurrentVisibleDanmakus() {
        c cVar = this.f74054e;
        if (cVar != null) {
            return cVar.B();
        }
        return null;
    }

    @Override // ep.f
    public f.a getOnDanmakuClickListener() {
        return this.f74057h;
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
        return this.f74058i;
    }

    @Override // ep.f
    public float getYOff() {
        return this.f74059j;
    }

    @Override // ep.f
    public void h(boolean z10) {
        this.f74056g = z10;
    }

    @Override // ep.f
    public void hide() {
        this.f74062m = false;
        c cVar = this.f74054e;
        if (cVar == null) {
            return;
        }
        cVar.C(false);
    }

    public final float i() {
        long jB = b.b();
        this.f74064o.addLast(Long.valueOf(jB));
        Long lPeekFirst = this.f74064o.peekFirst();
        if (lPeekFirst == null) {
            return 0.0f;
        }
        float fLongValue = jB - lPeekFirst.longValue();
        if (this.f74064o.size() > 50) {
            this.f74064o.removeFirst();
        }
        if (fLongValue > 0.0f) {
            return (this.f74064o.size() * 1000) / fLongValue;
        }
        return 0.0f;
    }

    @Override // android.view.View, ep.g
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override // ep.f
    public boolean isPaused() {
        c cVar = this.f74054e;
        if (cVar != null) {
            return cVar.F();
        }
        return false;
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f74062m && super.isShown();
    }

    public synchronized Looper j(int i10) {
        HandlerThread handlerThread = this.f74053d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f74053d = null;
        }
        if (i10 == 1) {
            return Looper.getMainLooper();
        }
        int i11 = i10 != 2 ? i10 != 3 ? 0 : 19 : -8;
        HandlerThread handlerThread2 = new HandlerThread("DFM Handler Thread #" + i11, i11);
        this.f74053d = handlerThread2;
        handlerThread2.start();
        return this.f74053d.getLooper();
    }

    public final void k() {
        setZOrderMediaOverlay(true);
        setWillNotCacheDrawing(true);
        setDrawingCacheEnabled(false);
        setWillNotDraw(true);
        SurfaceHolder holder = getHolder();
        this.f74052c = holder;
        holder.addCallback(this);
        this.f74052c.setFormat(-2);
        d.e(true, true);
        this.f74060k = mp.a.j(this);
    }

    public final void l() {
        if (this.f74054e == null) {
            this.f74054e = new c(j(this.f74063n), this, this.f74062m);
        }
    }

    public void m() {
        p();
        start();
    }

    public void n(Long l10) {
        this.f74062m = true;
        c cVar = this.f74054e;
        if (cVar == null) {
            return;
        }
        cVar.U(l10);
    }

    public void o(long j10) {
        c cVar = this.f74054e;
        if (cVar == null) {
            l();
        } else {
            cVar.removeCallbacksAndMessages(null);
        }
        this.f74054e.obtainMessage(1, Long.valueOf(j10)).sendToTarget();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK = this.f74060k.k(motionEvent);
        return !zK ? super.onTouchEvent(motionEvent) : zK;
    }

    public void p() {
        q();
    }

    @Override // ep.f
    public void pause() {
        c cVar = this.f74054e;
        if (cVar != null) {
            cVar.I();
        }
    }

    public final synchronized void q() {
        c cVar = this.f74054e;
        if (cVar != null) {
            cVar.L();
            this.f74054e = null;
        }
        HandlerThread handlerThread = this.f74053d;
        this.f74053d = null;
        if (handlerThread != null) {
            try {
                handlerThread.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            handlerThread.quit();
        }
    }

    @Override // ep.f
    public void release() {
        p();
        LinkedList<Long> linkedList = this.f74064o;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    @Override // ep.f
    public void resume() {
        c cVar = this.f74054e;
        if (cVar != null && cVar.E()) {
            this.f74054e.P();
        } else if (this.f74054e == null) {
            m();
        }
    }

    @Override // ep.f
    public void setCallback(c.d dVar) {
        this.f74051b = dVar;
        c cVar = this.f74054e;
        if (cVar != null) {
            cVar.R(dVar);
        }
    }

    public void setDrawingThreadType(int i10) {
        this.f74063n = i10;
    }

    public void setOnDanmakuClickListener(f.a aVar) {
        this.f74057h = aVar;
    }

    @Override // ep.f
    public void show() {
        n(null);
    }

    @Override // ep.f
    public void start() {
        o(0L);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        c cVar = this.f74054e;
        if (cVar != null) {
            cVar.G(i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f74055f = true;
        Canvas canvasLockCanvas = surfaceHolder.lockCanvas();
        if (canvasLockCanvas != null) {
            d.a(canvasLockCanvas);
            surfaceHolder.unlockCanvasAndPost(canvasLockCanvas);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f74055f = false;
    }

    @Override // ep.f
    public void toggle() {
        if (this.f74055f) {
            c cVar = this.f74054e;
            if (cVar == null) {
                start();
            } else if (cVar.F()) {
                resume();
            } else {
                pause();
            }
        }
    }
}
