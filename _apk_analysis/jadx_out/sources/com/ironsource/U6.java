package com.ironsource;

import android.content.Context;
import com.ironsource.Q6;
import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class U6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30545a = "adunit_data";

    public void a(Context context) {
        R6.b().c(context);
    }

    public void a(@NotNull String str, @NotNull Q6.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            R6 r6B = R6.b();
            JSONObject jSONObjectOptJSONObject2 = r6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f30545a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            r6B.b(f30545a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
        }
    }

    public void a(String str, Object obj) {
        R6.b().b(str, obj);
    }

    public void a(@NotNull String str, @NotNull Object obj, @NotNull Q6.a aVar) {
        try {
            String strName = aVar.name();
            R6 r6B = R6.b();
            JSONObject jSONObjectOptJSONObject = r6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f30545a);
            if (jSONObjectOptJSONObject == null) {
                r6B.b(f30545a, IronSourceVideoBridge.jsonObjectInit().put(strName, IronSourceVideoBridge.jsonObjectInit().put(str, obj)));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                r6B.b(f30545a, jSONObjectOptJSONObject.put(strName, IronSourceVideoBridge.jsonObjectInit().put(str, obj)));
            } else {
                r6B.b(f30545a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
        }
    }

    public void a(String str, JSONArray jSONArray) {
        R6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        R6.b().a(str, jSONObject);
    }

    public void a(Map<String, Object> map) {
        R6.b().a(map);
    }
}
