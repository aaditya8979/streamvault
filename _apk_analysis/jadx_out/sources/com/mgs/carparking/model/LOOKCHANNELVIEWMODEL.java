package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import aq.c;
import aq.d;
import com.dramarush.shortin.R;
import com.ironsource.Z7;
import com.mgs.carparking.netbean.ChannnelFilterEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.ui.homecontent.videosearch.SearchContentVideoActivity;
import ed.c0;
import ed.e;
import hc.a2;
import hc.c2;
import hc.l;
import hc.y1;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes2.dex */
public class LOOKCHANNELVIEWMODEL extends BaseViewModel<yb.a> {
    public c<a2> A;
    public ObservableList<c2> B;
    public c<c2> C;
    public ObservableList<c2> D;
    public c<c2> E;
    public ObservableList<c2> F;
    public c<c2> G;
    public ObservableList<c2> H;
    public c<c2> I;
    public pp.b J;
    public pp.b K;
    public pp.b L;
    public pp.b M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f44054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f44055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f44056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f44057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f44058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f44059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f44060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f44061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f44062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<Void> f44063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<Void> f44064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f44065t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f44066u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SingleLiveEvent<Integer> f44067v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SingleLiveEvent<Void> f44068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ObservableList<y1> f44069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c<y1> f44070y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ObservableList<a2> f44071z;

    public class a implements u<BaseResponse<List<ChannnelFilterEntry>>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<ChannnelFilterEntry>> baseResponse) {
            ObservableField<Boolean> observableField = LOOKCHANNELVIEWMODEL.this.f44058m;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            LOOKCHANNELVIEWMODEL.this.f44059n.set(bool);
            if (baseResponse.getResult() != null && baseResponse.getResult().size() != 0) {
                LOOKCHANNELVIEWMODEL.this.F(baseResponse.getResult());
            } else {
                LOOKCHANNELVIEWMODEL.this.f44059n.set(bool);
                LOOKCHANNELVIEWMODEL.this.f44058m.set(Boolean.TRUE);
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            LOOKCHANNELVIEWMODEL.this.f44059n.set(Boolean.FALSE);
            LOOKCHANNELVIEWMODEL.this.f44058m.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            LOOKCHANNELVIEWMODEL.this.b(bVar);
        }
    }

    public class b implements u<BaseResponse<List<RecommandVideosEntity>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44073b;

        public b(boolean z10) {
            this.f44073b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (!baseResponse.isOk()) {
                LOOKCHANNELVIEWMODEL.this.f44062q.call();
                LOOKCHANNELVIEWMODEL.this.f44061p.set(Boolean.TRUE);
                ObservableField<Boolean> observableField = LOOKCHANNELVIEWMODEL.this.f44059n;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                LOOKCHANNELVIEWMODEL.this.f44058m.set(bool);
                LOOKCHANNELVIEWMODEL.this.f44060o.set(bool);
                return;
            }
            if (baseResponse.getResult() != null) {
                if (LOOKCHANNELVIEWMODEL.this.f44051f == 1) {
                    LOOKCHANNELVIEWMODEL.this.f44069x.clear();
                }
                if (this.f44073b) {
                    LOOKCHANNELVIEWMODEL.this.f44062q.call();
                }
                ObservableField<Boolean> observableField2 = LOOKCHANNELVIEWMODEL.this.f44060o;
                Boolean bool2 = Boolean.FALSE;
                observableField2.set(bool2);
                LOOKCHANNELVIEWMODEL.this.f44058m.set(bool2);
                if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                    if (LOOKCHANNELVIEWMODEL.this.f44051f == 1) {
                        LOOKCHANNELVIEWMODEL.this.f44060o.set(bool2);
                        LOOKCHANNELVIEWMODEL.this.f44061p.set(Boolean.TRUE);
                    }
                    LOOKCHANNELVIEWMODEL.this.f44063r.call();
                } else {
                    LOOKCHANNELVIEWMODEL.this.f44061p.set(bool2);
                    for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                        LOOKCHANNELVIEWMODEL.this.f44069x.add(new y1(LOOKCHANNELVIEWMODEL.this, baseResponse.getResult().get(i10)));
                    }
                }
                LOOKCHANNELVIEWMODEL.y(LOOKCHANNELVIEWMODEL.this);
                LOOKCHANNELVIEWMODEL.this.f44064s.call();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            ObservableField<Boolean> observableField = LOOKCHANNELVIEWMODEL.this.f44061p;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            LOOKCHANNELVIEWMODEL.this.f44059n.set(bool);
            LOOKCHANNELVIEWMODEL.this.f44058m.set(Boolean.TRUE);
            LOOKCHANNELVIEWMODEL.this.f44060o.set(bool);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            LOOKCHANNELVIEWMODEL.this.b(bVar);
        }
    }

    public LOOKCHANNELVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44051f = 1;
        this.f44052g = 1;
        this.f44053h = "";
        this.f44054i = "";
        this.f44055j = "";
        this.f44056k = "";
        Boolean bool = Boolean.TRUE;
        this.f44057l = new ObservableField<>(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f44058m = new ObservableField<>(bool2);
        this.f44059n = new ObservableField<>(bool);
        this.f44060o = new ObservableField<>(bool2);
        this.f44061p = new ObservableField<>(bool2);
        this.f44062q = new SingleLiveEvent<>();
        this.f44063r = new SingleLiveEvent<>();
        this.f44064s = new SingleLiveEvent<>();
        this.f44065t = new SingleLiveEvent<>();
        this.f44066u = new SingleLiveEvent<>();
        this.f44067v = new SingleLiveEvent<>();
        this.f44068w = new SingleLiveEvent<>();
        this.f44069x = new ObservableArrayList();
        this.f44070y = c.d(new d() { // from class: hc.l3
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_search_result);
            }
        });
        this.f44071z = new ObservableArrayList();
        this.A = c.d(new d() { // from class: hc.m3
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter);
            }
        });
        this.B = new ObservableArrayList();
        this.C = c.d(new d() { // from class: hc.n3
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter_common);
            }
        });
        this.D = new ObservableArrayList();
        this.E = c.d(new d() { // from class: hc.o3
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter_common);
            }
        });
        this.F = new ObservableArrayList();
        this.G = c.d(new d() { // from class: hc.p3
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter_common);
            }
        });
        this.H = new ObservableArrayList();
        this.I = c.d(new d() { // from class: hc.q3
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_look_channnel_filter_common);
            }
        });
        this.J = new pp.b(new pp.a() { // from class: hc.r3
            @Override // pp.a
            public final void call() {
                this.f63346a.Q();
            }
        });
        this.K = new pp.b(new pp.a() { // from class: hc.s3
            @Override // pp.a
            public final void call() {
                this.f63361a.R();
            }
        });
        this.L = new pp.b(new pp.a() { // from class: hc.t3
            @Override // pp.a
            public final void call() {
                this.f63386a.S();
            }
        });
        this.M = new pp.b(new pp.a() { // from class: hc.u3
            @Override // pp.a
            public final void call() {
                this.f63399a.T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        startActivity(SearchContentVideoActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.f44068w.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
            return;
        }
        if (e.q()) {
            return;
        }
        this.f44058m.set(Boolean.FALSE);
        this.f44059n.set(Boolean.TRUE);
        this.f44053h = "";
        this.f44054i = "";
        this.f44055j = "";
        this.f44056k = "";
        U();
    }

    public static /* synthetic */ int y(LOOKCHANNELVIEWMODEL lookchannelviewmodel) {
        int i10 = lookchannelviewmodel.f44051f;
        lookchannelviewmodel.f44051f = i10 + 1;
        return i10;
    }

    public void A(int i10, String str) {
        if (this.f44057l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.B.size(); i11++) {
            if (i10 == i11 && !this.B.get(i10).f63159c.get().booleanValue()) {
                this.B.get(i10).f63159c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.B.get(i11).f63159c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.b().getResources().getString(R.string.text_video_type_all))) {
            this.f44054i = "";
        } else {
            this.f44054i = str;
        }
        this.f44069x.clear();
        this.f44061p.set(Boolean.FALSE);
        this.f44060o.set(Boolean.TRUE);
        this.f44066u.call();
        V(true);
    }

    public void B(int i10, String str) {
        if (this.f44057l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            if (i10 == i11 && !this.D.get(i10).f63159c.get().booleanValue()) {
                this.D.get(i10).f63159c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.D.get(i11).f63159c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.b().getResources().getString(R.string.text_video_type_all))) {
            this.f44053h = "";
        } else {
            this.f44053h = str;
        }
        this.f44061p.set(Boolean.FALSE);
        this.f44069x.clear();
        this.f44060o.set(Boolean.TRUE);
        this.f44066u.call();
        V(true);
    }

    public void C(int i10, String str) {
        if (this.f44057l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            if (i10 == i11 && !this.F.get(i10).f63159c.get().booleanValue()) {
                this.F.get(i10).f63159c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.F.get(i11).f63159c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.b().getResources().getString(R.string.text_video_type_all))) {
            this.f44055j = "";
        } else {
            this.f44055j = str;
        }
        this.f44061p.set(Boolean.FALSE);
        this.f44069x.clear();
        this.f44060o.set(Boolean.TRUE);
        this.f44066u.call();
        V(true);
    }

    public void D(int i10, String str) {
        if (this.f44057l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.H.size(); i11++) {
            if (i10 == i11 && !this.H.get(i10).f63159c.get().booleanValue()) {
                this.H.get(i10).f63159c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.H.get(i11).f63159c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.b().getResources().getString(R.string.str_paixu))) {
            this.f44056k = "";
        } else {
            this.f44056k = str;
        }
        this.f44061p.set(Boolean.FALSE);
        this.f44069x.clear();
        this.f44060o.set(Boolean.TRUE);
        this.f44066u.call();
        V(true);
    }

    public void E(List<String> list) {
        this.D.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.D.add(new c2(this, list.get(i10), i10, 2));
        }
    }

    public void F(List<ChannnelFilterEntry> list) {
        this.f44071z.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ChannnelFilterEntry channnelFilterEntry = list.get(i10);
            this.f44071z.add(new a2(this, channnelFilterEntry, i10, this.f44052g));
            if (i10 == 0) {
                this.f44052g = channnelFilterEntry.getId();
                this.f44060o.set(Boolean.TRUE);
                V(true);
                if (channnelFilterEntry.getMsg() != null && channnelFilterEntry.getMsg().size() > 0) {
                    for (int i11 = 0; i11 < channnelFilterEntry.getMsg().size(); i11++) {
                        if (channnelFilterEntry.getMsg().get(i11).getName().equals("type")) {
                            I(channnelFilterEntry.getMsg().get(i11).getData());
                        } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("audio_lang")) {
                            E(channnelFilterEntry.getMsg().get(i11).getData());
                        } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("year")) {
                            J(channnelFilterEntry.getMsg().get(i11).getData());
                        } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("sort")) {
                            G(channnelFilterEntry.getMsg().get(i11).getData());
                        }
                    }
                }
            }
        }
    }

    public void G(List<String> list) {
        this.H.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.H.add(new c2(this, list.get(i10), i10, 4));
        }
    }

    public String H() {
        String str;
        String str2;
        String str3;
        int i10 = this.f44052g;
        String str4 = "";
        String string = i10 == 1 ? r.b().getResources().getString(R.string.text_movie) : i10 == 2 ? r.b().getResources().getString(R.string.text_tv) : i10 == 3 ? r.b().getResources().getString(R.string.text_zongyi) : i10 == 4 ? r.b().getResources().getString(R.string.text_dongman) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        if (o.b(this.f44054i)) {
            str = "";
        } else {
            str = Z7.f30794r + this.f44054i;
        }
        sb2.append(str);
        if (o.b(this.f44053h)) {
            str2 = "";
        } else {
            str2 = Z7.f30794r + this.f44053h;
        }
        sb2.append(str2);
        if (o.b(this.f44055j)) {
            str3 = "";
        } else {
            str3 = Z7.f30794r + this.f44055j;
        }
        sb2.append(str3);
        if (!o.b(this.f44056k)) {
            str4 = Z7.f30794r + this.f44056k;
        }
        sb2.append(str4);
        return sb2.toString();
    }

    public void I(List<String> list) {
        this.B.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.B.add(new c2(this, list.get(i10), i10, 1));
        }
    }

    public void J(List<String> list) {
        this.F.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.F.add(new c2(this, list.get(i10), i10, 3));
        }
    }

    public void U() {
        ((yb.a) this.f74138b).p().k(new c0()).e(new l()).e(new hc.c()).c(new a());
    }

    public void V(boolean z10) {
        if (z10) {
            this.f44051f = 1;
            this.f44057l.set(Boolean.TRUE);
        }
        HashMap map = new HashMap();
        map.put("type_id", Integer.valueOf(this.f44052g));
        map.put("type", this.f44054i);
        map.put("audio_lang", this.f44053h);
        map.put("year", this.f44055j);
        map.put("sort", this.f44056k);
        map.put("pn", Integer.valueOf(this.f44051f));
        ((yb.a) this.f74138b).E(map).k(new c0()).e(new l()).e(new hc.c()).c(new b(z10));
    }

    public void W(RecommandVideosEntity recommandVideosEntity) {
        if (e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    public void z(int i10, ChannnelFilterEntry channnelFilterEntry) {
        if (this.f44057l.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.f44071z.size(); i11++) {
            if (i10 == i11 && !this.f44071z.get(i10).f63135d.get().booleanValue()) {
                this.f44071z.get(i10).f63135d.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.f44071z.get(i11).f63135d.set(Boolean.FALSE);
            }
        }
        this.f44053h = "";
        this.f44054i = "";
        this.f44055j = "";
        this.f44056k = "";
        this.f44052g = channnelFilterEntry.getId();
        if (channnelFilterEntry.getMsg() != null && channnelFilterEntry.getMsg().size() > 0) {
            for (int i12 = 0; i12 < channnelFilterEntry.getMsg().size(); i12++) {
                if (channnelFilterEntry.getMsg().get(i12).getName().equals("type")) {
                    I(channnelFilterEntry.getMsg().get(i12).getData());
                } else if (channnelFilterEntry.getMsg().get(i12).getName().equals("audio_lang")) {
                    E(channnelFilterEntry.getMsg().get(i12).getData());
                } else if (channnelFilterEntry.getMsg().get(i12).getName().equals("year")) {
                    J(channnelFilterEntry.getMsg().get(i12).getData());
                } else if (channnelFilterEntry.getMsg().get(i12).getName().equals("sort")) {
                    G(channnelFilterEntry.getMsg().get(i12).getData());
                }
            }
        }
        this.f44061p.set(Boolean.FALSE);
        this.f44060o.set(Boolean.TRUE);
        this.f44066u.call();
        V(true);
    }
}
