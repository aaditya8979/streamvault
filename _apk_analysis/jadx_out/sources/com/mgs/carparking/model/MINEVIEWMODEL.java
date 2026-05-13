package com.mgs.carparking.model;

import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.model.MINEVIEWMODEL;
import com.mgs.carparking.netbean.MineUserInfo;
import com.mgs.carparking.netbean.UserDeviceEntity;
import com.mgs.carparking.ui.login.LoginActivity;
import com.mgs.carparking.ui.mine.DownloadActivity;
import com.mgs.carparking.ui.mine.EditMineActivity;
import com.mgs.carparking.ui.mine.HistoryActivity;
import com.mgs.carparking.ui.mine.OrderListActivity;
import com.mgs.carparking.ui.mine.SettingActivity;
import com.mgs.carparking.ui.mine.collection.CollectionActivity;
import com.mgs.carparking.ui.mine.feedback.FeedbackActivity;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.mgs.carparking.ui.web.GameActivity;
import com.mgs.carparking.ui.web.WebActivity;
import com.vungle.ads.internal.signals.SignalManager;
import ed.c;
import ed.c0;
import ed.e;
import ed.g0;
import ed.l0;
import hc.l;
import java.text.ParseException;
import java.util.HashMap;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import xl.u;
import zp.d;
import zp.k;
import zp.o;
import zp.r;

/* JADX INFO: loaded from: classes10.dex */
public class MINEVIEWMODEL extends BaseViewModel<yb.a> {
    public pp.b A;
    public pp.b B;
    public pp.b C;
    public pp.b D;
    public pp.b E;
    public pp.b F;
    public pp.b G;
    public pp.b H;
    public pp.b I;
    public pp.b J;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<Boolean> f44086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f44087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f44088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f44089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f44090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f44091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f44092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f44093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f44094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f44095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f44096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f44097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f44098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f44099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<String> f44100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f44101u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableField<Boolean> f44102v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public pp.b f44103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public pp.b f44104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public pp.b f44105y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public pp.b f44106z;

    public class a implements u<BaseResponse<MineUserInfo>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<MineUserInfo> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            ObservableField<String> observableField = MINEVIEWMODEL.this.f44098r;
            Resources resources = r.b().getResources();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(baseResponse.getResult().getInvited_count());
            String str = "";
            sb2.append("");
            observableField.set(resources.getString(R.string.str_sharenum, sb2.toString()));
            if (baseResponse.getResult().is_vip() == 0) {
                MINEVIEWMODEL.this.f44099s.set(r.b().getResources().getString(R.string.str_mine_share_tips1));
            } else {
                MINEVIEWMODEL.this.f44099s.set(r.b().getResources().getString(R.string.str_mine_no_ad_time) + d.b(Long.valueOf(baseResponse.getResult().getVip_validity() * 1000)));
            }
            l0.h1(baseResponse.getResult().getSvip_validity());
            if (baseResponse.getResult().is_svip() == 1) {
                MINEVIEWMODEL.this.f44091k.set(r.b().getResources().getString(R.string.str_expires_on) + d.b(Long.valueOf(baseResponse.getResult().getSvip_validity() * 1000)));
                ObservableField<Boolean> observableField2 = MINEVIEWMODEL.this.f44088h;
                Boolean bool = Boolean.TRUE;
                observableField2.set(bool);
                MINEVIEWMODEL.this.f44087g.set(bool);
            } else if (baseResponse.getResult().is_vip() == 1) {
                MINEVIEWMODEL.this.f44091k.set(r.b().getResources().getString(R.string.str_expires_on) + d.b(Long.valueOf(baseResponse.getResult().getVip_validity() * 1000)));
                ObservableField<Boolean> observableField3 = MINEVIEWMODEL.this.f44088h;
                Boolean bool2 = Boolean.TRUE;
                observableField3.set(bool2);
                MINEVIEWMODEL.this.f44087g.set(bool2);
            } else {
                MINEVIEWMODEL.this.f44091k.set(r.b().getResources().getString(R.string.str_not_opened));
                ObservableField<Boolean> observableField4 = MINEVIEWMODEL.this.f44088h;
                Boolean bool3 = Boolean.FALSE;
                observableField4.set(bool3);
                MINEVIEWMODEL.this.f44087g.set(bool3);
            }
            if (baseResponse.getResult().is_vip() == 1) {
                l0.F0(true);
            } else {
                l0.F0(false);
            }
            l0.e1(baseResponse.getResult().is_svip());
            l0.b1(baseResponse.getResult().is_update());
            if (baseResponse.getResult().is_update() == 1) {
                if (baseResponse.getResult().getSex() == 0) {
                    str = "2";
                } else if (baseResponse.getResult().getSex() == 1) {
                    str = "1";
                }
                l0.U0(str);
                l0.p0(baseResponse.getResult().getBirthday());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            MINEVIEWMODEL.this.c();
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            MINEVIEWMODEL.this.b(bVar);
        }
    }

    public class b implements u<BaseResponse<UserDeviceEntity>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44108b;

        public b(String str) {
            this.f44108b = str;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<UserDeviceEntity> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            if (baseResponse.getResult().getUser_info() != null) {
                l0.h1(baseResponse.getResult().getUser_info().getSvip_validity());
                l0.e1(baseResponse.getResult().getUser_info().is_vip());
                l0.d1(baseResponse.getResult().getUser_info().getUser_id());
                l0.a1(baseResponse.getResult().getUser_info().getToken());
                l0.K0(baseResponse.getResult().getUser_info().getLogin_type());
                if (o.b(l0.t()) && !o.b(baseResponse.getResult().getUser_info().getCreate_time())) {
                    l0.z0(baseResponse.getResult().getUser_info().getCreate_time());
                    try {
                        if (System.currentTimeMillis() - d.a(baseResponse.getResult().getUser_info().getCreate_time()) > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                            l0.V0(1);
                        } else {
                            l0.V0(0);
                        }
                    } catch (ParseException e10) {
                        e10.printStackTrace();
                    }
                }
                try {
                    if (System.currentTimeMillis() - d.a(baseResponse.getResult().getUser_info().getCreate_time()) > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                        l0.l0(1);
                    }
                } catch (ParseException e11) {
                    e11.printStackTrace();
                }
            }
            MINEVIEWMODEL.this.P();
            if (baseResponse.getResult().getSys_conf() != null) {
                if (baseResponse.getResult().getSys_conf() != null && baseResponse.getResult().getSys_conf().getApi_conf() != null) {
                    AppApplication.apiList = baseResponse.getResult().getSys_conf().getApi_conf();
                    k.i(r.b()).p("CACHE_DOMAIN_LIST", baseResponse.getResult().getSys_conf().getApi_conf());
                }
                if (!o.b(baseResponse.getResult().getSys_conf().getApi_url2()) && !l0.p().equals(baseResponse.getResult().getSys_conf().getApi_url2())) {
                    l0.u0(baseResponse.getResult().getSys_conf().getApi_url2());
                    RetrofitUrlManager.getInstance().setGlobalDomain(baseResponse.getResult().getSys_conf().getApi_url2());
                }
                l0.I0(baseResponse.getResult().getSys_conf().is_projection());
                l0.k1(baseResponse.getResult().getSys_conf().getWebsite());
                l0.L0(baseResponse.getResult().getSys_conf().getMax_view_num());
                l0.o0(baseResponse.getResult().getSys_conf().getAd_view_time() * 1000);
                l0.g0(baseResponse.getResult().getSys_conf().getShow_ad_time() * 1000);
                l0.Z0(baseResponse.getResult().getSys_conf().getToday_view_ad());
                l0.h0(baseResponse.getResult().getSys_conf().getAd_download_num());
                if (!o.b(baseResponse.getResult().getSys_conf().getHide_ad())) {
                    l0.n0(Integer.parseInt(baseResponse.getResult().getSys_conf().getHide_ad()));
                }
                l0.C0(baseResponse.getResult().getSys_conf().getFeedback_tags());
                if (!o.b(baseResponse.getResult().getSys_conf().getVod_feedback_tags())) {
                    l0.j1(baseResponse.getResult().getSys_conf().getVod_feedback_tags());
                }
                if (baseResponse.getResult().getSys_conf().getShow_open_screen_ad_time() > 0) {
                    l0.l1(baseResponse.getResult().getSys_conf().getShow_open_screen_ad_time());
                }
                l0.m1(baseResponse.getResult().getSys_conf().getPrivacy_url());
                c.g(1);
                c.f(2);
                if (TextUtils.isEmpty(this.f44108b) || !this.f44108b.equals("logout")) {
                    return;
                }
                c.b(true);
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            Log.i("wangyi", "错误为：" + th2.toString());
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public MINEVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f44086f = new ObservableField<>(bool);
        this.f44087g = new ObservableField<>(bool);
        this.f44088h = new ObservableField<>(bool);
        this.f44089i = new ObservableField<>();
        this.f44090j = new ObservableField<>();
        this.f44091k = new ObservableField<>();
        this.f44092l = new ObservableField<>(bool);
        this.f44093m = new SingleLiveEvent<>();
        this.f44094n = new SingleLiveEvent<>();
        this.f44095o = new SingleLiveEvent<>();
        this.f44096p = new SingleLiveEvent<>();
        this.f44097q = new ObservableField<>(bool);
        this.f44098r = new ObservableField<>(r.b().getResources().getString(R.string.str_sharenum, "0"));
        this.f44099s = new ObservableField<>(r.b().getResources().getString(R.string.str_mine_share_tips1));
        this.f44100t = new ObservableField<>("分享可得终身免广告特权>");
        this.f44101u = new SingleLiveEvent<>();
        this.f44102v = new ObservableField<>(bool);
        this.f44103w = new pp.b(new pp.a() { // from class: hc.x3
            @Override // pp.a
            public final void call() {
                this.f63434a.B();
            }
        });
        this.f44104x = new pp.b(new pp.a() { // from class: hc.g4
            @Override // pp.a
            public final void call() {
                this.f63210a.C();
            }
        });
        this.f44105y = new pp.b(new pp.a() { // from class: hc.h4
            @Override // pp.a
            public final void call() {
                this.f63218a.H();
            }
        });
        this.f44106z = new pp.b(new pp.a() { // from class: hc.i4
            @Override // pp.a
            public final void call() {
                this.f63224a.I();
            }
        });
        this.A = new pp.b(new pp.a() { // from class: hc.j4
            @Override // pp.a
            public final void call() {
                this.f63234a.J();
            }
        });
        this.B = new pp.b(new pp.a() { // from class: hc.k4
            @Override // pp.a
            public final void call() {
                this.f63254a.K();
            }
        });
        this.C = new pp.b(new pp.a() { // from class: hc.y3
            @Override // pp.a
            public final void call() {
                this.f63476a.L();
            }
        });
        this.D = new pp.b(new pp.a() { // from class: hc.z3
            @Override // pp.a
            public final void call() {
                this.f63483a.M();
            }
        });
        this.E = new pp.b(new pp.a() { // from class: hc.a4
            @Override // pp.a
            public final void call() {
                this.f63140a.N();
            }
        });
        this.F = new pp.b(new pp.a() { // from class: hc.b4
            @Override // pp.a
            public final void call() {
                this.f63146a.O();
            }
        });
        this.G = new pp.b(new pp.a() { // from class: hc.c4
            @Override // pp.a
            public final void call() {
                this.f63169a.D();
            }
        });
        this.H = new pp.b(new pp.a() { // from class: hc.d4
            @Override // pp.a
            public final void call() {
                this.f63181a.E();
            }
        });
        this.I = new pp.b(new pp.a() { // from class: hc.e4
            @Override // pp.a
            public final void call() {
                MINEVIEWMODEL.F();
            }
        });
        this.J = new pp.b(new pp.a() { // from class: hc.f4
            @Override // pp.a
            public final void call() {
                this.f63204a.G();
            }
        });
        if (l0.B() > 0) {
            this.f44086f.set(Boolean.TRUE);
        } else {
            this.f44086f.set(bool);
        }
        this.f44102v.set(Boolean.valueOf(g0.f61064a.d(true)));
        this.f44089i.set(l0.V());
        this.f44090j.set(r.b().getResources().getString(R.string.str_oferta) + " (ID:" + l0.T() + ")");
        if (l0.W() == 0 || l0.U() != 1) {
            this.f44091k.set(r.b().getResources().getString(R.string.str_not_opened));
            this.f44088h.set(bool);
        } else {
            this.f44091k.set(r.b().getResources().getString(R.string.str_expires_on) + d.b(Long.valueOf(l0.W() * 1000)));
            this.f44088h.set(Boolean.TRUE);
        }
        this.f44087g.set(Boolean.valueOf(l0.U() == 1));
        this.f44093m.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        startActivity(DownloadActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        startActivity(ExtensionShareActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f44101u.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        startActivity(LoginActivity.class);
    }

    public static /* synthetic */ void F() {
        e.c(l0.T() + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        startActivity(EditMineActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        Bundle bundle = new Bundle();
        bundle.putString("web_url", l0.G() + "?vod_id=0&collection=0");
        bundle.putString("web_title", r.b().getResources().getString(R.string.str_vipweb_title));
        startActivity(WebActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        Bundle bundle = new Bundle();
        bundle.putInt("flag", 2);
        startActivity(FeedbackActivity.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        startActivity(HistoryActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        startActivity(OrderListActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        startActivity(CollectionActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        startActivity(SettingActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        if (o.c(l0.F()) || l0.F().equals("none")) {
            return;
        }
        startActivity(GameActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.f44094n.call();
    }

    public void A(String str) {
        HashMap map = new HashMap();
        if (!str.equals("logout")) {
            map.put("invited_by", str);
        }
        map.put("is_install", e.p() ? "1" : "0");
        tb.a.a().I(map).k(new c0()).e(new l()).e(new hc.c()).c(new b(str));
    }

    public void P() {
        ((yb.a) this.f74138b).d(new HashMap()).k(new c0()).e(new l()).e(new hc.c()).c(new a());
    }
}
