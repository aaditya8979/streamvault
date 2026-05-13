package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53154a = "sdk_key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f53155b = "userUUID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53156c = "configuration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f53157d = "last_reported_device_at";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f53158e = "last_reported_version";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f53159f = "configETag";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f53160g = "sdk_version";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f53161h = "versionCode";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f53162i = "randomToken";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f53163j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f53164k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f53165l = "SharedPreferencesUtils";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f53166m = "offlineMode";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f53167n = "age";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f53168o = "region";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f53169p = "last_foreground_time";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f53170q = "last_foreground_report";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f53171r = "sdk_versions";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f53172s = "is_reported";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f53173w = "safedk_stored_version";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f53174x = "§§";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SharedPreferences f53175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f53176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private JSONObject f53177v;

    public i(SharedPreferences sharedPreferences, boolean z10) {
        this.f53175t = sharedPreferences;
        this.f53176u = z10;
    }

    public static Bundle a(SharedPreferences sharedPreferences, String str) {
        Logger.d(f53165l, "loadPreferencesBundle started, key=" + str);
        Bundle bundle = new Bundle();
        Map<String, ?> all = sharedPreferences.getAll();
        String str2 = str + f53174x;
        HashSet<String> hashSet = new HashSet();
        for (String str3 : all.keySet()) {
            if (str3.startsWith(str2)) {
                String strB = b(str3, str2);
                if (strB.contains(f53174x)) {
                    hashSet.add(a(strB, f53174x));
                } else {
                    Object obj = all.get(str3);
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            bundle.putInt(strB, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strB, ((Long) obj).longValue());
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(strB, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof CharSequence) {
                            bundle.putString(strB, ((CharSequence) obj).toString());
                        } else if (obj instanceof HashSet) {
                            bundle.putStringArrayList(strB, new ArrayList<>((HashSet) obj));
                        }
                    }
                }
            }
        }
        for (String str4 : hashSet) {
            bundle.putBundle(str4, a(sharedPreferences, str2 + str4));
        }
        return bundle;
    }

    public static String a(String str, String str2) {
        if (b(str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
    }

    public static void a(SharedPreferences.Editor editor, String str, Bundle bundle) {
        String str2 = str + f53174x;
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj == null) {
                editor.remove(str2 + str3);
            } else if (obj instanceof Integer) {
                editor.putInt(str2 + str3, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str2 + str3, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str2 + str3, ((Boolean) obj).booleanValue());
            } else if (obj instanceof CharSequence) {
                editor.putString(str2 + str3, ((CharSequence) obj).toString());
            } else if ((obj instanceof ArrayList) && ((ArrayList) obj).size() > 0 && (((ArrayList) obj).get(0) instanceof String)) {
                editor.putStringSet(str2 + str3, new HashSet((ArrayList) obj));
            } else if (obj instanceof Bundle) {
                a(editor, str2 + str3, (Bundle) obj);
            }
        }
    }

    private void a(Map<String, String> map) {
        try {
            this.f53177v = new JSONObject(this.f53175t.getString(f53171r, JsonUtils.EMPTY_JSON));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(key);
                Logger.d(f53165l, "addDiscoveredVersionsToVersionsJson sdkPackage=" + key + ", version=" + value + ", uuid=" + sdkUUIDByPackage);
                if (sdkUUIDByPackage != null) {
                    try {
                    } catch (JSONException e10) {
                        Logger.d(f53165l, "error in addDiscoveredVersionsToVersionsJson", e10);
                    }
                    if (sdkUUIDByPackage.length() > 0 && value != null && value.length() > 0) {
                        this.f53177v.put(sdkUUIDByPackage, value);
                    }
                }
                Logger.d(f53165l, "UUID for sdkPackage " + key + "is empty and will not be added to sdkVersionsJson");
            }
            a(this.f53177v);
        } catch (Throwable th2) {
            Logger.e(f53165l, "Exception in addDiscoveredVersionsToVersionsJson", th2);
        }
    }

    private void a(JSONObject jSONObject) {
        SharedPreferences.Editor editorEdit = this.f53175t.edit();
        editorEdit.putString(f53171r, jSONObject.toString());
        Logger.d(f53165l, "saveSdkVersions saved (" + jSONObject.length() + " items) : " + jSONObject.toString());
        editorEdit.commit();
    }

    public static String b(String str, String str2) {
        return (b(str) || b(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f53175t.getString(f53155b, null);
    }

    public void a(long j10) {
        SharedPreferences.Editor editorEdit = this.f53175t.edit();
        editorEdit.putLong(f53169p, j10);
        editorEdit.commit();
    }

    public boolean a(int i10, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f53175t.edit();
            editorEdit.putInt(f53161h, i10);
            editorEdit.putString(f53162i, str);
            editorEdit.putString("sdk_key", str2);
            Logger.d(f53165l, "save sdk key " + str2 + ", token " + str + ", version code " + i10);
            return editorEdit.commit();
        } catch (Throwable th2) {
            Logger.d(f53165l, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
            return false;
        }
    }

    public boolean a(Bundle bundle) {
        try {
            SharedPreferences.Editor editorEdit = this.f53175t.edit();
            String strP = p();
            String strA = a();
            editorEdit.clear();
            a(editorEdit, f53156c, bundle);
            if (strP != null) {
                editorEdit.putString(f53173w, strP);
            }
            if (strA != null) {
                editorEdit.putString(f53155b, strA);
            }
            return editorEdit.commit();
        } catch (Throwable th2) {
            Logger.e(f53165l, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
            return false;
        }
    }

    public boolean a(String str) {
        SharedPreferences.Editor editorEdit = this.f53175t.edit();
        editorEdit.putString(f53155b, str);
        return editorEdit.commit();
    }

    public boolean b() {
        return this.f53175t.getBoolean(f53166m, this.f53176u);
    }

    public Integer c() {
        int i10 = this.f53175t.getInt("age", -1);
        if (i10 < 0) {
            return null;
        }
        return new Integer(i10);
    }

    public boolean c(String str) {
        SharedPreferences.Editor editorEdit = this.f53175t.edit();
        editorEdit.putString(f53173w, str);
        return editorEdit.commit();
    }

    public String d() {
        return this.f53175t.getString("region", null);
    }

    public Bundle e() {
        Logger.d(f53165l, "getConfiguration started");
        return a(this.f53175t, f53156c);
    }

    public long f() {
        return this.f53175t.getLong(f53157d, 0L);
    }

    public int g() {
        return this.f53175t.getInt(f53158e, 0);
    }

    public long h() {
        return this.f53175t.getLong(f53169p, 0L);
    }

    public long i() {
        return this.f53175t.getLong(f53170q, 0L);
    }

    public JSONObject j() {
        return this.f53177v;
    }

    public String k() {
        return this.f53175t.getString(f53159f, null);
    }

    public boolean l() {
        return this.f53175t.contains(f53156c);
    }

    public String m() {
        String string = this.f53175t.getString("sdk_key", null);
        Logger.d(f53165l, "read sdk key " + string);
        return string;
    }

    public int n() {
        int i10 = this.f53175t.getInt(f53161h, 0);
        Logger.d(f53165l, "read version code " + i10);
        return i10;
    }

    public String o() {
        String string = this.f53175t.getString(f53162i, null);
        Logger.d(f53165l, "read token " + string);
        return string;
    }

    public String p() {
        return this.f53175t.getString(f53173w, null);
    }
}
