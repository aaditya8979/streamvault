package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public class yu extends com.bytedance.sdk.openadsdk.core.le.lh {
    private boolean bly;
    public PAGBannerAdWrapperListener fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f14130le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public vpp f14131lh;
    public final Context ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f14132ra;
    public qbp vt;
    public AdSlot yu;

    public yu(@NonNull Context context, vpp vppVar, AdSlot adSlot, boolean z10) {
        super(context);
        this.f14130le = "banner_ad";
        this.f14132ra = false;
        this.pno = -1;
        this.bly = false;
        if (vppVar != null && vppVar.rn() != 2) {
            vppVar.yw = 1;
        }
        this.f14132ra = z10;
        this.ouw = context;
        this.f14131lh = vppVar;
        this.yu = adSlot;
        lh();
        AdSlot adSlot2 = this.yu;
        if (adSlot2 != null) {
            ouw(adSlot2.getExpressViewAcceptedWidth(), this.yu.getExpressViewAcceptedHeight());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void fkw() {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            qbpVar.ko();
        }
    }

    public qbp getCurView() {
        return this.vt;
    }

    public void lh() {
        qbp qbpVar = new qbp(this.ouw, this.f14131lh, this.yu, this.f14130le) { // from class: com.bytedance.sdk.openadsdk.core.yu.yu.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
            public final fkw.ouw lh(int i10) {
                return yu.this.ouw(super.lh(i10));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
            public void onMeasure(int i10, int i11) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(i10, i11);
                }
            }
        };
        this.vt = qbpVar;
        addView(qbpVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.fkw;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.vt == null) {
            lh();
        }
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.f14131lh);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
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

    public final fkw.ouw ouw(fkw.ouw ouwVar) {
        int i10;
        if (this.f14132ra && (i10 = this.pno) >= 0) {
            ouwVar.vt = i10;
        }
        return ouwVar;
    }

    public final void ouw(float f10, float f11) {
        int iOuw = osn.ouw(this.ouw, f10);
        int iOuw2 = osn.ouw(this.ouw, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iOuw, iOuw2);
        }
        layoutParams.width = iOuw;
        layoutParams.height = iOuw2;
        setLayoutParams(layoutParams);
    }

    public void setCurrentIndex(int i10) {
        this.pno = i10;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.fkw = pAGBannerAdWrapperListener;
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            qbpVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.core.yu.yu.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
                public final void ouw() {
                    yu.this.fkw.onAdClicked();
                }
            });
            this.vt.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.yu.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public final void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    vpp vppVar = yu.this.f14131lh;
                    if (vppVar == null || !vppVar.pd() || (pAGBannerAdWrapperListener2 = yu.this.fkw) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onAdShow(View view, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onRenderFail(View view, String str, int i10) {
                    yu yuVar = yu.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = yuVar.fkw;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(yuVar, str, i10);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onRenderSuccess(View view, float f10, float f11) {
                    qbp qbpVar2 = yu.this.vt;
                    if (qbpVar2 != null) {
                        qbpVar2.setSoundMute(true);
                        if (com.bytedance.sdk.openadsdk.core.cf.yu.ouw(yu.this.vt.getDynamicShowType())) {
                            yu yuVar = yu.this;
                            AdSlot adSlot = yuVar.yu;
                            if (adSlot != null) {
                                yuVar.ouw(adSlot.getExpressViewAcceptedWidth(), yu.this.yu.getExpressViewAcceptedHeight());
                            }
                        } else {
                            yu.this.ouw(f10, f11);
                        }
                    }
                    if (yu.this.bly) {
                        yu.this.vt.jg();
                    }
                    yu yuVar2 = yu.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = yuVar2.fkw;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(yuVar2, f10, f11);
                    }
                }
            });
        }
    }

    public void setIsShow(boolean z10) {
        this.bly = z10;
    }

    public void yu() {
        if (this.vt != null) {
            com.bytedance.sdk.openadsdk.core.bly.ouw().yu(this.vt.getClosedListenerKey());
            removeView(this.vt);
            this.vt.mwh();
            this.vt = null;
        }
        com.bytedance.sdk.openadsdk.core.bly blyVarOuw = com.bytedance.sdk.openadsdk.core.bly.ouw();
        try {
            if (blyVarOuw.mwh == null || blyVarOuw.mwh.size() != 0) {
                return;
            }
            blyVarOuw.mwh = null;
        } catch (Throwable th2) {
            ko.ouw("TTAD.GlobalInfo", "removeClickCloseListenerObj()", th2.getMessage());
        }
    }
}
