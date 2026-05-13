package com.mgs.carparking.ui.homecontent.videosearch;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import ed.b;
import hc.m2;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;
import np.e;

/* JADX INFO: loaded from: classes4.dex */
public class SearchMultipleListAdapter<T extends e> extends BindingRecyclerViewAdapter<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f44794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Activity f44795s;

    public SearchMultipleListAdapter(Context context, Activity activity) {
        this.f44794r = context;
        this.f44795s = activity;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void f(ViewDataBinding viewDataBinding, int i10, int i11, int i12, T t10) {
        super.f(viewDataBinding, i10, i11, i12, t10);
        Object objA = t10.a();
        if ("TYPE_SEARCH_VIDEO_MOVIE".equals(objA) || "TYPE_SEARCH_VIDEO_TV".equals(objA) || "TYPE_SEARCH_VIDEO_VARIETY".equals(objA) || "TYPE_SEARCH_VIDEO_COMIC".equals(objA) || !"TYPE_HOME_VIDEO_ADS".equals(objA) || !(t10 instanceof m2)) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewDataBinding.getRoot().findViewById(R.id.layout_adView);
        if (AppApplication.adInfoEntry.getAd_position_20() == null || AppApplication.adInfoEntry.getAd_position_20().size() <= 0 || AppApplication.adInfoEntry.getAd_position_20() == null || AppApplication.adInfoEntry.getAd_position_20().size() <= 0) {
            return;
        }
        b.t(this.f44795s, frameLayout, AppApplication.adInfoEntry.getAd_position_20());
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
