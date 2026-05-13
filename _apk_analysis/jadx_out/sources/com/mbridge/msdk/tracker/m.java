package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: MBridgeTrackManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f40950b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f40951a;

    /* JADX INFO: compiled from: MBridgeTrackManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f40951a.p().b();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    Log.e("TrackManager", "flush error", e10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: MBridgeTrackManager.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f40953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f40954b;

        public b(e eVar, JSONObject jSONObject) {
            this.f40953a = eVar;
            this.f40954b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.f40951a.g().a(this.f40953a);
                JSONObject jSONObject = this.f40954b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.f40954b.put("track_time", jArrE[0]);
                    this.f40954b.put("track_count", jArrE[1]);
                    this.f40953a.a(this.f40954b);
                }
                this.f40953a.b(m.this.f40951a.b().f41151f);
                m.this.f40951a.g().b(this.f40953a);
            } catch (Exception e10) {
                Log.d("TrackManager", "trackEvent error", e10);
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f40951a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m b(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f40950b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.f40951a.a(eVar);
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = f40950b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", "getAllTrackManager error", e10);
            }
        }
        return mVarArr;
    }

    public void a() {
        try {
            this.f40951a.h().a(new a());
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", "flush error", e10);
            }
        }
    }

    public void a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f40950b;
        m mVar = concurrentHashMap.get(str);
        if (y.b(mVar)) {
            concurrentHashMap.put(str, new m(str, context, xVar));
        } else {
            mVar.f40951a.a(xVar);
        }
    }

    public void a(JSONObject jSONObject) {
        this.f40951a.a(jSONObject);
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public JSONObject c() {
        return this.f40951a.o();
    }

    public void c(e eVar) {
        d(eVar);
    }

    public String d() {
        return this.f40951a.s();
    }

    public void d(e eVar) {
        if (this.f40951a.w()) {
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI != null && !jSONObjectI.has("ts")) {
                try {
                    jSONObjectI.put("ts", System.currentTimeMillis());
                } catch (Exception e10) {
                    Log.e("TrackManager", "trackEvent error", e10);
                }
            }
            try {
                this.f40951a.h().a(new b(eVar, jSONObjectI));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    Log.e("TrackManager", "trackEvent error", e11);
                }
            }
        }
    }

    public long[] e() {
        return this.f40951a.g().a();
    }

    public String f() {
        return this.f40951a.v();
    }

    public boolean g() {
        return !this.f40951a.w();
    }

    public String h() {
        if (!g()) {
            return this.f40951a.x();
        }
        if (com.mbridge.msdk.tracker.a.f40902a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return d();
    }
}
