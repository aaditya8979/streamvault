package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f37763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f37764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37765c;

    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.same.image.c f37767b;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        public class RunnableC0444a implements Runnable {
            public RunnableC0444a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f37767b.onFailedLoad("create download request error", aVar.f37766a);
            }
        }

        public a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f37766a = str;
            this.f37767b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadRequest downloadRequestA = d.this.a(o0.d(this.f37766a), this.f37766a, null, this.f37767b);
            if (downloadRequestA != null) {
                downloadRequestA.start();
                return;
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "createDownloadRequest error");
            }
            if (this.f37767b == null) {
                return;
            }
            d.this.f37764b.post(new RunnableC0444a());
        }
    }

    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f37770a = new d(null);
    }

    /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
    public static final class c implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f37771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f37772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f37773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f37774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f37775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.same.image.c f37776f;

        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a();
            }
        }

        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f37778a;

            public b(String str) {
                this.f37778a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f37776f.onFailedLoad(c.this.f37775e, this.f37778a);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForFailed error", e10);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CommonImageLoaderRefactor.java */
        public class RunnableC0445c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f37780a;

            public RunnableC0445c(Bitmap bitmap) {
                this.f37780a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f37776f.onSuccessLoad(this.f37780a, c.this.f37775e);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForSuccess error", e10);
                    }
                }
            }
        }

        public c(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f37772b = handler;
            this.f37771a = threadPoolExecutor;
            this.f37775e = str;
            this.f37773c = str2;
            this.f37774d = str3;
            this.f37776f = cVar;
        }

        private Bitmap a(Bitmap bitmap, g gVar) {
            if (gVar == null) {
                return bitmap;
            }
            try {
                return gVar.a(bitmap);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e10);
                }
                return bitmap;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f37776f == null) {
                return;
            }
            try {
                Bitmap bitmapB = d.b(this.f37773c + this.f37774d);
                if (bitmapB == null) {
                    a("bitmap decode failed");
                    return;
                }
                Bitmap bitmapA = a(bitmapB, null);
                if (bitmapA == null) {
                    a("bitmap transformation failed");
                } else {
                    a(bitmapA);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e10.getLocalizedMessage());
                }
                a("bitmap decode failed");
            }
        }

        private void a(Bitmap bitmap) {
            if (this.f37776f == null) {
                return;
            }
            this.f37772b.post(new RunnableC0445c(bitmap));
        }

        private void a(String str) {
            if (this.f37776f == null) {
                return;
            }
            this.f37772b.post(new b(str));
        }

        private void b() {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f37775e + " imagePath = " + this.f37773c + this.f37774d);
                File file = null;
                try {
                    file = new File(this.f37773c + this.f37774d);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "onDownloadComplete error", e10);
                    }
                }
                if (file == null || !file.isFile() || !file.exists()) {
                    q0.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                    return;
                }
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            b();
            this.f37771a.execute(new a());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    private d() {
        this.f37764b = new Handler(Looper.getMainLooper());
        this.f37765c = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG) + File.separator;
        this.f37763a = f.b();
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadRequest<?> a(String str, String str2, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f37712u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f37711t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f37710s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f37765c).withDownloadStateListener(new c(this.f37764b, this.f37763a, str2, this.f37765c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(60000L).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("CommonImageLoaderRefactor", "createDownloadRequest error", e10);
            return null;
        }
    }

    public static d a() {
        return b.f37770a;
    }

    private Runnable a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        return new a(str, gVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public void b(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            this.f37763a.execute(a(str, gVar, cVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "loadImage error", e10);
            }
        }
    }

    public Bitmap c(String str) {
        if (MBridgeConstans.DEBUG) {
            q0.a("CommonImageLoaderRefactor", "getImageBitmapByUrl imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.f37765c + o0.d(str);
        File file = new File(str2);
        if (file.isFile() && file.exists()) {
            try {
                return b(str2);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e10);
                }
            }
        }
        return null;
    }

    public boolean d(String str) {
        if (MBridgeConstans.DEBUG) {
            q0.a("CommonImageLoaderRefactor", "isImageFileExists imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = null;
            try {
                file = new File(this.f37765c + o0.d(str));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e10);
                }
            }
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.exists();
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e11);
            }
            return false;
        }
    }
}
