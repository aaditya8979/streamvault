package com.mgs.carparking.ui.channelcontent;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.google.android.material.appbar.AppBarLayout;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.FragmentChannelBinding;
import com.mgs.carparking.model.CHANNELVIEWMODEL;
import com.mgs.carparking.widgets.AppBarStateChangeListener;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import me.goldze.mvvmhabit.base.BaseApplication;
import oe.f;
import qe.e;
import qe.g;
import zp.m;
import zp.o;
import zp.r;

/* JADX INFO: loaded from: classes9.dex */
public class ChannelFragment extends BaseActivity<FragmentChannelBinding, CHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f44557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44558u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TypeChannelAdapter f44559v;

    public class a extends AppBarStateChangeListener {
        public a() {
        }

        @Override // com.mgs.carparking.widgets.AppBarStateChangeListener
        public void a(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            if (state == AppBarStateChangeListener.State.EXPANDED) {
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42908n.setText("");
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42905k.setVisibility(8);
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42903i.setVisibility(0);
            } else if (state == AppBarStateChangeListener.State.COLLAPSED) {
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42908n.setText(((CHANNELVIEWMODEL) ChannelFragment.this.f42501p).F());
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42905k.setVisibility(0);
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42903i.setVisibility(8);
            } else {
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42908n.setText("");
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42905k.setVisibility(8);
                ((FragmentChannelBinding) ChannelFragment.this.f42500o).f42903i.setVisibility(0);
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // qe.g
        public void d(@NonNull f fVar) {
            ((CHANNELVIEWMODEL) ChannelFragment.this.f42501p).S(true);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // qe.e
        public void a(@NonNull f fVar) {
            ((CHANNELVIEWMODEL) ChannelFragment.this.f42501p).S(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Void r12) {
        ((FragmentChannelBinding) this.f42500o).f42904j.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Void r22) {
        ((FragmentChannelBinding) this.f42500o).f42904j.s();
        ((CHANNELVIEWMODEL) this.f42501p).f43883m.set(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Void r12) {
        ((FragmentChannelBinding) this.f42500o).f42904j.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(Void r12) {
        ((FragmentChannelBinding) this.f42500o).f42904j.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Void r22) {
        ((FragmentChannelBinding) this.f42500o).f42904j.J(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Integer num) {
        if (num.intValue() - 3 >= 0) {
            ((FragmentChannelBinding) this.f42500o).f42906l.scrollToPosition(num.intValue() - 3);
        }
    }

    public final void F() {
        ((FragmentChannelBinding) this.f42500o).f42904j.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(this);
        ((FragmentChannelBinding) this.f42500o).f42904j.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(this).u(12.0f);
        ((FragmentChannelBinding) this.f42500o).f42904j.L(new b());
        ((FragmentChannelBinding) this.f42500o).f42904j.K(new c());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.fragment_channel;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        this.f44557t = getIntent().getStringExtra("name");
        int intExtra = getIntent().getIntExtra("video_type", 0);
        this.f44558u = intExtra;
        if (intExtra > 0) {
            VM vm2 = this.f42501p;
            ((CHANNELVIEWMODEL) vm2).f43877g = intExtra;
            if (intExtra == 1) {
                ((CHANNELVIEWMODEL) vm2).f43878h.set(r.b().getResources().getString(R.string.text_movie));
            } else if (intExtra == 2) {
                ((CHANNELVIEWMODEL) vm2).f43878h.set(r.b().getResources().getString(R.string.text_tv));
            } else if (intExtra == 4) {
                ((CHANNELVIEWMODEL) vm2).f43878h.set(r.b().getResources().getString(R.string.text_dongman));
            } else if (intExtra == 3) {
                ((CHANNELVIEWMODEL) vm2).f43878h.set(r.b().getResources().getString(R.string.text_zongyi));
            }
        }
        if (!o.b(this.f44557t)) {
            ((CHANNELVIEWMODEL) this.f42501p).f43880j = this.f44557t;
        }
        ((FragmentChannelBinding) this.f42500o).f42896b.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a());
        F();
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((FragmentChannelBinding) this.f42500o).f42901g);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((FragmentChannelBinding) this.f42500o).f42902h);
        TypeChannelAdapter typeChannelAdapter = new TypeChannelAdapter();
        this.f44559v = typeChannelAdapter;
        ((FragmentChannelBinding) this.f42500o).f42906l.setAdapter(typeChannelAdapter);
        ((CHANNELVIEWMODEL) this.f42501p).R();
        ((CHANNELVIEWMODEL) this.f42501p).S(true);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public CHANNELVIEWMODEL initViewModel() {
        return new CHANNELVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((CHANNELVIEWMODEL) this.f42501p).f43892v.observe(this, new Observer() { // from class: lc.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73768b.G((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f42501p).f43889s.observe(this, new Observer() { // from class: lc.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73769b.H((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f42501p).f43891u.observe(this, new Observer() { // from class: lc.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73770b.I((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f42501p).f43890t.observe(this, new Observer() { // from class: lc.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73771b.J((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f42501p).f43893w.observe(this, new Observer() { // from class: lc.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73772b.K((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f42501p).f43894x.observe(this, new Observer() { // from class: lc.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f73773b.L((Integer) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m.d(this);
        m.c(this);
    }
}
