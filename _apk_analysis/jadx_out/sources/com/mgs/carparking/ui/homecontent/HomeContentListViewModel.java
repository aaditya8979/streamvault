package com.mgs.carparking.ui.homecontent;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import aq.c;
import aq.d;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HomeVideoPageEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentListViewModel;
import dm.g;
import hc.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import nc.e0;
import pp.b;
import xl.u;

/* JADX INFO: loaded from: classes11.dex */
public class HomeContentListViewModel extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<Boolean> f44578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<Boolean> f44579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<List<RecommandVideosEntity>> f44580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<Void> f44581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f44582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f44583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableList<e0> f44585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c<e0> f44586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b<e0> f44587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f44588s;

    public class a implements u<BaseResponse<HomeVideoPageEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44589b;

        public a(boolean z10) {
            this.f44589b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<HomeVideoPageEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (this.f44589b) {
                    HomeContentListViewModel.this.f44581l.call();
                }
                ObservableField<Boolean> observableField = HomeContentListViewModel.this.f44578i;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                HomeContentListViewModel.this.f44579j.set(bool);
                HomeContentListViewModel.this.f44576g = baseResponse.getResult().getPageNum() + 1;
                if (!baseResponse.getResult().isHasNextPage()) {
                    HomeContentListViewModel.this.f44582m.call();
                }
                if (baseResponse.getResult().getList() != null && baseResponse.getResult().getList().size() > 0) {
                    Iterator<RecommandVideosEntity> it = baseResponse.getResult().getList().iterator();
                    while (it.hasNext()) {
                        HomeContentListViewModel.this.f44585p.add(new e0(HomeContentListViewModel.this, it.next()));
                    }
                }
                HomeContentListViewModel.this.f44583n.call();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            HomeContentListViewModel.this.f44583n.call();
            HomeContentListViewModel.this.f44578i.set(Boolean.FALSE);
            HomeContentListViewModel.this.f44579j.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public HomeContentListViewModel(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44575f = 0;
        this.f44576g = 1;
        this.f44577h = 20;
        this.f44578i = new ObservableField<>(Boolean.TRUE);
        this.f44579j = new ObservableField<>(Boolean.FALSE);
        this.f44580k = new SingleLiveEvent<>();
        this.f44581l = new SingleLiveEvent<>();
        this.f44582m = new SingleLiveEvent<>();
        this.f44583n = new SingleLiveEvent<>();
        this.f44584o = new SingleLiveEvent<>();
        this.f44585p = new ObservableArrayList();
        this.f44586q = c.d(new d() { // from class: nc.h
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_list);
            }
        });
        this.f44587r = new b<>(new pp.c() { // from class: nc.i
            @Override // pp.c
            public final void call(Object obj) {
                this.f75779a.u((e0) obj);
            }
        });
        this.f44588s = new b(new pp.a() { // from class: nc.j
            @Override // pp.a
            public final void call() {
                this.f75781a.v();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(BaseResponse baseResponse) throws Exception {
        if (baseResponse.getResult() == null || ((List) baseResponse.getResult()).size() <= 0) {
            return;
        }
        this.f44580k.setValue((List) baseResponse.getResult());
    }

    public static /* synthetic */ void s(Throwable th2) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        this.f44584o.postValue(e0Var.f75762b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        x();
        w(true);
    }

    public void w(boolean z10) {
        if (z10) {
            this.f44576g = 1;
            this.f44585p.clear();
        }
        HashMap map = new HashMap();
        map.put("videoType", Integer.valueOf(this.f44575f));
        map.put("curPage", Integer.valueOf(this.f44576g));
        map.put("pageSize", Integer.valueOf(this.f44577h));
        ((yb.a) this.f74138b).W(map).e(new l()).e(new hc.c()).c(new a(z10));
    }

    public void x() {
        HashMap map = new HashMap();
        map.put("videoType", Integer.valueOf(this.f44575f));
        b(((yb.a) this.f74138b).X(map).e(new l()).e(new hc.c()).l(new g() { // from class: nc.f
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f75768b.r((BaseResponse) obj);
            }
        }, new g() { // from class: nc.g
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                HomeContentListViewModel.s((Throwable) obj);
            }
        }));
    }

    public void y(int i10) {
        this.f44575f = i10;
    }
}
