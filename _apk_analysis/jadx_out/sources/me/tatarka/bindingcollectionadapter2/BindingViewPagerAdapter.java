package me.tatarka.bindingcollectionadapter2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import aq.b;
import aq.c;
import aq.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class BindingViewPagerAdapter<T> extends PagerAdapter implements b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<T> f74212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<T> f74213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f74214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a<T> f74215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public LifecycleOwner f74216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<View> f74217g = new ArrayList();

    public interface a<T> {
        @Nullable
        CharSequence a(int i10, T t10);
    }

    public void a(@NonNull ViewDataBinding viewDataBinding, int i10, @LayoutRes int i11, int i12, T t10) {
        if (this.f74212b.a(viewDataBinding, t10)) {
            viewDataBinding.executePendingBindings();
            LifecycleOwner lifecycleOwner = this.f74216f;
            if (lifecycleOwner != null) {
                viewDataBinding.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    @NonNull
    public ViewDataBinding b(@NonNull LayoutInflater layoutInflater, @LayoutRes int i10, @NonNull ViewGroup viewGroup) {
        return DataBindingUtil.inflate(layoutInflater, i10, viewGroup, false);
    }

    public final void c(View view) {
        LifecycleOwner lifecycleOwner = this.f74216f;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            this.f74216f = e.b(view);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        View view = (View) obj;
        this.f74217g.remove(view);
        viewGroup.removeView(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<T> list = this.f74213c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        Object tag = ((View) obj).getTag();
        if (this.f74213c == null) {
            return -2;
        }
        for (int i10 = 0; i10 < this.f74213c.size(); i10++) {
            if (tag == this.f74213c.get(i10)) {
                return i10;
            }
        }
        return -2;
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
    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int i10) {
        a<T> aVar = this.f74215e;
        if (aVar == null) {
            return null;
        }
        return aVar.a(i10, this.f74213c.get(i10));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        if (this.f74214d == null) {
            this.f74214d = LayoutInflater.from(viewGroup.getContext());
        }
        c(viewGroup);
        T t10 = this.f74213c.get(i10);
        this.f74212b.e(i10, t10);
        ViewDataBinding viewDataBindingB = b(this.f74214d, this.f74212b.b(), viewGroup);
        View root = viewDataBindingB.getRoot();
        a(viewDataBindingB, this.f74212b.g(), this.f74212b.b(), i10, t10);
        viewGroup.addView(root);
        root.setTag(t10);
        this.f74217g.add(root);
        return root;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }
}
