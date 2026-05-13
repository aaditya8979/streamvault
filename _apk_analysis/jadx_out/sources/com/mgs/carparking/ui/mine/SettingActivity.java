package com.mgs.carparking.ui.mine;

import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivitySettingBinding;
import com.mgs.carparking.databinding.DialogSearchCacheClearBinding;
import com.mgs.carparking.databinding.DialogSettingLogoutBinding;
import com.mgs.carparking.model.SETTINGVIEWMODEL;
import ed.e;
import ed.h;
import ed.l0;
import ic.d0;
import me.goldze.mvvmhabit.base.BaseApplication;
import op.a;
import tp.b;
import vc.j0;
import zp.n;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes3.dex */
public class SettingActivity extends BaseActivity<ActivitySettingBinding, SETTINGVIEWMODEL> implements View.OnClickListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DialogSearchCacheClearBinding f44842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DialogSettingLogoutBinding f44843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Dialog f44844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Dialog f44845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f44846x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f44847y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f44848z = 0;
    public long[] A = new long[4];

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Void r12) {
        toggleClearHistoryDialog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Boolean bool) {
        if (bool.booleanValue()) {
            try {
                h.a(this);
                ((SETTINGVIEWMODEL) this.f42501p).f44153r.set(h.e(this) + "");
                p.b(r.b().getResources().getString(R.string.str_success));
            } catch (Exception unused) {
            }
        }
        Dialog dialog = this.f44844v;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Void r12) {
        toggleLogoutDialog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Boolean bool) {
        if (!bool.booleanValue()) {
            Dialog dialog = this.f44845w;
            if (dialog != null) {
                dialog.dismiss();
                return;
            }
            return;
        }
        if (!b.a(this)) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
            return;
        }
        ((SETTINGVIEWMODEL) this.f42501p).f44156u.set(Boolean.FALSE);
        l0.K0(0);
        l0.d1(0);
        l0.h1(0L);
        l0.e1(0);
        l0.f1("");
        l0.a1("");
        a.a().b(new d0());
        Dialog dialog2 = this.f44845w;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Void r32) {
        if (e.r(1000L)) {
            new j0().H(this, this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Void r12) {
        t();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_setting;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        this.f44846x = e.f(BaseApplication.getInstance());
        if (l0.X() > 0) {
            this.f44848z = l0.X() / 1000;
        }
        DialogSearchCacheClearBinding dialogSearchCacheClearBinding = (DialogSearchCacheClearBinding) DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.dialog_search_cache_clear, null, false);
        this.f44842t = dialogSearchCacheClearBinding;
        dialogSearchCacheClearBinding.b((SETTINGVIEWMODEL) this.f42501p);
        DialogSettingLogoutBinding dialogSettingLogoutBinding = (DialogSettingLogoutBinding) DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.dialog_setting_logout, null, false);
        this.f44843u = dialogSettingLogoutBinding;
        dialogSettingLogoutBinding.b((SETTINGVIEWMODEL) this.f42501p);
        try {
            ((SETTINGVIEWMODEL) this.f42501p).f44153r.set(h.e(this) + "");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public SETTINGVIEWMODEL initViewModel() {
        return new SETTINGVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((SETTINGVIEWMODEL) this.f42501p).f44151p.observe(this, new Observer() { // from class: vc.d0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f85958b.u((Void) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f42501p).B.observe(this, new Observer() { // from class: vc.e0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f85960b.v((Boolean) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f42501p).f44152q.observe(this, new Observer() { // from class: vc.f0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f85962b.w((Void) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f42501p).C.observe(this, new Observer() { // from class: vc.g0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f85964b.x((Boolean) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f42501p).f44154s.observe(this, new Observer() { // from class: vc.h0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f85966b.y((Void) obj);
            }
        });
        ((SETTINGVIEWMODEL) this.f42501p).f44155t.observe(this, new Observer() { // from class: vc.i0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f85968b.z((Void) obj);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f44844v != null) {
            this.f44844v = null;
        }
        if (this.f44845w != null) {
            this.f44845w = null;
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    public final void t() {
        long[] jArr = this.A;
        System.arraycopy(jArr, 1, jArr, 0, jArr.length - 1);
        long[] jArr2 = this.A;
        jArr2[jArr2.length - 1] = SystemClock.uptimeMillis();
        if (this.A[0] >= SystemClock.uptimeMillis() - 3000) {
            this.A = new long[4];
            p.b("channel：" + this.f44846x);
        }
    }

    public void toggleClearHistoryDialog(boolean z10) {
        if (z10) {
            if (this.f44844v == null) {
                this.f44844v = sd.h.a(this, this.f44842t.getRoot(), true);
            }
            this.f44844v.show();
        } else {
            Dialog dialog = this.f44844v;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public void toggleLogoutDialog(boolean z10) {
        if (z10) {
            if (this.f44845w == null) {
                this.f44845w = sd.h.a(this, this.f44843u.getRoot(), true);
            }
            this.f44845w.show();
        } else {
            Dialog dialog = this.f44845w;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }
}
