package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class nm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f92888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f92889b;

    public /* synthetic */ nm2(Context context) {
        this(context, new lg0());
    }

    public nm2(Context context, lg0 lg0Var) {
        this.f92888a = lg0Var;
        this.f92889b = context.getApplicationContext();
    }

    public final ll1 a() {
        return kg0.f91590d == this.f92888a.a(this.f92889b) ? new ll1(1920, 1080, 6800) : new ll1(854, 480, 1000);
    }
}
