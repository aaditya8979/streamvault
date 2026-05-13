package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ow3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f93351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qw3 f93352c;

    public ow3(qw3 qw3Var, float f10) {
        this.f93352c = qw3Var;
        this.f93351b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        jx3 jx3Var = this.f93352c.f94196b.f96216e;
        float f10 = this.f93351b;
        jx3Var.f91413a = f10;
        if (jx3Var.f91417e == null) {
            jx3Var.f91417e = nw3.f93027c;
        }
        Iterator it = Collections.unmodifiableCollection(jx3Var.f91417e.f93029b).iterator();
        while (it.hasNext()) {
            ka kaVar = ((wv3) it.next()).f96536e;
            ix3.f91031a.a((WebView) kaVar.f91524b.get(), "setDeviceVolume", Float.valueOf(f10), kaVar.f91523a);
        }
    }
}
