package com.opensource.svgaplayer;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.http.HttpResponseCache;
import android.os.Handler;
import android.os.Looper;
import bn.r;
import bo.d0;
import com.opensource.svgaplayer.proto.MovieEntity;
import ge.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import on.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SVGAParser.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 52\u00020\u0001:\u0003\u001e6(B\u0011\u0012\b\u00102\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b3\u00104J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J \u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J \u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J*\u0010!\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0016\u0010)\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00067"}, d2 = {"Lcom/opensource/svgaplayer/SVGAParser;", "", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "Lcom/opensource/svgaplayer/SVGAParser$c;", "callback", "Lbn/r;", "u", "Ljava/lang/Exception;", "e", "v", "", "cacheKey", "o", "Ljava/io/InputStream;", "inputStream", "", "w", "byteArray", "t", VastAttributes.HORIZONTAL_POSITION, "name", "n", "Ljava/net/URL;", "url", "Lkotlin/Function0;", "r", "a", "error", "s", "b", "", "closeInputStream", "p", "Landroid/content/Context;", "Landroid/content/Context;", "mContext", "", "I", "mFrameWidth", "c", "mFrameHeight", "Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;", "d", "Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;", "getFileDownloader", "()Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;", "setFileDownloader", "(Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;)V", "fileDownloader", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;)V", "h", "FileDownloader", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class SVGAParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public volatile int mFrameWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public volatile int mFrameHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FileDownloader fileDownloader;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f51137e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static SVGAParser f51138f = new SVGAParser(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ExecutorService f51139g = Executors.newCachedThreadPool(a.f51157b);

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00060\u0004H\u0016R\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/opensource/svgaplayer/SVGAParser$FileDownloader;", "", "Ljava/net/URL;", "url", "Lkotlin/Function1;", "Ljava/io/InputStream;", "Lbn/r;", "complete", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failure", "Lkotlin/Function0;", "b", "", "a", "Z", "()Z", "setNoCache", "(Z)V", "noCache", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public static class FileDownloader {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean noCache;

        /* JADX INFO: compiled from: SVGAParser.kt */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbn/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ URL f51147c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ref$BooleanRef f51148d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ l f51149e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ l f51150f;

            public a(URL url, Ref$BooleanRef ref$BooleanRef, l lVar, l lVar2) {
                this.f51147c = url;
                this.f51148d = ref$BooleanRef;
                this.f51149e = lVar;
                this.f51150f = lVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ge.c cVar = ge.c.f62370a;
                    cVar.d("SVGAParser", "================ svga file download start ================");
                    if (HttpResponseCache.getInstalled() == null && !FileDownloader.this.getNoCache()) {
                        cVar.b("SVGAParser", "SVGAParser can not handle cache before install HttpResponseCache. see https://github.com/yyued/SVGAPlayer-Android#cache");
                        cVar.b("SVGAParser", "在配置 HttpResponseCache 前 SVGAParser 无法缓存. 查看 https://github.com/yyued/SVGAPlayer-Android#cache ");
                    }
                    URLConnection uRLConnectionOpenConnection = this.f51147c.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        uRLConnectionOpenConnection = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.setConnectTimeout(20000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                if (this.f51148d.element) {
                                    ge.c.f62370a.e("SVGAParser", "================ svga file download canceled ================");
                                    break;
                                }
                                int i10 = inputStream.read(bArr, 0, 4096);
                                if (i10 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i10);
                                }
                            }
                            if (this.f51148d.element) {
                                ge.c.f62370a.e("SVGAParser", "================ svga file download canceled ================");
                                b.a(byteArrayOutputStream, null);
                                b.a(inputStream, null);
                                return;
                            }
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                            try {
                                ge.c.f62370a.d("SVGAParser", "================ svga file download complete ================");
                                this.f51149e.invoke(byteArrayInputStream);
                                r rVar = r.f5635a;
                                b.a(byteArrayInputStream, null);
                                b.a(byteArrayOutputStream, null);
                                b.a(inputStream, null);
                                return;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e10) {
                    ge.c cVar2 = ge.c.f62370a;
                    cVar2.b("SVGAParser", "================ svga file download fail ================");
                    cVar2.b("SVGAParser", "error: " + e10.getMessage());
                    e10.printStackTrace();
                    this.f51150f.invoke(e10);
                }
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNoCache() {
            return this.noCache;
        }

        @NotNull
        public sn.a<r> b(@NotNull URL url, @NotNull l<? super InputStream, r> lVar, @NotNull l<? super Exception, r> lVar2) {
            p.l(url, "url");
            p.l(lVar, "complete");
            p.l(lVar2, "failure");
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = false;
            sn.a<r> aVar = new sn.a<r>() { // from class: com.opensource.svgaplayer.SVGAParser$FileDownloader$resume$cancelBlock$1
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ref$BooleanRef.element = true;
                }
            };
            SVGAParser.INSTANCE.a().execute(new a(url, ref$BooleanRef, lVar, lVar2));
            return aVar;
        }
    }

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "newThread"}, k = 3, mv = {1, 1, 15})
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f51157b = new a();

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "SVGAParser-Thread-" + SVGAParser.f51137e.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/opensource/svgaplayer/SVGAParser$b;", "", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "threadPoolExecutor", "Ljava/util/concurrent/ExecutorService;", "a", "()Ljava/util/concurrent/ExecutorService;", "setThreadPoolExecutor$com_opensource_svgaplayer", "(Ljava/util/concurrent/ExecutorService;)V", "", "TAG", "Ljava/lang/String;", "Lcom/opensource/svgaplayer/SVGAParser;", "mShareParser", "Lcom/opensource/svgaplayer/SVGAParser;", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNum", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final ExecutorService a() {
            return SVGAParser.f51139g;
        }
    }

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/opensource/svgaplayer/SVGAParser$c;", "", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "Lbn/r;", "a", "onError", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public interface c {
        void a(@NotNull SVGAVideoEntity sVGAVideoEntity);

        void onError();
    }

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbn/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f51160d;

        public d(String str, c cVar) {
            this.f51159c = str;
            this.f51160d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AssetManager assets;
            InputStream inputStreamOpen;
            Context context = SVGAParser.this.mContext;
            if (context == null || (assets = context.getAssets()) == null || (inputStreamOpen = assets.open(this.f51159c)) == null) {
                return;
            }
            SVGAParser.this.p(inputStreamOpen, SVGACache.f51114c.c("file:///assets/" + this.f51159c), this.f51160d, true);
        }
    }

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbn/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f51168d;

        public e(String str, c cVar) {
            this.f51167c = str;
            this.f51168d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SVGACache.f51114c.g()) {
                SVGAParser.this.o(this.f51167c, this.f51168d);
            } else {
                SVGAParser.this.a(this.f51167c, this.f51168d);
            }
        }
    }

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbn/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f51169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SVGAVideoEntity f51170c;

        public f(c cVar, SVGAVideoEntity sVGAVideoEntity) {
            this.f51169b = cVar;
            this.f51170c = sVGAVideoEntity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ge.c.f62370a.d("SVGAParser", "================ parser complete ================");
            c cVar = this.f51169b;
            if (cVar != null) {
                cVar.a(this.f51170c);
            }
        }
    }

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbn/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f51171b;

        public g(c cVar) {
            this.f51171b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = this.f51171b;
            if (cVar != null) {
                cVar.onError();
            }
        }
    }

    public SVGAParser(@Nullable Context context) {
        this.mContext = context != null ? context.getApplicationContext() : null;
        SVGACache.f51114c.i(context);
        this.fileDownloader = new FileDownloader();
    }

    public static /* synthetic */ void q(SVGAParser sVGAParser, InputStream inputStream, String str, c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        sVGAParser.p(inputStream, str, cVar, z10);
    }

    public final void a(@NotNull final String str, @Nullable final c cVar) {
        FileInputStream fileInputStream;
        p.l(str, "cacheKey");
        File fileE = SVGACache.f51114c.e(str);
        try {
            try {
                ge.c cVar2 = ge.c.f62370a;
                cVar2.d("SVGAParser", "cache.binary change to entity");
                fileInputStream = new FileInputStream(fileE);
                try {
                    try {
                        byte[] bArrW = w(fileInputStream);
                        if (bArrW != null) {
                            cVar2.d("SVGAParser", "cache.inflate start");
                            byte[] bArrT = t(bArrW);
                            if (bArrT != null) {
                                cVar2.d("SVGAParser", "cache.inflate success");
                                MovieEntity movieEntityF = MovieEntity.ADAPTER.f(bArrT);
                                p.g(movieEntityF, "MovieEntity.ADAPTER.decode(inflateBytes)");
                                final SVGAVideoEntity sVGAVideoEntity = new SVGAVideoEntity(movieEntityF, new File(str), this.mFrameWidth, this.mFrameHeight);
                                sVGAVideoEntity.t(new sn.a<r>() { // from class: com.opensource.svgaplayer.SVGAParser$_decodeFromCacheKey$$inlined$use$lambda$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // sn.a
                                    public /* bridge */ /* synthetic */ r invoke() {
                                        invoke2();
                                        return r.f5635a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        c.f62370a.d("SVGAParser", "cache.prepare success");
                                        this.u(sVGAVideoEntity, cVar);
                                    }
                                });
                            } else {
                                s("cache.inflate(bytes) cause exception", cVar);
                            }
                        } else {
                            s("cache.readAsBytes(inputStream) cause exception", cVar);
                        }
                    } finally {
                    }
                } catch (Exception e10) {
                    v(e10, cVar);
                }
                r rVar = r.f5635a;
                b.a(fileInputStream, null);
            } finally {
                fileInputStream.close();
            }
        } catch (Exception e11) {
            ge.c.f62370a.c("SVGAParser", "cache.binary change to entity fail", e11);
            if (!fileE.exists()) {
                fileE = null;
            }
            if (fileE != null) {
                fileE.delete();
            }
            v(e11, cVar);
        }
    }

    public final void b(@NotNull InputStream inputStream, @NotNull String str, @Nullable c cVar) {
        p.l(inputStream, "inputStream");
        p.l(str, "cacheKey");
        f51139g.execute(new SVGAParser$_decodeFromInputStream$1(this, inputStream, str, cVar));
    }

    public final void n(@NotNull String str, @Nullable c cVar) {
        p.l(str, "name");
        if (this.mContext == null) {
            ge.c.f62370a.b("SVGAParser", "在配置 SVGAParser context 前, 无法解析 SVGA 文件。");
            return;
        }
        try {
            ge.c.f62370a.d("SVGAParser", "================ decode from assets ================");
            f51139g.execute(new d(str, cVar));
        } catch (Exception e10) {
            v(e10, cVar);
        }
    }

    public final void o(String str, c cVar) {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        File cacheDir;
        ge.c cVar2 = ge.c.f62370a;
        cVar2.d("SVGAParser", "================ decode from cache ================");
        cVar2.a("SVGAParser", "decodeFromCacheKey called with cacheKey : " + str);
        if (this.mContext == null) {
            cVar2.b("SVGAParser", "在配置 SVGAParser context 前, 无法解析 SVGA 文件。");
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Context context = this.mContext;
            sb2.append((context == null || (cacheDir = context.getCacheDir()) == null) ? null : cacheDir.getAbsolutePath());
            sb2.append("/");
            sb2.append(str);
            sb2.append("/");
            File file = new File(sb2.toString());
            File file2 = new File(file, "movie.binary");
            if (!file2.isFile()) {
                file2 = null;
            }
            if (file2 != null) {
                try {
                    cVar2.d("SVGAParser", "binary change to entity");
                    fileInputStream = new FileInputStream(file2);
                    try {
                        cVar2.d("SVGAParser", "binary change to entity success");
                        MovieEntity movieEntityC = MovieEntity.ADAPTER.c(fileInputStream);
                        p.g(movieEntityC, "MovieEntity.ADAPTER.decode(it)");
                        u(new SVGAVideoEntity(movieEntityC, file, this.mFrameWidth, this.mFrameHeight), cVar);
                        r rVar = r.f5635a;
                        b.a(fileInputStream, null);
                    } finally {
                    }
                } catch (Exception e10) {
                    ge.c.f62370a.c("SVGAParser", "binary change to entity fail", e10);
                    file.delete();
                    file2.delete();
                    throw e10;
                }
            }
            File file3 = new File(file, "movie.spec");
            if (!file3.isFile()) {
                file3 = null;
            }
            if (file3 != null) {
                try {
                    cVar2.d("SVGAParser", "spec change to entity");
                    fileInputStream = new FileInputStream(file3);
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            bArr = new byte[2048];
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                    while (true) {
                        int i10 = fileInputStream.read(bArr, 0, 2048);
                        if (i10 == -1) {
                            JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                            ge.c.f62370a.d("SVGAParser", "spec change to entity success");
                            u(new SVGAVideoEntity(jSONObject, file, this.mFrameWidth, this.mFrameHeight), cVar);
                            r rVar2 = r.f5635a;
                            b.a(byteArrayOutputStream, null);
                            b.a(fileInputStream, null);
                            return;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                        throw th;
                    }
                } catch (Exception e11) {
                    ge.c.f62370a.c("SVGAParser", "spec change to entity fail", e11);
                    file.delete();
                    file3.delete();
                    throw e11;
                }
            }
        } catch (Exception e12) {
            v(e12, cVar);
        }
    }

    public final void p(@NotNull InputStream inputStream, @NotNull String str, @Nullable c cVar, boolean z10) {
        p.l(inputStream, "inputStream");
        p.l(str, "cacheKey");
        if (this.mContext == null) {
            ge.c.f62370a.b("SVGAParser", "在配置 SVGAParser context 前, 无法解析 SVGA 文件。");
        } else {
            ge.c.f62370a.d("SVGAParser", "================ decode from input stream ================");
            f51139g.execute(new SVGAParser$decodeFromInputStream$1(this, inputStream, str, cVar, z10));
        }
    }

    @Nullable
    public final sn.a<r> r(@NotNull URL url, @Nullable final c cVar) {
        p.l(url, "url");
        if (this.mContext == null) {
            ge.c.f62370a.b("SVGAParser", "在配置 SVGAParser context 前, 无法解析 SVGA 文件。");
            return null;
        }
        ge.c cVar2 = ge.c.f62370a;
        cVar2.d("SVGAParser", "================ decode from url ================");
        SVGACache sVGACache = SVGACache.f51114c;
        final String strD = sVGACache.d(url);
        if (!sVGACache.f(strD)) {
            cVar2.d("SVGAParser", "no cached, prepare to download");
            return this.fileDownloader.b(url, new l<InputStream, r>() { // from class: com.opensource.svgaplayer.SVGAParser$decodeFromURL$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(InputStream inputStream) {
                    invoke2(inputStream);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InputStream inputStream) {
                    p.l(inputStream, "it");
                    if (SVGACache.f51114c.g()) {
                        SVGAParser.q(this.this$0, inputStream, strD, cVar, false, 8, null);
                    } else {
                        this.this$0.b(inputStream, strD, cVar);
                    }
                }
            }, new l<Exception, r>() { // from class: com.opensource.svgaplayer.SVGAParser$decodeFromURL$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Exception exc) {
                    invoke2(exc);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception exc) {
                    p.l(exc, "it");
                    this.this$0.v(exc, cVar);
                }
            });
        }
        cVar2.d("SVGAParser", "this url cached");
        f51139g.execute(new e(strD, cVar));
        return null;
    }

    public final void s(@NotNull String str, @Nullable c cVar) {
        p.l(str, "error");
        ge.c.f62370a.d("SVGAParser", str);
        v(new Exception(str), cVar);
    }

    public final byte[] t(byte[] byteArray) throws IOException {
        Inflater inflater = new Inflater();
        inflater.setInput(byteArray, 0, byteArray.length);
        byte[] bArr = new byte[2048];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int iInflate = inflater.inflate(bArr, 0, 2048);
                if (iInflate <= 0) {
                    inflater.end();
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    b.a(byteArrayOutputStream, null);
                    return byteArray2;
                }
                byteArrayOutputStream.write(bArr, 0, iInflate);
            } finally {
            }
        }
    }

    public final void u(SVGAVideoEntity sVGAVideoEntity, c cVar) {
        new Handler(Looper.getMainLooper()).post(new f(cVar, sVGAVideoEntity));
    }

    public final void v(Exception exc, c cVar) {
        exc.printStackTrace();
        ge.c cVar2 = ge.c.f62370a;
        cVar2.b("SVGAParser", "================ parser error ================");
        cVar2.c("SVGAParser", "error", exc);
        new Handler(Looper.getMainLooper()).post(new g(cVar));
    }

    public final byte[] w(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i10 = inputStream.read(bArr, 0, 2048);
                if (i10 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    b.a(byteArrayOutputStream, null);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } finally {
        }
    }

    public final void x(InputStream inputStream, String str) throws Exception {
        ZipInputStream zipInputStream;
        ge.c.f62370a.d("SVGAParser", "================ unzip prepare ================");
        File fileB = SVGACache.f51114c.b(str);
        fileB.mkdirs();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                zipInputStream = new ZipInputStream(bufferedInputStream);
            } finally {
            }
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        r rVar = r.f5635a;
                        b.a(zipInputStream, null);
                        b.a(bufferedInputStream, null);
                        return;
                    }
                    String name = nextEntry.getName();
                    p.g(name, "zipItem.name");
                    if (!d0.c0(name, "../", false, 2, null)) {
                        String name2 = nextEntry.getName();
                        p.g(name2, "zipItem.name");
                        if (!d0.c0(name2, "/", false, 2, null)) {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, nextEntry.getName()));
                            try {
                                byte[] bArr = new byte[2048];
                                while (true) {
                                    int i10 = zipInputStream.read(bArr);
                                    if (i10 <= 0) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i10);
                                    }
                                }
                                r rVar2 = r.f5635a;
                                b.a(fileOutputStream, null);
                                ge.c.f62370a.b("SVGAParser", "================ unzip complete ================");
                                zipInputStream.closeEntry();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            ge.c cVar = ge.c.f62370a;
            cVar.b("SVGAParser", "================ unzip error ================");
            cVar.c("SVGAParser", "error", e10);
            fileB.delete();
            throw e10;
        }
    }
}
