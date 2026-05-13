package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes5.dex */
public final class Nf implements ProtobufStateStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f65650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f65651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f65652d;

    public Nf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f65649a = str;
        this.f65650b = iBinaryDataHelper;
        this.f65651c = protobufStateSerializer;
        this.f65652d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f65650b.remove(this.f65649a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f65650b.get(this.f65649a);
            if (bArr != null && bArr.length != 0) {
                return this.f65652d.toModel((MessageNano) this.f65651c.toState(bArr));
            }
            return this.f65652d.toModel((MessageNano) this.f65651c.defaultValue());
        } catch (Throwable unused) {
            return this.f65652d.toModel((MessageNano) this.f65651c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f65650b.insert(this.f65649a, this.f65651c.toByteArray((MessageNano) this.f65652d.fromModel(obj)));
    }
}
