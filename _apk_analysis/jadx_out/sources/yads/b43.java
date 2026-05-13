package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import yads.b43;

/* JADX INFO: loaded from: classes8.dex */
public final class b43 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c43 f87903a;

    public b43(c43 c43Var) {
        this.f87903a = c43Var;
    }

    public static void a(c43 c43Var) {
        int iB = c43.b(c43Var.f88342d, c43Var.f88345g);
        boolean zA = c43.a(c43Var.f88342d, c43Var.f88345g);
        if (c43Var.f88346h == iB && c43Var.f88347i == zA) {
            return;
        }
        c43Var.f88346h = iB;
        c43Var.f88347i = zA;
        ((wn0) c43Var.f88341c).a(zA, iB);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final c43 c43Var = this.f87903a;
        c43Var.f88340b.post(new Runnable() { // from class: bt.i
            @Override // java.lang.Runnable
            public final void run() {
                b43.a(c43Var);
            }
        });
    }
}
