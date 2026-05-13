package com.bytedance.adsdk.vt.le;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes6.dex */
public final class fkw extends ouw implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.adsdk.vt.ra f11972le;
    public float ouw = 1.0f;
    private boolean bly = false;
    private long tlj = 0;
    public float vt = 0.0f;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f11973lh = 0.0f;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11971cf = 0;
    public float yu = -2.1474836E9f;
    public float fkw = 2.1474836E9f;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f11974ra = false;
    public boolean pno = false;

    private void jg() {
        this.ouw = -this.ouw;
    }

    private boolean ko() {
        return this.ouw < 0.0f;
    }

    private void lh(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f11974ra = false;
        }
    }

    private void rn() {
        if (isRunning()) {
            lh(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void bly() {
        lh(true);
        vt(ko());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        vt();
        lh(true);
    }

    public final void cf() {
        this.f11974ra = true;
        rn();
        this.tlj = 0L;
        if (ko() && this.f11973lh == ryl()) {
            ouw(mwh());
        } else if (!ko() && this.f11973lh == mwh()) {
            ouw(ryl());
        }
        fkw();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        rn();
        if (this.f11972le == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.vt.fkw.ouw("LottieValueAnimator#doFrame");
        long j11 = this.tlj;
        long j12 = j11 != 0 ? j10 - j11 : 0L;
        com.bytedance.adsdk.vt.ra raVar = this.f11972le;
        float fAbs = j12 / (raVar == null ? Float.MAX_VALUE : (1.0E9f / raVar.ryl) / Math.abs(this.ouw));
        float f10 = this.vt;
        if (ko()) {
            fAbs = -fAbs;
        }
        float f11 = f10 + fAbs;
        boolean z10 = !ra.lh(f11, ryl(), mwh());
        float f12 = this.vt;
        float fVt = ra.vt(f11, ryl(), mwh());
        this.vt = fVt;
        if (this.pno) {
            fVt = (float) Math.floor(fVt);
        }
        this.f11973lh = fVt;
        this.tlj = j10;
        if (!this.pno || this.vt != f12) {
            lh();
        }
        if (z10) {
            if (getRepeatCount() == -1 || this.f11971cf < getRepeatCount()) {
                ouw();
                this.f11971cf++;
                if (getRepeatMode() == 2) {
                    this.bly = !this.bly;
                    jg();
                } else {
                    float fMwh = ko() ? mwh() : ryl();
                    this.vt = fMwh;
                    this.f11973lh = fMwh;
                }
                this.tlj = j10;
            } else {
                float fRyl = this.ouw < 0.0f ? ryl() : mwh();
                this.vt = fRyl;
                this.f11973lh = fRyl;
                lh(true);
                vt(ko());
            }
        }
        if (this.f11972le != null) {
            float f13 = this.f11973lh;
            if (f13 < this.yu || f13 > this.fkw) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.yu), Float.valueOf(this.fkw), Float.valueOf(this.f11973lh)));
            }
        }
        com.bytedance.adsdk.vt.fkw.vt("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fRyl;
        float fMwh;
        float fRyl2;
        if (this.f11972le == null) {
            return 0.0f;
        }
        if (ko()) {
            fRyl = mwh() - this.f11973lh;
            fMwh = mwh();
            fRyl2 = ryl();
        } else {
            fRyl = this.f11973lh - ryl();
            fMwh = mwh();
            fRyl2 = ryl();
        }
        return fRyl / (fMwh - fRyl2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(le());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        com.bytedance.adsdk.vt.ra raVar = this.f11972le;
        if (raVar == null) {
            return 0L;
        }
        return (long) raVar.ouw();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f11974ra;
    }

    public final float le() {
        com.bytedance.adsdk.vt.ra raVar = this.f11972le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.f11973lh;
        float f11 = raVar.tlj;
        return (f10 - f11) / (raVar.f12167cf - f11);
    }

    public final float mwh() {
        com.bytedance.adsdk.vt.ra raVar = this.f11972le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.fkw;
        return f10 == 2.1474836E9f ? raVar.f12167cf : f10;
    }

    public final void ouw(float f10) {
        if (this.vt == f10) {
            return;
        }
        float fVt = ra.vt(f10, ryl(), mwh());
        this.vt = fVt;
        if (this.pno) {
            fVt = (float) Math.floor(fVt);
        }
        this.f11973lh = fVt;
        this.tlj = 0L;
        lh();
    }

    public final void ouw(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        com.bytedance.adsdk.vt.ra raVar = this.f11972le;
        float f12 = raVar == null ? -3.4028235E38f : raVar.tlj;
        float f13 = raVar == null ? Float.MAX_VALUE : raVar.f12167cf;
        float fVt = ra.vt(f10, f12, f13);
        float fVt2 = ra.vt(f11, f12, f13);
        if (fVt == this.yu && fVt2 == this.fkw) {
            return;
        }
        this.yu = fVt;
        this.fkw = fVt2;
        ouw((int) ra.vt(this.f11973lh, fVt, fVt2));
    }

    public final void ouw(int i10) {
        ouw(i10, (int) this.fkw);
    }

    public final void pno() {
        this.f11974ra = true;
        ouw(ko());
        ouw((int) (ko() ? mwh() : ryl()));
        this.tlj = 0L;
        this.f11971cf = 0;
        rn();
    }

    public final void ra() {
        this.f11972le = null;
        this.yu = -2.1474836E9f;
        this.fkw = 2.1474836E9f;
    }

    public final float ryl() {
        com.bytedance.adsdk.vt.ra raVar = this.f11972le;
        if (raVar == null) {
            return 0.0f;
        }
        float f10 = this.yu;
        return f10 == -2.1474836E9f ? raVar.tlj : f10;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.bly) {
            return;
        }
        this.bly = false;
        jg();
    }

    public final void tlj() {
        lh(true);
        yu();
    }

    @Override // com.bytedance.adsdk.vt.le.ouw
    public final void vt() {
        super.vt();
        vt(ko());
    }

    public final void vt(float f10) {
        ouw(this.yu, f10);
    }
}
