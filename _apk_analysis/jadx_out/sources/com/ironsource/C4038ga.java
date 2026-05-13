package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3978d4;
import com.ironsource.C4266t8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4038ga {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f31805b = "ga";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31806c = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f31807d = "version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f31808e = "back_button_state";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f31809f = "search_keys";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f31810g = "^\\d+_\\d+$";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C4038ga f31811h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f31812a;

    private C4038ga(Context context) {
        this.f31812a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C4038ga a(Context context) {
        if (f31811h == null) {
            f31811h = new C4038ga(context);
        }
        return f31811h;
    }

    private boolean b(String str) {
        return str.matches(f31810g);
    }

    public static synchronized C4038ga e() {
        return f31811h;
    }

    public String a(String str) {
        String string = this.f31812a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f31812a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f31812a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f31812a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f31812a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(string);
            if (jSONObjectJsonObjectInit.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject(str2);
            if (jSONObject.isNull(str3)) {
                return false;
            }
            jSONObject.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f31812a.edit();
            editorEdit.putString("ssaUserData", jSONObjectJsonObjectInit.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public C4266t8.a b() {
        int i10 = Integer.parseInt(this.f31812a.getString(f31808e, "2"));
        return i10 == 0 ? C4266t8.a.None : i10 == 1 ? C4266t8.a.Device : i10 == 2 ? C4266t8.a.Controller : C4266t8.a.Controller;
    }

    public String c() {
        return this.f31812a.getString("version", Y1.f30690f);
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f31812a.edit();
        editorEdit.putString(f31808e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.f31812a.getString(f31809f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C4042ge c4042ge = new C4042ge(string);
            if (c4042ge.a(C3978d4.i.R)) {
                try {
                    arrayList.addAll(c4042ge.a((JSONArray) c4042ge.b(C3978d4.i.R)));
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return arrayList;
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f31812a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.f31812a.edit();
        editorEdit.putString(f31809f, str);
        editorEdit.apply();
    }
}
