package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import aq.c;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.ExtensionRecordEntry;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ed.c0;
import hc.l;
import hc.l1;
import java.util.List;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.r;

/* JADX INFO: loaded from: classes12.dex */
public class EXTENSIONRECORDVIEWMODEL extends ToolbarViewModel<yb.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f43970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f43971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableArrayList<l1> f43972q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c<l1> f43973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f43974s;

    public class a implements u<BaseResponse<ExtensionRecordEntry>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<ExtensionRecordEntry> baseResponse) {
            EXTENSIONRECORDVIEWMODEL.this.c();
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() == null) {
                    EXTENSIONRECORDVIEWMODEL.this.f43971p.set(Boolean.TRUE);
                    EXTENSIONRECORDVIEWMODEL.this.f43970o.set(Boolean.FALSE);
                } else {
                    if (baseResponse.getResult().getInvited_list() == null || baseResponse.getResult().getInvited_list().size() <= 0) {
                        EXTENSIONRECORDVIEWMODEL.this.f43971p.set(Boolean.TRUE);
                        EXTENSIONRECORDVIEWMODEL.this.f43970o.set(Boolean.FALSE);
                        return;
                    }
                    ObservableField<Boolean> observableField = EXTENSIONRECORDVIEWMODEL.this.f43971p;
                    Boolean bool = Boolean.FALSE;
                    observableField.set(bool);
                    EXTENSIONRECORDVIEWMODEL.this.f43970o.set(bool);
                    EXTENSIONRECORDVIEWMODEL.this.p(baseResponse.getResult().getInvited_list());
                }
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            EXTENSIONRECORDVIEWMODEL.this.c();
            EXTENSIONRECORDVIEWMODEL.this.f43971p.set(Boolean.FALSE);
            EXTENSIONRECORDVIEWMODEL.this.f43970o.set(Boolean.TRUE);
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            EXTENSIONRECORDVIEWMODEL.this.b(bVar);
        }
    }

    public EXTENSIONRECORDVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        Boolean bool = Boolean.FALSE;
        this.f43970o = new ObservableField<>(bool);
        this.f43971p = new ObservableField<>(bool);
        this.f43972q = new ObservableArrayList<>();
        this.f43973r = c.c(7, R.layout.item_extension_record);
        this.f43974s = new b(new pp.a() { // from class: hc.y
            @Override // pp.a
            public final void call() {
                this.f63436a.q();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.str_extension_histroy));
    }

    public void p(List<ExtensionRecordEntry.InvitedList> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f43972q.add(new l1(this, list.get(i10)));
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void q() {
        j();
        ((yb.a) this.f74138b).s().k(new c0()).e(new l()).e(new hc.c()).c(new a());
    }
}
