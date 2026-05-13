package com.mgs.carparking.model;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import aq.c;
import com.dramarush.shortin.R;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;
import ed.x;
import hc.f1;
import ic.k;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;
import pp.b;
import zp.r;

/* JADX INFO: loaded from: classes8.dex */
public class DOWNLOADCOMPLETESECONDVIEWMODEL extends ToolbarViewModel<yb.a> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableBoolean f43900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableArrayList<f1> f43901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f43902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableArrayList<f1> f43903r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c<f1> f43904s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f43905t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f43906u;

    public class a implements x.b {
        public a() {
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            Log.i("wangyi", InitializationStatus.SUCCESS);
        }
    }

    public DOWNLOADCOMPLETESECONDVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f43900o = new ObservableBoolean(false);
        this.f43901p = new ObservableArrayList<>();
        this.f43902q = new ObservableField<>(getApplication().getResources().getString(R.string.text_all_select));
        this.f43903r = new ObservableArrayList<>();
        this.f43904s = c.c(7, R.layout.item_download_complete_second);
        this.f43905t = new b(new pp.a() { // from class: hc.m
            @Override // pp.a
            public final void call() {
                this.f63266a.r();
            }
        });
        this.f43906u = new b(new pp.a() { // from class: hc.n
            @Override // pp.a
            public final void call() {
                this.f63284a.s();
            }
        });
        this.f44965i.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        for (f1 f1Var : this.f43901p) {
            this.f43903r.remove(f1Var);
            p("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + f1Var.f63195d.getStreamid() + "&type=5");
            VideoDownloadDao.getInstance().deleteHistory(f1Var.f63195d);
        }
        op.a.a().b(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (!this.f43902q.get().equals(getApplication().getResources().getString(R.string.text_all_select))) {
            Iterator<f1> it = this.f43903r.iterator();
            while (it.hasNext()) {
                it.next().f63197f.set(Boolean.FALSE);
                this.f43901p.clear();
            }
            this.f43902q.set(getApplication().getResources().getString(R.string.text_all_select));
            return;
        }
        for (f1 f1Var : this.f43903r) {
            f1Var.f63197f.set(Boolean.TRUE);
            this.f43901p.add(f1Var);
        }
        this.f43902q.set(getApplication().getResources().getString(R.string.text_unall_select));
    }

    @Override // com.mgs.carparking.ui.toolbar.ToolbarViewModel
    public void m() {
        super.m();
        if (!this.f43900o.get()) {
            this.f44964h.set(r.b().getResources().getString(R.string.text_cannel));
            this.f43900o.set(true);
            return;
        }
        this.f44964h.set(r.b().getResources().getString(R.string.text_delete));
        this.f43900o.set(false);
        this.f43901p.clear();
        Iterator<f1> it = this.f43903r.iterator();
        while (it.hasNext()) {
            it.next().f63197f.set(Boolean.FALSE);
        }
    }

    public void p(String str) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new a());
    }

    public void q(List<VideoDownloadEntity> list) {
        this.f44963g.set(list.get(0).getName());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f43903r.add(new f1(this, list.get(i10), list));
        }
    }
}
