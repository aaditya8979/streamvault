package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.B7;
import com.ironsource.C3978d4;
import com.ironsource.C4042ge;
import com.ironsource.C4085j4;
import com.ironsource.C4228r4;
import com.ironsource.C4266t8;
import com.ironsource.C8;
import com.ironsource.Lb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SDKUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34014a = "SDKUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f34015b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f34016c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f34017d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f34018e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f34019f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f34020g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Map<String, String> f34021h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f34022i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f34023j = new AtomicInteger(1);

    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f34023j;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static int convertDpToPx(int i10) {
        return (int) TypedValue.applyDimension(0, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static boolean copyFileFromBundleToStorage(Context context, C8 c82) {
        int iSaveFile;
        byte[] bArrA = C4085j4.a(context, c82.getName());
        if (bArrA == null || bArrA.length == 0) {
            return false;
        }
        try {
            iSaveFile = IronSourceStorageUtils.saveFile(bArrA, c82.getPath());
        } catch (Exception e10) {
            IronLog.INTERNAL.error("exception: " + e10.getMessage());
            iSaveFile = 0;
        }
        if (iSaveFile != 0) {
            return true;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c82.getName());
        return false;
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C4228r4.d().a(e10);
            Logger.d(f34014a, "Failed decoding string " + e10.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j10) {
        return (int) ((j10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            C4228r4.d().a(e10);
            return "";
        }
    }

    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                e = e10;
                C4228r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            } catch (NoSuchAlgorithmException e11) {
                e = e11;
                C4228r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (UnsupportedEncodingException e12) {
            e = e12;
            messageDigest = null;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(C4042ge c4042ge) {
        return fetchDemandSourceId(c4042ge.a());
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObjectJsonObjectInit.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    Logger.i(f34014a, "flatMapToJsonAsStringfailed " + e10.toString());
                }
                it.remove();
            }
        }
        return jSONObjectJsonObjectInit.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z10) {
        return z10 ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f34015b;
    }

    public static String getControllerConfig() {
        return f34020g;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return IronSourceVideoBridge.jsonObjectInit(getControllerConfig());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f34018e) ? f34018e : !TextUtils.isEmpty(f34017d) ? f34017d : "";
    }

    public static int getDebugMode() {
        return f34019f;
    }

    public static String getFileName(String str) {
        try {
            return URLEncoder.encode(str.split(File.separator)[r1.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f34021h;
    }

    public static String getLimitAdTracking() {
        return f34016c;
    }

    public static String getMD5(String str) {
        try {
            String string = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (NoSuchAlgorithmException e10) {
            C4228r4.d().a(e10);
            throw new RuntimeException(e10);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(C3978d4.d.f31260b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(C3978d4.a.f31206b);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    public static JSONObject getNetworkFeatureConfiguration() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            JSONObject jSONObjectOptJSONObject = getNetworkConfiguration().optJSONObject("features");
            return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject : jSONObjectJsonObjectInit;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    public static JSONObject getOrientation(Context context) {
        B7 b7I = Lb.U().i();
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("orientation", translateOrientation(b7I.z(context)));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }

    public static C4266t8.e getProductType(String str) {
        C4266t8.e eVar = C4266t8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C4266t8.e eVar2 = C4266t8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "9.2.0";
    }

    public static String getTesterParameters() {
        return f34022i;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return IronSourceVideoBridge.jsonObjectInit(str).getString(str2);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if (!"mounted".equals(externalStorageState)) {
                if (!"mounted_ro".equals(externalStorageState)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity) || (activity instanceof InlineStoreActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        B7 b7I = Lb.U().i();
        String strI = b7I.I(context);
        String strB = b7I.b(context);
        if (!TextUtils.isEmpty(strI)) {
            f34015b = strI;
        }
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        f34016c = strB;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap map = new HashMap();
        if (mapArr == null) {
            return map;
        }
        for (Map<String, String> map2 : mapArr) {
            if (map2 != null) {
                map.putAll(map2);
            }
        }
        return map;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                jSONObjectJsonObjectInit.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static int pxToDp(long j10) {
        return (int) ((j10 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f34020g = str;
        Lb.O().y().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f34017d = str;
    }

    public static void setCustomControllerUrl(String str) {
        f34018e = str;
    }

    public static void setDebugMode(int i10) {
        f34019f = i10;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f34021h = map;
    }

    public static void setTesterParameters(String str) {
        f34022i = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : C3978d4.i.C : C3978d4.i.D;
    }

    public static String translateOrientation(int i10) {
        return i10 != 1 ? i10 != 2 ? "none" : C3978d4.i.C : C3978d4.i.D;
    }

    public static String translateRequestedOrientation(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 11) {
                    if (i10 != 12) {
                        switch (i10) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return C3978d4.i.D;
        }
        return C3978d4.i.C;
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(f34020g);
            jSONObjectJsonObjectInit.put(str, jSONObject);
            f34020g = jSONObjectJsonObjectInit.toString();
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            Logger.i(f34014a, "Unable to update controllerConfigs: " + e10.toString());
        }
    }
}
