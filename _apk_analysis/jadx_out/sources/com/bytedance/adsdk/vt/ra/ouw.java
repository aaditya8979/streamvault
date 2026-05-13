package com.bytedance.adsdk.vt.ra;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.vt.ra;

/* JADX INFO: loaded from: classes5.dex */
public class ouw<T> {
    public float bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f12183cf;
    public final Interpolator fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public PointF f12184jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private float f12185ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final Interpolator f12186le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public T f12187lh;
    public PointF mwh;
    private final ra ouw;
    public Float pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final float f12188ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private float f12189rn;
    public int ryl;
    public float tlj;
    public final T vt;
    public final Interpolator yu;

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f12183cf = 784923401;
        this.ryl = 784923401;
        this.f12185ko = Float.MIN_VALUE;
        this.f12189rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f12184jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f12187lh = t11;
        this.yu = interpolator;
        this.fkw = null;
        this.f12186le = null;
        this.f12188ra = f10;
        this.pno = f11;
    }

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f12183cf = 784923401;
        this.ryl = 784923401;
        this.f12185ko = Float.MIN_VALUE;
        this.f12189rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f12184jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f12187lh = t11;
        this.yu = null;
        this.fkw = interpolator;
        this.f12186le = interpolator2;
        this.f12188ra = f10;
        this.pno = f11;
    }

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f12183cf = 784923401;
        this.ryl = 784923401;
        this.f12185ko = Float.MIN_VALUE;
        this.f12189rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f12184jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f12187lh = t11;
        this.yu = interpolator;
        this.fkw = interpolator2;
        this.f12186le = interpolator3;
        this.f12188ra = f10;
        this.pno = f11;
    }

    public ouw(T t10) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f12183cf = 784923401;
        this.ryl = 784923401;
        this.f12185ko = Float.MIN_VALUE;
        this.f12189rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f12184jg = null;
        this.ouw = null;
        this.vt = t10;
        this.f12187lh = t10;
        this.yu = null;
        this.fkw = null;
        this.f12186le = null;
        this.f12188ra = Float.MIN_VALUE;
        this.pno = Float.valueOf(Float.MAX_VALUE);
    }

    public ouw(T t10, T t11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f12183cf = 784923401;
        this.ryl = 784923401;
        this.f12185ko = Float.MIN_VALUE;
        this.f12189rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f12184jg = null;
        this.ouw = null;
        this.vt = t10;
        this.f12187lh = t11;
        this.yu = null;
        this.fkw = null;
        this.f12186le = null;
        this.f12188ra = Float.MIN_VALUE;
        this.pno = Float.valueOf(Float.MAX_VALUE);
    }

    public final float lh() {
        if (this.ouw == null) {
            return 1.0f;
        }
        if (this.f12189rn == Float.MIN_VALUE) {
            if (this.pno == null) {
                this.f12189rn = 1.0f;
            } else {
                this.f12189rn = vt() + ((this.pno.floatValue() - this.f12188ra) / this.ouw.vt());
            }
        }
        return this.f12189rn;
    }

    public final boolean ouw(float f10) {
        return f10 >= vt() && f10 < lh();
    }

    public String toString() {
        return "Keyframe{startValue=" + this.vt + ", endValue=" + this.f12187lh + ", startFrame=" + this.f12188ra + ", endFrame=" + this.pno + ", interpolator=" + this.yu + '}';
    }

    public final float vt() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return 0.0f;
        }
        if (this.f12185ko == Float.MIN_VALUE) {
            this.f12185ko = (this.f12188ra - raVar.tlj) / raVar.vt();
        }
        return this.f12185ko;
    }

    public final boolean yu() {
        return this.yu == null && this.fkw == null && this.f12186le == null;
    }
}
