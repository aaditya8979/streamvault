package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class uz1 implements um0, y51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wz1 f95882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f95883b;

    public /* synthetic */ uz1(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var) {
        wz1 wz1Var = new wz1();
        this(wz1Var, new f1(context, d4Var, lu2Var, v9Var, wz1Var));
    }

    public uz1(wz1 wz1Var, f1 f1Var) {
        this.f95882a = wz1Var;
        this.f95883b = f1Var;
    }

    @Override // yads.um0
    public final void a() {
        this.f95882a.a();
    }

    @Override // yads.y51
    public final void a(j5 j5Var) {
        this.f95882a.a(j5Var);
    }
}
