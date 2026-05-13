package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: loaded from: classes.dex */
public final class Om extends Sm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtobufStateSerializer f65724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProtobufConverter f65725c;

    public Om(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.f65723a = str;
        this.f65724b = protobufStateSerializer;
        this.f65725c = protobufConverter;
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final IBinaryDataHelper a(Context context) {
        return C5009oa.I.B().b(context);
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        String str = this.f65723a;
        ProtobufStateSerializer protobufStateSerializer = this.f65724b;
        try {
            bArrA = AbstractC4840hj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArrA = new byte[16];
        }
        try {
            bArrA2 = AbstractC4840hj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrA2 = new byte[16];
        }
        return new Nf(str, iBinaryDataHelper, new B8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), this.f65725c);
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper iBinaryDataHelperA;
        C5293zk c5293zkB = C5009oa.I.B();
        synchronized (c5293zkB) {
            iBinaryDataHelperA = c5293zkB.a(context);
        }
        return iBinaryDataHelperA;
    }
}
