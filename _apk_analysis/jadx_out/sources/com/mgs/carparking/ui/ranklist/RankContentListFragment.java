package com.mgs.carparking.ui.ranklist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.FragmentRankContentListBinding;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oe.f;
import qe.e;
import qe.g;

/* JADX INFO: loaded from: classes11.dex */
public class RankContentListFragment extends BaseFragment<FragmentRankContentListBinding, RankContentListViewModel> {
    private RankMultipleListAdapter adapter;
    private int videoType;
    public boolean mIsPrepare = false;
    public boolean mIsVisible = false;
    public boolean mIsFirstLoad = true;

    public class a extends GridLayoutManager.SpanSizeLookup {
        public a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            return (i10 != 8 || AppApplication.adInfoEntry.getAd_position_24() == null || AppApplication.adInfoEntry.getAd_position_24().size() <= 0) ? 1 : 4;
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // qe.g
        public void d(@NonNull f fVar) {
            ((RankContentListViewModel) RankContentListFragment.this.viewModel).u(true, false);
            RankContentListFragment.this.adapter.n();
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // qe.e
        public void a(@NonNull f fVar) {
            ((RankContentListViewModel) RankContentListFragment.this.viewModel).u(false, false);
        }
    }

    private void initRefresh() {
        ((FragmentRankContentListBinding) this.binding).f43069d.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentRankContentListBinding) this.binding).f43069d.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(getActivity()).u(12.0f);
        ((FragmentRankContentListBinding) this.binding).f43069d.L(new b());
        ((FragmentRankContentListBinding) this.binding).f43069d.K(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(Void r12) {
        ((FragmentRankContentListBinding) this.binding).f43069d.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r12) {
        ((FragmentRankContentListBinding) this.binding).f43069d.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r12) {
        ((FragmentRankContentListBinding) this.binding).f43069d.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(Void r22) {
        ((FragmentRankContentListBinding) this.binding).f43069d.J(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(RecommandVideosEntity recommandVideosEntity) {
        if (ed.e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    private void lazyLoad() {
        if (this.mIsPrepare && this.mIsVisible && this.mIsFirstLoad) {
            loadData();
            this.mIsFirstLoad = false;
        }
    }

    private void loadData() {
        ((FragmentRankContentListBinding) this.binding).f43070e.setPadding(0, 0, 0, 0);
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getActivity(), 4, 1, false);
        gridLayoutManager.setSpanSizeLookup(new a());
        ((FragmentRankContentListBinding) this.binding).f43070e.setLayoutManager(gridLayoutManager);
        RankMultipleListAdapter rankMultipleListAdapter = new RankMultipleListAdapter(getActivity(), getActivity());
        this.adapter = rankMultipleListAdapter;
        ((FragmentRankContentListBinding) this.binding).f43070e.setAdapter(rankMultipleListAdapter);
        this.adapter.notifyDataSetChanged();
        ((RankContentListViewModel) this.viewModel).t();
    }

    public static RankContentListFragment newInstance(int i10, int i11) {
        RankContentListFragment rankContentListFragment = new RankContentListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceTypePid", i10);
        bundle.putInt("resourceType", i11);
        rankContentListFragment.setArguments(bundle);
        return rankContentListFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_rank_content_list;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        int i10 = arguments.getInt("resourceTypePid", 0);
        int i11 = arguments.getInt("resourceType", 0);
        this.videoType = i11;
        ((RankContentListViewModel) this.viewModel).v(i10, i11);
        initRefresh();
        Glide.with(getActivity()).clear(((FragmentRankContentListBinding) this.binding).f43068c);
        Glide.with(getActivity()).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((FragmentRankContentListBinding) this.binding).f43068c);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public RankContentListViewModel initViewModel() {
        return new RankContentListViewModel(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((RankContentListViewModel) this.viewModel).f44922o.observe(this, new Observer() { // from class: ad.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3741b.lambda$initViewObservable$0((Void) obj);
            }
        });
        ((RankContentListViewModel) this.viewModel).f44924q.observe(this, new Observer() { // from class: ad.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3742b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((RankContentListViewModel) this.viewModel).f44923p.observe(this, new Observer() { // from class: ad.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3743b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((RankContentListViewModel) this.viewModel).f44921n.observe(this, new Observer() { // from class: ad.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3744b.lambda$initViewObservable$3((Void) obj);
            }
        });
        ((RankContentListViewModel) this.viewModel).f44925r.observe(this, new Observer() { // from class: ad.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3745b.lambda$initViewObservable$4((RecommandVideosEntity) obj);
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

    public void refreshPid(int i10) {
        ((RankContentListViewModel) this.viewModel).v(i10, this.videoType);
    }

    public void setPid(int i10) {
        refreshPid(i10);
        ((RankContentListViewModel) this.viewModel).u(true, false);
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
