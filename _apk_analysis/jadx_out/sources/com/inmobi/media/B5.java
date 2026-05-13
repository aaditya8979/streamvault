package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class B5 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H5 f25201a;

    public B5(H5 h52) {
        this.f25201a = h52;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f25201a) {
            H5 h52 = this.f25201a;
            if (h52.f25579l == null) {
                return null;
            }
            while (h52.f25578k > h52.f25577j) {
                h52.d((String) ((Map.Entry) h52.f25576i.entrySet().iterator().next()).getKey());
            }
            H5 h53 = this.f25201a;
            int i10 = h53.f25580m;
            if (i10 >= 2000 && i10 >= h53.f25576i.size()) {
                this.f25201a.c();
                this.f25201a.f25580m = 0;
            }
            return null;
        }
    }
}
