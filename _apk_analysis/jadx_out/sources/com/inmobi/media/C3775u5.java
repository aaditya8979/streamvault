package com.inmobi.media;

import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.core.config.models.CrashConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3775u5 implements InterfaceC3725s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f28225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3857xc f28226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f28227c;

    public C3775u5(Context context, CrashConfig crashConfig, C3857xc c3857xc) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(crashConfig, "crashConfig");
        tn.p.k(c3857xc, "eventBus");
        this.f28225a = crashConfig;
        this.f28226b = c3857xc;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        tn.p.j(listSynchronizedList, "synchronizedList(...)");
        this.f28227c = listSynchronizedList;
        if (this.f28225a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new S4(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f28225a.getANRConfig().getAppExitReason().getEnabled()) {
            C3850x5.f28483a.getClass();
            if (C3850x5.r()) {
                listSynchronizedList.add(new C3871y1(context, this, this.f28225a.getANRConfig().getAppExitReason().getIncidentWaitInterval(), this.f28225a.getANRConfig().getAppExitReason().getMaxNumberOfLines()));
            }
        }
        if (this.f28225a.getANRConfig().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C3318c(this.f28225a.getANRConfig().getWatchdog().getInterval(), this));
        }
    }

    public final void a(Q9 q92) {
        int i10;
        tn.p.k(q92, "incidentEvent");
        if ((q92 instanceof C3896z1) && this.f28225a.getANRConfig().getAppExitReason().getEnabled()) {
            i10 = 152;
        } else if ((q92 instanceof T4) && this.f28225a.getCrashConfig().getEnabled()) {
            i10 = TextFieldImplKt.AnimationDuration;
        } else if (!(q92 instanceof Wn) || !this.f28225a.getANRConfig().getWatchdog().getEnabled()) {
            return;
        } else {
            i10 = 151;
        }
        this.f28226b.b(new I2(i10, q92.f27324a, cn.p0.g(bn.h.a("data", q92))));
    }
}
