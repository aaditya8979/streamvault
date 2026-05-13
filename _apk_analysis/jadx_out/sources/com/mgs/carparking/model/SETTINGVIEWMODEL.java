package com.mgs.carparking.model;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.ironsource.Z7;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import com.mgs.carparking.ui.web.WebActivity;
import com.safedk.android.utils.Logger;
import ed.l0;
import ed.y;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import pp.b;
import zp.r;

/* JADX INFO: loaded from: classes11.dex */
public class SETTINGVIEWMODEL extends ToolbarViewModel<yb.a> {
    public b A;
    public SingleLiveEvent<Boolean> B;
    public SingleLiveEvent<Boolean> C;
    public b D;
    public b E;
    public b F;
    public b G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f44150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f44151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f44152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f44153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<Void> f44154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f44155t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableField<Boolean> f44156u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f44157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f44158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f44159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f44160y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f44161z;

    public SETTINGVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44150o = new ObservableField<>();
        this.f44151p = new SingleLiveEvent<>();
        this.f44152q = new SingleLiveEvent<>();
        this.f44153r = new ObservableField<>();
        this.f44154s = new SingleLiveEvent<>();
        this.f44155t = new SingleLiveEvent<>();
        Boolean bool = Boolean.FALSE;
        this.f44156u = new ObservableField<>(bool);
        this.f44157v = new b(new pp.a() { // from class: hc.z4
            @Override // pp.a
            public final void call() {
                this.f63484a.x();
            }
        });
        this.f44158w = new b(new pp.a() { // from class: hc.a5
            @Override // pp.a
            public final void call() {
                this.f63141a.y();
            }
        });
        this.f44159x = new b(new pp.a() { // from class: hc.b5
            @Override // pp.a
            public final void call() {
                this.f63147a.z();
            }
        });
        this.f44160y = new b(new pp.a() { // from class: hc.c5
            @Override // pp.a
            public final void call() {
                this.f63170a.A();
            }
        });
        this.f44161z = new b(new pp.a() { // from class: hc.d5
            @Override // pp.a
            public final void call() {
                this.f63182a.B();
            }
        });
        this.A = new b(new pp.a() { // from class: hc.e5
            @Override // pp.a
            public final void call() {
                this.f63190a.C();
            }
        });
        this.B = new SingleLiveEvent<>();
        this.C = new SingleLiveEvent<>();
        this.D = new b(new pp.a() { // from class: hc.f5
            @Override // pp.a
            public final void call() {
                this.f63205a.D();
            }
        });
        this.E = new b(new pp.a() { // from class: hc.g5
            @Override // pp.a
            public final void call() {
                this.f63211a.E();
            }
        });
        this.F = new b(new pp.a() { // from class: hc.h5
            @Override // pp.a
            public final void call() {
                this.f63219a.F();
            }
        });
        this.G = new b(new pp.a() { // from class: hc.i5
            @Override // pp.a
            public final void call() {
                this.f63225a.G();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.text_mine_setting));
        this.f44150o.set(r.b().getResources().getString(R.string.str_now_version) + Z7.f30794r + y.a(application));
        if (l0.B() > 0) {
            this.f44156u.set(Boolean.TRUE);
        } else {
            this.f44156u.set(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.f44152q.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        Bundle bundle = new Bundle();
        bundle.putString("web_title", r.b().getResources().getString(R.string.text_mine_privacy));
        bundle.putString("web_url", l0.b0());
        startActivity(WebActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.dramarush.shortin"));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getApplication(), intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.B.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        this.B.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.C.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.C.postValue(Boolean.TRUE);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f44151p.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.f44154s.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f44155t.call();
    }
}
