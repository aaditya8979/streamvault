package bp;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.yk.e.AbstractC4634il;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.net.TaskThreadPool;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.ErrMsgParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Base64Utils;
import com.yk.e.util.Constant;
import com.yk.e.util.LogUtil;
import com.yk.e.util.StringUtil;
import com.yk.e.util.UsLocalSaveHelper;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f5716i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f5717j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static a1 f5718k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5724f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f5726h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5719a = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5725g = "";

    public static a1 a() {
        synchronized (a1.class) {
            if (f5718k == null) {
                f5718k = new a1();
            }
        }
        return f5718k;
    }

    public static String b(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        Collections.sort(arrayList);
        Arrays.sort(arrayList.toArray());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = (String) arrayList.get(i10);
            try {
                if (!(jSONObject.get(str) instanceof JSONObject)) {
                    sb2.append(jSONObject.optString(str));
                }
            } catch (Exception e10) {
                LogUtil.printException(e10);
            }
        }
        return sb2.toString();
    }

    public static JSONArray c(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<Map<String, String>> it = Constant.historyMidList.iterator();
            while (it.hasNext()) {
                String str2 = it.next().get(str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONArray.put(str2);
                }
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getHistoryMid error, msg = "), e10);
        }
        return jSONArray;
    }

    public static void e(Context context, String str, MainInitSdkCallback mainInitSdkCallback) {
        if (str.equals("1")) {
            AbstractC4634il.ILil(context, new o1(mainInitSdkCallback));
        } else {
            if (str.equals("2")) {
                AbstractC4634il.IL1Iii(context, new o1(mainInitSdkCallback));
                return;
            }
            AdLog.i("当前聚合广告类型mixTool = ".concat(str));
            AdLog.ad("3rdFsPartySdk init success");
            mainInitSdkCallback.onInitSuccess();
        }
    }

    public static void g(a1 a1Var, Context context, String str, MainInitSdkCallback mainInitSdkCallback) {
        a1Var.getClass();
        AdLog.ad("reqInit");
        boolean zI = false;
        try {
            JSONObject jSONObjectC = s1.a().c(context, 9999, "1");
            if (jSONObjectC != null) {
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject("data");
                if (jSONObjectC.optInt("status") == 1001 && jSONObjectOptJSONObject != null && (zI = a1Var.i(jSONObjectC.toString(), context, false, mainInitSdkCallback))) {
                    AdLog.i("init ac from cache");
                }
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getApiCacheError, msg="), e10);
        }
        new Thread(new r1(new n(context, new d(a1Var, str, context, zI, mainInitSdkCallback)))).start();
    }

    public final void d(Context context, int i10, String str, String str2, int i11, String str3, s0 s0Var) {
        if (this.f5719a) {
            k(context, i10, str, str2, i11, str3, s0Var);
            return;
        }
        AdLog.ad("SDK 未初始化成功！！！ ");
        if (s0Var != null) {
            s0Var.b(AdSdkStateCode.INIT_FAILED, "SDK 未初始化成功！！！ ");
        }
    }

    public final void f(Context context, String str, String str2, String str3, String str4, String str5, o0 o0Var) {
        Long l10;
        JSONObject jSONObject = new JSONObject();
        try {
            String lowerCase = UsLocalSaveHelper.getInstance().getNetType().toLowerCase(Locale.getDefault());
            ErrMsgParams errMsgParams = UsLocalSaveHelper.getInstance().getErrMsgParamsMap().get(str);
            if (errMsgParams == null) {
                AdLog.e("reqCollectLog fail, errMsgParams is null");
                return;
            }
            jSONObject.put(InneractiveMediationDefs.REMOTE_KEY_APP_ID, f5716i);
            jSONObject.put("deviceID", this.f5722d);
            jSONObject.put("model", Build.BRAND + "/" + Build.MODEL);
            jSONObject.put("is_wifi", "wifi".equals(lowerCase) ? "1" : "0");
            jSONObject.put("system", "0");
            jSONObject.put("sdkVersion", Constant.sdkVersion);
            jSONObject.put("api_url", errMsgParams.getApiUrl());
            jSONObject.put("platform", str2);
            jSONObject.put("req_data", errMsgParams.getReqData());
            jSONObject.put("response_msg", errMsgParams.getRepData());
            jSONObject.put("sdk_error", Base64Utils.encode(str3.getBytes()));
            jSONObject.put("apiCostTime", UsLocalSaveHelper.getInstance().getAdApiCostTime(str));
            try {
                l10 = (Long) AbstractC4634il.f3394lLi1LL.get(str2);
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
            long jLongValue = l10 != null ? l10.longValue() : 0L;
            jSONObject.put("initCostTime", jLongValue);
            jSONObject.put("thirdCode", str4);
            jSONObject.put("myCode", str5);
            jSONObject.put("sign", StringUtil.encryptToMD5(this.f5722d + b(jSONObject) + f5717j));
            TaskThreadPool.connect(Constant.ReqCollectLog, jSONObject, new q0(context, o0Var));
        } catch (Exception e11) {
            String str6 = "reqCollectLog error, msg = " + e11.getMessage();
            AdLog.e(str6, e11);
            if (o0Var != null) {
                o0Var.onFailed(-1, str6);
            }
        }
    }

    public final void h(i.d dVar, s0 s0Var) {
        try {
            JSONObject jSONObjectJ = j();
            jSONObjectJ.put("adPlcID", dVar.f63643a);
            jSONObjectJ.put("adType", dVar.f63644b);
            jSONObjectJ.put(VastAttributes.AD_ID, dVar.f63645c);
            jSONObjectJ.put("sourceID", dVar.f63646d);
            jSONObjectJ.put("platform", dVar.f63647e);
            jSONObjectJ.put("type", dVar.f63648f);
            jSONObjectJ.put("userID", dVar.f63649g);
            jSONObjectJ.put("extraMsg", dVar.f63650h);
            jSONObjectJ.put("requestID", dVar.f63651i);
            jSONObjectJ.put("materialId", dVar.f63652j);
            jSONObjectJ.put("network", dVar.f63658p);
            jSONObjectJ.put("isBrush", dVar.f63653k);
            jSONObjectJ.put("fillCostTime", dVar.f63654l);
            jSONObjectJ.put("apiCostTime", dVar.f63655m);
            jSONObjectJ.put("sign", StringUtil.encryptToMD5(this.f5722d + b(jSONObjectJ) + f5717j));
            TaskThreadPool.connect(Constant.StatAdPath, jSONObjectJ, new z0(this, s0Var, dVar));
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
    }

    public final boolean i(String str, Context context, boolean z10, MainInitSdkCallback mainInitSdkCallback) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("status");
            String strOptString = jSONObject.optString("info", "");
            if (iOptInt != 1001) {
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = "请求初始化接口失败, status = " + iOptInt;
                }
                AdLog.ad("reqInit failed, status = " + iOptInt + ", msg = " + strOptString);
                if (mainInitSdkCallback == null || !z10) {
                    return false;
                }
                mainInitSdkCallback.onInitFailed(iOptInt, strOptString);
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            b1.a(context).b(context, jSONObject2.optJSONArray("domain_list"));
            UsLocalSaveHelper.getInstance().setPreloadCachePeriod(jSONObject2.optInt("cache_time"));
            UsLocalSaveHelper.getInstance().setWriteLog(jSONObject2.optString("writeLog", "0"));
            UsLocalSaveHelper.getInstance().setCmp(jSONObject2.optString("cmp", "0"));
            String strOptString2 = jSONObject2.optString("mixTool", "");
            AdLog.ad("api init success");
            this.f5719a = true;
            UsLocalSaveHelper.getInstance().setDeviceID(this.f5722d);
            e(context, strOptString2, mainInitSdkCallback);
            return true;
        } catch (Exception e10) {
            String str2 = "api init parse error, msg = " + e10.getMessage();
            AdLog.ad(str2);
            AdLog.e(str2, e10);
            if (mainInitSdkCallback == null || !z10) {
                return false;
            }
            mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "init fail, msg = " + e10.getMessage());
            return false;
        }
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InneractiveMediationDefs.REMOTE_KEY_APP_ID, f5716i);
            jSONObject.put("deviceID", this.f5722d);
            jSONObject.put("system", 0);
            jSONObject.put("appName", this.f5723e);
            jSONObject.put("appVersionName", this.f5724f);
            jSONObject.put("currentTime", System.currentTimeMillis());
            jSONObject.put("appPackage", this.f5720b);
            jSONObject.put("appSHA1", this.f5721c);
            jSONObject.put("sdkVersion", Constant.sdkVersion);
            jSONObject.put("debugFlag", Constant.debugFlag ? 1 : 0);
            jSONObject.put("phoneLang", TextUtils.isEmpty(this.f5725g) ? "en-us" : this.f5725g);
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|2|(3:63|3|4)|(2:65|5)|(2:9|(21:13|14|53|15|16|27|57|28|29|59|30|61|31|35|55|36|40|(1:42)(1:43)|44|51|52))|19|26|27|57|28|29|59|30|61|31|35|55|36|40|(0)(0)|44|51|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        com.yk.e.util.AdLog.e("getAdShowCountData error, msg = " + r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        com.yk.e.util.AdLog.e("getAdAreaCountData error, msg = " + r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016f, code lost:
    
        com.yk.e.util.LogUtil.printException(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137 A[Catch: Exception -> 0x016a, TryCatch #3 {Exception -> 0x016a, blocks: (B:30:0x00b0, B:35:0x00ee, B:40:0x0123, B:44:0x0139, B:43:0x0137, B:39:0x010e, B:34:0x00d9, B:36:0x00fc, B:31:0x00c7), top: B:59:0x00b0, inners: #1, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.content.Context r17, int r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, bp.s0 r23) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.a1.k(android.content.Context, int, java.lang.String, java.lang.String, int, java.lang.String, bp.s0):void");
    }
}
