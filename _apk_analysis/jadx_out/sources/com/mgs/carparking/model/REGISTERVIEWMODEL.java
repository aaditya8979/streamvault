package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.autofill.HintConstants;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RegisterEntity;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ed.c;
import ed.e;
import ed.l0;
import hc.l;
import ic.c0;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes2.dex */
public class REGISTERVIEWMODEL extends ToolbarViewModel<yb.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f44116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f44117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f44118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f44119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f44120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f44121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f44122u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f44123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f44124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f44125x;

    public class a implements u<BaseResponse<RegisterEntity>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RegisterEntity> baseResponse) {
            REGISTERVIEWMODEL.this.c();
            if (!baseResponse.isOk()) {
                p.b(baseResponse.getMessage());
                return;
            }
            if (baseResponse.getResult() != null) {
                if (baseResponse.getResult().getUser_id() > 0) {
                    l0.d1(baseResponse.getResult().getUser_id());
                }
                if (!o.b(baseResponse.getResult().getAccount())) {
                    l0.f1(baseResponse.getResult().getAccount());
                }
                if (!o.b(baseResponse.getResult().getNickname())) {
                    l0.g1(baseResponse.getResult().getNickname());
                }
                if (!o.b(baseResponse.getResult().getHead_img())) {
                    l0.c1(baseResponse.getResult().getHead_img());
                }
                if (!o.b(baseResponse.getResult().getToken())) {
                    l0.a1(baseResponse.getResult().getToken());
                }
                l0.K0(1);
                l0.z0("");
                c.h("");
                op.a.a().b(new c0());
                REGISTERVIEWMODEL.this.d();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            REGISTERVIEWMODEL.this.c();
            p.b(r.b().getResources().getString(R.string.str_register_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public REGISTERVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44116o = new SingleLiveEvent<>();
        this.f44117p = new SingleLiveEvent<>();
        this.f44118q = new ObservableField<>("");
        this.f44119r = new ObservableField<>("");
        this.f44120s = new ObservableField<>("");
        this.f44121t = new SingleLiveEvent<>();
        this.f44122u = new b(new pp.a() { // from class: hc.m4
            @Override // pp.a
            public final void call() {
                this.f63281a.r();
            }
        });
        this.f44123v = new b(new pp.a() { // from class: hc.n4
            @Override // pp.a
            public final void call() {
                this.f63287a.s();
            }
        });
        this.f44124w = new b(new pp.a() { // from class: hc.o4
            @Override // pp.a
            public final void call() {
                this.f63301a.t();
            }
        });
        this.f44125x = new b(new pp.a() { // from class: hc.p4
            @Override // pp.a
            public final void call() {
                this.f63327a.u();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.text_register_register));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f44116o.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f44117p.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f44121t.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        d();
    }

    public void v() {
        if (o.b(this.f44118q.get())) {
            p.b(r.b().getResources().getString(R.string.str_login_no_account));
            return;
        }
        if (o.b(this.f44119r.get()) || o.b(this.f44120s.get())) {
            p.b(r.b().getResources().getString(R.string.str_login_no_password));
            return;
        }
        if (this.f44118q.get().length() < 6) {
            p.b(r.b().getResources().getString(R.string.str_login_account_not6));
            return;
        }
        if (this.f44119r.get().length() < 6) {
            p.b(r.b().getResources().getString(R.string.str_login_password_not6));
            return;
        }
        if (!e.s(this.f44118q.get())) {
            p.b(r.b().getResources().getString(R.string.str_login_account_type_err));
            return;
        }
        if (!e.s(this.f44119r.get())) {
            p.b(r.b().getResources().getString(R.string.str_login_password_type_err));
            return;
        }
        if (!this.f44119r.get().equals(this.f44120s.get())) {
            p.b(r.b().getResources().getString(R.string.str_login_password_err_two));
            return;
        }
        j();
        HashMap map = new HashMap();
        map.put("account", this.f44118q.get().trim());
        map.put(HintConstants.AUTOFILL_HINT_PASSWORD, this.f44119r.get().trim());
        ((yb.a) this.f74138b).C(map).k(new ed.c0()).e(new l()).e(new hc.c()).c(new a());
    }
}
