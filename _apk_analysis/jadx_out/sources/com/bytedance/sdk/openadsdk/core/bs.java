package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.ouw.lh;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.ironsource.C3978d4;
import com.ironsource.C4157n2;
import com.ironsource.C4336xa;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bs implements com.bytedance.sdk.component.adexpress.fkw.vt, jae.ouw, com.bytedance.sdk.openadsdk.cf.vt {
    private static final Map<String, Boolean> uoy;
    public com.bytedance.sdk.openadsdk.core.model.vpp bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private WeakReference<com.bytedance.sdk.component.bly.le> f13475bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public boolean f13476cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.bly.ko f13477cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private Context f13478cj;
    public String ex;
    public String fkw;
    private JSONObject fqk;
    public ouw fvf;
    private com.bytedance.sdk.openadsdk.core.lh.yu hun;
    public com.bytedance.sdk.openadsdk.mwh.ra jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.mwh.fkw f13479jg;
    public com.bytedance.sdk.openadsdk.mwh.vt jqy;
    private com.bytedance.sdk.openadsdk.cf.yu jvy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.mwh.lh f13480ko;
    public com.bytedance.sdk.openadsdk.core.widget.ouw.ouw ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13481le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13482lh;
    private HashMap<String, tlj> lso;
    public com.bytedance.sdk.openadsdk.mwh.ouw mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public boolean f13483od;
    private com.bytedance.sdk.openadsdk.cf.lh osn;
    public String ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public ksc f13484pd;
    public int pno;
    private lh pv;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f13485ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.mwh.tlj f13486rn;
    private JSONObject rrs;
    public JSONObject ryl;
    public com.bytedance.sdk.component.adexpress.vt.cf tlj;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.mwh.yu.vt f13490uq;
    public com.bytedance.sdk.component.ouw.ko vpp;
    public com.bytedance.sdk.openadsdk.core.widget.fkw vt;
    public WeakReference<View> yu;
    public Map<String, Object> zih;
    public com.bytedance.sdk.openadsdk.yu.yu.fkw zin;
    private boolean ey = true;
    private boolean ux = true;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private boolean f13489ub = false;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f13491vm = false;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f13488th = false;
    public boolean qbp = false;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f13487tc = false;
    private final com.bytedance.sdk.component.utils.jae fak = new com.bytedance.sdk.component.utils.jae(Looper.getMainLooper(), this);

    public static class lh implements Runnable {
        private final com.bytedance.sdk.openadsdk.core.bly.ko ouw;
        private final JSONObject vt;

        public lh(com.bytedance.sdk.openadsdk.core.bly.ko koVar, JSONObject jSONObject) {
            this.ouw = koVar;
            this.vt = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            bs.vt(this.ouw, this.vt);
        }
    }

    public interface ouw {
        void ouw();
    }

    public static class vt {
        public int fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f13494lh;
        public String ouw;
        public String vt;
        public JSONObject yu;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        uoy = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public bs(Context context) {
        this.f13478cj = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bly() {
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f13477cf;
        if (koVar != null) {
            koVar.ouw();
        }
    }

    private static boolean bly(@NonNull JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private void cf(JSONObject jSONObject) {
        WebView webViewRa = ra();
        if (webViewRa != null) {
            String str = "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")";
            com.bytedance.sdk.component.utils.jg.ouw(webViewRa, str);
            if (com.bytedance.sdk.component.utils.ko.ouw()) {
                com.bytedance.sdk.component.utils.ko.ouw("TTAD.AndroidObject", "js_msg ".concat(String.valueOf(str)));
            }
        }
    }

    private void fkw(JSONObject jSONObject) throws Exception {
        ouw(jSONObject, this.bly);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void le(JSONObject jSONObject) {
        if (this.f13477cf == null || jSONObject == null) {
            return;
        }
        try {
            this.f13477cf.ouw(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lh(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            cf(jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ouw(String str, String str2) {
        return com.bytedance.sdk.openadsdk.core.model.th.ra(this.bly) ? C4157n2.f33013v.equals(str2) ? com.bytedance.sdk.openadsdk.utils.uoy.ouw(this.f13481le) : "aggregate_page" : com.bytedance.sdk.openadsdk.core.model.od.fkw(this.bly) ? this.ouw : this.f13480ko != null ? com.bytedance.sdk.openadsdk.utils.uoy.ouw(this.f13481le) : this.tlj == null ? com.bytedance.sdk.openadsdk.utils.uoy.vt(this.f13481le) : str;
    }

    public static JSONArray ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh;
        if (ouwVar == null || !ouwVar.vt() || (vppVarLh = ouwVar.lh()) == null || TextUtils.isEmpty(vppVarLh.f13753bo)) {
            return null;
        }
        try {
            return PangleVideoBridge.jsonObjectInit(vppVarLh.f13753bo).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void ouw(bs bsVar, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar, com.bytedance.sdk.openadsdk.mwh.yu yuVar) {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list == null || list.isEmpty()) {
            yuVar.ouw(false, null);
            lhVar.vt = -3;
            lhVar.f13689ra = 7;
            com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.yu.get(0);
        if (vppVar != null) {
            bsVar.rrs = vppVar.qni;
        }
        yuVar.ouw(true, ouwVar);
    }

    private void ouw(String str, boolean z10) {
        if (this.zin == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            this.zin.ouw(str);
        } else {
            this.zin.vt(str);
        }
    }

    public static void ouw(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator it = Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds").iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put("appName", "open_news");
        jSONObject.put("innerAppName", bly.ouw().pno());
        jSONObject.put(C4336xa.f34377b, "1371");
        jSONObject.put("sdkEdition", BuildConfig.VERSION_NAME);
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.utils.uoy.bly());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.lh.ouw());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", ryl.ouw(zih.ouw()));
        if (DeviceUtils.vt(zih.ouw())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", C3978d4.f31183d);
        }
        jSONObject.put(CommonUrlParts.DEVICE_TYPE, Build.VERSION.RELEASE);
    }

    public static void ouw(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) throws Exception {
        String str = vppVar.pv;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("cid", str);
        }
        String str2 = vppVar.yhj;
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("log_extra", str2);
        }
        String strHun = vppVar.hun();
        if (!TextUtils.isEmpty(strHun)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strHun);
        }
        jSONObject.put("dc", TextUtils.isEmpty(zih.yu().zin()) ? zih.yu().zin() : "TX");
        jSONObject.put("language", ryl.vt());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.cf.vt().osn());
    }

    public static boolean ouw(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (uoy.containsKey(uri.getHost())) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean ouw(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        boolean z10 = false;
        if (iOptInt != 1) {
            if (iOptInt == 2) {
                try {
                    if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                        jSONObject2.put("empty_url", 1);
                    } else if (!com.bytedance.sdk.component.utils.vm.ouw(strOptString2)) {
                        jSONObject2.put("invalid_url", 1);
                    }
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.qbp.ouw("TTAD.AndroidObject", "handleUrl, EX2->: ", e10);
                }
            }
            return z10;
        }
        if (!com.bytedance.sdk.component.utils.vm.ouw(strOptString)) {
            try {
                jSONObject2.put("invalid_url", 1);
            } catch (JSONException e11) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.AndroidObject", "handleUrl, EX1->: ", e11);
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    private JSONObject pno() {
        try {
            View view = this.yu.get();
            com.bytedance.sdk.component.bly.le leVar = this.f13475bs.get();
            if (view != null && leVar != null) {
                int[] iArrVt = com.bytedance.sdk.openadsdk.utils.osn.vt(view);
                int[] iArrVt2 = com.bytedance.sdk.openadsdk.utils.osn.vt((View) leVar);
                if (iArrVt != null && iArrVt2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(VastAttributes.HORIZONTAL_POSITION, com.bytedance.sdk.openadsdk.utils.osn.vt(zih.ouw(), iArrVt[0] - iArrVt2[0]));
                    jSONObject.put(VastAttributes.VERTICAL_POSITION, com.bytedance.sdk.openadsdk.utils.osn.vt(zih.ouw(), iArrVt[1] - iArrVt2[1]));
                    jSONObject.put("w", com.bytedance.sdk.openadsdk.utils.osn.vt(zih.ouw(), view.getWidth()));
                    jSONObject.put("h", com.bytedance.sdk.openadsdk.utils.osn.vt(zih.ouw(), view.getHeight()));
                    jSONObject.put("isExist", true);
                    return jSONObject;
                }
                com.bytedance.sdk.component.utils.ko.fkw("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
                return null;
            }
            com.bytedance.sdk.component.utils.ko.fkw("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
            return null;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.ouw("TTAD.AndroidObject", "setCloseButtonInfo error", th2);
            return null;
        }
    }

    private void pno(JSONObject jSONObject) {
        int i10;
        double dOptDouble;
        double dOptDouble2;
        boolean z10;
        double d10;
        String strOptString;
        int iOptInt;
        bs bsVar = this;
        if (bsVar.tlj == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = bsVar.zin;
        if (fkwVar != null) {
            fkwVar.zih();
        }
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
        jgVar.ouw = 1;
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            dOptDouble = 0.0d;
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("height");
            } else {
                dOptDouble2 = 0.0d;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    double dOptDouble3 = jSONObjectOptJSONObject2.optDouble(VastAttributes.HORIZONTAL_POSITION);
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble(VastAttributes.VERTICAL_POSITION);
                    z10 = zOptBoolean;
                    double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                    double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                    if (bly(jSONObjectOptJSONObject2)) {
                        d10 = dOptDouble2;
                        jgVar.f12445ra = (float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft");
                        jgVar.pno = (float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight");
                        jgVar.bly = (float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft");
                        jgVar.tlj = (float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight");
                    } else {
                        d10 = dOptDouble2;
                    }
                    jgVar.fkw = dOptDouble3;
                    jgVar.f12443le = dOptDouble4;
                    jgVar.f12440cf = dOptDouble5;
                    jgVar.ryl = dOptDouble6;
                } catch (Exception unused) {
                    i10 = 101;
                    bsVar = this;
                    jgVar.f12441jg = i10;
                    jgVar.mwh = pno.ouw(i10);
                    bsVar.tlj.ouw(jgVar);
                }
            } else {
                z10 = zOptBoolean;
                d10 = dOptDouble2;
            }
            try {
                strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, pno.ouw(101));
                iOptInt = jSONObject.optInt("code", 101);
            } catch (Exception unused2) {
                bsVar = this;
                i10 = 101;
                jgVar.f12441jg = i10;
                jgVar.mwh = pno.ouw(i10);
                bsVar.tlj.ouw(jgVar);
            }
        } catch (Exception unused3) {
        }
        try {
            jgVar.vt = z10;
            jgVar.f12444lh = dOptDouble;
            jgVar.yu = d10;
            jgVar.mwh = strOptString;
            jgVar.f12441jg = iOptInt;
            bsVar = this;
            bsVar.tlj.ouw(jgVar);
        } catch (Exception unused4) {
            bsVar = this;
            i10 = 101;
            jgVar.f12441jg = i10;
            jgVar.mwh = pno.ouw(i10);
            bsVar.tlj.ouw(jgVar);
        }
    }

    private WebView ra() {
        com.bytedance.sdk.component.bly.le leVar;
        WeakReference<com.bytedance.sdk.component.bly.le> weakReference = this.f13475bs;
        if (weakReference == null || (leVar = weakReference.get()) == null) {
            return null;
        }
        return leVar.getWebView();
    }

    private boolean ra(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f13477cf;
        if (koVar == null) {
            return false;
        }
        double dYu = koVar.yu();
        double dFkw = this.f13477cf.fkw();
        int iLe = this.f13477cf.le();
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "current:", Double.valueOf(dYu), "state", Integer.valueOf(iLe), "countdownTime", Double.valueOf(dFkw));
        try {
            jSONObject.put("currentTime", dYu / 1000.0d);
            if (dFkw > 0.0d) {
                jSONObject.put("countDownTime", dFkw / 1000.0d);
            }
            jSONObject.put("state", iLe);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ryl(JSONObject jSONObject) {
        if (this.zih != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = PangleVideoBridge.jsonObjectInit(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.zih.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.qbp.yu(e10.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    private void tlj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "TTAndroidObject handlerDynamicTrack");
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.th.ouw(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    public static JSONObject vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        int iFqk;
        boolean zRyl;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (zih.yu() == null) {
            return jSONObject2;
        }
        if (vppVar != null) {
            try {
                iFqk = vppVar.fqk();
            } catch (Exception unused) {
            }
        } else {
            iFqk = 0;
        }
        int iUoy = vppVar != null ? vppVar.uoy() : 0;
        int iNg = vppVar != null ? vppVar.ng() : 0;
        int iMyk = vppVar != null ? vppVar.myk() : 0;
        zih.yu();
        boolean zFkw = com.bytedance.sdk.openadsdk.core.settings.cf.fkw(String.valueOf(iFqk));
        zih.yu();
        boolean z10 = com.bytedance.sdk.openadsdk.core.settings.cf.bly(String.valueOf(iFqk)) == 1;
        if (iUoy == 7 || iUoy == 8) {
            zih.yu();
            zRyl = com.bytedance.sdk.openadsdk.core.settings.cf.ryl(String.valueOf(iFqk));
        } else {
            zih.yu();
            zRyl = com.bytedance.sdk.openadsdk.core.settings.cf.vt(String.valueOf(iFqk));
        }
        jSONObject2.put("voice_control", zRyl);
        jSONObject2.put("rv_skip_time", iNg);
        jSONObject2.put("fv_skip_show", zFkw);
        jSONObject2.put("iv_skip_time", iMyk);
        jSONObject2.put("show_dislike", vppVar != null && vppVar.ksc());
        jSONObject2.put("video_adaptation", vppVar != null ? vppVar.wbf : 0);
        if (vppVar != null && (jSONObject = vppVar.smu) != null) {
            jSONObject2.put("dynamic_configs", jSONObject);
        }
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(vppVar)) {
            jSONObject2.put("skip_change_to_close", true);
        } else {
            jSONObject2.put("skip_change_to_close", z10);
        }
        jSONObject2.put("bar_render_platform", vppVar.tpk ? 1 : 0);
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(com.bytedance.sdk.openadsdk.core.bly.ko koVar, JSONObject jSONObject) {
        if (koVar == null || jSONObject == null) {
            return;
        }
        try {
            koVar.ouw(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false), jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_MUTE) ^ true ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ boolean vt(bs bsVar, String str) {
        if (TextUtils.isEmpty(str) || !"click_other".equals(str)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = bsVar.bly;
        return vppVar != null && vppVar.qbp() == 1;
    }

    private boolean vt(String str) {
        HashMap<String, tlj> map;
        if (TextUtils.isEmpty(str) || (map = this.lso) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            fkw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            ouw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.4
                @Override // java.lang.Runnable
                public final void run() {
                    bs.this.le(jSONObjectJsonObjectInit);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.5
                @Override // java.lang.Runnable
                public final void run() {
                    bs.this.vt(jSONObjectJsonObjectInit);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            tlj(PangleVideoBridge.jsonObjectInit(str));
        } catch (Exception unused) {
        }
    }

    public final JSONObject fkw() {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> listPv;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.f13490uq;
            if (vtVar != null && (listPv = vtVar.pv()) != null) {
                for (int i10 = 0; i10 < listPv.size(); i10++) {
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = listPv.get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("is_ad_event", "1");
                    jSONObject3.put("cid", vppVar.tlj());
                    jSONObject3.put("req_id", vppVar.ux());
                    jSONObject3.put(CreativeInfo.f52474c, vppVar.pv);
                    jSONObject3.put("log_extra", vppVar.yhj);
                    jSONObject3.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.cf.vt().osn());
                    jSONObject2.put("ad_info", jSONObject3);
                    jSONObject2.put("endcard_creative", vppVar.znd);
                    jSONObject2.put("dynamic_creative", vppVar.jvj);
                    jSONObject2.put("title", vppVar.fqk);
                    com.bytedance.sdk.openadsdk.core.model.vpp.ouw(vppVar, jSONObject2);
                    com.bytedance.sdk.openadsdk.core.model.vpp.vt(vppVar, jSONObject2);
                    jSONObject2.put("source", vppVar.f13798vh);
                    jSONObject2.put("button_text", vppVar.ux);
                    com.bytedance.sdk.openadsdk.core.model.ryl rylVar = vppVar.f13768kn;
                    if (rylVar != null) {
                        jSONObject2.put("deeplink_url", rylVar.ouw);
                    }
                    jSONObject2.put("app_name", vppVar.f13794ub);
                    int i11 = 1;
                    jSONObject2.put("has_show", vppVar.bu ? 1 : 0);
                    if (!vppVar.cj()) {
                        i11 = 0;
                    }
                    jSONObject2.put("has_click", i11);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        ra(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.ryl.toString();
        }
        try {
            JSONObject jSONObjectOuw = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(this.ryl, PangleVideoBridge.jsonObjectInit(str));
            return jSONObjectOuw == null ? this.ryl.toString() : jSONObjectOuw.toString();
        } catch (Exception unused) {
            return this.ryl.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String getTemplateInfo() {
        JSONObject jSONObject;
        ouw("getTemplateInfo", true);
        try {
            JSONObject jSONObject2 = this.ryl;
            if (jSONObject2 != null) {
                jSONObject2.put("setting", vt(this.bly));
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
                if (vppVar != null && (jSONObject = vppVar.smu) != null) {
                    this.ryl.put("dynamic_configs", jSONObject);
                }
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.bly;
                if (vppVar2 != null) {
                    this.ryl.put("extension", vppVar2.hsa);
                }
            }
            ouw("getTemplateInfo", false);
            return this.ryl.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "initRenderFinish");
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.7
            @Override // java.lang.Runnable
            public final void run() {
                if (bs.this.ksc != null) {
                    bs.this.ksc.ouw();
                }
            }
        });
    }

    public final JSONObject le() {
        JSONObject jSONObject = new JSONObject();
        try {
            ksc kscVar = this.f13484pd;
            if (kscVar != null) {
                jSONObject.put("leftTime", kscVar.q_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final JSONObject lh(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f13477cf;
        if (koVar != null) {
            try {
                jSONObject2.put("state", koVar.ouw(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public final void lh() {
        com.bytedance.sdk.openadsdk.cf.lh lhVar = this.osn;
        if (lhVar != null) {
            lhVar.ouw();
        }
        lh lhVar2 = this.pv;
        if (lhVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.bs.vt(lhVar2);
            this.pv = null;
        }
        this.f13478cj = null;
        this.f13490uq = null;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            lh lhVar = this.pv;
            if (lhVar != null) {
                com.bytedance.sdk.openadsdk.utils.bs.vt(lhVar);
            }
            lh lhVar2 = new lh(this.f13477cf, jSONObjectJsonObjectInit);
            this.pv = lhVar2;
            com.bytedance.sdk.openadsdk.utils.bs.ouw(lhVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.AndroidObject", "");
        }
    }

    public final bs ouw(com.bytedance.sdk.component.bly.le leVar) {
        WebView webView;
        if (leVar == null || (webView = leVar.getWebView()) == null) {
            return this;
        }
        try {
            com.bytedance.sdk.component.ouw.bly blyVar = new com.bytedance.sdk.component.ouw.bly(webView);
            blyVar.vt = new com.bytedance.sdk.openadsdk.ryl.ouw();
            blyVar.f12732lh = "ToutiaoJSBridge";
            blyVar.yu = new com.bytedance.sdk.component.ouw.ra(new com.bytedance.sdk.component.ouw.tlj() { // from class: com.bytedance.sdk.openadsdk.core.bs.1
                @Override // com.bytedance.sdk.component.ouw.tlj
                @NonNull
                public final <T> T ouw() {
                    return null;
                }

                @Override // com.bytedance.sdk.component.ouw.tlj
                @NonNull
                public final <T> String vt() {
                    return null;
                }
            });
            blyVar.f12731le = bly.ouw().jg();
            blyVar.f12733ra = true;
            if ((blyVar.ouw == null && !blyVar.mwh && blyVar.vt == null) || ((TextUtils.isEmpty(blyVar.f12732lh) && blyVar.ouw != null) || blyVar.yu == null)) {
                throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
            }
            this.vpp = new com.bytedance.sdk.component.ouw.ko(blyVar);
            if (com.bytedance.sdk.openadsdk.vpp.ouw.le()) {
                com.bytedance.sdk.openadsdk.ryl.ouw.pno.ouw(this.vpp, this);
                com.bytedance.sdk.openadsdk.ryl.ouw.tlj.ouw(this.vpp, this);
                com.bytedance.sdk.openadsdk.ryl.ouw.qbp.ouw(this.vpp, leVar, this, this.bly);
            } else {
                com.bytedance.sdk.component.ouw.ko koVar = this.vpp;
                koVar.ouw("appInfo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("appInfo", this));
                koVar.ouw("adInfo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("adInfo", this));
                koVar.ouw("sendLog", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("sendLog", this));
                koVar.ouw("playable_style", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("playable_style", this));
                koVar.ouw("getTemplateInfo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getTemplateInfo", this));
                koVar.ouw("getTeMaiAds", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getTeMaiAds", this));
                koVar.ouw(C3978d4.i.f31353o, new com.bytedance.sdk.openadsdk.ryl.ouw.ra(C3978d4.i.f31353o, this));
                koVar.ouw("getScreenSize", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getScreenSize", this));
                koVar.ouw("getCloseButtonInfo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getCloseButtonInfo", this));
                koVar.ouw("getVolume", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getVolume", this));
                koVar.ouw("removeLoading", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("removeLoading", this));
                koVar.ouw("sendReward", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("sendReward", this));
                koVar.ouw("subscribe_app_ad", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("subscribe_app_ad", this));
                koVar.ouw("download_app_ad", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("download_app_ad", this));
                koVar.ouw("cancel_download_app_ad", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("cancel_download_app_ad", this));
                koVar.ouw("unsubscribe_app_ad", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("unsubscribe_app_ad", this));
                koVar.ouw("landscape_click", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("landscape_click", this));
                koVar.ouw("clickEvent", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("clickEvent", this));
                koVar.ouw("renderDidFinish", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("renderDidFinish", this));
                koVar.ouw("dynamicTrack", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("dynamicTrack", this));
                koVar.ouw("skipVideo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("skipVideo", this));
                koVar.ouw(FyberMediationAdapter.KEY_MUTE_VIDEO, new com.bytedance.sdk.openadsdk.ryl.ouw.ra(FyberMediationAdapter.KEY_MUTE_VIDEO, this));
                koVar.ouw("changeVideoState", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("changeVideoState", this));
                koVar.ouw("getCurrentVideoState", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getCurrentVideoState", this));
                koVar.ouw("send_temai_product_ids", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("send_temai_product_ids", this));
                koVar.ouw("getMaterialMeta", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getMaterialMeta", this));
                koVar.ouw("endcard_load", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("endcard_load", this));
                koVar.ouw("pauseWebView", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("pauseWebView", this));
                koVar.ouw("pauseWebViewTimers", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("pauseWebViewTimers", this));
                koVar.ouw("webview_time_track", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("webview_time_track", this));
                koVar.ouw("openPrivacy", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("openPrivacy", this));
                koVar.ouw("openAdLandPageLinks", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("openAdLandPageLinks", this));
                koVar.ouw("getNativeSiteCustomData", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getNativeSiteCustomData", this));
                koVar.ouw("close", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("close", this));
                com.bytedance.sdk.component.ouw.ko koVar2 = this.vpp;
                koVar2.ouw("endcardDynamicCreatives", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "endcardDynamicCreatives"));
                koVar2.ouw("multiOpenCovert", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "multiOpenCovert"));
                koVar2.ouw("skipToNextAd", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "skipToNextAd"));
                koVar2.ouw("speedVideoOrTimer", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "speedVideoOrTimer"));
                koVar2.ouw("openPlayable", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "openPlayable"));
                com.bytedance.sdk.component.ouw.ko koVar3 = this.vpp;
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
                koVar3.ouw("closeWebview", new com.bytedance.sdk.openadsdk.ryl.ouw.th(leVar, "closeWebview", this, vppVar));
                koVar3.ouw("makeVisible", new com.bytedance.sdk.openadsdk.ryl.ouw.th(leVar, "makeVisible", this, vppVar));
                koVar3.ouw("getCurrentVisibleState", new com.bytedance.sdk.openadsdk.ryl.ouw.th(leVar, "getCurrentVisibleState", this, vppVar));
            }
            this.vpp.ouw("getNetworkData", new lh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.ouw.1
                @Override // com.bytedance.sdk.component.ouw.lh.vt
                public final com.bytedance.sdk.component.ouw.lh ouw() {
                    return new ouw(this.ouw);
                }
            });
            this.vpp.ouw("interstitial_webview_close", new lh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.vt.1
                @Override // com.bytedance.sdk.component.ouw.lh.vt
                public final com.bytedance.sdk.component.ouw.lh ouw() {
                    return new vt(this.ouw);
                }
            });
            this.vpp.ouw("newClickEvent", new lh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.lh.1
                @Override // com.bytedance.sdk.component.ouw.lh.vt
                public final com.bytedance.sdk.component.ouw.lh ouw() {
                    return new lh(this.ouw);
                }
            });
            this.vpp.ouw("interactiveFinish", new com.bytedance.sdk.openadsdk.ryl.ouw.le(this));
            this.vpp.ouw("overlayRenderFinish", new com.bytedance.sdk.openadsdk.ryl.ouw.cf(this));
            this.vpp.ouw("commonConvert", new com.bytedance.sdk.openadsdk.ryl.ouw.ko(this));
            this.vpp.ouw("preventTouchEvent", new com.bytedance.sdk.openadsdk.ryl.ouw.mwh(leVar));
            this.vpp.ouw("getData", new com.bytedance.sdk.openadsdk.ryl.ouw.fkw(this.ryl));
            this.vpp.ouw("expressAdViewStartZoom", new com.bytedance.sdk.openadsdk.ryl.ouw.yu(this));
            com.bytedance.sdk.component.ouw.ko koVar4 = this.vpp;
            final com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.bly;
            koVar4.ouw("requestDelayCallback", new lh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.jg.1
                @Override // com.bytedance.sdk.component.ouw.lh.vt
                public final com.bytedance.sdk.component.ouw.lh ouw() {
                    return new jg(this.ouw, vppVar2);
                }
            });
            this.vpp.ouw("sendLogV3", new com.bytedance.sdk.openadsdk.ryl.ouw.rn(this));
            this.vpp.ouw("stayDynamic", new com.bytedance.sdk.openadsdk.ryl.ouw.zih(this));
            com.bytedance.sdk.openadsdk.ryl.ouw.ryl.ouw(this.vpp, this);
            com.bytedance.sdk.openadsdk.ryl.ouw.vm.ouw(this.vpp, this.bly);
            return this;
        } catch (Exception unused) {
            return this;
        }
    }

    public final bs ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        this.bly = vppVar;
        if (vppVar != null) {
            this.rrs = vppVar.qni;
        }
        return this;
    }

    public final bs ouw(Map<String, Object> map) {
        this.zih = map;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x042e A[PHI: r0
      0x042e: PHI (r0v154 org.json.JSONObject) = (r0v139 org.json.JSONObject), (r0v155 org.json.JSONObject) binds: [B:257:0x042c, B:230:0x03bf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject ouw(final com.bytedance.sdk.openadsdk.core.bs.vt r25, int r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bs.ouw(com.bytedance.sdk.openadsdk.core.bs$vt, int):org.json.JSONObject");
    }

    public final void ouw() {
        com.bytedance.sdk.component.ouw.ko koVar = this.vpp;
        if (koVar == null) {
            return;
        }
        koVar.ouw();
        this.vpp = null;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof vt) {
                try {
                    ouw((vt) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(zih.ouw(), vppVar, str, this.f13481le);
        ouwVar.ouw(com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(zih.ouw(), str));
        if (!z10) {
            ouwVar.yu = false;
        }
        ouwVar.onClick(null);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    public final void ouw(String str) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "requestPauseVideo: ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            int iOptInt = jSONObjectJsonObjectInit.optInt("time");
            String strOptString = jSONObjectJsonObjectInit.optString("flag");
            com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f13477cf;
            if (koVar != null) {
                koVar.ouw(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    public final void ouw(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            cf(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public final void ouw(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.mwh.yu yuVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            final com.bytedance.sdk.openadsdk.mwh.yu yuVar2 = new com.bytedance.sdk.openadsdk.mwh.yu() { // from class: com.bytedance.sdk.openadsdk.core.bs.9
                @Override // com.bytedance.sdk.openadsdk.mwh.yu
                public final void ouw(final boolean z10, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                    com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.9.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            yuVar.ouw(z10, ouwVar);
                        }
                    });
                }
            };
            if (this.bly != null && !TextUtils.isEmpty(this.fkw)) {
                int iUoy = this.bly.uoy();
                AdSlot adSlot = this.bly.yiz;
                com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
                kscVar.f13681le = true;
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
                if (vppVar.f13803xn != null || vppVar.lht != null) {
                    kscVar.bly = 2;
                }
                JSONObject jSONObject2 = this.rrs;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null && jSONObject.has("session_params") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("session_params")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObjectOptJSONObject.opt(next));
                    }
                }
                kscVar.f13683ra = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (kscVar.pno == null) {
                        kscVar.pno = new JSONObject();
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            kscVar.pno.put(next2, jSONObjectOptJSONObject2.opt(next2));
                        }
                    }
                }
                if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                    zih.lh().ouw(adSlot, kscVar, iUoy, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.core.bs.10
                        @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                        public final void ouw(int i10, String str) {
                            yuVar2.ouw(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                        public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                            bs.ouw(bs.this, ouwVar, lhVar, yuVar2);
                        }
                    });
                    return;
                } else {
                    zih.lh().ouw(adSlot, kscVar, iUoy, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bs.11
                        @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                        public final void ouw(int i10, String str) {
                            yuVar2.ouw(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                        public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                            bs.ouw(bs.this, ouwVar, lhVar, yuVar2);
                        }
                    });
                    return;
                }
            }
            yuVar2.ouw(false, null);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.AndroidObject", "get ads error", e10);
        }
    }

    public final void ouw(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f13477cf;
        if (koVar != null) {
            koVar.ouw(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.f13490uq;
        if (vtVar != null) {
            vtVar.ouw(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            pno(PangleVideoBridge.jsonObjectInit(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.6
            @Override // java.lang.Runnable
            public final void run() {
                bs.this.bly();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.jae == null) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble(VastAttributes.HORIZONTAL_POSITION);
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble(VastAttributes.VERTICAL_POSITION);
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                if (bly(jSONObjectOptJSONObject)) {
                    jgVar.f12445ra = (float) jSONObjectOptJSONObject.optDouble("borderRadiusTopLeft");
                    jgVar.pno = (float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight");
                    jgVar.bly = (float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft");
                    jgVar.tlj = (float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight");
                }
                jgVar.fkw = dOptDouble;
                jgVar.f12443le = dOptDouble2;
                jgVar.f12440cf = dOptDouble3;
                jgVar.ryl = dOptDouble4;
            }
            com.bytedance.sdk.openadsdk.mwh.ra raVar = this.jae;
            if (raVar != null) {
                raVar.ouw(jgVar);
            }
        } catch (Throwable unused) {
        }
    }

    public final bs vt(com.bytedance.sdk.component.bly.le leVar) {
        this.f13475bs = new WeakReference<>(leVar);
        return this;
    }

    public final void vt(@NonNull final Uri uri) {
        int iIndexOf;
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if (!"private".equals(host) && !"dispatch_message".equals(host)) {
                    com.bytedance.sdk.component.utils.ko.yu("TTAD.AndroidObject", "handlrUir: not match schema host");
                    return;
                }
                String string = uri.toString();
                if (string == null || !string.startsWith("bytedance://")) {
                    return;
                }
                try {
                    if (string.equals("bytedance://dispatch_message/")) {
                        WebView webViewRa = ra();
                        if (webViewRa != null) {
                            com.bytedance.sdk.component.utils.jg.ouw(webViewRa, "javascript:ToutiaoJSBridge._fetchQueue()");
                            return;
                        }
                        return;
                    }
                    if (!string.startsWith("bytedance://private/setresult/") || (iIndexOf = string.indexOf(38, 30)) <= 0) {
                        return;
                    }
                    String strSubstring = string.substring(30, iIndexOf);
                    String strSubstring2 = string.substring(iIndexOf + 1);
                    if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                        return;
                    }
                    try {
                        String str = new String(Base64.decode(strSubstring2, 2));
                        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", str);
                        JSONArray jSONArray = new JSONArray(str);
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            vt vtVar = new vt();
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                                if (jSONObjectOptJSONObject != null) {
                                    vtVar.ouw = jSONObjectOptJSONObject.optString("__msg_type", null);
                                    vtVar.vt = jSONObjectOptJSONObject.optString("__callback_id", null);
                                    vtVar.f13494lh = jSONObjectOptJSONObject.optString("func");
                                    vtVar.yu = jSONObjectOptJSONObject.optJSONObject("params");
                                    vtVar.fkw = jSONObjectOptJSONObject.optInt("JSSDK");
                                }
                            } catch (Throwable unused) {
                            }
                            if (!TextUtils.isEmpty(vtVar.ouw) && !TextUtils.isEmpty(vtVar.f13494lh)) {
                                Message messageObtainMessage = this.fak.obtainMessage(11);
                                messageObtainMessage.obj = vtVar;
                                this.fak.sendMessage(messageObtainMessage);
                            }
                        }
                        return;
                    } catch (Exception unused2) {
                        if (com.bytedance.sdk.component.utils.ko.ouw()) {
                            com.bytedance.sdk.component.utils.ko.yu("TTAD.AndroidObject", "failed to parse jsbridge msg queue ".concat(strSubstring2));
                            return;
                        } else {
                            com.bytedance.sdk.component.utils.ko.yu("TTAD.AndroidObject", "failed to parse jsbridge msg queue");
                            return;
                        }
                    }
                } catch (Exception unused3) {
                    return;
                }
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.bs.2
                @Override // java.lang.Runnable
                public final void run() {
                    long j10;
                    String strOuw;
                    JSONObject jSONObject;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    bs.this.ex = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (bs.vt(bs.this, queryParameter3)) {
                        long j11 = 0;
                        try {
                            j10 = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused4) {
                            j10 = 0;
                        }
                        try {
                            j11 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused5) {
                        }
                        long j12 = j11;
                        JSONObject jSONObjectRyl = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(queryParameter4);
                                try {
                                    jSONObjectJsonObjectInit.putOpt("ua_policy", Integer.valueOf(bs.this.pno));
                                } catch (Throwable unused6) {
                                }
                                jSONObjectRyl = jSONObjectJsonObjectInit;
                            }
                        } catch (Throwable unused7) {
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObjectRyl = bs.this.ryl(jSONObjectRyl);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                for (String str2 : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str2)) {
                                            jSONObject2.put("ad_extra_data", PangleVideoBridge.jsonObjectInit(uri.getQueryParameter(str2)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject2.put(str2, uri.getQueryParameter(str2));
                                        }
                                    } catch (Exception unused8) {
                                    }
                                }
                                strOuw = bs.this.ouw;
                                jSONObject = jSONObject2;
                            } catch (Exception unused9) {
                                return;
                            }
                        } else {
                            strOuw = bs.this.ouw(queryParameter2, queryParameter3);
                            jSONObject = jSONObjectRyl;
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(bs.this.bly, queryParameter, strOuw, queryParameter3, j10, j12, jSONObject, com.bytedance.sdk.openadsdk.core.model.th.ra(bs.this.bly));
                    }
                }
            });
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "handleUri exception: ", e10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cf.vt
    public final void vt(String str, JSONObject jSONObject) {
        ouw(str, jSONObject);
    }

    public final void vt(JSONObject jSONObject) {
        String str;
        double d10;
        double d11;
        double dOptDouble;
        double d12;
        double d13;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.AndroidObject", "trigger Class1 method1");
        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "TTAndroidObject handleClickEvent");
        try {
            String strOptString = jSONObject.optString(f.b.f33716c);
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d14 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d13 = dOptDouble6;
                d14 = dOptDouble2;
                d11 = dOptDouble3;
                d12 = dOptDouble5;
                str = strOptString;
                d10 = dOptDouble4;
            } else {
                str = strOptString;
                d10 = 0.0d;
                d11 = 0.0d;
                dOptDouble = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            int iOptInt2 = jSONObject.optInt("clickAreaCategory", -1);
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.f13677le = (float) d14;
            ouwVar.fkw = (float) dOptDouble;
            ouwVar.yu = (float) d11;
            ouwVar.f13678lh = (float) d10;
            ouwVar.vt = (long) d12;
            ouwVar.ouw = (long) d13;
            ouwVar.pno = strOptString2;
            ko.ouw ouwVarOuw = ouwVar.ouw(null);
            ouwVarOuw.f13676ko = true;
            ouwVarOuw.bly = iOptInt;
            ouwVarOuw.tlj = jSONObjectOptJSONObject;
            ouwVarOuw.f13674cf = iOptInt2;
            ouwVarOuw.ryl = jSONObjectOptJSONObject2;
            com.bytedance.sdk.openadsdk.core.model.ko koVarOuw = ouwVarOuw.ouw();
            com.bytedance.sdk.component.adexpress.vt.cf cfVar = this.tlj;
            if (cfVar != null) {
                cfVar.ouw(null, iOptInt, koVarOuw);
            }
            vt(str);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.vt.cf cfVar2 = this.tlj;
            if (cfVar2 != null) {
                cfVar2.ouw(null, -1, null);
            }
        }
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
        if (vppVar == null || vppVar.qni == null || com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar) || this.f13489ub || this.bly.qni.optInt("parent_type") != 2) {
            return false;
        }
        int iUoy = this.bly.uoy();
        if (iUoy != 8 && iUoy != 7) {
            return false;
        }
        this.f13489ub = true;
        return true;
    }

    public final JSONObject yu() {
        JSONObject jSONObject = new JSONObject();
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f13477cf;
        if (koVar != null) {
            try {
                jSONObject.put("state", koVar.l_() ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public final void yu(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
        if (vppVar == null || (ouwVar = vppVar.f13800vm) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (iOptInt < 0 || iOptInt >= list.size()) {
            return;
        }
        ouw(list.get(iOptInt), this.ex, false);
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.f13490uq;
        if (vtVar != null) {
            vtVar.kn();
        }
    }
}
