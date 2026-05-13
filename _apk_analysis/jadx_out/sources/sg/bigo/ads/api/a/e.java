package sg.bigo.ads.api.a;

import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f81792a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f81793b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f81794c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f81795d = "";
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f81796a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f81797b = "";
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f81798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f81799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f81800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f81801d;

        public c(@NonNull JSONObject jSONObject) {
            this.f81798a = "";
            this.f81799b = 0;
            this.f81800c = null;
            this.f81801d = "";
            this.f81798a = jSONObject.optString("title", "");
            this.f81799b = jSONObject.optInt("type", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.f81800c = new String[jSONArrayOptJSONArray.length()];
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f81800c[i10] = jSONArrayOptJSONArray.optString(i10);
                }
            }
            this.f81801d = jSONObject.optString("id", "");
        }
    }

    String a();

    String b();

    long c();

    int d();

    String e();

    int f();

    String g();

    String h();

    f[] i();

    f j();

    f k();

    b l();

    c[] m();

    a n();
}
