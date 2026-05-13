package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class n82 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o82 f92777a;

    public n82(o82 o82Var) {
        this.f92777a = o82Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB = o82.b(context);
        if (ib3.f90737a < 31 || iB != 5) {
            this.f92777a.a(iB);
        } else {
            l82.a(context, this.f92777a);
        }
    }
}
