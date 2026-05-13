package com.mgs.carparking.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListAdapter;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import com.mgs.carparking.widgets.FeedRootRecyclerView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import np.e;

/* JADX INFO: loaded from: classes3.dex */
public class FragmentHomeRecommendMultipleListBindingImpl extends FragmentHomeRecommendMultipleListBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f43035n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f43036o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Button f43039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f43041m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43036o = sparseIntArray;
        sparseIntArray.put(R.id.refresh_layout, 5);
        sparseIntArray.put(R.id.header, 6);
        sparseIntArray.put(R.id.tv_empty, 7);
        sparseIntArray.put(R.id.img_loading, 8);
    }

    public FragmentHomeRecommendMultipleListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f43035n, f43036o));
    }

    public FragmentHomeRecommendMultipleListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (WaterDropHeader) objArr[6], (ImageView) objArr[8], (SmartRefreshLayout) objArr[5], (FeedRootRecyclerView) objArr[1], (TextView) objArr[7]);
        this.f43041m = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f43037i = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.f43038j = relativeLayout2;
        relativeLayout2.setTag(null);
        Button button = (Button) objArr[3];
        this.f43039k = button;
        button.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[4];
        this.f43040l = relativeLayout3;
        relativeLayout3.setTag(null);
        this.f43031e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean b(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43041m |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43041m |= 2;
        }
        return true;
    }

    public final boolean d(ObservableList<e> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f43041m |= 1;
        }
        return true;
    }

    public void e(@Nullable HomeRecommendMultipleListAdapter homeRecommendMultipleListAdapter) {
        this.f43034h = homeRecommendMultipleListAdapter;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.FragmentHomeRecommendMultipleListBindingImpl.executeBindings():void");
    }

    public void f(@Nullable HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel) {
        this.f43033g = homeRecommendMultipleListViewModel;
        synchronized (this) {
            this.f43041m |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f43041m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f43041m = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d((ObservableList) obj, i11);
        }
        if (i10 == 1) {
            return c((ObservableField) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return b((ObservableField) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (3 == i10) {
            e((HomeRecommendMultipleListAdapter) obj);
        } else {
            if (7 != i10) {
                return false;
            }
            f((HomeRecommendMultipleListViewModel) obj);
        }
        return true;
    }
}
