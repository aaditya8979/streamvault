package com.mgs.carparking.model;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import ed.d0;
import ed.g0;
import ed.k;
import ed.x;
import ic.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Response;
import zp.r;

/* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends np.c<DOWNLOADVIDEOVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ObservableField<Boolean> f44267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f44268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f44269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<DownloadInfoEntry> f44271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f44272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DOWNLOADVIDEOVIEWMODEL f44273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DownloadInfoEntry f44274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoDownloadEntity> f44275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f44276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f44277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<String> f44278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<String> f44279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Integer> f44280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<String> f44281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<String> f44282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ObservableField<Integer> f44283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f44284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pp.b f44285t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public pp.b f44286u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public pp.b f44287v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public pp.b f44288w;

    /* JADX INFO: renamed from: com.mgs.carparking.model.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
    public class C0534a implements x.b {

        /* JADX INFO: renamed from: com.mgs.carparking.model.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
        public class RunnableC0535a implements Runnable {
            public RunnableC0535a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44268c.b();
                a aVar = a.this;
                aVar.f44269d.removeCallbacks(aVar.f44272g);
                op.a.a().b(new l());
            }
        }

        public C0534a() {
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get fail：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            Log.i("wangyi", response.body().toString());
            a.this.f44269d.postDelayed(new RunnableC0535a(), 500L);
        }
    }

    /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
    public class b implements x.b {
        public b() {
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            try {
                a.this.f44270e = response.body().string();
                a aVar = a.this;
                Handler handler = aVar.f44269d;
                if (handler != null) {
                    handler.removeCallbacks(aVar.f44272g);
                    a aVar2 = a.this;
                    aVar2.f44269d.postDelayed(aVar2.f44272g, 500L);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: com.mgs.carparking.model.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ITEMDOWNLOADINGVIEWMODEL.java */
        public class C0536a extends j8.a<List<DownloadInfoEntry>> {
            public C0536a() {
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.d(a.this.f44270e, DownloadInfoEntry.class)) {
                a aVar = a.this;
                aVar.f44271f = (List) k.c(aVar.f44270e, new C0536a().getType());
                Log.i("wangyi", "进入了23332" + a.this.f44270e.toString());
                if (a.this.f44271f.size() <= 0) {
                    a.this.f44268c.b();
                    return;
                }
                for (int i10 = 0; i10 < a.this.f44271f.size(); i10++) {
                    if (((DownloadInfoEntry) a.this.f44271f.get(i10)).getDownload_status() == 2 && ((DownloadInfoEntry) a.this.f44271f.get(i10)).getResource().equals(a.this.f44284s)) {
                        a aVar2 = a.this;
                        aVar2.f44282q.set(g0.a(((DownloadInfoEntry) aVar2.f44271f.get(i10)).getDownload_size()));
                        a aVar3 = a.this;
                        aVar3.f44280o.set(Integer.valueOf(((DownloadInfoEntry) aVar3.f44271f.get(i10)).getDownload_percent()));
                        a.this.f44281p.set(g0.a(((DownloadInfoEntry) a.this.f44271f.get(i10)).getDownload_rate()) + "/s");
                    } else if (((DownloadInfoEntry) a.this.f44271f.get(i10)).getDownload_status() == 5 && ((DownloadInfoEntry) a.this.f44271f.get(i10)).getResource().equals(a.this.f44284s)) {
                        a.this.f44283r.set(5);
                        a.this.f44279n.set(r.b().getResources().getString(R.string.str_download_tfail));
                    }
                    if (((DownloadInfoEntry) a.this.f44271f.get(i10)).getResource().equals(a.this.f44284s) && ((DownloadInfoEntry) a.this.f44271f.get(i10)).getDownload_status() == 4) {
                        Log.i("wangyi", "进入了22");
                        a.this.f44268c.b();
                        op.a.a().b(new l());
                    }
                }
            }
        }
    }

    public a(@NonNull DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel, DownloadInfoEntry downloadInfoEntry, List<VideoDownloadEntity> list, boolean z10) {
        super(downloadvideoviewmodel);
        this.f44267b = new ObservableField<>(Boolean.FALSE);
        this.f44268c = new d0();
        this.f44269d = new Handler();
        this.f44271f = new ArrayList();
        this.f44272g = new c();
        this.f44276k = new ObservableField<>("");
        this.f44277l = new ObservableField<>("");
        this.f44278m = new ObservableField<>("");
        this.f44279n = new ObservableField<>("");
        this.f44280o = new ObservableField<>();
        this.f44281p = new ObservableField<>("");
        this.f44282q = new ObservableField<>("");
        this.f44283r = new ObservableField<>(0);
        this.f44284s = "";
        this.f44285t = new pp.b(new pp.a() { // from class: hc.g1
            @Override // pp.a
            public final void call() {
                this.f63207a.l();
            }
        });
        this.f44286u = new pp.b(new pp.a() { // from class: hc.h1
            @Override // pp.a
            public final void call() {
                com.mgs.carparking.model.a.m();
            }
        });
        this.f44287v = new pp.b(new pp.a() { // from class: hc.i1
            @Override // pp.a
            public final void call() {
                this.f63222a.n();
            }
        });
        this.f44288w = new pp.b(new pp.a() { // from class: hc.j1
            @Override // pp.a
            public final void call() {
                this.f63231a.o();
            }
        });
        this.f44273h = downloadvideoviewmodel;
        this.f44274i = downloadInfoEntry;
        this.f44275j = list;
        if (downloadInfoEntry.getDownload_status() == 2) {
            this.f44283r.set(2);
            this.f44279n.set(r.b().getResources().getString(R.string.str_downloading));
        } else if (downloadInfoEntry.getDownload_status() == 3) {
            this.f44283r.set(3);
            this.f44279n.set(r.b().getResources().getString(R.string.str_pauseing));
        } else if (downloadInfoEntry.getDownload_status() == 1) {
            this.f44283r.set(1);
            this.f44279n.set(r.b().getResources().getString(R.string.str_stoping));
        } else if (downloadInfoEntry.getDownload_status() == 5) {
            this.f44283r.set(5);
            this.f44279n.set(r.b().getResources().getString(R.string.str_download_fail));
        }
        this.f44280o.set(Integer.valueOf(downloadInfoEntry.getDownload_percent()));
        this.f44281p.set(g0.a(downloadInfoEntry.getDownload_rate()) + "/s");
        this.f44282q.set(g0.a(downloadInfoEntry.getDownload_size()));
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (downloadInfoEntry.getResource().equals(list.get(i10).getStreamid())) {
                this.f44276k.set(list.get(i10).getCoverUrl());
                this.f44277l.set(list.get(i10).getComplete_name());
                this.f44278m.set(list.get(i10).getOrginal_url());
            }
        }
        if (downloadInfoEntry.getDownload_status() == 2) {
            this.f44284s = downloadInfoEntry.getResource();
            this.f44268c.c(2000L, new d0.b() { // from class: hc.k1
                @Override // ed.d0.b
                public final void a(long j10) {
                    this.f63237a.p(j10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        if (this.f44273h.f43922f.get()) {
            this.f44267b.set(Boolean.valueOf(!r0.get().booleanValue()));
            if (!this.f44267b.get().booleanValue()) {
                this.f44273h.f43937u.remove(this);
                this.f44273h.f43923g.set(r.b().getResources().getString(R.string.text_all_select));
            } else {
                this.f44273h.f43937u.add(this);
                if (this.f44273h.f43938v.size() == this.f44273h.f43937u.size()) {
                    this.f44273h.f43923g.set(r.b().getResources().getString(R.string.text_unall_select));
                }
            }
        }
    }

    public static /* synthetic */ void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f44279n.set(r.b().getResources().getString(R.string.str_downloading));
        this.f44283r.set(2);
        this.f44274i.setDownload_status(2);
        k("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + this.f44274i.getResource() + "&type=3", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (AppApplication.port <= 0 || this.f44273h.f43922f.get()) {
            return;
        }
        if (this.f44283r.get().intValue() != 2 && this.f44283r.get().intValue() != 1) {
            this.f44279n.set(r.b().getResources().getString(R.string.str_downloading));
            this.f44283r.set(2);
            this.f44274i.setDownload_status(2);
            k("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + this.f44274i.getResource() + "&type=3", 2);
            return;
        }
        this.f44279n.set(r.b().getResources().getString(R.string.str_pauseing));
        this.f44283r.set(3);
        this.f44274i.setDownload_status(3);
        ObservableField<Integer> observableField = this.f44280o;
        observableField.set(observableField.get());
        k("http://127.0.0.1:" + AppApplication.port + "/download_control?resource=" + this.f44274i.getResource() + "&type=4", 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(long j10) {
        j("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info");
    }

    public void j(String str) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new b());
    }

    public void k(String str, int i10) {
        Log.i("wangyi", "downloadurl：" + str);
        x.a(str, new C0534a());
    }
}
