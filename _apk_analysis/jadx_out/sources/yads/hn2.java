package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f90469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za f90470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gn2 f90471c;

    public /* synthetic */ hn2(Context context, v9 v9Var, d4 d4Var, lu2 lu2Var, va vaVar, List list) {
        this(list, new za(context, lu2Var, d4Var), new gn2(context, d4Var, lu2Var, v9Var, vaVar));
    }

    public hn2(List list, za zaVar, gn2 gn2Var) {
        this.f90469a = list;
        this.f90470b = zaVar;
        this.f90471c = gn2Var;
    }
}
