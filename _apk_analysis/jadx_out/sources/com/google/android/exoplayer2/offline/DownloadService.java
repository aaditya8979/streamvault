package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.HashMap;
import s7.m0;
import s7.q;
import s7.y;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, a> f22010l = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final b f22011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f22012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @StringRes
    public final int f22013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @StringRes
    public final int f22014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f22015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22020k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public DownloadService f22021a;

        public static /* synthetic */ c7.a a(a aVar) {
            aVar.getClass();
            return null;
        }

        public void b(DownloadService downloadService) {
            s7.a.g(this.f22021a == null);
            this.f22021a = downloadService;
            throw null;
        }

        public void c(DownloadService downloadService) {
            s7.a.g(this.f22021a == downloadService);
            this.f22021a = null;
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f22022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DownloadService f22025d;

        private void update() {
            a.a((a) s7.a.e(this.f22025d.f22015f));
            throw null;
        }

        public void a() {
            if (this.f22024c) {
                return;
            }
            update();
        }

        public void b() {
            this.f22023b = false;
            this.f22022a.removeCallbacksAndMessages(null);
        }
    }

    private static void startService(Context context, Intent intent, boolean z10) {
        if (z10) {
            m0.K0(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public abstract c7.a b();

    @Nullable
    public abstract d7.a c();

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f22012c;
        if (str != null) {
            y.a(this, str, this.f22013d, this.f22014e, 2);
        }
        a aVar = f22010l.get(getClass());
        if (aVar != null) {
            this.f22015f = aVar;
            aVar.b(this);
            return;
        }
        boolean z10 = this.f22011b != null;
        boolean z11 = m0.f79487a < 31;
        if (z10 && z11) {
            c();
        }
        b();
        throw null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f22020k = true;
        ((a) s7.a.e(this.f22015f)).c(this);
        b bVar = this.f22011b;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        String action;
        String stringExtra;
        b bVar;
        this.f22016g = i11;
        this.f22018i = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f22017h |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT;
        }
        a.a((a) s7.a.e(this.f22015f));
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                if (((DownloadRequest) ((Intent) s7.a.e(intent)).getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    throw null;
                }
                q.c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                if (((Requirements) ((Intent) s7.a.e(intent)).getParcelableExtra("requirements")) != null) {
                    throw null;
                }
                q.c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) s7.a.e(intent)).hasExtra("stop_reason")) {
                    q.c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    throw null;
                }
                q.c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            default:
                q.c("DownloadService", "Ignored unrecognized action: " + action);
                break;
        }
        if (m0.f79487a >= 26 && this.f22017h && (bVar = this.f22011b) != null) {
            bVar.a();
        }
        this.f22019j = false;
        throw null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f22018i = true;
    }
}
