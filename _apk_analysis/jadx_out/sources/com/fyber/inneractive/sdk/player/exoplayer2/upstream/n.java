package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3978d4;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f18713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f18714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f18715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f18716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f18717e;

    public n(Context context, m mVar, h hVar) {
        hVar.getClass();
        this.f18713a = hVar;
        this.f18714b = new s(mVar);
        this.f18715c = new d(context, mVar);
        this.f18716d = new f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        if (this.f18717e != null) {
            throw new IllegalStateException();
        }
        String scheme = kVar.f18696a.getScheme();
        Uri uri = kVar.f18696a;
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f18822a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals(C3978d4.i.f31327b)) {
            if (kVar.f18696a.getPath().startsWith("/android_asset/")) {
                this.f18717e = this.f18715c;
            } else {
                this.f18717e = this.f18714b;
            }
        } else if ("asset".equals(scheme)) {
            this.f18717e = this.f18715c;
        } else if ("content".equals(scheme)) {
            this.f18717e = this.f18716d;
        } else {
            this.f18717e = this.f18713a;
        }
        return this.f18717e.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        h hVar = this.f18717e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        h hVar = this.f18717e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f18717e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f18717e.read(bArr, i10, i11);
    }
}
