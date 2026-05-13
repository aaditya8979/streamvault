package com.mgs.carparking.ui.homecontent;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.widgets.BannerView;
import com.mgs.carparking.widgets.viewpager.GalleryAdapter;
import com.mgs.carparking.widgets.viewpager.MyGallyPageTransformer;
import com.mgs.carparking.widgets.viewpager.MyOnPageChangeListener;
import ed.q;
import java.util.ArrayList;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;
import nc.c1;
import nc.k0;
import nc.m0;
import np.e;
import pc.q0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeContentMultipleListAdapter<T extends e> extends BindingRecyclerViewAdapter<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f44591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Activity f44592s;

    public class a implements BannerView.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f44593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c1 f44594b;

        public a(boolean z10, c1 c1Var) {
            this.f44593a = z10;
            this.f44594b = c1Var;
        }

        @Override // com.mgs.carparking.widgets.BannerView.c
        public void a(int i10, BannerView.Banner banner) {
            if (i10 > 0 && this.f44593a) {
                i10--;
            }
            if (this.f44594b.f75753c.get(i10).getJump_type() != 1) {
                q.a(HomeContentMultipleListAdapter.this.f44591r, this.f44594b.f75753c.get(i10).getJump_type(), this.f44594b.f75753c.get(i10).getJump_url(), this.f44594b.f75753c.get(i10).getContent());
                return;
            }
            this.f44594b.f75753c.get(i10).getVod_info().setModule_id(this.f44594b.f75755e);
            c1 c1Var = this.f44594b;
            c1Var.f75754d.setValue(c1Var.f75753c.get(i10).getVod_info());
            this.f44594b.f75757g.b();
        }
    }

    public class b implements GalleryAdapter.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k0 f44596a;

        public b(k0 k0Var) {
            this.f44596a = k0Var;
        }

        @Override // com.mgs.carparking.widgets.viewpager.GalleryAdapter.b
        public void a(int i10) {
            k0 k0Var = this.f44596a;
            k0Var.f75788d.setValue(k0Var.f75787c.getVideoList().get(i10));
            this.f44596a.f75790f.b();
        }
    }

    public HomeContentMultipleListAdapter(Context context, Activity activity) {
        this.f44591r = context;
        this.f44592s = activity;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void f(ViewDataBinding viewDataBinding, int i10, int i11, int i12, T t10) {
        super.f(viewDataBinding, i10, i11, i12, t10);
        Object objA = t10.a();
        boolean z10 = false;
        if ("TYPE_HOME_VIDEO_SLIDE".equals(objA)) {
            if (t10 instanceof c1) {
                c1 c1Var = (c1) t10;
                BannerView bannerView = (BannerView) viewDataBinding.getRoot().findViewById(R.id.home_banner);
                ArrayList<BannerView.Banner> arrayList = new ArrayList<>();
                List<BlockListEntry> list = c1Var.f75753c;
                if (list == null || list.size() <= 0) {
                    return;
                }
                arrayList.add(new BannerView.Banner(null, null, c1Var.f75753c.get(0).getBanner_pic(), "", c1Var.f75753c.get(0).getContent(), true, true));
                if (!c1Var.f75756f && AppApplication.adInfoEntry.getAd_position_2() != null && AppApplication.adInfoEntry.getAd_position_2().size() > 0) {
                    ed.b.g(this.f44592s, null, arrayList, AppApplication.adInfoEntry.getAd_position_2());
                    z10 = true;
                }
                if (c1Var.f75753c.size() > 1) {
                    for (int i13 = 1; i13 < c1Var.f75753c.size(); i13++) {
                        arrayList.add(new BannerView.Banner(null, null, c1Var.f75753c.get(i13).getBanner_pic(), "", c1Var.f75753c.get(i13).getContent(), true, true));
                    }
                }
                bannerView.f(arrayList, new a(z10, c1Var));
                return;
            }
            return;
        }
        if ("TYPE_HOME_VIDEO_GALLERY".equals(objA)) {
            if (t10 instanceof k0) {
                k0 k0Var = (k0) t10;
                ViewPager viewPager = (ViewPager) viewDataBinding.getRoot().findViewById(R.id.viewPager);
                viewPager.setPageTransformer(true, new MyGallyPageTransformer());
                GalleryAdapter galleryAdapter = new GalleryAdapter(this.f44591r, k0Var.f75787c.getVideoList());
                viewPager.setAdapter(galleryAdapter);
                viewPager.setOffscreenPageLimit(5);
                viewPager.setPageMargin(2);
                viewPager.addOnPageChangeListener(new MyOnPageChangeListener(viewPager));
                if (k0Var.f75787c.getVideoList().size() > 2) {
                    viewPager.setCurrentItem(1);
                } else {
                    viewPager.setCurrentItem(0);
                }
                galleryAdapter.a(new b(k0Var));
                return;
            }
            return;
        }
        if (!"TYPE_HOME_VIDEO_ADS".equals(objA)) {
            if ("TYPE_HOME_VIDEO_SPECIAL_LIST".equals(objA) && (t10 instanceof q0)) {
                StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) viewDataBinding.getRoot().getLayoutParams();
                layoutParams.setFullSpan(true);
                viewDataBinding.getRoot().setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (t10 instanceof m0) {
            FrameLayout frameLayout = (FrameLayout) viewDataBinding.getRoot().findViewById(R.id.layout_adView);
            if (AppApplication.adInfoEntry.getAd_position_15() == null || AppApplication.adInfoEntry.getAd_position_15().size() <= 0 || AppApplication.adInfoEntry.getAd_position_15() == null || AppApplication.adInfoEntry.getAd_position_15().size() <= 0) {
                return;
            }
            ed.b.m(this.f44592s, frameLayout, AppApplication.adInfoEntry.getAd_position_15());
        }
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
