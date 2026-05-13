package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: ADIDProvider.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35991a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35992b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35993c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35994d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35995e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35996f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.listener.a f35997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f35998h;

    public a(Context context, com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.f35998h = context;
        this.f35997g = aVar;
        a(context);
        b();
    }

    private void a(final Context context) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f36010b.c();
            }
        });
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f36011b.b(context);
            }
        });
    }

    private void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f35998h == null) {
            this.f35998h = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        if (str.equals(this.f35992b) && i10 == this.f35994d) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(this.f35998h).b(f.b.f33716c, str);
        com.mbridge.msdk.config.component.common.util.b.a(this.f35998h).b("isLimitAdId", i10);
    }

    private void b() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    this.f35995e = string2;
                    this.f35996f = k0.b(string2);
                    if (this.f35997g != null) {
                        HashMap map = new HashMap();
                        map.put("amazonIdInfo", this.f35995e);
                        map.put("amazonIdInfoB64", this.f35996f);
                        this.f35997g.a(map);
                    }
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("ADIDProvider", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("ADIDProvider", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                this.f35991a = advertisingIdInfo.getId();
                this.f35993c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
            } catch (Exception unused) {
                q0.d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
            }
        } catch (Exception unused2) {
            c.b bVarA = new com.mbridge.msdk.foundation.tools.c().a(context);
            this.f35991a = bVarA.a();
            this.f35993c = bVarA.b() ? 1 : 0;
        } catch (Throwable th2) {
            q0.b("ADIDProvider", th2.getMessage());
        }
        a(this.f35991a, this.f35993c);
        if (this.f35997g != null) {
            HashMap map = new HashMap();
            map.put(f.b.f33716c, this.f35991a);
            map.put("adIdB64", k0.b(this.f35991a));
            map.put("adIdLimit", String.valueOf(this.f35993c));
            this.f35997g.a(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f35992b = com.mbridge.msdk.config.component.common.util.b.a(this.f35998h).a(f.b.f33716c, "");
        this.f35994d = com.mbridge.msdk.config.component.common.util.b.a(this.f35998h).a("isLimitAdId", -1);
    }

    public Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = TextUtils.isEmpty(this.f35991a) ? TextUtils.isEmpty(this.f35992b) ? "" : this.f35992b : this.f35991a;
        int i10 = this.f35993c;
        if (i10 == -1 && (i10 = this.f35994d) == -1) {
            i10 = 0;
        }
        map.put(f.b.f33716c, str);
        map.put("adIdB64", TextUtils.isEmpty(str) ? "" : k0.b(str));
        map.put("adIdLimit", String.valueOf(i10));
        map.put("amazonIdInfo", this.f35995e);
        map.put("amazonIdInfoB64", this.f35996f);
        return map;
    }
}
