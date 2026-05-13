package b6;

import a6.k0;
import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: VideoFrameReleaseTimeHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f5451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5462l;

    /* JADX INFO: compiled from: VideoFrameReleaseTimeHelper.java */
    @TargetApi(17)
    public final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DisplayManager f5463b;

        public a(DisplayManager displayManager) {
            this.f5463b = displayManager;
        }

        public void a() {
            this.f5463b.registerDisplayListener(this, null);
        }

        public void b() {
            this.f5463b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                h.this.h();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseTimeHelper.java */
    public static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f5465g = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f5466b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f5467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HandlerThread f5468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Choreographer f5469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5470f;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f5468d = handlerThread;
            handlerThread.start();
            Handler handlerW = k0.w(handlerThread.getLooper(), this);
            this.f5467c = handlerW;
            handlerW.sendEmptyMessage(0);
        }

        public static b d() {
            return f5465g;
        }

        public void a() {
            this.f5467c.sendEmptyMessage(1);
        }

        public final void b() {
            int i10 = this.f5470f + 1;
            this.f5470f = i10;
            if (i10 == 1) {
                this.f5469e.postFrameCallback(this);
            }
        }

        public final void c() {
            this.f5469e = Choreographer.getInstance();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f5466b = j10;
            this.f5469e.postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f5467c.sendEmptyMessage(2);
        }

        public final void f() {
            int i10 = this.f5470f - 1;
            this.f5470f = i10;
            if (i10 == 0) {
                this.f5469e.removeFrameCallback(this);
                this.f5466b = -9223372036854775807L;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            }
            if (i10 == 1) {
                b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public h(@Nullable Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f5451a = (WindowManager) context.getSystemService("window");
        } else {
            this.f5451a = null;
        }
        if (this.f5451a != null) {
            this.f5453c = k0.f3574a >= 17 ? g(context) : null;
            this.f5452b = b.d();
        } else {
            this.f5453c = null;
            this.f5452b = null;
        }
        this.f5454d = -9223372036854775807L;
        this.f5455e = -9223372036854775807L;
    }

    public static long c(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    public long b(long j10, long j11) {
        long j12;
        long j13;
        long j14 = 1000 * j10;
        if (this.f5459i) {
            if (j10 != this.f5456f) {
                this.f5462l++;
                this.f5457g = this.f5458h;
            }
            long j15 = this.f5462l;
            if (j15 >= 6) {
                j13 = this.f5457g + ((j14 - this.f5461k) / j15);
                if (f(j13, j11)) {
                    this.f5459i = false;
                } else {
                    j12 = (this.f5460j + j13) - this.f5461k;
                }
            } else if (f(j14, j11)) {
                this.f5459i = false;
            }
            j12 = j11;
            j13 = j14;
        } else {
            j12 = j11;
            j13 = j14;
        }
        if (!this.f5459i) {
            this.f5461k = j14;
            this.f5460j = j11;
            this.f5462l = 0L;
            this.f5459i = true;
        }
        this.f5456f = j10;
        this.f5458h = j13;
        b bVar = this.f5452b;
        if (bVar == null || this.f5454d == -9223372036854775807L) {
            return j12;
        }
        long j16 = bVar.f5466b;
        return j16 == -9223372036854775807L ? j12 : c(j12, j16, this.f5454d) - this.f5455e;
    }

    public void d() {
        if (this.f5451a != null) {
            a aVar = this.f5453c;
            if (aVar != null) {
                aVar.b();
            }
            this.f5452b.e();
        }
    }

    public void e() {
        this.f5459i = false;
        if (this.f5451a != null) {
            this.f5452b.a();
            a aVar = this.f5453c;
            if (aVar != null) {
                aVar.a();
            }
            h();
        }
    }

    public final boolean f(long j10, long j11) {
        return Math.abs((j11 - this.f5460j) - (j10 - this.f5461k)) > 20000000;
    }

    @TargetApi(17)
    public final a g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    public final void h() {
        Display defaultDisplay = this.f5451a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f5454d = refreshRate;
            this.f5455e = (refreshRate * 80) / 100;
        }
    }
}
