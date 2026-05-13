package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class bly {
    public static final Set<String> bly = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.bly.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static mwh ouw;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private static boolean f13390vm;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f13391cf;
    public int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f13392jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    @NonNull
    private String f13393ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Integer f13394le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13395lh;
    public volatile ConcurrentHashMap<String, ra.ouw> mwh;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f13396ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    @Nullable
    private String f13397rn;
    public com.bytedance.sdk.openadsdk.core.mwh.lh.lh ryl;
    public boolean tlj;

    @NonNull
    public String vt;
    public int yu;
    private Bitmap zih;

    public static class ouw {
        private static final bly ouw = new bly(0);
    }

    private bly() {
        this.f13392jg = false;
        this.fkw = 0;
        this.zih = null;
        this.f13394le = null;
        this.f13396ra = -1;
        this.mwh = null;
    }

    public /* synthetic */ bly(byte b10) {
        this();
    }

    public static int fkw() {
        try {
            String strOuw = ouw("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strOuw)) {
                return 0;
            }
            return Integer.valueOf(strOuw).intValue();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("TTAD.GlobalInfo", "getDomainIndex", th2.getMessage());
            return 0;
        }
    }

    public static boolean fkw(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public static boolean ko() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.uoy.ra());
    }

    public static int le() {
        try {
            String strOuw = ouw("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strOuw)) {
                return 0;
            }
            return Integer.valueOf(strOuw).intValue();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("TTAD.GlobalInfo", "getConfigFailTimes", th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void le(String str) {
        if (TextUtils.isEmpty(this.f13397rn)) {
            this.f13397rn = str;
        } else {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.f13397rn);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                        String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                            map.put(strOptString2, jSONObjectOptJSONObject2);
                        }
                    }
                }
                Collection collectionValues = map.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.f13397rn = jSONArray3.toString();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.fkw("TTAD.GlobalInfo", th2.getMessage());
            }
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "extra_data", this.f13397rn);
        }
    }

    public static void lh() {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "sdk_activate_init", Boolean.FALSE);
    }

    @NonNull
    public static bly ouw() {
        return ouw.ouw;
    }

    private static String ouw(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String ouw(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectRa = ra(str);
            if (jSONObjectRa == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectRa.getLong("time") <= j10) {
                return jSONObjectRa.getString("value");
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e10.getMessage());
        }
        return null;
    }

    public static void ouw(int i10) {
        if (i10 >= 0) {
            ouw("domain_index", String.valueOf(i10));
        }
    }

    public static void ouw(mwh mwhVar) {
        ouw = mwhVar;
    }

    public static void ouw(Integer num, int i10) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", -1) != i10) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(4, true);
        }
    }

    public static void ouw(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    private static JSONObject ra(String str) {
        String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", str, null);
        if (TextUtils.isEmpty(strVt)) {
            return null;
        }
        try {
            return PangleVideoBridge.jsonObjectInit(strVt);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public static boolean rn() {
        return f13390vm;
    }

    public static Pair<String, Long> vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectRa = ra(str);
            if (jSONObjectRa == null) {
                return null;
            }
            return new Pair<>(jSONObjectRa.getString("value"), Long.valueOf(jSONObjectRa.getLong("time")));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public static void vt(int i10) {
        if (i10 >= 0) {
            ouw("config_fail_times", String.valueOf(i10));
        }
    }

    public static boolean vt() {
        return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_file", "sdk_activate_init");
    }

    public static void zih() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            f13390vm = true;
        }
    }

    public final int bly() {
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_icon_id", "icon_id", 0) : this.yu;
    }

    public final boolean cf() {
        int i10 = this.f13396ra;
        return i10 < -1 || i10 > 1;
    }

    public final boolean jg() {
        return bly.contains(this.vt);
    }

    public final ra.ouw lh(String str) {
        try {
            if (this.mwh == null || str == null) {
                return null;
            }
            return this.mwh.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Bitmap mwh() {
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.component.utils.yu.ouw(com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "pause_icon", null)) : this.zih;
    }

    public final void ouw(@Nullable final String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            mwh mwhVar = ouw;
            if (mwhVar != null) {
                mwhVar.ouw("Data is very long, the longest is 1000");
            }
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
        }
        if (com.bytedance.sdk.openadsdk.utils.bs.le()) {
            jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.3
                @Override // java.lang.Runnable
                public final void run() {
                    bly.this.le(str);
                }
            });
        } else {
            le(str);
        }
    }

    public final void ouw(String str, ra.ouw ouwVar) {
        try {
            if (TextUtils.isEmpty(str) || ouwVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                com.bytedance.sdk.openadsdk.lh.tlj.ouw(str, ouwVar);
                return;
            }
            if (this.mwh == null) {
                synchronized (bly.class) {
                    if (this.mwh == null) {
                        this.mwh = new ConcurrentHashMap<>();
                    }
                }
            }
            if (this.mwh != null) {
                this.mwh.put(str, ouwVar);
            }
        } catch (Throwable unused) {
        }
    }

    public final void ouw(boolean z10) {
        this.tlj = z10;
    }

    @NonNull
    public final String pno() {
        if (TextUtils.isEmpty(this.f13393ko)) {
            this.f13393ko = ouw(zih.ouw());
        }
        return this.f13393ko;
    }

    public final String ra() {
        String str = this.f13395lh;
        if (str != null) {
            return str;
        }
        String strOuw = ouw("mediation_info", Long.MAX_VALUE);
        this.f13395lh = strOuw;
        if (strOuw == null) {
            this.f13395lh = "";
        }
        return this.f13395lh;
    }

    @Nullable
    public final String ryl() {
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "extra_data", null) : this.f13397rn;
    }

    public final int tlj() {
        Integer num = this.f13394le;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("sp_global_privacy", "tt_gdpr", -1);
    }

    public final String vm() {
        return com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("sp_global_file", "adx_id", "") : this.pno;
    }

    public final void vt(boolean z10) {
        this.f13392jg = z10;
    }

    @Nullable
    public final String yu() {
        if (TextUtils.isEmpty(this.vt)) {
            String strOuw = ouw("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strOuw)) {
                this.vt = strOuw;
            }
        }
        return this.vt;
    }

    public final void yu(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                com.bytedance.sdk.openadsdk.lh.tlj.ouw(str);
            } else if (this.mwh != null) {
                this.mwh.remove(str);
            }
        } catch (Throwable unused) {
        }
    }
}
