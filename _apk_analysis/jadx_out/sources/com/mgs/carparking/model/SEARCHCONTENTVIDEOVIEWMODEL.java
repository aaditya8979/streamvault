package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import aq.c;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.netbean.SearchExtendEntry;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import ed.g;
import hc.f2;
import hc.h2;
import hc.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.o;
import zp.r;

/* JADX INFO: loaded from: classes10.dex */
public class SEARCHCONTENTVIDEOVIEWMODEL extends BaseViewModel<yb.a> {
    public b A;
    public b B;
    public b C;
    public b D;
    public b<String> E;
    public b F;
    public ObservableList<h2> G;
    public c<h2> H;
    public ObservableList<f2> I;
    public c<f2> J;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HotNewSearchEntry f44127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f44128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f44129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableBoolean f44130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableBoolean f44131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableBoolean f44132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableBoolean f44133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f44134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f44135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<String> f44136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f44137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<String> f44138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<Void> f44139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<String> f44140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f44141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f44142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableField<Boolean> f44143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SingleLiveEvent<Void> f44144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f44145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f44146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f44147z;

    public class a implements u<BaseResponse<List<SearchExtendEntry>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44148b;

        public a(String str) {
            this.f44148b = str;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<SearchExtendEntry>> baseResponse) {
            if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                SEARCHCONTENTVIDEOVIEWMODEL.this.I.clear();
                SEARCHCONTENTVIDEOVIEWMODEL.this.f44135n.set(Boolean.TRUE);
                return;
            }
            SEARCHCONTENTVIDEOVIEWMODEL.this.f44135n.set(Boolean.FALSE);
            SEARCHCONTENTVIDEOVIEWMODEL.this.I.clear();
            for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel = SEARCHCONTENTVIDEOVIEWMODEL.this;
                searchcontentvideoviewmodel.I.add(new f2(searchcontentvideoviewmodel, baseResponse.getResult().get(i10).getVod_name(), this.f44148b));
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            SEARCHCONTENTVIDEOVIEWMODEL.this.b(bVar);
        }
    }

    public SEARCHCONTENTVIDEOVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44128g = new ObservableField<>(r.b().getResources().getString(R.string.text_cannel));
        this.f44129h = new ObservableField<>("");
        this.f44130i = new ObservableBoolean(true);
        this.f44131j = new ObservableBoolean();
        this.f44132k = new ObservableBoolean(true);
        this.f44133l = new ObservableBoolean(false);
        Boolean bool = Boolean.FALSE;
        this.f44134m = new ObservableField<>(bool);
        this.f44135n = new ObservableField<>(bool);
        this.f44136o = new ObservableField<>("");
        this.f44137p = new SingleLiveEvent<>();
        this.f44138q = new SingleLiveEvent<>();
        this.f44139r = new SingleLiveEvent<>();
        this.f44140s = new SingleLiveEvent<>();
        this.f44141t = new SingleLiveEvent<>();
        this.f44142u = new SingleLiveEvent<>();
        this.f44143v = new ObservableField<>(bool);
        this.f44144w = new SingleLiveEvent<>();
        this.f44145x = new b(new pp.a() { // from class: hc.q4
            @Override // pp.a
            public final void call() {
                this.f63340a.v();
            }
        });
        this.f44146y = new b(new pp.a() { // from class: hc.r4
            @Override // pp.a
            public final void call() {
                this.f63347a.w();
            }
        });
        this.f44147z = new b(new pp.a() { // from class: hc.s4
            @Override // pp.a
            public final void call() {
                this.f63362a.x();
            }
        });
        this.A = new b(new pp.a() { // from class: hc.t4
            @Override // pp.a
            public final void call() {
                this.f63387a.y();
            }
        });
        this.B = new b(new pp.a() { // from class: hc.u4
            @Override // pp.a
            public final void call() {
                this.f63400a.z();
            }
        });
        this.C = new b(new pp.a() { // from class: hc.v4
            @Override // pp.a
            public final void call() {
                this.f63411a.A();
            }
        });
        this.D = new b(new pp.a() { // from class: hc.w4
            @Override // pp.a
            public final void call() {
                this.f63426a.B();
            }
        });
        this.E = new b<>(new pp.c() { // from class: hc.x4
            @Override // pp.c
            public final void call(Object obj) {
                this.f63435a.C((String) obj);
            }
        });
        this.F = new b(new pp.a() { // from class: hc.y4
            @Override // pp.a
            public final void call() {
                this.f63477a.D();
            }
        });
        this.G = new ObservableArrayList();
        this.H = c.c(7, R.layout.item_home_search_hot_search);
        this.I = new ObservableArrayList();
        this.J = c.c(7, R.layout.item_search_extend_list);
        this.f44131j.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        if (this.f44128g.get().equals(r.b().getResources().getString(R.string.text_cannel))) {
            d();
            return;
        }
        if (o.b(this.f44129h.get())) {
            return;
        }
        this.f44136o.set(this.f44129h.get());
        this.f44139r.call();
        this.f44138q.setValue(this.f44129h.get());
        this.f44140s.setValue(this.f44129h.get());
        this.f44137p.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        if (o.b(this.f44129h.get())) {
            return;
        }
        this.f44136o.set(this.f44129h.get());
        this.f44139r.call();
        this.f44138q.setValue(this.f44129h.get());
        this.f44140s.setValue(this.f44129h.get());
        this.f44137p.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(String str) {
        if (o.b(str)) {
            this.f44133l.set(false);
            this.f44132k.set(true);
            this.f44136o.set("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f44139r.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f44141t.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f44141t.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f44142u.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        if (this.f44127f != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", this.f44127f.getVod_id());
            startActivity(VideoPlayDetailActivity.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        d();
    }

    public void E() {
        ArrayList arrayList = new ArrayList();
        List<HotNewSearchEntry> listD = g.d("CACHE_HOT_SEARCH", HotNewSearchEntry.class);
        if (listD == null || listD.size() <= 0) {
            return;
        }
        this.G.clear();
        for (HotNewSearchEntry hotNewSearchEntry : listD) {
            if (!o.b(hotNewSearchEntry.getPic())) {
                arrayList.add(hotNewSearchEntry);
            }
            this.G.add(new h2(this, hotNewSearchEntry));
        }
        this.f44144w.call();
    }

    public void F(String str) {
        HashMap map = new HashMap();
        map.put("kw", str);
        ((yb.a) this.f74138b).q(map).e(new l()).e(new hc.c()).c(new a(str));
    }
}
