package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class fp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f89656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f89657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rc3 f89658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg3 f89659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f89660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f89661f;

    public fp3(Context context, d4 d4Var, lu2 lu2Var, rc3 rc3Var, fg3 fg3Var) {
        this.f89656a = d4Var;
        this.f89657b = lu2Var;
        this.f89658c = rc3Var;
        this.f89659d = fg3Var;
        this.f89660e = context.getApplicationContext();
    }

    public final void a(Context context, List list, to2 to2Var, Object obj) {
        int i10 = this.f89661f + 1;
        this.f89661f = i10;
        if (i10 > 5) {
            to2Var.a(new be3("Maximum count of VAST wrapper requests exceeded."));
            return;
        }
        new hp3(new cp3(this.f89660e, this.f89656a, this.f89657b, this.f89658c, this.f89659d)).a(context, list, to2Var, obj);
    }
}
