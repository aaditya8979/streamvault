package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.bly.vm;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.model.zih;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.mwh;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.ryl;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class vt extends com.bytedance.sdk.openadsdk.core.bly.ouw {
    public static vm[] ouw = {new vm(1, 6.4f, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50), new vm(4, 1.2f, 300, 250)};

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private qbp f14124jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private String f14125ko;
    private ouw mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private PAGBannerAdWrapperListener f14126rn;

    public static class ouw {
        public rn fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public FrameLayout f14127le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public TextView f14128lh;
        public ryl ouw;
        public TextView pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public View f14129ra;
        public mwh vt;
        public ImageView yu;

        public ouw(View view, mwh mwhVar) {
            this.f14129ra = view;
            this.vt = mwhVar;
        }

        public ouw(ImageView imageView, View view, TextView textView, TextView textView2, mwh mwhVar, rn rnVar, FrameLayout frameLayout) {
            this.yu = imageView;
            this.f14129ra = view;
            this.pno = textView;
            this.f14128lh = textView2;
            this.vt = mwhVar;
            this.fkw = rnVar;
            this.f14127le = frameLayout;
        }

        public ouw(ImageView imageView, View view, TextView textView, TextView textView2, ryl rylVar, rn rnVar, FrameLayout frameLayout) {
            this.yu = imageView;
            this.f14129ra = view;
            this.pno = textView;
            this.f14128lh = textView2;
            this.ouw = rylVar;
            this.fkw = rnVar;
            this.f14127le = frameLayout;
        }

        public ouw(ImageView imageView, TextView textView, rn rnVar, View view, TextView textView2) {
            this.yu = imageView;
            this.f14128lh = textView;
            this.fkw = rnVar;
            this.f14129ra = view;
            this.pno = textView2;
        }
    }

    public vt(@NonNull Context context) {
        super(context);
        this.vt = context;
    }

    public static vm ouw(int i10, int i11) {
        try {
            return ((double) i11) >= Math.floor((((double) i10) * 450.0d) / 600.0d) ? ouw[1] : ouw[0];
        } catch (Throwable unused) {
            return ouw[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
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
    public final void ouw() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fkw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lh.lh lhVar = this.yu;
        if (lhVar != null) {
            lhVar.ouw();
        } else {
            TTDelegateActivity.ouw(this.f13427lh, this.f14125ko);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i10, ko koVar) {
        qbp qbpVar = this.f14124jg;
        if (qbpVar != null) {
            qbpVar.ouw(view, i10, koVar);
        }
    }

    public final void ouw(vpp vppVar, qbp qbpVar) {
        int i10;
        setBackgroundColor(-1);
        this.f13427lh = vppVar;
        this.f14124jg = qbpVar;
        this.f13426le = "banner_ad";
        qbpVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        vm vmVarOuw = ouw(this.f14124jg.getExpectExpressWidth(), this.f14124jg.getExpectExpressHeight());
        if (this.f14124jg.getExpectExpressWidth() <= 0 || this.f14124jg.getExpectExpressHeight() <= 0) {
            int iYu = osn.yu(this.vt);
            this.f13428ra = iYu;
            this.pno = Float.valueOf(iYu / vmVarOuw.vt).intValue();
        } else {
            this.f13428ra = osn.ouw(this.vt, this.f14124jg.getExpectExpressWidth());
            this.pno = osn.ouw(this.vt, this.f14124jg.getExpectExpressHeight());
        }
        int i11 = this.f13428ra;
        if (i11 > 0 && i11 > osn.yu(this.vt)) {
            this.f13428ra = osn.yu(this.vt);
            this.pno = Float.valueOf(this.pno * (osn.yu(this.vt) / this.f13428ra)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f13428ra, this.pno);
        }
        layoutParams.width = this.f13428ra;
        layoutParams.height = this.pno;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        vpp vppVar2 = this.f13427lh;
        if (vppVar2 != null) {
            int i12 = vppVar2.ucs;
            if (i12 == 1010 || i12 == 1011 || i12 == 1012) {
                int iOuw = osn.ouw(this.vt, 8.0f);
                mwh mwhVar = new mwh(this.vt);
                mwhVar.setId(520093736);
                mwhVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 17;
                addView(mwhVar, layoutParams2);
                View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f13427lh);
                viewCreatePAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(iOuw, iOuw, 0, 0);
                layoutParams3.gravity = BadgeDrawable.TOP_START;
                viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams3);
                addView(viewCreatePAGLogoViewByMaterial);
                ouw ouwVar = new ouw(viewCreatePAGLogoViewByMaterial, mwhVar);
                this.mwh = ouwVar;
                View view = ouwVar.f14129ra;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/vt$2;->onClick(Landroid/view/View;)V");
                            CreativeInfoManager.onViewClicked(g.f53147u, view2);
                            safedk_vt$2_onClick_e11edb3e6f3af2a45d70a19b8bddea3c(view2);
                        }

                        public void safedk_vt$2_onClick_e11edb3e6f3af2a45d70a19b8bddea3c(View view2) {
                            TTWebsiteActivity.ouw(vt.this.vt, vt.this.f13427lh, vt.this.f13426le);
                        }
                    });
                }
                mwh mwhVar2 = this.mwh.vt;
                if (mwhVar2 != null) {
                    List<zih> list = this.f13427lh.f13791tc;
                    if (list != null && !list.isEmpty()) {
                        com.bytedance.sdk.openadsdk.th.vt.ouw();
                        com.bytedance.sdk.openadsdk.th.vt.ouw(list.get(0), mwhVar2, this.f13427lh);
                    }
                    ouw((View) mwhVar2, true);
                    mwhVar2.setTag(520093762, Boolean.TRUE);
                    return;
                }
                return;
            }
            if (vmVarOuw.ouw == 1) {
                osn.ouw(this.vt, 50.0f);
                int iOuw2 = osn.ouw(this.vt, 38.0f);
                int iOuw3 = (int) (((double) osn.ouw(this.vt, 25.0f)) / 5.0d);
                int iOuw4 = osn.ouw(this.vt, 10.0f);
                int iOuw5 = osn.ouw(this.vt, 2.0f);
                int iOuw6 = osn.ouw(this.vt, 6.0f);
                int iOuw7 = osn.ouw(this.vt, 8.0f);
                RelativeLayout relativeLayout = new RelativeLayout(this.vt);
                addView(relativeLayout, -1, -1);
                com.bytedance.sdk.openadsdk.core.widget.zih zihVar = new com.bytedance.sdk.openadsdk.core.widget.zih(this.vt);
                zihVar.setId(520093738);
                TextView textView = new TextView(this.vt);
                textView.setId(520093730);
                rn rnVar = new rn(this.vt);
                rnVar.setId(520093735);
                View viewCreatePAGLogoViewByMaterial2 = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f13427lh);
                viewCreatePAGLogoViewByMaterial2.setId(520093739);
                TextView textView2 = new TextView(this.vt);
                textView2.setId(520093703);
                ouw ouwVar2 = new ouw(zihVar, textView, rnVar, viewCreatePAGLogoViewByMaterial2, textView2);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iOuw2, iOuw2);
                layoutParams4.addRule(15);
                layoutParams4.addRule(9);
                layoutParams4.addRule(20);
                layoutParams4.setMarginStart(iOuw6);
                layoutParams4.setMargins(iOuw6, 0, 0, 0);
                zihVar.setLayoutParams(layoutParams4);
                zihVar.setBackgroundColor(-1);
                zihVar.setScaleType(ImageView.ScaleType.FIT_XY);
                relativeLayout.addView(zihVar);
                LinearLayout linearLayout = new LinearLayout(this.vt);
                linearLayout.setOrientation(1);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.addRule(15);
                layoutParams5.addRule(16, textView2.getId());
                layoutParams5.addRule(17, zihVar.getId());
                layoutParams5.setMarginStart(iOuw7);
                layoutParams5.setMarginEnd(iOuw7);
                layoutParams5.addRule(0, textView2.getId());
                layoutParams5.addRule(1, zihVar.getId());
                layoutParams5.setMargins(iOuw7, 0, iOuw7, 0);
                relativeLayout.addView(linearLayout, layoutParams5);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                textView.setTextDirection(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(80);
                textView.setMaxLines(1);
                textView.setTextColor(Color.parseColor("#FF333333"));
                textView.setTextSize(12.0f);
                textView.setLayoutParams(layoutParams6);
                linearLayout.addView(textView);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams7.topMargin = iOuw5;
                rnVar.setLayoutParams(layoutParams7);
                linearLayout.addView(rnVar);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams8.addRule(20);
                layoutParams8.addRule(9);
                layoutParams8.addRule(12);
                viewCreatePAGLogoViewByMaterial2.setLayoutParams(layoutParams8);
                relativeLayout.addView(viewCreatePAGLogoViewByMaterial2);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams9.addRule(11);
                layoutParams9.addRule(15);
                layoutParams9.setMarginEnd(iOuw6);
                layoutParams9.addRule(21);
                layoutParams9.rightMargin = iOuw6;
                textView2.setBackground(cf.ouw(this.vt, 12));
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                textView2.setMaxLines(1);
                textView2.setPadding(iOuw4, iOuw3, iOuw4, iOuw3);
                textView2.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.vt, "tt_video_download_apk"));
                textView2.setTextColor(Color.parseColor("#f0f0f0"));
                textView2.setTextSize(10.0f);
                textView2.setLayoutParams(layoutParams9);
                relativeLayout.addView(textView2);
                this.mwh = ouwVar2;
                ImageView imageView = ouwVar2.yu;
                TextView textView3 = ouwVar2.f14128lh;
                rn rnVar2 = ouwVar2.fkw;
                TextView textView4 = ouwVar2.pno;
                View view2 = ouwVar2.f14129ra;
                if (view2 != null) {
                    view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/vt$1;->onClick(Landroid/view/View;)V");
                            CreativeInfoManager.onViewClicked(g.f53147u, view3);
                            safedk_vt$1_onClick_20cc8cdebdcc34ebba66ef956a316947(view3);
                        }

                        public void safedk_vt$1_onClick_20cc8cdebdcc34ebba66ef956a316947(View view3) {
                            TTWebsiteActivity.ouw(vt.this.vt, vt.this.f13427lh, vt.this.f13426le);
                        }
                    });
                }
                zih zihVar2 = this.f13427lh.fak;
                if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
                    com.bytedance.sdk.openadsdk.th.vt.ouw();
                    vpp vppVar3 = this.f13427lh;
                    zih zihVar3 = vppVar3.fak;
                    com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar3.ouw, zihVar3.vt, zihVar3.f13812lh, imageView, vppVar3);
                }
                textView3.setText(this.f13427lh.fqk);
                if (TextUtils.isEmpty(this.f13427lh.vpp())) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setText(this.f13427lh.vpp());
                }
                osn.ouw((TextView) null, rnVar2, this.f13427lh);
                ouw((View) imageView, true);
                imageView.setTag(520093762, Boolean.TRUE);
                ouw((View) this, true);
                ouw((View) textView4, true);
                return;
            }
            if (vppVar2 != null) {
                if (vppVar2.f13788sd == null) {
                    int iOuw8 = osn.ouw(this.vt, 8.0f);
                    int iOuw9 = osn.ouw(this.vt, 21.0f);
                    RelativeLayout relativeLayout2 = new RelativeLayout(this.vt);
                    ViewGroup.LayoutParams layoutParams10 = new ViewGroup.LayoutParams(-1, -1);
                    relativeLayout2.setPadding(iOuw8, iOuw8, iOuw8, iOuw9);
                    relativeLayout2.setLayoutParams(layoutParams10);
                    addView(relativeLayout2);
                    LinearLayout linearLayout2 = new LinearLayout(this.vt);
                    linearLayout2.setId(520093737);
                    RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams11.addRule(12);
                    linearLayout2.setGravity(16);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setLayoutParams(layoutParams11);
                    relativeLayout2.addView(linearLayout2);
                    com.bytedance.sdk.openadsdk.core.widget.zih zihVar4 = new com.bytedance.sdk.openadsdk.core.widget.zih(this.vt);
                    zihVar4.setId(520093738);
                    LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 52.0f), osn.ouw(this.vt, 52.0f));
                    zihVar4.setScaleType(ImageView.ScaleType.FIT_XY);
                    zihVar4.setLayoutParams(layoutParams12);
                    linearLayout2.addView(zihVar4);
                    LinearLayout linearLayout3 = new LinearLayout(this.vt);
                    linearLayout3.setOrientation(1);
                    LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(0, -2);
                    layoutParams13.weight = 1.0f;
                    layoutParams13.leftMargin = iOuw8;
                    layoutParams13.rightMargin = iOuw8;
                    layoutParams13.setMarginStart(iOuw8);
                    layoutParams13.setMarginEnd(iOuw8);
                    linearLayout2.addView(linearLayout3, layoutParams13);
                    TextView textView5 = new TextView(this.vt);
                    textView5.setId(520093730);
                    LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                    textView5.setEllipsize(TextUtils.TruncateAt.END);
                    textView5.setMaxLines(1);
                    textView5.setTextColor(Color.parseColor("#FF3E3E3E"));
                    textView5.setTextSize(16.0f);
                    textView5.setLayoutParams(layoutParams14);
                    linearLayout3.addView(textView5);
                    rn rnVar3 = new rn(this.vt);
                    rnVar3.setId(520093735);
                    linearLayout3.addView(rnVar3, new LinearLayout.LayoutParams(-2, -2));
                    TextView textView6 = new TextView(this.vt);
                    textView6.setId(520093703);
                    LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 76.0f), osn.ouw(this.vt, 36.0f));
                    textView6.setBackground(cf.ouw(this.vt, 18));
                    textView6.setEllipsize(TextUtils.TruncateAt.END);
                    textView6.setMaxLines(1);
                    textView6.setGravity(17);
                    textView6.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.vt, "tt_video_download_apk"));
                    textView6.setTextColor(-1);
                    textView6.setTextSize(14.0f);
                    textView6.setLayoutParams(layoutParams15);
                    linearLayout2.addView(textView6);
                    FrameLayout frameLayout = new FrameLayout(this.vt);
                    frameLayout.setLayoutDirection(3);
                    RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams16.addRule(2, linearLayout2.getId());
                    layoutParams16.bottomMargin = iOuw9;
                    frameLayout.setLayoutParams(layoutParams16);
                    relativeLayout2.addView(frameLayout);
                    mwh mwhVar3 = new mwh(this.vt);
                    mwhVar3.setId(520093736);
                    mwhVar3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams17.gravity = 17;
                    frameLayout.addView(mwhVar3, layoutParams17);
                    View viewCreatePAGLogoViewByMaterial3 = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f13427lh);
                    viewCreatePAGLogoViewByMaterial3.setId(520093739);
                    RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams18.addRule(10);
                    layoutParams18.addRule(9);
                    layoutParams18.setMargins(iOuw8, iOuw8, 0, 0);
                    viewCreatePAGLogoViewByMaterial3.setLayoutParams(layoutParams18);
                    relativeLayout2.addView(viewCreatePAGLogoViewByMaterial3);
                    ouw ouwVar3 = new ouw(zihVar4, viewCreatePAGLogoViewByMaterial3, textView6, textView5, mwhVar3, rnVar3, frameLayout);
                    this.mwh = ouwVar3;
                    mwh mwhVar4 = ouwVar3.vt;
                    ImageView imageView2 = ouwVar3.yu;
                    TextView textView7 = ouwVar3.f14128lh;
                    TextView textView8 = ouwVar3.pno;
                    View view3 = ouwVar3.f14129ra;
                    if (view3 != null) {
                        view3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/vt$3;->onClick(Landroid/view/View;)V");
                                CreativeInfoManager.onViewClicked(g.f53147u, view4);
                                safedk_vt$3_onClick_5885843289bfc67f88717d441ed85de0(view4);
                            }

                            public void safedk_vt$3_onClick_5885843289bfc67f88717d441ed85de0(View view4) {
                                TTWebsiteActivity.ouw(vt.this.vt, vt.this.f13427lh, vt.this.f13426le);
                            }
                        });
                    }
                    ViewGroup.LayoutParams layoutParams19 = mwhVar4.getLayoutParams();
                    if (this.f13428ra - (osn.ouw(this.vt, 8.0f) * 2) >= ((this.pno - osn.ouw(this.vt, 8.0f)) - (osn.ouw(this.vt, 21.0f) * 2)) - osn.ouw(this.vt, 52.0f)) {
                        layoutParams19.width = -2;
                        layoutParams19.height = -1;
                    } else {
                        layoutParams19.width = -1;
                        layoutParams19.height = -2;
                    }
                    mwhVar4.setLayoutParams(layoutParams19);
                    if (i12 == 33) {
                        mwhVar4.setRatio(1.0f);
                    } else {
                        mwhVar4.setRatio(1.91f);
                    }
                    List<zih> list2 = this.f13427lh.f13791tc;
                    if (list2 != null && !list2.isEmpty()) {
                        com.bytedance.sdk.openadsdk.th.vt.ouw();
                        com.bytedance.sdk.openadsdk.th.vt.ouw(list2.get(0), mwhVar4, this.f13427lh);
                        com.bytedance.sdk.openadsdk.th.vt.ouw().ouw(list2.get(0).ouw, this.mwh.f14127le);
                    }
                    zih zihVar5 = this.f13427lh.fak;
                    if (zihVar5 != null && !TextUtils.isEmpty(zihVar5.ouw)) {
                        com.bytedance.sdk.openadsdk.th.vt.ouw();
                        vpp vppVar4 = this.f13427lh;
                        zih zihVar6 = vppVar4.fak;
                        com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar6.ouw, zihVar6.vt, zihVar6.f13812lh, imageView2, vppVar4);
                    }
                    textView7.setText(this.f13427lh.fqk);
                    if (TextUtils.isEmpty(this.f13427lh.vpp())) {
                        textView8.setVisibility(8);
                    } else {
                        textView8.setText(this.f13427lh.vpp());
                    }
                    osn.ouw((TextView) null, this.mwh.fkw, this.f13427lh);
                    ouw((View) mwhVar4, true);
                    mwhVar4.setTag(520093762, Boolean.TRUE);
                    ouw((View) this, true);
                    ouw((View) textView8, true);
                    return;
                }
                int iOuw10 = osn.ouw(this.vt, 8.0f);
                int iOuw11 = osn.ouw(this.vt, 21.0f);
                RelativeLayout relativeLayout3 = new RelativeLayout(this.vt);
                ViewGroup.LayoutParams layoutParams20 = new ViewGroup.LayoutParams(-1, -1);
                relativeLayout3.setPadding(iOuw10, iOuw10, iOuw10, iOuw11);
                relativeLayout3.setLayoutParams(layoutParams20);
                addView(relativeLayout3);
                LinearLayout linearLayout4 = new LinearLayout(this.vt);
                linearLayout4.setId(520093737);
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams21.addRule(12);
                linearLayout4.setGravity(16);
                linearLayout4.setOrientation(0);
                linearLayout4.setLayoutParams(layoutParams21);
                relativeLayout3.addView(linearLayout4);
                com.bytedance.sdk.openadsdk.core.widget.zih zihVar7 = new com.bytedance.sdk.openadsdk.core.widget.zih(this.vt);
                zihVar7.setId(520093738);
                LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 52.0f), osn.ouw(this.vt, 52.0f));
                zihVar7.setScaleType(ImageView.ScaleType.FIT_XY);
                zihVar7.setLayoutParams(layoutParams22);
                linearLayout4.addView(zihVar7);
                LinearLayout linearLayout5 = new LinearLayout(this.vt);
                linearLayout5.setOrientation(1);
                LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(0, -2);
                layoutParams23.weight = 1.0f;
                layoutParams23.leftMargin = iOuw10;
                layoutParams23.rightMargin = iOuw10;
                layoutParams23.setMarginStart(iOuw10);
                layoutParams23.setMarginEnd(iOuw10);
                linearLayout4.addView(linearLayout5, layoutParams23);
                TextView textView9 = new TextView(this.vt);
                textView9.setId(520093730);
                LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-1, -2);
                textView9.setEllipsize(TextUtils.TruncateAt.END);
                textView9.setMaxLines(1);
                textView9.setTextColor(Color.parseColor("#FF3E3E3E"));
                textView9.setTextSize(16.0f);
                textView9.setLayoutParams(layoutParams24);
                linearLayout5.addView(textView9);
                rn rnVar4 = new rn(this.vt);
                rnVar4.setId(520093735);
                LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams25.topMargin = osn.ouw(this.vt, 4.0f);
                linearLayout5.addView(rnVar4, layoutParams25);
                TextView textView10 = new TextView(this.vt);
                textView10.setId(520093703);
                LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 76.0f), osn.ouw(this.vt, 36.0f));
                textView10.setBackground(cf.ouw(this.vt, 18));
                textView10.setEllipsize(TextUtils.TruncateAt.END);
                textView10.setMaxLines(1);
                textView10.setGravity(17);
                textView10.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.vt, "tt_video_download_apk"));
                textView10.setTextColor(-1);
                textView10.setTextSize(14.0f);
                textView10.setLayoutParams(layoutParams26);
                linearLayout4.addView(textView10);
                FrameLayout frameLayout2 = new FrameLayout(this.vt);
                RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams27.addRule(2, linearLayout4.getId());
                layoutParams27.bottomMargin = iOuw11;
                frameLayout2.setLayoutParams(layoutParams27);
                relativeLayout3.addView(frameLayout2);
                ryl rylVar = new ryl(this.vt);
                rylVar.setId(520093736);
                FrameLayout.LayoutParams layoutParams28 = new FrameLayout.LayoutParams(-2, -1);
                layoutParams28.gravity = 17;
                rylVar.setLayoutParams(layoutParams28);
                frameLayout2.addView(rylVar);
                View viewCreatePAGLogoViewByMaterial4 = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f13427lh);
                viewCreatePAGLogoViewByMaterial4.setId(520093739);
                RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams29.addRule(10);
                layoutParams29.addRule(9);
                layoutParams29.setMargins(iOuw10, iOuw10, 0, 0);
                viewCreatePAGLogoViewByMaterial4.setLayoutParams(layoutParams29);
                relativeLayout3.addView(viewCreatePAGLogoViewByMaterial4);
                ouw ouwVar4 = new ouw(zihVar7, viewCreatePAGLogoViewByMaterial4, textView10, textView9, rylVar, rnVar4, frameLayout2);
                this.mwh = ouwVar4;
                TextView textView11 = ouwVar4.f14128lh;
                TextView textView12 = ouwVar4.pno;
                ryl rylVar2 = ouwVar4.ouw;
                com.bytedance.sdk.openadsdk.th.vt.ouw().ouw(this.f13427lh.f13788sd.f11283le, this.mwh.f14127le);
                View view4 = this.mwh.f14129ra;
                if (view4 != null) {
                    view4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/yu/vt$4;->onClick(Landroid/view/View;)V");
                            CreativeInfoManager.onViewClicked(g.f53147u, view5);
                            safedk_vt$4_onClick_9e646295613331d03bb844503eef4bd7(view5);
                        }

                        public void safedk_vt$4_onClick_9e646295613331d03bb844503eef4bd7(View view5) {
                            TTWebsiteActivity.ouw(vt.this.vt, vt.this.f13427lh, vt.this.f13426le);
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams30 = rylVar2.getLayoutParams();
                if (i12 == 15) {
                    layoutParams30.width = -2;
                    layoutParams30.height = -1;
                    rylVar2.setLayoutParams(layoutParams30);
                    rylVar2.setRatio(0.5625f);
                    i10 = -1;
                } else if (i12 == 5) {
                    layoutParams30.width = -1;
                    layoutParams30.height = -2;
                    rylVar2.setLayoutParams(layoutParams30);
                    rylVar2.setRatio(1.7777778f);
                    i10 = -1;
                } else {
                    if (this.f13428ra - (osn.ouw(this.vt, 8.0f) * 2) >= ((this.pno - osn.ouw(this.vt, 8.0f)) - (osn.ouw(this.vt, 21.0f) * 2)) - osn.ouw(this.vt, 52.0f)) {
                        layoutParams30.width = -2;
                        i10 = -1;
                        layoutParams30.height = -1;
                    } else {
                        i10 = -1;
                        layoutParams30.width = -1;
                        layoutParams30.height = -2;
                    }
                    rylVar2.setLayoutParams(layoutParams30);
                    rylVar2.setRatio(1.0f);
                }
                rylVar2.removeAllViews();
                FrameLayout.LayoutParams layoutParams31 = new FrameLayout.LayoutParams(i10, i10);
                com.bytedance.sdk.openadsdk.core.mwh.vt.le videoView = getVideoView();
                if (videoView != null) {
                    if (this.f14124jg instanceof th) {
                        videoView.setNeedSelfManagerVideo(!((th) r6).tlj);
                        ((th) this.f14124jg).setBackupVideoView(videoView);
                        videoView.setVideoAdInteractionListener((th) this.f14124jg);
                    }
                    rylVar2.addView(videoView, layoutParams31);
                    videoView.setAdCreativeClickListener(new le.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.vt.5
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
                        public final void ouw(View view5, int i13) {
                            if (vt.this.f14126rn != null) {
                                vt.this.f14126rn.onAdClicked();
                            }
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.bly.pno clickCreativeListener = this.f14124jg.getClickCreativeListener();
                    if (clickCreativeListener != null) {
                        clickCreativeListener.ouw(videoView.getNativeVideoController());
                    }
                }
                zih zihVar8 = this.f13427lh.fak;
                if (zihVar8 != null && !TextUtils.isEmpty(zihVar8.ouw)) {
                    com.bytedance.sdk.openadsdk.th.vt.ouw();
                    vpp vppVar5 = this.f13427lh;
                    zih zihVar9 = vppVar5.fak;
                    com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar9.ouw, zihVar9.vt, zihVar9.f13812lh, this.mwh.yu, vppVar5);
                }
                textView11.setText(this.f13427lh.fqk);
                osn.ouw((TextView) null, this.mwh.fkw, this.f13427lh);
                if (TextUtils.isEmpty(this.f13427lh.vpp())) {
                    textView12.setVisibility(8);
                } else {
                    textView12.setText(this.f13427lh.vpp());
                }
                ouw((View) videoView, true);
                if (videoView != null) {
                    videoView.setTag(520093762, Boolean.TRUE);
                }
                ouw((View) this, true);
                ouw((View) textView12, true);
                ouw(rylVar2);
            }
        }
    }

    public final void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f14126rn = pAGBannerAdWrapperListener;
    }

    public final void setClosedListenerKey(String str) {
        this.f14125ko = str;
    }
}
