package sg.bigo.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: sg.bigo.ads.c$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81929a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            f81929a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81929a[ConsentOptions.CCPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81929a[ConsentOptions.COPPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81929a[ConsentOptions.GDPR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final List<a> f81930h = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f81931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f81932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f81933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f81934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f81935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f81936f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f81937g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f81931a = str;
            this.f81932b = str2;
            this.f81933c = str3;
            this.f81934d = str4;
            this.f81935e = str5;
            this.f81936f = str6;
            this.f81937g = str7;
        }

        public static List<a> a() {
            return f81930h;
        }

        public static void a(a aVar) {
            f81930h.add(aVar);
        }

        public static JSONObject b(a aVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("consent_type", aVar.f81931a);
                jSONObject.put("last_status", aVar.f81932b);
                jSONObject.put("cur_status", aVar.f81933c);
                jSONObject.put("get_token", aVar.f81934d);
                jSONObject.put("tcf_applias", aVar.f81935e);
                jSONObject.put("tcf_purpose", aVar.f81936f);
                jSONObject.put("tcf_interests", aVar.f81937g);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public static void b() {
            f81930h.clear();
        }

        public static Map<String, String> c() {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = f81930h.iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
            map.put("user_consent_event", jSONArray.toString());
            map.put(CommonUrlParts.UUID, sg.bigo.ads.common.x.a.r());
            return map;
        }
    }
}
