package com.mgs.carparking.ui.homecontent;

import android.app.Application;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import ed.c0;
import ed.g;
import hc.l;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import nc.a1;
import nc.c1;
import nc.g1;
import nc.j0;
import nc.m0;
import nc.s0;
import nc.y0;
import np.e;
import xl.u;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes.dex */
public class HomeContentMultipleListViewModel extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f44602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<Boolean> f44603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<Void> f44604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Void> f44605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<Void> f44606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f44608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<HomeMultipleEntry> f44609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableList<e> f44610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public aq.c<e> f44611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public pp.b f44612r;

    public class a implements aq.d<e> {
        public a() {
        }

        @Override // aq.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(aq.c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_HOME_VIDEO_SLIDE")) {
                cVar.f(7, R.layout.item_home_content_multiple_slide);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_HOT")) {
                cVar.f(7, R.layout.item_home_content_multiple_hot);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_NEW")) {
                cVar.f(7, R.layout.item_home_content_multiple_new);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_ADS")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_ads);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_HISTORY")) {
                cVar.f(7, R.layout.item_home_content_multiple_category);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_CATEGORY_LIST")) {
                cVar.f(7, R.layout.item_home_content_multiple_category_list);
                return;
            }
            if (strValueOf.equals("TYPE_HOME_VIDEO_GALLERY")) {
                cVar.f(7, R.layout.item_home_content_multiple_gallery);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_NO_TITLE")) {
                cVar.f(7, R.layout.item_home_content_multiple_no_title);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_SPECIAL_LIST")) {
                cVar.f(7, R.layout.item_home_content_multiple_special_list);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Handler f44614b;

        public b(Handler handler) {
            this.f44614b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeContentMultipleListViewModel.this.f44602h.set(Boolean.FALSE);
            HomeContentMultipleListViewModel homeContentMultipleListViewModel = HomeContentMultipleListViewModel.this;
            homeContentMultipleListViewModel.t(homeContentMultipleListViewModel.f44609o, true);
            HomeContentMultipleListViewModel.this.w(true, true);
            this.f44614b.removeCallbacksAndMessages(null);
        }
    }

    public class c implements u<BaseResponse<List<HomeMultipleEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f44617c;

        public c(boolean z10, boolean z11) {
            this.f44616b = z10;
            this.f44617c = z11;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<HomeMultipleEntry>> baseResponse) {
            if (baseResponse.isOk()) {
                if (this.f44616b) {
                    HomeContentMultipleListViewModel.this.f44610p.clear();
                    HomeContentMultipleListViewModel.this.f44604j.call();
                }
                ObservableField<Boolean> observableField = HomeContentMultipleListViewModel.this.f44602h;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                HomeContentMultipleListViewModel.this.f44603i.set(bool);
                HomeContentMultipleListViewModel.q(HomeContentMultipleListViewModel.this);
                if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                    if (HomeContentMultipleListViewModel.this.f44601g == 2) {
                        HomeContentMultipleListViewModel.this.f44603i.set(Boolean.TRUE);
                        HomeContentMultipleListViewModel.this.f44602h.set(bool);
                    }
                    if (HomeContentMultipleListViewModel.this.f44601g >= 2) {
                        HomeContentMultipleListViewModel.this.f44605k.call();
                    }
                } else {
                    HomeContentMultipleListViewModel.this.t(baseResponse.getResult(), false);
                    if (HomeContentMultipleListViewModel.this.f44601g == 2) {
                        g.f("CACHE_HOME_MODEL_LIST_" + HomeContentMultipleListViewModel.this.f44600f, baseResponse.getResult());
                    }
                }
                HomeContentMultipleListViewModel.this.f44606l.call();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            if (HomeContentMultipleListViewModel.this.f44601g == 1) {
                HomeContentMultipleListViewModel.this.f44604j.call();
            }
            if (HomeContentMultipleListViewModel.this.f44601g == 1 && HomeContentMultipleListViewModel.this.f44609o.size() > 0 && this.f44617c) {
                HomeContentMultipleListViewModel.this.f44601g = 2;
            }
            HomeContentMultipleListViewModel.this.f44606l.call();
            if (HomeContentMultipleListViewModel.this.f44601g == 1 && HomeContentMultipleListViewModel.this.f44609o.size() == 0 && HomeContentMultipleListViewModel.this.f44610p.size() == 0) {
                HomeContentMultipleListViewModel.this.f44602h.set(Boolean.FALSE);
                HomeContentMultipleListViewModel.this.f44603i.set(Boolean.TRUE);
            }
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            HomeContentMultipleListViewModel.this.b(bVar);
        }
    }

    public class d implements u<BaseResponse<List<RecommandVideosEntity>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ObservableList f44619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0 f44620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f44621d;

        public d(ObservableList observableList, y0 y0Var, int i10) {
            this.f44619b = observableList;
            this.f44620c = y0Var;
            this.f44621d = i10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                return;
            }
            this.f44619b.clear();
            this.f44620c.f75839c = "";
            for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                if (i10 == baseResponse.getResult().size() - 1) {
                    this.f44620c.f75839c = this.f44620c.f75839c + baseResponse.getResult().get(i10).getId();
                } else {
                    this.f44620c.f75839c = this.f44620c.f75839c + baseResponse.getResult().get(i10).getId() + StringUtils.COMMA;
                }
                this.f44619b.add(new s0(HomeContentMultipleListViewModel.this, baseResponse.getResult().get(i10), this.f44621d));
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            HomeContentMultipleListViewModel.this.b(bVar);
        }
    }

    public HomeContentMultipleListViewModel(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44600f = 0;
        this.f44601g = 1;
        this.f44602h = new ObservableField<>(Boolean.TRUE);
        this.f44603i = new ObservableField<>(Boolean.FALSE);
        this.f44604j = new SingleLiveEvent<>();
        this.f44605k = new SingleLiveEvent<>();
        this.f44606l = new SingleLiveEvent<>();
        this.f44607m = new SingleLiveEvent<>();
        this.f44608n = new SingleLiveEvent<>();
        this.f44609o = new ArrayList();
        this.f44610p = new ObservableArrayList();
        this.f44611q = aq.c.d(new a());
        this.f44612r = new pp.b(new pp.a() { // from class: nc.o
            @Override // pp.a
            public final void call() {
                this.f75798a.u();
            }
        });
    }

    public static /* synthetic */ int q(HomeContentMultipleListViewModel homeContentMultipleListViewModel) {
        int i10 = homeContentMultipleListViewModel.f44601g;
        homeContentMultipleListViewModel.f44601g = i10 + 1;
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
            this.f44610p.clear();
            this.f44603i.set(Boolean.FALSE);
            this.f44602h.set(Boolean.TRUE);
            w(true, false);
        }
    }

    public void s(y0 y0Var, int i10, ObservableList<s0> observableList, String str, int i11) {
        HashMap map = new HashMap();
        map.put("topic_id", Integer.valueOf(i10));
        map.put("psize", 6);
        map.put("not_vod_ids", str);
        ((yb.a) this.f74138b).z(map).k(new c0()).e(new l()).e(new hc.c()).c(new d(observableList, y0Var, i11));
    }

    public void t(List<HomeMultipleEntry> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).getType() == 1 && list.get(i10).getBlock_list() != null && list.get(i10).getBlock_list().size() > 0) {
                arrayList.add(new c1(this, list.get(i10).getBlock_list(), list.get(i10).getModule_id(), z10, "TYPE_HOME_VIDEO_SLIDE"));
            } else if (list.get(i10).getType() == 10 && list.get(i10).getBlock_list() != null && list.get(i10).getBlock_list().size() > 0) {
                arrayList.add(new g1(this, list.get(i10), "TYPE_HOME_VIDEO_SPECIAL_LIST", this.f44600f));
            } else if (list.get(i10).getType() == 7 && list.get(i10).is_title() == 0) {
                arrayList.add(new a1(this, list.get(i10), "TYPE_HOME_VIDEO_NO_TITLE"));
            } else if (list.get(i10).getType() == 6) {
                arrayList.add(new m0(this, list.get(i10), "TYPE_HOME_VIDEO_HOT"));
            } else if (list.get(i10).getType() == 7 && list.get(i10).is_title() == 1) {
                arrayList.add(new y0(this, list.get(i10), "TYPE_HOME_VIDEO_NEW"));
            } else if (list.get(i10).getType() == 9) {
                arrayList.add(new j0(this, list.get(i10), "TYPE_HOME_VIDEO_HISTORY"));
            }
            if (i10 == 1 && AppApplication.adInfoEntry.getAd_position_15() != null && AppApplication.adInfoEntry.getAd_position_15().size() > 0) {
                arrayList.add(new m0(this, list.get(i10), "TYPE_HOME_VIDEO_ADS"));
            }
        }
        this.f44610p.addAll(arrayList);
    }

    public void v(Handler handler) {
        List<HomeMultipleEntry> listD = g.d("CACHE_HOME_MODEL_LIST_" + this.f44600f, HomeMultipleEntry.class);
        this.f44609o = listD;
        if (listD == null || listD.size() <= 0) {
            w(true, false);
        } else {
            this.f44601g = 2;
            handler.postDelayed(new b(handler), 500L);
        }
    }

    public void w(boolean z10, boolean z11) {
        if (z10) {
            this.f44601g = 1;
        }
        HashMap map = new HashMap();
        map.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, Integer.valueOf(this.f44600f));
        map.put("pn", Integer.valueOf(this.f44601g));
        if (ed.e.j() == 8) {
            map.put("cgi", ed.e.l());
        }
        ((yb.a) this.f74138b).m(map).k(new c0()).e(new l()).e(new hc.c()).c(new c(z10, z11));
    }

    public void x(int i10) {
        this.f44600f = i10;
    }
}
