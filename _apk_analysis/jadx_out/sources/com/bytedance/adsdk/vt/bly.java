package com.bytedance.adsdk.vt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bly extends Drawable implements Animatable, Drawable.Callback {
    public com.bytedance.adsdk.vt.vt.vt bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private Rect f11923bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private int f11924cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public yu f11925cf;
    public qbp ex;
    private Rect ey;
    private RectF fak;
    public boolean fkw;
    private Matrix fqk;
    private Canvas fvf;
    public View jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public String f11926jg;
    public boolean jqy;
    private Matrix jvy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public lh f11927ko;
    public RectF ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public vt f11928le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11929lh;
    public Map<String, Typeface> mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public boolean f11930od;
    private Rect osn;
    public ra ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private Bitmap f11931pd;
    public final ValueAnimator.AnimatorUpdateListener pno;
    public com.bytedance.adsdk.vt.lh.lh.vt qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final ArrayList<ouw> f11932ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public zin f11933rn;
    private RectF rrs;
    public com.bytedance.adsdk.vt.vt.ouw ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f11934tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f11935th;
    public String tlj;
    private Paint uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private final Matrix f11936uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f11937vm;
    public boolean vpp;
    public final com.bytedance.adsdk.vt.le.fkw vt;
    public boolean yu;
    public boolean zih;
    public boolean zin;

    public interface ouw {
        void ouw();
    }

    public enum vt {
        NONE,
        PLAY,
        RESUME
    }

    public bly() {
        com.bytedance.adsdk.vt.le.fkw fkwVar = new com.bytedance.adsdk.vt.le.fkw();
        this.vt = fkwVar;
        this.f11929lh = true;
        this.yu = false;
        this.fkw = false;
        this.f11928le = vt.NONE;
        this.f11932ra = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.bly.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (bly.this.qbp != null) {
                    bly.this.qbp.ouw(bly.this.vt.le());
                }
            }
        };
        this.pno = animatorUpdateListener;
        this.f11937vm = false;
        this.f11935th = true;
        this.f11924cd = 255;
        this.ex = qbp.AUTOMATIC;
        this.f11934tc = false;
        this.f11936uq = new Matrix();
        this.f11930od = false;
        fkwVar.addUpdateListener(animatorUpdateListener);
    }

    private Context cf() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private static void ouw(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private boolean tlj() {
        return this.f11929lh || this.yu;
    }

    public final com.bytedance.adsdk.vt.vt.ouw bly() {
        if (getCallback() == null) {
            return null;
        }
        if (this.ryl == null) {
            com.bytedance.adsdk.vt.vt.ouw ouwVar = new com.bytedance.adsdk.vt.vt.ouw(getCallback(), this.f11927ko);
            this.ryl = ouwVar;
            String str = this.f11926jg;
            if (str != null) {
                ouwVar.yu = str;
            }
        }
        return this.ryl;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.bly.draw(android.graphics.Canvas):void");
    }

    public final void fkw() {
        if (this.qbp == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.7
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.fkw();
                }
            });
            return;
        }
        vt();
        if (tlj() || this.vt.getRepeatCount() == 0) {
            if (isVisible()) {
                this.vt.cf();
                this.f11928le = vt.NONE;
            } else {
                this.f11928le = vt.RESUME;
            }
        }
        if (tlj()) {
            return;
        }
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        lh((int) (fkwVar.ouw < 0.0f ? fkwVar.ryl() : fkwVar.mwh()));
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f11928le = vt.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f11924cd;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return -1;
        }
        return raVar.bly.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return -1;
        }
        return raVar.bly.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f11930od) {
            return;
        }
        this.f11930od = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return le();
    }

    public final boolean le() {
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        if (fkwVar == null) {
            return false;
        }
        return fkwVar.isRunning();
    }

    public final void lh() {
        if (this.vt.isRunning()) {
            this.vt.cancel();
            if (!isVisible()) {
                this.f11928le = vt.NONE;
            }
        }
        this.ouw = null;
        this.qbp = null;
        this.bly = null;
        this.vt.ra();
        invalidateSelf();
    }

    public final void lh(final float f10) {
        if (this.ouw == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.5
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(f10);
                }
            });
            return;
        }
        fkw.ouw("Drawable#setProgress");
        this.vt.ouw(this.ouw.ouw(f10));
        fkw.vt("Drawable#setProgress");
    }

    public final void lh(final int i10) {
        if (this.ouw == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.4
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(i10);
                }
            });
        } else {
            this.vt.ouw(i10);
        }
    }

    public final void lh(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.2
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            int i10 = (int) leVarVt.vt;
            ouw(i10, ((int) leVarVt.f11977lh) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public final qbp ouw() {
        return this.f11934tc ? qbp.SOFTWARE : qbp.HARDWARE;
    }

    public final void ouw(final float f10) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.9
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(f10);
                }
            });
        } else {
            ouw((int) com.bytedance.adsdk.vt.le.ra.ouw(raVar.tlj, raVar.f12167cf, f10));
        }
    }

    public final void ouw(final int i10) {
        if (this.ouw == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.8
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(i10);
                }
            });
        } else {
            this.vt.ouw(i10);
        }
    }

    public final void ouw(final int i10, final int i11) {
        if (this.ouw == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.3
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(i10, i11);
                }
            });
        } else {
            this.vt.ouw(i10, i11 + 0.99f);
        }
    }

    public final void ouw(Animator.AnimatorListener animatorListener) {
        this.vt.addListener(animatorListener);
    }

    public final void ouw(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.vt.addUpdateListener(animatorUpdateListener);
    }

    public final void ouw(Context context) {
        ra raVar = this.ouw;
        if (raVar == null) {
            return;
        }
        com.bytedance.adsdk.vt.lh.lh.vt vtVar = new com.bytedance.adsdk.vt.lh.lh.vt(this, com.bytedance.adsdk.vt.fkw.qbp.ouw(raVar), raVar.pno, raVar, context);
        this.qbp = vtVar;
        if (this.vpp) {
            vtVar.ouw(true);
        }
        this.qbp.ryl = this.f11935th;
    }

    public final void ouw(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.12
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            ouw((int) leVarVt.vt);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final com.bytedance.adsdk.vt.vt.vt pno() {
        com.bytedance.adsdk.vt.vt.vt vtVar = this.bly;
        if (vtVar != null && !vtVar.ouw(cf())) {
            this.bly = null;
        }
        if (this.bly == null) {
            this.bly = new com.bytedance.adsdk.vt.vt.vt(getCallback(), this.tlj, this.f11925cf, this.ouw.f12171lh);
        }
        return this.bly;
    }

    public final void ra() {
        this.f11932ra.clear();
        this.vt.tlj();
        if (isVisible()) {
            return;
        }
        this.f11928le = vt.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f11924cd = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        com.bytedance.adsdk.vt.le.yu.vt("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            vt vtVar = this.f11928le;
            if (vtVar == vt.PLAY) {
                yu();
            } else if (vtVar == vt.RESUME) {
                fkw();
            }
        } else if (this.vt.isRunning()) {
            ra();
            this.f11928le = vt.RESUME;
        } else if (!z12) {
            this.f11928le = vt.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        yu();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f11932ra.clear();
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f11928le = vt.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void vt() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return;
        }
        this.f11934tc = this.ex.ouw(Build.VERSION.SDK_INT, raVar.mwh, raVar.f12168jg);
    }

    public final void vt(final float f10) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.11
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(f10);
                }
            });
        } else {
            this.vt.vt(com.bytedance.adsdk.vt.le.ra.ouw(raVar.tlj, raVar.f12167cf, f10));
        }
    }

    public final void vt(final int i10) {
        if (this.ouw == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.10
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(i10);
                }
            });
        } else {
            this.vt.vt(i10 + 0.99f);
        }
    }

    public final void vt(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.13
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            vt((int) (leVarVt.vt + leVarVt.f11977lh));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final tlj yu(String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            return null;
        }
        return raVar.f12171lh.get(str);
    }

    public final void yu() {
        if (this.qbp == null) {
            this.f11932ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.6
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.yu();
                }
            });
            return;
        }
        vt();
        if (tlj() || this.vt.getRepeatCount() == 0) {
            if (isVisible()) {
                this.vt.pno();
                this.f11928le = vt.NONE;
            } else {
                this.f11928le = vt.PLAY;
            }
        }
        if (tlj()) {
            return;
        }
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        lh((int) (fkwVar.ouw < 0.0f ? fkwVar.ryl() : fkwVar.mwh()));
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f11928le = vt.NONE;
    }

    public final void yu(int i10) {
        this.vt.setRepeatCount(i10);
    }
}
