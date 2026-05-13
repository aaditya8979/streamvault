package com.unity3d.ads.core.domain.work;

import androidx.work.Data;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: UniversalRequestWorkerData.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UniversalRequestWorkerData {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";

    @NotNull
    private final String universalRequestId;

    /* JADX INFO: compiled from: UniversalRequestWorkerData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public UniversalRequestWorkerData(@NotNull String str) {
        p.k(str, KEY_UNIVERSAL_REQUEST_ID);
        this.universalRequestId = str;
    }

    @NotNull
    public final Data invoke() throws Throwable {
        Data dataBuild = new Data.Builder().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        p.j(dataBuild, "Builder()\n            .p…tId)\n            .build()");
        return dataBuild;
    }
}
