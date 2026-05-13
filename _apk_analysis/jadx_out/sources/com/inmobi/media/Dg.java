package com.inmobi.media;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Dg {
    public static final void a(Ag ag2, sn.l lVar) {
        tn.p.k(ag2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        tn.p.k(lVar, "block");
        int iOrdinal = ag2.ordinal();
        if (iOrdinal == 0) {
            p000do.i.d(A9.f25148d, null, null, new Bg(lVar, null), 3, null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            p000do.i.d(A9.f25147c, null, null, new Cg(lVar, null), 3, null);
        }
    }
}
