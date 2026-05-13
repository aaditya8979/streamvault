package com.mgs.carparking.ui.channelcontent.lookcategory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.dramarush.shortin.R;
import com.google.android.material.appbar.AppBarLayout;
import com.mgs.carparking.databinding.FragmentChannelLookBinding;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.ui.channelcontent.TypeChannelAdapter;
import com.mgs.carparking.widgets.AppBarStateChangeListener;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oe.f;
import qe.e;
import qe.g;

/* JADX INFO: loaded from: classes11.dex */
public class LookChannelFragment extends BaseFragment<FragmentChannelLookBinding, LOOKCHANNELVIEWMODEL> {
    private TypeChannelAdapter typeChannelAdapter;

    public class a extends AppBarStateChangeListener {
        public a() {
        }

        @Override // com.mgs.carparking.widgets.AppBarStateChangeListener
        public void a(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            if (state == AppBarStateChangeListener.State.EXPANDED) {
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42933n.setText("");
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42930k.setVisibility(8);
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42928i.setVisibility(0);
            } else if (state == AppBarStateChangeListener.State.COLLAPSED) {
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42933n.setText(((LOOKCHANNELVIEWMODEL) LookChannelFragment.this.viewModel).H());
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42930k.setVisibility(0);
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42928i.setVisibility(8);
            } else {
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42933n.setText("");
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42930k.setVisibility(8);
                ((FragmentChannelLookBinding) LookChannelFragment.this.binding).f42928i.setVisibility(0);
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // qe.g
        public void d(@NonNull f fVar) {
            ((LOOKCHANNELVIEWMODEL) LookChannelFragment.this.viewModel).V(true);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // qe.e
        public void a(@NonNull f fVar) {
            ((LOOKCHANNELVIEWMODEL) LookChannelFragment.this.viewModel).V(false);
        }
    }

    private void initRefresh() {
        ((FragmentChannelLookBinding) this.binding).f42929j.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(getActivity());
        ((FragmentChannelLookBinding) this.binding).f42929j.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(getActivity()).u(12.0f);
        ((FragmentChannelLookBinding) this.binding).f42929j.L(new b());
        ((FragmentChannelLookBinding) this.binding).f42929j.K(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(Void r12) {
        ((FragmentChannelLookBinding) this.binding).f42929j.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Void r22) {
        ((FragmentChannelLookBinding) this.binding).f42929j.s();
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f44057l.set(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r12) {
        ((FragmentChannelLookBinding) this.binding).f42929j.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(Void r12) {
        ((FragmentChannelLookBinding) this.binding).f42929j.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(Void r22) {
        ((FragmentChannelLookBinding) this.binding).f42929j.J(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$5(Integer num) {
        if (num.intValue() - 3 >= 0) {
            ((FragmentChannelLookBinding) this.binding).f42931l.scrollToPosition(num.intValue() - 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$6(Void r22) {
        ((FragmentChannelLookBinding) this.binding).f42921b.setExpanded(true);
    }

    public static LookChannelFragment newInstance(int i10) {
        LookChannelFragment lookChannelFragment = new LookChannelFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        lookChannelFragment.setArguments(bundle);
        return lookChannelFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_channel_look;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        ((FragmentChannelLookBinding) this.binding).f42921b.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a());
        initRefresh();
        RequestManager requestManagerWith = Glide.with(this);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_is_loading);
        requestManagerWith.load(numValueOf).into(((FragmentChannelLookBinding) this.binding).f42926g);
        Glide.with(this).load(numValueOf).into(((FragmentChannelLookBinding) this.binding).f42927h);
        TypeChannelAdapter typeChannelAdapter = new TypeChannelAdapter();
        this.typeChannelAdapter = typeChannelAdapter;
        ((FragmentChannelLookBinding) this.binding).f42931l.setAdapter(typeChannelAdapter);
        ((LOOKCHANNELVIEWMODEL) this.viewModel).U();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public LOOKCHANNELVIEWMODEL initViewModel() {
        return new LOOKCHANNELVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f44065t.observe(this, new Observer() { // from class: mc.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f74104b.lambda$initViewObservable$0((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f44062q.observe(this, new Observer() { // from class: mc.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f74105b.lambda$initViewObservable$1((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f44064s.observe(this, new Observer() { // from class: mc.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f74106b.lambda$initViewObservable$2((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f44063r.observe(this, new Observer() { // from class: mc.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f74107b.lambda$initViewObservable$3((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f44066u.observe(this, new Observer() { // from class: mc.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f74108b.lambda$initViewObservable$4((Void) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f44067v.observe(this, new Observer() { // from class: mc.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f74109b.lambda$initViewObservable$5((Integer) obj);
            }
        });
        ((LOOKCHANNELVIEWMODEL) this.viewModel).f44068w.observe(this, new Observer() { // from class: mc.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f74110b.lambda$initViewObservable$6((Void) obj);
            }
        });
    }
}
