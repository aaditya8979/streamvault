package fh;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import com.yzq.zxinglibrary.R$dimen;
import com.yzq.zxinglibrary.android.CaptureActivityHandler;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import java.io.IOException;
import k8.g;

/* JADX INFO: compiled from: CameraManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f61698n = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f61700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ZxingConfig f61701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Camera f61702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f61703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f61704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f61705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f61706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f61707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f61708j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f61709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f61710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f61711m;

    public c(Context context, ZxingConfig zxingConfig) {
        this.f61699a = context;
        b bVar = new b(context);
        this.f61700b = bVar;
        this.f61711m = new e(bVar);
        this.f61701c = zxingConfig;
    }

    public g a(byte[] bArr, int i10, int i11) {
        Rect rectD = d();
        if (rectD == null) {
            return null;
        }
        if (this.f61701c == null) {
            this.f61701c = new ZxingConfig();
        }
        if (this.f61701c.isFullScreenScan()) {
            return new g(bArr, i10, i11, 0, 0, i10, i11, false);
        }
        return new g(bArr, i10, i11, rectD.left, rectD.top + this.f61699a.getResources().getDimensionPixelSize(R$dimen.toolBarHeight), rectD.width(), rectD.height(), false);
    }

    public synchronized void b() {
        Camera camera = this.f61702d;
        if (camera != null) {
            camera.release();
            this.f61702d = null;
            this.f61704f = null;
            this.f61705g = null;
        }
    }

    public synchronized Rect c() {
        if (this.f61704f == null) {
            if (this.f61702d == null) {
                return null;
            }
            Point pointE = this.f61700b.e();
            if (pointE == null) {
                return null;
            }
            int i10 = pointE.x;
            int i11 = (int) (((double) i10) * 0.6d);
            int i12 = (i10 - i11) / 2;
            int i13 = (pointE.y - i11) / 5;
            this.f61704f = new Rect(i12, i13, i12 + i11, i11 + i13);
            Log.d(f61698n, "Calculated framing rect: " + this.f61704f);
        }
        return this.f61704f;
    }

    public synchronized Rect d() {
        if (this.f61705g == null) {
            Rect rectC = c();
            if (rectC == null) {
                return null;
            }
            Rect rect = new Rect(rectC);
            Point pointC = this.f61700b.c();
            Point pointE = this.f61700b.e();
            if (pointC != null && pointE != null) {
                int i10 = rect.left;
                int i11 = pointC.y;
                int i12 = pointE.x;
                rect.left = (i10 * i11) / i12;
                rect.right = (rect.right * i11) / i12;
                int i13 = rect.top;
                int i14 = pointC.x;
                int i15 = pointE.y;
                rect.top = (i13 * i14) / i15;
                rect.bottom = (rect.bottom * i14) / i15;
                this.f61705g = rect;
            }
            return null;
        }
        return this.f61705g;
    }

    public synchronized boolean e() {
        return this.f61702d != null;
    }

    public synchronized void f(SurfaceHolder surfaceHolder) throws IOException {
        int i10;
        Camera cameraB = this.f61702d;
        if (cameraB == null) {
            int i11 = this.f61708j;
            cameraB = i11 >= 0 ? d.b(i11) : d.a();
            if (cameraB == null) {
                throw new IOException();
            }
            this.f61702d = cameraB;
        }
        cameraB.setPreviewDisplay(surfaceHolder);
        if (!this.f61706h) {
            this.f61706h = true;
            this.f61700b.f(cameraB);
            int i12 = this.f61709k;
            if (i12 > 0 && (i10 = this.f61710l) > 0) {
                h(i12, i10);
                this.f61709k = 0;
                this.f61710l = 0;
            }
        }
        Camera.Parameters parameters = cameraB.getParameters();
        String strFlatten = parameters == null ? null : parameters.flatten();
        try {
            this.f61700b.g(cameraB);
        } catch (RuntimeException unused) {
            String str = f61698n;
            Log.w(str, "Camera rejected parameters. Setting only minimal safe-mode parameters");
            Log.i(str, "Resetting to saved camera params: " + strFlatten);
            if (strFlatten != null) {
                Camera.Parameters parameters2 = cameraB.getParameters();
                parameters2.unflatten(strFlatten);
                try {
                    cameraB.setParameters(parameters2);
                    this.f61700b.g(cameraB);
                } catch (RuntimeException unused2) {
                    Log.w(f61698n, "Camera rejected even safe-mode parameters! No configuration");
                }
            }
        }
    }

    public synchronized void g(Handler handler, int i10) {
        Camera camera = this.f61702d;
        if (camera != null && this.f61707i) {
            this.f61711m.a(handler, i10);
            camera.setOneShotPreviewCallback(this.f61711m);
        }
    }

    public synchronized void h(int i10, int i11) {
        if (this.f61706h) {
            Point pointE = this.f61700b.e();
            int i12 = pointE.x;
            if (i10 > i12) {
                i10 = i12;
            }
            int i13 = pointE.y;
            if (i11 > i13) {
                i11 = i13;
            }
            int i14 = (i12 - i10) / 2;
            int i15 = (i13 - i11) / 5;
            this.f61704f = new Rect(i14, i15, i10 + i14, i11 + i15);
            Log.d(f61698n, "Calculated manual framing rect: " + this.f61704f);
            this.f61705g = null;
        } else {
            this.f61709k = i10;
            this.f61710l = i11;
        }
    }

    public synchronized void i() {
        Camera camera = this.f61702d;
        if (camera != null && !this.f61707i) {
            camera.startPreview();
            this.f61707i = true;
            this.f61703e = new a(this.f61702d);
        }
    }

    public synchronized void j() {
        a aVar = this.f61703e;
        if (aVar != null) {
            aVar.d();
            this.f61703e = null;
        }
        Camera camera = this.f61702d;
        if (camera != null && this.f61707i) {
            camera.stopPreview();
            this.f61711m.a(null, 0);
            this.f61707i = false;
        }
    }

    public void k(CaptureActivityHandler captureActivityHandler) {
        Camera.Parameters parameters = this.f61702d.getParameters();
        Message message = new Message();
        if (parameters.getFlashMode().equals("torch")) {
            parameters.setFlashMode("off");
            message.what = 9;
        } else {
            parameters.setFlashMode("torch");
            message.what = 8;
        }
        this.f61702d.setParameters(parameters);
        captureActivityHandler.sendMessage(message);
    }
}
