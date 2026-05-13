package sg.bigo.ads.controller.h;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f83414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f83416d;

    public a(String str) {
        a(str);
    }

    private void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f83415c = jSONObject.optString("data");
            this.f83413a = jSONObject.optInt("code");
            this.f83414b = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            r.a(jSONObject.optInt("timestamp", 0));
            this.f83416d = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.equals("data", next) && !TextUtils.equals("code", next) && !TextUtils.equals(NotificationCompat.CATEGORY_MESSAGE, next)) {
                    this.f83416d.put(next, jSONObject.opt(next));
                }
            }
        } catch (JSONException unused) {
            this.f83415c = "";
            this.f83413a = 1005;
            this.f83414b = "Invalid response.";
        }
    }

    public final boolean a() {
        return this.f83413a == 1;
    }

    public final boolean b() {
        return this.f83413a == -14;
    }
}
