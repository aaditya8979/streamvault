package com.vungle.ads.internal.model;

import com.ironsource.Q6;
import com.vungle.ads.internal.model.DeviceNode;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
import wo.g1;
import wo.g2;
import wo.i;
import wo.l0;
import wo.m0;
import wo.r2;
import wo.v0;
import wo.w2;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class DeviceNode$VungleExt$$serializer implements m0<DeviceNode.VungleExt> {

    @NotNull
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 23);
        g2Var.n("is_google_play_services_available", true);
        g2Var.n(CommonUrlParts.APP_SET_ID, true);
        g2Var.n(CommonUrlParts.APP_SET_ID_SCOPE, true);
        g2Var.n("battery_level", true);
        g2Var.n("battery_state", true);
        g2Var.n("battery_saver_enabled", true);
        g2Var.n("connection_type", true);
        g2Var.n("connection_type_detail", true);
        g2Var.n(CommonUrlParts.LOCALE, true);
        g2Var.n("language", true);
        g2Var.n("time_zone", true);
        g2Var.n("volume_level", true);
        g2Var.n("sound_enabled", true);
        g2Var.n("is_tv", true);
        g2Var.n("sd_card_available", true);
        g2Var.n("is_sideload_enabled", true);
        g2Var.n(Q6.V0, true);
        g2Var.n("amazon_advertising_id", true);
        g2Var.n("sit", true);
        g2Var.n("oit", true);
        g2Var.n("ort", true);
        g2Var.n("obt", true);
        g2Var.n("gp_version", true);
        descriptor = g2Var;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        i iVar = i.f86540a;
        w2 w2Var = w2.f86635a;
        v0 v0Var = v0.f86626a;
        l0 l0Var = l0.f86565a;
        g1 g1Var = g1.f86515a;
        return new KSerializer[]{iVar, a.t(w2Var), a.t(v0Var), l0Var, a.t(w2Var), v0Var, a.t(w2Var), a.t(w2Var), a.t(w2Var), a.t(w2Var), a.t(w2Var), l0Var, v0Var, iVar, v0Var, iVar, a.t(w2Var), a.t(w2Var), a.t(g1Var), a.t(g1Var), a.t(g1Var), a.t(g1Var), a.t(w2Var)};
    }

    @Override // so.c
    @NotNull
    public DeviceNode.VungleExt deserialize(@NotNull Decoder decoder) {
        Object objC;
        int iG;
        int iG2;
        float fZ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i10;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        int i11;
        Object objC2;
        Object obj14;
        Object obj15;
        int i12;
        int i13;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i14 = 0;
        if (cVarB.l()) {
            boolean zE = cVarB.E(descriptor2, 0);
            w2 w2Var = w2.f86635a;
            Object objC3 = cVarB.C(descriptor2, 1, w2Var, null);
            Object objC4 = cVarB.C(descriptor2, 2, v0.f86626a, null);
            float fZ2 = cVarB.z(descriptor2, 3);
            Object objC5 = cVarB.C(descriptor2, 4, w2Var, null);
            int iG3 = cVarB.g(descriptor2, 5);
            Object objC6 = cVarB.C(descriptor2, 6, w2Var, null);
            Object objC7 = cVarB.C(descriptor2, 7, w2Var, null);
            Object objC8 = cVarB.C(descriptor2, 8, w2Var, null);
            Object objC9 = cVarB.C(descriptor2, 9, w2Var, null);
            Object objC10 = cVarB.C(descriptor2, 10, w2Var, null);
            float fZ3 = cVarB.z(descriptor2, 11);
            int iG4 = cVarB.g(descriptor2, 12);
            boolean zE2 = cVarB.E(descriptor2, 13);
            int iG5 = cVarB.g(descriptor2, 14);
            boolean zE3 = cVarB.E(descriptor2, 15);
            obj5 = objC3;
            Object objC11 = cVarB.C(descriptor2, 16, w2Var, null);
            Object objC12 = cVarB.C(descriptor2, 17, w2Var, null);
            g1 g1Var = g1.f86515a;
            f10 = fZ2;
            Object objC13 = cVarB.C(descriptor2, 18, g1Var, null);
            Object objC14 = cVarB.C(descriptor2, 19, g1Var, null);
            Object objC15 = cVarB.C(descriptor2, 20, g1Var, null);
            Object objC16 = cVarB.C(descriptor2, 21, g1Var, null);
            objC2 = cVarB.C(descriptor2, 22, w2Var, null);
            obj3 = objC5;
            obj4 = objC4;
            iG = iG4;
            iG2 = iG3;
            obj2 = objC7;
            obj = objC6;
            fZ = fZ3;
            obj10 = objC13;
            z10 = zE3;
            z11 = zE;
            obj8 = objC15;
            obj9 = objC16;
            obj13 = objC8;
            obj11 = objC10;
            z12 = zE2;
            obj6 = objC11;
            obj7 = objC14;
            obj12 = objC9;
            objC = objC12;
            i11 = iG5;
            i10 = 8388607;
        } else {
            Object objC17 = null;
            boolean z13 = true;
            Object objC18 = null;
            Object objC19 = null;
            Object objC20 = null;
            Object objC21 = null;
            Object objC22 = null;
            Object objC23 = null;
            Object objC24 = null;
            objC = null;
            Object objC25 = null;
            Object objC26 = null;
            Object objC27 = null;
            Object objC28 = null;
            Object objC29 = null;
            boolean zE4 = false;
            iG = 0;
            boolean zE5 = false;
            boolean zE6 = false;
            int iG6 = 0;
            iG2 = 0;
            float fZ4 = 0.0f;
            fZ = 0.0f;
            Object objC30 = null;
            while (z13) {
                Object obj22 = objC22;
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        obj16 = objC20;
                        obj17 = objC28;
                        z13 = false;
                        objC22 = obj22;
                        objC18 = objC18;
                        objC28 = obj17;
                        objC20 = obj16;
                        break;
                    case 0:
                        obj16 = objC20;
                        obj17 = objC28;
                        zE5 = cVarB.E(descriptor2, 0);
                        i14 |= 1;
                        objC18 = objC18;
                        objC22 = obj22;
                        objC19 = objC19;
                        objC28 = obj17;
                        objC20 = obj16;
                        break;
                    case 1:
                        obj18 = objC18;
                        i14 |= 2;
                        objC29 = objC29;
                        objC22 = obj22;
                        objC19 = objC19;
                        objC20 = objC20;
                        objC28 = cVarB.C(descriptor2, 1, w2.f86635a, objC28);
                        objC18 = obj18;
                        break;
                    case 2:
                        obj19 = objC19;
                        obj16 = objC20;
                        objC29 = cVarB.C(descriptor2, 2, v0.f86626a, objC29);
                        i14 |= 4;
                        objC18 = objC18;
                        objC22 = obj22;
                        objC19 = obj19;
                        objC20 = obj16;
                        break;
                    case 3:
                        obj19 = objC19;
                        obj16 = objC20;
                        fZ4 = cVarB.z(descriptor2, 3);
                        i14 |= 8;
                        objC18 = objC18;
                        objC22 = obj22;
                        objC19 = obj19;
                        objC20 = obj16;
                        break;
                    case 4:
                        obj18 = objC18;
                        i14 |= 16;
                        objC22 = cVarB.C(descriptor2, 4, w2.f86635a, obj22);
                        objC19 = objC19;
                        objC20 = objC20;
                        objC18 = obj18;
                        break;
                    case 5:
                        obj20 = objC18;
                        obj21 = objC20;
                        iG2 = cVarB.g(descriptor2, 5);
                        i14 |= 32;
                        objC18 = obj20;
                        objC20 = obj21;
                        objC22 = obj22;
                        break;
                    case 6:
                        obj20 = objC18;
                        obj21 = objC20;
                        objC19 = cVarB.C(descriptor2, 6, w2.f86635a, objC19);
                        i14 |= 64;
                        objC18 = obj20;
                        objC20 = obj21;
                        objC22 = obj22;
                        break;
                    case 7:
                        obj14 = objC18;
                        obj15 = objC19;
                        objC20 = cVarB.C(descriptor2, 7, w2.f86635a, objC20);
                        i14 |= 128;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 8:
                        obj14 = objC18;
                        obj15 = objC19;
                        objC27 = cVarB.C(descriptor2, 8, w2.f86635a, objC27);
                        i14 |= 256;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 9:
                        obj14 = objC18;
                        obj15 = objC19;
                        objC26 = cVarB.C(descriptor2, 9, w2.f86635a, objC26);
                        i14 |= 512;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 10:
                        obj14 = objC18;
                        obj15 = objC19;
                        objC25 = cVarB.C(descriptor2, 10, w2.f86635a, objC25);
                        i14 |= 1024;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 11:
                        obj14 = objC18;
                        obj15 = objC19;
                        fZ = cVarB.z(descriptor2, 11);
                        i14 |= 2048;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 12:
                        obj14 = objC18;
                        obj15 = objC19;
                        iG = cVarB.g(descriptor2, 12);
                        i14 |= 4096;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 13:
                        obj14 = objC18;
                        obj15 = objC19;
                        zE6 = cVarB.E(descriptor2, 13);
                        i14 |= 8192;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 14:
                        obj14 = objC18;
                        obj15 = objC19;
                        iG6 = cVarB.g(descriptor2, 14);
                        i14 |= 16384;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 15:
                        obj14 = objC18;
                        obj15 = objC19;
                        zE4 = cVarB.E(descriptor2, 15);
                        i14 |= 32768;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 16:
                        obj14 = objC18;
                        obj15 = objC19;
                        objC21 = cVarB.C(descriptor2, 16, w2.f86635a, objC21);
                        i12 = 65536;
                        i14 |= i12;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 17:
                        obj14 = objC18;
                        obj15 = objC19;
                        objC = cVarB.C(descriptor2, 17, w2.f86635a, objC);
                        i12 = 131072;
                        i14 |= i12;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 18:
                        obj15 = objC19;
                        obj14 = objC18;
                        objC24 = cVarB.C(descriptor2, 18, g1.f86515a, objC24);
                        i12 = 262144;
                        i14 |= i12;
                        objC18 = obj14;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 19:
                        obj15 = objC19;
                        objC17 = cVarB.C(descriptor2, 19, g1.f86515a, objC17);
                        i13 = 524288;
                        i14 |= i13;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 20:
                        obj15 = objC19;
                        objC30 = cVarB.C(descriptor2, 20, g1.f86515a, objC30);
                        i13 = 1048576;
                        i14 |= i13;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 21:
                        obj15 = objC19;
                        objC23 = cVarB.C(descriptor2, 21, g1.f86515a, objC23);
                        i13 = 2097152;
                        i14 |= i13;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    case 22:
                        obj15 = objC19;
                        objC18 = cVarB.C(descriptor2, 22, w2.f86635a, objC18);
                        i13 = 4194304;
                        i14 |= i13;
                        objC22 = obj22;
                        objC19 = obj15;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            Object obj23 = objC18;
            obj = objC19;
            obj2 = objC20;
            obj3 = objC22;
            Object obj24 = objC28;
            obj4 = objC29;
            obj5 = obj24;
            obj6 = objC21;
            obj7 = objC17;
            i10 = i14;
            obj8 = objC30;
            obj9 = objC23;
            obj10 = objC24;
            obj11 = objC25;
            obj12 = objC26;
            obj13 = objC27;
            z10 = zE4;
            f10 = fZ4;
            z11 = zE5;
            z12 = zE6;
            i11 = iG6;
            objC2 = obj23;
        }
        cVarB.c(descriptor2);
        return new DeviceNode.VungleExt(i10, z11, (String) obj5, (Integer) obj4, f10, (String) obj3, iG2, (String) obj, (String) obj2, (String) obj13, (String) obj12, (String) obj11, fZ, iG, z12, i11, z10, (String) obj6, (String) objC, (Long) obj10, (Long) obj7, (Long) obj8, (Long) obj9, (String) objC2, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull DeviceNode.VungleExt vungleExt) {
        p.k(encoder, "encoder");
        p.k(vungleExt, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        DeviceNode.VungleExt.write$Self(vungleExt, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
