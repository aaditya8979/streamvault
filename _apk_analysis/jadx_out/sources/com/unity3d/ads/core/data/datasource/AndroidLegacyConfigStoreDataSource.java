package com.unity3d.ads.core.data.datasource;

import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import hn.c;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AndroidLegacyConfigStoreDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";

    @NotNull
    private final StorageManager storageManager;

    /* JADX INFO: compiled from: AndroidLegacyConfigStoreDataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AndroidLegacyConfigStoreDataSource(@NotNull StorageManager storageManager) {
        p.k(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object get(@NotNull c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) throws JSONException {
        Object objM7534constructorimpl;
        Object obj = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj instanceof String ? (String) obj : null;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(str != null ? ProtobufExtensionsKt.fromBase64(str, true) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        ByteString byteString = (ByteString) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (byteString == null) {
            byteString = ByteString.EMPTY;
            p.j(byteString, "EMPTY");
        }
        dsl_create.setData(byteString);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object set(@NotNull ByteString byteString, @NotNull c<? super r> cVar) {
        Storage storage = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return r.f5635a;
    }
}
