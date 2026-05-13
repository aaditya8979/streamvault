package yads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qk f94852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f94853c;

    public sk(Context context, Handler handler, wn0 wn0Var) {
        this.f94851a = context.getApplicationContext();
        this.f94852b = new qk(this, handler, wn0Var);
    }

    public final void a() {
        if (this.f94853c) {
            this.f94851a.unregisterReceiver(this.f94852b);
            this.f94853c = false;
        }
    }
}
