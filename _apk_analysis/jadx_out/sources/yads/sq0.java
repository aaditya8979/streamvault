package yads;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class sq0 implements tq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg2 f94914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tg2 f94915c;

    public sq0(Context context, sg2 sg2Var, tg2 tg2Var) {
        this.f94913a = context;
        this.f94914b = sg2Var;
        this.f94915c = tg2Var;
    }

    @Override // yads.tq0
    public final Parcelable getValue() {
        tg2 tg2Var = this.f94915c;
        Context context = this.f94913a;
        sg2 sg2Var = this.f94914b;
        tg2Var.getClass();
        return tg2.a(context, sg2Var);
    }
}
