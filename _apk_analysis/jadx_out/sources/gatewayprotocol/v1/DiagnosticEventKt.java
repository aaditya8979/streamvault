package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DiagnosticEventKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DiagnosticEventKt {

    @NotNull
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    /* JADX INFO: compiled from: DiagnosticEventKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        /* JADX INFO: compiled from: DiagnosticEventKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: DiagnosticEventKt.kt */
        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        /* JADX INFO: compiled from: DiagnosticEventKt.kt */
        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEventBuild = this._builder.build();
            p.j(diagnosticEventBuild, "_builder.build()");
            return diagnosticEventBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearHeaderBiddingTokenNumber() {
            this._builder.clearHeaderBiddingTokenNumber();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            p.k(dslMap, "<this>");
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearReasonDebug() {
            this._builder.clearReasonDebug();
        }

        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            p.k(dslMap, "<this>");
            this._builder.clearStringTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            p.j(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = this._builder.getAdType();
            p.j(adType, "_builder.getAdType()");
            return adType;
        }

        public final int getAdTypeValue() {
            return this._builder.getAdTypeValue();
        }

        @NotNull
        public final String getCustomEventType() {
            String customEventType = this._builder.getCustomEventType();
            p.j(customEventType, "_builder.getCustomEventType()");
            return customEventType;
        }

        @NotNull
        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            p.j(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final int getEventId() {
            return this._builder.getEventId();
        }

        @NotNull
        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            DiagnosticEventRequestOuterClass.DiagnosticEventType eventType = this._builder.getEventType();
            p.j(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final int getHeaderBiddingTokenNumber() {
            return this._builder.getHeaderBiddingTokenNumber();
        }

        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            p.j(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final /* synthetic */ DslMap getIntTagsMap() {
            Map<String, Integer> intTagsMap = this._builder.getIntTagsMap();
            p.j(intTagsMap, "_builder.getIntTagsMap()");
            return new DslMap(intTagsMap);
        }

        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            p.j(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        @NotNull
        public final String getReason() {
            String reason = this._builder.getReason();
            p.j(reason, "_builder.getReason()");
            return reason;
        }

        @NotNull
        public final String getReasonDebug() {
            String reasonDebug = this._builder.getReasonDebug();
            p.j(reasonDebug, "_builder.getReasonDebug()");
            return reasonDebug;
        }

        public final /* synthetic */ DslMap getStringTagsMap() {
            Map<String, String> stringTagsMap = this._builder.getStringTagsMap();
            p.j(stringTagsMap, "_builder.getStringTagsMap()");
            return new DslMap(stringTagsMap);
        }

        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            p.j(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasErrorToken() {
            return this._builder.hasErrorToken();
        }

        public final boolean hasHeaderBiddingTokenNumber() {
            return this._builder.hasHeaderBiddingTokenNumber();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasReason() {
            return this._builder.hasReason();
        }

        public final boolean hasReasonDebug() {
            return this._builder.hasReasonDebug();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            p.k(dslMap, "<this>");
            p.k(map, "map");
            this._builder.putAllIntTags(map);
        }

        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            p.k(dslMap, "<this>");
            p.k(map, "map");
            this._builder.putAllStringTags(map);
        }

        public final void putIntTags(@NotNull DslMap<String, Integer, IntTagsProxy> dslMap, @NotNull String str, int i10) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            this._builder.putIntTags(str, i10);
        }

        public final void putStringTags(@NotNull DslMap<String, String, StringTagsProxy> dslMap, @NotNull String str, @NotNull String str2) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            p.k(str2, "value");
            this._builder.putStringTags(str, str2);
        }

        public final /* synthetic */ void removeIntTags(DslMap dslMap, String str) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            this._builder.removeIntTags(str);
        }

        public final /* synthetic */ void removeStringTags(DslMap dslMap, String str) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            this._builder.removeStringTags(str);
        }

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat adFormat) {
            p.k(adFormat, "value");
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setAdType(@NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
            p.k(diagnosticAdType, "value");
            this._builder.setAdType(diagnosticAdType);
        }

        public final void setAdTypeValue(int i10) {
            this._builder.setAdTypeValue(i10);
        }

        public final void setCustomEventType(@NotNull String str) {
            p.k(str, "value");
            this._builder.setCustomEventType(str);
        }

        public final void setErrorToken(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setErrorToken(byteString);
        }

        public final void setEventId(int i10) {
            this._builder.setEventId(i10);
        }

        public final void setEventType(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            p.k(diagnosticEventType, "value");
            this._builder.setEventType(diagnosticEventType);
        }

        public final void setEventTypeValue(int i10) {
            this._builder.setEventTypeValue(i10);
        }

        public final void setHeaderBiddingTokenNumber(int i10) {
            this._builder.setHeaderBiddingTokenNumber(i10);
        }

        public final void setImpressionOpportunityId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final /* synthetic */ void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String str, int i10) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            putIntTags(dslMap, str, i10);
        }

        public final void setIsHeaderBidding(boolean z10) {
            this._builder.setIsHeaderBidding(z10);
        }

        public final void setPlacementId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setPlacementId(str);
        }

        public final void setReason(@NotNull String str) {
            p.k(str, "value");
            this._builder.setReason(str);
        }

        public final void setReasonDebug(@NotNull String str) {
            p.k(str, "value");
            this._builder.setReasonDebug(str);
        }

        public final /* synthetic */ void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String str, String str2) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            p.k(str2, "value");
            putStringTags(dslMap, str, str2);
        }

        public final void setTimeValue(double d10) {
            this._builder.setTimeValue(d10);
        }

        public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps timestamps) {
            p.k(timestamps, "value");
            this._builder.setTimestamps(timestamps);
        }
    }

    private DiagnosticEventKt() {
    }
}
