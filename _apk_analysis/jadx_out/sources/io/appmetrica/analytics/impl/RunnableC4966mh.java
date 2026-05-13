package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC4966mh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q5 f67302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f67303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4670b4 f67304d;

    public RunnableC4966mh(Context context, Q5 q52, Bundle bundle, C4670b4 c4670b4) {
        this.f67301a = context;
        this.f67302b = q52;
        this.f67303c = bundle;
        this.f67304d = c4670b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            I3 i3A = I3.a(this.f67301a, this.f67303c);
            if (i3A == null) {
                return;
            }
            Q3 q3A = Q3.a(i3A);
            C4788fj c4788fjV = C5009oa.I.v();
            c4788fjV.a(i3A.f65350b.getAppVersion(), i3A.f65350b.getAppBuildNumber());
            c4788fjV.a(i3A.f65350b.getDeviceType());
            C5053q4 c5053q4 = new C5053q4(new C4662am(i3A), new C5028p4(i3A.f65350b, AbstractC4832hb.c(i3A.f65349a.f65118a.getAsString("PROCESS_CFG_CLIDS"))), i3A.f65349a.f65119b);
            this.f67304d.a(q3A, c5053q4).a(this.f67302b, c5053q4);
        } catch (Throwable th2) {
            Rj rj2 = AbstractC5043pj.f67535a;
            String str = "Exception during processing event with type: " + this.f67302b.f65791d + " (" + this.f67302b.f65792e + "): " + th2.getMessage();
            rj2.getClass();
            rj2.a(new C5068qj(str, th2));
        }
    }
}
