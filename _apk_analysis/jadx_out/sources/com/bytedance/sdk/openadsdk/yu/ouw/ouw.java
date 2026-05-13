package com.bytedance.sdk.openadsdk.yu.ouw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jae;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.tc;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3978d4;
import com.ironsource.C4336xa;
import com.ironsource.Q6;
import com.ironsource.Z3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ouw {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static volatile ouw f14510le;
    private final String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Context f14511lh;
    private long ouw;
    private int vt;
    private final boolean yu = lh();

    private ouw() {
        Context contextOuw = zih.ouw();
        if (contextOuw != null) {
            this.f14511lh = contextOuw.getApplicationContext();
        }
        this.fkw = DeviceUtils.lh(this.f14511lh) ? "tv" : DeviceUtils.vt(this.f14511lh) ? "android_pad" : "android";
    }

    private static boolean lh() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static ouw ouw() {
        if (f14510le == null) {
            synchronized (ouw.class) {
                if (f14510le == null) {
                    f14510le = new ouw();
                }
            }
        }
        return f14510le;
    }

    private static String ouw(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String ouw(List<com.bytedance.sdk.openadsdk.yu.ouw> list) {
        return uoy.lh((list.size() <= 0 || list.get(0) == null || list.get(0).yu() == null) ? "" : list.get(0).yu().optString("app_log_url"));
    }

    public static List<com.bytedance.sdk.openadsdk.yu.ouw> vt(List<com.bytedance.sdk.openadsdk.yu.ouw> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.yu.ouw ouwVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectYu = ouwVar.yu();
                jSONObject.putOpt("event", jSONObjectYu.optString("label"));
                long jOptLong = jSONObjectYu.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.yu.le.f14432lh.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectYu.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectYu.opt(next));
                    }
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.yu.le(ouwVar.ouw, jSONObject));
            } catch (Exception e10) {
                qbp.lh("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private static String yu() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (tc.lh()) {
                sb2.append("MIUI-");
            } else if (tc.vt()) {
                sb2.append("FLYME-");
            } else {
                String strYu = tc.yu();
                if (tc.ouw(strYu)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strYu)) {
                    sb2.append(strYu);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    public final JSONObject ouw(List<com.bytedance.sdk.openadsdk.yu.ouw> list, long j10, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            com.bytedance.sdk.openadsdk.yu.ouw ouwVar = list.get(0);
            if (ouwVar != null) {
                try {
                    String strOptString = ouwVar.yu().optJSONObject("params").optString("log_extra", "");
                    long jOuw = vpp.ouw(strOptString);
                    int iLh = vpp.lh(strOptString);
                    if (jOuw == 0) {
                        jOuw = this.ouw;
                    }
                    this.ouw = jOuw;
                    if (iLh == 0) {
                        iLh = this.vt;
                    }
                    this.vt = iLh;
                } catch (Exception e10) {
                    qbp.yu("AdLogParamsGenerate", "getInfoFromLogExtra exception", e10.getMessage());
                }
            }
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.yu.ouw> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().fkw());
            }
            jSONObject2.put("event_v3", jSONArray);
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("_gen_time", j10);
            jSONObject2.put("local_time", j10 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    @SuppressLint({"HardwareIds"})
    public final JSONObject vt() {
        Context contextOuw;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f14511lh == null && (contextOuw = zih.ouw()) != null) {
                this.f14511lh = contextOuw.getApplicationContext();
            }
            jSONObject.put(Q6.f30218d0, uoy.fkw());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", uoy.bly());
            jSONObject.put("sim_op", ouw(this.f14511lh));
            jSONObject.put("root", this.yu ? 1 : 0);
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
            int iOuw = ksc.ouw(this.f14511lh, 0L);
            jSONObject.put("access", iOuw != 2 ? iOuw != 3 ? iOuw != 4 ? iOuw != 5 ? iOuw != 6 ? "mobile" : "5g" : "4g" : "wifi" : Z3.f30762a : "2g");
            jSONObject.put(Q6.F, C3978d4.f31183d);
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.fkw);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", osn.le(this.f14511lh) + VastAttributes.HORIZONTAL_POSITION + osn.yu(this.f14511lh));
            int iCf = osn.cf(this.f14511lh);
            String str = "mdpi";
            if (iCf == 120) {
                str = "ldpi";
            } else if (iCf != 160) {
                if (iCf == 240) {
                    str = "hdpi";
                } else if (iCf == 320) {
                    str = "xhdpi";
                } else if (iCf == 480) {
                    str = "xxhdpi";
                } else if (iCf == 640) {
                    str = "xxxhdpi";
                }
            }
            jSONObject.put("display_density", str);
            jSONObject.put("density_dpi", osn.cf(this.f14511lh));
            jSONObject.put(C4336xa.f34377b, "1371");
            jSONObject.put("device_id", ryl.ouw(this.f14511lh));
            jSONObject.put("rom", yu());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.vt);
            jSONObject.put("uid", this.ouw);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            jSONObject.put("locale_language", DeviceUtils.yu());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.fkw() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", DeviceUtils.vt() ? 0 : 1);
            com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu = zih.yu();
            Context context = this.f14511lh;
            if (context != null) {
                jSONObject.put("force_language", com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_choose_language"));
            }
            if (cfVarYu.zin("mnc")) {
                jSONObject.put("mnc", jae.lh());
            }
            if (cfVarYu.zin("mcc")) {
                jSONObject.put("mcc", jae.vt());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
