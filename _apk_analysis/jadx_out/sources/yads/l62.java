package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class l62 implements ye3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p52 f91892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh3 f91893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bf3 f91894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ac3 f91895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ef3 f91896e;

    public /* synthetic */ l62(Context context, v9 v9Var, lu2 lu2Var, p52 p52Var, je3 je3Var, i72 i72Var, ff3 ff3Var, zj3 zj3Var, rf3 rf3Var, vh3 vh3Var) {
        this(context, v9Var, lu2Var, p52Var, je3Var, i72Var, ff3Var, zj3Var, rf3Var, vh3Var, new bf3(context, lu2Var, ff3Var));
    }

    public l62(Context context, v9 v9Var, lu2 lu2Var, p52 p52Var, je3 je3Var, i72 i72Var, ff3 ff3Var, zj3 zj3Var, rf3 rf3Var, vh3 vh3Var, bf3 bf3Var) {
        this.f91892a = p52Var;
        this.f91893b = vh3Var;
        this.f91894c = bf3Var;
        ac3 ac3Var = new ac3(context, lu2Var, new r52(p52Var), i72Var, je3Var, new u62(i72Var), new jg3(), zj3Var, rf3Var, new k62(this), v9Var, true);
        this.f91895d = ac3Var;
        ac3Var.a(ff3Var);
    }

    @Override // yads.ye3
    public final void a(zd2 zd2Var) {
        this.f91896e = zd2Var;
    }

    @Override // yads.ye3
    public final void play() {
        this.f91895d.a();
    }

    @Override // yads.ye3
    public final void stop() {
        ac3 ac3Var = this.f91895d;
        ac3Var.f87654h.a();
        ac3Var.f87647a.pauseAd();
        this.f91892a.a();
    }
}
