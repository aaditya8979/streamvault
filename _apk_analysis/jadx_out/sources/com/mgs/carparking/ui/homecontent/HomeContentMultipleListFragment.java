package com.mgs.carparking.ui.homecontent;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.FragmentHomeContentMultipleListBinding;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import ed.c;
import ed.l0;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oe.f;
import qe.e;
import qe.g;

/* JADX INFO: loaded from: classes3.dex */
public class HomeContentMultipleListFragment extends BaseFragment<FragmentHomeContentMultipleListBinding, HomeContentMultipleListViewModel> {
    private HomeContentMultipleListAdapter adapter;
    public boolean mIsPrepare = false;
    public boolean mIsVisible = false;
    public boolean mIsFirstLoad = true;
    private Handler handler = new Handler();

    public class a implements g {
        public a() {
        }

        @Override // qe.g
        public void d(@NonNull f fVar) {
            if (((FragmentHomeContentMultipleListBinding) HomeContentMultipleListFragment.this.binding).f42996d.A()) {
                return;
            }
            AppApplication.bannerIndex = 0;
            ((HomeContentMultipleListViewModel) HomeContentMultipleListFragment.this.viewModel).w(true, false);
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // qe.e
        public void a(@NonNull f fVar) {
            if (((FragmentHomeContentMultipleListBinding) HomeContentMultipleListFragment.this.binding).f42996d.B()) {
                return;
            }
            ((HomeContentMultipleListViewModel) HomeContentMultipleListFragment.this.viewModel).w(false, false);
        }
    }

    private void initRefresh() {
        AppApplication.bannerIndex = 0;
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.I(true);
        classicsHeader.u(12.0f);
        classicsHeader.s(getResources().getColor(R.color.color_f7f7f7));
        ClassicsFooter classicsFooter = new ClassicsFooter(getActivity());
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.G(true);
        classicsFooter.u(12.0f);
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.L(new a());
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.K(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(Void r12) {
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r12) {
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r12) {
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(RecommandVideosEntity recommandVideosEntity) {
        if (ed.e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        startActivity(VideoPlayDetailActivity.class, bundle);
        c.l("50000", 2, recommandVideosEntity.getModule_id(), ((HomeContentMultipleListViewModel) this.viewModel).f44600f, recommandVideosEntity.getId(), l0.T());
    }

    private void lazyLoad() {
        if (this.mIsPrepare && this.mIsVisible && this.mIsFirstLoad) {
            loadData();
            this.mIsFirstLoad = false;
        }
    }

    private void loadData() {
        ((FragmentHomeContentMultipleListBinding) this.binding).f42996d.m();
        HomeContentMultipleListAdapter homeContentMultipleListAdapter = new HomeContentMultipleListAdapter(getActivity(), getActivity());
        this.adapter = homeContentMultipleListAdapter;
        ((FragmentHomeContentMultipleListBinding) this.binding).f42997e.setAdapter(homeContentMultipleListAdapter);
        ((HomeContentMultipleListViewModel) this.viewModel).v(this.handler);
    }

    public static HomeContentMultipleListFragment newInstance(int i10) {
        HomeContentMultipleListFragment homeContentMultipleListFragment = new HomeContentMultipleListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        homeContentMultipleListFragment.setArguments(bundle);
        return homeContentMultipleListFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_home_content_multiple_list;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        ((HomeContentMultipleListViewModel) this.viewModel).x(arguments.getInt("resourceType", 0));
        initRefresh();
        ud.c.b(getActivity(), R.drawable.ic_is_loading, ((FragmentHomeContentMultipleListBinding) this.binding).f42995c, true);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public HomeContentMultipleListViewModel initViewModel() {
        return new HomeContentMultipleListViewModel(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((HomeContentMultipleListViewModel) this.viewModel).f44604j.observe(this, new Observer() { // from class: nc.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75786b.lambda$initViewObservable$0((Void) obj);
            }
        });
        ((HomeContentMultipleListViewModel) this.viewModel).f44606l.observe(this, new Observer() { // from class: nc.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75791b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((HomeContentMultipleListViewModel) this.viewModel).f44605k.observe(this, new Observer() { // from class: nc.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75792b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((HomeContentMultipleListViewModel) this.viewModel).f44607m.observe(this, new Observer() { // from class: nc.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75796b.lambda$initViewObservable$3((RecommandVideosEntity) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.adapter != null) {
            this.adapter = null;
        }
        if (this.handler != null) {
            this.handler = null;
        }
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
