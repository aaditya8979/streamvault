package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.ironsource.Y5;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AndroidStorageManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidStorageManager implements StorageManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    /* JADX INFO: compiled from: AndroidStorageManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(@NotNull StorageManager.StorageType storageType, @NotNull String str) {
        p.k(storageType, "type");
        p.k(str, Y5.c.f30724b);
        com.unity3d.services.core.device.StorageManager.addStorageLocation(storageType, str);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    @NotNull
    public Storage getStorage(@NotNull StorageManager.StorageType storageType) {
        p.k(storageType, "type");
        Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(storageType);
        p.j(storage, "getStorage(type)");
        return storage;
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage = getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(@NotNull StorageManager.StorageType storageType) {
        p.k(storageType, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(@NotNull StorageManager.StorageType storageType) {
        p.k(storageType, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(@NotNull StorageManager.StorageType storageType) {
        p.k(storageType, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(storageType);
    }
}
