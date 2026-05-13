package sg.bigo.ads.controller.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3978d4;
import com.ironsource.Ne;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements b.InterfaceC1008b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f83150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f83152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONArray f83153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f83155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f83156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f83157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f83158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f83159j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f83160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f83161l;

    public k(@NonNull JSONObject jSONObject) {
        this.f83150a = jSONObject.optString("land_url", "");
        this.f83151b = jSONObject.optString("deeplink_url", "");
        this.f83152c = jSONObject.optInt("web_ad_model", 0);
        this.f83154e = jSONObject.optString("return_tracker_url", "");
        this.f83155f = jSONObject.optInt("land_preload_type", 0);
        this.f83156g = jSONObject.optString("click_open_pkg", "");
        this.f83157h = jSONObject.optInt("probe_interval", 0);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Ne.f29912a1);
        if (jSONObjectOptJSONObject != null) {
            this.f83158i = jSONObjectOptJSONObject.optString("host", "");
            String strOptString = jSONObjectOptJSONObject.optString("value", "");
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strOptString)) {
                b(strOptString);
            }
        } else {
            this.f83158i = "";
        }
        this.f83160k = jSONObject.optString("pre_landing_url", "");
        this.f83161l = jSONObject.optInt("pre_landing_scene", 0);
        this.f83153d = jSONObject.optJSONArray("webview_bundle");
    }

    private void b(String str) {
        this.f83159j.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(C3978d4.j.f31381c)) {
            if (str2.indexOf("=") >= 0) {
                String strSubstring = str2.substring(0, str2.indexOf("="));
                if (!TextUtils.isEmpty(strSubstring)) {
                    String str3 = this.f83159j.get(strSubstring);
                    if (sg.bigo.ads.common.utils.q.b((CharSequence) str3)) {
                        str2 = str3 + C3978d4.j.f31381c + str2;
                    }
                    this.f83159j.put(strSubstring, str2);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final String a() {
        return this.f83150a;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final void a(@NonNull String str) {
        this.f83150a = str;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final String b() {
        return this.f83151b;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final int c() {
        return this.f83152c;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final JSONArray d() {
        return this.f83153d;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final String e() {
        return this.f83154e;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final int f() {
        return this.f83155f;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final String g() {
        return this.f83156g;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final String h() {
        return this.f83158i;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final Map<String, String> i() {
        return this.f83159j;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final String j() {
        return this.f83160k;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1008b
    public final int k() {
        return this.f83161l;
    }
}
