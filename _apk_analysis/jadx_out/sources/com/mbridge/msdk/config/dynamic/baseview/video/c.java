package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* JADX INFO: compiled from: LocalVideoFileMonitor.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SimpleExoPlayer f36641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f36643e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36639a = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f36644f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f36645g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36646h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f36647i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f36648j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f36649k = new a();

    /* JADX INFO: compiled from: LocalVideoFileMonitor.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b();
        }
    }

    public c(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.f36640b = context;
        this.f36641c = simpleExoPlayer;
    }

    private void a() {
        this.f36648j.removeCallbacks(this.f36649k);
    }

    private void a(File file) {
        q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long jLastModified = file.lastModified();
        long j10 = this.f36646h;
        boolean z10 = (j10 == 0 || length == j10) ? false : true;
        long j11 = this.f36647i;
        boolean z11 = (j11 == 0 || jLastModified == j11) ? false : true;
        this.f36646h = length;
        this.f36647i = jLastModified;
        if (z10 || z11) {
            q0.b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            e();
        } else if (System.currentTimeMillis() - this.f36644f < this.f36639a) {
            this.f36648j.postDelayed(this.f36649k, 1000L);
        } else {
            a("resource buffer time out");
        }
    }

    private void a(String str) {
        q0.b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f36643e;
        if (aVar != null) {
            aVar.onBufferingTimeOut(str);
            this.f36643e.onPlayError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        q0.b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.f36642d);
            if (file.exists()) {
                a(file);
            } else {
                q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
                if (System.currentTimeMillis() - this.f36644f < this.f36639a) {
                    this.f36648j.postDelayed(this.f36649k, 1000L);
                } else {
                    a("resource buffer exception file is not found");
                }
            }
        } catch (Exception e10) {
            a("resource buffer exception" + e10.getMessage());
        }
    }

    private void d() {
        this.f36644f = 0L;
        this.f36645g = 0L;
        this.f36646h = 0L;
        this.f36647i = 0L;
    }

    private void e() {
        if (this.f36641c != null) {
            com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f36643e;
            if (aVar != null) {
                aVar.onBufferingEnd();
            }
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f36640b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.f36642d));
            this.f36641c.setRepeatMode(0);
            this.f36641c.prepare(extractorMediaSourceCreateMediaSource);
            this.f36641c.seekTo(this.f36645g);
            this.f36641c.setPlayWhenReady(true);
        }
        a();
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.baseview.video.a aVar, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f36643e = aVar;
        if (i10 > 0) {
            this.f36639a = i10 * 1000;
        }
        this.f36642d = str;
    }

    public boolean a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        q0.b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        d();
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f36643e;
        if (aVar != null) {
            aVar.onBufferingStart();
        }
        this.f36644f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.f36641c;
        if (simpleExoPlayer != null) {
            this.f36645g = simpleExoPlayer.getCurrentPosition();
        }
        this.f36648j.post(this.f36649k);
        return true;
    }

    public void c() {
        a();
        this.f36645g = 0L;
        this.f36646h = 0L;
        this.f36647i = 0L;
        this.f36640b = null;
        this.f36641c = null;
        this.f36643e = null;
    }
}
