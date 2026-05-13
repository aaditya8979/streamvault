package yads;

import io.bidmachine.unified.UnifiedMediationParams;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f89586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89587b;

    public fi(io2 io2Var, boolean z10) {
        this.f89586a = io2Var;
        this.f89587b = z10;
    }

    public final void a(ArrayList arrayList) {
        Iterator it;
        Map mapR;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nb2 nb2Var = (nb2) it2.next();
            if (this.f89587b) {
                bn.g gVar = of.f93206a;
                lf lfVar = nb2Var.f92800a;
                it = it2;
                Pair pairA = bn.h.a(new Thread("ApplicationExitInfoDetails"), new StackTraceElement[]{new StackTraceElement("ExitInfo", "timestamp", ((SimpleDateFormat) of.f93206a.getValue()).format(new Date(lfVar.f91946a)), 0), new StackTraceElement("ExitInfo", UnifiedMediationParams.KEY_DESCRIPTION, lfVar.f91947b, 0), new StackTraceElement("Memory", "pss", of.a(lfVar.f91951f), 0), new StackTraceElement("Memory", "rss", of.a(lfVar.f91952g), 0), new StackTraceElement("Process", "name", lfVar.f91953h, 0), new StackTraceElement("Process", "pid", String.valueOf(lfVar.f91950e), 0), new StackTraceElement("Process", "importance", String.valueOf(lfVar.f91949d), 0), new StackTraceElement("Process", "uid", String.valueOf(lfVar.f91955j), 0), new StackTraceElement("Process", "status", String.valueOf(lfVar.f91954i), 0)});
                mapR = kotlin.collections.a.r(nb2Var.f92801b, bn.h.a((Thread) pairA.component1(), (StackTraceElement[]) pairA.component2()));
            } else {
                it = it2;
                mapR = nb2Var.f92801b;
            }
            this.f89586a.reportAnr(mapR);
            it2 = it;
        }
    }
}
