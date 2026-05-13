package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f15999d;

    public g(Context context) {
        super(context);
        this.f15999d = new f(this.f15995b, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a() {
        this.f15999d.a();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15996c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f15996c = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15996c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.add(aVar);
            } catch (Throwable th2) {
                IAlog.a("failed to add networkUpdateListener", th2, new Object[0]);
            }
        }
        this.f15999d.b();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(h hVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15996c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.remove(hVar);
            } catch (Throwable th2) {
                IAlog.a("failed to remove networkUpdateListener", th2, new Object[0]);
            }
        }
        this.f15999d.c();
    }
}
