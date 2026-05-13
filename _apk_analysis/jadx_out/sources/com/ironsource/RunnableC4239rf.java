package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
class RunnableC4239rf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f33427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4033g5 f33428b;

    public RunnableC4239rf(C4033g5 c4033g5, Handler handler) {
        this.f33428b = c4033g5;
        this.f33427a = handler;
    }

    public Message a() {
        return new Message();
    }

    public CallableC3962c6 a(C4033g5 c4033g5, String str, long j10) {
        return new CallableC3962c6(c4033g5, str, j10);
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C8 c82 = new C8(this.f33428b.b().getParent(), this.f33428b.b().getName());
        Message messageA = a();
        messageA.obj = c82;
        String strA = a(c82.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.f33427a.sendMessage(messageA);
        } else {
            C4051h5 c4051h5Call = a(new C4033g5(c82, this.f33428b.e(), this.f33428b.a(), this.f33428b.c(), this.f33428b.f(), this.f33428b.d()), strA, 3L).call();
            messageA.what = c4051h5Call.b() == 200 ? 1016 : c4051h5Call.b();
            this.f33427a.sendMessage(messageA);
        }
    }
}
