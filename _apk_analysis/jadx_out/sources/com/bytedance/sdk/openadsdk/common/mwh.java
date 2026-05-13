package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.ksc;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public class mwh extends com.bytedance.sdk.openadsdk.core.le.lh {
    private Runnable fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Runnable f13100le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f13101lh;
    public ryl ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f13102ra;
    public boolean vt;
    private long yu;

    public mwh(@NonNull Context context) {
        super(context);
        this.yu = 10L;
        this.vt = true;
        this.f13102ra = false;
        this.pno = 1;
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    private void lh(int i10) {
        if (this.pno != i10) {
            this.pno = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(int i10) {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(i10);
        }
        if (i10 == 100 && this.vt) {
            vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public ryl getLoadingStyle() {
        return this.ouw;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lh(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.fkw;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.fkw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void ouw() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.1
            @Override // java.lang.Runnable
            public final void run() {
                mwh mwhVar = mwh.this;
                if (mwhVar.ouw != null) {
                    mwhVar.setVisibility(0);
                }
            }
        });
        if (this.fkw == null) {
            this.fkw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.2
                @Override // java.lang.Runnable
                public final void run() {
                    mwh.this.vt();
                }
            };
        }
        postDelayed(this.fkw, this.yu * 1000);
    }

    public final void ouw(int i10) {
        if (i10 == 100 || Math.abs(i10 - this.f13101lh) >= 7) {
            this.f13101lh = i10;
            if (com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
                vt(this.f13101lh);
                return;
            }
            if (this.f13100le == null) {
                this.f13100le = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.mwh.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        mwh mwhVar = mwh.this;
                        mwhVar.vt(mwhVar.f13101lh);
                    }
                };
            }
            post(this.f13100le);
        }
    }

    public final void ouw(vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.qbp qbpVar;
        if (vppVar != null && (qbpVar = vppVar.f13770kq) != null) {
            this.yu = qbpVar.ouw;
        }
        ryl rylVar = new ryl(getContext());
        this.ouw = rylVar;
        View viewOuw = rylVar.ouw();
        if (viewOuw.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewOuw.getParent()).removeView(viewOuw);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewOuw.setLayoutParams(layoutParams);
        if (vppVar != null) {
            boolean zZin = vppVar.zin();
            com.bytedance.sdk.openadsdk.core.widget.zih zihVar = this.ouw.f13109lh;
            if (zihVar != null) {
                if (this.f13102ra || zZin) {
                    zihVar.setVisibility(8);
                } else {
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = null;
                    com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = vppVar.fak;
                    if (zihVar3 != null && !TextUtils.isEmpty(zihVar3.ouw)) {
                        zihVar2 = vppVar.fak;
                    }
                    if (zihVar2 == null || TextUtils.isEmpty(zihVar2.ouw)) {
                        zihVar.setVisibility(8);
                    } else {
                        try {
                            yu.ouw.ouw(yu.ouw.vt.ouw(zihVar2.ouw).ouw(zihVar2.vt).vt(zihVar2.f13812lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar2.f13811le)).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, zihVar2.ouw, new ksc(zihVar)));
                        } catch (Throwable unused) {
                            zihVar.setVisibility(8);
                        }
                    }
                }
            }
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar = this.ouw.yu;
            if (pnoVar != null) {
                if (this.f13102ra || zZin) {
                    pnoVar.setText("Loading");
                } else if (TextUtils.isEmpty(vppVar.fqk)) {
                    pnoVar.setVisibility(8);
                } else {
                    pnoVar.setText(vppVar.fqk);
                }
            }
        }
        addView(viewOuw);
        lh(getResources().getConfiguration().orientation);
    }

    public void setOnlyLoading(boolean z10) {
        this.f13102ra = z10;
    }

    public final void vt() {
        this.f13101lh = 0;
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            removeView(rylVar.ouw);
            this.ouw.vt();
        }
        setVisibility(8);
        this.ouw = null;
        Runnable runnable = this.fkw;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f13100le;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f13100le = null;
        this.fkw = null;
    }
}
