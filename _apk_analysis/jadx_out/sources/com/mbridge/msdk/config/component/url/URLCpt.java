package com.mbridge.msdk.config.component.url;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class URLCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f36407h = "600001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.mbridge.msdk.config.component.url.model.a f36408i;

    private void a(Context context, String str, String str2, Map<Object, Object> map) {
        String message;
        PackageInfo packageInfo;
        Intent launchIntentForPackage;
        ResolveInfo next;
        boolean z10 = true;
        try {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str) && (packageInfo = context.getPackageManager().getPackageInfo(str, 1)) != null && str.equals(packageInfo.packageName) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0);
                if (!listQueryIntentActivities.isEmpty() && (next = listQueryIntentActivities.iterator().next()) != null) {
                    ActivityInfo activityInfo = next.activityInfo;
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    intent.addFlags(268435456);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str2));
                intent.addFlags(268435456);
            }
            if (map != null) {
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    if (entry.getKey() instanceof String) {
                        intent.putExtra(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                }
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            message = "";
        } catch (Exception e10) {
            q0.b("OpenAppComponent", e10.getMessage());
            message = e10.getMessage();
            z10 = false;
        }
        a(z10, message);
    }

    private void a(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put("result", String.valueOf(z10 ? 1 : 0));
        if (!z10) {
            map.put("reason", str);
            map.put("code", "600001");
        }
        a(a("909002", map));
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
        this.f35756f = "909001";
        this.f36408i = new com.mbridge.msdk.config.component.url.model.a(map);
        if (e() != null) {
            this.f36408i.a(e().getContext());
        } else {
            this.f36408i.a(c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        g();
    }

    public void g() {
        com.mbridge.msdk.config.component.url.model.a aVar = this.f36408i;
        if (aVar != null) {
            a(aVar.a(), this.f36408i.c(), this.f36408i.d(), this.f36408i.b());
        }
    }
}
