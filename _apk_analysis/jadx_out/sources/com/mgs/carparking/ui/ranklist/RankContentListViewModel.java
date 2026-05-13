package com.mgs.carparking.ui.ranklist;

import ad.f;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import aq.c;
import aq.d;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.VideoLookHistoryDao;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.netbean.RankVideoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import ed.c0;
import ed.g;
import hc.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import np.e;
import xl.u;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes10.dex */
public class RankContentListViewModel extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<Boolean> f44918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f44919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f44920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f44921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f44922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f44923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f44924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f44925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<RecommandVideosEntity> f44926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VideoLookHistoryEntry f44927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableList<e> f44928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c<e> f44929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public pp.b f44930w;

    public class a implements d<e> {
        public a() {
        }

        @Override // aq.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_RANK_VIDEO_NEXT")) {
                cVar.f(7, R.layout.item_rank_content_multiple_next);
            } else if (strValueOf.equals("TYPE_HOME_VIDEO_ADS")) {
                cVar.f(7, R.layout.item_home_recommend_multiple_ads);
            }
        }
    }

    public class b implements u<BaseResponse<RankVideoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f44933c;

        public b(boolean z10, boolean z11) {
            this.f44932b = z10;
            this.f44933c = z11;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RankVideoEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (this.f44932b) {
                    RankContentListViewModel.this.f44928u.clear();
                    RankContentListViewModel.this.f44922o.call();
                }
                RankContentListViewModel.o(RankContentListViewModel.this);
                if (baseResponse.getResult() == null) {
                    ObservableField<Boolean> observableField = RankContentListViewModel.this.f44918k;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    RankContentListViewModel.this.f44920m.set(Boolean.TRUE);
                    RankContentListViewModel.this.f44919l.set(bool);
                    return;
                }
                if (baseResponse.getResult().getVod_list() == null || baseResponse.getResult().getVod_list().size() <= 0) {
                    if (RankContentListViewModel.this.f44914g == 2) {
                        RankContentListViewModel.this.f44919l.set(Boolean.TRUE);
                        ObservableField<Boolean> observableField2 = RankContentListViewModel.this.f44918k;
                        Boolean bool2 = Boolean.FALSE;
                        observableField2.set(bool2);
                        RankContentListViewModel.this.f44920m.set(bool2);
                    }
                    if (RankContentListViewModel.this.f44914g >= 2) {
                        RankContentListViewModel.this.f44923p.call();
                    }
                } else {
                    ObservableField<Boolean> observableField3 = RankContentListViewModel.this.f44918k;
                    Boolean bool3 = Boolean.FALSE;
                    observableField3.set(bool3);
                    RankContentListViewModel.this.f44920m.set(bool3);
                    RankContentListViewModel.this.f44919l.set(bool3);
                    RankContentListViewModel.this.r(baseResponse.getResult().getVod_list(), this.f44932b);
                    if (RankContentListViewModel.this.f44914g == 2) {
                        g.e();
                        g.f("CACHE_RANK_MODEL_LIST_" + RankContentListViewModel.this.f44913f, baseResponse.getResult().getVod_list());
                    }
                }
                RankContentListViewModel.this.f44924q.call();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            if (RankContentListViewModel.this.f44914g == 1) {
                RankContentListViewModel.this.f44922o.call();
            }
            RankContentListViewModel.this.f44924q.call();
            if (RankContentListViewModel.this.f44914g == 1 && RankContentListViewModel.this.f44926s.size() == 0 && this.f44933c) {
                ObservableField<Boolean> observableField = RankContentListViewModel.this.f44918k;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                RankContentListViewModel.this.f44920m.set(Boolean.TRUE);
                RankContentListViewModel.this.f44919l.set(bool);
            }
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            RankContentListViewModel.this.b(bVar);
        }
    }

    public RankContentListViewModel(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44913f = 1;
        this.f44914g = 1;
        this.f44915h = 20;
        this.f44916i = 0;
        this.f44917j = 0;
        this.f44918k = new ObservableField<>(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.f44919l = new ObservableField<>(bool);
        this.f44920m = new ObservableField<>(bool);
        this.f44921n = new SingleLiveEvent<>();
        this.f44922o = new SingleLiveEvent<>();
        this.f44923p = new SingleLiveEvent<>();
        this.f44924q = new SingleLiveEvent<>();
        this.f44925r = new SingleLiveEvent<>();
        this.f44926s = new ArrayList();
        this.f44928u = new ObservableArrayList();
        this.f44929v = c.d(new a());
        this.f44930w = new pp.b(new pp.a() { // from class: ad.l
            @Override // pp.a
            public final void call() {
                this.f3746a.s();
            }
        });
    }

    public static /* synthetic */ int o(RankContentListViewModel rankContentListViewModel) {
        int i10 = rankContentListViewModel.f44914g;
        rankContentListViewModel.f44914g = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
        } else {
            if (ed.e.q()) {
                return;
            }
            this.f44920m.set(Boolean.FALSE);
            this.f44918k.set(Boolean.TRUE);
            u(true, true);
        }
    }

    public void r(List<RecommandVideosEntity> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (z10) {
            this.f44916i = 0;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f44916i++;
            ArrayList<VideoLookHistoryEntry> arrayListQueryItemHistory = VideoLookHistoryDao.getInstance().queryItemHistory(list.get(i10).getId());
            if (arrayListQueryItemHistory == null || arrayListQueryItemHistory.size() <= 0) {
                this.f44927t = null;
            } else {
                this.f44927t = arrayListQueryItemHistory.get(0);
            }
            arrayList.add(new f(this, list.get(i10), "TYPE_RANK_VIDEO_NEXT", this.f44914g - 1, i10, list.size(), this.f44927t));
            if (this.f44916i == 8 && AppApplication.adInfoEntry.getAd_position_24() != null && AppApplication.adInfoEntry.getAd_position_24().size() > 0) {
                arrayList.add(new ad.d(this, list, "TYPE_HOME_VIDEO_ADS"));
            }
        }
        this.f44928u.addAll(arrayList);
    }

    public void t() {
        List<RecommandVideosEntity> listD = g.d("CACHE_RANK_MODEL_LIST_" + this.f44913f, RecommandVideosEntity.class);
        this.f44926s = listD;
        if (listD == null || listD.size() <= 0) {
            u(true, true);
            return;
        }
        if (g.c() && tp.b.a(BaseApplication.getInstance())) {
            u(true, true);
            return;
        }
        this.f44914g = 2;
        this.f44918k.set(Boolean.FALSE);
        r(this.f44926s, true);
    }

    public void u(boolean z10, boolean z11) {
        if (z10) {
            this.f44914g = 1;
        }
        HashMap map = new HashMap();
        map.put("pn", Integer.valueOf(this.f44914g));
        map.put("topic_id", Integer.valueOf(this.f44913f));
        map.put("pid", Integer.valueOf(this.f44917j));
        ((yb.a) this.f74138b).M(map).e(new l()).e(new hc.c()).k(new c0()).c(new b(z10, z11));
    }

    public void v(int i10, int i11) {
        this.f44917j = i10;
        this.f44913f = i11;
    }
}
