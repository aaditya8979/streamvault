package com.unity3d.ads.core.data.datasource;

import com.ironsource.C3978d4;
import com.unity3d.services.core.misc.JsonStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AndroidMediationDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidMediationDataSource implements MediationDataSource {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String MEDIATION_NAME = "name";

    @NotNull
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";

    @NotNull
    private static final String MEDIATION_STORAGE_NAME = "mediation";

    @NotNull
    private static final String MEDIATION_VALUE = "value";

    @NotNull
    private static final String MEDIATION_VERSION = "version";

    @NotNull
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";

    @NotNull
    private final JsonStorage storage;

    /* JADX INFO: compiled from: AndroidMediationDataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AndroidMediationDataSource(@NotNull JsonStorage jsonStorage) {
        p.k(jsonStorage, C3978d4.a.f31215k);
        this.storage = jsonStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    @Nullable
    public String getName() {
        return (String) this.storage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    @Nullable
    public String getVersion() {
        return (String) this.storage.get(MEDIATION_VERSION_KEY);
    }
}
