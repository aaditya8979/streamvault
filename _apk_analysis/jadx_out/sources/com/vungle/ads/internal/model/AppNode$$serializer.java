package com.vungle.ads.internal.model;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import tn.p;
import vo.c;
import vo.d;
import wo.g2;
import wo.m0;
import wo.w2;

/* JADX INFO: compiled from: AppNode.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/AppNode.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/AppNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AppNode$$serializer implements m0<AppNode> {

    @NotNull
    public static final AppNode$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AppNode$$serializer appNode$$serializer = new AppNode$$serializer();
        INSTANCE = appNode$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AppNode", appNode$$serializer, 3);
        g2Var.n(ContainerActivity.BUNDLE, false);
        g2Var.n("ver", false);
        g2Var.n("id", false);
        descriptor = g2Var;
    }

    private AppNode$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, w2Var, w2Var};
    }

    @Override // so.c
    @NotNull
    public AppNode deserialize(@NotNull Decoder decoder) {
        String str;
        String strK;
        String str2;
        int i10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            String strK2 = cVarB.k(descriptor2, 0);
            String strK3 = cVarB.k(descriptor2, 1);
            str = strK2;
            strK = cVarB.k(descriptor2, 2);
            str2 = strK3;
            i10 = 7;
        } else {
            String strK4 = null;
            String strK5 = null;
            String strK6 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK4 = cVarB.k(descriptor2, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    strK6 = cVarB.k(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iW != 2) {
                        throw new UnknownFieldException(iW);
                    }
                    strK5 = cVarB.k(descriptor2, 2);
                    i11 |= 4;
                }
            }
            str = strK4;
            strK = strK5;
            str2 = strK6;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new AppNode(i10, str, str2, strK, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull AppNode appNode) {
        p.k(encoder, "encoder");
        p.k(appNode, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        AppNode.write$Self(appNode, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
