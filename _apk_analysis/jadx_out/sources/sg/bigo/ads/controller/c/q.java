package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements b.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f83198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f83199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f83201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f83203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f83204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f83205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f83206i;

    public q(@NonNull JSONObject jSONObject) {
        this.f83198a = jSONObject;
        this.f83199b = jSONObject.optInt("type", 0);
        this.f83200c = jSONObject.optString("value", "");
        this.f83201d = jSONObject.optString("name", "");
        this.f83202e = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f83203f = jSONObject.optInt("replace", 0);
        this.f83204g = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray == null) {
            this.f83205h = new String[0];
            this.f83206i = new String[0];
            return;
        }
        this.f83205h = new String[jSONArrayOptJSONArray.length()];
        this.f83206i = new String[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                this.f83205h[i10] = jSONObjectOptJSONObject.optString("token", "");
                this.f83206i[i10] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.f
    public final JSONObject a() {
        return this.f83198a;
    }
}
