package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class lh extends com.bytedance.sdk.openadsdk.core.bly.ouw {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f13348jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private int f13349ko;
    private boolean mwh;
    private float ouw;
    private com.bytedance.sdk.openadsdk.core.lh.fkw qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private int f13350rn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private FrameLayout f13351th;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private View f13352vm;
    private View zih;

    public lh(@NonNull Context context, String str) {
        super(context, str);
        this.f13350rn = 1;
        this.vt = context;
    }

    private float getHeightDp() {
        return osn.vt(this.vt, osn.mwh(this.vt));
    }

    private float getWidthDp() {
        return osn.vt(this.vt, osn.jg(this.vt));
    }

    private void lh() {
        this.f13351th = (FrameLayout) this.zih.findViewById(rn.lgp);
        ImageView imageView = (ImageView) this.zih.findViewById(rn.zrz);
        zih zihVar = (zih) this.zih.findViewById(rn.kfa);
        TextView textView = (TextView) this.zih.findViewById(rn.yiz);
        TextView textView2 = (TextView) this.zih.findViewById(rn.yw);
        View viewFindViewById = this.zih.findViewById(520093739);
        if (!TextUtils.isEmpty(this.f13427lh.vpp())) {
            textView2.setText(this.f13427lh.vpp());
        }
        ouw(this.f13351th, imageView);
        com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = this.f13427lh.fak;
        if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.f13427lh;
            com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = vppVar.fak;
            com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar3.ouw, zihVar3.vt, zihVar3.f13812lh, zihVar, vppVar);
        }
        textView.setText(getTitle());
        lh(this.f13351th);
        lh(imageView);
        lh(zihVar);
        lh(textView);
        lh(textView2);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.f13427lh);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lh.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/lh$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_lh$1_onClick_ca4b1e5bce5314cffc878286c98f1ec4(view);
            }

            public void safedk_lh$1_onClick_ca4b1e5bce5314cffc878286c98f1ec4(View view) {
                try {
                    TTWebsiteActivity.ouw(lh.this.vt, lh.this.f13427lh, lh.this.f13426le);
                } catch (Throwable th2) {
                    qbp.lh("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void lh(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.qbp;
        if (ouwVar == null) {
            Context context = this.vt;
            vpp vppVar = this.f13427lh;
            String str = this.f13426le;
            ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(context, vppVar, str, uoy.ouw(str));
            ouwVar.ouw(ouw(this.f13427lh, this.vt));
        }
        view.setOnTouchListener(ouwVar);
        view.setOnClickListener(ouwVar);
    }

    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh ouw(vpp vppVar, Context context) {
        if (vppVar != null && vppVar.f13782pd == 4) {
            return new com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt(context, this.f13426le);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(float r11) {
        /*
            r10 = this;
            float r0 = r10.getHeightDp()
            float r1 = r10.getWidthDp()
            int r2 = r10.f13350rn
            r3 = 2
            if (r2 != r3) goto L16
            float r2 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.min(r0, r1)
            goto L1e
        L16:
            float r2 = java.lang.Math.min(r0, r1)
            float r0 = java.lang.Math.max(r0, r1)
        L1e:
            int r1 = r10.f13350rn
            if (r1 == r3) goto L38
            android.content.Context r1 = r10.vt
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = com.bytedance.sdk.openadsdk.utils.osn.lh(r1)
            if (r1 == 0) goto L38
            android.content.Context r1 = r10.vt
            float r4 = com.bytedance.sdk.openadsdk.utils.osn.ouw()
            int r1 = com.bytedance.sdk.openadsdk.utils.osn.vt(r1, r4)
            float r1 = (float) r1
            float r0 = r0 - r1
        L38:
            int r1 = r10.f13350rn
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = 1101004800(0x41a00000, float:20.0)
            r7 = 20
            r8 = 0
            r9 = 0
            if (r1 == r3) goto L5c
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 == 0) goto L72
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L72
            float r2 = r2 - r6
            float r2 = r2 - r6
            float r2 = r2 / r11
            float r0 = r0 - r2
            float r0 = r0 / r4
            float r11 = java.lang.Math.max(r0, r8)
            int r11 = (int) r11
            r0 = r7
            r9 = r0
            r7 = r11
            goto L75
        L5c:
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 == 0) goto L72
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L72
            float r0 = r0 - r6
            float r0 = r0 - r6
            float r0 = r0 * r11
            float r2 = r2 - r0
            float r2 = r2 / r4
            float r11 = java.lang.Math.max(r2, r8)
            int r11 = (int) r11
            r0 = r11
            r9 = r0
            r11 = r7
            goto L75
        L72:
            r11 = r9
            r0 = r11
            r7 = r0
        L75:
            android.content.Context r1 = r10.vt
            float r2 = (float) r7
            int r1 = com.bytedance.sdk.openadsdk.utils.osn.ouw(r1, r2)
            android.content.Context r2 = r10.vt
            float r11 = (float) r11
            int r11 = com.bytedance.sdk.openadsdk.utils.osn.ouw(r2, r11)
            android.content.Context r2 = r10.vt
            float r3 = (float) r9
            int r2 = com.bytedance.sdk.openadsdk.utils.osn.ouw(r2, r3)
            android.content.Context r3 = r10.vt
            float r0 = (float) r0
            int r0 = com.bytedance.sdk.openadsdk.utils.osn.ouw(r3, r0)
            android.content.Context r3 = r10.vt
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.setPadding(r2, r1, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.view.lh.ouw(float):void");
    }

    private void ouw(FrameLayout frameLayout, ImageView imageView) {
        vpp vppVar = this.f13427lh;
        if (vppVar == null) {
            return;
        }
        boolean zFkw = vpp.fkw(vppVar);
        if (this.f13427lh.f13788sd != null && zFkw) {
            osn.ouw((View) imageView, 8);
            osn.ouw((View) frameLayout, 0);
        } else {
            ouw(imageView);
            osn.ouw((View) imageView, 0);
            osn.ouw((View) frameLayout, 8);
        }
    }

    private void ouw(ImageView imageView) {
        List<com.bytedance.sdk.openadsdk.core.model.zih> list;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        vpp vppVar = this.f13427lh;
        if (vppVar == null || (list = vppVar.f13791tc) == null || list.size() <= 0 || (zihVar = list.get(0)) == null) {
            return;
        }
        yu.ouw.ouw(yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f13812lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar.f13811le)).lh(1).vt(com.bytedance.sdk.openadsdk.tlj.lh.ouw(this.f13427lh, zihVar.ouw, imageView));
    }

    private void vt() {
        com.bytedance.sdk.openadsdk.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.ko.ouw(this.vt);
        this.zih = ouwVar;
        vt(ouwVar);
        lh();
        yu();
    }

    private void vt(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void yu() {
        TextView textView = (TextView) this.zih.findViewById(rn.ixm);
        if (textView != null) {
            textView.setText(getDescription());
            lh(textView);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final View getInteractionStyleRootView() {
        return this;
    }

    public final FrameLayout getVideoContainer() {
        return this.f13351th;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i10, ko koVar) {
    }

    public final void ouw(vpp vppVar, float f10, int i10, int i11, int i12) {
        this.ouw = f10;
        this.f13350rn = i10;
        this.f13427lh = vppVar;
        this.f13426le = "fullscreen_interstitial_ad";
        this.f13348jg = i11;
        this.f13349ko = i12;
        ouw(this.bly);
        this.f13428ra = osn.ouw(this.vt, this.f13348jg);
        this.pno = osn.ouw(this.vt, this.f13349ko);
        int i13 = (int) (this.ouw * 1000.0f);
        if (this.f13350rn != 1) {
            if (i13 == 562) {
                View leVar = new com.bytedance.sdk.openadsdk.ko.le(this.vt);
                this.zih = leVar;
                vt(leVar);
                lh();
                yu();
                return;
            }
            if (i13 == 666) {
                View vtVar = new com.bytedance.sdk.openadsdk.ko.vt(this.vt);
                this.zih = vtVar;
                vt(vtVar);
                lh();
                yu();
                return;
            }
            if (i13 == 1000) {
                vt();
                return;
            }
            if (i13 == 1500) {
                View yuVar = new com.bytedance.sdk.openadsdk.ko.yu(this.vt);
                this.zih = yuVar;
                vt(yuVar);
                lh();
                return;
            }
            ouw(1.777f);
            View pnoVar = new com.bytedance.sdk.openadsdk.ko.pno(this.vt);
            this.zih = pnoVar;
            vt(pnoVar);
            lh();
            return;
        }
        if (i13 == 666) {
            View lhVar = new com.bytedance.sdk.openadsdk.ko.lh(this.vt);
            this.zih = lhVar;
            vt(lhVar);
            lh();
            yu();
            return;
        }
        if (i13 == 1000) {
            vt();
            return;
        }
        if (i13 != 1500) {
            if (i13 != 1777) {
                ouw(0.562f);
                View raVar = new com.bytedance.sdk.openadsdk.ko.ra(this.vt);
                this.zih = raVar;
                vt(raVar);
                lh();
                return;
            }
            View blyVar = new com.bytedance.sdk.openadsdk.ko.bly(this.vt);
            this.zih = blyVar;
            vt(blyVar);
            lh();
            yu();
            return;
        }
        View fkwVar = new com.bytedance.sdk.openadsdk.ko.fkw(this.vt);
        this.zih = fkwVar;
        vt(fkwVar);
        this.f13351th = (FrameLayout) this.zih.findViewById(rn.lgp);
        ImageView imageView = (ImageView) this.zih.findViewById(rn.eay);
        TextView textView = (TextView) this.zih.findViewById(rn.wbf);
        View viewFindViewById = this.zih.findViewById(520093739);
        ouw(this.f13351th, imageView);
        textView.setText(getDescription());
        lh(this.f13351th);
        lh(imageView);
        lh(textView);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.f13427lh);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lh.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/lh$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_lh$2_onClick_faa41e11f59d1567e8115a46343f485b(view);
            }

            public void safedk_lh$2_onClick_faa41e11f59d1567e8115a46343f485b(View view) {
                try {
                    TTWebsiteActivity.ouw(lh.this.vt, lh.this.f13427lh, lh.this.f13426le);
                } catch (Throwable th2) {
                    qbp.lh("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    public final void setDownloadListener(com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar) {
        this.qbp = fkwVar;
    }

    public final void setIsMute(boolean z10) {
        this.mwh = z10;
        View view = this.f13352vm;
        if (view != null && (view instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.le)) {
            ((com.bytedance.sdk.openadsdk.core.mwh.vt.le) view).ouw(z10, "interactionStyle");
        }
    }
}
