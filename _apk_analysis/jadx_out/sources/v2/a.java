package v2;

import android.util.Log;
import androidx.annotation.RestrictTo;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: RestrictiveDataManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J&\u0010\t\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001c\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, d2 = {"Lv2/a;", "", "Lbn/r;", "a", "", C3978d4.i.f31344j0, "e", "", "parameters", InneractiveMediationDefs.GENDER_FEMALE, "c", "paramKey", "b", "", "d", "Z", "enabled", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "Lv2/a$a;", "Ljava/util/List;", "restrictiveParamFilters", "", "Ljava/util/Set;", "restrictedEvents", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f85859a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = a.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<C1075a> restrictiveParamFilters = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<String> restrictedEvents = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: v2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RestrictiveDataManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lv2/a$a;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", C3978d4.i.f31344j0, "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "restrictiveParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class C1075a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String eventName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Map<String, String> restrictiveParams;

        public C1075a(@NotNull String str, @NotNull Map<String, String> map) {
            p.k(str, C3978d4.i.f31344j0);
            p.k(map, "restrictiveParams");
            this.eventName = str;
            this.restrictiveParams = map;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        @NotNull
        public final Map<String, String> b() {
            return this.restrictiveParams;
        }

        public final void c(@NotNull Map<String, String> map) {
            p.k(map, "<set-?>");
            this.restrictiveParams = map;
        }
    }

    public static final void a() {
        if (c3.a.d(a.class)) {
            return;
        }
        try {
            enabled = true;
            f85859a.c();
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
        }
    }

    @NotNull
    public static final String e(@NotNull String eventName) {
        if (c3.a.d(a.class)) {
            return null;
        }
        try {
            p.k(eventName, C3978d4.i.f31344j0);
            return enabled ? f85859a.d(eventName) ? "_removed_" : eventName : eventName;
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
            return null;
        }
    }

    public static final void f(@NotNull Map<String, String> map, @NotNull String str) {
        if (c3.a.d(a.class)) {
            return;
        }
        try {
            p.k(map, "parameters");
            p.k(str, C3978d4.i.f31344j0);
            if (enabled) {
                HashMap map2 = new HashMap();
                for (String str2 : new ArrayList(map.keySet())) {
                    String strB = f85859a.b(str, str2);
                    if (strB != null) {
                        map2.put(str2, strB);
                        map.remove(str2);
                    }
                }
                if (!map2.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        map.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            c3.a.b(th2, a.class);
        }
    }

    public final String b(String eventName, String paramKey) {
        try {
            if (c3.a.d(this)) {
                return null;
            }
            try {
            } catch (Exception e10) {
                Log.w(TAG, "getMatchedRuleType failed", e10);
            }
            for (C1075a c1075a : new ArrayList(restrictiveParamFilters)) {
                if (c1075a != null && p.f(eventName, c1075a.getEventName())) {
                    for (String str : c1075a.b().keySet()) {
                        if (p.f(paramKey, str)) {
                            return c1075a.b().get(str);
                        }
                        return null;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    public final void c() {
        String restrictiveDataSetting;
        if (c3.a.d(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f15289a;
            q qVarN = FetchedAppSettingsManager.n(t.m(), false);
            if (qVarN == null || (restrictiveDataSetting = qVarN.getRestrictiveDataSetting()) == null) {
                return;
            }
            if (restrictiveDataSetting.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
            restrictiveParamFilters.clear();
            restrictedEvents.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    p.j(next, "key");
                    C1075a c1075a = new C1075a(next, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        c1075a.c(j0.o(jSONObjectOptJSONObject));
                        restrictiveParamFilters.add(c1075a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        restrictedEvents.add(c1075a.getEventName());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            c3.a.b(th2, this);
        }
    }

    public final boolean d(String eventName) {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(eventName);
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }
}
