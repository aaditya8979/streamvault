package com.mgs.carparking.ui.homecontent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.databinding.FragmentHomeContentListBinding;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.widgets.cardbanner.CardBanner;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oe.f;
import qe.e;
import qe.g;

/* JADX INFO: loaded from: classes8.dex */
public class HomeContentListFragment extends BaseFragment<FragmentHomeContentListBinding, HomeContentListViewModel> {
    private mb.a bannerAdapter;
    public boolean mIsPrepare = false;
    public boolean mIsVisible = false;
    public boolean mIsFirstLoad = true;
    private List<RecommandVideosEntity> recommandVideosEntityList = new ArrayList();

    public class a implements g {
        public a() {
        }

        @Override // qe.g
        public void d(@NonNull f fVar) {
            ((HomeContentListViewModel) HomeContentListFragment.this.viewModel).w(true);
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // qe.e
        public void a(@NonNull f fVar) {
            ((HomeContentListViewModel) HomeContentListFragment.this.viewModel).w(false);
        }
    }

    public class c implements CardBanner.e {
        public c() {
        }

        @Override // com.mgs.carparking.widgets.cardbanner.CardBanner.e
        public void a(int i10) {
            ((FragmentHomeContentListBinding) HomeContentListFragment.this.binding).f42979b.b(i10 % HomeContentListFragment.this.recommandVideosEntityList.size(), HomeContentListFragment.this.recommandVideosEntityList.size());
        }
    }

    public class d implements CardBanner.d {
        public d() {
        }

        @Override // com.mgs.carparking.widgets.cardbanner.CardBanner.d
        public void a(int i10) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", ((RecommandVideosEntity) HomeContentListFragment.this.recommandVideosEntityList.get(i10)).getId());
            HomeContentListFragment.this.startActivity(VideoPlayDetailActivity.class, bundle);
        }
    }

    private void initRefresh() {
        ((FragmentHomeContentListBinding) this.binding).f42983f.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentHomeContentListBinding) this.binding).f42983f.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(getActivity()).u(12.0f);
        ((FragmentHomeContentListBinding) this.binding).f42983f.L(new a());
        ((FragmentHomeContentListBinding) this.binding).f42983f.K(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(List list) {
        this.recommandVideosEntityList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.recommandVideosEntityList.add((RecommandVideosEntity) it.next());
        }
        mb.a aVar = new mb.a(getActivity(), this.recommandVideosEntityList);
        this.bannerAdapter = aVar;
        ((FragmentHomeContentListBinding) this.binding).f42981d.m(aVar);
        ((FragmentHomeContentListBinding) this.binding).f42981d.o();
        ((FragmentHomeContentListBinding) this.binding).f42979b.b(0, this.recommandVideosEntityList.size());
        ((FragmentHomeContentListBinding) this.binding).f42981d.setScrollToPosition(new c());
        ((FragmentHomeContentListBinding) this.binding).f42981d.setOnItemClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r12) {
        ((FragmentHomeContentListBinding) this.binding).f42983f.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r12) {
        ((FragmentHomeContentListBinding) this.binding).f42983f.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(Void r12) {
        ((FragmentHomeContentListBinding) this.binding).f42983f.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(RecommandVideosEntity recommandVideosEntity) {
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
        ((HomeContentListViewModel) this.viewModel).x();
        ((HomeContentListViewModel) this.viewModel).w(false);
    }

    public static HomeContentListFragment newInstance(int i10) {
        HomeContentListFragment homeContentListFragment = new HomeContentListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        homeContentListFragment.setArguments(bundle);
        return homeContentListFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_home_content_list;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        ((HomeContentListViewModel) this.viewModel).y(arguments.getInt("resourceType", 0));
        initRefresh();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public HomeContentListViewModel initViewModel() {
        return new HomeContentListViewModel(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((HomeContentListViewModel) this.viewModel).f44580k.observe(this, new Observer() { // from class: nc.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75743b.lambda$initViewObservable$0((List) obj);
            }
        });
        ((HomeContentListViewModel) this.viewModel).f44581l.observe(this, new Observer() { // from class: nc.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75748b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((HomeContentListViewModel) this.viewModel).f44583n.observe(this, new Observer() { // from class: nc.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75751b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((HomeContentListViewModel) this.viewModel).f44582m.observe(this, new Observer() { // from class: nc.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75758b.lambda$initViewObservable$3((Void) obj);
            }
        });
        ((HomeContentListViewModel) this.viewModel).f44584o.observe(this, new Observer() { // from class: nc.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75761b.lambda$initViewObservable$4((RecommandVideosEntity) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((FragmentHomeContentListBinding) this.binding).f42981d.p();
        if (this.bannerAdapter != null) {
            this.bannerAdapter = null;
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
