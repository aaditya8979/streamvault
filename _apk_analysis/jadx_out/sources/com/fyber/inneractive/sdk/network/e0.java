package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16961e = IAlog.a(e0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.cache.g f16962d;

    public e0(Context context, com.fyber.inneractive.sdk.cache.a aVar, com.fyber.inneractive.sdk.player.cache.g gVar) {
        super(context, aVar);
        this.f16962d = gVar;
    }

    @Override // com.fyber.inneractive.sdk.network.d0
    public final com.fyber.inneractive.sdk.cache.m a() {
        try {
            if (this.f16962d != null && this.f16954b.d()) {
                com.fyber.inneractive.sdk.player.cache.g gVar = this.f16962d;
                String strC = this.f16954b.c();
                gVar.getClass();
                try {
                } catch (Exception e10) {
                    IAlog.f("%s: failure on filePath: %s", IAlog.a(com.fyber.inneractive.sdk.player.cache.g.class), e10);
                }
                if (gVar.f17118i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                if (!com.fyber.inneractive.sdk.player.cache.g.f17108p.matcher(strC).matches()) {
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + strC + "\"");
                }
                com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) gVar.f17119j.get(strC);
                File fileA = eVar == null ? null : eVar.a(0);
                String absolutePath = (fileA == null || !fileA.exists()) ? null : fileA.getAbsolutePath();
                Uri uri = (Uri) this.f16954b.a(absolutePath);
                if (uri == null) {
                    new c0();
                    return new com.fyber.inneractive.sdk.cache.m();
                }
                IAlog.a("Get cached file: %s", absolutePath);
                if (this.f16955c == null) {
                    this.f16955c = this.f16953a.getSharedPreferences("IAConfigurationPreferences", 0);
                }
                return new com.fyber.inneractive.sdk.cache.m(uri, this.f16955c.getString(this.f16954b.b(), null));
            }
            new c0();
            return new com.fyber.inneractive.sdk.cache.m();
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.network.d0
    public final boolean a(String str, String str2) {
        com.fyber.inneractive.sdk.player.cache.g gVar;
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (bArrDecode != null && (gVar = this.f16962d) != null) {
                com.fyber.inneractive.sdk.player.cache.d dVarA = gVar.a(str);
                if (dVarA == null) {
                    IAlog.f("%s: Error getting editor", f16961e);
                    return false;
                }
                dVarA.a(bArrDecode);
                dVarA.a();
                return true;
            }
            IAlog.f("%s: Invalid content", f16961e);
            return false;
        } catch (IOException | IllegalArgumentException e10) {
            IAlog.f("%s: Error writing cache: ", f16961e, e10);
            return false;
        }
    }
}
