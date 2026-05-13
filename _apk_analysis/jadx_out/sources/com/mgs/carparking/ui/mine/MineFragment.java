package com.mgs.carparking.ui.mine;

import a6.m;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.databinding.FragmentMineBinding;
import com.mgs.carparking.model.MINEVIEWMODEL;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.ui.mine.MineFragment;
import com.mgs.carparking.ui.mine.languageswitching.LanguageSwitchingDialog;
import ed.g;
import ed.l0;
import ic.c0;
import ic.d0;
import ic.h0;
import ic.n;
import ic.w;
import java.util.ArrayList;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sd.d;
import ud.c;
import zp.l;
import zp.o;

/* JADX INFO: loaded from: classes6.dex */
public class MineFragment extends BaseFragment<FragmentMineBinding, MINEVIEWMODEL> implements vd.a {
    private d showAdLoadingPop;
    public ArrayList<Object> nulllist = new ArrayList<>();
    private boolean internalChange = false;

    public class a implements LanguageSwitchingDialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LanguageSwitchingDialog f44840a;

        public a(LanguageSwitchingDialog languageSwitchingDialog) {
            this.f44840a = languageSwitchingDialog;
        }

        @Override // com.mgs.carparking.ui.mine.languageswitching.LanguageSwitchingDialog.b
        public void a(String str) {
            l0.X0(1);
            this.f44840a.dismiss();
            MineFragment.this.switchLanguage(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0() {
        this.internalChange = true;
        ((FragmentMineBinding) this.binding).f43045e.setEnabled(true);
        this.internalChange = false;
        this.showAdLoadingPop.f79650d.stop();
        this.showAdLoadingPop.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(CompoundButton compoundButton, boolean z10) {
        if (this.internalChange) {
            return;
        }
        ((FragmentMineBinding) this.binding).f43045e.setEnabled(false);
        m.c("dadqadadadad", "11111111");
        g.f("CACHE_HOME_TITLE_LIST", this.nulllist);
        g.f("CACHE_RANK_TITLE_LIST", this.nulllist);
        if (z10) {
            l0.W0(1);
        } else {
            l0.W0(0);
        }
        if (this.showAdLoadingPop == null) {
            this.showAdLoadingPop = new d(getActivity());
        }
        this.showAdLoadingPop.showAsDropDown(((FragmentMineBinding) this.binding).f43042b);
        this.showAdLoadingPop.f79650d.start();
        op.a.a().b(new w());
        ((FragmentMineBinding) this.binding).f43045e.postDelayed(new Runnable() { // from class: vc.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f86020b.lambda$initViewObservable$0();
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$10(Void r22) {
        if (TextUtils.isEmpty(l0.r())) {
            return;
        }
        try {
            ed.a.a(getContext(), l0.r());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$11(Void r22) {
        LanguageSwitchingDialog languageSwitchingDialog = new LanguageSwitchingDialog(getContext());
        languageSwitchingDialog.e(new a(languageSwitchingDialog));
        languageSwitchingDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Void r72) {
        if (o.b(l0.S())) {
            ((FragmentMineBinding) this.binding).f43042b.setImageResource(R.drawable.ic_avatar_login_default);
        } else {
            c.c(getActivity(), l0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((FragmentMineBinding) this.binding).f43042b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$3(h0 h0Var) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$4(c0 c0Var) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).f44086f.set(Boolean.TRUE);
        ((MINEVIEWMODEL) this.viewModel).f44089i.set(l0.V());
        ((MINEVIEWMODEL) this.viewModel).f44090j.set("ID:" + l0.T());
        if (o.b(l0.S())) {
            ((FragmentMineBinding) this.binding).f43042b.setImageResource(R.drawable.ic_avatar_login_default);
        } else {
            c.c(getActivity(), l0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((FragmentMineBinding) this.binding).f43042b, false);
        }
        ((MINEVIEWMODEL) this.viewModel).P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$5(Void r42) {
        ed.w.a(getActivity(), VideoPlayDetailActivity.class, "", "", 21365);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initViewObservable$6(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$7(n nVar) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).f44092l.set(Boolean.valueOf(nVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$8(ic.m mVar) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).f44089i.set(l0.V());
        if (o.b(l0.S())) {
            ((FragmentMineBinding) this.binding).f43042b.setImageResource(R.drawable.ic_avatar_login_default);
        } else {
            c.c(getActivity(), l0.S(), R.drawable.ic_avatar_default, R.drawable.ic_avatar_default, ((FragmentMineBinding) this.binding).f43042b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$9(d0 d0Var) throws Exception {
        ((MINEVIEWMODEL) this.viewModel).f44086f.set(Boolean.FALSE);
        ((MINEVIEWMODEL) this.viewModel).A("logout");
    }

    @Override // vd.a
    public BaseFragment getFragment() {
        return this;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_mine;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        if (l0.G().equals("none")) {
            ((FragmentMineBinding) this.binding).f43051k.setVisibility(8);
        } else {
            ((FragmentMineBinding) this.binding).f43051k.setVisibility(0);
        }
        ((MINEVIEWMODEL) this.viewModel).P();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public MINEVIEWMODEL initViewModel() {
        return new MINEVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        if (l0.M() == 0) {
            ((FragmentMineBinding) this.binding).f43045e.setChecked(false);
        } else {
            ((FragmentMineBinding) this.binding).f43045e.setChecked(true);
        }
        ((FragmentMineBinding) this.binding).f43045e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vc.q
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                this.f86018a.lambda$initViewObservable$1(compoundButton, z10);
            }
        });
        ((MINEVIEWMODEL) this.viewModel).f44093m.observe(this, new Observer() { // from class: vc.u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86022b.lambda$initViewObservable$2((Void) obj);
            }
        });
        addSubscribe(op.a.a().d(h0.class).subscribe(new dm.g() { // from class: vc.v
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f86023b.lambda$initViewObservable$3((ic.h0) obj);
            }
        }));
        addSubscribe(op.a.a().d(c0.class).subscribe(new dm.g() { // from class: vc.w
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f86024b.lambda$initViewObservable$4((ic.c0) obj);
            }
        }));
        ((MINEVIEWMODEL) this.viewModel).f44096p.observe(this, new Observer() { // from class: vc.x
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86025b.lambda$initViewObservable$5((Void) obj);
            }
        });
        ((MINEVIEWMODEL) this.viewModel).f44095o.observe(this, new Observer() { // from class: vc.y
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MineFragment.lambda$initViewObservable$6((Void) obj);
            }
        });
        addSubscribe(op.a.a().e(n.class).subscribe(new dm.g() { // from class: vc.z
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f86026b.lambda$initViewObservable$7((ic.n) obj);
            }
        }));
        addSubscribe(op.a.a().d(ic.m.class).subscribe(new dm.g() { // from class: vc.a0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85953b.lambda$initViewObservable$8((ic.m) obj);
            }
        }));
        addSubscribe(op.a.a().d(d0.class).subscribe(new dm.g() { // from class: vc.b0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85955b.lambda$initViewObservable$9((ic.d0) obj);
            }
        }));
        ((MINEVIEWMODEL) this.viewModel).f44094n.observe(this, new Observer() { // from class: vc.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86019b.lambda$initViewObservable$10((Void) obj);
            }
        });
        ((MINEVIEWMODEL) this.viewModel).f44101u.observe(this, new Observer() { // from class: vc.t
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86021b.lambda$initViewObservable$11((Void) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.d(getActivity(), false, R.color.color_1b202b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        if (z10) {
            return;
        }
        ((MINEVIEWMODEL) this.viewModel).P();
    }

    public void onMenuItemClick() {
    }

    public void switchLanguage(String str) {
        ArrayList arrayList = new ArrayList();
        g.f("CACHE_HOME_TITLE_LIST", arrayList);
        g.f("CACHE_RANK_TITLE_LIST", arrayList);
        g.f("CACHE_RANK_MODEL_LIST", arrayList);
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(str));
        l0.r0(str);
        ed.c.h("");
    }
}
