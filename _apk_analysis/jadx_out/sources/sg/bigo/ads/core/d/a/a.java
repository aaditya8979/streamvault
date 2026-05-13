package sg.bigo.ads.core.d.a;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83706a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83707b = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, C1044a> f83708c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.a.a$a, reason: collision with other inner class name */
    public static class C1044a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f83709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f83710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f83711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83712d;

        public static C1044a a(String str) {
            C1044a c1044a = new C1044a();
            c1044a.f83709a = str;
            c1044a.f83710b = true;
            c1044a.f83711c = true;
            c1044a.f83712d = BrandSafetyUtils.f51650g;
            return c1044a;
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                sg.bigo.ads.common.t.a.a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.f83709a = jSONObject.optString("event_id");
            this.f83710b = jSONObject.optInt("status") == 1;
            this.f83711c = jSONObject.optInt("delay") == 1;
            int iOptInt = jSONObject.optInt("expired") * 1000;
            this.f83712d = iOptInt;
            if (iOptInt == 0) {
                this.f83712d = BrandSafetyUtils.f51650g;
            }
        }
    }

    public a() {
        HashMap<String, C1044a> map = new HashMap<>();
        this.f83708c = map;
        b();
        map.put("06002002", C1044a.a("06002002"));
        map.put("06002007", C1044a.a("06002007"));
    }

    private void b() {
        this.f83706a = 10;
        this.f83707b = 900000;
        this.f83708c.clear();
    }

    public final int a() {
        return Math.round(this.f83706a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f83706a = jSONObject.optInt("delay_num", 10);
        int iOptInt = jSONObject.optInt("delay_interval") * 1000;
        this.f83707b = iOptInt;
        if (iOptInt == 0) {
            this.f83707b = 900000;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("event_config");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            C1044a c1044a = new C1044a();
            c1044a.a(jSONArrayOptJSONArray.optJSONObject(i10));
            if (q.b((CharSequence) c1044a.f83709a)) {
                this.f83708c.put(c1044a.f83709a, c1044a);
            }
        }
    }

    public final boolean a(String str) {
        C1044a c1044a = this.f83708c.get(str);
        if (c1044a == null) {
            return false;
        }
        return c1044a.f83710b;
    }
}
