package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class mo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ep1 f92483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ro1 f92484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final go1 f92485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92486e;

    public mo1(List list, ep1 ep1Var, ro1 ro1Var, go1 go1Var) {
        this.f92482a = list;
        this.f92483b = ep1Var;
        this.f92484c = ro1Var;
        this.f92485d = go1Var;
    }

    public /* synthetic */ mo1(List list, ep1 ep1Var, xo1 xo1Var) {
        this(list, ep1Var, new ro1(xo1Var), new go1());
    }

    public final co1 a(Context context, Class cls) {
        while (this.f92486e < this.f92482a.size()) {
            List list = this.f92482a;
            int i10 = this.f92486e;
            this.f92486e = i10 + 1;
            qq1 qq1Var = (qq1) list.get(i10);
            com.monetization.ads.mediation.base.a aVarA = this.f92484c.a(context, qq1Var, cls);
            if (aVarA != null) {
                this.f92485d.getClass();
                return new co1(aVarA, qq1Var, new fo1(aVarA), this.f92483b);
            }
        }
        return null;
    }
}
