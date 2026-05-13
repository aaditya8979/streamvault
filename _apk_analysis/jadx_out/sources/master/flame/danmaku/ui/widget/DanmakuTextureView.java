package master.flame.danmaku.ui.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
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

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class DanmakuTextureView extends TextureView implements f, g, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d f74065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f74066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f74067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f74069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.a f74070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f74071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f74072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f74073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f74074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f74075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f74076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedList<Long> f74077n;

    public DanmakuTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74069f = true;
        this.f74075l = true;
        this.f74076m = 0;
        k();
    }

    public DanmakuTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f74069f = true;
        this.f74075l = true;
        this.f74076m = 0;
        k();
    }

    @Override // ep.f
    public void a(fp.c cVar) {
        c cVar2 = this.f74067d;
        if (cVar2 != null) {
            cVar2.u(cVar);
        }
    }

    @Override // ep.f
    public void b(ip.a aVar, DanmakuContext danmakuContext) {
        l();
        this.f74067d.S(danmakuContext);
        this.f74067d.T(aVar);
        this.f74067d.R(this.f74065b);
        this.f74067d.J();
    }

    @Override // ep.g
    public synchronized long c() {
        if (!this.f74068e) {
            return 0L;
        }
        long jB = b.b();
        if (!isShown()) {
            return -1L;
        }
        Canvas canvasLockCanvas = lockCanvas();
        if (canvasLockCanvas != null) {
            c cVar = this.f74067d;
            if (cVar != null) {
                a.b bVarX = cVar.x(canvasLockCanvas);
                if (this.f74074k) {
                    if (this.f74077n == null) {
                        this.f74077n = new LinkedList<>();
                    }
                    b.b();
                    d.d(canvasLockCanvas, String.format(Locale.getDefault(), "fps %.2f,time:%d s,cache:%d,miss:%d", Float.valueOf(i()), Long.valueOf(getCurrentTime() / 1000), Long.valueOf(bVarX.f72529r), Long.valueOf(bVarX.f72530s)));
                }
            }
            if (this.f74068e) {
                unlockCanvasAndPost(canvasLockCanvas);
            }
        }
        return b.b() - jB;
    }

    @Override // ep.g
    public synchronized void clear() {
        if (e()) {
            Canvas canvasLockCanvas = lockCanvas();
            if (canvasLockCanvas != null) {
                d.a(canvasLockCanvas);
                unlockCanvasAndPost(canvasLockCanvas);
            }
        }
    }

    @Override // ep.f
    public boolean d() {
        c cVar = this.f74067d;
        return cVar != null && cVar.E();
    }

    @Override // ep.g
    public boolean e() {
        return this.f74068e;
    }

    @Override // ep.g
    public boolean f() {
        return this.f74069f;
    }

    @Override // ep.f
    public void g(Long l10) {
        c cVar = this.f74067d;
        if (cVar != null) {
            cVar.Q(l10);
        }
    }

    public DanmakuContext getConfig() {
        c cVar = this.f74067d;
        if (cVar == null) {
            return null;
        }
        return cVar.z();
    }

    public long getCurrentTime() {
        c cVar = this.f74067d;
        if (cVar != null) {
            return cVar.A();
        }
        return 0L;
    }

    @Override // ep.f
    public k getCurrentVisibleDanmakus() {
        c cVar = this.f74067d;
        if (cVar != null) {
            return cVar.B();
        }
        return null;
    }

    @Override // ep.f
    public f.a getOnDanmakuClickListener() {
        return this.f74070g;
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
        return this.f74071h;
    }

    @Override // ep.f
    public float getYOff() {
        return this.f74072i;
    }

    @Override // ep.f
    public void h(boolean z10) {
        this.f74069f = z10;
    }

    @Override // ep.f
    public void hide() {
        this.f74075l = false;
        c cVar = this.f74067d;
        if (cVar == null) {
            return;
        }
        cVar.C(false);
    }

    public final float i() {
        long jB = b.b();
        this.f74077n.addLast(Long.valueOf(jB));
        Long lPeekFirst = this.f74077n.peekFirst();
        if (lPeekFirst == null) {
            return 0.0f;
        }
        float fLongValue = jB - lPeekFirst.longValue();
        if (this.f74077n.size() > 50) {
            this.f74077n.removeFirst();
        }
        if (fLongValue > 0.0f) {
            return (this.f74077n.size() * 1000) / fLongValue;
        }
        return 0.0f;
    }

    @Override // android.view.View, ep.g
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override // ep.f
    public boolean isPaused() {
        c cVar = this.f74067d;
        if (cVar != null) {
            return cVar.F();
        }
        return false;
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f74075l && super.isShown();
    }

    public synchronized Looper j(int i10) {
        HandlerThread handlerThread = this.f74066c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f74066c = null;
        }
        if (i10 == 1) {
            return Looper.getMainLooper();
        }
        int i11 = i10 != 2 ? i10 != 3 ? 0 : 19 : -8;
        HandlerThread handlerThread2 = new HandlerThread("DFM Handler Thread #" + i11, i11);
        this.f74066c = handlerThread2;
        handlerThread2.start();
        return this.f74066c.getLooper();
    }

    @TargetApi(11)
    public final void k() {
        setLayerType(2, null);
        setOpaque(false);
        setWillNotCacheDrawing(true);
        setDrawingCacheEnabled(false);
        setWillNotDraw(true);
        setSurfaceTextureListener(this);
        d.e(true, true);
        this.f74073j = mp.a.j(this);
    }

    public final void l() {
        if (this.f74067d == null) {
            this.f74067d = new c(j(this.f74076m), this, this.f74075l);
        }
    }

    public void m() {
        p();
        start();
    }

    public void n(Long l10) {
        this.f74075l = true;
        c cVar = this.f74067d;
        if (cVar == null) {
            return;
        }
        cVar.U(l10);
    }

    public void o(long j10) {
        c cVar = this.f74067d;
        if (cVar == null) {
            l();
        } else {
            cVar.removeCallbacksAndMessages(null);
        }
        this.f74067d.obtainMessage(1, Long.valueOf(j10)).sendToTarget();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f74068e = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public synchronized boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f74068e = false;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c cVar = this.f74067d;
        if (cVar != null) {
            cVar.G(i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK = this.f74073j.k(motionEvent);
        return !zK ? super.onTouchEvent(motionEvent) : zK;
    }

    public void p() {
        q();
    }

    @Override // ep.f
    public void pause() {
        c cVar = this.f74067d;
        if (cVar != null) {
            cVar.I();
        }
    }

    public final synchronized void q() {
        c cVar = this.f74067d;
        if (cVar != null) {
            cVar.L();
            this.f74067d = null;
        }
        HandlerThread handlerThread = this.f74066c;
        this.f74066c = null;
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
        LinkedList<Long> linkedList = this.f74077n;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    @Override // ep.f
    public void resume() {
        c cVar = this.f74067d;
        if (cVar != null && cVar.E()) {
            this.f74067d.P();
        } else if (this.f74067d == null) {
            m();
        }
    }

    @Override // ep.f
    public void setCallback(c.d dVar) {
        this.f74065b = dVar;
        c cVar = this.f74067d;
        if (cVar != null) {
            cVar.R(dVar);
        }
    }

    public void setDrawingThreadType(int i10) {
        this.f74076m = i10;
    }

    public void setOnDanmakuClickListener(f.a aVar) {
        this.f74070g = aVar;
    }

    @Override // ep.f
    public void show() {
        n(null);
    }

    @Override // ep.f
    public void start() {
        o(0L);
    }

    @Override // ep.f
    public void toggle() {
        if (this.f74068e) {
            c cVar = this.f74067d;
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
