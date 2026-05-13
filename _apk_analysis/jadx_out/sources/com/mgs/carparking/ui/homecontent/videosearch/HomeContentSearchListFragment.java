package com.mgs.carparking.ui.homecontent.videosearch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.ironsource.C3978d4;
import com.mgs.carparking.databinding.FragmentHomeContentSearchListBinding;
import com.mgs.carparking.model.HOMECONTENTSEARCHLISTVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.ui.homecontent.videosearch.HomeContentSearchListFragment;
import com.mgs.carparking.ui.mine.feedback.FeedbackActivity;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import ed.l0;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oe.f;
import qe.e;
import qe.g;

/* JADX INFO: loaded from: classes7.dex */
public class HomeContentSearchListFragment extends BaseFragment<FragmentHomeContentSearchListBinding, HOMECONTENTSEARCHLISTVIEWMODEL> {
    private SearchMultipleListAdapter adapter;
    private String keyword;
    private LinearLayoutManager layoutManager;
    private int videoType;
    public boolean mIsPrepare = false;
    public boolean mIsVisible = false;
    public boolean mIsFirstLoad = true;
    public int visibleItemCount = 0;

    public class a extends RecyclerView.OnScrollListener {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i10, int i11) {
            HomeContentSearchListFragment.this.visibleItemCount = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            HomeContentSearchListFragment homeContentSearchListFragment = HomeContentSearchListFragment.this;
            if (homeContentSearchListFragment.visibleItemCount == 6) {
                ((HOMECONTENTSEARCHLISTVIEWMODEL) homeContentSearchListFragment.viewModel).f44022j.set(true);
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // qe.g
        public void d(@NonNull f fVar) {
            ((HOMECONTENTSEARCHLISTVIEWMODEL) HomeContentSearchListFragment.this.viewModel).x(true, HomeContentSearchListFragment.this.videoType, HomeContentSearchListFragment.this.keyword);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // qe.e
        public void a(@NonNull f fVar) {
            ((HOMECONTENTSEARCHLISTVIEWMODEL) HomeContentSearchListFragment.this.viewModel).x(false, HomeContentSearchListFragment.this.videoType, HomeContentSearchListFragment.this.keyword);
        }
    }

    private void initRefresh() {
        ((FragmentHomeContentSearchListBinding) this.binding).f43010d.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentHomeContentSearchListBinding) this.binding).f43010d.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(getActivity()).u(12.0f);
        ((FragmentHomeContentSearchListBinding) this.binding).f43010d.L(new b());
        ((FragmentHomeContentSearchListBinding) this.binding).f43010d.K(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(Void r12) {
        ((FragmentHomeContentSearchListBinding) this.binding).f43010d.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r12) {
        ((FragmentHomeContentSearchListBinding) this.binding).f43010d.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r12) {
        ((FragmentHomeContentSearchListBinding) this.binding).f43010d.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(RecommandVideosEntity recommandVideosEntity) {
        if (ed.e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        startActivity(VideoPlayDetailActivity.class, bundle);
        ed.c.l("50008", 2, 0, 0, recommandVideosEntity.getId(), l0.T());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(RecommandVideosEntity recommandVideosEntity) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        bundle.putInt(C3978d4.i.L, recommandVideosEntity.getComicPosition() - 1);
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$5(RecommandVideosEntity recommandVideosEntity) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        bundle.putInt(C3978d4.i.L, recommandVideosEntity.getComicPosition() - 2);
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initViewObservable$6(VideoBean videoBean) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$7(Void r42) {
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).x(true, this.videoType, this.keyword);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$8(Void r32) {
        Bundle bundle = new Bundle();
        bundle.putString("content", this.keyword);
        bundle.putInt("flag", 1);
        startActivity(FeedbackActivity.class, bundle);
    }

    private void lazyLoad() {
        if (this.mIsPrepare && this.mIsVisible && this.mIsFirstLoad) {
            loadData();
            this.mIsFirstLoad = false;
        }
    }

    private void loadData() {
        ((FragmentHomeContentSearchListBinding) this.binding).f43011e.setPadding(0, 0, 0, 0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.layoutManager = linearLayoutManager;
        ((FragmentHomeContentSearchListBinding) this.binding).f43011e.setLayoutManager(linearLayoutManager);
        SearchMultipleListAdapter searchMultipleListAdapter = new SearchMultipleListAdapter(getActivity(), getActivity());
        this.adapter = searchMultipleListAdapter;
        ((FragmentHomeContentSearchListBinding) this.binding).f43011e.setAdapter(searchMultipleListAdapter);
        this.adapter.notifyDataSetChanged();
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).x(false, this.videoType, this.keyword);
    }

    public static HomeContentSearchListFragment newInstance(int i10, String str) {
        HomeContentSearchListFragment homeContentSearchListFragment = new HomeContentSearchListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        bundle.putString("keyword", str);
        homeContentSearchListFragment.setArguments(bundle);
        return homeContentSearchListFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_home_content_search_list;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.videoType = arguments.getInt("resourceType", 0);
        this.keyword = arguments.getString("keyword");
        initRefresh();
        Glide.with(this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((FragmentHomeContentSearchListBinding) this.binding).f43009c);
        ((FragmentHomeContentSearchListBinding) this.binding).f43011e.addOnScrollListener(new a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public HOMECONTENTSEARCHLISTVIEWMODEL initViewModel() {
        return new HOMECONTENTSEARCHLISTVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44024l.observe(this, new Observer() { // from class: rc.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78879b.lambda$initViewObservable$0((Void) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44026n.observe(this, new Observer() { // from class: rc.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78880b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44025m.observe(this, new Observer() { // from class: rc.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78881b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44028p.observe(this, new Observer() { // from class: rc.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78882b.lambda$initViewObservable$3((RecommandVideosEntity) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44030r.observe(this, new Observer() { // from class: rc.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78883b.lambda$initViewObservable$4((RecommandVideosEntity) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44031s.observe(this, new Observer() { // from class: rc.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78884b.lambda$initViewObservable$5((RecommandVideosEntity) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44029q.observe(this, new Observer() { // from class: rc.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeContentSearchListFragment.lambda$initViewObservable$6((VideoBean) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44027o.observe(this, new Observer() { // from class: rc.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78885b.lambda$initViewObservable$7((Void) obj);
            }
        });
        ((HOMECONTENTSEARCHLISTVIEWMODEL) this.viewModel).f44023k.observe(this, new Observer() { // from class: rc.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f78886b.lambda$initViewObservable$8((Void) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mIsPrepare = true;
        lazyLoad();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (!z10) {
            this.mIsVisible = false;
        } else {
            this.mIsVisible = true;
            lazyLoad();
        }
    }
}
