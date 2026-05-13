package com.mgs.carparking.model;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
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
import hc.l;
import hc.p0;
import hc.q0;
import hc.s0;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes11.dex */
public class CHANNELVIEWMODEL extends BaseViewModel<yb.a> {
    public ObservableList<q0> A;
    public c<q0> B;
    public ObservableList<s0> C;
    public c<s0> D;
    public ObservableList<s0> E;
    public c<s0> F;
    public ObservableList<s0> G;
    public c<s0> H;
    public ObservableList<s0> I;
    public c<s0> J;
    public pp.b K;
    public pp.b L;
    public pp.b M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f43878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f43879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f43880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f43881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f43882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f43883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f43884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f43885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f43886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f43887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f43888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SingleLiveEvent<Void> f43889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<Void> f43890t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SingleLiveEvent<Void> f43891u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SingleLiveEvent<Void> f43892v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SingleLiveEvent<Void> f43893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SingleLiveEvent<Integer> f43894x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ObservableList<p0> f43895y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c<p0> f43896z;

    public class a implements u<BaseResponse<List<ChannnelFilterEntry>>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<ChannnelFilterEntry>> baseResponse) {
            ObservableField<Boolean> observableField = CHANNELVIEWMODEL.this.f43884n;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            CHANNELVIEWMODEL.this.f43885o.set(bool);
            CHANNELVIEWMODEL.this.D(baseResponse.getResult());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            CHANNELVIEWMODEL.this.f43885o.set(Boolean.FALSE);
            CHANNELVIEWMODEL.this.f43884n.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            CHANNELVIEWMODEL.this.b(bVar);
        }
    }

    public class b implements u<BaseResponse<List<RecommandVideosEntity>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f43898b;

        public b(boolean z10) {
            this.f43898b = z10;
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<RecommandVideosEntity>> baseResponse) {
            if (!baseResponse.isOk()) {
                CHANNELVIEWMODEL.this.f43889s.call();
                CHANNELVIEWMODEL.this.f43887q.set(Boolean.TRUE);
                ObservableField<Boolean> observableField = CHANNELVIEWMODEL.this.f43885o;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                CHANNELVIEWMODEL.this.f43884n.set(bool);
                CHANNELVIEWMODEL.this.f43886p.set(bool);
                return;
            }
            if (baseResponse.getResult() != null) {
                if (CHANNELVIEWMODEL.this.f43876f == 1) {
                    CHANNELVIEWMODEL.this.f43895y.clear();
                }
                if (this.f43898b) {
                    CHANNELVIEWMODEL.this.f43889s.call();
                }
                ObservableField<Boolean> observableField2 = CHANNELVIEWMODEL.this.f43886p;
                Boolean bool2 = Boolean.FALSE;
                observableField2.set(bool2);
                CHANNELVIEWMODEL.this.f43884n.set(bool2);
                if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                    if (CHANNELVIEWMODEL.this.f43876f == 1) {
                        CHANNELVIEWMODEL.this.f43886p.set(bool2);
                        CHANNELVIEWMODEL.this.f43887q.set(Boolean.TRUE);
                    }
                    CHANNELVIEWMODEL.this.f43890t.call();
                } else {
                    CHANNELVIEWMODEL.this.f43887q.set(bool2);
                    for (int i10 = 0; i10 < baseResponse.getResult().size(); i10++) {
                        CHANNELVIEWMODEL.this.f43895y.add(new p0(CHANNELVIEWMODEL.this, baseResponse.getResult().get(i10)));
                    }
                }
                CHANNELVIEWMODEL.x(CHANNELVIEWMODEL.this);
                CHANNELVIEWMODEL.this.f43891u.call();
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            ObservableField<Boolean> observableField = CHANNELVIEWMODEL.this.f43887q;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            CHANNELVIEWMODEL.this.f43885o.set(bool);
            CHANNELVIEWMODEL.this.f43884n.set(Boolean.TRUE);
            CHANNELVIEWMODEL.this.f43886p.set(bool);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            CHANNELVIEWMODEL.this.b(bVar);
        }
    }

    public CHANNELVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f43876f = 1;
        this.f43877g = 1;
        this.f43878h = new ObservableField<>();
        this.f43879i = "";
        this.f43880j = "";
        this.f43881k = "";
        this.f43882l = "";
        Boolean bool = Boolean.TRUE;
        this.f43883m = new ObservableField<>(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f43884n = new ObservableField<>(bool2);
        this.f43885o = new ObservableField<>(bool);
        this.f43886p = new ObservableField<>(bool2);
        this.f43887q = new ObservableField<>(bool2);
        this.f43888r = new ObservableField<>("");
        this.f43889s = new SingleLiveEvent<>();
        this.f43890t = new SingleLiveEvent<>();
        this.f43891u = new SingleLiveEvent<>();
        this.f43892v = new SingleLiveEvent<>();
        this.f43893w = new SingleLiveEvent<>();
        this.f43894x = new SingleLiveEvent<>();
        this.f43895y = new ObservableArrayList();
        this.f43896z = c.d(new d() { // from class: hc.b
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_search_result);
            }
        });
        this.A = new ObservableArrayList();
        this.B = c.d(new d() { // from class: hc.d
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter);
            }
        });
        this.C = new ObservableArrayList();
        this.D = c.d(new d() { // from class: hc.e
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter_common);
            }
        });
        this.E = new ObservableArrayList();
        this.F = c.d(new d() { // from class: hc.f
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter_common);
            }
        });
        this.G = new ObservableArrayList();
        this.H = c.d(new d() { // from class: hc.g
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter_common);
            }
        });
        this.I = new ObservableArrayList();
        this.J = c.d(new d() { // from class: hc.h
            @Override // aq.d
            public final void a(aq.c cVar, int i10, Object obj) {
                cVar.f(7, R.layout.item_channnel_filter_common);
            }
        });
        this.K = new pp.b(new pp.a() { // from class: hc.i
            @Override // pp.a
            public final void call() {
                this.f63220a.O();
            }
        });
        this.L = new pp.b(new pp.a() { // from class: hc.j
            @Override // pp.a
            public final void call() {
                this.f63227a.P();
            }
        });
        this.M = new pp.b(new pp.a() { // from class: hc.k
            @Override // pp.a
            public final void call() {
                this.f63236a.Q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        startActivity(SearchContentVideoActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
            return;
        }
        if (e.q()) {
            return;
        }
        this.f43884n.set(Boolean.FALSE);
        this.f43885o.set(Boolean.TRUE);
        this.f43879i = "";
        this.f43880j = "";
        this.f43881k = "";
        this.f43882l = "";
        R();
        S(true);
    }

    public static /* synthetic */ int x(CHANNELVIEWMODEL channelviewmodel) {
        int i10 = channelviewmodel.f43876f;
        channelviewmodel.f43876f = i10 + 1;
        return i10;
    }

    public void A(int i10, String str) {
        if (this.f43883m.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            if (i10 == i11 && !this.G.get(i10).f63351c.get().booleanValue()) {
                this.G.get(i10).f63351c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.G.get(i11).f63351c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.b().getResources().getString(R.string.text_video_type_all))) {
            this.f43881k = "";
        } else {
            this.f43881k = str;
        }
        this.f43887q.set(Boolean.FALSE);
        this.f43895y.clear();
        this.f43886p.set(Boolean.TRUE);
        this.f43893w.call();
        S(true);
    }

    public void B(int i10, String str) {
        if (this.f43883m.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            if (i10 == i11 && !this.I.get(i10).f63351c.get().booleanValue()) {
                this.I.get(i10).f63351c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.I.get(i11).f63351c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.b().getResources().getString(R.string.str_paixu))) {
            this.f43882l = "";
        } else {
            this.f43882l = str;
        }
        this.f43887q.set(Boolean.FALSE);
        this.f43895y.clear();
        this.f43886p.set(Boolean.TRUE);
        this.f43893w.call();
        S(true);
    }

    public void C(List<String> list) {
        this.E.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.E.add(new s0(this, list.get(i10), i10, 2));
        }
    }

    public void D(List<ChannnelFilterEntry> list) {
        this.A.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ChannnelFilterEntry channnelFilterEntry = list.get(i10);
            Log.i("wangyi", "数据为：" + channnelFilterEntry.getId() + "--" + channnelFilterEntry.getName() + "---" + this.f43877g);
            if (channnelFilterEntry.getId() == this.f43877g && channnelFilterEntry.getMsg() != null && channnelFilterEntry.getMsg().size() > 0) {
                for (int i11 = 0; i11 < channnelFilterEntry.getMsg().size(); i11++) {
                    if (channnelFilterEntry.getMsg().get(i11).getName().equals("type")) {
                        G(channnelFilterEntry.getMsg().get(i11).getData());
                    } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("area")) {
                        C(channnelFilterEntry.getMsg().get(i11).getData());
                    } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("year")) {
                        H(channnelFilterEntry.getMsg().get(i11).getData());
                    } else if (channnelFilterEntry.getMsg().get(i11).getName().equals("sort")) {
                        E(channnelFilterEntry.getMsg().get(i11).getData());
                    }
                }
            }
        }
    }

    public void E(List<String> list) {
        this.I.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.I.add(new s0(this, list.get(i10), i10, 4));
        }
    }

    public String F() {
        String str;
        String str2;
        int i10 = this.f43877g;
        String string = "";
        String string2 = i10 == 1 ? r.b().getResources().getString(R.string.text_movie) : i10 == 2 ? r.b().getResources().getString(R.string.text_tv) : i10 == 3 ? r.b().getResources().getString(R.string.text_zongyi) : i10 == 4 ? r.b().getResources().getString(R.string.text_dongman) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        if (o.b(this.f43880j)) {
            str = "";
        } else {
            str = Z7.f30794r + this.f43880j;
        }
        sb2.append(str);
        if (o.b(this.f43879i)) {
            str2 = "";
        } else {
            str2 = Z7.f30794r + this.f43879i;
        }
        sb2.append(str2);
        if (!o.b(this.f43881k)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Z7.f30794r);
            sb3.append(this.f43881k);
            if (!o.b(this.f43882l)) {
                string = Z7.f30794r + this.f43882l;
            }
            sb3.append(string);
            string = sb3.toString();
        }
        sb2.append(string);
        return sb2.toString();
    }

    public void G(List<String> list) {
        this.C.clear();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (o.b(this.f43880j)) {
                s0 s0Var = new s0(this, list.get(i11), i11, 1);
                if (i11 == 0) {
                    s0Var.f63351c.set(Boolean.TRUE);
                }
                this.C.add(s0Var);
            } else if (list.get(i11).equals(this.f43880j)) {
                s0 s0Var2 = new s0(this, list.get(i11), i11, 1);
                s0Var2.f63351c.set(Boolean.TRUE);
                this.C.add(s0Var2);
                i10 = i11;
            } else {
                this.C.add(new s0(this, list.get(i11), i11, 1));
            }
        }
        this.f43894x.setValue(Integer.valueOf(i10));
    }

    public void H(List<String> list) {
        this.G.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.G.add(new s0(this, list.get(i10), i10, 3));
        }
    }

    public void R() {
        ((yb.a) this.f74138b).p().k(new c0()).e(new l()).e(new hc.c()).c(new a());
    }

    public void S(boolean z10) {
        if (z10) {
            this.f43876f = 1;
            this.f43883m.set(Boolean.TRUE);
        }
        HashMap map = new HashMap();
        map.put("type_id", Integer.valueOf(this.f43877g));
        map.put("type", this.f43880j);
        map.put("area", this.f43879i);
        map.put("year", this.f43881k);
        map.put("sort", this.f43882l);
        map.put("pn", Integer.valueOf(this.f43876f));
        ((yb.a) this.f74138b).E(map).k(new c0()).e(new l()).e(new hc.c()).c(new b(z10));
    }

    public void T(RecommandVideosEntity recommandVideosEntity) {
        if (e.q()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", recommandVideosEntity.getId());
        startActivity(VideoPlayDetailActivity.class, bundle);
    }

    public void y(int i10, String str) {
        if (this.f43883m.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.C.size(); i11++) {
            if (i10 == i11 && !this.C.get(i10).f63351c.get().booleanValue()) {
                this.C.get(i10).f63351c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.C.get(i11).f63351c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.b().getResources().getString(R.string.text_video_type_all))) {
            this.f43880j = "";
        } else {
            this.f43880j = str;
        }
        this.f43895y.clear();
        this.f43887q.set(Boolean.FALSE);
        this.f43886p.set(Boolean.TRUE);
        this.f43893w.call();
        S(true);
    }

    public void z(int i10, String str) {
        if (this.f43883m.get().booleanValue()) {
            return;
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            if (i10 == i11 && !this.E.get(i10).f63351c.get().booleanValue()) {
                this.E.get(i10).f63351c.set(Boolean.TRUE);
            } else if (i10 == i11) {
                return;
            } else {
                this.E.get(i11).f63351c.set(Boolean.FALSE);
            }
        }
        if (str.equals(r.b().getResources().getString(R.string.text_video_type_all))) {
            this.f43879i = "";
        } else {
            this.f43879i = str;
        }
        this.f43887q.set(Boolean.FALSE);
        this.f43895y.clear();
        this.f43886p.set(Boolean.TRUE);
        this.f43893w.call();
        S(true);
    }
}
