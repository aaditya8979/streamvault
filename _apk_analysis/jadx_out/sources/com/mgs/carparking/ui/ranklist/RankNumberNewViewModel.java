package com.mgs.carparking.ui.ranklist;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RankTopicEntry;
import com.mgs.carparking.netbean.SpecialList;
import com.mgs.carparking.netbean.TopicPidList;
import ed.c0;
import ed.e;
import ed.g;
import ed.l0;
import hc.c;
import hc.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.o;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes.dex */
public class RankNumberNewViewModel extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<List<SpecialList>> f44940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SingleLiveEvent<List<TopicPidList>> f44941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<Boolean> f44942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<Boolean> f44943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<SpecialList> f44944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<TopicPidList> f44945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f44946l;

    public class a implements u<BaseResponse<RankTopicEntry>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<RankTopicEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() == null || baseResponse.getResult().getTopic_list().size() <= 0) {
                    RankNumberNewViewModel.this.f44942h.set(Boolean.FALSE);
                    RankNumberNewViewModel.this.f44943i.set(Boolean.TRUE);
                    return;
                }
                ObservableField<Boolean> observableField = RankNumberNewViewModel.this.f44942h;
                Boolean bool = Boolean.FALSE;
                observableField.set(bool);
                RankNumberNewViewModel.this.f44943i.set(bool);
                g.h(true);
                g.f("CACHE_RANK_TITLE_LIST", baseResponse.getResult().getTopic_list());
                if (baseResponse.getResult() != null && baseResponse.getResult().getPid_list().size() > 0) {
                    g.f("CACHE_RANK_TV_AND_MOV_TITLE_LIST", baseResponse.getResult().getPid_list());
                    RankNumberNewViewModel.this.f44941g.setValue(baseResponse.getResult().getPid_list());
                }
                RankNumberNewViewModel.this.f44940f.setValue(baseResponse.getResult().getTopic_list());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            RankNumberNewViewModel.this.f44942h.set(Boolean.FALSE);
            RankNumberNewViewModel.this.f44943i.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            RankNumberNewViewModel.this.b(bVar);
        }
    }

    public RankNumberNewViewModel(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f44940f = new SingleLiveEvent<>();
        this.f44941g = new SingleLiveEvent<>();
        Boolean bool = Boolean.FALSE;
        this.f44942h = new ObservableField<>(bool);
        this.f44943i = new ObservableField<>(bool);
        this.f44944j = new ArrayList();
        this.f44945k = new ArrayList();
        this.f44946l = new b(new pp.a() { // from class: ad.p
            @Override // pp.a
            public final void call() {
                this.f3750a.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        if (!tp.b.a(getApplication())) {
            p.b(r.b().getResources().getString(R.string.text_toast_nonet));
        } else {
            if (e.q()) {
                return;
            }
            this.f44943i.set(Boolean.FALSE);
            this.f44942h.set(Boolean.TRUE);
            p();
        }
    }

    public void o() {
        if (o.b(l0.q())) {
            this.f44942h.set(Boolean.TRUE);
            p();
            return;
        }
        this.f44944j = g.d("CACHE_RANK_TITLE_LIST", SpecialList.class);
        this.f44945k = g.d("CACHE_RANK_TV_AND_MOV_TITLE_LIST", TopicPidList.class);
        if (!tp.b.a(BaseApplication.getInstance())) {
            List<SpecialList> list = this.f44944j;
            if (list == null || list.size() <= 0) {
                this.f44942h.set(Boolean.TRUE);
                p();
                return;
            }
            g.h(false);
            this.f44940f.setValue(this.f44944j);
            List<TopicPidList> list2 = this.f44945k;
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            this.f44941g.setValue(this.f44945k);
            return;
        }
        if (g.b(l0.q())) {
            this.f44942h.set(Boolean.TRUE);
            p();
            return;
        }
        List<SpecialList> list3 = this.f44944j;
        if (list3 == null || list3.size() <= 0) {
            this.f44942h.set(Boolean.TRUE);
            p();
            return;
        }
        g.h(false);
        this.f44940f.setValue(this.f44944j);
        List<TopicPidList> list4 = this.f44945k;
        if (list4 == null || list4.size() <= 0) {
            return;
        }
        this.f44941g.setValue(this.f44945k);
    }

    public void p() {
        HashMap map = new HashMap();
        map.put("type_id", 1);
        ((yb.a) this.f74138b).h(map).e(new l()).e(new c()).k(new c0()).c(new a());
    }
}
