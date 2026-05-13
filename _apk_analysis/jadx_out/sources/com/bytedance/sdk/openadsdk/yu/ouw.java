package com.bytedance.sdk.openadsdk.yu;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ouw implements com.bytedance.sdk.component.le.ouw.yu.ouw.vt {
    private int bly;
    private String ex;
    private long fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private String f14491jg;
    private int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private String f14492ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f14493le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f14494lh;
    private JSONObject mwh;
    public final String ouw;
    private int pno;
    private com.bytedance.sdk.openadsdk.yu.vt.ouw qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f14495ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private String f14496rn;
    private final AtomicBoolean ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private String f14497th;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f14498vm;
    private String vpp;
    public final JSONObject vt;
    private long yu;
    private String zih;
    private String zin;
    private static final Set<String> tlj = new HashSet(Arrays.asList("insight_log"));

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private static final Map<String, String> f14490cf = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put(IronSourceConstants.EVENTS_ERROR_CODE, "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.yu.ouw$ouw, reason: collision with other inner class name */
    public static final class C0266ouw {
        public JSONObject bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public final int f14499cf;
        public String fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public int f14500jg;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public int f14501ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f14502le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f14503lh;
        public com.bytedance.sdk.openadsdk.yu.vt.ouw mwh;
        public String ouw;
        public String pno;
        private final long qbp;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public String f14504ra;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public int f14505rn;
        public String ryl;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.yu.vt.vt f14506th;
        public String tlj;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public String f14507vm;
        public String vt;
        public String yu;
        public boolean zih;

        public C0266ouw(long j10, vpp vppVar) {
            this.f14500jg = -1;
            this.f14501ko = -1;
            this.f14505rn = -1;
            if (vppVar != null) {
                this.zih = od.vt(vppVar);
                this.f14500jg = vppVar.f13754bs;
                this.f14501ko = vppVar.fvf;
                this.f14505rn = vppVar.ucs;
            }
            this.qbp = j10;
            this.f14499cf = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        }

        public final C0266ouw ouw(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.bly = jSONObject;
            return this;
        }

        public final void ouw(com.bytedance.sdk.openadsdk.yu.vt.ouw ouwVar) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw(this.f14503lh, this.f14507vm, this.f14502le, this.vt);
            this.mwh = ouwVar;
            final ouw ouwVar2 = new ouw(this);
            try {
                com.bytedance.sdk.openadsdk.yu.vt.vt vtVar = this.f14506th;
                if (vtVar != null) {
                    vtVar.ouw(ouwVar2.vt, this.qbp);
                } else {
                    new com.bytedance.sdk.openadsdk.yu.vt.lh().ouw(ouwVar2.vt, this.qbp);
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.lh("AdEvent", th2);
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                bs.lh(new com.bytedance.sdk.component.pno.pno("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(ouwVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(ouwVar2);
            }
        }
    }

    public ouw(C0266ouw c0266ouw) {
        this.f14493le = "adiff";
        this.ryl = new AtomicBoolean(false);
        this.mwh = new JSONObject();
        if (TextUtils.isEmpty(c0266ouw.ouw)) {
            this.ouw = ex.ouw();
        } else {
            this.ouw = c0266ouw.ouw;
        }
        this.qbp = c0266ouw.mwh;
        this.vpp = c0266ouw.fkw;
        this.f14491jg = c0266ouw.vt;
        this.f14492ko = c0266ouw.f14503lh;
        if (TextUtils.isEmpty(c0266ouw.yu)) {
            this.f14496rn = "app_union";
        } else {
            this.f14496rn = c0266ouw.yu;
        }
        this.zin = c0266ouw.tlj;
        this.zih = c0266ouw.f14504ra;
        this.f14497th = c0266ouw.pno;
        this.f14498vm = c0266ouw.f14502le;
        this.jqy = c0266ouw.f14499cf;
        this.ex = c0266ouw.ryl;
        JSONObject jSONObject = c0266ouw.bly;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        c0266ouw.bly = jSONObject;
        this.mwh = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.vt = jSONObject2;
        if (!TextUtils.isEmpty(c0266ouw.ryl)) {
            try {
                jSONObject2.put("app_log_url", c0266ouw.ryl);
            } catch (JSONException e10) {
                qbp.lh("AdEvent", e10.getMessage());
            }
        }
        this.f14495ra = c0266ouw.f14500jg;
        this.pno = c0266ouw.f14501ko;
        this.bly = c0266ouw.f14505rn;
        this.f14494lh = c0266ouw.zih;
        this.fkw = System.currentTimeMillis();
        JSONObject jSONObject3 = this.mwh;
        if (jSONObject3 != null) {
            String strOptString = jSONObject3.optString("value");
            String strOptString2 = this.mwh.optString("category");
            String strOptString3 = this.mwh.optString("log_extra");
            if (ouw(this.zih, this.f14496rn, this.vpp)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !ouw(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.zih) || TextUtils.equals(this.zih, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.f14496rn) || !ouw(this.f14496rn)) && (TextUtils.isEmpty(strOptString2) || !ouw(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.vpp) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!ouw(this.zih, this.f14496rn, this.vpp)) {
            return;
        }
        this.yu = com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw.incrementAndGet();
    }

    public ouw(String str, JSONObject jSONObject) {
        this.f14493le = "adiff";
        this.ryl = new AtomicBoolean(false);
        this.mwh = new JSONObject();
        this.ouw = str;
        this.vt = jSONObject;
    }

    private JSONObject ouw(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.ouw);
            }
            if (this.f14494lh) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.f14495ra);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.pno);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.bly);
                }
            }
            for (String str : f14490cf.keySet()) {
                try {
                    if (jSONObject.has(str)) {
                        Object objOpt = jSONObject.opt(str);
                        jSONObject.remove(str);
                        jSONObject.put(f14490cf.get(str), objOpt);
                    }
                } catch (Throwable unused) {
                }
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.ouw + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            qbp.lh("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    private static boolean ouw(String str) {
        str.hashCode();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private static boolean ouw(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    public final JSONObject fkw() {
        JSONObject jSONObjectYu = yu();
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(jSONObjectYu.toString());
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.remove("app_log_url");
            }
            return jSONObjectJsonObjectInit;
        } catch (JSONException e10) {
            qbp.lh("AdEvent", e10.getMessage());
            return jSONObjectYu;
        }
    }

    public final boolean le() {
        Set<String> setEy;
        if (this.vt == null || (setEy = com.bytedance.sdk.openadsdk.core.zih.yu().ey()) == null) {
            return false;
        }
        String strOptString = this.vt.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setEy.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.f14492ko)) {
            return false;
        }
        return setEy.contains(this.f14492ko);
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final long lh() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final JSONObject ouw() {
        return yu();
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final long vt() {
        return this.fkw;
    }

    public JSONObject yu() {
        if (this.ryl.get()) {
            return this.vt;
        }
        try {
            this.vt.putOpt("app_log_url", this.ex);
            this.vt.putOpt("tag", this.f14491jg);
            this.vt.putOpt("label", this.f14492ko);
            this.vt.putOpt("category", this.f14496rn);
            if (!TextUtils.isEmpty(this.zih)) {
                try {
                    this.vt.putOpt("value", Long.valueOf(Long.parseLong(this.zih)));
                } catch (NumberFormatException unused) {
                    this.vt.putOpt("value", 0L);
                }
            }
            if (!TextUtils.isEmpty(this.f14497th)) {
                try {
                    this.vt.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f14497th)));
                } catch (Exception unused2) {
                }
            }
            if (!TextUtils.isEmpty(this.vpp)) {
                this.vt.putOpt("log_extra", this.vpp);
            }
            if (!TextUtils.isEmpty(this.zin)) {
                try {
                    this.vt.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.zin)));
                } catch (NumberFormatException unused3) {
                }
            }
            JSONObject jSONObject = this.vt;
            String str = this.f14492ko;
            try {
                Set<String> set = tlj;
                if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                    jSONObject.putOpt("is_ad_event", "1");
                }
            } catch (Throwable th2) {
                qbp.yu("AdEvent", th2);
            }
            try {
                this.vt.putOpt("nt", Integer.valueOf(this.jqy));
            } catch (Exception unused4) {
            }
            Iterator<String> itKeys = this.mwh.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.vt.putOpt(next, this.mwh.opt(next));
            }
            if (this.vt.has("ad_extra_data")) {
                Object objOpt = this.vt.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            com.bytedance.sdk.component.utils.ko.fkw("AdEvent", "ad_extra_data is JSONObject");
                            this.vt.put("ad_extra_data", ouw((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.vt.put("ad_extra_data", ouw(PangleVideoBridge.jsonObjectInit((String) objOpt)).toString());
                        }
                    } catch (JSONException e10) {
                        qbp.yu("AdEvent", "json error", e10.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("adiff", this.ouw);
                    if (this.f14494lh) {
                        jSONObject2.put("interaction_method", this.f14495ra);
                        jSONObject2.put("real_interaction_method", this.pno);
                        jSONObject2.put("image_mode", this.bly);
                    }
                    this.vt.put("ad_extra_data", jSONObject2.toString());
                } catch (JSONException e11) {
                    qbp.yu("AdEvent", "json error", e11.getMessage());
                }
            }
            this.ryl.set(true);
        } catch (Throwable th3) {
            com.bytedance.sdk.component.utils.ko.lh("AdEvent", th3);
        }
        return this.vt;
    }
}
