package com.mgs.carparking.model;

import android.app.Application;
import android.app.Dialog;
import android.util.Log;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import aq.c;
import com.dramarush.shortin.R;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.DialogVideoDeleteBinding;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import com.mgs.carparking.ui.mine.DownloadVideoActivity;
import com.mgs.carparking.ui.mine.DownloadingAdapter;
import ed.d0;
import ed.g0;
import ed.x;
import hc.c1;
import ic.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseViewModel;
import okhttp3.Response;
import pp.b;
import sd.h;
import zp.r;

/* JADX INFO: loaded from: classes6.dex */
public class DOWNLOADVIDEOVIEWMODEL extends BaseViewModel<yb.a> {
    public b A;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableBoolean f43922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<String> f43923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<VideoDownloadEntity> f43924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f43925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f43926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<Boolean> f43928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<Boolean> f43929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d0 f43930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Dialog f43931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DialogVideoDeleteBinding f43932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DownloadVideoActivity f43933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c1 f43934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.mgs.carparking.model.a f43935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f43936t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObservableArrayList<com.mgs.carparking.model.a> f43937u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObservableArrayList<com.mgs.carparking.model.a> f43938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c<com.mgs.carparking.model.a> f43939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f43940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f43941y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f43942z;

    public class a implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f43943a;

        public a(String str) {
            this.f43943a = str;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            Log.i("wangyi", InitializationStatus.SUCCESS);
            if (DOWNLOADVIDEOVIEWMODEL.this.f43936t) {
                VideoDownloadDao.getInstance().deleteHistory(this.f43943a);
            } else {
                VideoDownloadDao.getInstance().deleteHistory(this.f43943a);
            }
            if (DOWNLOADVIDEOVIEWMODEL.this.f43938v.size() == 0) {
                DOWNLOADVIDEOVIEWMODEL.this.f43928l.set(Boolean.TRUE);
                DOWNLOADVIDEOVIEWMODEL.this.f43929m.set(Boolean.FALSE);
            }
        }
    }

    public DOWNLOADVIDEOVIEWMODEL(@NonNull Application application, yb.a aVar, d0 d0Var, DownloadVideoActivity downloadVideoActivity) {
        super(application, aVar);
        this.f43922f = new ObservableBoolean(false);
        this.f43923g = new ObservableField<>(r.b().getResources().getString(R.string.text_all_select));
        this.f43924h = new ArrayList();
        this.f43925i = new ObservableField<>();
        this.f43926j = new ObservableField<>();
        this.f43927k = true;
        Boolean bool = Boolean.FALSE;
        this.f43928l = new ObservableField<>(bool);
        this.f43929m = new ObservableField<>(bool);
        this.f43936t = false;
        this.f43937u = new ObservableArrayList<>();
        this.f43938v = new ObservableArrayList<>();
        this.f43939w = c.c(7, R.layout.item_downnloading_video);
        this.f43940x = new b(new pp.a() { // from class: hc.q
            @Override // pp.a
            public final void call() {
                this.f63329a.r();
            }
        });
        this.f43941y = new b(new pp.a() { // from class: hc.r
            @Override // pp.a
            public final void call() {
                this.f63342a.s();
            }
        });
        this.f43942z = new b(new pp.a() { // from class: hc.s
            @Override // pp.a
            public final void call() {
                this.f63349a.t();
            }
        });
        this.A = new b(new pp.a() { // from class: hc.t
            @Override // pp.a
            public final void call() {
                this.f63364a.u();
            }
        });
        this.f43930n = d0Var;
        this.f43933q = downloadVideoActivity;
        DialogVideoDeleteBinding dialogVideoDeleteBinding = (DialogVideoDeleteBinding) DataBindingUtil.inflate(LayoutInflater.from(r.b()), R.layout.dialog_video_delete, null, false);
        this.f43932p = dialogVideoDeleteBinding;
        dialogVideoDeleteBinding.b(this);
        this.f43925i.set(r.b().getResources().getString(R.string.text_use_space) + g0.b(application) + "，");
        this.f43926j.set(r.b().getResources().getString(R.string.text_unuse_space, g0.c(application)));
        this.f43924h = VideoDownloadDao.getInstance().queryHistory();
        Log.i("wangyi", "下载的数据为：" + this.f43924h.toString());
        if (this.f43924h.size() > 0) {
            this.f43928l.set(bool);
            this.f43929m.set(Boolean.TRUE);
        } else {
            this.f43929m.set(bool);
            this.f43928l.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f43931o.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f43931o.dismiss();
        if (this.f43936t) {
            q(this.f43934r.f63151d.get(0).getStreamid());
        } else {
            this.f43938v.remove(this.f43935s);
            q(this.f43935s.f44274i.getResource());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        if (!this.f43923g.get().equals(r.b().getResources().getString(R.string.text_all_select))) {
            Iterator<com.mgs.carparking.model.a> it = this.f43938v.iterator();
            while (it.hasNext()) {
                it.next().f44267b.set(Boolean.FALSE);
                this.f43937u.clear();
            }
            this.f43923g.set(r.b().getResources().getString(R.string.text_all_select));
            return;
        }
        for (com.mgs.carparking.model.a aVar : this.f43938v) {
            aVar.f44267b.set(Boolean.TRUE);
            this.f43937u.add(aVar);
        }
        this.f43923g.set(r.b().getResources().getString(R.string.text_unall_select));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        for (com.mgs.carparking.model.a aVar : this.f43937u) {
            this.f43938v.remove(aVar);
            d0 d0Var = aVar.f44268c;
            if (d0Var != null) {
                d0Var.b();
                aVar.f44268c = null;
            }
            q(aVar.f44274i.getResource());
        }
        if (this.f43938v.size() == 0) {
            this.f43922f.set(false);
        }
    }

    public void delete(com.mgs.carparking.model.a aVar) {
        this.f43935s = aVar;
        this.f43936t = false;
        if (this.f43931o == null) {
            this.f43931o = h.a(this.f43933q.getContext(), this.f43932p.getRoot(), true);
        }
        this.f43931o.show();
    }

    @Override // me.goldze.mvvmhabit.base.BaseViewModel, me.goldze.mvvmhabit.base.IBaseViewModel
    public void onDestroy() {
        if (this.f43938v.size() > 0) {
            for (int i10 = 0; i10 < this.f43938v.size(); i10++) {
                this.f43938v.get(i10).f44268c.b();
                this.f43938v.get(i10).f44269d.removeCallbacks(this.f43938v.get(i10).f44272g);
            }
        }
        super.onDestroy();
    }

    public void p(List<DownloadInfoEntry> list, DownloadingAdapter downloadingAdapter) {
        if (list.size() <= 0 || this.f43924h.size() <= 0) {
            this.f43929m.set(Boolean.FALSE);
            this.f43928l.set(Boolean.TRUE);
            this.f43930n.b();
            this.f43930n = null;
            VideoDownloadDao.getInstance().clearHistory();
        } else if (this.f43927k) {
            this.f43930n.b();
            if (this.f43938v.size() > 0) {
                for (int i10 = 0; i10 < this.f43938v.size(); i10++) {
                    this.f43938v.get(i10).f44268c.b();
                    this.f43938v.get(i10).f44269d.removeCallbacks(this.f43938v.get(i10).f44272g);
                }
            }
            boolean z10 = this.f43938v.size() <= 0;
            int i11 = 0;
            boolean z11 = false;
            for (int i12 = 0; i12 < list.size(); i12++) {
                if (list.get(i12).getDownload_percent() >= 100) {
                    for (int i13 = 0; i13 < this.f43924h.size(); i13++) {
                        if (list.get(i12).getResource().equals(this.f43924h.get(i13).getStreamid())) {
                            VideoDownloadDao.getInstance().updateHistory(1, this.f43924h.get(i13).getStreamid(), list.get(i12).getDownload_size());
                            z11 = true;
                        }
                    }
                } else if (z10 || i11 >= this.f43938v.size()) {
                    this.f43938v.add(new com.mgs.carparking.model.a(this, list.get(i12), this.f43924h, false));
                } else {
                    this.f43938v.set(i11, new com.mgs.carparking.model.a(this, list.get(i12), this.f43924h, false));
                    i11++;
                }
                if (z11) {
                    this.f43924h = VideoDownloadDao.getInstance().queryHistory();
                    op.a.a().b(new j(this.f43924h));
                }
            }
            if (!z10) {
                while (i11 < this.f43938v.size()) {
                    this.f43938v.remove(i11);
                    i11++;
                }
            }
            if (this.f43938v.size() == 0) {
                this.f43928l.set(Boolean.TRUE);
                this.f43929m.set(Boolean.FALSE);
                this.f43930n.b();
            }
        }
        this.f43927k = false;
    }

    public void q(String str) {
        String str2 = "http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + str + "&type=5";
        Log.i("wangyi", "删除链接为：" + str2);
        x.a(str2, new a(str));
    }
}
