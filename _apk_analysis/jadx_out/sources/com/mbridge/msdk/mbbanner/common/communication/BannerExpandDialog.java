package com.mbridge.msdk.mbbanner.common.communication;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.C3978d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class BannerExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f38389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindVaneWebView f38390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f38391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f38392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f38393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.a f38394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f38395j;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BannerExpandDialog.this.dismiss();
        }
    }

    public class b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        public class a implements ValueCallback<String> {
            public a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        public b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript(SafeDKWebAppInterface.f52902f + com.mbridge.msdk.setting.util.a.a().b(), new a());
            BannerExpandDialog.this.c();
        }
    }

    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BannerExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BannerExpandDialog.this.a();
        }
    }

    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (BannerExpandDialog.this.f38394i != null) {
                BannerExpandDialog.this.f38394i.a(false);
            }
            MintegralNetworkBridge.webviewLoadDataWithBaseURL(BannerExpandDialog.this.f38390e, null, "", "text/html", G5.N, null);
            BannerExpandDialog.this.f38389d.removeView(BannerExpandDialog.this.f38390e);
            BannerExpandDialog.this.f38390e.release();
            BannerExpandDialog.this.f38390e = null;
            BannerExpandDialog.this.f38394i = null;
        }
    }

    public class e implements com.mbridge.msdk.mbsignalcommon.mraid.b {
        public e() {
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(intent, g.f53141o);
            context.startActivity(intent);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void close() {
            BannerExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void expand(String str, boolean z10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public CampaignEx getMraidCampaign() {
            return null;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void open(String str) {
            try {
                if (BannerExpandDialog.this.f38390e == null || System.currentTimeMillis() - BannerExpandDialog.this.f38390e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f35744d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) BannerExpandDialog.this.f38393h.get(0), BannerExpandDialog.this.f38390e.getUrl(), com.mbridge.msdk.click.utils.a.f35741a)) {
                    q0.b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f38393h.size() > 1) {
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(com.mbridge.msdk.foundation.controller.c.n().d(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f38394i != null) {
                        BannerExpandDialog.this.f38394i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                q0.b("BannerExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                BannerExpandDialog.this.f38391f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                q0.b("BannerExpandDialog", "useCustomClose", th2);
            }
        }
    }

    public BannerExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        super(context);
        this.f38386a = "BannerExpandDialog";
        this.f38395j = new e();
        if (bundle != null) {
            this.f38387b = bundle.getString("url");
            this.f38388c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f38394i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f38389d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f38390e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f38389d.addView(this.f38390e);
        TextView textView = new TextView(getContext());
        this.f38391f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f38391f.setLayoutParams(layoutParams);
        this.f38391f.setVisibility(this.f38388c ? 4 : 0);
        this.f38391f.setOnClickListener(new a());
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f38392g, 296);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, bitmapDrawableA, this.f38389d.getResources().getDisplayMetrics());
            this.f38389d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f38389d.addView(this.f38391f);
        setContentView(this.f38389d);
        a();
        this.f38390e.setWebViewListener(new b());
        this.f38390e.setObject(this.f38395j);
        MintegralNetworkBridge.webviewLoadUrl(this.f38390e, this.f38387b);
        List<CampaignEx> list = this.f38393h;
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = this.f38393h.get(0);
            if (campaignEx != null) {
                b1.a(this.f38390e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f38389d.addView(mBAdChoice, layoutParams2);
            }
        }
        setOnDismissListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            int i10 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i10 == 2 ? C3978d4.i.C : i10 == 1 ? C3978d4.i.D : "undefined");
            jSONObject.put("locked", "true");
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "expanded");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            this.f38390e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f38390e, r0[0], r0[1], r11.getWidth(), this.f38390e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f38390e, r0[0], r0[1], r5.getWidth(), this.f38390e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f38390e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f38390e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f38390e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f38390e);
        } catch (Throwable th2) {
            q0.b("BannerExpandDialog", "notifyMraid", th2);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        b();
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f38392g = str;
        this.f38393h = list;
    }
}
