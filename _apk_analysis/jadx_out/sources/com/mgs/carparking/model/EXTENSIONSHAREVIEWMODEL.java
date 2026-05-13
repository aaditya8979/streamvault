package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.ironsource.Z7;
import com.mgs.carparking.netbean.ExtensionShareEntry;
import com.mgs.carparking.ui.mine.share.ExtensionRecordActivity;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ed.c0;
import hc.c;
import hc.l;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;
import me.goldze.mvvmhabit.http.BaseResponse;
import pp.b;
import xl.u;
import zp.r;

/* JADX INFO: loaded from: classes2.dex */
public class EXTENSIONSHAREVIEWMODEL extends ToolbarViewModel<yb.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<ExtensionShareEntry> f43976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<Void> f43977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f43978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<String> f43979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableField<String> f43980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObservableField<String> f43981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f43982u;

    public class a implements u<BaseResponse<ExtensionShareEntry>> {
        public a() {
        }

        @Override // xl.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BaseResponse<ExtensionShareEntry> baseResponse) {
            if (baseResponse.isOk()) {
                if (baseResponse.getResult() == null) {
                    EXTENSIONSHAREVIEWMODEL.this.c();
                    return;
                }
                EXTENSIONSHAREVIEWMODEL.this.c();
                EXTENSIONSHAREVIEWMODEL.this.f43976o.setValue(baseResponse.getResult());
                EXTENSIONSHAREVIEWMODEL.this.f43979r.set(r.b().getResources().getString(R.string.str_my_code) + baseResponse.getResult().getInvited_by());
                EXTENSIONSHAREVIEWMODEL.this.f43980s.set(r.b().getResources().getString(R.string.str_sharenum, baseResponse.getResult().getInvited_count() + Z7.f30794r));
            }
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            EXTENSIONSHAREVIEWMODEL.this.c();
        }

        @Override // xl.u
        public void onSubscribe(bm.b bVar) {
            EXTENSIONSHAREVIEWMODEL.this.b(bVar);
        }
    }

    public EXTENSIONSHAREVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f43976o = new SingleLiveEvent<>();
        this.f43977p = new SingleLiveEvent<>();
        this.f43978q = new ObservableField<>();
        this.f43979r = new ObservableField<>();
        this.f43980s = new ObservableField<>();
        this.f43981t = new ObservableField<>();
        this.f43982u = new b(new pp.a() { // from class: hc.z
            @Override // pp.a
            public final void call() {
                this.f63479a.q();
            }
        });
        this.f44963g.set(r.b().getResources().getString(R.string.str_mine_extension));
        this.f44965i.set(true);
        this.f44964h.set(r.b().getResources().getString(R.string.str_extension_histroy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f43977p.call();
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        super.m();
        startActivity(ExtensionRecordActivity.class);
    }

    public void p() {
        j();
        ((yb.a) this.f74138b).O().k(new c0()).e(new l()).e(new c()).c(new a());
    }
}
