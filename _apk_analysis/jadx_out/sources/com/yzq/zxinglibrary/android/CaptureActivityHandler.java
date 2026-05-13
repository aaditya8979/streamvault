package com.yzq.zxinglibrary.android;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import fh.c;
import gh.f;
import ih.a;
import k8.i;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureActivityHandler extends Handler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f59334e = CaptureActivityHandler.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureActivity f59335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f59336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public State f59337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f59338d;

    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureActivityHandler(CaptureActivity captureActivity, c cVar) {
        this.f59335a = captureActivity;
        f fVar = new f(captureActivity, new a(captureActivity.getViewfinderView()));
        this.f59336b = fVar;
        fVar.start();
        this.f59337c = State.SUCCESS;
        this.f59338d = cVar;
        cVar.i();
        b();
    }

    public void a() {
        this.f59337c = State.DONE;
        this.f59338d.j();
        Message.obtain(this.f59336b.a(), 5).sendToTarget();
        try {
            this.f59336b.join(500L);
        } catch (InterruptedException unused) {
        }
        removeMessages(3);
        removeMessages(2);
    }

    public void b() {
        if (this.f59337c == State.SUCCESS) {
            this.f59337c = State.PREVIEW;
            this.f59338d.g(this.f59336b.a(), 1);
            this.f59335a.drawViewfinder();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 2) {
            this.f59337c = State.PREVIEW;
            this.f59338d.g(this.f59336b.a(), 1);
        }
        if (i10 == 3) {
            this.f59337c = State.SUCCESS;
            this.f59335a.handleDecode((i) message.obj);
            return;
        }
        switch (i10) {
            case 6:
                b();
                break;
            case 7:
                this.f59335a.setResult(-1, (Intent) message.obj);
                this.f59335a.finish();
                break;
            case 8:
                this.f59335a.switchFlashImg(8);
                break;
            case 9:
                this.f59335a.switchFlashImg(9);
                break;
        }
    }
}
