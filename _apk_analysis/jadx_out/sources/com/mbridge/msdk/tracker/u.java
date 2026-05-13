package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: ReportMonitor.java */
/* JADX INFO: loaded from: classes9.dex */
public class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile u f41134g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f41135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f41136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f41137c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41138d = 30000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f41139e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f41140f = new a(Looper.getMainLooper());

    /* JADX INFO: compiled from: ReportMonitor.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                u.this.b();
                u.this.f41140f.removeMessages(1);
                u.this.d();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private u() {
    }

    public static u a() {
        if (f41134g == null) {
            synchronized (u.class) {
                if (f41134g == null) {
                    f41134g = new u();
                }
            }
        }
        return f41134g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f41140f.sendEmptyMessageDelayed(1, this.f41138d);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(Context context, x xVar, int i10, JSONObject jSONObject) {
        this.f41136b = xVar;
        this.f41138d = i10;
        m mVarB = m.b("monitor", context, xVar);
        this.f41135a = mVarB;
        if (mVarB != null) {
            mVarB.a(jSONObject);
            this.f41135a.h();
        }
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ab, blocks: (B:5:0x0008, B:7:0x000d, B:9:0x001b, B:12:0x002e, B:15:0x003a, B:18:0x0058, B:23:0x00a4, B:20:0x0070), top: B:28:0x0008, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r14 = this;
            com.mbridge.msdk.tracker.m[] r0 = com.mbridge.msdk.tracker.m.b()
            int r1 = r0.length
            if (r1 != 0) goto L8
            return
        L8:
            int r1 = r0.length     // Catch: java.lang.Exception -> Lab
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto Laf
            r4 = r0[r3]     // Catch: java.lang.Exception -> Lab
            java.lang.String r5 = r4.f()     // Catch: java.lang.Exception -> Lab
            java.lang.String r6 = "monitor"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Exception -> Lab
            if (r6 != 0) goto La7
            java.lang.String r6 = r4.d()     // Catch: java.lang.Exception -> Lab
            long[] r4 = r4.e()     // Catch: java.lang.Exception -> Lab
            r7 = 1
            r8 = r4[r7]     // Catch: java.lang.Exception -> Lab
            r10 = 0
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L2e
            goto La7
        L2e:
            r10 = r4[r2]     // Catch: java.lang.Exception -> Lab
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.f41139e     // Catch: java.lang.Exception -> Lab
            boolean r4 = r4.containsKey(r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r12 = ""
            if (r4 == 0) goto L58
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.f41139e     // Catch: java.lang.Exception -> Lab
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> Lab
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lab
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lab
            r13.<init>()     // Catch: java.lang.Exception -> Lab
            r13.append(r10)     // Catch: java.lang.Exception -> Lab
            r13.append(r12)     // Catch: java.lang.Exception -> Lab
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> Lab
            boolean r4 = r13.equals(r4)     // Catch: java.lang.Exception -> Lab
            if (r4 == 0) goto L58
            goto La7
        L58:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.f41139e     // Catch: java.lang.Exception -> Lab
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lab
            r13.<init>()     // Catch: java.lang.Exception -> Lab
            r13.append(r10)     // Catch: java.lang.Exception -> Lab
            r13.append(r12)     // Catch: java.lang.Exception -> Lab
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Exception -> Lab
            r4.put(r5, r12)     // Catch: java.lang.Exception -> Lab
            com.mbridge.msdk.tracker.m r4 = r14.f41135a     // Catch: java.lang.Exception -> Lab
            if (r4 == 0) goto La7
            com.mbridge.msdk.tracker.e r4 = new com.mbridge.msdk.tracker.e     // Catch: java.lang.Exception -> La3
            java.lang.String r12 = "event_lib_monitor"
            r4.<init>(r12)     // Catch: java.lang.Exception -> La3
            r4.a(r7)     // Catch: java.lang.Exception -> La3
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> La3
            r7.<init>()     // Catch: java.lang.Exception -> La3
            java.lang.String r12 = "key"
            java.lang.String r13 = "m_report_rate"
            r7.put(r12, r13)     // Catch: java.lang.Exception -> La3
            java.lang.String r12 = "task_name"
            r7.put(r12, r5)     // Catch: java.lang.Exception -> La3
            java.lang.String r5 = "task_count"
            r7.put(r5, r8)     // Catch: java.lang.Exception -> La3
            java.lang.String r5 = "task_session_id"
            r7.put(r5, r6)     // Catch: java.lang.Exception -> La3
            java.lang.String r5 = "task_ts"
            r7.put(r5, r10)     // Catch: java.lang.Exception -> La3
            r4.a(r7)     // Catch: java.lang.Exception -> La3
            com.mbridge.msdk.tracker.m r5 = r14.f41135a     // Catch: java.lang.Exception -> La3
            r5.d(r4)     // Catch: java.lang.Exception -> La3
            goto La7
        La3:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Exception -> Lab
        La7:
            int r3 = r3 + 1
            goto Lb
        Lab:
            r0 = move-exception
            r0.printStackTrace()
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.u.b():void");
    }

    public synchronized void c() {
        if (this.f41137c) {
            return;
        }
        this.f41137c = true;
        d();
    }
}
