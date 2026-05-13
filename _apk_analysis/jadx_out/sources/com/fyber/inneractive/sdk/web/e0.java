package com.fyber.inneractive.sdk.web;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f19618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19619b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f19620c;

    public e0(i0 i0Var) {
        this.f19620c = i0Var;
    }

    public final void a() {
        try {
            i0 i0Var = this.f19620c;
            i0Var.getClass();
            IAlog.a("%sunregister screen broadcast receiver called", IAlog.a(i0Var));
            if (this.f19618a != null) {
                i0 i0Var2 = this.f19620c;
                i0Var2.getClass();
                IAlog.a("%sunregistering broadcast receiver", IAlog.a(i0Var2));
                this.f19618a.unregisterReceiver(this);
                this.f19618a = null;
            }
        } catch (Throwable th2) {
            IAlog.f("IAmraidWebViewControllerBase: OrientationBroadcastReceiver: unregister: exception: %s", th2.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB;
        if (this.f19618a == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (iB = com.fyber.inneractive.sdk.util.o.b()) == this.f19619b) {
            return;
        }
        this.f19619b = iB;
        i0 i0Var = this.f19620c;
        m mVar = i0Var.f19631b;
        if (mVar != null) {
            mVar.getViewTreeObserver().removeOnPreDrawListener(i0Var.f19664n0);
            i0Var.f19631b.getViewTreeObserver().addOnPreDrawListener(i0Var.f19664n0);
        }
    }
}
