package yads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class o02 implements q02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f93062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f93063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e00 f93064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f93065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rh1 f93066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c10 f93067f;

    public /* synthetic */ o02(Context context, iu3 iu3Var, e00 e00Var) {
        this(context, iu3Var, e00Var, new CopyOnWriteArrayList(), new rh1(context), null, null, null);
    }

    public o02(Context context, iu3 iu3Var, e00 e00Var, List list, rh1 rh1Var, c10 c10Var, vt3 vt3Var, nu3 nu3Var) {
        this.f93062a = context;
        this.f93063b = iu3Var;
        this.f93064c = e00Var;
        this.f93065d = list;
        this.f93066e = rh1Var;
        this.f93067f = c10Var;
        rh1Var.a();
    }
}
