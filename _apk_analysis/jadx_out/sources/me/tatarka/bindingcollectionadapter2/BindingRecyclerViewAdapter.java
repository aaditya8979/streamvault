package me.tatarka.bindingcollectionadapter2;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableList;
import androidx.databinding.OnRebindCallback;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BindingRecyclerViewAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements aq.b<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f74200q = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public aq.c<T> f74201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e<T> f74202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<T> f74203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayoutInflater f74204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public c<? super T> f74205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public d f74206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public RecyclerView f74207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public LifecycleOwner f74208p;

    public class a extends OnRebindCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f74209a;

        public a(RecyclerView.ViewHolder viewHolder) {
            this.f74209a = viewHolder;
        }

        @Override // androidx.databinding.OnRebindCallback
        public void onCanceled(ViewDataBinding viewDataBinding) {
            int adapterPosition;
            if (BindingRecyclerViewAdapter.this.f74207o == null || BindingRecyclerViewAdapter.this.f74207o.isComputingLayout() || (adapterPosition = this.f74209a.getAdapterPosition()) == -1) {
                return;
            }
            try {
                BindingRecyclerViewAdapter.this.notifyItemChanged(adapterPosition, BindingRecyclerViewAdapter.f74200q);
            } catch (IllegalStateException unused) {
            }
        }

        @Override // androidx.databinding.OnRebindCallback
        public boolean onPreBind(ViewDataBinding viewDataBinding) {
            return BindingRecyclerViewAdapter.this.f74207o != null && BindingRecyclerViewAdapter.this.f74207o.isComputingLayout();
        }
    }

    public static class b extends RecyclerView.ViewHolder {
        public b(ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
        }
    }

    public interface c<T> {
        long a(int i10, T t10);
    }

    public interface d {
        @NonNull
        RecyclerView.ViewHolder a(@NonNull ViewDataBinding viewDataBinding);
    }

    public static class e<T> extends ObservableList.OnListChangedCallback<ObservableList<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<BindingRecyclerViewAdapter<T>> f74211b;

        public e(BindingRecyclerViewAdapter<T> bindingRecyclerViewAdapter, ObservableList<T> observableList) {
            this.f74211b = aq.a.a(bindingRecyclerViewAdapter, observableList, this);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            BindingRecyclerViewAdapter<T> bindingRecyclerViewAdapter = this.f74211b.get();
            if (bindingRecyclerViewAdapter == null) {
                return;
            }
            aq.e.a();
            bindingRecyclerViewAdapter.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i10, int i11) {
            BindingRecyclerViewAdapter<T> bindingRecyclerViewAdapter = this.f74211b.get();
            if (bindingRecyclerViewAdapter == null) {
                return;
            }
            aq.e.a();
            bindingRecyclerViewAdapter.notifyItemRangeChanged(i10, i11);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i10, int i11) {
            BindingRecyclerViewAdapter<T> bindingRecyclerViewAdapter = this.f74211b.get();
            if (bindingRecyclerViewAdapter == null) {
                return;
            }
            aq.e.a();
            bindingRecyclerViewAdapter.notifyItemRangeInserted(i10, i11);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i10, int i11, int i12) {
            BindingRecyclerViewAdapter<T> bindingRecyclerViewAdapter = this.f74211b.get();
            if (bindingRecyclerViewAdapter == null) {
                return;
            }
            aq.e.a();
            for (int i13 = 0; i13 < i12; i13++) {
                bindingRecyclerViewAdapter.notifyItemMoved(i10 + i13, i11 + i13);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i10, int i11) {
            BindingRecyclerViewAdapter<T> bindingRecyclerViewAdapter = this.f74211b.get();
            if (bindingRecyclerViewAdapter == null) {
                return;
            }
            aq.e.a();
            bindingRecyclerViewAdapter.notifyItemRangeRemoved(i10, i11);
        }
    }

    public final boolean e(List<Object> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != f74200q) {
                return false;
            }
        }
        return true;
    }

    public void f(@NonNull ViewDataBinding viewDataBinding, int i10, @LayoutRes int i11, int i12, T t10) {
        l();
        if (this.f74201i.a(viewDataBinding, t10)) {
            viewDataBinding.executePendingBindings();
            LifecycleOwner lifecycleOwner = this.f74208p;
            if (lifecycleOwner != null) {
                viewDataBinding.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    @NonNull
    public ViewDataBinding g(@NonNull LayoutInflater layoutInflater, @LayoutRes int i10, @NonNull ViewGroup viewGroup) {
        return DataBindingUtil.inflate(layoutInflater, i10, viewGroup, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<T> list = this.f74203k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        c<? super T> cVar = this.f74205m;
        return cVar == null ? i10 : cVar.a(i10, this.f74203k.get(i10));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        this.f74201i.e(i10, this.f74203k.get(i10));
        return this.f74201i.b();
    }

    @NonNull
    public RecyclerView.ViewHolder h(@NonNull ViewDataBinding viewDataBinding) {
        d dVar = this.f74206n;
        return dVar != null ? dVar.a(viewDataBinding) : new b(viewDataBinding);
    }

    public void i(@NonNull aq.c<T> cVar) {
        this.f74201i = cVar;
    }

    public void j(@Nullable c<? super T> cVar) {
        if (this.f74205m != cVar) {
            this.f74205m = cVar;
            setHasStableIds(cVar != null);
        }
    }

    public void k(@Nullable d dVar) {
        this.f74206n = dVar;
    }

    public final void l() {
        LifecycleOwner lifecycleOwner = this.f74208p;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            this.f74208p = aq.e.b(this.f74207o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        if (this.f74207o == null) {
            List<T> list = this.f74203k;
            if (list instanceof ObservableList) {
                e<T> eVar = new e<>(this, (ObservableList) list);
                this.f74202j = eVar;
                ((ObservableList) this.f74203k).addOnListChangedCallback(eVar);
            }
        }
        this.f74207o = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        onBindViewHolder(viewHolder, i10, Collections.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10, @NonNull List<Object> list) {
        ViewDataBinding binding = DataBindingUtil.getBinding(viewHolder.itemView);
        if (e(list)) {
            binding.executePendingBindings();
        } else {
            f(binding, this.f74201i.g(), this.f74201i.b(), i10, this.f74203k.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        if (this.f74204l == null) {
            this.f74204l = LayoutInflater.from(viewGroup.getContext());
        }
        ViewDataBinding viewDataBindingG = g(this.f74204l, i10, viewGroup);
        RecyclerView.ViewHolder viewHolderH = h(viewDataBindingG);
        viewDataBindingG.addOnRebindCallback(new a(viewHolderH));
        return viewHolderH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (this.f74207o != null) {
            List<T> list = this.f74203k;
            if (list instanceof ObservableList) {
                ((ObservableList) list).removeOnListChangedCallback(this.f74202j);
                this.f74202j = null;
            }
        }
        this.f74207o = null;
    }

    public void setItems(@Nullable List<T> list) {
        List<T> list2 = this.f74203k;
        if (list2 == list) {
            return;
        }
        if (this.f74207o != null) {
            if (list2 instanceof ObservableList) {
                ((ObservableList) list2).removeOnListChangedCallback(this.f74202j);
                this.f74202j = null;
            }
            if (list instanceof ObservableList) {
                ObservableList observableList = (ObservableList) list;
                e<T> eVar = new e<>(this, observableList);
                this.f74202j = eVar;
                observableList.addOnListChangedCallback(eVar);
            }
        }
        this.f74203k = list;
        notifyDataSetChanged();
    }
}
