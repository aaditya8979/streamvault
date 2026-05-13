package com.mgs.carparking.model;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableList;
import aq.c;
import aq.d;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoBean;
import dm.o;
import ed.c0;
import hc.k2;
import hc.l;
import hc.m2;
import hc.p2;
import hc.t2;
import hc.w1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import np.e;
import xl.u;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes3.dex */
public class HOMECONTENTSEARCHLISTVIEWMODEL extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableBoolean f44019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableBoolean f44020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableBoolean f44021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableBoolean f44022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<Void> f44023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<Void> f44024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<Void> f44025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f44026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f44027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<VideoBean> f44029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableList<e> f44032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c<e> f44033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableList<w1> f44034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c<w1> f44035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public pp.b f44036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public pp.b f44037y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public pp.b f44038z;

    public class a implements d<e> {
        public a() {
        }

        @Override // aq.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_SEARCH_VIDEO_MOVIE")) {
                cVar.f(7, R.layout.item_home_content_search_movie);
                return;
            }
            if (strValueOf.equals("TYPE_SEARCH_VIDEO_TV")) {
                cVar.f(7, R.layout.item_home_content_search_tv);
                return;
            }
            if (strValueOf.equals("TYPE_SEARCH_VIDEO_VARIETY")) {
                cVar.f(7, R.layout.item_home_content_search_variety);
            } else if (strValueOf.equals("TYPE_SEARCH_VIDEO_COMIC")) {
                cVar.f(7, R.layout.item_home_content_search_comic);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_ADS")) {
                cVar.f(7, R.layout.item_video_search_ads);
            }
        }
    }

    public class b implements u<BaseResponse<List<e>>> {
        public b() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<e>> baseResponse) {
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f44020h.set(false);
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f44021i.set(false);
            if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                HOMECONTENTSEARCHLISTVIEWMODEL.this.f44025m.call();
                if (HOMECONTENTSEARCHLISTVIEWMODEL.this.f44018f == 2) {
                    HOMECONTENTSEARCHLISTVIEWMODEL.this.f44019g.set(true);
                } else {
                    HOMECONTENTSEARCHLISTVIEWMODEL.this.f44019g.set(false);
                }
            } else {
                HOMECONTENTSEARCHLISTVIEWMODEL.this.f44019g.set(false);
                HOMECONTENTSEARCHLISTVIEWMODEL.this.f44032t.addAll(baseResponse.getResult());
                if (HOMECONTENTSEARCHLISTVIEWMODEL.this.f44032t.size() <= 4 && baseResponse.getResult().size() < 20) {
                    HOMECONTENTSEARCHLISTVIEWMODEL.this.f44022j.set(true);
                }
            }
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f44026n.call();
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            Log.i("wangyi", "失败数据为：" + th2.toString());
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f44032t.clear();
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f44019g.set(false);
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f44020h.set(true);
            HOMECONTENTSEARCHLISTVIEWMODEL.this.f44021i.set(false);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            HOMECONTENTSEARCHLISTVIEWMODEL.this.b(bVar);
        }
    }

    public HOMECONTENTSEARCHLISTVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44018f = 1;
        this.f44019g = new ObservableBoolean(false);
        this.f44020h = new ObservableBoolean(false);
        this.f44021i = new ObservableBoolean(true);
        this.f44022j = new ObservableBoolean(false);
        this.f44023k = new SingleLiveEvent<>();
        this.f44024l = new SingleLiveEvent<>();
        this.f44025m = new SingleLiveEvent<>();
        this.f44026n = new SingleLiveEvent<>();
        this.f44027o = new SingleLiveEvent<>();
        this.f44028p = new SingleLiveEvent<>();
        this.f44029q = new SingleLiveEvent<>();
        this.f44030r = new SingleLiveEvent<>();
        this.f44031s = new SingleLiveEvent<>();
        this.f44032t = new ObservableArrayList();
        this.f44033u = c.d(new a());
        this.f44034v = new ObservableArrayList();
        this.f44035w = c.d(new d() { // from class: hc.k0
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_home_content_search_recommend_list);
            }
        });
        this.f44036x = new pp.b(new pp.a() { // from class: hc.l0
            @Override // pp.a
            public final void call() {
                this.f63257a.u();
            }
        });
        this.f44037y = new pp.b(new pp.a() { // from class: hc.m0
            @Override // pp.a
            public final void call() {
                this.f63267a.v();
            }
        });
        this.f44038z = new pp.b(new pp.a() { // from class: hc.n0
            @Override // pp.a
            public final void call() {
                this.f63285a.w();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BaseResponse s(boolean z10, String str, BaseResponse baseResponse) throws Exception {
        BaseResponse baseResponse2 = new BaseResponse();
        if (baseResponse.isOk()) {
            if (z10) {
                this.f44032t.clear();
                this.f44024l.call();
            }
            ArrayList arrayList = new ArrayList();
            if (baseResponse.getResult() != null && ((List) baseResponse.getResult()).size() > 0) {
                for (int i10 = 0; i10 < ((List) baseResponse.getResult()).size(); i10++) {
                    if (i10 == 2 && AppApplication.adInfoEntry.getAd_position_20() != null && AppApplication.adInfoEntry.getAd_position_20().size() > 0 && AppApplication.adInfoEntry.getAd_position_20() != null && AppApplication.adInfoEntry.getAd_position_20().size() > 0) {
                        arrayList.add(new m2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(0), "TYPE_HOME_VIDEO_ADS", str));
                    }
                    if (((RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10)).getType_pid() == 1) {
                        arrayList.add(new m2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10), "TYPE_SEARCH_VIDEO_MOVIE", str));
                    } else if (((RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10)).getType_pid() == 2) {
                        arrayList.add(new p2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10), "TYPE_SEARCH_VIDEO_TV", str));
                    } else if (((RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10)).getType_pid() == 3) {
                        arrayList.add(new t2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10), "TYPE_SEARCH_VIDEO_VARIETY", str));
                    } else if (((RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10)).getType_pid() == 4) {
                        arrayList.add(new k2(this, (RecommandVideosEntity) ((List) baseResponse.getResult()).get(i10), "TYPE_SEARCH_VIDEO_COMIC", str));
                    }
                }
            }
            this.f44018f++;
            baseResponse2.setResult(arrayList);
        }
        return baseResponse2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
        } else {
            if (ed.e.q()) {
                return;
            }
            this.f44020h.set(false);
            this.f44021i.set(true);
            this.f44027o.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f44023k.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f44022j.set(false);
    }

    public void x(final boolean z10, int i10, final String str) {
        if (this.f44018f == 2 && !this.f44022j.get()) {
            this.f44022j.set(true);
        }
        if (z10) {
            this.f44018f = 1;
        }
        HashMap map = new HashMap();
        map.put("kw", str);
        if (i10 != 0) {
            map.put(VideoCollectionEntry.TYPE_PID, Integer.valueOf(i10));
        }
        map.put("pn", Integer.valueOf(this.f44018f));
        if (ed.e.j() == 15) {
            map.put("sr", ed.e.l());
        }
        ((yb.a) this.f74138b).n(map).k(new c0()).e(new l()).e(new hc.c()).h(new o() { // from class: hc.j0
            @Override // dm.o
            public final Object apply(Object obj) {
                return this.f63228b.s(z10, str, (BaseResponse) obj);
            }
        }).c(new b());
    }
}
