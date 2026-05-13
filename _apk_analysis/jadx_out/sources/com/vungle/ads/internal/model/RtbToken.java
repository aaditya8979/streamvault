package com.vungle.ads.internal.model;

import com.ironsource.C3978d4;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.ui.AdActivity;
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
import wo.r2;

/* JADX INFO: compiled from: RtbToken.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B;\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b0\u00101BM\b\u0017\u0012\u0006\u00102\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0011\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0011HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*R \u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u00068"}, d2 = {"Lcom/vungle/ads/internal/model/RtbToken;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "Lcom/vungle/ads/internal/model/DeviceNode;", "component1", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "component2", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "component3", "Lcom/vungle/ads/internal/model/RtbRequest;", "component4", "", "component5", C3978d4.i.G, "user", "ext", AdActivity.REQUEST_KEY_EXTRA, "ordinalView", "copy", "", "toString", "hashCode", "other", "", "equals", "Lcom/vungle/ads/internal/model/DeviceNode;", "getDevice", "()Lcom/vungle/ads/internal/model/DeviceNode;", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "getUser", "()Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "getExt", "()Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "Lcom/vungle/ads/internal/model/RtbRequest;", "getRequest", "()Lcom/vungle/ads/internal/model/RtbRequest;", "I", "getOrdinalView", "()I", "getOrdinalView$annotations", "()V", "<init>", "(Lcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/RtbRequest;I)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/DeviceNode;Lcom/vungle/ads/internal/model/CommonRequestBody$User;Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;Lcom/vungle/ads/internal/model/RtbRequest;ILwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@k
public final /* data */ class RtbToken {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DeviceNode device;

    @Nullable
    private final CommonRequestBody.RequestExt ext;
    private final int ordinalView;

    @Nullable
    private final RtbRequest request;

    @Nullable
    private final CommonRequestBody.User user;

    /* JADX INFO: compiled from: RtbToken.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/RtbToken$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/RtbToken;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<RtbToken> serializer() {
            return RtbToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RtbToken(int i10, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i11, r2 r2Var) {
        if (17 != (i10 & 17)) {
            c2.a(i10, 17, RtbToken$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 8) == 0) {
            this.request = null;
        } else {
            this.request = rtbRequest;
        }
        this.ordinalView = i11;
    }

    public RtbToken(@NotNull DeviceNode deviceNode, @Nullable CommonRequestBody.User user, @Nullable CommonRequestBody.RequestExt requestExt, @Nullable RtbRequest rtbRequest, int i10) {
        p.k(deviceNode, C3978d4.i.G);
        this.device = deviceNode;
        this.user = user;
        this.ext = requestExt;
        this.request = rtbRequest;
        this.ordinalView = i10;
    }

    public /* synthetic */ RtbToken(DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, i iVar) {
        this(deviceNode, (i11 & 2) != 0 ? null : user, (i11 & 4) != 0 ? null : requestExt, (i11 & 8) != 0 ? null : rtbRequest, i10);
    }

    public static /* synthetic */ RtbToken copy$default(RtbToken rtbToken, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deviceNode = rtbToken.device;
        }
        if ((i11 & 2) != 0) {
            user = rtbToken.user;
        }
        CommonRequestBody.User user2 = user;
        if ((i11 & 4) != 0) {
            requestExt = rtbToken.ext;
        }
        CommonRequestBody.RequestExt requestExt2 = requestExt;
        if ((i11 & 8) != 0) {
            rtbRequest = rtbToken.request;
        }
        RtbRequest rtbRequest2 = rtbRequest;
        if ((i11 & 16) != 0) {
            i10 = rtbToken.ordinalView;
        }
        return rtbToken.copy(deviceNode, user2, requestExt2, rtbRequest2, i10);
    }

    public static /* synthetic */ void getOrdinalView$annotations() {
    }

    public static final void write$Self(@NotNull RtbToken rtbToken, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
        p.k(rtbToken, "self");
        p.k(dVar, "output");
        p.k(serialDescriptor, "serialDesc");
        dVar.g(serialDescriptor, 0, DeviceNode$$serializer.INSTANCE, rtbToken.device);
        if (dVar.r(serialDescriptor, 1) || rtbToken.user != null) {
            dVar.f(serialDescriptor, 1, CommonRequestBody$User$$serializer.INSTANCE, rtbToken.user);
        }
        if (dVar.r(serialDescriptor, 2) || rtbToken.ext != null) {
            dVar.f(serialDescriptor, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, rtbToken.ext);
        }
        if (dVar.r(serialDescriptor, 3) || rtbToken.request != null) {
            dVar.f(serialDescriptor, 3, RtbRequest$$serializer.INSTANCE, rtbToken.request);
        }
        dVar.o(serialDescriptor, 4, rtbToken.ordinalView);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceNode getDevice() {
        return this.device;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CommonRequestBody.User getUser() {
        return this.user;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CommonRequestBody.RequestExt getExt() {
        return this.ext;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RtbRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOrdinalView() {
        return this.ordinalView;
    }

    @NotNull
    public final RtbToken copy(@NotNull DeviceNode device, @Nullable CommonRequestBody.User user, @Nullable CommonRequestBody.RequestExt ext, @Nullable RtbRequest request, int ordinalView) {
        p.k(device, C3978d4.i.G);
        return new RtbToken(device, user, ext, request, ordinalView);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtbToken)) {
            return false;
        }
        RtbToken rtbToken = (RtbToken) other;
        return p.f(this.device, rtbToken.device) && p.f(this.user, rtbToken.user) && p.f(this.ext, rtbToken.ext) && p.f(this.request, rtbToken.request) && this.ordinalView == rtbToken.ordinalView;
    }

    @NotNull
    public final DeviceNode getDevice() {
        return this.device;
    }

    @Nullable
    public final CommonRequestBody.RequestExt getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    @Nullable
    public final RtbRequest getRequest() {
        return this.request;
    }

    @Nullable
    public final CommonRequestBody.User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        CommonRequestBody.User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        CommonRequestBody.RequestExt requestExt = this.ext;
        int iHashCode3 = (iHashCode2 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RtbRequest rtbRequest = this.request;
        return ((iHashCode3 + (rtbRequest != null ? rtbRequest.hashCode() : 0)) * 31) + Integer.hashCode(this.ordinalView);
    }

    @NotNull
    public String toString() {
        return "RtbToken(device=" + this.device + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ", ordinalView=" + this.ordinalView + ')';
    }
}
