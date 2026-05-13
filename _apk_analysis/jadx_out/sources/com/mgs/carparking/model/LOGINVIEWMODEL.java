package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.autofill.HintConstants;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.LoginUserEntity;
import com.mgs.carparking.ui.login.RegisterActivity;
import com.mgs.carparking.ui.mine.feedback.FeedbackActivity;
import com.mgs.carparking.ui.web.WebActivity;
import ed.c;
import ed.l0;
import hc.l;
import ic.c0;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes2.dex */
public class LOGINVIEWMODEL extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f44041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f44042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SingleLiveEvent<Void> f44043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f44044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f44045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f44046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f44047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f44048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f44049n;

    public class a implements u<BaseResponse<LoginUserEntity>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<LoginUserEntity> baseResponse) {
            LOGINVIEWMODEL.this.c();
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
                l0.h1(baseResponse.getResult().getSvip_validity());
                l0.e1(baseResponse.getResult().is_svip());
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
                p.b(baseResponse.getMessage());
                LOGINVIEWMODEL.this.d();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            LOGINVIEWMODEL.this.c();
            p.b(r.b().getResources().getString(R.string.str_login_fail));
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public LOGINVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44041f = new ObservableField<>("");
        this.f44042g = new ObservableField<>("");
        this.f44043h = new SingleLiveEvent<>();
        this.f44044i = new b(new pp.a() { // from class: hc.f3
            @Override // pp.a
            public final void call() {
                this.f63203a.s();
            }
        });
        this.f44045j = new b(new pp.a() { // from class: hc.g3
            @Override // pp.a
            public final void call() {
                this.f63209a.t();
            }
        });
        this.f44046k = new b(new pp.a() { // from class: hc.h3
            @Override // pp.a
            public final void call() {
                this.f63217a.u();
            }
        });
        this.f44047l = new b(new pp.a() { // from class: hc.i3
            @Override // pp.a
            public final void call() {
                this.f63223a.v();
            }
        });
        this.f44048m = new b(new pp.a() { // from class: hc.j3
            @Override // pp.a
            public final void call() {
                this.f63233a.w();
            }
        });
        this.f44049n = new b(new pp.a() { // from class: hc.k3
            @Override // pp.a
            public final void call() {
                this.f63253a.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f44043h.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        startActivity(RegisterActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        Bundle bundle = new Bundle();
        bundle.putInt("flag", 3);
        startActivity(FeedbackActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        Bundle bundle = new Bundle();
        bundle.putString("web_title", r.b().getResources().getString(R.string.text_mine_privacy));
        bundle.putString("web_url", l0.b0());
        startActivity(WebActivity.class, bundle);
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void w() {
        if (o.b(this.f44041f.get())) {
            p.b(r.b().getResources().getString(R.string.str_login_no_account));
            return;
        }
        if (o.b(this.f44042g.get())) {
            p.b(r.b().getResources().getString(R.string.str_login_no_password));
            return;
        }
        j();
        HashMap map = new HashMap();
        map.put("account", this.f44041f.get().trim());
        map.put(HintConstants.AUTOFILL_HINT_PASSWORD, this.f44042g.get().trim());
        ((yb.a) this.f74138b).u(map).k(new ed.c0()).e(new l()).e(new hc.c()).c(new a());
    }
}
