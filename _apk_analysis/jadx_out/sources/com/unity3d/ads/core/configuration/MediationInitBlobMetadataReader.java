package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: MediationInitBlobMetadataReader.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class MediationInitBlobMetadataReader extends MetadataReader<String> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String MEDIATION_UADS_INIT_BLOB = "mediation.uads_init_blob.value";

    /* JADX INFO: compiled from: MediationInitBlobMetadataReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationInitBlobMetadataReader(@NotNull JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_UADS_INIT_BLOB);
        p.k(jsonStorage, "jsonStorage");
    }
}
