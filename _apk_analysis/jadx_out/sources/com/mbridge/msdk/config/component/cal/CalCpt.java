package com.mbridge.msdk.config.component.cal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.nori.NoriCpt;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class CalCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.cal.model.a f35762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f35763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f35764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f35766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f35768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f35769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f35770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object f35771q;

    private void a(boolean z10, String str, String str2) {
        HashMap map = new HashMap();
        map.put("result", z10 ? "1" : "2");
        if (!z10) {
            map.put("code", str);
            map.put("reason", str2);
        }
        a(a("910002", map));
    }

    private String h() {
        Map<String, Object> mapF = this.f35762h.f();
        this.f35764j = String.valueOf(mapF.get("userId"));
        this.f35765k = String.valueOf(mapF.get("cbType"));
        this.f35766l = String.valueOf(mapF.get(IronSourceConstants.EVENTS_REWARD_NAME));
        this.f35767m = String.valueOf(mapF.get(IronSourceConstants.EVENTS_REWARD_AMOUNT));
        this.f35768n = String.valueOf(mapF.get("unitId"));
        this.f35769o = String.valueOf(mapF.get("clickId"));
        this.f35770p = String.valueOf(mapF.get("extra"));
        Object objB = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) this.f35754d.b("adModel")).b("host");
        StringBuilder sb2 = new StringBuilder();
        if (objB instanceof String) {
            sb2.append(objB);
            sb2.append("/addReward?");
            sb2.append("user_id=");
            sb2.append(this.f35764j);
            sb2.append("&cb_type=");
            sb2.append(this.f35765k);
            sb2.append("&reward_name=");
            sb2.append(this.f35766l);
            sb2.append("&reward_amount=");
            sb2.append(this.f35767m);
            sb2.append("&unit_id=");
            sb2.append(this.f35768n);
            sb2.append("&click_id=");
            sb2.append(this.f35769o);
            sb2.append("&extra=");
            sb2.append(this.f35770p);
        }
        return sb2.toString();
    }

    private void i() {
        Map<String, Object> mapF = this.f35762h.f();
        this.f35766l = String.valueOf(mapF.get(IronSourceConstants.EVENTS_REWARD_NAME));
        this.f35767m = String.valueOf(mapF.get(IronSourceConstants.EVENTS_REWARD_AMOUNT));
        RewardInfo rewardInfo = new RewardInfo(mapF.get("converted").equals("1"), 1);
        rewardInfo.setRewardName(this.f35766l);
        rewardInfo.setRewardAmount(this.f35767m);
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onAdClose(this.f35763i, rewardInfo);
        }
    }

    private void j() {
        if (this.f35771q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(CreativeInfo.L, this.f35762h.a());
            ((com.mbridge.msdk.config.manager.callback.a) this.f35771q).a(map);
        }
    }

    private void k() {
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onEndCardShow(this.f35763i);
        }
    }

    private void l() {
        if (this.f35771q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35762h.g());
            map.put("ready_state", Boolean.valueOf(this.f35762h.e() == 1));
            ((com.mbridge.msdk.config.manager.callback.a) this.f35771q).a(map);
        }
    }

    private void m() {
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadFail(this.f35763i, this.f35762h.c() == null ? "" : this.f35762h.c());
        }
    }

    private void n() {
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onLoadSuccess(this.f35763i);
        }
    }

    private void o() {
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onVideoLoadSuccess(this.f35763i);
        }
    }

    private void p() {
        if (this.f35771q instanceof com.mbridge.msdk.config.manager.callback.a) {
            HashMap map = new HashMap();
            map.put("init_status", Integer.valueOf(this.f35762h.d()));
            map.put("reason", this.f35762h.c());
            ((com.mbridge.msdk.config.manager.callback.a) this.f35771q).a(map);
        }
    }

    private void q() {
        String strH = h();
        NoriCpt noriCpt = new NoriCpt();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("URLs", strH);
        map2.put("scheme", "HTTP");
        map2.put("method", "GET");
        map.put("componentConfig", map2);
        noriCpt.a(map, this.f35754d, "");
        noriCpt.d();
    }

    private void r() {
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onShowFail(this.f35763i, this.f35762h.c() == null ? "" : this.f35762h.c());
        }
    }

    private void s() {
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onAdShow(this.f35763i);
        }
    }

    private void t() {
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onVideoAdClicked(this.f35763i);
        }
    }

    private void u() {
        Object obj = this.f35771q;
        if (obj instanceof b) {
            ((b) obj).onVideoComplete(this.f35763i);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "910001";
        this.f35762h = new com.mbridge.msdk.config.component.cal.model.a(map);
        MBridgeIds mBridgeIds = new MBridgeIds();
        this.f35763i = mBridgeIds;
        mBridgeIds.setUnitId(this.f35762h.g());
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f35754d;
            if (aVar != null && aVar.a((Object) "sdk_context")) {
                Object objB = this.f35754d.b("sdk_context");
                if (objB instanceof Map) {
                    this.f35771q = ((Map) objB).get("callback");
                }
            }
            if (this.f35771q == null) {
                a(false, "", "Callback Listener is NULL");
            }
        } catch (Throwable th2) {
            q0.b("CallbackComponent", th2.getMessage(), th2);
        }
        g();
    }

    public void g() {
        String strB = this.f35762h.b();
        if (strB == null) {
            a(false, "900001", "command is null");
            return;
        }
        try {
            switch (strB) {
                case "loadV3Success":
                    n();
                    break;
                case "loadSuccess":
                    o();
                    break;
                case "loadFailed":
                    m();
                    break;
                case "showSuccess":
                    s();
                    break;
                case "showFailed":
                    r();
                    break;
                case "endCardShow":
                    k();
                    break;
                case "click":
                    t();
                    break;
                case "closeAndReward":
                    i();
                    break;
                case "videoPlayCompleted":
                    u();
                    break;
                case "serverReward":
                    q();
                    break;
                case "isReady":
                    l();
                    break;
                case "sdkInit":
                    p();
                    break;
                case "buyer_id_call":
                    j();
                    break;
            }
        } catch (Exception e10) {
            q0.b("CallbackComponent", e10.getMessage(), e10);
            a(false, "900002", "callback type failed");
        }
        a(true, "", "");
    }
}
