package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class kx3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx3 f91801a = lx3.f92168d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lx3 lx3Var;
        boolean z10 = false;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            lx3 lx3Var2 = this.f91801a;
            lx3Var2.a(true, lx3Var2.f92171c);
            lx3Var = this.f91801a;
            z10 = true;
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            lx3 lx3Var3 = this.f91801a;
            lx3Var3.a(false, lx3Var3.f92171c);
            lx3Var = this.f91801a;
        }
        lx3Var.f92170b = z10;
    }
}
