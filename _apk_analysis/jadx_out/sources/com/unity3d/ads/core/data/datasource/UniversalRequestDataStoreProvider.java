package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.ServiceProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.j2;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: UniversalRequestDataStoreProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UniversalRequestDataStoreProvider {

    @Nullable
    private DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> cachedDataStore;

    @NotNull
    private final Context context;

    @NotNull
    private final h0 dispatcher;

    public UniversalRequestDataStoreProvider(@NotNull Context context, @NotNull h0 h0Var) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(h0Var, "dispatcher");
        this.context = context;
        this.dispatcher = h0Var;
    }

    private final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore() {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new UniversalRequestStoreSerializer(), new ReplaceFileCorruptionHandler(new l<CorruptionException, UniversalRequestStoreOuterClass.UniversalRequestStore>() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.createDataStore.1
            @Override // sn.l
            @NotNull
            public final UniversalRequestStoreOuterClass.UniversalRequestStore invoke(@NotNull CorruptionException corruptionException) {
                p.k(corruptionException, "it");
                return new UniversalRequestStoreSerializer().getDefaultValue();
            }
        }), null, d.a(this.dispatcher.plus(j2.b(null, 1, null))), new sn.a<File>() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.createDataStore.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(UniversalRequestDataStoreProvider.this.getContext(), ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
            }
        }, 4, null);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final h0 getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
        synchronized (this) {
            DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> dataStore = this.cachedDataStore;
            if (dataStore != null) {
                return dataStore;
            }
            DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> dataStoreCreateDataStore = createDataStore();
            this.cachedDataStore = dataStoreCreateDataStore;
            return dataStoreCreateDataStore;
        }
    }
}
