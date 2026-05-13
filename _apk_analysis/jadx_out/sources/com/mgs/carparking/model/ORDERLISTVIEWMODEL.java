package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import aq.c;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.OrderListEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ed.c0;
import hc.d2;
import hc.l;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.r;

/* JADX INFO: loaded from: classes8.dex */
public class ORDERLISTVIEWMODEL extends ToolbarViewModel<yb.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f44110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f44111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableArrayList<d2> f44112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c<d2> f44113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f44114s;

    public class a implements u<BaseResponse<List<OrderListEntry>>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<List<OrderListEntry>> baseResponse) {
            ORDERLISTVIEWMODEL.this.c();
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() == null) {
                    ORDERLISTVIEWMODEL.this.f44111p.set(Boolean.TRUE);
                    ORDERLISTVIEWMODEL.this.f44110o.set(Boolean.FALSE);
                } else {
                    if (baseResponse.getResult() == null || baseResponse.getResult().size() <= 0) {
                        ORDERLISTVIEWMODEL.this.f44111p.set(Boolean.TRUE);
                        ORDERLISTVIEWMODEL.this.f44110o.set(Boolean.FALSE);
                        return;
                    }
                    ObservableField<Boolean> observableField = ORDERLISTVIEWMODEL.this.f44111p;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    ORDERLISTVIEWMODEL.this.f44110o.set(bool);
                    ORDERLISTVIEWMODEL.this.p(baseResponse.getResult());
                }
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            ORDERLISTVIEWMODEL.this.c();
            ORDERLISTVIEWMODEL.this.f44111p.set(Boolean.FALSE);
            ORDERLISTVIEWMODEL.this.f44110o.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            ORDERLISTVIEWMODEL.this.b(bVar);
        }
    }

    public ORDERLISTVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f44110o = new ObservableField<>(bool);
        this.f44111p = new ObservableField<>(bool);
        this.f44112q = new ObservableArrayList<>();
        this.f44113r = c.c(7, R.layout.item_order_list);
        this.f44114s = new b(new pp.a() { // from class: hc.l4
            @Override // pp.a
            public final void call() {
                this.f63263a.q();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.str_order_list));
    }

    public void p(List<OrderListEntry> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f44112q.add(new d2(this, list.get(i10)));
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void q() {
        j();
        ((yb.a) this.f74138b).P().k(new c0()).e(new l()).e(new hc.c()).c(new a());
    }
}
