package com.mgs.carparking.model;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import aq.c;
import aq.d;
import com.dramarush.shortin.R;
import com.mgs.carparking.db.SpecialCollectionDao;
import com.mgs.carparking.dbtable.SpecialCollectionEntry;
import com.mgs.carparking.netbean.CollectionVideoEntry;
import com.mgs.carparking.netbean.RankVideoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import ed.c0;
import ed.e;
import hc.l;
import hc.w2;
import ic.a0;
import java.util.HashMap;
import java.util.Iterator;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import xl.u;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes2.dex */
public class SPECIALDETAILNEWVIEWMODEL extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f44164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f44165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f44166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f44167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Drawable> f44168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f44169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f44170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f44171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f44172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f44173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<Integer> f44174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<Void> f44175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f44176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f44177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableList<w2> f44178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c<w2> f44179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public pp.b f44180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public pp.b f44181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public pp.b f44182z;

    public class a implements u<BaseResponse<RankVideoEntry>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44183b;

        public a(boolean z10) {
            this.f44183b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RankVideoEntry> baseResponse) {
            if (baseResponse.isOk()) {
                ObservableField<Boolean> observableField = SPECIALDETAILNEWVIEWMODEL.this.f44171o;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                SPECIALDETAILNEWVIEWMODEL.this.f44170n.set(bool);
                if (this.f44183b) {
                    SPECIALDETAILNEWVIEWMODEL.this.f44178v.clear();
                    SPECIALDETAILNEWVIEWMODEL.this.f44175s.call();
                }
                SPECIALDETAILNEWVIEWMODEL.r(SPECIALDETAILNEWVIEWMODEL.this);
                if (baseResponse.getResult() != null) {
                    if (SpecialCollectionDao.getInstance().isExist(baseResponse.getResult().getId())) {
                        SPECIALDETAILNEWVIEWMODEL.this.f44169m.set(Boolean.TRUE);
                        SPECIALDETAILNEWVIEWMODEL.this.f44168l.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_special_collection));
                    } else {
                        SPECIALDETAILNEWVIEWMODEL.this.f44169m.set(bool);
                        SPECIALDETAILNEWVIEWMODEL.this.f44168l.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_special_uncollection));
                    }
                    if (SPECIALDETAILNEWVIEWMODEL.this.f44162f == 2) {
                        SPECIALDETAILNEWVIEWMODEL.this.f44164h.set(baseResponse.getResult().getName());
                        SPECIALDETAILNEWVIEWMODEL.this.f44165i.set(baseResponse.getResult().getIcon());
                        SPECIALDETAILNEWVIEWMODEL.this.f44166j.set(baseResponse.getResult().getContent());
                        SPECIALDETAILNEWVIEWMODEL.this.f44167k.set(baseResponse.getResult().getUser_num() + "人已经收藏");
                    }
                    if (baseResponse.getResult().getVod_list() == null || baseResponse.getResult().getVod_list().size() <= 0) {
                        if (SPECIALDETAILNEWVIEWMODEL.this.f44162f == 2) {
                            SPECIALDETAILNEWVIEWMODEL.this.f44172p.set(Boolean.TRUE);
                        }
                        if (SPECIALDETAILNEWVIEWMODEL.this.f44162f >= 2) {
                            SPECIALDETAILNEWVIEWMODEL.this.f44176t.call();
                        }
                    } else {
                        Iterator<RecommandVideosEntity> it = baseResponse.getResult().getVod_list().iterator();
                        while (it.hasNext()) {
                            SPECIALDETAILNEWVIEWMODEL.this.f44178v.add(new w2(SPECIALDETAILNEWVIEWMODEL.this, it.next()));
                        }
                    }
                    SPECIALDETAILNEWVIEWMODEL.this.f44177u.call();
                }
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            SPECIALDETAILNEWVIEWMODEL.this.f44177u.call();
            ObservableField<Boolean> observableField = SPECIALDETAILNEWVIEWMODEL.this.f44172p;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            SPECIALDETAILNEWVIEWMODEL.this.f44171o.set(bool);
            SPECIALDETAILNEWVIEWMODEL.this.f44170n.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            SPECIALDETAILNEWVIEWMODEL.this.b(bVar);
        }
    }

    public class b implements u<BaseResponse<CollectionVideoEntry>> {
        public b() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<CollectionVideoEntry> baseResponse) {
            if (!baseResponse.isOk() || baseResponse.getResult() == null) {
                return;
            }
            SpecialCollectionEntry specialCollectionEntry = new SpecialCollectionEntry();
            specialCollectionEntry.setId(baseResponse.getResult().getTopic_id());
            SpecialCollectionDao.getInstance().insert(specialCollectionEntry);
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            SPECIALDETAILNEWVIEWMODEL.this.b(bVar);
        }
    }

    public SPECIALDETAILNEWVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44162f = 1;
        this.f44163g = 0;
        this.f44164h = new ObservableField<>();
        this.f44165i = new ObservableField<>();
        this.f44166j = new ObservableField<>();
        this.f44167k = new ObservableField<>();
        this.f44168l = new ObservableField<>();
        this.f44169m = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f44170n = new ObservableField<>(bool);
        this.f44171o = new ObservableField<>(Boolean.TRUE);
        this.f44172p = new ObservableField<>(bool);
        this.f44173q = new SingleLiveEvent<>();
        this.f44174r = new SingleLiveEvent<>();
        this.f44175s = new SingleLiveEvent<>();
        this.f44176t = new SingleLiveEvent<>();
        this.f44177u = new SingleLiveEvent<>();
        this.f44178v = new ObservableArrayList();
        this.f44179w = c.d(new d() { // from class: hc.j5
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_special_detail_new_item_result);
            }
        });
        this.f44180x = new pp.b(new pp.a() { // from class: hc.k5
            @Override // pp.a
            public final void call() {
                this.f63255a.u();
            }
        });
        this.f44181y = new pp.b(new pp.a() { // from class: hc.l5
            @Override // pp.a
            public final void call() {
                this.f63264a.v();
            }
        });
        this.f44182z = new pp.b(new pp.a() { // from class: hc.m5
            @Override // pp.a
            public final void call() {
                this.f63282a.w();
            }
        });
    }

    public static /* synthetic */ int r(SPECIALDETAILNEWVIEWMODEL specialdetailnewviewmodel) {
        int i10 = specialdetailnewviewmodel.f44162f;
        specialdetailnewviewmodel.f44162f = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
        } else {
            if (e.q()) {
                return;
            }
            this.f44170n.set(Boolean.FALSE);
            this.f44171o.set(Boolean.TRUE);
            this.f44173q.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        if (this.f44169m.get().booleanValue()) {
            p.b("请至我的页面取消收藏");
            return;
        }
        this.f44169m.set(Boolean.TRUE);
        this.f44174r.setValue(1);
        this.f44168l.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_special_collection));
    }

    public void x(int i10, boolean z10) {
        if (z10) {
            this.f44162f = 1;
        }
        HashMap map = new HashMap();
        map.put("topic_id", Integer.valueOf(i10));
        map.put("pn", Integer.valueOf(this.f44162f));
        ((yb.a) this.f74138b).r(map).k(new c0()).e(new l()).e(new hc.c()).c(new a(z10));
    }

    public void y(RecommandVideosEntity recommandVideosEntity) {
        if (e.q()) {
            return;
        }
        if (this.f44163g == 1) {
            op.a.a().b(new a0(recommandVideosEntity.getId()));
            d();
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("id", recommandVideosEntity.getId());
            startActivity(VideoPlayDetailActivity.class, bundle);
        }
    }

    public void z(int i10) {
        HashMap map = new HashMap();
        map.put("topic_id", Integer.valueOf(i10));
        ((yb.a) this.f74138b).g(map).e(new l()).e(new hc.c()).c(new b());
    }
}
