package sg.bigo.ads.controller.a;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.events.CrashEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends sg.bigo.ads.common.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f82815a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f82817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.c f82818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.b f82819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.b f82820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.f f82821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.e f82822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.h f82823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.d f82824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f82825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f82826o;

    public a(@NonNull Context context, sg.bigo.ads.api.a.h hVar) {
        super(context);
        this.f82818g = new sg.bigo.ads.controller.a.a.c(sg.bigo.ads.b.a());
        this.f82819h = new sg.bigo.ads.controller.a.a.b(sg.bigo.ads.b.b(), "");
        this.f82820i = new sg.bigo.ads.controller.a.a.b(sg.bigo.ads.b.c(), "");
        this.f82821j = new sg.bigo.ads.controller.a.a.f();
        this.f82822k = new sg.bigo.ads.controller.a.a.e();
        this.f82823l = new sg.bigo.ads.controller.a.a.h();
        this.f82824m = new sg.bigo.ads.controller.a.a.d(hVar);
        this.f82817f = "SDK";
        this.f82826o = false;
    }

    private static JSONObject a(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_antiban_config.dat";
    }

    @NonNull
    public final h a(String str, String str2, Map<String, String> map, String str3, int i10) {
        if (TextUtils.isEmpty(str)) {
            return h.a("", false, 4003, "config content is empty");
        }
        String strTrim = str.trim();
        boolean zStartsWith = strTrim.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d);
        final ArrayList arrayList = new ArrayList();
        if (!zStartsWith) {
            String strA = sg.bigo.ads.common.j.a.a(strTrim, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", new ValueCallback<Exception>() { // from class: sg.bigo.ads.controller.a.a.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Exception exc) {
                    Exception exc2 = exc;
                    if (exc2 != null) {
                        arrayList.add(exc2);
                    }
                }
            });
            if (TextUtils.isEmpty(strA)) {
                sg.bigo.ads.common.t.a.a(0, "AntiBanUtils", "decrypt error, decrypted content is empty.");
                strTrim = null;
            } else {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBanUtils", "decrypt, cryptStr=" + strTrim + ", hexStringSecKey=FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F, decryptStr=" + strA);
                strTrim = strA;
            }
        }
        String str4 = strTrim;
        if (!sg.bigo.ads.common.utils.k.a((Collection) arrayList)) {
            this.f82816e = true;
            return h.a(str4, zStartsWith, 4004, Log.getStackTraceString((Throwable) arrayList.get(0)));
        }
        try {
            JSONObject jSONObject = new JSONObject(str4);
            int iOptInt = jSONObject.optInt("version", 0);
            int i11 = this.f82825n;
            if (!(iOptInt < i11 ? false : iOptInt == i11 ? this.f82826o : true)) {
                return new h(str4, false, zStartsWith, 0, "local config version is " + this.f82825n + ", remote version is " + iOptInt);
            }
            boolean z10 = iOptInt == i11;
            this.f82825n = iOptInt;
            this.f82815a = zStartsWith;
            this.f82817f = str2;
            this.f82818g.a(a(jSONObject.optJSONObject("cfg_svr")), z10, str3, i10);
            this.f82819h.a(a(jSONObject.optJSONObject("report_svr")), z10, str3, i10);
            this.f82820i.a(a(jSONObject.optJSONObject("ad_svr")), z10, str3, i10);
            if (!z10) {
                this.f82821j.a(a(jSONObject.optJSONObject("third_pay_svr")));
                this.f82822k.a(a(jSONObject.optJSONObject("third_free_svr")));
                sg.bigo.ads.controller.a.a.h hVar = this.f82823l;
                JSONObject jSONObjectA = a(jSONObject.optJSONObject("uri_opt_timeout"));
                synchronized (hVar) {
                    hVar.f82886a = jSONObjectA.optLong("getsdkconfig", 0L) * 1000;
                    hVar.f82887b = jSONObjectA.optLong("getuniad", 0L) * 1000;
                    hVar.f82888c = jSONObjectA.optLong("unicallback", 0L) * 1000;
                    hVar.f82889d = jSONObjectA.optLong("getuniconfig", 0L) * 1000;
                    hVar.f82890e = jSONObjectA.optLong("reportunibaina", 0L) * 1000;
                }
                sg.bigo.ads.controller.a.a.d dVar = this.f82824m;
                JSONObject jSONObjectA2 = a(jSONObject.optJSONObject("req_pool_size"));
                synchronized (dVar) {
                    dVar.f82856a = jSONObjectA2.optInt("sdk_config", 3);
                    dVar.f82857b = jSONObjectA2.optInt(CrashEvent.f52788e, 2);
                    dVar.f82858c = jSONObjectA2.optInt("config_ad", 12);
                    dVar.f82859d = jSONObjectA2.optInt("callback", 3);
                    dVar.f82860e = jSONObjectA2.optInt("vast_wrapper", 3);
                    dVar.f82861f = jSONObjectA2.optInt("tracker", 10);
                    dVar.f82862g = jSONObjectA2.optInt("creative", 5);
                }
                if (!sg.bigo.ads.common.utils.k.a(map)) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        a(entry.getKey(), entry.getValue());
                    }
                }
            }
            this.f82826o = false;
            return new h(str4, zStartsWith);
        } catch (JSONException e10) {
            return h.a(str4, zStartsWith, 4005, Log.getStackTraceString(e10));
        }
    }

    @Override // sg.bigo.ads.common.e
    public final void a(Context context) {
        super.a(context);
        if (this.f81996d) {
            try {
                new File(o.a(context), "bigoad_antiban.dat").deleteOnExit();
                new File(o.a(context), "bigoad_api_antiban.dat").deleteOnExit();
            } catch (Exception unused) {
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(4);
        parcel.writeInt(this.f82825n);
        n.a(parcel, this.f82815a);
        n.a(parcel, this.f82816e);
        parcel.writeString(this.f82817f);
        n.a(parcel, this.f82818g);
        n.a(parcel, this.f82819h);
        n.a(parcel, this.f82820i);
        n.a(parcel, this.f82821j);
        n.a(parcel, this.f82822k);
        n.a(parcel, this.f82823l);
        n.a(parcel, this.f82824m);
        n.a(parcel, this.f82826o);
    }

    public final boolean a(@NonNull String str, @NonNull String str2) {
        return this.f82820i.a(str, str2) | this.f82818g.a(str, str2) | false | this.f82819h.a(str, str2);
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "AntiBanConfig";
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        if (n.a(parcel, 4) < 4) {
            return;
        }
        this.f82825n = n.a(parcel, 0);
        this.f82815a = n.b(parcel, false);
        this.f82816e = n.b(parcel, false);
        this.f82817f = n.a(parcel, "SDK");
        n.b(parcel, this.f82818g);
        n.b(parcel, this.f82819h);
        n.b(parcel, this.f82820i);
        n.b(parcel, this.f82821j);
        n.b(parcel, this.f82822k);
        n.b(parcel, this.f82823l);
        n.b(parcel, this.f82824m);
        this.f82826o = n.b(parcel, true);
    }

    public final void c() {
        sg.bigo.ads.controller.a.a.c cVar = this.f82818g;
        if (cVar != null) {
            cVar.a();
        }
        sg.bigo.ads.controller.a.a.b bVar = this.f82819h;
        if (bVar != null) {
            bVar.a();
        }
        sg.bigo.ads.controller.a.a.b bVar2 = this.f82820i;
        if (bVar2 != null) {
            bVar2.a();
        }
        a(0L);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
