package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.yu.bly;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class tlj extends com.bytedance.sdk.openadsdk.core.widget.ouw.fkw {

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private static final byte[] f13465vm = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    public ArrayList<Integer> ouw;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.vt.mwh f13466rn;
    private final com.bytedance.sdk.openadsdk.core.model.vpp vt;
    private boolean zih;

    public tlj(Context context, bs bsVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.openadsdk.yu.mwh mwhVar, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar2) {
        super(context, bsVar, vppVar.pv, mwhVar, false);
        this.zih = false;
        this.ouw = new ArrayList<>();
        this.vt = vppVar;
        this.f13466rn = mwhVar2;
        this.zih = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("inject_data_normal_open", 0) == 1;
    }

    private static WebResourceResponse ouw(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamOuw = yu.ouw.vt.ouw(str, str2);
            if (inputStreamOuw == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(bly.ouw.IMAGE.fkw, G5.N, inputStreamOuw);
            try {
                ouw(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th2) {
                th = th2;
                webResourceResponse = webResourceResponse2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        com.bytedance.sdk.component.utils.qbp.ouw("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouw(String str, bly.ouw ouwVar) {
        pd.ouw ouwVar2;
        JSONArray jSONArray;
        pd pdVar = this.vt.lht;
        if (pdVar != null && (ouwVar2 = pdVar.f13702le) != null && (jSONArray = ouwVar2.ouw) != null && jSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.cf.lh.ouw(jSONArray.optString(i10), com.bytedance.sdk.openadsdk.core.settings.cf.vt().tlj()), str) && ouwVar == bly.ouw.IMAGE) {
                    com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVar3 = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                    ouwVar3.vt = 5;
                    ouwVar3.ouw = ouw(str, com.bytedance.sdk.component.utils.fkw.ouw(str));
                    return ouwVar3;
                }
            }
        }
        return null;
    }

    private static com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouw(JSONArray jSONArray, String str, bly.ouw ouwVar) {
        InputStream inputStreamLh;
        WebResourceResponse webResourceResponse = null;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.cf.lh.ouw(jSONArray.optString(i10), com.bytedance.sdk.openadsdk.core.settings.cf.vt().tlj()), str)) {
                    com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVar2 = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                    ouwVar2.vt = 5;
                    if (!TextUtils.isEmpty(str) && (inputStreamLh = jg.lh(str)) != null) {
                        webResourceResponse = new WebResourceResponse(ouwVar.fkw, "UTF-8", inputStreamLh);
                        ouw(webResourceResponse);
                    }
                    ouwVar2.ouw = webResourceResponse;
                    return ouwVar2;
                }
            }
        }
        return null;
    }

    private static void ouw(WebResourceResponse webResourceResponse) {
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(map);
    }

    private static WebResourceResponse yu() {
        InputStream inputStreamOpenRawResource;
        int iBly = com.bytedance.sdk.openadsdk.core.bly.ouw().bly();
        if (iBly == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.zih.ouw().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(iBly, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                inputStreamOpenRawResource = (charSequence == null || !charSequence.toString().endsWith(".xml")) ? resources.openRawResource(iBly) : new ByteArrayInputStream(f13465vm);
            } catch (Resources.NotFoundException e10) {
                com.bytedance.sdk.component.utils.qbp.lh("ExpressClient", e10.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(bly.ouw.IMAGE.fkw, "UTF-8", inputStreamOpenRawResource);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/tlj;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str);
        safedk_tlj_onPageFinished_e8df1030b3a35da4ddaaeaa8a3ff4ff1(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.pno = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.vt.mwh mwhVar = this.f13466rn;
        if (mwhVar != null && mwhVar.vpp && this.zih) {
            com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "trigger SDK_INJECT_DATA in pageStart, templateInfo is：", mwhVar.ouw());
            com.bytedance.sdk.component.utils.jg.ouw(webView, "javascript:window.SDK_INJECT_DATA=" + this.f13466rn.ouw());
        }
    }

    public final String ouw() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.vt;
        if (vppVar == null) {
            return null;
        }
        vpp.ouw ouwVar = vppVar.f13803xn;
        if (ouwVar != null) {
            return ouwVar.tlj;
        }
        if (vppVar.lht != null) {
            return "v3";
        }
        return null;
    }

    public void safedk_tlj_onPageFinished_e8df1030b3a35da4ddaaeaa8a3ff4ff1(WebView webView, String str) {
        this.f14039ra = false;
        super.onPageFinished(webView, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d A[Catch: all -> 0x01f4, TryCatch #0 {all -> 0x01f4, blocks: (B:3:0x0008, B:91:0x017f, B:93:0x0185, B:97:0x018c, B:99:0x0190, B:102:0x0195, B:104:0x019d, B:105:0x01a7, B:107:0x01ab, B:109:0x01b6, B:111:0x01ba, B:113:0x01e2, B:115:0x01e6, B:7:0x0028, B:9:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0059, B:24:0x0082, B:28:0x0089, B:21:0x0068, B:23:0x0071, B:29:0x00a8, B:31:0x00b4, B:34:0x00bd, B:47:0x00db, B:48:0x00e5, B:51:0x00ed, B:54:0x00f2, B:56:0x00f6, B:59:0x00fd, B:37:0x00c5, B:40:0x00ca, B:42:0x00ce, B:45:0x00d5, B:62:0x0104, B:64:0x0108, B:65:0x0110, B:67:0x0116, B:69:0x0124, B:71:0x012a, B:74:0x0134, B:75:0x0138, B:77:0x013e, B:79:0x0144, B:83:0x014d, B:87:0x0154, B:88:0x015d, B:89:0x0171), top: B:121:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.webkit.WebResourceResponse safedk_tlj_shouldInterceptRequest_160388f2b5674a08feb27961edeb09e3(android.webkit.WebView r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bly.tlj.safedk_tlj_shouldInterceptRequest_160388f2b5674a08feb27961edeb09e3(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    @TargetApi(21)
    public WebResourceResponse safedk_tlj_shouldInterceptRequest_68d40b014a29af937101b744ccc763f2(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("ExpressClient", "shouldInterceptRequest error1", th2);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    @TargetApi(21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/tlj;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, safedk_tlj_shouldInterceptRequest_68d40b014a29af937101b744ccc763f2(webView, webResourceRequest));
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/tlj;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str, safedk_tlj_shouldInterceptRequest_160388f2b5674a08feb27961edeb09e3(webView, str));
    }
}
