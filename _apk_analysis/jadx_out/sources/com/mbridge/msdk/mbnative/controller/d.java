package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.network.g;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: NativePreloadController.java */
/* JADX INFO: loaded from: classes10.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f38715r = "d";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f38716s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Map<String, Boolean> f38717t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Map<String, k> f38718u = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Map<String, Integer> f38719v = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Map<String, Integer> f38720w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static d f38721x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f38722y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f38723z = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f38724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.click.a f38725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f38726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38727e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f38731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f38732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Integer> f38733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Integer> f38734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f38735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f38737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f38738p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Queue<Integer> f38728f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Queue<Long> f38729g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38730h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f38739q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: compiled from: NativePreloadController.java */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: compiled from: NativePreloadController.java */
    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f38742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f38743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f38744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f38745g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f38748j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f38750l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<String> f38746h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f38747i = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f38749k = true;

        /* JADX INFO: compiled from: NativePreloadController.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f38752a;

            public a(CampaignUnit campaignUnit) {
                this.f38752a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b.this.f38748j != null) {
                    b bVar = b.this;
                    d.this.f38703a.removeCallbacks(bVar.f38748j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f38752a);
                }
                if (d.f38716s.containsKey("0_" + b.this.unitId)) {
                    d.f38716s.remove("0_" + b.this.unitId);
                }
                if (b.this.f38745g > 0) {
                    if (this.f38752a.ads.size() > b.this.f38745g) {
                        b bVar2 = b.this;
                        bVar2.f38742d = bVar2.f38745g;
                    } else {
                        b.this.f38742d = this.f38752a.ads.size();
                    }
                } else if (b.this.f38745g == -1) {
                    b.this.f38742d = 0;
                } else if (b.this.f38745g == -3) {
                    b.this.f38742d = this.f38752a.ads.size();
                } else if (b.this.f38745g == -2) {
                    if (this.f38752a.getTemplate() == 3) {
                        if (b.this.f38744f != 0) {
                            b bVar3 = b.this;
                            bVar3.f38742d = bVar3.f38744f;
                        }
                    } else if (b.this.f38743e != 0) {
                        b bVar4 = b.this;
                        bVar4.f38742d = bVar4.f38743e;
                    }
                    if (b.this.f38742d <= 0) {
                        b.this.f38742d = ((Integer) d.f38719v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f38752a.ads.size() < b.this.f38742d) {
                    b.this.f38742d = this.f38752a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.f38752a.getAds().get(0), b.this.unitId);
                for (int i10 = 0; i10 < this.f38752a.ads.size(); i10++) {
                    CampaignEx campaignEx = this.f38752a.ads.get(i10);
                    campaignEx.setLocalRequestId(cVarA.t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zC = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.f38742d && campaignEx.getOfferType() != 99) {
                        if (v0.c(campaignEx)) {
                            campaignEx.setRtinsType(zC ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            v0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f37715x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.f38735m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(this.f38752a.getAds().get(0) != null ? this.f38752a.getAds().get(0).getType() : 1);
                if (bVarA != null) {
                    bVarA.a(b.this.unitId, arrayList);
                }
                d.a(b.this.f38741c, b.this.unitId);
                if (Looper.myLooper() != null && z10) {
                    Looper.loop();
                }
                if (this.f38752a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f38752a.getAds().get(0).getMaitve(), this.f38752a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativePreloadController.java */
        public class C0466b extends c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignEx f38754a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f38755b;

            public C0466b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f38754a = campaignEx;
                this.f38755b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f38754a, this.f38755b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        /* JADX INFO: compiled from: NativePreloadController.java */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f38757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f38758b;

            public c(String str, int i10) {
                this.f38757a = str;
                this.f38758b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f38747i) {
                    if (b.this.f38748j != null) {
                        b bVar = b.this;
                        d.this.f38703a.removeCallbacks(bVar.f38748j);
                    }
                    if (b.this.a() == 1 || b.this.f38749k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f38757a;
                        int iA = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, iA, bVar3.unitId, bVar3.placementId, bVar3.f38750l);
                    }
                } else if (b.this.f38749k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f38757a;
                    int iA2 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, iA2, bVar5.unitId, bVar5.placementId, bVar5.f38750l);
                }
                if (this.f38758b == -1) {
                    d.b(b.this.f38741c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativePreloadController.java */
        public class RunnableC0467d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f38760a;

            public RunnableC0467d(List list) {
                this.f38760a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f38747i && b.this.f38748j != null) {
                    b bVar = b.this;
                    d.this.f38703a.removeCallbacks(bVar.f38748j);
                }
                List list = this.f38760a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f38760a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.f38735m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f38760a);
                    if (d.f38716s.containsKey("1_" + b.this.unitId)) {
                        d.f38716s.remove("1_" + b.this.unitId);
                    }
                    d.f38716s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i10) {
            this.f38741c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextD, cVar, new C0466b(campaignEx, contextD, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            d.this.a(new Thread(new c(str, i10)));
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f38750l = aVar;
        }

        public void a(Runnable runnable) {
            this.f38748j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC0467d(list)));
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<g> list, CampaignUnit campaignUnit) {
            d.this.f38736n = true;
            d.this.a(true, this.f38750l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f38747i = z10;
        }

        public void b(int i10) {
            this.f38745g = i10;
        }

        public void b(List<String> list) {
            this.f38746h = list;
        }

        public void b(boolean z10) {
            this.f38749k = z10;
        }

        public void c(int i10) {
            this.f38743e = i10;
        }

        public void d(int i10) {
            this.f38742d = i10;
        }

        public void e(int i10) {
            this.f38744f = i10;
        }
    }

    /* JADX INFO: compiled from: NativePreloadController.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f38763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f38765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f38766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f38767f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f38768g = false;

        public c(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str, String str2) {
            this.f38762a = i10;
            this.f38763b = dVar;
            this.f38764c = i11;
            this.f38765d = str;
            this.f38766e = str2;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f38767f = aVar;
        }

        public void a(String str) {
            this.f38765d = str;
        }

        public void a(boolean z10) {
            this.f38768g = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38763b.a(true);
            int i10 = this.f38762a;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.f38764c, this.f38765d, this.f38766e, this.f38767f);
            } else {
                d.this.f38736n = true;
                if (this.f38768g || this.f38764c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f38764c, this.f38765d, this.f38766e, this.f38767f);
                }
            }
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f38703a = new a();
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f38715r, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
        return 0;
    }

    public static void a(int i10, String str) {
        k kVar = f38718u.containsKey(str) ? f38718u.get(str) : new k();
        int iIntValue = f38719v.get(str).intValue();
        int iIntValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i10 == 1) {
            int iA = iIntValue + kVar.a();
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i10 == 2) {
            int iB = iIntValue + kVar.b();
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        f38718u.put(str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f39028p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str);
                        }
                    } catch (Exception unused) {
                        q0.b(f38715r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e10) {
                q0.b(f38715r, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public static void b(int i10, String str) {
        if (f38718u.containsKey(str)) {
            k kVar = f38718u.get(str);
            if (i10 == 1) {
                kVar.a(0);
            } else if (i10 == 2) {
                kVar.b(0);
            }
            f38718u.put(str, kVar);
        }
    }

    public static Map<String, Integer> c() {
        return f38719v;
    }

    public static Map<String, Integer> d() {
        return f38720w;
    }

    public static Map<String, k> e() {
        return f38718u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return f38716s;
    }

    public static Map<String, Boolean> g() {
        return f38717t;
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        l lVarE = h.b().e("", str);
        this.f38726d = lVarE;
        if (lVarE == null) {
            this.f38726d = l.i(str);
        }
        List<Integer> listB = this.f38726d.b();
        this.f38732j = listB;
        if (listB == null || listB.size() <= 0 || !this.f38732j.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02af A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02be A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e4 A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0329 A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0378 A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0385 A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b9 A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0414 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0416 A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0447 A[Catch: Exception -> 0x0491, TryCatch #5 {Exception -> 0x0491, blocks: (B:3:0x001c, B:6:0x0069, B:8:0x006f, B:10:0x0077, B:12:0x007f, B:14:0x0087, B:16:0x0091, B:17:0x009b, B:19:0x00a5, B:20:0x00af, B:22:0x00b9, B:24:0x00c3, B:26:0x00c9, B:27:0x00d2, B:29:0x00eb, B:30:0x00f2, B:32:0x00f8, B:33:0x00fd, B:35:0x0124, B:36:0x0129, B:43:0x0142, B:46:0x014a, B:48:0x0152, B:50:0x0158, B:52:0x015d, B:54:0x0161, B:58:0x0175, B:60:0x017d, B:62:0x0183, B:66:0x018e, B:67:0x01a0, B:69:0x01a4, B:70:0x01ba, B:72:0x01c2, B:74:0x01d1, B:75:0x01e7, B:78:0x01f8, B:80:0x01fe, B:84:0x020b, B:86:0x0212, B:88:0x0218, B:114:0x0263, B:115:0x0270, B:123:0x0286, B:125:0x02af, B:126:0x02b6, B:128:0x02be, B:130:0x02d0, B:131:0x02d9, B:133:0x02e4, B:139:0x02f4, B:143:0x0304, B:148:0x0311, B:152:0x033d, B:154:0x0378, B:155:0x037d, B:157:0x0385, B:159:0x038f, B:160:0x03af, B:162:0x03b9, B:164:0x03c3, B:165:0x03e3, B:169:0x0419, B:171:0x0447, B:175:0x0479, B:174:0x0460, B:168:0x0416, B:151:0x0329, B:140:0x02f9, B:141:0x02fe, B:94:0x0221, B:96:0x0227, B:108:0x024c, B:117:0x0277, B:176:0x047f), top: B:191:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x045b  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r26, long r27, int r29, com.mbridge.msdk.setting.l r30, java.lang.String r31, java.lang.String r32, com.mbridge.msdk.preload.listenter.a r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(int, long, int, com.mbridge.msdk.setting.l, java.lang.String, java.lang.String, com.mbridge.msdk.preload.listenter.a, boolean):void");
    }

    public void a(int i10, long j10, String str, String str2, Map<String, Object> map, int i11, l lVar, com.mbridge.msdk.preload.listenter.a aVar) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        if (i10 != 1 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null) {
            List<Campaign> listA = bVarA.a(str, this.f38738p);
            if (listA != null && listA.size() > 0) {
                a(true, aVar, (String) null);
                return;
            }
        }
        if (i10 == 1) {
            a(i10, j10, i11, lVar, str, str2, true, aVar);
        } else if (i10 != 2) {
            a(i10, j10, i11, lVar, str, str2, aVar, false);
        } else {
            a(2, j10, i11, lVar, str, str2, aVar, false);
        }
    }

    public void a(int i10, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f38728f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f38728f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f38729g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.f38729g.poll().longValue();
            }
            q0.c(f38715r, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.f38731i, i10, lVar, aVar);
        } catch (Throwable unused) {
            q0.b(f38715r, "queue poll exception");
        }
    }

    public void a(String str, int i10, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        Log.e(f38715r, str);
        try {
            Queue<Integer> queue = this.f38728f;
            if ((queue == null || queue.size() > 0) && this.f38728f != null) {
                a(i10, this.f38726d, str2, str3, aVar);
            } else {
                a(false, aVar, str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f38724b == null) {
            this.f38724b = new j();
        }
        this.f38724b.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(Thread thread) {
        if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.start();
        } else {
            thread.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.Map<java.lang.String, java.lang.Object> r23, int r24) {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(java.util.Map, int):void");
    }

    public void a(boolean z10, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z10 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z10 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(boolean z10, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z10) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }
}
