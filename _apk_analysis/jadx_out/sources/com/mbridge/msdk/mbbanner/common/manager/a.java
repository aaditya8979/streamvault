package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: BannerLoadManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f38426g = "a";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f38427h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38428a = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f38429b = new com.mbridge.msdk.mbbanner.common.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.data.b> f38430c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f38431d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Handler> f38432e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Integer> f38433f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerLoadManager.java */
    public class C0456a implements com.mbridge.msdk.mbbanner.common.listener.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f38434a;

        public C0456a(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f38434a = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.d
        public void a(String str) {
            synchronized (a.b()) {
                this.f38434a.a("");
                a.this.f38431d.put(str, Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: compiled from: BannerLoadManager.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MBridgeIds f38437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f38438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f38440e;

        public b(String str, MBridgeIds mBridgeIds, com.mbridge.msdk.mbbanner.common.listener.b bVar, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f38436a = str;
            this.f38437b = mBridgeIds;
            this.f38438c = bVar;
            this.f38439d = str2;
            this.f38440e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool;
            if (a.this.f38431d == null || !a.this.f38431d.containsKey(this.f38436a) || (bool = (Boolean) a.this.f38431d.get(this.f38436a)) == null || !bool.booleanValue()) {
                if (a.this.f38433f.containsKey(this.f38436a)) {
                    Integer num = (Integer) a.this.f38433f.get(this.f38436a);
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (iIntValue == 2 || iIntValue == 4) {
                        q0.b(a.f38426g, "doUnitRotation: autoRotationStatus=" + iIntValue + " && unitId=" + this.f38436a);
                        if (a.this.f38429b != null) {
                            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880026);
                            bVar.a(this.f38437b);
                            a.this.f38429b.a(this.f38438c, bVar);
                            return;
                        }
                        return;
                    }
                }
                a.this.b(this.f38439d, this.f38436a, this.f38440e, this.f38438c);
            }
        }
    }

    private a() {
    }

    private com.mbridge.msdk.mbbanner.common.data.b a(String str) {
        if (this.f38430c.containsKey(str)) {
            return this.f38430c.get(str);
        }
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
        if (lVarE == null) {
            lVarE = l.i(str);
        }
        com.mbridge.msdk.mbbanner.common.data.b bVar = new com.mbridge.msdk.mbbanner.common.data.b(str, "", 0, lVarE.y());
        this.f38430c.put(str, bVar);
        return bVar;
    }

    public static a b() {
        if (f38427h == null) {
            synchronized (a.class) {
                if (f38427h == null) {
                    f38427h = new a();
                }
            }
        }
        return f38427h;
    }

    public void a(int i10, String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int iIntValue = (!this.f38433f.containsKey(str2) || (num = this.f38433f.get(str2)) == null) ? 0 : num.intValue();
        if (i10 == 1) {
            if (this.f38432e.containsKey(str2) && (handler = this.f38432e.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f38433f.put(str2, Integer.valueOf(i10));
            return;
        }
        if (i10 == 2) {
            if (iIntValue == 1) {
                if (this.f38432e.containsKey(str2) && (handler2 = this.f38432e.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f38433f.put(str2, Integer.valueOf(i10));
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f38433f.put(str2, 1);
                a(str, str2, aVar, bVar);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f38433f.put(str2, 0);
            return;
        }
        if (this.f38432e.containsKey(str2) && (handler3 = this.f38432e.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f38433f.put(str2, Integer.valueOf(i10));
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (aVar == null || aVar.d() <= 0) {
            q0.b(f38426g, "doUnitRotation: Illegal banner request parameters! && unitId=" + str2);
            return;
        }
        if (TextUtils.isEmpty(aVar.b())) {
            aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
        }
        if (this.f38432e.containsKey(str2)) {
            handler = this.f38432e.get(str2);
        } else {
            handler = new Handler();
            this.f38432e.put(str2, handler);
        }
        Handler handler2 = handler;
        b bVar2 = new b(str2, mBridgeIds, bVar, str, aVar);
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            handler2.postDelayed(bVar2, aVar.d());
        }
    }

    public void b(String str) {
        if (this.f38432e.containsKey(str)) {
            Handler handler = this.f38432e.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f38432e.remove(str);
        }
    }

    public void b(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        String strB = aVar.b();
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str2, strB);
        cVarA.h(!TextUtils.isEmpty(aVar.a()) ? "1" : "0");
        cVarA.g(aVar.a());
        cVarA.f(aVar.f() ? "1" : "2");
        cVarA.b(aVar.f() ? 1 : 2);
        cVarA.c(aVar.d());
        com.mbridge.msdk.mbbanner.common.report.a.a("2000123", cVarA, (e) null);
        if (this.f38428a == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880025);
            bVar2.a(mBridgeIds);
            bVar2.b(strB);
            this.f38429b.a(bVar, bVar2);
            return;
        }
        if (bVar == null) {
            com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880001);
            bVar3.a(mBridgeIds);
            bVar3.b(strB);
            this.f38429b.a(bVar, bVar3);
            return;
        }
        Map<String, Boolean> map = this.f38431d;
        if (map != null && map.containsKey(str2) && (bool = this.f38431d.get(str2)) != null && bool.booleanValue()) {
            com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(880016, "Current unit is loading!");
            bVar4.a(mBridgeIds);
            bVar4.b(strB);
            this.f38429b.a(bVar, bVar4);
            return;
        }
        this.f38431d.put(str2, Boolean.TRUE);
        com.mbridge.msdk.mbbanner.common.data.b bVarA = a(str2);
        bVarA.a(strB);
        new com.mbridge.msdk.mbbanner.common.manager.b(this.f38428a, bVarA, bVar, this.f38429b).a(str, str2, aVar, new C0456a(aVar));
        com.mbridge.msdk.mbbanner.common.report.a.a("2000125", cVarA, (e) null);
    }

    public void c() {
        Map<String, com.mbridge.msdk.mbbanner.common.data.b> map = this.f38430c;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f38431d;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f38432e;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f38432e.clear();
        }
        Map<String, Integer> map4 = this.f38433f;
        if (map4 != null) {
            map4.clear();
        }
    }
}
