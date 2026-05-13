package com.vungle.ads.internal.model;

import android.util.Base64;
import bn.r;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import on.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import so.k;
import so.t;
import tn.i;
import tn.p;
import wo.c2;
import wo.r2;
import xo.a;
import xo.d;
import xo.u;

/* JADX INFO: compiled from: BidPayload.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B1\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017¢\u0006\u0004\b2\u00103BI\b\u0017\u0012\u0006\u00104\u001a\u00020\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017\u0012\b\u00100\u001a\u0004\u0018\u00010\u0010\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tHÇ\u0001J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017HÆ\u0003J:\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/vungle/ads/internal/model/BidPayload;", "", "", "compressed", "", "gzipDecode", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "getPlacementId", "getEventId", "getCreativeId", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdPayload", "getDecodedAdsResponse", "", "component1", "()Ljava/lang/Integer;", "component2", "", "component3", "version", "adunit", "impression", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/vungle/ads/internal/model/BidPayload;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getVersion", "Ljava/lang/String;", "getAdunit", "()Ljava/lang/String;", "Ljava/util/List;", "getImpression", "()Ljava/util/List;", "Lxo/a;", "json", "Lxo/a;", "getJson$annotations", "()V", "ad", "Lcom/vungle/ads/internal/model/AdPayload;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@k
public final /* data */ class BidPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final AdPayload ad;

    @Nullable
    private final String adunit;

    @Nullable
    private final List<String> impression;

    @NotNull
    private final a json;

    @Nullable
    private final Integer version;

    /* JADX INFO: compiled from: BidPayload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/BidPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/BidPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<BidPayload> serializer() {
            return BidPayload$$serializer.INSTANCE;
        }
    }

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ BidPayload(int i10, Integer num, String str, List list, AdPayload adPayload, r2 r2Var) {
        String decodedAdsResponse;
        if ((i10 & 0) != 0) {
            c2.a(i10, 0, BidPayload$$serializer.INSTANCE.getDescriptor());
        }
        AdPayload adPayload2 = null;
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i10 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        a aVarB = u.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.model.BidPayload.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull d dVar) {
                p.k(dVar, "$this$Json");
                dVar.f(true);
                dVar.d(true);
                dVar.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        if ((i10 & 8) != 0) {
            this.ad = adPayload;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            KSerializer<Object> kSerializerB = t.b(aVarB.a(), tn.t.m(AdPayload.class));
            p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload2 = (AdPayload) aVarB.c(kSerializerB, decodedAdsResponse);
        }
        this.ad = adPayload2;
    }

    public BidPayload(@Nullable Integer num, @Nullable String str, @Nullable List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        AdPayload adPayload = null;
        a aVarB = u.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.model.BidPayload$json$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull d dVar) {
                p.k(dVar, "$this$Json");
                dVar.f(true);
                dVar.d(true);
                dVar.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            KSerializer<Object> kSerializerB = t.b(aVarB.a(), tn.t.m(AdPayload.class));
            p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload = (AdPayload) aVarB.c(kSerializerB, decodedAdsResponse);
        }
        this.ad = adPayload;
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i10 & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i10 & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    private final String gzipDecode(byte[] compressed) throws Throwable {
        GZIPInputStream gZIPInputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                bArr = new byte[1024];
            } finally {
            }
        } finally {
        }
        while (true) {
            int i10 = gZIPInputStream.read(bArr);
            if (i10 == -1) {
                r rVar = r.f5635a;
                b.a(gZIPInputStream, null);
                b.a(byteArrayInputStream, null);
                String string = byteArrayOutputStream.toString();
                p.j(string, "result.toString()");
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self(@org.jetbrains.annotations.NotNull com.vungle.ads.internal.model.BidPayload r8, @org.jetbrains.annotations.NotNull vo.d r9, @org.jetbrains.annotations.NotNull kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            java.lang.String r0 = "self"
            tn.p.k(r8, r0)
            java.lang.String r0 = "output"
            tn.p.k(r9, r0)
            java.lang.String r0 = "serialDesc"
            tn.p.k(r10, r0)
            r0 = 0
            boolean r1 = r9.r(r10, r0)
            r2 = 1
            if (r1 == 0) goto L19
        L17:
            r1 = r2
            goto L1f
        L19:
            java.lang.Integer r1 = r8.version
            if (r1 == 0) goto L1e
            goto L17
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L28
            wo.v0 r1 = wo.v0.f86626a
            java.lang.Integer r3 = r8.version
            r9.f(r10, r0, r1, r3)
        L28:
            boolean r1 = r9.r(r10, r2)
            if (r1 == 0) goto L30
        L2e:
            r1 = r2
            goto L36
        L30:
            java.lang.String r1 = r8.adunit
            if (r1 == 0) goto L35
            goto L2e
        L35:
            r1 = r0
        L36:
            if (r1 == 0) goto L3f
            wo.w2 r1 = wo.w2.f86635a
            java.lang.String r3 = r8.adunit
            r9.f(r10, r2, r1, r3)
        L3f:
            r1 = 2
            boolean r3 = r9.r(r10, r1)
            if (r3 == 0) goto L48
        L46:
            r3 = r2
            goto L4e
        L48:
            java.util.List<java.lang.String> r3 = r8.impression
            if (r3 == 0) goto L4d
            goto L46
        L4d:
            r3 = r0
        L4e:
            if (r3 == 0) goto L5c
            wo.f r3 = new wo.f
            wo.w2 r4 = wo.w2.f86635a
            r3.<init>(r4)
            java.util.List<java.lang.String> r4 = r8.impression
            r9.f(r10, r1, r3, r4)
        L5c:
            r1 = 3
            boolean r3 = r9.r(r10, r1)
            if (r3 == 0) goto L65
        L63:
            r0 = r2
            goto L95
        L65:
            com.vungle.ads.internal.model.AdPayload r3 = r8.ad
            java.lang.String r4 = r8.adunit
            r5 = 0
            if (r4 == 0) goto L8e
            java.lang.String r4 = r8.getDecodedAdsResponse()
            if (r4 == 0) goto L8e
            xo.a r5 = r8.json
            zo.c r6 = r5.a()
            java.lang.Class<com.vungle.ads.internal.model.AdPayload> r7 = com.vungle.ads.internal.model.AdPayload.class
            kotlin.reflect.KType r7 = tn.t.m(r7)
            kotlinx.serialization.KSerializer r6 = so.t.b(r6, r7)
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"
            tn.p.i(r6, r7)
            java.lang.Object r4 = r5.c(r6, r4)
            com.vungle.ads.internal.model.AdPayload r4 = (com.vungle.ads.internal.model.AdPayload) r4
            r5 = r4
        L8e:
            boolean r3 = tn.p.f(r3, r5)
            if (r3 != 0) goto L95
            goto L63
        L95:
            if (r0 == 0) goto L9e
            com.vungle.ads.internal.model.AdPayload$$serializer r0 = com.vungle.ads.internal.model.AdPayload$$serializer.INSTANCE
            com.vungle.ads.internal.model.AdPayload r8 = r8.ad
            r9.f(r10, r1, r0, r8)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.BidPayload.write$Self(com.vungle.ads.internal.model.BidPayload, vo.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdunit() {
        return this.adunit;
    }

    @Nullable
    public final List<String> component3() {
        return this.impression;
    }

    @NotNull
    public final BidPayload copy(@Nullable Integer version, @Nullable String adunit, @Nullable List<String> impression) {
        return new BidPayload(version, adunit, impression);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) other;
        return p.f(this.version, bidPayload.version) && p.f(this.adunit, bidPayload.adunit) && p.f(this.impression, bidPayload.impression);
    }

    @Nullable
    /* JADX INFO: renamed from: getAdPayload, reason: from getter */
    public final AdPayload getAd() {
        return this.ad;
    }

    @Nullable
    public final String getAdunit() {
        return this.adunit;
    }

    @Nullable
    public final String getCreativeId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.getCreativeId();
        }
        return null;
    }

    @Nullable
    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    @Nullable
    public final String getEventId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.eventId();
        }
        return null;
    }

    @Nullable
    public final List<String> getImpression() {
        return this.impression;
    }

    @Nullable
    public final String getPlacementId() {
        AdPayload adPayload = this.ad;
        if (adPayload != null) {
            return adPayload.placementId();
        }
        return null;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }
}
