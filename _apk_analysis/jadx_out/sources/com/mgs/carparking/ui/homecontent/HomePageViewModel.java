package com.mgs.carparking.ui.homecontent;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeTitleEntry;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.netbean.MineUserInfo;
import com.mgs.carparking.ui.homecontent.HomePageViewModel;
import com.mgs.carparking.ui.homecontent.videosearch.SearchContentVideoActivity;
import com.mgs.carparking.ui.mine.DownloadActivity;
import com.mgs.carparking.ui.mine.HistoryActivity;
import ed.c;
import ed.c0;
import ed.e;
import ed.g;
import ed.l0;
import hc.l;
import ic.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes3.dex */
public class HomePageViewModel extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<Boolean> f44625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f44626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f44627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SingleLiveEvent<List<HomeTitleEntry>> f44628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<List<HotNewSearchEntry>> f44629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Void> f44630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<HomeTitleEntry> f44631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f44632m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f44633n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f44634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f44635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f44636q;

    public class a implements u<BaseResponse<MineUserInfo>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<MineUserInfo> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            if (baseResponse.getResult().getHas_feedback() == 1) {
                op.a.a().c(new n(true));
            } else {
                op.a.a().c(new n(false));
            }
            if (baseResponse.getResult().is_vip() == 1) {
                l0.F0(true);
            } else {
                l0.F0(false);
            }
            if (baseResponse.getResult().getAge_list() != null && baseResponse.getResult().getAge_list().size() > 0) {
                g.f("CACHE_AGE_LIST", baseResponse.getResult().getAge_list());
            }
            l0.J0(baseResponse.getResult().is_update());
            if (baseResponse.getResult().is_update() == 1) {
                l0.U0(baseResponse.getResult().getSex() == 0 ? "2" : baseResponse.getResult().getSex() == 1 ? "1" : "");
                l0.p0(baseResponse.getResult().getBirthday());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            HomePageViewModel.this.b(bVar);
        }
    }

    public HomePageViewModel(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f44625f = new ObservableField<>(bool);
        this.f44626g = new ObservableField<>(bool);
        this.f44627h = new ObservableField<>(Boolean.TRUE);
        this.f44628i = new SingleLiveEvent<>();
        this.f44629j = new SingleLiveEvent<>();
        this.f44630k = new SingleLiveEvent<>();
        this.f44631l = new ArrayList();
        this.f44632m = new b(new pp.a() { // from class: nc.w
            @Override // pp.a
            public final void call() {
                this.f75834a.z();
            }
        });
        this.f44633n = new b(new pp.a() { // from class: nc.x
            @Override // pp.a
            public final void call() {
                this.f75836a.A();
            }
        });
        this.f44634o = new b(new pp.a() { // from class: nc.y
            @Override // pp.a
            public final void call() {
                this.f75838a.B();
            }
        });
        this.f44635p = new b(new pp.a() { // from class: nc.z
            @Override // pp.a
            public final void call() {
                this.f75845a.C();
            }
        });
        this.f44636q = new b(new pp.a() { // from class: nc.a0
            @Override // pp.a
            public final void call() {
                this.f75744a.D();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.f44630k.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        startActivity(DownloadActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        startActivity(HistoryActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
            return;
        }
        if (e.q()) {
            return;
        }
        this.f44625f.set(Boolean.TRUE);
        this.f44626g.set(Boolean.FALSE);
        if (o.b(l0.R())) {
            c.h("");
        }
        if (o.b(l0.J())) {
            c.j(true);
        }
        F();
        G();
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(BaseResponse baseResponse) throws Exception {
        if (!baseResponse.isOk() || baseResponse.getResult() == null || ((List) baseResponse.getResult()).size() <= 0) {
            this.f44625f.set(Boolean.FALSE);
            ObservableField<Boolean> observableField = this.f44627h;
            Boolean bool = Boolean.TRUE;
            observableField.set(bool);
            this.f44626g.set(bool);
            return;
        }
        ObservableField<Boolean> observableField2 = this.f44625f;
        Boolean bool2 = Boolean.FALSE;
        observableField2.set(bool2);
        this.f44627h.set(bool2);
        this.f44626g.set(bool2);
        this.f44628i.setValue((List) baseResponse.getResult());
        g.f("CACHE_HOME_TITLE_LIST", (List) baseResponse.getResult());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Throwable th2) throws Exception {
        if (this.f44631l.size() == 0) {
            this.f44625f.set(Boolean.FALSE);
            ObservableField<Boolean> observableField = this.f44627h;
            Boolean bool = Boolean.TRUE;
            observableField.set(bool);
            this.f44626g.set(bool);
            return;
        }
        ObservableField<Boolean> observableField2 = this.f44625f;
        Boolean bool2 = Boolean.FALSE;
        observableField2.set(bool2);
        this.f44627h.set(bool2);
        this.f44626g.set(bool2);
        this.f44628i.setValue(this.f44631l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(BaseResponse baseResponse) throws Exception {
        if (baseResponse.isOk()) {
            g.f("CACHE_HOT_SEARCH", (List) baseResponse.getResult());
            this.f44629j.setValue((List) baseResponse.getResult());
        }
    }

    public static /* synthetic */ void y(Throwable th2) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        if (e.q()) {
            return;
        }
        startActivity(SearchContentVideoActivity.class);
    }

    public void E() {
        List<HomeTitleEntry> listD = g.d("CACHE_HOME_TITLE_LIST", HomeTitleEntry.class);
        this.f44631l = listD;
        if (listD == null || listD.size() <= 0) {
            this.f44625f.set(Boolean.TRUE);
            F();
            return;
        }
        ObservableField<Boolean> observableField = this.f44627h;
        Boolean bool = Boolean.FALSE;
        observableField.set(bool);
        this.f44626g.set(bool);
        this.f44628i.setValue(this.f44631l);
    }

    public void F() {
        HashMap map = new HashMap();
        if (e.j() == 5) {
            map.put("cgl", e.l());
        }
        ((yb.a) this.f74138b).e(map).k(new c0()).e(new l()).e(new hc.c()).l(new dm.g() { // from class: nc.b0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f75749b.v((BaseResponse) obj);
            }
        }, new dm.g() { // from class: nc.c0
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f75752b.w((Throwable) obj);
            }
        });
    }

    public void G() {
        b(((yb.a) this.f74138b).H().e(new l()).e(new hc.c()).l(new dm.g() { // from class: nc.u
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f75827b.x((BaseResponse) obj);
            }
        }, new dm.g() { // from class: nc.v
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                HomePageViewModel.y((Throwable) obj);
            }
        }));
    }

    public void H() {
        ((yb.a) this.f74138b).d(new HashMap()).e(new l()).e(new hc.c()).c(new a());
    }
}
