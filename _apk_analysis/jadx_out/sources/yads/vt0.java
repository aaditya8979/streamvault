package yads;

import androidx.recyclerview.widget.DiffUtil;

/* JADX INFO: loaded from: classes8.dex */
public final class vt0 extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return tn.p.f((ut0) obj, (ut0) obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        ut0 ut0Var = (ut0) obj;
        ut0 ut0Var2 = (ut0) obj2;
        if ((ut0Var instanceof ns0) && (ut0Var2 instanceof ns0)) {
            return tn.p.f(((ns0) ut0Var).f92923b, ((ns0) ut0Var2).f92923b);
        }
        tt0 tt0Var = tt0.f95349a;
        return tn.p.f(ut0Var, tt0Var) && tn.p.f(ut0Var2, tt0Var);
    }
}
