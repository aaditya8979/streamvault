package com.unity3d.ads.core.data.datasource;

import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteStringDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ByteStringDataSource {
    @Nullable
    Object get(@NotNull c<? super ByteStringStoreOuterClass.ByteStringStore> cVar);

    @Nullable
    Object set(@NotNull ByteString byteString, @NotNull c<? super r> cVar);
}
