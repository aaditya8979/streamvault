package com.bytedance.sdk.component.le.ouw.vt.lh;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.le.ouw.fkw;
import com.bytedance.sdk.component.le.ouw.ouw.yu;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lh extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private static int f12680th = 200;
    private static int zih = 10;
    private volatile long bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final long f12681cf;
    private final Object fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final List<com.bytedance.sdk.component.le.ouw.yu.ouw> f12682jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final AtomicInteger f12683ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.vt.lh f12684le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final PriorityBlockingQueue<com.bytedance.sdk.component.le.ouw.yu.ouw> f12685lh;
    private final AtomicInteger mwh;
    public volatile boolean ouw;
    private volatile long pno;
    private final int qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private volatile int f12686ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final AtomicInteger f12687rn;
    private final long ryl;
    private final AtomicInteger tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private long f12688vm;
    private final int vpp;
    public yu vt;
    public volatile Handler yu;
    private final int zin;

    public lh(PriorityBlockingQueue<com.bytedance.sdk.component.le.ouw.yu.ouw> priorityBlockingQueue) {
        super("csj_log");
        this.ouw = true;
        this.fkw = new Object();
        this.pno = 0L;
        this.bly = 0L;
        this.tlj = new AtomicInteger(0);
        this.f12681cf = 5000L;
        this.ryl = 5000000000L;
        this.mwh = new AtomicInteger(0);
        this.f12682jg = new ArrayList();
        this.f12683ko = new AtomicInteger(0);
        this.f12687rn = new AtomicInteger(0);
        this.f12688vm = 60000L;
        this.qbp = 1;
        this.zin = 2;
        this.vpp = 3;
        this.f12685lh = priorityBlockingQueue;
        this.vt = new com.bytedance.sdk.component.le.ouw.ouw.vt();
        if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
            return;
        }
        long jPno = pno.vt().bly.pno();
        if (jPno > 0) {
            this.f12688vm = jPno;
        }
    }

    private void fkw() {
        long jNanoTime;
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar;
        if (this.yu.hasMessages(11)) {
            yu();
        } else {
            yu(1);
        }
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        fkw fkwVar = pno.vt().bly;
        if (this.f12686ra == 2) {
            fkw fkwVar2 = pno.vt().bly;
            synchronized (this.fkw) {
                try {
                    try {
                        long jNanoTime2 = System.nanoTime();
                        this.fkw.wait(5000L);
                        jNanoTime = System.nanoTime() - jNanoTime2;
                        yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                        if (!yuVar.f12717lh) {
                            boolean z10 = yuVar.yu;
                        }
                        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    } catch (InterruptedException e10) {
                        e10.getMessage();
                        com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                        e10.printStackTrace();
                    }
                    if (jNanoTime < 5000000000L && 5000000000L - jNanoTime >= 50000000) {
                        if (!yuVar.f12717lh && !yuVar.yu) {
                            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
                            fkw fkwVar3 = pno.vt().bly;
                            lh(2);
                            return;
                        }
                        fkw fkwVar4 = pno.vt().bly;
                        com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                        return;
                    }
                    com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                    fkw fkwVar5 = pno.vt().bly;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void lh() {
        com.bytedance.sdk.component.le.ouw.lh.ouw.lh();
        int i10 = 0;
        if (vt()) {
            com.bytedance.sdk.component.le.ouw.lh.ouw.ouw(this.f12686ra);
            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar = pno.vt().bly;
            if (this.f12685lh.size() != 0) {
                return;
            }
            if (this.yu.hasMessages(2)) {
                this.ouw = false;
                return;
            }
            com.bytedance.sdk.component.le.ouw.vt.yu.ouw.f12717lh = false;
            this.bly = 0L;
            this.pno = 0L;
            this.f12683ko.set(0);
            this.f12687rn.set(0);
        }
        do {
            boolean zOuw = ouw(this.f12686ra, com.bytedance.sdk.component.le.ouw.vt.yu.ouw.f12717lh);
            com.bytedance.sdk.component.le.ouw.lh.ouw.pno();
            fkw fkwVar2 = pno.vt().bly;
            if (zOuw) {
                List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw = this.vt.ouw(this.f12686ra, -1, null);
                if (listOuw != null) {
                    listOuw.size();
                    com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                    ouw(listOuw);
                } else {
                    com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                    yu();
                }
            } else {
                yu();
            }
            i10++;
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            if (!zOuw) {
                return;
            }
        } while (i10 <= 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw() {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.le.ouw.vt.lh.lh.ouw():void");
    }

    public static void ouw(int i10) {
        zih = i10;
        "config size=".concat(String.valueOf(i10));
        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
    }

    private void ouw(int i10, long j10) {
        if (this.yu == null) {
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        if (i10 == 2) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            this.yu.sendMessageDelayed(messageObtain, ((long) (((this.f12683ko.incrementAndGet() - 1) % 4) + 1)) * j10);
        } else {
            if (i10 != 3) {
                com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                return;
            }
            int iIncrementAndGet = this.f12687rn.incrementAndGet();
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            this.yu.sendMessageDelayed(messageObtain, ((long) (((iIncrementAndGet - 1) % 4) + 1)) * j10);
        }
    }

    public static /* synthetic */ void ouw(lh lhVar, List list, boolean z10) {
        vt vtVarVt;
        List<Object> listOuw;
        try {
            com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = (com.bytedance.sdk.component.le.ouw.yu.ouw) list.get(0);
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar = pno.vt().bly;
            if (ouwVar.yu() == 0) {
                vtVarVt = pno.ouw().ouw();
                if (vtVarVt != null && vtVarVt.ouw && (listOuw = com.bytedance.sdk.component.le.ouw.vt.ouw()) != null && listOuw.size() != 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2 = (com.bytedance.sdk.component.le.ouw.yu.ouw) it.next();
                        if (ouwVar2.fkw() == 1) {
                            com.bytedance.sdk.component.le.ouw.lh.ouw.ouw(ouwVar2);
                            com.bytedance.sdk.component.le.ouw.lh.ouw.vt(ouwVar2);
                            Iterator<Object> it2 = listOuw.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                            }
                        }
                    }
                }
                if (vtVarVt != null) {
                    com.bytedance.sdk.component.le.ouw.lh.ouw.cf();
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        jSONArray.put(((com.bytedance.sdk.component.le.ouw.yu.ouw) it3.next()).ra());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e10) {
                    e10.getMessage();
                    com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                }
                vtVarVt = pno.ouw().vt();
            }
            lhVar.mwh.decrementAndGet();
            lhVar.ouw(z10, vtVarVt, (List<com.bytedance.sdk.component.le.ouw.yu.ouw>) list);
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar2 = pno.vt().bly;
            lhVar.mwh.decrementAndGet();
        }
    }

    private void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        this.tlj.set(0);
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        if (yuVar.f12717lh) {
            this.f12686ra = 5;
        } else if (yuVar.yu) {
            this.f12686ra = 7;
        } else {
            this.f12686ra = 4;
        }
        fkw fkwVar = pno.vt().bly;
        this.vt.ouw(ouwVar, this.f12686ra);
        com.bytedance.sdk.component.le.ouw.lh.ouw.vt();
    }

    private void ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        if (list.size() == 0) {
            yu();
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            return;
        }
        this.f12685lh.size();
        com.bytedance.sdk.component.le.ouw.lh.ouw.ouw();
        if (list.size() > 1) {
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            ouw(list, "batchRead");
            return;
        }
        com.bytedance.sdk.component.le.ouw.lh.ouw.yu();
        com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = list.get(0);
        if (ouwVar == null) {
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            return;
        }
        if (ouwVar.fkw() == 1) {
            ouw(list, "highPriority");
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            return;
        }
        if (ouwVar.yu() == 0 && ouwVar.fkw() == 2) {
            if (ouwVar.vt() == 3) {
                ouw(list, "version_v3");
                return;
            } else {
                vt(list);
                return;
            }
        }
        if (ouwVar.yu() == 1) {
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            ouw(list, "stats");
        } else if (ouwVar.yu() == 3) {
            ouw(list, "adType_v3");
        } else if (ouwVar.yu() != 2) {
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        } else {
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            ouw(list, "other");
        }
    }

    private void ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, String str) {
        if (this.yu.hasMessages(11)) {
            this.yu.removeMessages(11);
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        }
        if (this.f12682jg.size() != 0) {
            ArrayList arrayList = new ArrayList(this.f12682jg);
            this.f12682jg.clear();
            "before_".concat(String.valueOf(str));
            ouw((List<com.bytedance.sdk.component.le.ouw.yu.ouw>) arrayList, false);
            fkw();
            arrayList.size();
            try {
                fkw fkwVar = pno.vt().bly;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            " delayList is empty ：".concat(String.valueOf(str));
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        }
        ouw(list, false);
        fkw();
    }

    private void ouw(final List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, final boolean z10, final long j10) {
        fkw fkwVar = pno.vt().bly;
        if (fkwVar != null) {
            Executor executorVt = fkwVar.vt();
            if (list.get(0).fkw() == 1) {
                executorVt = fkwVar.ouw();
            }
            if (executorVt == null) {
                return;
            }
            this.mwh.incrementAndGet();
            executorVt.execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw("csj_log_upload") { // from class: com.bytedance.sdk.component.le.ouw.vt.lh.lh.1
                @Override // java.lang.Runnable
                public final void run() {
                    lh lhVar = lh.this;
                    List list2 = list;
                    boolean z11 = z10;
                    int unused = lhVar.f12686ra;
                    lh.ouw(lhVar, list2, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[Catch: all -> 0x0146, TryCatch #1 {, blocks: (B:27:0x003d, B:30:0x0043, B:77:0x0126, B:79:0x012a, B:80:0x0132, B:38:0x0063, B:40:0x0074, B:41:0x0077, B:43:0x0079, B:45:0x0086, B:46:0x0089, B:48:0x008b, B:50:0x009c, B:51:0x00a1, B:52:0x00a6, B:54:0x00ac, B:56:0x00b0, B:58:0x00bc, B:59:0x00c1, B:61:0x00c9, B:62:0x00ce, B:63:0x00eb, B:65:0x00f9, B:66:0x00fc, B:68:0x00fe, B:70:0x010b, B:71:0x010e, B:73:0x0110, B:75:0x011e, B:76:0x0123, B:86:0x0144), top: B:94:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb A[Catch: all -> 0x0146, TryCatch #1 {, blocks: (B:27:0x003d, B:30:0x0043, B:77:0x0126, B:79:0x012a, B:80:0x0132, B:38:0x0063, B:40:0x0074, B:41:0x0077, B:43:0x0079, B:45:0x0086, B:46:0x0089, B:48:0x008b, B:50:0x009c, B:51:0x00a1, B:52:0x00a6, B:54:0x00ac, B:56:0x00b0, B:58:0x00bc, B:59:0x00c1, B:61:0x00c9, B:62:0x00ce, B:63:0x00eb, B:65:0x00f9, B:66:0x00fc, B:68:0x00fe, B:70:0x010b, B:71:0x010e, B:73:0x0110, B:75:0x011e, B:76:0x0123, B:86:0x0144), top: B:94:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ouw(boolean r9, com.bytedance.sdk.component.le.ouw.vt.lh.vt r10, java.util.List<com.bytedance.sdk.component.le.ouw.yu.ouw> r11) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.le.ouw.vt.lh.lh.ouw(boolean, com.bytedance.sdk.component.le.ouw.vt.lh.vt, java.util.List):void");
    }

    private boolean ouw(int i10, boolean z10) {
        fkw fkwVar = pno.vt().bly;
        if (fkwVar != null && fkwVar.ouw(pno.vt().ouw)) {
            return this.vt.ouw(i10, z10);
        }
        com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        return false;
    }

    public static void vt(int i10) {
        f12680th = i10;
        "applog_interval=".concat(String.valueOf(i10));
        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
    }

    private void vt(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        this.f12682jg.addAll(list);
        this.f12682jg.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
        fkw fkwVar = pno.vt().bly;
        if (fkwVar != null && fkwVar.le() != null) {
            zih = fkwVar.le().vt();
        }
        if (this.f12682jg.size() >= zih) {
            if (this.yu.hasMessages(11)) {
                this.yu.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.f12682jg);
            this.f12682jg.clear();
            ouw((List<com.bytedance.sdk.component.le.ouw.yu.ouw>) arrayList, false);
            fkw();
            com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
            return;
        }
        if (this.f12685lh.size() != 0) {
            this.f12682jg.size();
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            return;
        }
        this.ouw = false;
        if (this.yu.hasMessages(11)) {
            this.yu.removeMessages(11);
        }
        if (this.yu.hasMessages(1)) {
            this.yu.removeMessages(1);
        }
        long jOuw = f12680th;
        if (fkwVar != null && fkwVar.le() != null) {
            jOuw = fkwVar.le().ouw();
        }
        this.yu.sendEmptyMessageDelayed(11, jOuw);
        "batch applog report delay ( time )".concat(String.valueOf(jOuw));
        com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
    }

    private void vt(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, final boolean z10, final long j10) {
        this.mwh.incrementAndGet();
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        fkw fkwVar = pno.vt().bly;
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.le.ouw.yu.ouw next = it.next();
                int iPno = next == null ? 0 : next.pno();
                if (map.get(Integer.valueOf(iPno)) == null) {
                    map.put(Integer.valueOf(iPno), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iPno))).add(next);
            }
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                if (iIntValue == 0 || pno.vt().f12675cf == null || pno.vt().f12675cf.get(Integer.valueOf(iIntValue)) == null) {
                    this.f12684le.ouw(list, new com.bytedance.sdk.component.le.ouw.vt.vt() { // from class: com.bytedance.sdk.component.le.ouw.vt.lh.lh.2
                        @Override // com.bytedance.sdk.component.le.ouw.vt.vt
                        public final void ouw(List<ouw> list2) {
                            try {
                                lh.this.mwh.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ouw ouwVar = list2.get(i10);
                                    if (ouwVar != null) {
                                        lh.this.ouw(z10, ouwVar.ouw, ouwVar.vt);
                                    }
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                    });
                } else {
                    pno.vt().f12675cf.get(Integer.valueOf(iIntValue)).ouw(list, new com.bytedance.sdk.component.le.ouw.vt.vt() { // from class: com.bytedance.sdk.component.le.ouw.vt.lh.lh.3
                        @Override // com.bytedance.sdk.component.le.ouw.vt.vt
                        public final void ouw(List<ouw> list2) {
                            try {
                                lh.this.mwh.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ouw ouwVar = list2.get(i10);
                                    if (ouwVar != null) {
                                        lh.this.ouw(z10, ouwVar.ouw, ouwVar.vt);
                                    }
                                }
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                    });
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar2 = pno.vt().bly;
            this.mwh.decrementAndGet();
        }
    }

    private boolean vt() {
        if (com.bytedance.sdk.component.le.ouw.vt.yu.ouw.f12717lh) {
            return this.f12686ra == 4 || this.f12686ra == 7 || this.f12686ra == 6 || this.f12686ra == 5 || this.f12686ra == 2;
        }
        return false;
    }

    private void yu() {
        try {
            if (this.f12685lh.size() != 0 || !this.yu.hasMessages(11) || !this.ouw) {
                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            } else {
                this.ouw = false;
                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            }
        } catch (Exception e10) {
            e10.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                fkw fkwVar = pno.vt().bly;
                long jFkw = pno.vt().fkw();
                if (jFkw > 0) {
                    this.vt.ouw(Integer.MAX_VALUE, jFkw);
                }
                this.ouw = true;
                ouw();
            } else if (i10 == 2 || i10 == 3) {
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                if (!isAlive()) {
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    com.bytedance.sdk.component.le.ouw.vt.yu.ouw.vt();
                } else if (!this.ouw) {
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    lh(6);
                }
                com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                fkw fkwVar2 = pno.vt().bly;
                lh(1);
            } else if (i10 == 11) {
                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                ArrayList arrayList = new ArrayList(this.f12682jg);
                this.f12682jg.clear();
                ouw((List<com.bytedance.sdk.component.le.ouw.yu.ouw>) arrayList, false);
                fkw();
            }
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        }
        return true;
    }

    public final void lh(int i10) {
        try {
            boolean zOuw = ouw(i10, com.bytedance.sdk.component.le.ouw.vt.yu.ouw.f12717lh);
            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
            if (i10 == 6 || zOuw) {
                com.bytedance.sdk.component.le.ouw.yu.vt vtVar = new com.bytedance.sdk.component.le.ouw.yu.vt();
                vtVar.ouw = i10;
                this.f12685lh.add(vtVar);
                yu(3);
            }
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.le.ouw.lh.vt.lh();
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.yu = new Handler(getLooper(), this);
        com.bytedance.sdk.component.le.ouw.vt.yu.ouw.tlj = this.yu;
        this.yu.sendEmptyMessage(1);
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
    }

    public final void ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.le.ouw.lh.ouw.ra();
        com.bytedance.sdk.component.le.ouw.vt.lh lhVar = pno.vt().tlj;
        this.f12684le = lhVar;
        if (lhVar != null) {
            vt(list, z10, jCurrentTimeMillis);
        } else {
            ouw(list, z10, jCurrentTimeMillis);
        }
    }

    public final void yu(int i10) {
        if (this.ouw) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            fkw fkwVar = pno.vt().bly;
            return;
        }
        if (this.yu == null) {
            return;
        }
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        fkw fkwVar2 = pno.vt().bly;
        if (this.yu.hasMessages(1)) {
            return;
        }
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            fkw fkwVar3 = pno.vt().bly;
        }
        this.yu.sendEmptyMessage(1);
    }
}
