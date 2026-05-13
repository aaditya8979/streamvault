package me.goldze.mvvmhabit.base;

import androidx.databinding.ViewDataBinding;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;
import np.e;

/* JADX INFO: loaded from: classes8.dex */
public class LoadMoreRecyclerAdapter<T extends e> extends BindingRecyclerViewAdapter<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f74156r;

    public interface a {
        void a();
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void f(ViewDataBinding viewDataBinding, int i10, int i11, int i12, T t10) {
        a aVar;
        super.f(viewDataBinding, i10, i11, i12, t10);
        if (!"loadMore".equals(String.valueOf(t10.a())) || (aVar = this.f74156r) == null) {
            return;
        }
        aVar.a();
    }
}
