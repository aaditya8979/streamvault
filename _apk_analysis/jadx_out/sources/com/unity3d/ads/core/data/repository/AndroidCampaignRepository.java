package com.unity3d.ads.core.data.repository;

import bn.h;
import bn.r;
import com.google.protobuf.ByteString;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import go.l;
import go.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidCampaignRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidCampaignRepository implements CampaignRepository {

    @NotNull
    private final l<Map<String, CampaignStateOuterClass.Campaign>> campaigns;

    @NotNull
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(@NotNull GetSharedDataTimestamps getSharedDataTimestamps) {
        p.k(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = v.a(kotlin.collections.a.j());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    @Nullable
    public CampaignStateOuterClass.Campaign getCampaign(@NotNull ByteString byteString) {
        p.k(byteString, "opportunityId");
        return this.campaigns.getValue().get(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    @NotNull
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection<CampaignStateOuterClass.Campaign> collectionValues = this.campaigns.getValue().values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder builderNewBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        CampaignStateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllShownCampaigns(dsl_create.getShownCampaigns(), list);
        dsl_create.addAllLoadedCampaigns(dsl_create.getLoadedCampaigns(), list2);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(@NotNull ByteString byteString) {
        Map<String, CampaignStateOuterClass.Campaign> value;
        String stringUtf8;
        p.k(byteString, "opportunityId");
        l<Map<String, CampaignStateOuterClass.Campaign>> lVar = this.campaigns;
        do {
            value = lVar.getValue();
            stringUtf8 = byteString.toStringUtf8();
            p.j(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!lVar.b(value, kotlin.collections.a.n(value, stringUtf8)));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(@NotNull ByteString byteString, @NotNull CampaignStateOuterClass.Campaign campaign) {
        Map<String, CampaignStateOuterClass.Campaign> value;
        p.k(byteString, "opportunityId");
        p.k(campaign, MBInterstitialActivity.INTENT_CAMAPIGN);
        l<Map<String, CampaignStateOuterClass.Campaign>> lVar = this.campaigns;
        do {
            value = lVar.getValue();
        } while (!lVar.b(value, kotlin.collections.a.r(value, h.a(byteString.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(@NotNull ByteString byteString) {
        p.k(byteString, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            p.j(builder, "this.toBuilder()");
            CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            r rVar = r.f5635a;
            setCampaign(byteString, dsl_create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(@NotNull ByteString byteString) {
        p.k(byteString, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            p.j(builder, "this.toBuilder()");
            CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            r rVar = r.f5635a;
            setCampaign(byteString, dsl_create._build());
        }
    }
}
