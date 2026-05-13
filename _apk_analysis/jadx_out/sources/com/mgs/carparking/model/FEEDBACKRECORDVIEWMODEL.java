package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import aq.c;
import aq.d;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.FeedbackRecordEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import hc.l;
import hc.o1;
import ic.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import np.e;
import xl.u;
import zp.r;

/* JADX INFO: loaded from: classes7.dex */
public class FEEDBACKRECORDVIEWMODEL extends ToolbarViewModel<yb.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f43984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f43985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<Boolean> f43986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SingleLiveEvent<String> f43987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableList<e> f43988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c<e> f43989t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public pp.b f43990u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public pp.b f43991v;

    public class a implements d<e> {
        public a() {
        }

        @Override // aq.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, int i10, e eVar) {
            String strValueOf = String.valueOf(eVar.a());
            if (strValueOf.equals("TYPE_FEEDBACK_FIRST")) {
                cVar.f(7, R.layout.item_feedback_record_first);
            } else if (strValueOf.equals("TYPE_FEEDBACK_NEXT")) {
                cVar.f(7, R.layout.item_feedback_record);
            }
        }
    }

    public class b implements u<BaseResponse<List<FeedbackRecordEntry>>> {
        public b() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<FeedbackRecordEntry>> baseResponse) {
            FEEDBACKRECORDVIEWMODEL.this.c();
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                    FEEDBACKRECORDVIEWMODEL.this.f43985p.set(Boolean.TRUE);
                    ObservableField<Boolean> observableField = FEEDBACKRECORDVIEWMODEL.this.f43984o;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    FEEDBACKRECORDVIEWMODEL.this.f43986q.set(bool);
                    return;
                }
                ObservableField<Boolean> observableField2 = FEEDBACKRECORDVIEWMODEL.this.f43985p;
                Boolean bool2 = Boolean.FALSE;
                observableField2.set(bool2);
                FEEDBACKRECORDVIEWMODEL.this.f43984o.set(bool2);
                FEEDBACKRECORDVIEWMODEL.this.f43986q.set(Boolean.TRUE);
                FEEDBACKRECORDVIEWMODEL.this.q(baseResponse.getResult());
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            FEEDBACKRECORDVIEWMODEL.this.c();
            ObservableField<Boolean> observableField = FEEDBACKRECORDVIEWMODEL.this.f43985p;
            Boolean bool = Boolean.FALSE;
            observableField.set(bool);
            FEEDBACKRECORDVIEWMODEL.this.f43984o.set(Boolean.TRUE);
            FEEDBACKRECORDVIEWMODEL.this.f43986q.set(bool);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            FEEDBACKRECORDVIEWMODEL.this.b(bVar);
        }
    }

    public FEEDBACKRECORDVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f43984o = new ObservableField<>(bool);
        this.f43985p = new ObservableField<>(bool);
        this.f43986q = new ObservableField<>(bool);
        this.f43987r = new SingleLiveEvent<>();
        this.f43988s = new ObservableArrayList();
        this.f43989t = c.d(new a());
        this.f43990u = new pp.b(new pp.a() { // from class: hc.a0
            @Override // pp.a
            public final void call() {
                this.f63131a.r();
            }
        });
        this.f43991v = new pp.b(new pp.a() { // from class: hc.b0
            @Override // pp.a
            public final void call() {
                this.f63142a.s();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.str_feedback_histroy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        d();
    }

    public void q(List<FeedbackRecordEntry> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(new o1(this, list.get(i10), "TYPE_FEEDBACK_NEXT", i10));
        }
        this.f43988s.addAll(arrayList);
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void r() {
        op.a.a().c(new n(false));
        j();
        ((yb.a) this.f74138b).S(new HashMap()).e(new l()).e(new hc.c()).c(new b());
    }
}
