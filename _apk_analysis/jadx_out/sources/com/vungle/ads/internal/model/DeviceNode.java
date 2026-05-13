package com.vungle.ads.internal.model;

import com.ironsource.C3978d4;
import com.ironsource.Q6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.k;
import tn.i;
import tn.p;
import vo.d;
import wo.c2;
import wo.g1;
import wo.r2;
import wo.v0;
import wo.w2;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0003MLNBs\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bF\u0010GB\u0085\u0001\b\u0017\u0012\u0006\u0010H\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bF\u0010KJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0088\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u000fHÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b/\u0010,R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b0\u0010,R\"\u0010\u001d\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00101\u001a\u0004\b6\u00103\"\u0004\b7\u00105R$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010*\u001a\u0004\b8\u0010,\"\u0004\b9\u0010:R$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010*\u001a\u0004\b;\u0010,\"\u0004\b<\u0010:R$\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010=\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010@R$\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006O"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "component11", Q6.f30265t, "model", Q6.G, Q6.Q0, Q6.F, "w", "h", Q6.f30218d0, "ifa", "lmt", "ext", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)Lcom/vungle/ads/internal/model/DeviceNode;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getMake", "()Ljava/lang/String;", "getModel", "getOsv", "getCarrier", "getOs", "I", "getW", "()I", "setW", "(I)V", "getH", "setH", "getUa", "setUa", "(Ljava/lang/String;)V", "getIfa", "setIfa", "Ljava/lang/Integer;", "getLmt", "setLmt", "(Ljava/lang/Integer;)V", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "getExt", "()Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "setExt", "(Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "VungleExt", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@k
public final /* data */ class DeviceNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String carrier;

    @Nullable
    private VungleExt ext;
    private int h;

    @Nullable
    private String ifa;

    @Nullable
    private Integer lmt;

    @NotNull
    private final String make;

    @NotNull
    private final String model;

    @NotNull
    private final String os;

    @NotNull
    private final String osv;

    @Nullable
    private String ua;
    private int w;

    /* JADX INFO: compiled from: DeviceNode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<DeviceNode> serializer() {
            return DeviceNode$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeviceNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\by\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u009d\u00012\u00020\u0001:\u0004\u009e\u0001\u009d\u0001B\u008d\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010*\u001a\u00020\u0010\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010,\u001a\u00020\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u00102\u001a\u00020\u0010\u0012\b\b\u0002\u00103\u001a\u00020\r\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\r\u0012\b\b\u0002\u00106\u001a\u00020\t\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001B¤\u0002\b\u0017\u0012\u0007\u0010\u0099\u0001\u001a\u00020\r\u0012\b\b\u0001\u0010'\u001a\u00020\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010*\u001a\u00020\u0010\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010,\u001a\u00020\r\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u00102\u001a\u00020\u0010\u0012\b\b\u0001\u00103\u001a\u00020\r\u0012\b\b\u0001\u00104\u001a\u00020\t\u0012\b\b\u0001\u00105\u001a\u00020\r\u0012\b\b\u0001\u00106\u001a\u00020\t\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u000b\u0012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u009c\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\rHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001a\u001a\u00020\rHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\rHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0094\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010*\u001a\u00020\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010,\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b>\u0010?J\t\u0010@\u001a\u00020\u000bHÖ\u0001J\t\u0010A\u001a\u00020\rHÖ\u0001J\u0013\u0010C\u001a\u00020\t2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010'\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010D\u0012\u0004\bH\u0010I\u001a\u0004\b'\u0010E\"\u0004\bF\u0010GR*\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010J\u0012\u0004\bO\u0010I\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010)\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010P\u0012\u0004\bT\u0010I\u001a\u0004\bQ\u0010\u000f\"\u0004\bR\u0010SR(\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b*\u0010U\u0012\u0004\bZ\u0010I\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR*\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010J\u0012\u0004\b]\u0010I\u001a\u0004\b[\u0010L\"\u0004\b\\\u0010NR(\u0010,\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010^\u0012\u0004\bc\u0010I\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010J\u0012\u0004\bf\u0010I\u001a\u0004\bd\u0010L\"\u0004\be\u0010NR*\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010J\u0012\u0004\bi\u0010I\u001a\u0004\bg\u0010L\"\u0004\bh\u0010NR*\u0010/\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u0010J\u0012\u0004\bl\u0010I\u001a\u0004\bj\u0010L\"\u0004\bk\u0010NR*\u00100\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u0010J\u0012\u0004\bo\u0010I\u001a\u0004\bm\u0010L\"\u0004\bn\u0010NR*\u00101\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u0010J\u0012\u0004\br\u0010I\u001a\u0004\bp\u0010L\"\u0004\bq\u0010NR(\u00102\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u0010U\u0012\u0004\bu\u0010I\u001a\u0004\bs\u0010W\"\u0004\bt\u0010YR(\u00103\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u0010^\u0012\u0004\bx\u0010I\u001a\u0004\bv\u0010`\"\u0004\bw\u0010bR(\u00104\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u0010D\u0012\u0004\bz\u0010I\u001a\u0004\b4\u0010E\"\u0004\by\u0010GR(\u00105\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010^\u0012\u0004\b}\u0010I\u001a\u0004\b{\u0010`\"\u0004\b|\u0010bR(\u00106\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u0010D\u0012\u0004\b\u007f\u0010I\u001a\u0004\b6\u0010E\"\u0004\b~\u0010GR-\u00107\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b7\u0010J\u0012\u0005\b\u0082\u0001\u0010I\u001a\u0005\b\u0080\u0001\u0010L\"\u0005\b\u0081\u0001\u0010NR-\u00108\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b8\u0010J\u0012\u0005\b\u0085\u0001\u0010I\u001a\u0005\b\u0083\u0001\u0010L\"\u0005\b\u0084\u0001\u0010NR/\u00109\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b9\u0010\u0086\u0001\u0012\u0005\b\u008a\u0001\u0010I\u001a\u0005\b\u0087\u0001\u0010\"\"\u0006\b\u0088\u0001\u0010\u0089\u0001R/\u0010:\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b:\u0010\u0086\u0001\u0012\u0005\b\u008d\u0001\u0010I\u001a\u0005\b\u008b\u0001\u0010\"\"\u0006\b\u008c\u0001\u0010\u0089\u0001R/\u0010;\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b;\u0010\u0086\u0001\u0012\u0005\b\u0090\u0001\u0010I\u001a\u0005\b\u008e\u0001\u0010\"\"\u0006\b\u008f\u0001\u0010\u0089\u0001R/\u0010<\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b<\u0010\u0086\u0001\u0012\u0005\b\u0093\u0001\u0010I\u001a\u0005\b\u0091\u0001\u0010\"\"\u0006\b\u0092\u0001\u0010\u0089\u0001R-\u0010=\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b=\u0010J\u0012\u0005\b\u0096\u0001\u0010I\u001a\u0005\b\u0094\u0001\u0010L\"\u0005\b\u0095\u0001\u0010N¨\u0006\u009f\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "", "component19", "()Ljava/lang/Long;", "component20", "component21", "component22", "component23", "isGooglePlayServicesAvailable", "appSetId", "appSetIdScope", C3978d4.j.Y, "batteryState", "batterySaverEnabled", "connectionType", "connectionTypeDetail", CommonUrlParts.LOCALE, "language", "timeZone", "volumeLevel", "soundEnabled", "isTv", C3978d4.j.f31394i0, "isSideloadEnabled", Q6.V0, "amazonAdvertisingId", "sit", "oit", "ort", "obt", "gpVersion", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "toString", "hashCode", "other", "equals", "Z", "()Z", "setGooglePlayServicesAvailable", "(Z)V", "isGooglePlayServicesAvailable$annotations", "()V", "Ljava/lang/String;", "getAppSetId", "()Ljava/lang/String;", "setAppSetId", "(Ljava/lang/String;)V", "getAppSetId$annotations", "Ljava/lang/Integer;", "getAppSetIdScope", "setAppSetIdScope", "(Ljava/lang/Integer;)V", "getAppSetIdScope$annotations", "F", "getBatteryLevel", "()F", "setBatteryLevel", "(F)V", "getBatteryLevel$annotations", "getBatteryState", "setBatteryState", "getBatteryState$annotations", "I", "getBatterySaverEnabled", "()I", "setBatterySaverEnabled", "(I)V", "getBatterySaverEnabled$annotations", "getConnectionType", "setConnectionType", "getConnectionType$annotations", "getConnectionTypeDetail", "setConnectionTypeDetail", "getConnectionTypeDetail$annotations", "getLocale", "setLocale", "getLocale$annotations", "getLanguage", "setLanguage", "getLanguage$annotations", "getTimeZone", "setTimeZone", "getTimeZone$annotations", "getVolumeLevel", "setVolumeLevel", "getVolumeLevel$annotations", "getSoundEnabled", "setSoundEnabled", "getSoundEnabled$annotations", "setTv", "isTv$annotations", "getSdCardAvailable", "setSdCardAvailable", "getSdCardAvailable$annotations", "setSideloadEnabled", "isSideloadEnabled$annotations", "getGaid", "setGaid", "getGaid$annotations", "getAmazonAdvertisingId", "setAmazonAdvertisingId", "getAmazonAdvertisingId$annotations", "Ljava/lang/Long;", "getSit", "setSit", "(Ljava/lang/Long;)V", "getSit$annotations", "getOit", "setOit", "getOit$annotations", "getOrt", "setOrt", "getOrt$annotations", "getObt", "setObt", "getObt$annotations", "getGpVersion", "setGpVersion", "getGpVersion$annotations", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class VungleExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private String amazonAdvertisingId;

        @Nullable
        private String appSetId;

        @Nullable
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;

        @Nullable
        private String batteryState;

        @Nullable
        private String connectionType;

        @Nullable
        private String connectionTypeDetail;

        @Nullable
        private String gaid;

        @Nullable
        private String gpVersion;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;

        @Nullable
        private String language;

        @Nullable
        private String locale;

        @Nullable
        private Long obt;

        @Nullable
        private Long oit;

        @Nullable
        private Long ort;
        private int sdCardAvailable;

        @Nullable
        private Long sit;
        private int soundEnabled;

        @Nullable
        private String timeZone;
        private float volumeLevel;

        /* JADX INFO: compiled from: DeviceNode.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<VungleExt> serializer() {
                return DeviceNode$VungleExt$$serializer.INSTANCE;
            }
        }

        public VungleExt() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (i) null);
        }

        public /* synthetic */ VungleExt(int i10, boolean z10, String str, Integer num, float f10, String str2, int i11, String str3, String str4, String str5, String str6, String str7, float f11, int i12, boolean z11, int i13, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, DeviceNode$VungleExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z10;
            }
            if ((i10 & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i10 & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i10 & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f10;
            }
            if ((i10 & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i10 & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i11;
            }
            if ((i10 & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i10 & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i10 & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i10 & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i10 & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i10 & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f11;
            }
            if ((i10 & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i12;
            }
            if ((i10 & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z11;
            }
            if ((i10 & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i13;
            }
            if ((32768 & i10) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z12;
            }
            if ((65536 & i10) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i10) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i10) == 0) {
                this.sit = null;
            } else {
                this.sit = l10;
            }
            if ((524288 & i10) == 0) {
                this.oit = null;
            } else {
                this.oit = l11;
            }
            if ((1048576 & i10) == 0) {
                this.ort = null;
            } else {
                this.ort = l12;
            }
            if ((2097152 & i10) == 0) {
                this.obt = null;
            } else {
                this.obt = l13;
            }
            if ((i10 & 4194304) == 0) {
                this.gpVersion = null;
            } else {
                this.gpVersion = str10;
            }
        }

        public VungleExt(boolean z10, @Nullable String str, @Nullable Integer num, float f10, @Nullable String str2, int i10, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, float f11, int i11, boolean z11, int i12, boolean z12, @Nullable String str8, @Nullable String str9, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable String str10) {
            this.isGooglePlayServicesAvailable = z10;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f10;
            this.batteryState = str2;
            this.batterySaverEnabled = i10;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f11;
            this.soundEnabled = i11;
            this.isTv = z11;
            this.sdCardAvailable = i12;
            this.isSideloadEnabled = z12;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l10;
            this.oit = l11;
            this.ort = l12;
            this.obt = l13;
            this.gpVersion = str10;
        }

        public /* synthetic */ VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, int i13, i iVar) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & 2048) == 0 ? f11 : 0.0f, (i13 & 4096) != 0 ? 1 : i11, (i13 & 8192) != 0 ? false : z11, (i13 & 16384) == 0 ? i12 : 1, (32768 & i13) != 0 ? false : z12, (i13 & 65536) != 0 ? null : str8, (i13 & 131072) != 0 ? null : str9, (i13 & 262144) != 0 ? null : l10, (i13 & 524288) != 0 ? null : l11, (i13 & 1048576) != 0 ? null : l12, (i13 & 2097152) != 0 ? null : l13, (i13 & 4194304) != 0 ? null : str10);
        }

        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getBatteryState$annotations() {
        }

        public static /* synthetic */ void getConnectionType$annotations() {
        }

        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        public static /* synthetic */ void getGaid$annotations() {
        }

        public static /* synthetic */ void getGpVersion$annotations() {
        }

        public static /* synthetic */ void getLanguage$annotations() {
        }

        public static /* synthetic */ void getLocale$annotations() {
        }

        public static /* synthetic */ void getObt$annotations() {
        }

        public static /* synthetic */ void getOit$annotations() {
        }

        public static /* synthetic */ void getOrt$annotations() {
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSit$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void getTimeZone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        public static /* synthetic */ void isTv$annotations() {
        }

        public static final void write$Self(@NotNull VungleExt vungleExt, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(vungleExt, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || vungleExt.isGooglePlayServicesAvailable) {
                dVar.p(serialDescriptor, 0, vungleExt.isGooglePlayServicesAvailable);
            }
            if (dVar.r(serialDescriptor, 1) || vungleExt.appSetId != null) {
                dVar.f(serialDescriptor, 1, w2.f86635a, vungleExt.appSetId);
            }
            if (dVar.r(serialDescriptor, 2) || vungleExt.appSetIdScope != null) {
                dVar.f(serialDescriptor, 2, v0.f86626a, vungleExt.appSetIdScope);
            }
            if (dVar.r(serialDescriptor, 3) || !p.f(Float.valueOf(vungleExt.batteryLevel), Float.valueOf(0.0f))) {
                dVar.D(serialDescriptor, 3, vungleExt.batteryLevel);
            }
            if (dVar.r(serialDescriptor, 4) || vungleExt.batteryState != null) {
                dVar.f(serialDescriptor, 4, w2.f86635a, vungleExt.batteryState);
            }
            if (dVar.r(serialDescriptor, 5) || vungleExt.batterySaverEnabled != 0) {
                dVar.o(serialDescriptor, 5, vungleExt.batterySaverEnabled);
            }
            if (dVar.r(serialDescriptor, 6) || vungleExt.connectionType != null) {
                dVar.f(serialDescriptor, 6, w2.f86635a, vungleExt.connectionType);
            }
            if (dVar.r(serialDescriptor, 7) || vungleExt.connectionTypeDetail != null) {
                dVar.f(serialDescriptor, 7, w2.f86635a, vungleExt.connectionTypeDetail);
            }
            if (dVar.r(serialDescriptor, 8) || vungleExt.locale != null) {
                dVar.f(serialDescriptor, 8, w2.f86635a, vungleExt.locale);
            }
            if (dVar.r(serialDescriptor, 9) || vungleExt.language != null) {
                dVar.f(serialDescriptor, 9, w2.f86635a, vungleExt.language);
            }
            if (dVar.r(serialDescriptor, 10) || vungleExt.timeZone != null) {
                dVar.f(serialDescriptor, 10, w2.f86635a, vungleExt.timeZone);
            }
            if (dVar.r(serialDescriptor, 11) || !p.f(Float.valueOf(vungleExt.volumeLevel), Float.valueOf(0.0f))) {
                dVar.D(serialDescriptor, 11, vungleExt.volumeLevel);
            }
            if (dVar.r(serialDescriptor, 12) || vungleExt.soundEnabled != 1) {
                dVar.o(serialDescriptor, 12, vungleExt.soundEnabled);
            }
            if (dVar.r(serialDescriptor, 13) || vungleExt.isTv) {
                dVar.p(serialDescriptor, 13, vungleExt.isTv);
            }
            if (dVar.r(serialDescriptor, 14) || vungleExt.sdCardAvailable != 1) {
                dVar.o(serialDescriptor, 14, vungleExt.sdCardAvailable);
            }
            if (dVar.r(serialDescriptor, 15) || vungleExt.isSideloadEnabled) {
                dVar.p(serialDescriptor, 15, vungleExt.isSideloadEnabled);
            }
            if (dVar.r(serialDescriptor, 16) || vungleExt.gaid != null) {
                dVar.f(serialDescriptor, 16, w2.f86635a, vungleExt.gaid);
            }
            if (dVar.r(serialDescriptor, 17) || vungleExt.amazonAdvertisingId != null) {
                dVar.f(serialDescriptor, 17, w2.f86635a, vungleExt.amazonAdvertisingId);
            }
            if (dVar.r(serialDescriptor, 18) || vungleExt.sit != null) {
                dVar.f(serialDescriptor, 18, g1.f86515a, vungleExt.sit);
            }
            if (dVar.r(serialDescriptor, 19) || vungleExt.oit != null) {
                dVar.f(serialDescriptor, 19, g1.f86515a, vungleExt.oit);
            }
            if (dVar.r(serialDescriptor, 20) || vungleExt.ort != null) {
                dVar.f(serialDescriptor, 20, g1.f86515a, vungleExt.ort);
            }
            if (dVar.r(serialDescriptor, 21) || vungleExt.obt != null) {
                dVar.f(serialDescriptor, 21, g1.f86515a, vungleExt.obt);
            }
            if (dVar.r(serialDescriptor, 22) || vungleExt.gpVersion != null) {
                dVar.f(serialDescriptor, 22, w2.f86635a, vungleExt.gpVersion);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTimeZone() {
            return this.timeZone;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getIsTv() {
            return this.isTv;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getIsSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getGaid() {
            return this.gaid;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Long getSit() {
            return this.sit;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Long getOit() {
            return this.oit;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Long getOrt() {
            return this.ort;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Long getObt() {
            return this.obt;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getGpVersion() {
            return this.gpVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBatteryState() {
            return this.batteryState;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getConnectionType() {
            return this.connectionType;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        @NotNull
        public final VungleExt copy(boolean isGooglePlayServicesAvailable, @Nullable String appSetId, @Nullable Integer appSetIdScope, float batteryLevel, @Nullable String batteryState, int batterySaverEnabled, @Nullable String connectionType, @Nullable String connectionTypeDetail, @Nullable String locale, @Nullable String language, @Nullable String timeZone, float volumeLevel, int soundEnabled, boolean isTv, int sdCardAvailable, boolean isSideloadEnabled, @Nullable String gaid, @Nullable String amazonAdvertisingId, @Nullable Long sit, @Nullable Long oit, @Nullable Long ort, @Nullable Long obt, @Nullable String gpVersion) {
            return new VungleExt(isGooglePlayServicesAvailable, appSetId, appSetIdScope, batteryLevel, batteryState, batterySaverEnabled, connectionType, connectionTypeDetail, locale, language, timeZone, volumeLevel, soundEnabled, isTv, sdCardAvailable, isSideloadEnabled, gaid, amazonAdvertisingId, sit, oit, ort, obt, gpVersion);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) other;
            return this.isGooglePlayServicesAvailable == vungleExt.isGooglePlayServicesAvailable && p.f(this.appSetId, vungleExt.appSetId) && p.f(this.appSetIdScope, vungleExt.appSetIdScope) && p.f(Float.valueOf(this.batteryLevel), Float.valueOf(vungleExt.batteryLevel)) && p.f(this.batteryState, vungleExt.batteryState) && this.batterySaverEnabled == vungleExt.batterySaverEnabled && p.f(this.connectionType, vungleExt.connectionType) && p.f(this.connectionTypeDetail, vungleExt.connectionTypeDetail) && p.f(this.locale, vungleExt.locale) && p.f(this.language, vungleExt.language) && p.f(this.timeZone, vungleExt.timeZone) && p.f(Float.valueOf(this.volumeLevel), Float.valueOf(vungleExt.volumeLevel)) && this.soundEnabled == vungleExt.soundEnabled && this.isTv == vungleExt.isTv && this.sdCardAvailable == vungleExt.sdCardAvailable && this.isSideloadEnabled == vungleExt.isSideloadEnabled && p.f(this.gaid, vungleExt.gaid) && p.f(this.amazonAdvertisingId, vungleExt.amazonAdvertisingId) && p.f(this.sit, vungleExt.sit) && p.f(this.oit, vungleExt.oit) && p.f(this.ort, vungleExt.ort) && p.f(this.obt, vungleExt.obt) && p.f(this.gpVersion, vungleExt.gpVersion);
        }

        @Nullable
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        @Nullable
        public final String getAppSetId() {
            return this.appSetId;
        }

        @Nullable
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        @Nullable
        public final String getBatteryState() {
            return this.batteryState;
        }

        @Nullable
        public final String getConnectionType() {
            return this.connectionType;
        }

        @Nullable
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        @Nullable
        public final String getGaid() {
            return this.gaid;
        }

        @Nullable
        public final String getGpVersion() {
            return this.gpVersion;
        }

        @Nullable
        public final String getLanguage() {
            return this.language;
        }

        @Nullable
        public final String getLocale() {
            return this.locale;
        }

        @Nullable
        public final Long getObt() {
            return this.obt;
        }

        @Nullable
        public final Long getOit() {
            return this.oit;
        }

        @Nullable
        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        @Nullable
        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        @Nullable
        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r2v33, types: [int] */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v46 */
        public int hashCode() {
            boolean z10 = this.isGooglePlayServicesAvailable;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            String str = this.appSetId;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.hashCode(this.batteryLevel)) * 31;
            String str2 = this.batteryState;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.batterySaverEnabled)) * 31;
            String str3 = this.connectionType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.hashCode(this.volumeLevel)) * 31) + Integer.hashCode(this.soundEnabled)) * 31;
            boolean z11 = this.isTv;
            ?? r22 = z11;
            if (z11) {
                r22 = 1;
            }
            int iHashCode9 = (((iHashCode8 + r22) * 31) + Integer.hashCode(this.sdCardAvailable)) * 31;
            boolean z12 = this.isSideloadEnabled;
            int i11 = (iHashCode9 + (z12 ? 1 : z12)) * 31;
            String str8 = this.gaid;
            int iHashCode10 = (i11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l10 = this.sit;
            int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.oit;
            int iHashCode13 = (iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.ort;
            int iHashCode14 = (iHashCode13 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.obt;
            int iHashCode15 = (iHashCode14 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str10 = this.gpVersion;
            return iHashCode15 + (str10 != null ? str10.hashCode() : 0);
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(@Nullable String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(@Nullable String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(@Nullable Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f10) {
            this.batteryLevel = f10;
        }

        public final void setBatterySaverEnabled(int i10) {
            this.batterySaverEnabled = i10;
        }

        public final void setBatteryState(@Nullable String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(@Nullable String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(@Nullable String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(@Nullable String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z10) {
            this.isGooglePlayServicesAvailable = z10;
        }

        public final void setGpVersion(@Nullable String str) {
            this.gpVersion = str;
        }

        public final void setLanguage(@Nullable String str) {
            this.language = str;
        }

        public final void setLocale(@Nullable String str) {
            this.locale = str;
        }

        public final void setObt(@Nullable Long l10) {
            this.obt = l10;
        }

        public final void setOit(@Nullable Long l10) {
            this.oit = l10;
        }

        public final void setOrt(@Nullable Long l10) {
            this.ort = l10;
        }

        public final void setSdCardAvailable(int i10) {
            this.sdCardAvailable = i10;
        }

        public final void setSideloadEnabled(boolean z10) {
            this.isSideloadEnabled = z10;
        }

        public final void setSit(@Nullable Long l10) {
            this.sit = l10;
        }

        public final void setSoundEnabled(int i10) {
            this.soundEnabled = i10;
        }

        public final void setTimeZone(@Nullable String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z10) {
            this.isTv = z10;
        }

        public final void setVolumeLevel(float f10) {
            this.volumeLevel = f10;
        }

        @NotNull
        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ", gpVersion=" + this.gpVersion + ')';
        }
    }

    public /* synthetic */ DeviceNode(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, Integer num, VungleExt vungleExt, r2 r2Var) {
        if (119 != (i10 & 119)) {
            c2.a(i10, 119, DeviceNode$$serializer.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i10 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i11;
        this.h = i12;
        if ((i10 & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i10 & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i10 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i10 & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = vungleExt;
        }
    }

    public DeviceNode(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, int i10, int i11, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable VungleExt vungleExt) {
        p.k(str, Q6.f30265t);
        p.k(str2, "model");
        p.k(str3, Q6.G);
        p.k(str5, Q6.F);
        this.make = str;
        this.model = str2;
        this.osv = str3;
        this.carrier = str4;
        this.os = str5;
        this.w = i10;
        this.h = i11;
        this.ua = str6;
        this.ifa = str7;
        this.lmt = num;
        this.ext = vungleExt;
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, i iVar) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, i10, i11, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : vungleExt);
    }

    public static final void write$Self(@NotNull DeviceNode deviceNode, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
        p.k(deviceNode, "self");
        p.k(dVar, "output");
        p.k(serialDescriptor, "serialDesc");
        dVar.q(serialDescriptor, 0, deviceNode.make);
        dVar.q(serialDescriptor, 1, deviceNode.model);
        dVar.q(serialDescriptor, 2, deviceNode.osv);
        if (dVar.r(serialDescriptor, 3) || deviceNode.carrier != null) {
            dVar.f(serialDescriptor, 3, w2.f86635a, deviceNode.carrier);
        }
        dVar.q(serialDescriptor, 4, deviceNode.os);
        dVar.o(serialDescriptor, 5, deviceNode.w);
        dVar.o(serialDescriptor, 6, deviceNode.h);
        if (dVar.r(serialDescriptor, 7) || deviceNode.ua != null) {
            dVar.f(serialDescriptor, 7, w2.f86635a, deviceNode.ua);
        }
        if (dVar.r(serialDescriptor, 8) || deviceNode.ifa != null) {
            dVar.f(serialDescriptor, 8, w2.f86635a, deviceNode.ifa);
        }
        if (dVar.r(serialDescriptor, 9) || deviceNode.lmt != null) {
            dVar.f(serialDescriptor, 9, v0.f86626a, deviceNode.lmt);
        }
        if (dVar.r(serialDescriptor, 10) || deviceNode.ext != null) {
            dVar.f(serialDescriptor, 10, DeviceNode$VungleExt$$serializer.INSTANCE, deviceNode.ext);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getLmt() {
        return this.lmt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VungleExt getExt() {
        return this.ext;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOsv() {
        return this.osv;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getH() {
        return this.h;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    @NotNull
    public final DeviceNode copy(@NotNull String make, @NotNull String model, @NotNull String osv, @Nullable String carrier, @NotNull String os2, int w10, int h10, @Nullable String ua2, @Nullable String ifa, @Nullable Integer lmt, @Nullable VungleExt ext) {
        p.k(make, Q6.f30265t);
        p.k(model, "model");
        p.k(osv, Q6.G);
        p.k(os2, Q6.F);
        return new DeviceNode(make, model, osv, carrier, os2, w10, h10, ua2, ifa, lmt, ext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) other;
        return p.f(this.make, deviceNode.make) && p.f(this.model, deviceNode.model) && p.f(this.osv, deviceNode.osv) && p.f(this.carrier, deviceNode.carrier) && p.f(this.os, deviceNode.os) && this.w == deviceNode.w && this.h == deviceNode.h && p.f(this.ua, deviceNode.ua) && p.f(this.ifa, deviceNode.ifa) && p.f(this.lmt, deviceNode.lmt) && p.f(this.ext, deviceNode.ext);
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final VungleExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    @Nullable
    public final String getIfa() {
        return this.ifa;
    }

    @Nullable
    public final Integer getLmt() {
        return this.lmt;
    }

    @NotNull
    public final String getMake() {
        return this.make;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsv() {
        return this.osv;
    }

    @Nullable
    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        int iHashCode = ((((this.make.hashCode() * 31) + this.model.hashCode()) * 31) + this.osv.hashCode()) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.os.hashCode()) * 31) + Integer.hashCode(this.w)) * 31) + Integer.hashCode(this.h)) * 31;
        String str2 = this.ua;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        VungleExt vungleExt = this.ext;
        return iHashCode5 + (vungleExt != null ? vungleExt.hashCode() : 0);
    }

    public final void setExt(@Nullable VungleExt vungleExt) {
        this.ext = vungleExt;
    }

    public final void setH(int i10) {
        this.h = i10;
    }

    public final void setIfa(@Nullable String str) {
        this.ifa = str;
    }

    public final void setLmt(@Nullable Integer num) {
        this.lmt = num;
    }

    public final void setUa(@Nullable String str) {
        this.ua = str;
    }

    public final void setW(int i10) {
        this.w = i10;
    }

    @NotNull
    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }
}
