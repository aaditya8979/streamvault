package com.safedk.android.analytics.reporters;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.e;
import com.safedk.android.utils.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52844a = "exceptions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52845b = "type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52846c = "message";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52847d = "lines";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52848e = "proguard_map_uuid";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52849g = "build_params";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f52850h = "crash_stacktrace";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52851i = "threads_traces";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52852j = "is_low_memory";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Context f52853f;

    public b() {
        this.f52853f = null;
        if (SafeDK.getInstance() != null) {
            this.f52853f = SafeDK.getInstance().l();
        }
    }

    public b(Context context) {
        this.f52853f = null;
        this.f52853f = context;
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        a(Build.class, "", bundle);
        a(Build.VERSION.class, "VERSION", bundle);
        return bundle;
    }

    private void a(Class<?> cls, String str, Bundle bundle) {
        StringBuilder sb2 = new StringBuilder();
        for (Field field : cls.getFields()) {
            StringBuilder sb3 = new StringBuilder();
            if (str != null && str.length() > 0) {
                sb3.append(str).append('.');
            }
            sb3.append(field.getName());
            try {
                Object obj = field.get(null);
                if (obj != null) {
                    if (field.getType().isArray()) {
                        bundle.putParcelableArrayList(sb3.toString(), (ArrayList) Arrays.asList(obj));
                    } else {
                        bundle.putString(sb3.toString(), obj.toString());
                    }
                }
            } catch (IllegalAccessException e10) {
                sb2.append("N/A");
            } catch (IllegalArgumentException e11) {
                sb2.append("N/A");
            } catch (Exception e12) {
            }
        }
    }

    private void a(Throwable th2, JSONArray jSONArray) throws JSONException {
        if (th2 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", th2.getClass());
        jSONObject.put("message", th2.getMessage());
        a(jSONObject, th2.getStackTrace());
        jSONArray.put(jSONObject);
    }

    private void a(JSONObject jSONObject, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("c", stackTraceElement.getClassName());
            jSONObject2.put(InneractiveMediationDefs.GENDER_MALE, stackTraceElement.getMethodName());
            jSONObject2.put(InneractiveMediationDefs.GENDER_FEMALE, stackTraceElement.getFileName());
            jSONObject2.put("l", stackTraceElement.getLineNumber());
            jSONObject2.put("n", stackTraceElement.isNativeMethod());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(f52847d, jSONArray);
    }

    protected JSONObject a(Thread thread, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", thread.getName());
        a(jSONObject, stackTraceElementArr);
        return jSONObject;
    }

    protected JSONObject a(Throwable th2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(f52844a, jSONArray);
        a(th2, jSONArray);
        for (Throwable cause = th2.getCause(); cause != null; cause = cause.getCause()) {
            a(cause, jSONArray);
        }
        return jSONObject;
    }

    protected JSONObject a(Throwable th2, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f52849g, k.a(a()));
        jSONObject.put(f52852j, e.b(this.f52853f));
        jSONObject.put(f52850h, a(th2));
        if (z10) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                jSONArray.put(a(entry.getKey(), entry.getValue()));
            }
            jSONObject.put(f52851i, jSONArray);
        }
        String proguardMD5 = SafeDK.getProguardMD5();
        if (!TextUtils.isEmpty(proguardMD5)) {
            jSONObject.put(f52848e, proguardMD5);
        }
        return jSONObject;
    }
}
