package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f18868e = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f18869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f18870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Choreographer f18871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18872d;

    public g() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f18870b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f18869a = j10;
        this.f18871c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f18871c = Choreographer.getInstance();
            return true;
        }
        if (i10 == 1) {
            int i11 = this.f18872d + 1;
            this.f18872d = i11;
            if (i11 == 1) {
                this.f18871c.postFrameCallback(this);
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        int i12 = this.f18872d - 1;
        this.f18872d = i12;
        if (i12 == 0) {
            this.f18871c.removeFrameCallback(this);
            this.f18869a = 0L;
        }
        return true;
    }
}
