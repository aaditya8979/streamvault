package sg.bigo.ads.controller.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f83028a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg.bigo.ads.common.h.a.a f83029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sg.bigo.ads.core.d.a.a f83030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sg.bigo.ads.core.b.a.a f83031g;

    public d(@NonNull Context context) {
        super(context);
        this.f83028a = new q();
        this.f83029e = new sg.bigo.ads.common.h.a.a();
        this.f83030f = new sg.bigo.ads.core.d.a.a();
        this.f83031g = new sg.bigo.ads.core.b.a.a();
    }

    @Override // sg.bigo.ads.common.e
    public final void a(Context context) {
        super.a(context);
        if (!TextUtils.isEmpty(this.f83051w)) {
            try {
                d(new JSONObject(this.f83051w));
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.f83050v)) {
            try {
                a(new JSONObject(this.f83050v));
            } catch (JSONException unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f83049u)) {
            try {
                b(new JSONObject(this.f83049u));
            } catch (JSONException unused3) {
            }
        }
        if (TextUtils.isEmpty(this.f83052x)) {
            return;
        }
        try {
            c(new JSONObject(this.f83052x));
        } catch (JSONException unused4) {
        }
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void a(JSONObject jSONObject) {
        this.f83028a.a(jSONObject);
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "GlobalConfigData";
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void b(JSONObject jSONObject) {
        this.f83029e.a(jSONObject);
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void c(JSONObject jSONObject) {
        this.f83030f.a(jSONObject);
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void d(JSONObject jSONObject) {
        this.f83031g.a(jSONObject);
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final q m() {
        return this.f83028a;
    }

    @NonNull
    public final String toString() {
        return "GlobalConfigData{huaweiAdIdInfo=" + this.f83036h + ", googleAdIdInfo=" + this.f83037i + ", location=" + this.f83038j + ", state=" + this.f83041m + ", configId=" + this.f83042n + ", interval=" + this.f83043o + ", token='" + this.f83044p + "', antiBan='" + this.f83045q + "', strategy=" + this.f83046r + ", abflags='" + this.f83047s + "', country='" + this.f83048t + "', creatives='" + this.f83049u + "', trackConfig='" + this.f83050v + "', callbackConfig='" + this.f83051w + "', reportConfig='" + this.f83052x + "', appCheckConfig='" + this.f83053y + "', uid='" + this.f83054z + "', maxRequestNum=" + this.A + ", negFeedbackState=" + this.B + ", omUrl='" + this.C + "', globalSwitch=" + this.E.f81892a + ", bannerJsUrl='" + this.D + "', reqCountry='" + this.L + "', appFlag='" + this.N + "'}";
    }
}
