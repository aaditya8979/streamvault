package com.google.android.gms.internal.ads;

import com.ironsource.C3978d4;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhyr extends zzhys {
    public final /* synthetic */ zzhys zza;

    public /* synthetic */ zzhyr(zzhys zzhysVar, byte[] bArr) {
        Objects.requireNonNull(zzhysVar);
        this.zza = zzhysVar;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 21);
        sb2.append("NullSafeTypeAdapter[");
        sb2.append(string);
        sb2.append(C3978d4.j.f31385e);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    public final void zza(zzhzs zzhzsVar, Object obj) throws IOException {
        throw null;
    }
}
