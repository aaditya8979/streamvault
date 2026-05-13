package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0 f16500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f16501b;

    public a(w0 w0Var) {
        this.f16500a = w0Var;
    }

    public final void a() {
        b bVar = this.f16501b;
        if (bVar != null) {
            IAlog.a("%sDestroy called", b.f16502e);
            Handler handler = bVar.f16506d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                bVar.f16506d = null;
            }
            m mVar = bVar.f16505c;
            if (mVar != null) {
                v.a(mVar);
                mVar.destroy();
                bVar.f16505c = null;
            }
            bVar.f16504b = null;
            this.f16501b = null;
        }
        this.f16500a = null;
    }

    public final void a(c cVar) {
        for (String str : this.f16500a.f16693w) {
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("%sHitting URL: %s", IAlog.a(this), str);
                z0.b(str);
            }
        }
        b bVar = new b(this.f16500a.f16694x, cVar);
        this.f16501b = bVar;
        if (bVar.f16506d == null || bVar.f16505c == null) {
            IAlog.b("%sWas destroyed, create a new instance", b.f16502e);
        } else {
            bVar.a();
        }
    }
}
