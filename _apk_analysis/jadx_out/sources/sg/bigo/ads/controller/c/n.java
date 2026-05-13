package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f83175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f83176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f83178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f83180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f83181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f83182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f83183i;

    public n(@NonNull JSONObject jSONObject) {
        this.f83175a = jSONObject.optString("icon");
        this.f83176b = jSONObject.optString("title");
        this.f83177c = jSONObject.optString("rate");
        this.f83178d = jSONObject.optString("comments");
        this.f83179e = jSONObject.optString("downloads");
        this.f83180f = jSONObject.optString(UnifiedMediationParams.KEY_DESCRIPTION);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("genre");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.f83181g = new String[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                this.f83181g[i10] = jSONArrayOptJSONArray.optString(i10);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(ImpressionLog.f51750t);
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            this.f83182h = new String[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                this.f83182h[i11] = jSONArrayOptJSONArray2.optString(i11);
            }
        }
        this.f83183i = jSONObject.optString("name");
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String a() {
        return this.f83175a;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String b() {
        return this.f83176b;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String c() {
        return this.f83180f;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String[] d() {
        return this.f83181g;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String[] e() {
        return this.f83182h;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String f() {
        return this.f83183i;
    }
}
