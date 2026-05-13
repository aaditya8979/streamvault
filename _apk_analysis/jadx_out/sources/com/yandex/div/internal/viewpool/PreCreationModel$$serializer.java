package com.yandex.div.internal.viewpool;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import vo.c;
import vo.d;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.v0;

/* JADX INFO: compiled from: ViewPreCreationProfile.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class PreCreationModel$$serializer implements m0<PreCreationModel> {

    @NotNull
    public static final PreCreationModel$$serializer INSTANCE;
    private static final /* synthetic */ g2 descriptor;

    static {
        PreCreationModel$$serializer preCreationModel$$serializer = new PreCreationModel$$serializer();
        INSTANCE = preCreationModel$$serializer;
        g2 g2Var = new g2("com.yandex.div.internal.viewpool.PreCreationModel", preCreationModel$$serializer, 3);
        g2Var.n("capacity", false);
        g2Var.n("min", true);
        g2Var.n("max", true);
        descriptor = g2Var;
    }

    private PreCreationModel$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        v0 v0Var = v0.f86626a;
        return new KSerializer[]{v0Var, v0Var, v0Var};
    }

    @Override // so.c
    @NotNull
    public PreCreationModel deserialize(@NotNull Decoder decoder) {
        int i10;
        int iG;
        int i11;
        int i12;
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            int iG2 = cVarB.g(descriptor2, 0);
            int iG3 = cVarB.g(descriptor2, 1);
            i10 = iG2;
            iG = cVarB.g(descriptor2, 2);
            i11 = iG3;
            i12 = 7;
        } else {
            boolean z10 = true;
            int iG4 = 0;
            int iG5 = 0;
            int iG6 = 0;
            int i13 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    iG4 = cVarB.g(descriptor2, 0);
                    i13 |= 1;
                } else if (iW == 1) {
                    iG6 = cVarB.g(descriptor2, 1);
                    i13 |= 2;
                } else {
                    if (iW != 2) {
                        throw new UnknownFieldException(iW);
                    }
                    iG5 = cVarB.g(descriptor2, 2);
                    i13 |= 4;
                }
            }
            i10 = iG4;
            iG = iG5;
            i11 = iG6;
            i12 = i13;
        }
        cVarB.c(descriptor2);
        return new PreCreationModel(i12, i10, i11, iG, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull PreCreationModel preCreationModel) {
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PreCreationModel.write$Self(preCreationModel, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
