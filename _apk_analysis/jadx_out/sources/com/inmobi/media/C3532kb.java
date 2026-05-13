package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3532kb implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        tn.p.j(C3582mb.f27620e, "access$getTAG$p(...)");
        C3582mb.f27621f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        C3582mb.f27621f = false;
        tn.p.j(C3582mb.f27620e, "access$getTAG$p(...)");
    }
}
