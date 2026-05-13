package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class od {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f13690cf;
    public String fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f13691jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f13692ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f13693le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13694lh;
    public int mwh;
    public int ouw;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f13695ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public String f13696rn;
    public int ryl;
    public boolean tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public String f13697vm;
    public int vt;
    public int yu;
    public String zih;

    public od(JSONObject jSONObject) {
        this.ryl = 5;
        this.mwh = 5;
        this.f13691jg = 10;
        this.f13692ko = 20;
        this.f13696rn = "Next Ad";
        this.zih = "Next ad in %1$ds";
        this.f13697vm = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.f13694lh = jSONObject.optBoolean("is_playable");
        this.yu = jSONObject.optInt("playable_type", 0);
        this.fkw = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.f13693le = jSONObjectOptJSONObject.optString("playable_url", "");
            this.f13695ra = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.vt = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.ouw = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int i10 = this.yu == 1 ? 10 : 5;
            this.pno = jSONObjectOptJSONObject.optInt("playable_webview_timeout", i10);
            this.bly = jSONObjectOptJSONObject.optInt("playable_js_timeout", i10);
            this.tlj = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.ryl = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.mwh = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.f13691jg = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.f13692ko = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.zih = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.f13696rn = jSONObjectOptJSONObject.optString("next_ad_text");
            this.f13697vm = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.f13690cf = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.f13690cf = 0;
        }
    }

    public static String bly(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.fkw;
    }

    public static String cf(vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        od odVar = vppVar.nbp;
        if (odVar != null && odVar.f13694lh) {
            String str = odVar.f13693le;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (vppVar.fvf == 20) {
            return vppVar.osn;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f13788sd;
        if (vtVar != null) {
            return vtVar.pno;
        }
        return null;
    }

    public static boolean fkw(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        return (odVarOuw == null || !odVarOuw.f13694lh || TextUtils.isEmpty(cf(vppVar))) ? false : true;
    }

    public static String jg(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.f13696rn;
    }

    public static String ko(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.f13697vm;
    }

    public static boolean le(vpp vppVar) {
        return fkw(vppVar) && zih(vppVar) == 1;
    }

    public static boolean lh(vpp vppVar) {
        return vt(vppVar) && zih(vppVar) == 1;
    }

    public static int mwh(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.ryl;
    }

    public static od ouw(vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        return vppVar.nbp;
    }

    public static boolean pno(vpp vppVar) {
        od odVar = vppVar.nbp;
        return odVar != null && odVar.f13694lh && odVar.vt == 1;
    }

    public static boolean ra(vpp vppVar) {
        od odVar = vppVar.nbp;
        return odVar != null && odVar.f13694lh && odVar.vt == 1;
    }

    public static int rn(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.mwh;
    }

    public static long ryl(vpp vppVar) {
        return Math.max(ouw(vppVar) == null ? 5L : r0.pno, ouw(vppVar) != null ? r5.bly : 5L);
    }

    public static String tlj(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.f13693le;
    }

    public static boolean vt(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        return (odVarOuw == null || !odVarOuw.f13694lh || TextUtils.isEmpty(cf(vppVar))) ? false : true;
    }

    public static boolean yu(vpp vppVar) {
        return lh(vppVar) && !ra(vppVar);
    }

    private static int zih(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.yu;
    }
}
