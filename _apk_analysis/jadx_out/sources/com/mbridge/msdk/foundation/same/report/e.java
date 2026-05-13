package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import com.ironsource.G5;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.BatchReportDao;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: MBRevenueBatchReportManager.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f37904l = "e";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f37905m = "roas";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile e f37906n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicInteger f37907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BatchReportDao f37908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37909c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37910d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37911e = com.mbridge.msdk.foundation.same.net.utils.d.h().O;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f37912f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37913g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f37914h = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f37915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Stack<Long> f37916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.tracker.m f37917k;

    /* JADX INFO: compiled from: MBRevenueBatchReportManager.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Bundle data = message.getData();
                if (e.this.f37915i == null || e.this.f37908b == null || data == null) {
                    return;
                }
                e.this.f37915i.removeMessages(2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<BatchReportMessage> batchReportMessages = e.this.f37908b.getBatchReportMessages(jCurrentTimeMillis, 2);
                e.this.b(batchReportMessages, jCurrentTimeMillis);
                e.this.f37907a.set(0);
                String str = e.f37904l;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("超时上报触发了，需要上报的数据： ");
                sb2.append(batchReportMessages != null ? batchReportMessages.size() : 0);
                q0.a(str, sb2.toString());
                return;
            }
            if (i10 == 2) {
                Bundle data2 = message.getData();
                if (e.this.f37915i == null || e.this.f37908b == null || data2 == null) {
                    return;
                }
                e.this.f37915i.removeMessages(1);
                long j10 = data2.getLong("last_report_time");
                ArrayList<BatchReportMessage> batchReportMessages2 = e.this.f37908b.getBatchReportMessages(j10, 2);
                e.this.b(batchReportMessages2, j10);
                String str2 = e.f37904l;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("队列上报触发了，需要上报的数据： ");
                sb3.append(batchReportMessages2 != null ? batchReportMessages2.size() : 0);
                q0.a(str2, sb3.toString());
                return;
            }
            if (i10 == 3) {
                Bundle data3 = message.getData();
                if (data3 != null) {
                    e.this.a((ArrayList<BatchReportMessage>) data3.getParcelableArrayList("report_message"), data3.getLong("last_report_time"));
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            Bundle data4 = message.getData();
            if (e.this.f37915i == null || e.this.f37908b == null || data4 == null || !e.this.f37913g) {
                return;
            }
            e.this.f37915i.removeMessages(4);
            ArrayList<BatchReportMessage> batchReportMessages3 = e.this.f37908b.getBatchReportMessages(System.currentTimeMillis(), 2);
            if (batchReportMessages3 != null && batchReportMessages3.size() > 0) {
                for (int i11 = 0; i11 < batchReportMessages3.size(); i11++) {
                    BatchReportMessage batchReportMessage = batchReportMessages3.get(i11);
                    e.this.a(batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                }
            }
            String str3 = e.f37904l;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("切换上报lib，需要上报的数据： ");
            sb4.append(batchReportMessages3 != null ? batchReportMessages3.size() : 0);
            q0.a(str3, sb4.toString());
        }
    }

    /* JADX INFO: compiled from: MBRevenueBatchReportManager.java */
    public class b extends com.mbridge.msdk.foundation.same.report.net.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f37919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f37920c;

        public b(long j10, ArrayList arrayList) {
            this.f37919b = j10;
            this.f37920c = arrayList;
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.b
        public void a(String str) {
            Stack stack;
            q0.a(e.f37904l, "批量上报失败： " + str);
            e.this.a(2, str);
            synchronized (e.this.f37916j) {
                e.this.f37916j.add(Long.valueOf(this.f37919b));
                if (e.this.f37908b != null) {
                    e.this.f37908b.updateMessagesReportState(this.f37920c);
                }
                if (e.this.f37916j.size() >= 5) {
                    q0.a(e.f37904l, "批量上报失败，上报失败的数据超过阈值");
                    try {
                        try {
                            e.this.f37916j.pop();
                            long jLongValue = ((Long) e.this.f37916j.pop()).longValue();
                            e.this.f37916j.clear();
                            if (e.this.f37908b != null) {
                                e.this.f37908b.deleteBatchReportMessagesByTimestamp(jLongValue);
                            }
                            stack = e.this.f37916j;
                        } catch (Exception e10) {
                            q0.b(e.f37904l, e10.getMessage());
                            stack = e.this.f37916j;
                        }
                        stack.clear();
                    } catch (Throwable th2) {
                        e.this.f37916j.clear();
                        throw th2;
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.b
        public void b(String str) {
            q0.a(e.f37904l, "批量上报成功");
            e.this.a(1, "");
            try {
                if (e.this.f37908b != null) {
                    e.this.f37908b.deleteBatchReportMessagesByTimestamp(this.f37919b);
                }
            } catch (Exception e10) {
                q0.b(e.f37904l, e10.getMessage());
            }
            synchronized (e.this.f37916j) {
                e.this.f37916j.clear();
            }
        }
    }

    /* JADX INFO: compiled from: MBRevenueBatchReportManager.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37922a;

        public c(String str) {
            this.f37922a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f37908b == null) {
                return;
            }
            q0.a(e.f37904l, "接收到上报数据： " + this.f37922a);
            if (!e.this.f37913g) {
                if (e.this.f37912f != 1) {
                    e.this.c(this.f37922a);
                }
            } else {
                e.this.a(this.f37922a, 0L);
                if (((Integer) y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "roas_use_event", 0)).intValue() == 0) {
                    y0.b(com.mbridge.msdk.foundation.controller.c.n().d(), "roas_use_event", 1);
                    e.this.f37915i.sendEmptyMessage(4);
                }
            }
        }
    }

    private e() {
        d();
    }

    private p a(int i10) {
        return i10 == 1 ? new p(new m((byte) 2), com.mbridge.msdk.foundation.same.net.utils.d.h().f37842l, com.mbridge.msdk.foundation.same.net.utils.d.h().f37846p) : new p(new com.mbridge.msdk.tracker.network.toolbox.h(), com.mbridge.msdk.foundation.same.net.utils.d.h().O, 0);
    }

    private JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            for (String str2 : str.split(C3978d4.j.f31381c)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    jSONObject.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("state", Integer.valueOf(i10));
        if (i10 == 2) {
            eVar.a("reason", str);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a("m_ad_rev_s_s", eVar);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_ad_rev_s_s", cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j10) {
        if (this.f37917k != null) {
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("roas");
            eVar.a(true);
            if (j10 != 0) {
                eVar.c(j10);
            }
            eVar.a(1);
            try {
                eVar.a(a(str));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f37917k.d(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<BatchReportMessage> arrayList, long j10) {
        if (arrayList == null || arrayList.size() <= 0) {
            q0.a(f37904l, "需要上报的数据条数： 0");
            return;
        }
        q0.a(f37904l, "需要上报的数据条数： " + arrayList.size());
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = j.a(contextD);
        eVarA.a("app_id", com.mbridge.msdk.foundation.controller.c.n().b());
        eVarA.a("m_sdk", "msdk");
        eVarA.a("lqswt", String.valueOf(1));
        eVarA.a(CommonUrlParts.DEVICE_TYPE, m0.E(contextD) ? "pad" : "phone");
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVarA.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f37866j, m0.u());
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                BatchReportMessage batchReportMessage = arrayList.get(i10);
                if (batchReportMessage != null) {
                    sb2.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                    if (i10 >= 0 && i10 < size - 1) {
                        sb2.append("\n");
                    }
                }
            } catch (Throwable th2) {
                q0.b(f37904l, th2.getMessage());
            }
        }
        try {
            String strEncode = URLEncoder.encode(sb2.toString(), G5.N);
            eVarA.a("data", strEncode);
            q0.a(f37904l, "需要批量上报的数据： " + strEncode);
            com.mbridge.msdk.foundation.same.report.net.a aVar = new com.mbridge.msdk.foundation.same.report.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
            a(0, "");
            aVar.post(0, this.f37911e, eVarA, new b(j10, arrayList), "roas", 60000L);
        } catch (Exception e10) {
            q0.b(f37904l, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ArrayList<BatchReportMessage> arrayList, long j10) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j10);
        messageObtain.setData(bundle);
        messageObtain.what = 3;
        this.f37915i.sendMessage(messageObtain);
    }

    public static synchronized e c() {
        if (f37906n == null) {
            f37906n = new e();
        }
        return f37906n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.f37908b.addReportMessage(str, 2);
        Handler handler = this.f37915i;
        if (handler != null && !handler.hasMessages(1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            this.f37915i.sendMessageDelayed(messageObtain, this.f37910d);
        }
        if (this.f37907a.incrementAndGet() < this.f37909c || this.f37915i == null) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        messageObtain2.setData(bundle);
        messageObtain2.what = 2;
        this.f37915i.sendMessage(messageObtain2);
        this.f37907a.set(0);
    }

    private void d() {
        com.mbridge.msdk.setting.a aVarJ;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null && (aVarJ = gVarD.j()) != null) {
            this.f37909c = aVarJ.a();
            this.f37910d = ((long) aVarJ.c()) * 1000;
            this.f37911e = com.mbridge.msdk.foundation.same.net.utils.d.h().O;
            this.f37912f = aVarJ.b();
            boolean z10 = aVarJ.d() == 1;
            this.f37913g = z10;
            if (z10 && this.f37912f != 1) {
                int iB = s0.a().b("bcp", "type", s0.a().b("t_r_t", 1));
                if (iB != 0 && iB != 1) {
                    iB = 0;
                }
                this.f37917k = com.mbridge.msdk.tracker.m.b(f37905m, com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a());
                JSONObject jSONObjectB = com.mbridge.msdk.foundation.same.report.c.b();
                try {
                    jSONObjectB.put(CommonUrlParts.DEVICE_TYPE, m0.E(com.mbridge.msdk.foundation.controller.c.n().d()) ? "pad" : "phone");
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                        jSONObjectB.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f37866j, m0.u());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f37917k.a(jSONObjectB);
                this.f37917k.h();
            }
        }
        q0.a(f37904l, "初始化批量上报： " + this.f37911e + Z7.f30794r + this.f37909c + Z7.f30794r + this.f37910d + Z7.f30794r + this.f37912f);
        this.f37907a = new AtomicInteger(0);
        this.f37916j = new Stack<>();
        this.f37908b = BatchReportDao.getInstance(com.mbridge.msdk.foundation.controller.c.n().d());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.f37915i = new a(handlerThread.getLooper());
    }

    public void b() {
        Handler handler = this.f37915i;
        if (handler == null || handler.hasMessages(1) || this.f37912f == 1 || this.f37913g) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.f37915i.sendMessageDelayed(messageObtain, 5000L);
    }

    public synchronized void b(String str) {
        Executor executor;
        if (this.f37912f == 1) {
            return;
        }
        c cVar = new c(str);
        if (!com.mbridge.msdk.foundation.controller.d.a().e() || (executor = this.f37914h) == null) {
            cVar.run();
        } else {
            executor.execute(cVar);
        }
    }
}
