package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MetricsData.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private int B;
    private CampaignEx C;
    private CopyOnWriteArrayList<CampaignEx> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f37960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f37961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Map<String, String>> f37962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Long> f37963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f37964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f37966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f37969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f37970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f37971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f37973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f37974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f37975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f37976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f37977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f37979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f37980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f37981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f37982x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f37983y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f37984z;

    public c() {
        this.f37959a = false;
        this.f37960b = new HashMap();
        this.f37961c = new HashMap();
        this.f37962d = new HashMap();
        this.f37963e = new HashMap();
        this.f37965g = "";
        this.f37966h = new CopyOnWriteArrayList<>();
        this.f37977s = -1;
        this.f37979u = false;
        this.f37981w = false;
        this.D = new CopyOnWriteArrayList<>();
    }

    public c(boolean z10) {
        this.f37959a = false;
        this.f37960b = new HashMap();
        this.f37961c = new HashMap();
        this.f37962d = new HashMap();
        this.f37963e = new HashMap();
        this.f37965g = "";
        this.f37966h = new CopyOnWriteArrayList<>();
        this.f37977s = -1;
        this.f37979u = false;
        this.f37981w = false;
        this.D = new CopyOnWriteArrayList<>();
        this.f37959a = z10;
    }

    private void a(e eVar) {
        if ("2000126".equals(this.f37976r)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(l());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public int A() {
        return this.B;
    }

    public String B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f37967i)) {
            return this.f37967i;
        }
        try {
            if (TextUtils.isEmpty(this.f37967i)) {
                String str = this.f37965g + this.f37976r;
                Map<String, Map<String, String>> map2 = this.f37960b;
                if (map2 != null && map2.containsKey(str) && (map = this.f37960b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f37967i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f37967i;
    }

    public String C() {
        return this.f37972n;
    }

    public boolean D() {
        return this.f37979u;
    }

    public boolean E() {
        return this.f37981w;
    }

    public boolean F() {
        return this.f37980v;
    }

    public boolean G() {
        return this.f37959a;
    }

    public Map<String, String> a(String str) {
        return this.f37961c.containsKey(str) ? this.f37961c.remove(str) : new HashMap();
    }

    public void a(int i10) {
        this.f37968j = i10;
    }

    public void a(CampaignEx campaignEx) {
        this.C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= this.D.size()) {
                        break;
                    }
                    if (this.D.get(i10) != null && this.D.get(i10).getId().equals(campaignEx.getId())) {
                        this.D.set(i10, campaignEx);
                        break;
                    }
                    i10++;
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f37966h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.f37966h.size(); i11++) {
                if (this.f37966h.get(i11) != null && this.f37966h.get(i11).getId().equals(campaignEx.getId())) {
                    this.f37966h.set(i11, campaignEx);
                    return;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f37964f = bVar;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f37965g + str;
            Map<String, Map<String, String>> map2 = this.f37960b;
            if (map2 != null) {
                if (!map2.containsKey(str2) || (map = this.f37960b.get(str2)) == null) {
                    this.f37960b.put(str2, eVar.a());
                } else {
                    map.putAll(eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f37966h.isEmpty()) {
                    this.f37966h.clear();
                }
                this.f37966h.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void a(boolean z10) {
        this.f37979u = z10;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f37963e) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l10 = this.f37963e.get(str);
            return System.currentTimeMillis() - (l10 != null ? l10.longValue() : 0L);
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e10.printStackTrace();
            return 0L;
        }
    }

    public void b(int i10) {
        this.f37983y = i10;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f37965g + str;
            Map<String, Map<String, String>> map2 = this.f37961c;
            if (map2 != null) {
                if (!map2.containsKey(str2) || (map = this.f37961c.get(str2)) == null) {
                    this.f37961c.put(str2, eVar.a());
                } else {
                    map.putAll(eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.D.isEmpty()) {
                        this.D.clear();
                    }
                    this.D.addAll(list);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void b(boolean z10) {
        this.f37981w = z10;
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b bVarU;
        com.mbridge.msdk.foundation.error.b bVarU2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.f37976r = str;
            eVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(B())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, B());
            }
            if (this.f37968j != 0) {
                eVar.a("adtp", Integer.valueOf(g()));
            }
            if (!TextUtils.isEmpty(s())) {
                eVar.a(CampaignEx.JSON_KEY_HB, s());
            }
            if (!TextUtils.isEmpty(l())) {
                eVar.a("bid_tk", l());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a("key", str);
            }
            if (Arrays.asList(b.f37944a).contains(str)) {
                eVar.a("from_cache", D() ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVarU2 = u()) != null) {
                eVar.a("type", Integer.valueOf(bVarU2.h()));
                eVar.a("reason", bVarU2.l());
                if (!TextUtils.isEmpty(bVarU2.m())) {
                    eVar.a("reason_d", bVarU2.m());
                    eVar.a("type_d", Integer.valueOf(bVarU2.n()));
                }
            }
            if ("2000048".contains(str) && (bVarU = u()) != null && !TextUtils.isEmpty(bVarU.m())) {
                eVar.a("type", Integer.valueOf(bVarU.n()));
                eVar.a("reason", bVarU.m());
            }
            if (this.f37968j == 296) {
                eVar.a("auto_load", j());
                eVar.a("auto_refresh", Integer.valueOf(i()));
                eVar.a("auto_refresh_interval", Integer.valueOf(k()));
                eVar.a("content_type", Integer.valueOf(p()));
                eVar.a("temp_display_type", Integer.valueOf(A()));
            }
            a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void c(int i10) {
        this.f37984z = i10;
    }

    public void c(boolean z10) {
        this.f37980v = z10;
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(int i10) {
        this.A = i10;
    }

    public void d(String str) {
        if (this.f37963e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f37963e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void d(boolean z10) {
        this.f37982x = z10;
    }

    public void e(int i10) {
        this.f37977s = i10;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f37965g + str;
            Map<String, Map<String, String>> map = this.f37960b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f37960b.remove(str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void f(int i10) {
        this.f37978t = i10;
    }

    public void f(String str) {
        this.f37975q = str;
    }

    public int g() {
        return this.f37968j;
    }

    public void g(int i10) {
        this.B = i10;
    }

    public void g(String str) {
        this.f37969k = str;
    }

    public void h(String str) {
        this.f37974p = str;
    }

    public int i() {
        return this.f37983y;
    }

    public void i(String str) {
        this.f37965g = str;
    }

    public String j() {
        return this.f37975q;
    }

    public void j(String str) {
        this.f37976r = str;
    }

    public int k() {
        return this.f37984z;
    }

    public void k(String str) {
        this.f37970l = str;
    }

    public String l() {
        return this.f37969k;
    }

    public void l(String str) {
        this.f37973o = str;
    }

    public List<CampaignEx> m() {
        return this.f37966h;
    }

    public void m(String str) {
        this.f37971m = str;
    }

    public CampaignEx n() {
        return this.C;
    }

    public void n(String str) {
        this.f37967i = str;
    }

    public List<CampaignEx> o() {
        return this.D;
    }

    public void o(String str) {
        this.f37972n = str;
    }

    public int p() {
        return this.A;
    }

    public int q() {
        return this.f37977s;
    }

    public int r() {
        return this.f37978t;
    }

    public String s() {
        return this.f37974p;
    }

    public String t() {
        return this.f37965g;
    }

    public com.mbridge.msdk.foundation.error.b u() {
        return this.f37964f;
    }

    public Map<String, Map<String, String>> v() {
        return this.f37962d;
    }

    public Map<String, Map<String, String>> w() {
        return this.f37960b;
    }

    public String x() {
        return this.f37970l;
    }

    public String y() {
        return this.f37973o;
    }

    public String z() {
        return this.f37971m;
    }
}
