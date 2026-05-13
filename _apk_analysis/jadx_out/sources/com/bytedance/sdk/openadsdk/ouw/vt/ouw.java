package com.bytedance.sdk.openadsdk.ouw.vt;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.core.bly.bly;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.model.zih;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class ouw {
    public com.bytedance.sdk.openadsdk.core.lh.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public WeakReference<com.bytedance.sdk.openadsdk.core.ryl.le> f14210cf;
    public com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f14211jg = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public PAGMediaView f14212le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public WeakReference<com.bytedance.sdk.openadsdk.core.mwh.vt.le> f14213lh;
    private final String mwh;
    public final vpp ouw;
    public PAGMediaView pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public qbp f14214ra;
    private final Context ryl;
    public com.bytedance.sdk.openadsdk.core.lh.vt tlj;
    public boolean vt;
    public vt yu;

    public ouw(Context context, vpp vppVar, String str) {
        this.ryl = context;
        this.ouw = vppVar;
        this.mwh = str;
    }

    private PAGMediaView ouw(final View view) {
        int i10;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        qbp qbpVar = this.f14214ra;
        if (qbpVar != null) {
            qbpVar.setClickListener(null);
            this.f14214ra.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar = this.tlj;
        if (vtVar != null && (vtVar instanceof bly) && (view instanceof qbp)) {
            ((qbp) view).setClickListener((bly) vtVar);
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.bly;
        if (ouwVar != null && (ouwVar instanceof com.bytedance.sdk.openadsdk.core.bly.pno) && (view instanceof qbp)) {
            ((qbp) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.bly.pno) ouwVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.ryl) { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.3
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.yu.ouw(this, ouw.this.ouw);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i11, int i12) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(i11, i12);
                }
            }

            @Override // android.view.View
            public final void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                if (view instanceof qbp) {
                    return;
                }
                Integer num = this.ouw;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(num), z10 ? 4 : 8);
                }
                vpp vppVar = ouw.this.ouw;
                if (vppVar != null) {
                    com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(vppVar, z10);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public final void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                ouw.this.ouw(pAGVideoAdListener);
            }
        };
        int i11 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i10);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof qbp) {
            this.f14214ra = (qbp) view;
        }
        return pAGMediaView;
    }

    private lh vt(final PAGVideoAdListener pAGVideoAdListener) {
        return new lh() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.6
            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void lh() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void ouw() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void vt() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void yu() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }
        };
    }

    public final void bly() {
        Context context = this.ryl;
        if (context != null) {
            TTWebsiteActivity.ouw(context, this.ouw, this.mwh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView fkw() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.ouw
            com.bytedance.sdk.openadsdk.utils.vt.ouw(r0)
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.ouw
            int r0 = r0.rn()
            r1 = 2
            if (r0 != r1) goto L63
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.ouw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(r0)
            r1 = 1
            r2 = 520093762(0x1f000042, float:2.7105268E-20)
            if (r0 == 0) goto L3d
            com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh r0 = r4.fkw
            if (r0 == 0) goto L5a
            boolean r3 = r0 instanceof com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt
            if (r3 == 0) goto L5a
            com.bytedance.sdk.openadsdk.core.bly.qbp r0 = r0.yu()
            com.bytedance.sdk.openadsdk.core.bly.th r0 = (com.bytedance.sdk.openadsdk.core.bly.th) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.setTag(r2, r3)
            boolean r2 = r4.f14211jg
            if (r2 != 0) goto L36
            com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh r2 = r4.fkw
            r2.fkw()
        L36:
            r4.f14211jg = r1
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView r0 = r4.ouw(r0)
            goto L5b
        L3d:
            com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh r0 = r4.fkw
            if (r0 == 0) goto L5a
            com.bytedance.sdk.openadsdk.core.bly.qbp r0 = r0.yu()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.setTag(r2, r3)
            boolean r2 = r4.f14211jg
            if (r2 != 0) goto L53
            com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh r2 = r4.fkw
            r2.fkw()
        L53:
            r4.f14211jg = r1
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView r0 = r4.ouw(r0)
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L67
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r1)     // Catch: java.lang.Exception -> L67
            goto L67
        L63:
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView r0 = r4.le()
        L67:
            if (r0 == 0) goto L73
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r4.ouw
            java.lang.Integer r1 = com.bytedance.sdk.openadsdk.tc.vt.fkw.vt(r1)
            r0.setMrcTrackerKey(r1)
            goto L7a
        L73:
            com.bytedance.sdk.openadsdk.ouw.vt.ouw$1 r0 = new com.bytedance.sdk.openadsdk.ouw.vt.ouw$1
            android.content.Context r1 = r4.ryl
            r0.<init>(r1)
        L7a:
            boolean r1 = r0 instanceof com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView
            if (r1 == 0) goto L86
            r1 = r0
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView r1 = (com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView) r1
            com.bytedance.sdk.openadsdk.core.model.vpp r2 = r4.ouw
            r1.setMaterialMeta(r2)
        L86:
            r4.pno = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.ouw.vt.ouw.fkw():com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView le() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.ouw.vt.ouw.le():com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView");
    }

    public final String lh() {
        vpp vppVar = this.ouw;
        if (vppVar != null) {
            return !TextUtils.isEmpty(vppVar.fqk) ? vppVar.fqk : !TextUtils.isEmpty(vppVar.hun) ? vppVar.hun : "";
        }
        return null;
    }

    public final PAGImageItem ouw() {
        zih zihVar;
        vpp vppVar = this.ouw;
        if (vppVar == null || (zihVar = vppVar.fak) == null) {
            return null;
        }
        return new PAGImageItem(zihVar.f13812lh, zihVar.vt, zihVar.ouw, (float) zihVar.yu);
    }

    public final void ouw(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh lhVar;
        if (this.ouw.rn() == 2 && vpp.fkw(this.ouw) && (lhVar = this.fkw) != null && (lhVar instanceof com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt)) {
            th thVar = (th) lhVar.yu();
            if (thVar != null) {
                thVar.setVideoAdListener(vt(pAGVideoAdListener));
                return;
            }
            return;
        }
        vt vtVar = this.yu;
        if (vtVar != null) {
            vtVar.ouw = vt(pAGVideoAdListener);
        }
    }

    public final View pno() {
        vpp vppVar;
        if (com.bytedance.sdk.openadsdk.core.zih.ouw() == null || (vppVar = this.ouw) == null) {
            ko.fkw("TTNativeAdImpl", "getAdChoicesView mContext == null");
            return null;
        }
        if (!vppVar.cd() || !this.ouw.le()) {
            return null;
        }
        ImageView imageView = new ImageView(com.bytedance.sdk.openadsdk.core.zih.ouw());
        com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 14.0f, true), imageView, this.ouw);
        return imageView;
    }

    public final View ra() {
        if (com.bytedance.sdk.openadsdk.core.zih.ouw() == null) {
            ko.fkw("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(com.bytedance.sdk.openadsdk.core.zih.ouw()) { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.4
            public int ouw = 0;
            public int vt = 0;

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                super.onLayout(z10, i10, i11, i12, i13);
                try {
                    Object parent = getParent();
                    if (parent == null || this.ouw == 0 || this.vt == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i14 = this.ouw;
                    if (width < i14 || height < this.vt) {
                        float fMin = Math.min(height / this.vt, width / i14);
                        int i15 = (width - this.ouw) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i15);
                        }
                    }
                } catch (Throwable th2) {
                    ko.fkw("PAGExtraFuncationHelper", th2.getMessage());
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public final void onMeasure(int i10, int i11) {
                if (this.ouw == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i11);
                    this.ouw = getMeasuredWidth();
                    this.vt = this.containerHeight;
                }
                setMeasuredDimension(this.ouw, this.vt);
            }
        };
        pAGLogoView.initData(this.ouw);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/ouw/vt/ouw$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_ouw$5_onClick_955ea70f00b0edefe00e635d5617aab3(view);
            }

            public void safedk_ouw$5_onClick_955ea70f00b0edefe00e635d5617aab3(View view) {
                ouw.this.bly();
            }
        });
        return pAGLogoView;
    }

    public final String vt() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.f13802wp;
        return (leVar == null || TextUtils.isEmpty(leVar.vt)) ? !TextUtils.isEmpty(vppVar.f13798vh) ? vppVar.f13798vh : !TextUtils.isEmpty(vppVar.fqk) ? vppVar.fqk : "" : vppVar.f13802wp.vt;
    }

    public final String yu() {
        vpp vppVar = this.ouw;
        if (vppVar != null) {
            return vppVar.vpp();
        }
        return null;
    }
}
