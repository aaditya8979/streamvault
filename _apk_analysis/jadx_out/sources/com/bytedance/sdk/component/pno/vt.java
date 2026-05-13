package com.bytedance.sdk.component.pno;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ko;

/* JADX INFO: loaded from: classes2.dex */
final class vt implements Comparable, Runnable {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private long f12767lh;
    private pno ouw;
    private ouw vt;
    private Thread yu = null;

    public vt(pno pnoVar, ouw ouwVar) {
        this.f12767lh = 0L;
        this.ouw = pnoVar;
        this.vt = ouwVar;
        this.f12767lh = SystemClock.uptimeMillis();
    }

    private static void ouw(String str, String str2, long j10) {
        ko.fkw("DelegateRunnable", "pool is " + str + "  name is " + str2 + "is timeout,cost " + j10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof vt) {
            return this.ouw.compareTo(((vt) obj).ouw);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        pno pnoVar;
        return (obj instanceof vt) && (pnoVar = this.ouw) != null && pnoVar.equals(((vt) obj).ouw);
    }

    public final int hashCode() {
        return this.ouw.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = jUptimeMillis - this.f12767lh;
        this.yu = Thread.currentThread();
        pno pnoVar = this.ouw;
        if (pnoVar != null) {
            pnoVar.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.vt != null) {
            yu.ouw();
        }
        if (ko.ouw()) {
            Object[] objArr = new Object[8];
            objArr[0] = "run: pool  = ";
            ouw ouwVar = this.vt;
            objArr[1] = ouwVar != null ? ouwVar.ouw : "null";
            objArr[2] = " waitTime =";
            objArr[3] = Long.valueOf(j10);
            objArr[4] = " taskCost = ";
            objArr[5] = Long.valueOf(jUptimeMillis2);
            objArr[6] = " name=";
            pno pnoVar2 = this.ouw;
            objArr[7] = pnoVar2 != null ? pnoVar2.getName() : "null";
            ko.vt("DelegateRunnable", objArr);
            String str = this.vt.ouw;
            str.hashCode();
            switch (str) {
                case "ad":
                case "init":
                    if (jUptimeMillis2 > 2000) {
                        ouw ouwVar2 = this.vt;
                        String str2 = ouwVar2 != null ? ouwVar2.ouw : "null";
                        pno pnoVar3 = this.ouw;
                        ouw(str2, pnoVar3 != null ? pnoVar3.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case "io":
                    if (jUptimeMillis2 > 5000) {
                        ouw ouwVar3 = this.vt;
                        String str3 = ouwVar3 != null ? ouwVar3.ouw : "null";
                        pno pnoVar4 = this.ouw;
                        ouw(str3, pnoVar4 != null ? pnoVar4.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case "log":
                    if (jUptimeMillis2 > 3000) {
                        ouw ouwVar4 = this.vt;
                        String str4 = ouwVar4 != null ? ouwVar4.ouw : "null";
                        pno pnoVar5 = this.ouw;
                        ouw(str4, pnoVar5 != null ? pnoVar5.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case "computation":
                    if (jUptimeMillis2 > 1000) {
                        ouw ouwVar5 = this.vt;
                        String str5 = ouwVar5 != null ? ouwVar5.ouw : "null";
                        pno pnoVar6 = this.ouw;
                        ouw(str5, pnoVar6 != null ? pnoVar6.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
            }
        }
    }
}
