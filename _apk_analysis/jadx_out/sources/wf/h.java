package wf;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: RotationGestureDetector.java */
/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f86394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f86395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f86396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f86397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86398e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86399f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f86400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f86402i;

    /* JADX INFO: compiled from: RotationGestureDetector.java */
    public interface a {
        boolean a(h hVar);
    }

    /* JADX INFO: compiled from: RotationGestureDetector.java */
    public static class b implements a {
    }

    public h(a aVar) {
        this.f86402i = aVar;
    }

    public final float a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return b((float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)), (float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)));
    }

    public final float b(float f10, float f11) {
        float f12 = (f11 % 360.0f) - (f10 % 360.0f);
        this.f86400g = f12;
        if (f12 < -180.0f) {
            this.f86400g = f12 + 360.0f;
        } else if (f12 > 180.0f) {
            this.f86400g = f12 - 360.0f;
        }
        return this.f86400g;
    }

    public float c() {
        return this.f86400g;
    }

    public boolean d(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f86396c = motionEvent.getX();
            this.f86397d = motionEvent.getY();
            this.f86398e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.f86400g = 0.0f;
            this.f86401h = true;
        } else if (actionMasked == 1) {
            this.f86398e = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f86394a = motionEvent.getX();
                this.f86395b = motionEvent.getY();
                this.f86399f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.f86400g = 0.0f;
                this.f86401h = true;
            } else if (actionMasked == 6) {
                this.f86399f = -1;
            }
        } else if (this.f86398e != -1 && this.f86399f != -1 && motionEvent.getPointerCount() > this.f86399f) {
            float x10 = motionEvent.getX(this.f86398e);
            float y10 = motionEvent.getY(this.f86398e);
            float x11 = motionEvent.getX(this.f86399f);
            float y11 = motionEvent.getY(this.f86399f);
            if (this.f86401h) {
                this.f86400g = 0.0f;
                this.f86401h = false;
            } else {
                a(this.f86394a, this.f86395b, this.f86396c, this.f86397d, x11, y11, x10, y10);
            }
            a aVar = this.f86402i;
            if (aVar != null) {
                aVar.a(this);
            }
            this.f86394a = x11;
            this.f86395b = y11;
            this.f86396c = x10;
            this.f86397d = y10;
        }
        return true;
    }
}
