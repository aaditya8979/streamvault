package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends v0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f17063s = IAlog.a(u0.class);

    public u0(com.fyber.inneractive.sdk.flow.nativead.t tVar, Context context, com.fyber.inneractive.sdk.cache.d dVar) {
        super(tVar, context, dVar);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        o0 o0Var = new o0();
        try {
            o0Var.f17013b = new String(Base64.encode(com.fyber.inneractive.sdk.util.v.a(lVar.f16990c), 0));
            return o0Var;
        } catch (Exception e10) {
            IAlog.b("%s : failed parse cacheable network request", f17063s, e10);
            throw new n0(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final void a(o0 o0Var, String str, String str2) {
        d0 d0Var = this.f17074r;
        if (d0Var == null) {
            IAlog.f("%s: failed to cache file: no cache helper", f17063s);
            return;
        }
        d0Var.b(str2);
        if (o0Var == null || TextUtils.isEmpty(o0Var.f17013b) || TextUtils.isEmpty(str)) {
            IAlog.f("%s: failed to cache file: empty result", f17063s);
            return;
        }
        boolean zA = this.f17074r.a(str, o0Var.f17013b);
        Uri uri = (Uri) this.f17074r.a().f15888a;
        o0Var.f17012a = uri;
        if (zA) {
            this.f17073q.a(uri);
        } else {
            IAlog.b("%s: Failed to cache file", f17063s);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c() {
        this.f17034a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final a i() {
        e0 e0Var = new e0(this.f17072p, this.f17073q, com.fyber.inneractive.sdk.nativead.b.f16935f.f16937b);
        this.f17074r = e0Var;
        com.fyber.inneractive.sdk.cache.m mVarA = e0Var.a();
        String str = mVarA.f15889b;
        Uri uri = (Uri) mVarA.f15888a;
        this.f17073q.c();
        return new a(uri, str);
    }
}
