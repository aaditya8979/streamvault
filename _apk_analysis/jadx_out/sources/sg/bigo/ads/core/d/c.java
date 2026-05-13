package sg.bigo.ads.core.d;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f83737e = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.core.d.a.a f83738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.core.d.b.b f83739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f83740c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f83741d;

    private c() {
    }

    public static c a() {
        return f83737e;
    }

    private static boolean a(String str) {
        return "06002007".equals(str) && sg.bigo.ads.common.x.a.q();
    }

    private void b(final String str, final Map<String, String> map) {
        d.a(3, new Runnable() { // from class: sg.bigo.ads.core.d.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    sg.bigo.ads.common.g.b.b bVarA = sg.bigo.ads.core.d.b.b.b(str, map).a(c.this.f83741d, 0L);
                    HashMap map2 = new HashMap();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_id", bVarA.f82129b);
                    jSONObject.put("event_info", bVarA.f82130c);
                    jSONArray.put(jSONObject);
                    map2.put("sdk_events", jSONArray);
                    j jVar = a.a().f83705a;
                    if (jVar != null) {
                        jVar.a(map2, null);
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }

    public final void a(String str, Map<String, String> map) {
        String strValueOf;
        String str2;
        String strConcat;
        if (a(str) || "06002066".equals(str)) {
            b(str, map);
            return;
        }
        if (this.f83738a == null) {
            strValueOf = String.valueOf(str);
            str2 = "mConfig is null, eventId =";
        } else {
            if (sg.bigo.ads.common.x.a.q()) {
                return;
            }
            if (!this.f83740c.get()) {
                strConcat = "please execute initStatic first";
                sg.bigo.ads.common.t.a.a(0, "Stats", strConcat);
            }
            if (q.a((CharSequence) str) || map == null) {
                strValueOf = String.valueOf(str);
                str2 = "eventId is empty or events is null, eventId =";
            } else {
                if (this.f83738a.a(str)) {
                    sg.bigo.ads.core.d.b.b bVar = this.f83739b;
                    if (bVar != null) {
                        bVar.a(str, map);
                        return;
                    }
                    return;
                }
                strValueOf = String.valueOf(str);
                str2 = "not hit report eventId=";
            }
        }
        strConcat = str2.concat(strValueOf);
        sg.bigo.ads.common.t.a.a(0, "Stats", strConcat);
    }
}
