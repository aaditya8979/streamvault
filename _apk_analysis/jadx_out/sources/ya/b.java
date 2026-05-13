package ya;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: CustomGestureDetector.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87469a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87470b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f87471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f87472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f87473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f87474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f87475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f87476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f87477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f87478j;

    /* JADX INFO: compiled from: CustomGestureDetector.java */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f87479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f87480b = 0.0f;

        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            b.this.f87478j.b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getFocusX() - this.f87479a, scaleGestureDetector.getFocusY() - this.f87480b);
            this.f87479a = scaleGestureDetector.getFocusX();
            this.f87480b = scaleGestureDetector.getFocusY();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            this.f87479a = scaleGestureDetector.getFocusX();
            this.f87480b = scaleGestureDetector.getFocusY();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public b(Context context, c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f87477i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f87476h = viewConfiguration.getScaledTouchSlop();
        this.f87478j = cVar;
        this.f87471c = new ScaleGestureDetector(context, new a());
    }

    public final float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f87470b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    public final float c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f87470b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean d() {
        return this.f87473e;
    }

    public boolean e() {
        return this.f87471c.isInProgress();
    }

    public boolean f(MotionEvent motionEvent) {
        try {
            this.f87471c.onTouchEvent(motionEvent);
            return g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public final boolean g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f87469a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f87472d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f87474f = b(motionEvent);
            this.f87475g = c(motionEvent);
            this.f87473e = false;
        } else if (action == 1) {
            this.f87469a = -1;
            if (this.f87473e && this.f87472d != null) {
                this.f87474f = b(motionEvent);
                this.f87475g = c(motionEvent);
                this.f87472d.addMovement(motionEvent);
                this.f87472d.computeCurrentVelocity(1000);
                float xVelocity = this.f87472d.getXVelocity();
                float yVelocity = this.f87472d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f87477i) {
                    this.f87478j.c(this.f87474f, this.f87475g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f87472d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f87472d = null;
            }
        } else if (action == 2) {
            float fB = b(motionEvent);
            float fC = c(motionEvent);
            float f10 = fB - this.f87474f;
            float f11 = fC - this.f87475g;
            if (!this.f87473e) {
                this.f87473e = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f87476h);
            }
            if (this.f87473e) {
                this.f87478j.a(f10, f11);
                this.f87474f = fB;
                this.f87475g = fC;
                VelocityTracker velocityTracker2 = this.f87472d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f87469a = -1;
            VelocityTracker velocityTracker3 = this.f87472d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f87472d = null;
            }
        } else if (action == 6) {
            int iB = l.b(motionEvent.getAction());
            if (motionEvent.getPointerId(iB) == this.f87469a) {
                int i10 = iB == 0 ? 1 : 0;
                this.f87469a = motionEvent.getPointerId(i10);
                this.f87474f = motionEvent.getX(i10);
                this.f87475g = motionEvent.getY(i10);
            }
        }
        int i11 = this.f87469a;
        this.f87470b = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        return true;
    }
}
