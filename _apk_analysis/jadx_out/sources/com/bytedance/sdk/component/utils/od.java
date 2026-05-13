package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.jqy;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class od {
    private static final HashMap<String, ouw> ouw = new HashMap<>();

    public static class ouw {
        public final int vt;
        private final String yu;
        public final HashSet<String> ouw = new HashSet<>();

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final ArrayList<WebView> f12788lh = new ArrayList<>();

        public ouw(String str, JSONObject jSONObject) {
            this.yu = str;
            this.vt = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.ouw.add(strOptString);
                    }
                }
            }
        }

        public final WebView ouw() {
            if (this.f12788lh.isEmpty()) {
                return null;
            }
            return this.f12788lh.remove(0);
        }
    }

    public static int ouw(le.lh lhVar) {
        ouw ouwVar;
        if (lhVar == null || (ouwVar = ouw.get(lhVar.mwh)) == null) {
            return 0;
        }
        return ouwVar.f12788lh.size();
    }

    private static WebView ouw(Context context, AttributeSet attributeSet, le.lh lhVar, boolean z10) {
        WebView webViewOuw;
        ouw ouwVar;
        if (lhVar == null || attributeSet != null || (ouwVar = ouw.get(lhVar.mwh)) == null) {
            webViewOuw = null;
        } else {
            webViewOuw = ouwVar.ouw();
            if (webViewOuw != null) {
                if (webViewOuw instanceof com.bytedance.sdk.component.bly.fkw) {
                    ((com.bytedance.sdk.component.bly.fkw) webViewOuw).setRecycler(false);
                }
                ouw(lhVar, false);
            }
        }
        if (webViewOuw != null || !z10) {
            return webViewOuw;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        ouw(lhVar, true);
        return new com.bytedance.sdk.component.bly.fkw(context, attributeSet);
    }

    public static com.bytedance.sdk.component.bly.le ouw(Context context, AttributeSet attributeSet, le.lh lhVar) {
        WebView webViewOuw = ouw(context, attributeSet, lhVar, false);
        if (webViewOuw == null) {
            return null;
        }
        com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(context, true, lhVar);
        leVar.setWebView(webViewOuw);
        leVar.o_();
        return leVar;
    }

    private static void ouw(final le.lh lhVar, final boolean z10) {
        jqy.ouw("webview_allocate", new jqy.ouw() { // from class: com.bytedance.sdk.component.utils.od.1
            @Override // com.bytedance.sdk.component.utils.jqy.ouw
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put("scene", lhVar.mwh);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(com.bytedance.sdk.component.bly.le r6) {
        /*
            if (r6 != 0) goto L3
            return
        L3:
            android.webkit.WebView r0 = r6.getWebView()
            if (r0 != 0) goto La
            return
        La:
            com.bytedance.sdk.component.bly.le$lh r1 = r6.getScene()
            java.util.HashMap<java.lang.String, com.bytedance.sdk.component.utils.od$ouw> r2 = com.bytedance.sdk.component.utils.od.ouw
            java.lang.String r1 = r1.mwh
            java.lang.Object r1 = r2.get(r1)
            com.bytedance.sdk.component.utils.od$ouw r1 = (com.bytedance.sdk.component.utils.od.ouw) r1
            if (r1 == 0) goto L65
            java.util.ArrayList<android.webkit.WebView> r2 = r1.f12788lh
            int r2 = r2.size()
            int r3 = r1.vt
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L5e
            java.util.ArrayList<android.webkit.WebView> r2 = r1.f12788lh
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L2f
            goto L5e
        L2f:
            android.content.Context r2 = r0.getContext()
            boolean r3 = r2 instanceof android.content.MutableContextWrapper
            if (r3 == 0) goto L5e
            r3 = r2
            android.content.MutableContextWrapper r3 = (android.content.MutableContextWrapper) r3
            android.content.Context r2 = r2.getApplicationContext()
            r3.setBaseContext(r2)
            boolean r2 = r0 instanceof com.bytedance.sdk.component.bly.fkw
            if (r2 == 0) goto L4b
            r2 = r0
            com.bytedance.sdk.component.bly.fkw r2 = (com.bytedance.sdk.component.bly.fkw) r2
            r2.setRecycler(r4)
        L4b:
            android.view.ViewParent r2 = r0.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L58
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.removeView(r0)
        L58:
            java.util.ArrayList<android.webkit.WebView> r1 = r1.f12788lh
            r1.add(r0)
            goto L5f
        L5e:
            r4 = r5
        L5f:
            if (r4 == 0) goto L65
            vt(r6)
            return
        L65:
            android.content.Context r6 = r0.getContext()     // Catch: java.lang.Exception -> L91
            boolean r1 = r6 instanceof android.content.MutableContextWrapper     // Catch: java.lang.Exception -> L91
            if (r1 == 0) goto L77
            r1 = r6
            android.content.MutableContextWrapper r1 = (android.content.MutableContextWrapper) r1     // Catch: java.lang.Exception -> L91
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L91
            r1.setBaseContext(r6)     // Catch: java.lang.Exception -> L91
        L77:
            r6 = 0
            r0.setWebChromeClient(r6)     // Catch: java.lang.Exception -> L91
            r0.setWebViewClient(r6)     // Catch: java.lang.Exception -> L91
            android.view.ViewParent r6 = r0.getParent()     // Catch: java.lang.Exception -> L91
            boolean r1 = r6 instanceof android.view.ViewGroup     // Catch: java.lang.Exception -> L91
            if (r1 == 0) goto L8b
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch: java.lang.Exception -> L91
            r6.removeView(r0)     // Catch: java.lang.Exception -> L91
        L8b:
            r0.removeAllViews()     // Catch: java.lang.Exception -> L91
            r0.destroy()     // Catch: java.lang.Exception -> L91
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.od.ouw(com.bytedance.sdk.component.bly.le):void");
    }

    public static void ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    ouw ouwVar = new ouw(next, jSONObjectJsonObjectInit.getJSONObject(next));
                    Iterator<String> it = ouwVar.ouw.iterator();
                    while (it.hasNext()) {
                        ouw.put(it.next(), ouwVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static WebView vt(Context context, AttributeSet attributeSet, le.lh lhVar) {
        return ouw(context, attributeSet, lhVar, true);
    }

    public static void vt(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null) {
            return;
        }
        try {
            leVar.removeAllViews();
            leVar.vt();
            leVar.setWebChromeClient(null);
            leVar.setWebViewClient(null);
            leVar.setDownloadListener(null);
            leVar.setJavaScriptEnabled(true);
            leVar.setCacheMode(-1);
            leVar.setSupportZoom(false);
            leVar.setUseWideViewPort(true);
            leVar.setJavaScriptCanOpenWindowsAutomatically(true);
            leVar.setDomStorageEnabled(true);
            leVar.setBuiltInZoomControls(false);
            leVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            leVar.setLoadWithOverviewMode(false);
            leVar.setDefaultTextEncodingName("UTF-8");
            leVar.setDefaultFontSize(16);
        } catch (Throwable unused) {
        }
    }

    public static boolean vt(le.lh lhVar) {
        return (lhVar == null || ouw.get(lhVar.mwh) == null) ? false : true;
    }
}
