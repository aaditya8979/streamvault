package mp;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ep.f;
import fp.c;
import fp.k;
import gp.e;

/* JADX INFO: compiled from: DanmakuTouchHelper.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f74836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f74837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f74838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f74839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f74840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector.OnGestureListener f74841f;

    /* JADX INFO: renamed from: mp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DanmakuTouchHelper.java */
    public class C0888a extends GestureDetector.SimpleOnGestureListener {
        public C0888a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (a.this.f74837b == null || a.this.f74837b.getOnDanmakuClickListener() == null) {
                return false;
            }
            a aVar = a.this;
            aVar.f74839d = aVar.f74837b.getXOff();
            a aVar2 = a.this;
            aVar2.f74840e = aVar2.f74837b.getYOff();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (a.this.f74837b.getOnDanmakuClickListener() == null) {
                return;
            }
            a aVar = a.this;
            aVar.f74839d = aVar.f74837b.getXOff();
            a aVar2 = a.this;
            aVar2.f74840e = aVar2.f74837b.getYOff();
            k kVarN = a.this.n(motionEvent.getX(), motionEvent.getY());
            if (kVarN == null || kVarN.isEmpty()) {
                return;
            }
            a.this.l(kVarN, true);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            k kVarN = a.this.n(motionEvent.getX(), motionEvent.getY());
            boolean zL = false;
            if (kVarN != null && !kVarN.isEmpty()) {
                zL = a.this.l(kVarN, false);
            }
            return !zL ? a.this.m() : zL;
        }
    }

    /* JADX INFO: compiled from: DanmakuTouchHelper.java */
    public class b extends k.c<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f74843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f74844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f74845c;

        public b(float f10, float f11, k kVar) {
            this.f74843a = f10;
            this.f74844b = f11;
            this.f74845c = kVar;
        }

        @Override // fp.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int a(c cVar) {
            if (cVar == null) {
                return 0;
            }
            a.this.f74838c.set(cVar.g(), cVar.l(), cVar.i(), cVar.d());
            if (!a.this.f74838c.intersect(this.f74843a - a.this.f74839d, this.f74844b - a.this.f74840e, this.f74843a + a.this.f74839d, this.f74844b + a.this.f74840e)) {
                return 0;
            }
            this.f74845c.c(cVar);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f fVar) {
        C0888a c0888a = new C0888a();
        this.f74841f = c0888a;
        this.f74837b = fVar;
        this.f74838c = new RectF();
        this.f74836a = new GestureDetector(((View) fVar).getContext(), c0888a);
    }

    public static synchronized a j(f fVar) {
        return new a(fVar);
    }

    public boolean k(MotionEvent motionEvent) {
        return this.f74836a.onTouchEvent(motionEvent);
    }

    public final boolean l(k kVar, boolean z10) {
        f.a onDanmakuClickListener = this.f74837b.getOnDanmakuClickListener();
        if (onDanmakuClickListener != null) {
            return z10 ? onDanmakuClickListener.c(kVar) : onDanmakuClickListener.b(kVar);
        }
        return false;
    }

    public final boolean m() {
        f.a onDanmakuClickListener = this.f74837b.getOnDanmakuClickListener();
        if (onDanmakuClickListener != null) {
            return onDanmakuClickListener.a(this.f74837b);
        }
        return false;
    }

    public final k n(float f10, float f11) {
        e eVar = new e();
        this.f74838c.setEmpty();
        k currentVisibleDanmakus = this.f74837b.getCurrentVisibleDanmakus();
        if (currentVisibleDanmakus != null && !currentVisibleDanmakus.isEmpty()) {
            currentVisibleDanmakus.d(new b(f10, f11, eVar));
        }
        return eVar;
    }
}
