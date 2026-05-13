package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class in2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5 f90919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nn2 f90920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kn2 f90921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hn2 f90922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fn2 f90923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f90924f;

    public /* synthetic */ in2(Context context, e9 e9Var, v9 v9Var, d4 d4Var, lu2 lu2Var, va vaVar, f5 f5Var, nn2 nn2Var, kn2 kn2Var, List list) {
        this(e9Var, f5Var, nn2Var, kn2Var, new hn2(context, v9Var, d4Var, lu2Var, vaVar, list));
    }

    public in2(e9 e9Var, f5 f5Var, nn2 nn2Var, kn2 kn2Var, hn2 hn2Var) {
        this.f90919a = f5Var;
        this.f90920b = nn2Var;
        this.f90921c = kn2Var;
        this.f90922d = hn2Var;
        this.f90923e = new fn2(e9Var, this);
    }
}
