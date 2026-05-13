package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f88084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f88085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we1 f88086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue1 f88087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final an f88088e;

    public /* synthetic */ bn(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, new we1(list), new ue1(), new an(onPreDrawListener));
    }

    public bn(Context context, ViewGroup viewGroup, we1 we1Var, ue1 ue1Var, an anVar) {
        this.f88084a = context;
        this.f88085b = viewGroup;
        this.f88086c = we1Var;
        this.f88087d = ue1Var;
        this.f88088e = anVar;
    }
}
