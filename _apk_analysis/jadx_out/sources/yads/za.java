package yads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class za {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f97439d = Executors.newCachedThreadPool(new ey1(ey1.f89405b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f97440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f97441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f97442c;

    public za(Context context, lu2 lu2Var, d4 d4Var) {
        this.f97440a = d4Var;
        this.f97441b = lu2Var;
        this.f97442c = context.getApplicationContext();
    }

    public static void a(za zaVar, String str, k83 k83Var) {
        Map mapJ = kotlin.collections.a.j();
        dd2 dd2Var = new dd2(zaVar.f97442c, zaVar.f97440a, zaVar.f97441b, k83Var);
        if (str.length() > 0) {
            f97439d.execute(new ya(str, dd2Var, mapJ));
        }
    }
}
