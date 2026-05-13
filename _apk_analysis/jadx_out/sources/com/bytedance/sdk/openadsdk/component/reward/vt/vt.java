package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.common.zin;
import com.bytedance.sdk.openadsdk.component.reward.ouw.bly;
import com.bytedance.sdk.openadsdk.component.reward.ouw.rn;
import com.bytedance.sdk.openadsdk.component.reward.ouw.tlj;
import com.bytedance.sdk.openadsdk.component.reward.ouw.zih;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.lh.ouw;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.model.zih;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cf;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jg;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.yu.ryl;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vt extends com.bytedance.sdk.openadsdk.component.reward.vt.ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f13381cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public LinearLayout f13382jg;
    public com.bytedance.sdk.openadsdk.core.widget.vt mwh;
    public com.bytedance.sdk.openadsdk.core.lh.fkw ryl;

    public interface ouw {
        void ouw(boolean z10);
    }

    public vt(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    public static FrameLayout ouw(Context context) {
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar.setId(rn.f14339cf);
        lhVar.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        lhVar.setLayoutParams(layoutParams);
        return lhVar;
    }

    private void ouw(int i10) {
        this.fkw.tlj();
        ouw(false, true, false, i10);
        if (this.ouw.yu) {
            this.bly.jvy();
        }
    }

    public static void ouw(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        final com.bytedance.sdk.openadsdk.core.le.yu yuVar;
        Context context = frameLayout.getContext();
        if (ouwVar.lvd) {
            com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
            lhVar.setId(rn.tlj);
            frameLayout.addView(lhVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutOuw = ouw(context);
            String str = "";
            if (vpp.fkw(ouwVar.vt)) {
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = ouwVar.vt.f13788sd;
                if (vtVar != null) {
                    str = vtVar.f11283le;
                }
            } else {
                List<zih> list = ouwVar.vt.f13791tc;
                if (list != null && !list.isEmpty()) {
                    str = list.get(0).ouw;
                }
            }
            if (TextUtils.isEmpty(str)) {
                yuVar = null;
            } else {
                yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
                int i10 = rn.bu;
                yuVar.setId(i10);
                yuVar.setTag(i10, str);
                yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutOuw.addView(yuVar);
            }
            lhVar.addView(frameLayoutOuw);
            lhVar.addView(new cf(context), new FrameLayout.LayoutParams(-1, -1));
            View fkwVar = new com.bytedance.sdk.openadsdk.component.reward.view.fkw(context);
            fkwVar.setId(rn.ryl);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(fkwVar, layoutParams);
            fkwVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.vt.3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = ouwVar.rrs.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = ouwVar.rrs.findViewById(rn.f14354lk);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = ouwVar.rrs.findViewById(rn.elx);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = yuVar;
                    if (yuVar2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = yuVar2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            yuVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
            fkwVar2.setId(rn.mwh);
            fkwVar2.setOrientation(1);
            fkwVar2.setVisibility(8);
            frameLayout.addView(fkwVar2, new FrameLayout.LayoutParams(-1, -1));
        }
        if (ouwVar.lso) {
            View leVar = new com.bytedance.sdk.component.bly.le(context, true, le.lh.ENDCARD);
            leVar.setId(rn.f14346jg);
            leVar.setLayerType(2, null);
            leVar.setVisibility(4);
            if (ouwVar.npr || !th.le(ouwVar.vt)) {
                frameLayout.addView(leVar, new FrameLayout.LayoutParams(-1, -1));
            } else {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = osn.ouw(ouwVar.hun, 58.0f);
                frameLayout.addView(leVar, layoutParams2);
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(rn.f14350ko);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (od.vt(ouwVar.vt)) {
                View lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
                lhVar2.setId(rn.ybr);
                lhVar2.setVisibility(4);
                frameLayout.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public final View bly() {
        View viewCreatePAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this.ouw.jvy);
        lhVar.setId(rn.amr);
        View viewVt = com.bytedance.sdk.openadsdk.core.widget.le.vt(this.ouw.jvy);
        viewVt.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        layoutParams.topMargin = osn.ouw(this.ouw.jvy, 20.0f);
        layoutParams.rightMargin = osn.ouw(this.ouw.jvy, 16.0f);
        viewVt.setLayoutParams(layoutParams);
        viewVt.setContentDescription(com.bytedance.sdk.component.utils.vpp.ouw(this.ouw.jvy, "tt_ad_close_text"));
        viewVt.setVisibility(8);
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.ouw.f13261gh;
        if (pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(ouwVar.jvy, ouwVar.vt);
            viewCreatePAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, osn.ouw(this.ouw.jvy, 14.0f));
            layoutParams2.gravity = BadgeDrawable.BOTTOM_START;
            viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            viewCreatePAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(this.ouw.jvy);
        yuVar.setId(rn.f14354lk);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(osn.ouw(this.ouw.jvy, 32.0f), osn.ouw(this.ouw.jvy, 14.0f));
        layoutParams3.gravity = BadgeDrawable.BOTTOM_END;
        yuVar.setLayoutParams(layoutParams3);
        yuVar.setPadding(osn.ouw(this.ouw.jvy, 9.0f), 0, osn.ouw(this.ouw.jvy, 9.0f), 0);
        yuVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (viewCreatePAGLogoViewByMaterial != null) {
            lhVar.addView(viewCreatePAGLogoViewByMaterial);
        }
        lhVar.addView(yuVar);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
        if (!ouwVar2.vt.tpk || !ouwVar2.euf || ouwVar2.ouw != 1) {
            View lhVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.lh(this.ouw.jvy);
            lhVar2.setId(rn.uz);
            lhVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            lhVar.addView(lhVar2);
        }
        lhVar.addView(viewVt);
        return lhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cf() {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.cf():void");
    }

    public abstract boolean fkw();

    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (!ouwVar.f13271ra && ouwVar.vt()) {
            this.ouw.uoy.yu();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.euf && (ouwVar2.f13261gh instanceof com.bytedance.sdk.openadsdk.activity.ouw)) {
                return;
            }
            ouwVar2.ey.le(0);
        }
    }

    public final void jqy() {
        com.bytedance.sdk.openadsdk.core.lh.ra raVar;
        com.bytedance.sdk.component.bly.le leVar;
        lh();
        if (!this.ouw.vt.cd() && !this.ouw.jvy.isFinishing()) {
            this.ouw.f13257bs.yu();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            String str = ouwVar.yu ? "reward_endcard" : "fullscreen_endcard";
            ouwVar.f13257bs.ouw(str, ouwVar.fqk);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.odc) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar = ouwVar2.ksc;
                boolean z10 = ouwVar2.f13260cj;
                bly blyVar = pnoVar.ouw;
                if (blyVar != null) {
                    blyVar.vt(z10);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.ouw;
            final com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = ouwVar3.f13257bs;
            final com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = ouwVar3.fqk;
            final rn.yu yuVar = new rn.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.5
                @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.rn.yu
                public final void ouw() {
                    if (rn.this.f13305uq.jvy.isFinishing()) {
                        return;
                    }
                    rn.this.ryl.get();
                }

                @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.rn.yu
                public final void ouw(WebView webView, int i10) {
                    com.bytedance.sdk.openadsdk.common.jg jgVar;
                    try {
                        rn rnVar2 = rn.this;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = rnVar2.f13305uq;
                        if (!ouwVar4.f13271ra || (jgVar = ouwVar4.f13268ng) == null) {
                            return;
                        }
                        le.ouw ouwVar5 = rnVar2.f13308wp;
                        zin zinVar = jgVar.yu;
                        if (zinVar != null) {
                            if (i10 == 100) {
                                zinVar.fkw.setVisibility(8);
                            } else {
                                zinVar.fkw.setVisibility(0);
                                zinVar.fkw.setProgress(i10);
                            }
                        }
                        com.bytedance.sdk.openadsdk.common.th thVar = jgVar.fkw;
                        if (thVar != null) {
                            thVar.ouw(webView, ouwVar5);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            final vpp vppVar = rnVar.f13305uq.vt;
            com.bytedance.sdk.component.bly.le leVar2 = rnVar.f13296le;
            if (leVar2 != null && leVar2.getWebView() != null) {
                mwh mwhVar = new mwh(vppVar, rnVar.f13296le.getWebView(), new ryl() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.11
                    @Override // com.bytedance.sdk.openadsdk.yu.ryl
                    public final void ouw(int i10) {
                        if (TextUtils.isEmpty(rn.this.hun)) {
                            return;
                        }
                        rn rnVar2 = rn.this;
                        lh.ouw.ouw(rnVar2.jvy, rnVar2.rrs, rn.this.f13304ub, rn.this.lso - rn.this.f13304ub, vppVar, "landingpage_endcard", i10);
                    }
                }, rnVar.fqk);
                mwhVar.jae = true;
                rnVar.tlj = mwhVar;
                rnVar.f13308wp = mwhVar.ryl;
                mwhVar.ouw(rnVar.ra() ? "landingpage_endcard" : str);
                mwh mwhVar2 = rnVar.tlj;
                String str2 = rnVar.ouw;
                if (!TextUtils.isEmpty(str2)) {
                    mwhVar2.ey = str2;
                }
                rnVar.tlj.f14467cd = true;
                rnVar.f13296le.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.12
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                        com.bytedance.sdk.openadsdk.yu.mwh mwhVar3 = rn.this.tlj;
                        if (mwhVar3 != null) {
                            mwhVar3.ouw(i11);
                        }
                    }
                });
                if (rnVar.f13305uq.ksc != null) {
                    rnVar.tlj.f14470jg = com.bytedance.sdk.openadsdk.component.reward.ouw.pno.ouw();
                }
                com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(vppVar, rnVar.f13296le, rnVar.f13305uq.jvy);
                rnVar.f13294kn = fkwVarOuw;
                if (fkwVarOuw != null) {
                    if (rnVar.ra()) {
                        str = "landingpage_endcard";
                    }
                    fkwVarOuw.ouw(str);
                }
                if (rnVar.ra()) {
                    uoy.ouw(vppVar, rnVar.f13296le);
                }
                final Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
                final bs bsVar = rnVar.f13300ra;
                final String str3 = vppVar.pv;
                final com.bytedance.sdk.openadsdk.common.fkw fkwVar = rnVar.f13294kn;
                final mwh mwhVar3 = rnVar.tlj;
                final boolean zVm = vppVar.vm();
                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(contextOuw, bsVar, str3, fkwVar, mwhVar3, zVm) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public void onLoadResource(WebView webView, String str4) {
                        super.onLoadResource(webView, str4);
                        CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView, String str4) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/rn$2;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                        CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str4);
                        safedk_rn$2_onPageFinished_e96151bc25c1a10c8f72e7b29adaf4f9(webView, str4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onPageStarted(WebView webView, String str4, Bitmap bitmap) {
                        super.onPageStarted(webView, str4, bitmap);
                        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar3 = rn.this.f13301rn;
                        if (fkwVar3 != null) {
                            fkwVar3.fkw();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onReceivedError(WebView webView, int i10, String str4, String str5) {
                        super.onReceivedError(webView, i10, str4, str5);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    @TargetApi(23)
                    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                            Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                        }
                        if (webResourceRequest == null || webResourceRequest.getUrl() == null || !rn.ouw(rn.this, webResourceRequest.getUrl().toString())) {
                            if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                                webResourceError.getErrorCode();
                                String.valueOf(webResourceError.getDescription());
                                String.valueOf(webResourceRequest.getUrl());
                            }
                            if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                                rn.this.ryl.set(false);
                                rn rnVar2 = rn.this;
                                rnVar2.f13306vh = false;
                                rnVar2.ouw(webResourceError != null ? webResourceError.getErrorCode() : -1, rn.this.f13305uq.fqk);
                            }
                            if (rn.this.f13301rn != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (webResourceError != null) {
                                        jSONObject.put("code", webResourceError.getErrorCode());
                                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                    }
                                    rn.this.f13301rn.ouw(jSONObject);
                                } catch (JSONException unused) {
                                }
                            }
                            if (webResourceError != null) {
                                rn.this.f13293jg = webResourceError.getErrorCode();
                                rn.this.f13295ko = String.valueOf(webResourceError.getDescription());
                            }
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    @TargetApi(21)
                    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        webResourceRequest.isForMainFrame();
                        webResourceRequest.getUrl();
                        webResourceResponse.getStatusCode();
                        if (webResourceRequest.getUrl() != null) {
                            Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                        }
                        if (webResourceRequest.isForMainFrame()) {
                            rn.this.ryl.set(false);
                            rn rnVar2 = rn.this;
                            rnVar2.f13306vh = false;
                            rnVar2.f13293jg = webResourceResponse.getStatusCode();
                            rn rnVar3 = rn.this;
                            rnVar3.f13295ko = "onReceivedHttpError";
                            rnVar3.ouw(rnVar3.f13293jg, rnVar3.f13305uq.fqk);
                        }
                        if (rn.this.f13301rn != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                                rn.this.f13301rn.ouw(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    public void safedk_rn$2_onPageFinished_e96151bc25c1a10c8f72e7b29adaf4f9(WebView webView, String str4) {
                        super.onPageFinished(webView, str4);
                        rn rnVar2 = rn.this;
                        rnVar2.f13306vh = false;
                        rnVar2.mwh = true;
                        rnVar2.ouw(100, rnVar2.f13305uq.fqk);
                        if (rn.this.f13305uq.f13257bs.cf()) {
                            View viewTlj = rn.this.f13305uq.ey.tlj();
                            if (viewTlj instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                                ((com.bytedance.sdk.openadsdk.core.le.yu) viewTlj).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(rn.this.f13305uq.hun, "tt_skip_btn"));
                            }
                        }
                        DeviceUtils.AudioInfoReceiver.ouw(rn.this);
                        rn.this.yhj = DeviceUtils.ra();
                        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar3 = rn.this.f13301rn;
                        if (fkwVar3 != null) {
                            fkwVar3.le();
                        }
                        yu yuVar2 = yuVar;
                        if (yuVar2 != null) {
                            yuVar2.ouw();
                        }
                    }

                    @TargetApi(21)
                    public WebResourceResponse safedk_rn$2_shouldInterceptRequest_690c920ba9ad3556ea94ac1e9a539b54(WebView webView, WebResourceRequest webResourceRequest) {
                        try {
                            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                        } catch (Throwable th2) {
                            qbp.ouw("TTAD.RFWVM", "shouldInterceptRequest error1", th2);
                            return super.shouldInterceptRequest(webView, webResourceRequest);
                        }
                    }

                    public WebResourceResponse safedk_rn$2_shouldInterceptRequest_e6a4f15f3d8ba25fc32f84c0f1bb83d0(WebView webView, String str4) {
                        try {
                            if (TextUtils.isEmpty(rn.this.hun)) {
                                return super.shouldInterceptRequest(webView, str4);
                            }
                            rn.this.lso++;
                            com.bytedance.sdk.openadsdk.ra.vt.ouw();
                            rn rnVar2 = rn.this;
                            WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(rnVar2.ux, rnVar2.hun, str4);
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                                rn.this.f13304ub++;
                                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "GeckoLog: hit++");
                                return webResourceResponseModelOuw.getWebResourceResponse();
                            }
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                                rn.this.rrs++;
                            }
                            return super.shouldInterceptRequest(webView, str4);
                        } catch (Throwable th2) {
                            qbp.ouw("TTAD.RFWVM", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str4);
                        }
                    }

                    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    @TargetApi(21)
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/rn$2;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, safedk_rn$2_shouldInterceptRequest_690c920ba9ad3556ea94ac1e9a539b54(webView, webResourceRequest));
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str4) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/rn$2;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str4, safedk_rn$2_shouldInterceptRequest_e6a4f15f3d8ba25fc32f84c0f1bb83d0(webView, str4));
                    }
                };
                rnVar.f13299pd = fkwVar2;
                rnVar.f13296le.setWebViewClient(fkwVar2);
                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar3 = rnVar.f13299pd;
                fkwVar3.f14036ko = vppVar;
                fkwVar3.tlj = rnVar.f13297lh ? "rewarded_video" : "fullscreen_interstitial_ad";
                if (vppVar.vm() && (leVar = rnVar.f13296le) != null && leVar.getWebView() != null) {
                    rnVar.f13296le.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.3

                        /* JADX INFO: renamed from: lh, reason: collision with root package name */
                        private final int f13309lh = com.bytedance.sdk.openadsdk.core.zih.vt();

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/rn$3;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            CreativeInfoManager.onViewTouched(g.f53147u, view, motionEvent);
                            return safedk_rn$3_onTouch_e6557c2e89febffeed3153b1e0472073(view, motionEvent);
                        }

                        public boolean safedk_rn$3_onTouch_e6557c2e89febffeed3153b1e0472073(View view, MotionEvent motionEvent) {
                            int actionMasked;
                            int i10;
                            int i11;
                            com.bytedance.sdk.openadsdk.yu.mwh mwhVar4 = rn.this.tlj;
                            if (mwhVar4 != null) {
                                mwhVar4.ouw(motionEvent);
                            }
                            com.bytedance.sdk.openadsdk.common.fkw fkwVar4 = rn.this.f13294kn;
                            if (fkwVar4 != null) {
                                fkwVar4.ouw(motionEvent);
                            }
                            try {
                                actionMasked = motionEvent.getActionMasked();
                                i10 = 3;
                            } catch (Throwable th2) {
                                Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th2);
                            }
                            if (actionMasked != 0) {
                                if (actionMasked == 1) {
                                    i11 = i10;
                                } else if (actionMasked != 2) {
                                    i11 = actionMasked == 3 ? 4 : -1;
                                } else {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - rn.this.zin) >= this.f13309lh || Math.abs(rawY - rn.this.vpp) >= this.f13309lh) {
                                        rn.this.f13302tc = false;
                                    }
                                    rn.this.ksc += Math.abs(motionEvent.getX() - rn.this.zin);
                                    rn.this.jae += Math.abs(motionEvent.getY() - rn.this.vpp);
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    rn rnVar2 = rn.this;
                                    i10 = (jCurrentTimeMillis - rnVar2.jqy <= 200 || (rnVar2.ksc <= 8.0f && rnVar2.jae <= 8.0f)) ? 2 : 1;
                                    if (rnVar2.f13290cd) {
                                        if (rawY - rnVar2.vpp > 8.0f) {
                                            com.bytedance.sdk.openadsdk.common.jg jgVar = rnVar2.f13298od;
                                            final zin zinVar = jgVar.yu;
                                            if (zinVar != null) {
                                                try {
                                                    final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zinVar.ouw.getLayoutParams();
                                                    if (!zinVar.f13125cf) {
                                                        int i12 = marginLayoutParams.topMargin;
                                                        int i13 = zinVar.tlj;
                                                        if (i12 == (-i13)) {
                                                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-i13, 0);
                                                            valueAnimatorOfInt.setDuration(300L);
                                                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.2
                                                                public final /* synthetic */ ViewGroup.MarginLayoutParams ouw;

                                                                public AnonymousClass2(final ViewGroup.MarginLayoutParams marginLayoutParams2) {
                                                                    marginLayoutParams = marginLayoutParams2;
                                                                }

                                                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                                    zin.this.ouw.setLayoutParams(marginLayoutParams);
                                                                }
                                                            });
                                                            valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.3
                                                                public AnonymousClass3() {
                                                                }

                                                                @Override // android.animation.Animator.AnimatorListener
                                                                public final void onAnimationCancel(Animator animator) {
                                                                }

                                                                @Override // android.animation.Animator.AnimatorListener
                                                                public final void onAnimationEnd(Animator animator) {
                                                                    zin.this.f13125cf = false;
                                                                }

                                                                @Override // android.animation.Animator.AnimatorListener
                                                                public final void onAnimationRepeat(Animator animator) {
                                                                }

                                                                @Override // android.animation.Animator.AnimatorListener
                                                                public final void onAnimationStart(Animator animator) {
                                                                    zin.this.f13125cf = true;
                                                                }
                                                            });
                                                            valueAnimatorOfInt.start();
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            com.bytedance.sdk.openadsdk.common.th thVar = jgVar.fkw;
                                            if (thVar != null) {
                                                thVar.ouw();
                                            }
                                        }
                                        rn rnVar3 = rn.this;
                                        if (rawY - rnVar3.vpp < -8.0f) {
                                            com.bytedance.sdk.openadsdk.common.jg jgVar2 = rnVar3.f13298od;
                                            final zin zinVar2 = jgVar2.yu;
                                            if (zinVar2 != null) {
                                                try {
                                                    final ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) zinVar2.ouw.getLayoutParams();
                                                    if (!zinVar2.f13125cf && marginLayoutParams2.topMargin == 0) {
                                                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, -zinVar2.tlj);
                                                        valueAnimatorOfInt2.setDuration(300L);
                                                        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.4
                                                            public final /* synthetic */ ViewGroup.MarginLayoutParams ouw;

                                                            public AnonymousClass4(final ViewGroup.MarginLayoutParams marginLayoutParams22) {
                                                                marginLayoutParams = marginLayoutParams22;
                                                            }

                                                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                                marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                                zin.this.ouw.setLayoutParams(marginLayoutParams);
                                                            }
                                                        });
                                                        valueAnimatorOfInt2.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.5
                                                            public AnonymousClass5() {
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationCancel(Animator animator) {
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationEnd(Animator animator) {
                                                                zin.this.f13125cf = false;
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationRepeat(Animator animator) {
                                                            }

                                                            @Override // android.animation.Animator.AnimatorListener
                                                            public final void onAnimationStart(Animator animator) {
                                                                zin.this.f13125cf = true;
                                                            }
                                                        });
                                                        valueAnimatorOfInt2.start();
                                                    }
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            com.bytedance.sdk.openadsdk.common.th thVar2 = jgVar2.fkw;
                                            if (thVar2 != null) {
                                                thVar2.vt();
                                            }
                                        }
                                    }
                                    i11 = i10;
                                }
                                return false;
                            }
                            rn rnVar4 = rn.this;
                            rnVar4.f13302tc = true;
                            rnVar4.ex = new SparseArray<>();
                            rn.this.zin = motionEvent.getRawX();
                            rn.this.vpp = motionEvent.getRawY();
                            rn.this.jqy = System.currentTimeMillis();
                            try {
                                long landingPageClickBegin = rn.this.f13296le.getLandingPageClickBegin();
                                if (landingPageClickBegin > 0) {
                                    rn rnVar5 = rn.this;
                                    if (landingPageClickBegin < rnVar5.jqy) {
                                        rnVar5.jqy = landingPageClickBegin;
                                        rnVar5.f13296le.setLandingPageClickBegin(-1L);
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            rn rnVar6 = rn.this;
                            rnVar6.ksc = -1.0f;
                            rnVar6.jae = -1.0f;
                            i11 = 0;
                            rn.this.ex.put(motionEvent.getActionMasked(), new lh.ouw(i11, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() == 1 && th.le(rn.this.f13305uq.vt)) {
                                rn rnVar7 = rn.this;
                                if (rnVar7.f13305uq.fqk != null) {
                                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.3.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            rn.this.f13305uq.fqk.wp();
                                        }
                                    };
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    if (jCurrentTimeMillis2 - rnVar7.fvf >= 100) {
                                        rnVar7.fvf = jCurrentTimeMillis2;
                                        runnable.run();
                                    }
                                }
                            }
                            if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!rn.this.f13291cf || th.tlj(vppVar)) && rn.this.f13302tc)) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("down_x", rn.this.zin);
                                jSONObject.put("down_y", rn.this.vpp);
                                jSONObject.put("down_time", rn.this.jqy);
                                jSONObject.put("up_x", motionEvent.getRawX());
                                jSONObject.put("up_y", motionEvent.getRawY());
                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                try {
                                    long landingPageClickEnd = rn.this.f13296le.getLandingPageClickEnd();
                                    if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis3) {
                                        try {
                                            rn.this.f13296le.setLandingPageClickEnd(-1L);
                                        } catch (Exception unused4) {
                                        }
                                        jCurrentTimeMillis3 = landingPageClickEnd;
                                    }
                                } catch (Exception unused5) {
                                }
                                jSONObject.put("up_time", jCurrentTimeMillis3);
                                int[] iArr = new int[2];
                                rn rnVar8 = rn.this;
                                if (rnVar8.f13290cd) {
                                    rnVar8.qbp = rnVar8.f13305uq.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.coz);
                                } else {
                                    rnVar8.qbp = rnVar8.f13305uq.rrs.findViewById(520093713);
                                }
                                View view2 = rn.this.qbp;
                                if (view2 != null) {
                                    view2.getLocationOnScreen(iArr);
                                    jSONObject.put("button_x", iArr[0]);
                                    jSONObject.put("button_y", iArr[1]);
                                    jSONObject.put("button_width", rn.this.qbp.getWidth());
                                    jSONObject.put("button_height", rn.this.qbp.getHeight());
                                }
                                View view3 = rn.this.f13303th;
                                if (view3 != null) {
                                    int[] iArr2 = new int[2];
                                    view3.getLocationOnScreen(iArr2);
                                    jSONObject.put("ad_x", iArr2[0]);
                                    jSONObject.put("ad_y", iArr2[1]);
                                    jSONObject.put("width", rn.this.f13303th.getWidth());
                                    jSONObject.put("height", rn.this.f13303th.getHeight());
                                }
                                jSONObject.put("toolType", motionEvent.getToolType(0));
                                jSONObject.put("deviceId", motionEvent.getDeviceId());
                                jSONObject.put("source", motionEvent.getSource());
                                jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.cf.ouw(rn.this.ex, com.bytedance.sdk.openadsdk.core.bly.ouw().tlj ? 1 : 2));
                                jSONObject.put("user_behavior_type", rn.this.f13302tc ? 1 : 2);
                                jSONObject.put("click_scence", 2);
                                rn rnVar9 = rn.this;
                                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar5 = rnVar9.f13299pd;
                                if (fkwVar5 != null) {
                                    fkwVar5.f14035jg = jSONObject;
                                }
                                if (!rnVar9.f13291cf && !th.bly(vppVar)) {
                                    if (rn.this.f13297lh) {
                                        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, "rewarded_video", "click", jSONObject);
                                    } else {
                                        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, "fullscreen_interstitial_ad", "click", jSONObject);
                                    }
                                    rn.this.f13291cf = true;
                                }
                                return false;
                            }
                            return false;
                        }
                    });
                }
                com.bytedance.sdk.component.bly.le leVar3 = rnVar.f13296le;
                if (leVar3 != null) {
                    final bs bsVar2 = rnVar.f13300ra;
                    final mwh mwhVar4 = rnVar.tlj;
                    final com.bytedance.sdk.openadsdk.common.fkw fkwVar4 = rnVar.f13294kn;
                    leVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(bsVar2, mwhVar4, fkwVar4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.4
                        @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                        public final void onProgressChanged(WebView webView, int i10) {
                            super.onProgressChanged(webView, i10);
                            yu yuVar2 = yuVar;
                            if (yuVar2 != null) {
                                yuVar2.ouw(webView, i10);
                            }
                        }
                    });
                }
                com.bytedance.sdk.component.bly.le leVar4 = rnVar.f13296le;
                if (leVar4 != null) {
                    com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(rnVar.f13305uq.jvy);
                    lhVarOuw.vt = false;
                    lhVarOuw.ouw = false;
                    lhVarOuw.ouw(leVar4.getWebView());
                    leVar4.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar4.getWebView()));
                    leVar4.setMixedContentMode(0);
                }
                rnVar.f13296le.setLayerType(1, null);
                rnVar.f13296le.setBackgroundColor(-1);
                rnVar.f13296le.setDisplayZoomControls(false);
            }
            DownloadListener downloadListener = new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.6
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str4, String str5, String str6, String str7, long j10) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.yu yuVar2 = rn.this.f13305uq.f13274tc;
                    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar = yuVar2.f13316lh;
                    if (lhVar != null) {
                        lhVar.ouw(yuVar2.ouw);
                    }
                    com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2 = vtVar;
                    if (vtVar2 != null) {
                        vtVar2.kn();
                    }
                }
            };
            com.bytedance.sdk.component.bly.le leVar5 = rnVar.f13296le;
            if (leVar5 != null) {
                leVar5.setDownloadListener(downloadListener);
            }
            this.ouw.f13257bs.ouw();
        }
        final com.bytedance.sdk.openadsdk.component.reward.ouw.zih zihVar = this.ouw.osn.ouw.yu;
        if (zihVar != null) {
            DeviceUtils.AudioInfoReceiver.ouw(zihVar);
            zihVar.bly = DeviceUtils.ra();
            if (zihVar.vt.cu != null) {
                final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar4 = zihVar.vt.cu;
                final String str4 = "VAST_END_CARD";
                zihVar.f13317le = new com.bytedance.sdk.openadsdk.core.lh.ra(str4, ouwVar4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.1
                };
                com.bytedance.sdk.openadsdk.core.ryl.lh lhVar = zihVar.vt.cu.f13941lh;
                if (lhVar != null) {
                    String strFkw = lhVar.fkw();
                    if (TextUtils.isEmpty(strFkw)) {
                        com.bytedance.sdk.component.bly.le leVar6 = (com.bytedance.sdk.component.bly.le) zihVar.pno.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.bly);
                        zihVar.f13318lh = leVar6;
                        if (leVar6 != null) {
                            leVar6.o_();
                            com.bytedance.sdk.component.bly.le leVar7 = zihVar.f13318lh;
                            leVar7.setVerticalScrollBarEnabled(false);
                            leVar7.setHorizontalScrollBarEnabled(false);
                            leVar7.setMixedContentMode(0);
                            leVar7.setJavaScriptEnabled(true);
                            leVar7.setJavaScriptCanOpenWindowsAutomatically(true);
                            leVar7.setDomStorageEnabled(true);
                            leVar7.setDatabaseEnabled(true);
                            leVar7.setCacheMode(-1);
                            leVar7.setAllowFileAccess(false);
                            leVar7.setSupportZoom(true);
                            leVar7.setBuiltInZoomControls(true);
                            leVar7.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                            leVar7.setUseWideViewPort(true);
                            zihVar.f13318lh.setDisplayZoomControls(false);
                            zihVar.f13318lh.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.3
                                @Override // android.webkit.WebChromeClient
                                public final void onProgressChanged(WebView webView, int i10) {
                                    super.onProgressChanged(webView, i10);
                                    if (i10 == 100) {
                                        zih.this.ouw(Integer.MAX_VALUE, null);
                                    }
                                }
                            });
                            zihVar.f13318lh.setWebViewClient(new le.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.4
                                @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                                public void onLoadResource(WebView webView, String str5) {
                                    super.onLoadResource(webView, str5);
                                    CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str5);
                                }

                                @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                                public final void onPageFinished(WebView webView, String str5) {
                                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/zih$4;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                                    CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str5);
                                    safedk_zih$4_onPageFinished_48d923944a2b0a0369c1c17cf884901d(webView, str5);
                                }

                                @Override // android.webkit.WebViewClient
                                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                                    if (webResourceRequest.isForMainFrame()) {
                                        zih.this.ouw(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                                    }
                                }

                                public void safedk_zih$4_onPageFinished_48d923944a2b0a0369c1c17cf884901d(WebView webView, String str5) {
                                    super.onPageFinished(webView, str5);
                                    zih.this.ouw(Integer.MAX_VALUE, null);
                                }

                                public boolean safedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477(WebView webView, String str5) {
                                    boolean z11;
                                    vpp vppVar2;
                                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar5;
                                    com.bytedance.sdk.openadsdk.core.lh.ra raVar2;
                                    zih zihVar2 = zih.this;
                                    if (str5 == null || (vppVar2 = zihVar2.vt) == null || (ouwVar5 = vppVar2.cu) == null || (raVar2 = zihVar2.f13317le) == null) {
                                        z11 = false;
                                    } else {
                                        ouwVar5.ryl = str5;
                                        raVar2.onClick(zihVar2.f13318lh);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        return true;
                                    }
                                    return super.shouldOverrideUrlLoading(webView, str5);
                                }

                                @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                                    return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
                                }

                                @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                                public WebResourceResponse shouldInterceptRequest(WebView webView, String str5) {
                                    return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str5, super.shouldInterceptRequest(webView, str5));
                                }

                                @Override // android.webkit.WebViewClient
                                public final boolean shouldOverrideUrlLoading(WebView webView, String str5) {
                                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/ouw/zih$4;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                                    boolean zSafedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477 = safedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477(webView, str5);
                                    BrandSafetyUtils.onShouldOverrideUrlLoading(g.f53147u, webView, str5, zSafedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477);
                                    return zSafedk_zih$4_shouldOverrideUrlLoading_3ddfceadd4fea60268108b87a4abd477;
                                }
                            });
                            String strYu = lhVar.yu();
                            if (strYu != null) {
                                zihVar.fkw = true;
                                if (strYu.startsWith("http")) {
                                    zihVar.f13318lh.a_(strYu);
                                } else {
                                    String strOuw = com.bytedance.sdk.openadsdk.core.ryl.fkw.ouw(strYu);
                                    String str5 = TextUtils.isEmpty(strOuw) ? strYu : strOuw;
                                    zihVar.f13318lh.setDefaultTextEncodingName("UTF -8");
                                    zihVar.f13318lh.ouw((String) null, str5, "text/html", "UTF-8", (String) null);
                                }
                            }
                        }
                    } else {
                        zihVar.fkw = true;
                        zihVar.yu = (ImageView) zihVar.pno.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.pno);
                        int iVt = lhVar.vt();
                        int iLh = lhVar.lh();
                        if (iVt != 0 && iLh != 0 && zihVar.yu != null) {
                            int iYu = osn.yu((Context) zihVar.ouw);
                            int iLe = osn.le(zihVar.ouw);
                            if (iVt / iLh <= iYu / iLe) {
                                iYu = (int) Math.ceil(r7 * r6);
                            } else {
                                iLe = (int) Math.ceil(r7 / r6);
                            }
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zihVar.yu.getLayoutParams();
                            layoutParams.width = iYu;
                            layoutParams.height = iLe;
                            layoutParams.gravity = 17;
                            zihVar.yu.setLayoutParams(layoutParams);
                            zihVar.yu.setOnClickListener(zihVar.f13317le);
                            zihVar.yu.setOnTouchListener(zihVar.f13317le);
                        }
                        yu.ouw.ouw(yu.ouw.vt.ouw(strFkw).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw()))).ouw(lhVar.vt()).vt(lhVar.lh()).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(zihVar.vt, strFkw, new zih.ouw(zihVar.yu, strFkw, zihVar, zihVar.f13319ra)));
                    }
                }
            }
        }
        if (th.yu(this.ouw.vt) || th.ra(this.ouw.vt)) {
            this.tlj.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.ouw;
        ouwVar5.ey.ouw(ouwVar5.f13278vh == 100.0f);
        final tlj tljVar = this.ouw.f13258cd;
        tljVar.f13313lh.ouw(tljVar.ouw.jvy.findViewById(R.id.content));
        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar2 = tljVar.ouw.f13274tc.f13316lh;
        if (lhVar2 != null) {
            tljVar.f13313lh.ouw(lhVar2);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar2 = tljVar.ouw.ksc;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar5 = tljVar.f13313lh;
        bly blyVar2 = pnoVar2.ouw;
        if (blyVar2 != null) {
            blyVar2.ouw(fkwVar5);
        }
        tljVar.f13313lh.ouw(new ouw.InterfaceC0233ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.tlj.3
            @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0233ouw
            public final long getVideoProgress() {
                return tlj.this.ouw.ex.fkw();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = tljVar.ouw.ey;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar6 = tljVar.f13313lh;
        rylVar.ouw(fkwVar6, fkwVar6, tljVar.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.fkw fkwVar7 = tljVar.ouw.osn;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar8 = tljVar.f13313lh;
        final com.bytedance.sdk.openadsdk.component.reward.view.pno pnoVar3 = fkwVar7.ouw;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = pnoVar3.vt;
        if (rFEndCardBackUpLayout != null) {
            osn.ouw(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.pno.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/pno$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_pno$1_onClick_b8c4009acdeb4f13941bab8c8091eeec(view);
                }

                public void safedk_pno$1_onClick_b8c4009acdeb4f13941bab8c8091eeec(View view) {
                }
            }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
            com.bytedance.sdk.openadsdk.component.reward.ouw.zih zihVar2 = pnoVar3.yu;
            if (zihVar2 != null && (raVar = zihVar2.f13317le) != null) {
                raVar.vt = fkwVar8;
            }
        }
        this.ryl = tljVar.f13313lh;
        ra();
    }

    public final void ko() {
        jae jaeVar = this.tlj;
        if (jaeVar != null) {
            jaeVar.removeMessages(300);
        }
    }

    public abstract boolean le();

    public final void mwh() {
        com.bytedance.sdk.openadsdk.core.widget.vt vtVar = this.mwh;
        if (vtVar == null || !vtVar.isShowing()) {
            return;
        }
        this.mwh.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(android.os.Message r14) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.ouw(android.os.Message):void");
    }

    public abstract void ouw(FrameLayout frameLayout);

    public void ouw(com.bytedance.sdk.openadsdk.component.reward.view.bly blyVar) {
        ouw(blyVar, this.ouw);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.ouw
    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, jae jaeVar) {
        super.ouw(vtVar, jaeVar);
        if (this.ouw.vt.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            if (ouwVar.lvd) {
                ouwVar.f13257bs.ouw(false);
            }
        }
    }

    public final void ouw(boolean z10, boolean z11, boolean z12, int i10) {
        this.ouw.osn.ouw(z10, z11, z12, this, i10);
    }

    public RFEndCardBackUpLayout pno() {
        return new RFEndCardBackUpLayout(this.ouw.hun);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qbp() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.qbp():void");
    }

    public abstract void ra();

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rn() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            com.bytedance.sdk.openadsdk.activity.pno r0 = r0.f13261gh
            if (r0 != 0) goto L2a
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.od.vt(r0)
            if (r0 != 0) goto L16
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.od.lh(r0)
            if (r0 == 0) goto L2a
        L16:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.od.pno(r0)
            if (r0 == 0) goto L80
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn r0 = r0.f13257bs
            boolean r1 = r0.yib
            if (r1 == 0) goto L80
            boolean r0 = r0.f13289bs
            if (r0 != 0) goto L80
        L2a:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.tlj
            boolean r0 = r0.get()
            r1 = 0
            if (r0 == 0) goto L5f
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            boolean r2 = r0.f13271ra
            if (r2 != 0) goto L5f
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zin
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L5f
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            int r0 = r0.pno
            if (r0 >= 0) goto L4c
            r2 = -1
            if (r0 != r2) goto L5f
        L4c:
            android.os.Message r0 = android.os.Message.obtain()
            r2 = 700(0x2bc, float:9.81E-43)
            r0.what = r2
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r4.ouw
            int r3 = r2.pno
            r0.arg1 = r3
            com.bytedance.sdk.component.utils.jae r2 = r2.ux
            r2.sendMessage(r0)
        L5f:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            int r2 = r0.bly
            if (r2 <= 0) goto L80
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.vpp
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L80
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 900(0x384, float:1.261E-42)
            r0.what = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.ouw
            int r2 = r1.bly
            r0.arg1 = r2
            com.bytedance.sdk.component.utils.jae r1 = r1.ux
            r1.sendMessage(r0)
        L80:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            if (r0 != 0) goto L85
            return
        L85:
            com.bytedance.sdk.openadsdk.utils.jg r0 = r0.f13273sd
            if (r0 == 0) goto L8c
            r0.ouw()
        L8c:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.kfa = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.rn():void");
    }

    public void ryl() {
    }

    public final void th() {
        vt(false);
    }

    public final View tlj() {
        com.bytedance.sdk.openadsdk.core.le.ra raVar;
        if (this.vt.zih() != 5) {
            raVar = new com.bytedance.sdk.openadsdk.core.le.ra(this.ouw.jvy);
            raVar.setId(com.bytedance.sdk.openadsdk.utils.rn.f14372uj);
        } else {
            raVar = null;
        }
        ko.vt("TTAD.RFAdType", "getLoadingFrameView".concat(String.valueOf(raVar)));
        return raVar;
    }

    public final void vm() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = ouwVar.ey;
        if (rylVar != null) {
            rylVar.rn();
        }
        ko.vt("TTAD.RFAdType", "onStop mIsMute=" + this.ouw.f13260cj + " mLast=" + this.ouw.fvf.vt + " mVolume=" + DeviceUtils.ra());
        this.ouw.f13257bs.pno();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
        if (ouwVar2.f13260cj) {
            ouwVar2.jvy.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.mwh.bly blyVar = vt.this.ouw.fvf;
                    int iPno = blyVar.vt;
                    if (iPno <= 0 || blyVar.ouw == null) {
                        return;
                    }
                    int i10 = 0;
                    if (iPno == 0) {
                        iPno = DeviceUtils.pno() / 15;
                        i10 = 1;
                    } else if (iPno == -1) {
                        return;
                    }
                    ko.vt("VolumeChangeObserver", "not mute set volume to " + iPno + " mLastVolume=" + blyVar.vt);
                    blyVar.vt = -1;
                    try {
                        blyVar.ouw.setStreamVolume(3, iPno, i10);
                    } catch (Throwable unused) {
                    }
                    blyVar.f14198lh = true;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vpp() {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.vpp():void");
    }

    public final void vt(boolean z10) {
        try {
            com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.ouw.jae;
            if (tljVar != null && !z10) {
                tljVar.vt();
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = this.ouw.ey;
            if (rylVar != null) {
                rylVar.jg();
            }
            this.ouw.ex.vm();
            if (!fkw()) {
                this.ouw.tlj.get();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = this.ouw.f13257bs;
            if (rnVar != null) {
                rnVar.fkw();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar = this.ouw.ksc;
            if (pnoVar != null) {
                pnoVar.vt(com.bytedance.sdk.openadsdk.component.reward.ouw.pno.vt);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = this.ouw.ey;
            if (rylVar2 != null) {
                rylVar2.ryl();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.fkw fkwVar = this.ouw.osn;
            if (fkwVar != null) {
                fkwVar.ouw();
            }
            jg jgVar = this.ouw.f13273sd;
            if (jgVar != null) {
                jgVar.lh();
            }
        } catch (Throwable unused) {
        }
    }

    public ouw yu() {
        return null;
    }

    public final void zih() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar == null) {
            return;
        }
        try {
            ouwVar.pv = false;
            ko.vt("TTAD.RFAdType", "onPause mIsActivityShow=" + this.ouw.pv + " mIsMute=" + this.ouw.f13260cj);
            if (!this.ouw.f13259cf.get()) {
                this.ouw.ex.ra();
            }
            ko();
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = this.ouw.f13257bs;
            com.bytedance.sdk.component.bly.le leVar = rnVar.f13296le;
            if (leVar != null) {
                leVar.pno();
            }
            if (rnVar.osn > 0) {
                rnVar.ey += SystemClock.elapsedRealtime() - rnVar.osn;
                rnVar.osn = 0L;
            }
            bs bsVar = rnVar.f13300ra;
            if (bsVar != null) {
                bsVar.f13491vm = false;
                com.bytedance.sdk.openadsdk.component.reward.ouw.rn.ouw(bsVar, false);
                rnVar.ouw(rnVar.f13300ra, true, false);
            }
            this.ouw.ksc.le();
            this.ouw.vpp.set(true);
            if (this.ouw.tlj.get()) {
                this.ouw.zin.set(true);
            }
            jg jgVar = this.ouw.f13273sd;
            if (jgVar != null) {
                jgVar.vt();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.kfa <= 0) {
                ouwVar2.kfa = SystemClock.elapsedRealtime();
            }
            ouwVar2.yw += SystemClock.elapsedRealtime() - ouwVar2.kfa;
        } catch (Throwable unused) {
        }
    }

    public final void zin() {
        this.ouw.uoy.vt();
        this.ouw.uoy.fkw(true);
    }
}
