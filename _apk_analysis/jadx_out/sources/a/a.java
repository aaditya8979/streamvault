package a;

import android.app.Activity;
import com.ironsource.Z7;
import com.yk.e.util.AdLog;
import j.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3416a = new ConcurrentHashMap();

    public static void e(String str, String str2, int i10, i.b bVar) {
        AdLog.i("BaseAdCache", str + ", adType=" + bVar.f63637c.curAdType + ", adPlcID=" + str2 + ", index=" + i10 + ", revenue=" + bVar.f63636b + ", platform=" + bVar.f63637c.platform + Z7.f30794r + bVar.f63637c.hashCode());
    }

    public static void f(ConcurrentHashMap concurrentHashMap) {
        AdLog.i("BaseAdCache", "========================");
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            int i10 = 0;
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                e("缓存排序", str, i10, (i.b) it.next());
                i10++;
            }
        }
        AdLog.i("BaseAdCache", "========================");
    }

    public synchronized i.b a(String str) {
        i.b bVarB;
        List list;
        try {
            list = (List) this.f3416a.get(str);
        } catch (Exception e10) {
            AdLog.i("BaseAdCache", e10.getMessage());
        }
        bVarB = (list == null || list.size() <= 0) ? null : b(str);
        return bVarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r2.isDestroyed() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i.b b(java.lang.String r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r5.f3416a
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L66
            int r1 = r0.size()
            r2 = 1
            if (r1 < r2) goto L66
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            i.b r0 = (i.b) r0
            j.y1 r2 = r0.f63637c
            boolean r2 = r2.isExpired()
            if (r2 == 0) goto L2e
            java.lang.String r2 = "缓存过期"
            e(r2, r6, r1, r0)
            r5.h(r6)
            i.b r6 = r5.b(r6)
            return r6
        L2e:
            j.l0 r2 = r0.f63638d     // Catch: java.lang.Exception -> L57
            android.app.Activity r2 = r2.f71907a     // Catch: java.lang.Exception -> L57
            j.y1 r3 = r0.f63637c     // Catch: java.lang.Exception -> L57
            java.lang.String r3 = r3.platform     // Catch: java.lang.Exception -> L57
            java.lang.String r4 = "admob"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L5f
            boolean r3 = r2.isFinishing()     // Catch: java.lang.Exception -> L57
            if (r3 != 0) goto L4a
            boolean r2 = r2.isDestroyed()     // Catch: java.lang.Exception -> L57
            if (r2 == 0) goto L5f
        L4a:
            java.lang.String r2 = "Act失效"
            e(r2, r6, r1, r0)
            r5.h(r6)
            i.b r6 = r5.b(r6)
            return r6
        L57:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            com.yk.e.util.AdLog.e(r3, r2)
        L5f:
            java.lang.String r2 = "有效缓存"
            e(r2, r6, r1, r0)
            return r0
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "缓存列表为空或者下标越界"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.b(java.lang.String):i.b");
    }

    public synchronized void c(Activity activity, String str, i.b bVar) {
        Object obj;
        try {
            List list = (List) this.f3416a.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(bVar);
                obj = arrayList;
            } else {
                list.add(bVar);
                Collections.sort(list);
                obj = list;
            }
            this.f3416a.put(str, obj);
            f(this.f3416a);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public synchronized void d(i.b bVar, String str) {
        List list;
        try {
            list = (List) this.f3416a.get(str);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        if (list != null && list.size() > 0) {
            list.remove(bVar);
            y1 y1Var = bVar.f63637c;
            AdLog.i("BaseAdCache", "移除胜出的广告缓存，platform = " + y1Var.platform + ", type = " + y1Var.curAdType + ", revenue = " + y1Var.getRevenue());
            f(this.f3416a);
        }
    }

    public synchronized int g(String str) {
        List list;
        list = (List) this.f3416a.get(str);
        return list != null ? list.size() : 0;
    }

    public synchronized void h(String str) {
        List list;
        try {
            list = (List) this.f3416a.get(str);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        if (list != null && list.size() > 0) {
            list.remove(0);
            AdLog.i("BaseAdCache", "移除广告缓存，index = 0");
            f(this.f3416a);
        }
    }
}
