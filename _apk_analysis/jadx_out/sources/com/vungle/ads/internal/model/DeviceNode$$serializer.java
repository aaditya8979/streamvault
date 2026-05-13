package com.vungle.ads.internal.model;

import com.ironsource.Q6;
import com.vungle.ads.internal.model.DeviceNode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import tn.p;
import to.a;
import vo.c;
import vo.d;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.v0;
import wo.w2;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/DeviceNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class DeviceNode$$serializer implements m0<DeviceNode> {

    @NotNull
    public static final DeviceNode$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        DeviceNode$$serializer deviceNode$$serializer = new DeviceNode$$serializer();
        INSTANCE = deviceNode$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.DeviceNode", deviceNode$$serializer, 11);
        g2Var.n(Q6.f30265t, false);
        g2Var.n("model", false);
        g2Var.n(Q6.G, false);
        g2Var.n(Q6.Q0, true);
        g2Var.n(Q6.F, false);
        g2Var.n("w", false);
        g2Var.n("h", false);
        g2Var.n(Q6.f30218d0, true);
        g2Var.n("ifa", true);
        g2Var.n("lmt", true);
        g2Var.n("ext", true);
        descriptor = g2Var;
    }

    private DeviceNode$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        v0 v0Var = v0.f86626a;
        return new KSerializer[]{w2Var, w2Var, w2Var, a.t(w2Var), w2Var, v0Var, v0Var, a.t(w2Var), a.t(w2Var), a.t(v0Var), a.t(DeviceNode$VungleExt$$serializer.INSTANCE)};
    }

    @Override // so.c
    @NotNull
    public DeviceNode deserialize(@NotNull Decoder decoder) {
        Object objC;
        String strK;
        Object objC2;
        Object objC3;
        Object objC4;
        Object objC5;
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        String str3;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i13 = 10;
        int i14 = 9;
        if (cVarB.l()) {
            String strK2 = cVarB.k(descriptor2, 0);
            String strK3 = cVarB.k(descriptor2, 1);
            String strK4 = cVarB.k(descriptor2, 2);
            w2 w2Var = w2.f86635a;
            objC5 = cVarB.C(descriptor2, 3, w2Var, null);
            String strK5 = cVarB.k(descriptor2, 4);
            int iG = cVarB.g(descriptor2, 5);
            int iG2 = cVarB.g(descriptor2, 6);
            objC4 = cVarB.C(descriptor2, 7, w2Var, null);
            Object objC6 = cVarB.C(descriptor2, 8, w2Var, null);
            objC2 = cVarB.C(descriptor2, 9, v0.f86626a, null);
            objC3 = cVarB.C(descriptor2, 10, DeviceNode$VungleExt$$serializer.INSTANCE, null);
            i11 = iG2;
            i12 = iG;
            str3 = strK5;
            strK = strK3;
            str = strK2;
            str2 = strK4;
            objC = objC6;
            i10 = 2047;
        } else {
            boolean z10 = true;
            int iG3 = 0;
            int i15 = 0;
            Object objC7 = null;
            Object objC8 = null;
            objC = null;
            Object objC9 = null;
            String strK6 = null;
            strK = null;
            String strK7 = null;
            String strK8 = null;
            Object objC10 = null;
            int iG4 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        z10 = false;
                        i13 = 10;
                        break;
                    case 0:
                        strK6 = cVarB.k(descriptor2, 0);
                        i15 |= 1;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 1:
                        strK = cVarB.k(descriptor2, 1);
                        i15 |= 2;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 2:
                        strK7 = cVarB.k(descriptor2, 2);
                        i15 |= 4;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 3:
                        objC10 = cVarB.C(descriptor2, 3, w2.f86635a, objC10);
                        i15 |= 8;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 4:
                        strK8 = cVarB.k(descriptor2, 4);
                        i15 |= 16;
                        i13 = 10;
                        break;
                    case 5:
                        iG4 = cVarB.g(descriptor2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        iG3 = cVarB.g(descriptor2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        objC9 = cVarB.C(descriptor2, 7, w2.f86635a, objC9);
                        i15 |= 128;
                        break;
                    case 8:
                        objC = cVarB.C(descriptor2, 8, w2.f86635a, objC);
                        i15 |= 256;
                        break;
                    case 9:
                        objC7 = cVarB.C(descriptor2, i14, v0.f86626a, objC7);
                        i15 |= 512;
                        break;
                    case 10:
                        objC8 = cVarB.C(descriptor2, i13, DeviceNode$VungleExt$$serializer.INSTANCE, objC8);
                        i15 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            objC2 = objC7;
            objC3 = objC8;
            objC4 = objC9;
            objC5 = objC10;
            i10 = i15;
            str = strK6;
            str2 = strK7;
            i11 = iG3;
            i12 = iG4;
            str3 = strK8;
        }
        cVarB.c(descriptor2);
        return new DeviceNode(i10, str, strK, str2, (String) objC5, str3, i12, i11, (String) objC4, (String) objC, (Integer) objC2, (DeviceNode.VungleExt) objC3, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull DeviceNode deviceNode) {
        p.k(encoder, "encoder");
        p.k(deviceNode, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        DeviceNode.write$Self(deviceNode, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
