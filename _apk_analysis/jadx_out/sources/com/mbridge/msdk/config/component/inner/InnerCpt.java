package com.mbridge.msdk.config.component.inner;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class InnerCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f36022h = "InnerStoreComponent";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f36023i = "700001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.mbridge.msdk.config.component.inner.model.a f36024j;

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[PHI: r0
      0x009a: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v0 java.lang.String), (r0v0 java.lang.String) binds: [B:34:0x009d, B:4:0x0008, B:23:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            r1 = 1
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L9c
            if (r3 != 0) goto L9a
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = r3.getScheme()     // Catch: java.lang.Throwable -> L9c
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L9c
            if (r5 != 0) goto L25
            java.lang.String r5 = "intent"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L25
            android.content.Intent r8 = android.content.Intent.parseUri(r8, r1)     // Catch: java.lang.Throwable -> L9c
            goto L43
        L25:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L9c
            if (r5 != 0) goto L39
            java.lang.String r5 = "android-app"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L39
            r3 = 2
            android.content.Intent r8 = android.content.Intent.parseUri(r8, r3)     // Catch: java.lang.Throwable -> L9c
            goto L43
        L39:
            android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "android.intent.action.VIEW"
            r8.<init>(r4, r3)     // Catch: java.lang.Throwable -> L9c
            r8.setData(r3)     // Catch: java.lang.Throwable -> L9c
        L43:
            if (r10 == 0) goto L77
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Throwable -> L9c
            if (r10 != 0) goto L77
            com.mbridge.msdk.config.component.inner.model.a r10 = r6.f36024j     // Catch: java.lang.Throwable -> L9c
            java.util.Map r10 = r10.b()     // Catch: java.lang.Throwable -> L9c
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> L9c
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L9c
        L59:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto L77
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> L9c
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L9c
            r8.putExtra(r4, r3)     // Catch: java.lang.Throwable -> L9c
            goto L59
        L77:
            if (r8 == 0) goto L9a
            r10 = 0
            r8.setComponent(r10)     // Catch: java.lang.Throwable -> L9c
            r8.setSelector(r10)     // Catch: java.lang.Throwable -> L9c
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L9c
            if (r10 != 0) goto L89
            r8.setPackage(r9)     // Catch: java.lang.Throwable -> L9c
        L89:
            boolean r9 = r7 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L9c
            if (r9 == 0) goto L91
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(r7, r8)     // Catch: java.lang.Throwable -> L9c
            goto Lab
        L91:
            r9 = 268435456(0x10000000, float:2.524355E-29)
            r8.setFlags(r9)     // Catch: java.lang.Throwable -> L9c
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(r7, r8)     // Catch: java.lang.Throwable -> L9c
            goto Lab
        L9a:
            r1 = r2
            goto Lab
        L9c:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()
            java.lang.String r9 = "InnerStoreComponent"
            com.mbridge.msdk.foundation.tools.q0.b(r9, r8, r7)
            java.lang.String r0 = r7.getMessage()
            goto L9a
        Lab:
            r6.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.inner.InnerCpt.a(android.content.Context, java.lang.String, java.lang.String, java.util.Map):void");
    }

    private void a(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put("result", String.valueOf(z10 ? 1 : 0));
        if (!z10) {
            map.put("code", str);
            map.put("reason", "700001");
        }
        a(a("901005", map));
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, g.f53141o);
        context.startActivity(intent);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "901001";
        this.f36024j = new com.mbridge.msdk.config.component.inner.model.a(map);
        if (e() != null) {
            this.f36024j.a(e().getContext());
        } else {
            this.f36024j.a(c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f36024j.f().equals("StoreKit")) {
            String strC = this.f36024j.c();
            if (TextUtils.isEmpty(strC) || !strC.equals("display")) {
                return;
            }
            g();
        }
    }

    public void g() {
        com.mbridge.msdk.config.component.inner.model.a aVar = this.f36024j;
        if (aVar != null) {
            a(aVar.a(), this.f36024j.d(), this.f36024j.e(), this.f36024j.b());
        }
    }
}
