package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CampaignKt.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CampaignKt {

    @NotNull
    public static final CampaignKt INSTANCE = new CampaignKt();

    /* JADX INFO: compiled from: CampaignKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        /* JADX INFO: compiled from: CampaignKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            CampaignStateOuterClass.Campaign campaignBuild = this._builder.build();
            p.j(campaignBuild, "_builder.build()");
            return campaignBuild;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        @NotNull
        public final ByteString getData() {
            ByteString data = this._builder.getData();
            p.j(data, "_builder.getData()");
            return data;
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            p.j(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            p.j(loadTimestamp, "_builder.getLoadTimestamp()");
            return loadTimestamp;
        }

        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            p.j(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            p.j(showTimestamp, "_builder.getShowTimestamp()");
            return showTimestamp;
        }

        @Nullable
        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        public final void setData(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setData(byteString);
        }

        public final void setDataVersion(int i10) {
            this._builder.setDataVersion(i10);
        }

        public final void setImpressionOpportunityId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setLoadTimestamp(@NotNull TimestampsOuterClass.Timestamps timestamps) {
            p.k(timestamps, "value");
            this._builder.setLoadTimestamp(timestamps);
        }

        public final void setPlacementId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setPlacementId(str);
        }

        public final void setShowTimestamp(@NotNull TimestampsOuterClass.Timestamps timestamps) {
            p.k(timestamps, "value");
            this._builder.setShowTimestamp(timestamps);
        }
    }

    private CampaignKt() {
    }
}
