package com.mgs.carparking.ui.homecontent.recommend;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import ed.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import np.e;
import pc.c0;
import pc.g0;
import pc.k0;
import pc.l;
import pc.m;
import pc.m0;
import pc.q0;
import pc.s;
import xl.u;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes11.dex */
public class HomeRecommendMultipleListViewModel extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<Boolean> f44678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<Boolean> f44679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<RecommandVideosEntity> f44680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f44681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f44682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f44683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f44685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<HomeMultipleEntry> f44686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableList<e> f44687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public aq.c<e> f44688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public pp.b f44689u;

    public class a implements aq.d<e> {
        public a() {
        }

        @Override // aq.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(aq.c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_HOME_VIDEO_SLIDE")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_slide);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_HOT")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_hot);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_NEW")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_new);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_ADS")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_ads);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_HISTORY")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_category);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_MULTIPLE")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_multiple);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_GUSSLIKE")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_gusslike);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_GUSSLIKE_TITLE")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_gusslike_title);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_GUSSLIKE_HORIZATION")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_gusslike_horization);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_SPECIAL_LIST")) {
                cVar.f(7, R.layout.item_recommend_multiple_special_list);
            }
        }
    }

    public class b implements u<BaseResponse<List<RecommandVideosEntity>>> {
        public b() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (!baseResponse.isOk()) {
                HomeRecommendMultipleListViewModel.this.f44683o.call();
                return;
            }
            HomeRecommendMultipleListViewModel.o(HomeRecommendMultipleListViewModel.this);
            if (baseResponse.getResult() != null && baseResponse.getResult().size() > 0) {
                for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                    HomeRecommendMultipleListViewModel.this.f44687s.add(new l(HomeRecommendMultipleListViewModel.this, baseResponse.getResult().get(i10), "TYPE_HOME_VIDEO_GUSSLIKE"));
                }
            } else if (HomeRecommendMultipleListViewModel.this.f44675g > 2) {
                HomeRecommendMultipleListViewModel.this.f44682n.call();
            }
            HomeRecommendMultipleListViewModel.this.f44683o.call();
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            HomeRecommendMultipleListViewModel.this.f44683o.call();
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            HomeRecommendMultipleListViewModel.this.b(bVar);
        }
    }

    public class c implements u<BaseResponse<List<HomeMultipleEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f44693c;

        public c(boolean z10, boolean z11) {
            this.f44692b = z10;
            this.f44693c = z11;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<HomeMultipleEntry>> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult().size() <= 0) {
                HomeRecommendMultipleListViewModel.this.f44678j.set(Boolean.FALSE);
                HomeRecommendMultipleListViewModel.this.f44679k.set(Boolean.TRUE);
                return;
            }
            if (this.f44692b) {
                HomeRecommendMultipleListViewModel.this.f44687s.clear();
                HomeRecommendMultipleListViewModel.this.f44681m.call();
            }
            ObservableField<Boolean> observableField = HomeRecommendMultipleListViewModel.this.f44678j;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            HomeRecommendMultipleListViewModel.this.f44679k.set(bool);
            HomeRecommendMultipleListViewModel.this.t(baseResponse.getResult(), false);
            g.f("CACHE_RECOMMEND_LIST", baseResponse.getResult());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            if (!tp.b.a(BaseApplication.getInstance())) {
                p.b(r.b().getResources().getString(R.string.text_toast_nonet));
            }
            HomeRecommendMultipleListViewModel.this.f44681m.call();
            if (HomeRecommendMultipleListViewModel.this.f44686r.size() == 0 && this.f44693c) {
                HomeRecommendMultipleListViewModel.this.f44678j.set(Boolean.FALSE);
                HomeRecommendMultipleListViewModel.this.f44679k.set(Boolean.TRUE);
            }
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            HomeRecommendMultipleListViewModel.this.b(bVar);
        }
    }

    public class d implements u<BaseResponse<List<RecommandVideosEntity>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ObservableList f44695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f44696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f44697d;

        public d(ObservableList observableList, k0 k0Var, int i10) {
            this.f44695b = observableList;
            this.f44696c = k0Var;
            this.f44697d = i10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                return;
            }
            this.f44695b.clear();
            for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                if (i10 == baseResponse.getResult().size() - 1) {
                    this.f44696c.f77214c = this.f44696c.f77214c + baseResponse.getResult().get(i10).getId();
                } else {
                    this.f44696c.f77214c = this.f44696c.f77214c + baseResponse.getResult().get(i10).getId() + StringUtils.COMMA;
                }
                this.f44695b.add(new c0(HomeRecommendMultipleListViewModel.this, baseResponse.getResult().get(i10), this.f44697d));
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
        }
    }

    public HomeRecommendMultipleListViewModel(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44674f = 0;
        this.f44675g = 1;
        this.f44676h = 10;
        this.f44677i = 0;
        this.f44678j = new ObservableField<>(Boolean.TRUE);
        this.f44679k = new ObservableField<>(Boolean.FALSE);
        this.f44680l = new ArrayList();
        this.f44681m = new SingleLiveEvent<>();
        this.f44682n = new SingleLiveEvent<>();
        this.f44683o = new SingleLiveEvent<>();
        this.f44684p = new SingleLiveEvent<>();
        this.f44685q = new SingleLiveEvent<>();
        this.f44686r = new ArrayList();
        this.f44687s = new ObservableArrayList();
        this.f44688t = aq.c.d(new a());
        this.f44689u = new pp.b(new pp.a() { // from class: pc.h
            @Override // pp.a
            public final void call() {
                this.f77203a.u();
            }
        });
    }

    public static /* synthetic */ int o(HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel) {
        int i10 = homeRecommendMultipleListViewModel.f44675g;
        homeRecommendMultipleListViewModel.f44675g = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
        } else {
            if (ed.e.q()) {
                return;
            }
            this.f44679k.set(Boolean.FALSE);
            this.f44678j.set(Boolean.TRUE);
            this.f44687s.clear();
            w(true, true);
        }
    }

    public void r(k0 k0Var, int i10, ObservableList<c0> observableList, String str, int i11) {
        HashMap map = new HashMap();
        map.put("topic_id", Integer.valueOf(i10));
        map.put("psize", 6);
        map.put("not_vod_ids", str);
        ((yb.a) this.f74138b).z(map).e(new hc.l()).e(new hc.c()).c(new d(observableList, k0Var, i11));
    }

    public void s() {
        this.f44685q.call();
    }

    public void t(List<HomeMultipleEntry> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).getType() == 1 && list.get(i10).getBlock_list() != null && list.get(i10).getBlock_list().size() > 0) {
                arrayList.add(new m0(this, list.get(i10).getBlock_list(), list.get(i10).getModule_id(), z10, "TYPE_HOME_VIDEO_SLIDE"));
            } else if (list.get(i10).getType() == 6) {
                arrayList.add(new pc.u(this, list.get(i10), "TYPE_HOME_VIDEO_HOT"));
            } else if (list.get(i10).getType() == 7) {
                arrayList.add(new k0(this, list.get(i10), "TYPE_HOME_VIDEO_NEW"));
            } else if (list.get(i10).getType() == 8) {
                arrayList.add(new g0(this, list.get(i10), "TYPE_HOME_VIDEO_MULTIPLE"));
            } else if (list.get(i10).getType() == 9) {
                arrayList.add(new pc.p(this, list.get(i10), "TYPE_HOME_VIDEO_HISTORY"));
            } else if (list.get(i10).getType() == 11) {
                arrayList.add(new s(this, list.get(i10), "TYPE_HOME_VIDEO_GUSSLIKE_HORIZATION"));
            } else if (list.get(i10).getType() == 10 && list.get(i10).getBlock_list() != null && list.get(i10).getBlock_list().size() > 0) {
                arrayList.add(new q0(this, list.get(i10), "TYPE_HOME_VIDEO_SPECIAL_LIST"));
            }
            if (i10 == 1 && AppApplication.adInfoEntry.getAd_position_15() != null && AppApplication.adInfoEntry.getAd_position_15().size() > 0) {
                arrayList.add(new k0(this, list.get(i10), "TYPE_HOME_VIDEO_ADS"));
            }
        }
        arrayList.add(new m(this, "TYPE_HOME_VIDEO_GUSSLIKE_TITLE"));
        this.f44687s.addAll(arrayList);
        this.f44677i = this.f44687s.size();
        if (z10) {
            return;
        }
        x(true);
    }

    public void v() {
        List<HomeMultipleEntry> listD = g.d("CACHE_RECOMMEND_LIST", HomeMultipleEntry.class);
        this.f44686r = listD;
        if (listD != null && listD.size() > 0) {
            this.f44678j.set(Boolean.FALSE);
            t(this.f44686r, true);
        }
        w(true, true);
    }

    public void w(boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, Integer.valueOf(this.f44674f));
        map.put("psize", 100);
        map.put("pn", 1);
        if (ed.e.j() == 8) {
            map.put("cgi", ed.e.l());
        }
        ((yb.a) this.f74138b).m(map).k(new ed.c0()).e(new hc.l()).e(new hc.c()).c(new c(z10, z11));
    }

    public void x(boolean z10) {
        if (z10) {
            this.f44675g = 1;
        }
        HashMap map = new HashMap();
        map.put("pn", Integer.valueOf(this.f44675g));
        ((yb.a) this.f74138b).t(map).k(new ed.c0()).e(new hc.l()).e(new hc.c()).c(new b());
    }

    public void y(int i10) {
        this.f44674f = i10;
    }
}
