package sg.bigo.ads.api.core;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.e;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements sg.bigo.ads.api.a.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.api.a.f[] f81876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.api.a.f f81877f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f81872a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f81873b = "en";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f81874c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f81875d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f81878g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f81879h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81880i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f81881j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public e.b f81883l = new e.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public e.a f81884m = new e.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public e.c[] f81882k = new e.c[0];

    private void a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new j(jSONObjectOptJSONObject));
                }
            }
            j[] jVarArr = new j[arrayList.size()];
            this.f81876e = jVarArr;
            this.f81876e = (sg.bigo.ads.api.a.f[]) arrayList.toArray(jVarArr);
        }
    }

    @Override // sg.bigo.ads.api.a.e
    public final String a() {
        return this.f81874c;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f81872a = jSONObject.optLong("form_id", 0L);
            this.f81874c = jSONObject.optString("title", "");
            this.f81873b = jSONObject.optString("ad_lang", "en");
            this.f81875d = jSONObject.optString(UnifiedMediationParams.KEY_DESCRIPTION, "");
            this.f81878g = jSONObject.optString("purpose", "");
            this.f81880i = jSONObject.optInt("color", 0);
            this.f81881j = jSONObject.optInt("form_style_id", 0);
            this.f81879h = jSONObject.optString("extra", "");
            a(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
            if (jSONObjectOptJSONObject != null) {
                this.f81877f = new j(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("questions");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject2 != null) {
                        arrayList.add(new e.c(jSONObjectOptJSONObject2));
                    }
                }
                e.c[] cVarArr = new e.c[arrayList.size()];
                this.f81882k = cVarArr;
                this.f81882k = (e.c[]) arrayList.toArray(cVarArr);
            }
            e.b bVar = this.f81883l;
            String strOptString = jSONObject.optString("privacy", "");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    bVar.f81796a = jSONObject2.optString("name", "");
                    bVar.f81797b = jSONObject2.optString("url", "");
                } catch (JSONException unused) {
                }
            }
            e.a aVar = this.f81884m;
            String strOptString2 = jSONObject.optString("feedback", "");
            if (TextUtils.isEmpty(strOptString2)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString2);
            aVar.f81792a = jSONObject3.optString("title", "");
            aVar.f81793b = jSONObject3.optString(UnifiedMediationParams.KEY_DESCRIPTION, "");
            aVar.f81794c = jSONObject3.optString("cta", "");
            aVar.f81795d = jSONObject3.optString("land_url", "");
        } catch (JSONException unused2) {
        }
    }

    @Override // sg.bigo.ads.api.a.e
    public final String b() {
        return this.f81875d;
    }

    @Override // sg.bigo.ads.api.a.e
    public final long c() {
        return this.f81872a;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int d() {
        return this.f81880i;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String e() {
        return this.f81873b;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int f() {
        return this.f81881j;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String g() {
        return this.f81879h;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String h() {
        return this.f81878g;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f[] i() {
        return this.f81876e;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f j() {
        sg.bigo.ads.api.a.f[] fVarArr = this.f81876e;
        if (fVarArr == null || fVarArr.length <= 0) {
            return null;
        }
        return fVarArr[0];
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f k() {
        return this.f81877f;
    }

    @Override // sg.bigo.ads.api.a.e
    public final e.b l() {
        return this.f81883l;
    }

    @Override // sg.bigo.ads.api.a.e
    public final e.c[] m() {
        return this.f81882k;
    }

    @Override // sg.bigo.ads.api.a.e
    public final e.a n() {
        return this.f81884m;
    }
}
