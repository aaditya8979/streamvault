package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.ConfigPayload;
import java.util.List;
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
import wo.f;
import wo.g1;
import wo.g2;
import wo.i;
import wo.m0;
import wo.r2;
import wo.v0;
import wo.w2;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ConfigPayload$$serializer implements m0<ConfigPayload> {

    @NotNull
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 19);
        g2Var.n("reuse_assets", true);
        g2Var.n("config", true);
        g2Var.n("endpoints", true);
        g2Var.n("log_metrics", true);
        g2Var.n("placements", true);
        g2Var.n("user", true);
        g2Var.n(Cookie.CONFIG_EXTENSION, true);
        g2Var.n(Cookie.COPPA_DISABLE_AD_ID, true);
        g2Var.n("ri_enabled", true);
        g2Var.n("session_timeout", true);
        g2Var.n("wait_for_connectivity_for_tpat", true);
        g2Var.n("sdk_session_timeout", true);
        g2Var.n("signals_disabled", true);
        g2Var.n("fpd_enabled", true);
        g2Var.n("rta_debugging", true);
        g2Var.n("config_last_validated_ts", true);
        g2Var.n("auto_redirect", true);
        g2Var.n("retry_prioritized_tpat", true);
        g2Var.n("enable_ot", true);
        descriptor = g2Var;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        i iVar = i.f86540a;
        v0 v0Var = v0.f86626a;
        return new KSerializer[]{a.t(ConfigPayload$CleverCache$$serializer.INSTANCE), a.t(ConfigPayload$ConfigSettings$$serializer.INSTANCE), a.t(ConfigPayload$Endpoints$$serializer.INSTANCE), a.t(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE), a.t(new f(Placement$$serializer.INSTANCE)), a.t(ConfigPayload$UserPrivacy$$serializer.INSTANCE), a.t(w2.f86635a), a.t(iVar), a.t(iVar), a.t(v0Var), a.t(iVar), a.t(v0Var), a.t(iVar), a.t(iVar), a.t(iVar), a.t(g1.f86515a), a.t(ConfigPayload$AutoRedirect$$serializer.INSTANCE), a.t(iVar), a.t(iVar)};
    }

    @Override // so.c
    @NotNull
    public ConfigPayload deserialize(@NotNull Decoder decoder) {
        Object objC;
        Object objC2;
        Object objC3;
        Object obj;
        Object obj2;
        Object objC4;
        Object objC5;
        Object objC6;
        Object obj3;
        int i10;
        Object obj4;
        Object obj5;
        Object objC7;
        Object objC8;
        Object objC9;
        Object objC10;
        Object objC11;
        Object objC12;
        Object objC13;
        Object objC14;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            Object objC15 = cVarB.C(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            Object objC16 = cVarB.C(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objC14 = cVarB.C(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            objC13 = cVarB.C(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            Object objC17 = cVarB.C(descriptor2, 4, new f(Placement$$serializer.INSTANCE), null);
            objC8 = cVarB.C(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            objC12 = cVarB.C(descriptor2, 6, w2.f86635a, null);
            i iVar = i.f86540a;
            objC11 = cVarB.C(descriptor2, 7, iVar, null);
            objC10 = cVarB.C(descriptor2, 8, iVar, null);
            v0 v0Var = v0.f86626a;
            objC9 = cVarB.C(descriptor2, 9, v0Var, null);
            objC7 = cVarB.C(descriptor2, 10, iVar, null);
            Object objC18 = cVarB.C(descriptor2, 11, v0Var, null);
            Object objC19 = cVarB.C(descriptor2, 12, iVar, null);
            obj5 = objC18;
            objC6 = cVarB.C(descriptor2, 13, iVar, null);
            objC5 = cVarB.C(descriptor2, 14, iVar, null);
            objC4 = cVarB.C(descriptor2, 15, g1.f86515a, null);
            Object objC20 = cVarB.C(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            objC3 = cVarB.C(descriptor2, 17, iVar, null);
            obj2 = objC20;
            obj = objC15;
            i10 = 524287;
            obj4 = objC19;
            objC = objC17;
            objC2 = cVarB.C(descriptor2, 18, iVar, null);
            obj3 = objC16;
        } else {
            boolean z10 = true;
            Object objC21 = null;
            Object objC22 = null;
            Object objC23 = null;
            Object objC24 = null;
            Object objC25 = null;
            Object objC26 = null;
            Object objC27 = null;
            Object objC28 = null;
            Object objC29 = null;
            Object objC30 = null;
            objC = null;
            Object objC31 = null;
            Object objC32 = null;
            Object objC33 = null;
            Object objC34 = null;
            Object objC35 = null;
            Object objC36 = null;
            Object objC37 = null;
            int i11 = 0;
            Object objC38 = null;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        obj6 = objC38;
                        obj7 = objC21;
                        obj8 = objC25;
                        z10 = false;
                        objC25 = obj8;
                        objC38 = obj6;
                        objC21 = obj7;
                        break;
                    case 0:
                        obj7 = objC21;
                        obj8 = objC25;
                        obj6 = objC38;
                        objC37 = cVarB.C(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, objC37);
                        i11 |= 1;
                        objC25 = obj8;
                        objC38 = obj6;
                        objC21 = obj7;
                        break;
                    case 1:
                        obj7 = objC21;
                        objC38 = cVarB.C(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objC38);
                        i11 |= 2;
                        objC25 = objC25;
                        objC21 = obj7;
                        break;
                    case 2:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC24 = cVarB.C(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, objC24);
                        i11 |= 4;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 3:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC23 = cVarB.C(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objC23);
                        i11 |= 8;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 4:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC = cVarB.C(descriptor2, 4, new f(Placement$$serializer.INSTANCE), objC);
                        i11 |= 16;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 5:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC21 = cVarB.C(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, objC21);
                        i11 |= 32;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 6:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC30 = cVarB.C(descriptor2, 6, w2.f86635a, objC30);
                        i11 |= 64;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 7:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC29 = cVarB.C(descriptor2, 7, i.f86540a, objC29);
                        i11 |= 128;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 8:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC28 = cVarB.C(descriptor2, 8, i.f86540a, objC28);
                        i11 |= 256;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 9:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC22 = cVarB.C(descriptor2, 9, v0.f86626a, objC22);
                        i11 |= 512;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 10:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC27 = cVarB.C(descriptor2, 10, i.f86540a, objC27);
                        i11 |= 1024;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 11:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC26 = cVarB.C(descriptor2, 11, v0.f86626a, objC26);
                        i11 |= 2048;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 12:
                        obj9 = objC38;
                        objC31 = cVarB.C(descriptor2, 12, i.f86540a, objC31);
                        i11 |= 4096;
                        objC25 = objC25;
                        objC32 = objC32;
                        objC38 = obj9;
                        break;
                    case 13:
                        obj9 = objC38;
                        objC32 = cVarB.C(descriptor2, 13, i.f86540a, objC32);
                        i11 |= 8192;
                        objC25 = objC25;
                        objC33 = objC33;
                        objC38 = obj9;
                        break;
                    case 14:
                        obj9 = objC38;
                        objC33 = cVarB.C(descriptor2, 14, i.f86540a, objC33);
                        i11 |= 16384;
                        objC25 = objC25;
                        objC34 = objC34;
                        objC38 = obj9;
                        break;
                    case 15:
                        obj9 = objC38;
                        objC34 = cVarB.C(descriptor2, 15, g1.f86515a, objC34);
                        i11 |= 32768;
                        objC25 = objC25;
                        objC35 = objC35;
                        objC38 = obj9;
                        break;
                    case 16:
                        obj9 = objC38;
                        objC35 = cVarB.C(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, objC35);
                        i11 |= 65536;
                        objC25 = objC25;
                        objC36 = objC36;
                        objC38 = obj9;
                        break;
                    case 17:
                        obj9 = objC38;
                        obj10 = objC25;
                        objC36 = cVarB.C(descriptor2, 17, i.f86540a, objC36);
                        i11 |= 131072;
                        objC25 = obj10;
                        objC38 = obj9;
                        break;
                    case 18:
                        objC25 = cVarB.C(descriptor2, 18, i.f86540a, objC25);
                        i11 |= 262144;
                        objC38 = objC38;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            Object obj11 = objC38;
            Object obj12 = objC21;
            objC2 = objC25;
            objC3 = objC36;
            obj = objC37;
            obj2 = objC35;
            objC4 = objC34;
            objC5 = objC33;
            objC6 = objC32;
            obj3 = obj11;
            i10 = i11;
            obj4 = objC31;
            obj5 = objC26;
            objC7 = objC27;
            objC8 = obj12;
            objC9 = objC22;
            objC10 = objC28;
            objC11 = objC29;
            objC12 = objC30;
            Object obj13 = objC24;
            objC13 = objC23;
            objC14 = obj13;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload(i10, (ConfigPayload.CleverCache) obj, (ConfigPayload.ConfigSettings) obj3, (ConfigPayload.Endpoints) objC14, (ConfigPayload.LogMetricsSettings) objC13, (List) objC, (ConfigPayload.UserPrivacy) objC8, (String) objC12, (Boolean) objC11, (Boolean) objC10, (Integer) objC9, (Boolean) objC7, (Integer) obj5, (Boolean) obj4, (Boolean) objC6, (Boolean) objC5, (Long) objC4, (ConfigPayload.AutoRedirect) obj2, (Boolean) objC3, (Boolean) objC2, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull ConfigPayload configPayload) {
        p.k(encoder, "encoder");
        p.k(configPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ConfigPayload.write$Self(configPayload, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
