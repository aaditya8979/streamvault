package com.mgs.carparking.ui.ranklist;

import ad.d;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import ed.b;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;
import np.e;

/* JADX INFO: loaded from: classes6.dex */
public class RankMultipleListAdapter<T extends e> extends BindingRecyclerViewAdapter<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f44935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Activity f44936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f44937t = true;

    public RankMultipleListAdapter(Context context, Activity activity) {
        this.f44935r = context;
        this.f44936s = activity;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void f(ViewDataBinding viewDataBinding, int i10, int i11, int i12, T t10) {
        super.f(viewDataBinding, i10, i11, i12, t10);
        Object objA = t10.a();
        if ("TYPE_RANK_VIDEO_NEXT".equals(objA)) {
            return;
        }
        if ("TYPE_HOME_VIDEO_ADS".equals(objA)) {
            if (this.f44937t) {
                this.f44937t = false;
                if (t10 instanceof d) {
                    FrameLayout frameLayout = (FrameLayout) viewDataBinding.getRoot().findViewById(R.id.layout_adView);
                    if (AppApplication.adInfoEntry.getAd_position_19() == null || AppApplication.adInfoEntry.getAd_position_19().size() <= 0) {
                        return;
                    }
                    b.r(this.f44936s, frameLayout, AppApplication.adInfoEntry.getAd_position_19());
                    return;
                }
                return;
            }
            return;
        }
        if ("TYPE_RANK_AD2".equals(objA) && this.f44937t) {
            this.f44937t = false;
            if (t10 instanceof d) {
                FrameLayout frameLayout2 = (FrameLayout) viewDataBinding.getRoot().findViewById(R.id.layout_adView);
                if (AppApplication.adInfoEntry.getAd_position_24() == null || AppApplication.adInfoEntry.getAd_position_24().size() <= 0) {
                    return;
                }
                b.r(this.f44936s, frameLayout2, AppApplication.adInfoEntry.getAd_position_24());
            }
        }
    }

    public void n() {
        this.f44937t = true;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List<Object> list) {
        super.onBindViewHolder(viewHolder, i10, list);
    }
}
