package com.google.android.exoplayer.offline;

import a6.k0;
import a6.m;
import a6.r;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.exoplayer.offline.a;
import com.google.android.exoplayer.scheduler.Requirements;
import d5.d;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, b> f20335l = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final c f20336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f20337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @StringRes
    public final int f20338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @StringRes
    public final int f20339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer.offline.a f20340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20345k;

    public static final class b implements a.InterfaceC0286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f20346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer.offline.a f20347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final d f20349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class<? extends DownloadService> f20350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public DownloadService f20351f;

        public b(Context context, com.google.android.exoplayer.offline.a aVar, boolean z10, @Nullable d dVar, Class<? extends DownloadService> cls) {
            this.f20346a = context;
            this.f20347b = aVar;
            this.f20348c = z10;
            this.f20349d = dVar;
            this.f20350e = cls;
            aVar.b(this);
            j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(DownloadService downloadService) {
            downloadService.k(this.f20347b.c());
        }

        @Override // com.google.android.exoplayer.offline.a.InterfaceC0286a
        public void a(com.google.android.exoplayer.offline.a aVar, boolean z10) {
            if (!z10 && !aVar.d() && i()) {
                List<b5.a> listC = aVar.c();
                int i10 = 0;
                while (true) {
                    if (i10 >= listC.size()) {
                        break;
                    }
                    if (listC.get(i10).f5398a == 0) {
                        h();
                        break;
                    }
                    i10++;
                }
            }
            j();
        }

        public void e(final DownloadService downloadService) {
            a6.a.f(this.f20351f == null);
            this.f20351f = downloadService;
            if (this.f20347b.g()) {
                new Handler().postAtFrontOfQueue(new Runnable() { // from class: b5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5399b.g(downloadService);
                    }
                });
            }
        }

        public void f(DownloadService downloadService) {
            a6.a.f(this.f20351f == downloadService);
            this.f20351f = null;
            if (this.f20349d == null || this.f20347b.h()) {
                return;
            }
            this.f20349d.cancel();
        }

        public final void h() {
            if (this.f20348c) {
                k0.G0(this.f20346a, DownloadService.g(this.f20346a, this.f20350e, "com.google.android.exoplayer.downloadService.action.RESTART"));
            } else {
                try {
                    this.f20346a.startService(DownloadService.g(this.f20346a, this.f20350e, com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT));
                } catch (IllegalStateException unused) {
                    m.h("DownloadService", "Failed to restart DownloadService (process is idle).");
                }
            }
        }

        public final boolean i() {
            DownloadService downloadService = this.f20351f;
            return downloadService == null || downloadService.i();
        }

        public final void j() {
            if (this.f20349d == null) {
                return;
            }
            if (!this.f20347b.h()) {
                this.f20349d.cancel();
                return;
            }
            String packageName = this.f20346a.getPackageName();
            if (this.f20349d.a(this.f20347b.e(), packageName, "com.google.android.exoplayer.downloadService.action.RESTART")) {
                return;
            }
            m.c("DownloadService", "Scheduling downloads failed.");
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f20354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ DownloadService f20357f;

        /* JADX INFO: Access modifiers changed from: private */
        public void update() {
            List<b5.a> listC = ((com.google.android.exoplayer.offline.a) a6.a.e(this.f20357f.f20340f)).c();
            DownloadService downloadService = this.f20357f;
            downloadService.startForeground(this.f20352a, downloadService.f(listC));
            this.f20356e = true;
            if (this.f20355d) {
                this.f20354c.removeCallbacksAndMessages(null);
                this.f20354c.postDelayed(new Runnable() { // from class: b5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5401b.update();
                    }
                }, this.f20353b);
            }
        }

        public void b() {
            if (this.f20356e) {
                return;
            }
            update();
        }

        public void c() {
            this.f20355d = true;
            update();
        }

        public void d() {
            this.f20355d = false;
            this.f20354c.removeCallbacksAndMessages(null);
        }
    }

    public static Intent g(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    public static boolean j(int i10) {
        return i10 == 2 || i10 == 5 || i10 == 7;
    }

    private static void startService(Context context, Intent intent, boolean z10) {
        if (z10) {
            k0.G0(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public abstract com.google.android.exoplayer.offline.a e();

    public abstract Notification f(List<b5.a> list);

    @Nullable
    public abstract d h();

    public final boolean i() {
        return this.f20344j;
    }

    public final void k(List<b5.a> list) {
        if (this.f20336b != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (j(list.get(i10).f5398a)) {
                    this.f20336b.c();
                    return;
                }
            }
        }
    }

    public final void l() {
        c cVar = this.f20336b;
        if (cVar != null) {
            cVar.d();
        }
        if (k0.f3574a >= 28 || !this.f20343i) {
            this.f20344j |= stopSelfResult(this.f20341g);
        } else {
            stopSelf();
            this.f20344j = true;
        }
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f20337c;
        if (str != null) {
            r.a(this, str, this.f20338d, this.f20339e, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, b> map = f20335l;
        b bVar = map.get(cls);
        if (bVar == null) {
            boolean z10 = this.f20336b != null;
            d dVarH = z10 ? h() : null;
            com.google.android.exoplayer.offline.a aVarE = e();
            this.f20340f = aVarE;
            aVarE.n();
            bVar = new b(getApplicationContext(), this.f20340f, z10, dVarH, cls);
            map.put((Class<? extends DownloadService>) cls, bVar);
        } else {
            this.f20340f = bVar.f20347b;
        }
        bVar.e(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f20345k = true;
        ((b) a6.a.e(f20335l.get(getClass()))).f(this);
        c cVar = this.f20336b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        String action;
        String stringExtra;
        com.google.android.exoplayer.offline.a aVar;
        c cVar;
        this.f20341g = i11;
        this.f20343i = false;
        action = null;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f20342h |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            stringExtra = null;
        }
        if (action == null) {
            action = com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT;
        }
        aVar = (com.google.android.exoplayer.offline.a) a6.a.e(this.f20340f);
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) a6.a.e(intent)).getParcelableExtra("download_request");
                if (downloadRequest != null) {
                    aVar.a(downloadRequest, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    m.c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                aVar.n();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                aVar.l();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) a6.a.e(intent)).getParcelableExtra("requirements");
                if (requirements != null) {
                    aVar.p(requirements);
                    break;
                } else {
                    m.c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                aVar.k();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) a6.a.e(intent)).hasExtra("stop_reason")) {
                    m.c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    aVar.q(stringExtra, intent.getIntExtra("stop_reason", 0));
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    aVar.m(stringExtra);
                    break;
                } else {
                    m.c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
                break;
            default:
                m.c("DownloadService", "Ignored unrecognized action: " + action);
                break;
        }
        if (k0.f3574a >= 26 && this.f20342h && (cVar = this.f20336b) != null) {
            cVar.b();
        }
        this.f20344j = false;
        if (aVar.f()) {
            l();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f20343i = true;
    }
}
