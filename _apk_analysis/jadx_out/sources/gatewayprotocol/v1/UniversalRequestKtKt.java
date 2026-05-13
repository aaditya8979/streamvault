package gatewayprotocol.v1;

import bn.r;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: UniversalRequestKt.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UniversalRequestKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeuniversalRequest, reason: not valid java name */
    public static final UniversalRequestOuterClass.UniversalRequest m7527initializeuniversalRequest(@NotNull l<? super UniversalRequestKt.Dsl, r> lVar) {
        p.k(lVar, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        UniversalRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final UniversalRequestOuterClass.UniversalRequest.Payload copy(@NotNull UniversalRequestOuterClass.UniversalRequest.Payload payload, @NotNull l<? super UniversalRequestKt.PayloadKt.Dsl, r> lVar) {
        p.k(payload, "<this>");
        p.k(lVar, "block");
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder = payload.toBuilder();
        p.j(builder, "this.toBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final UniversalRequestOuterClass.UniversalRequest.SharedData copy(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedData sharedData, @NotNull l<? super UniversalRequestKt.SharedDataKt.Dsl, r> lVar) {
        p.k(sharedData, "<this>");
        p.k(lVar, "block");
        UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder = sharedData.toBuilder();
        p.j(builder, "this.toBuilder()");
        UniversalRequestKt.SharedDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final UniversalRequestOuterClass.UniversalRequest copy(@NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull l<? super UniversalRequestKt.Dsl, r> lVar) {
        p.k(universalRequest, "<this>");
        p.k(lVar, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        p.j(builder, "this.toBuilder()");
        UniversalRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshRequest()) {
            return payloadOrBuilder.getAdDataRefreshRequest();
        }
        return null;
    }

    @Nullable
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigRequest()) {
            return payloadOrBuilder.getAdPlayerConfigRequest();
        }
        return null;
    }

    @Nullable
    public static final AdRequestOuterClass.AdRequest getAdRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdRequest()) {
            return payloadOrBuilder.getAdRequest();
        }
        return null;
    }

    @Nullable
    public static final Timestamp getAppStartTimeOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        p.k(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasAppStartTime()) {
            return sharedDataOrBuilder.getAppStartTime();
        }
        return null;
    }

    @Nullable
    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAudienceManagementRequest()) {
            return payloadOrBuilder.getAudienceManagementRequest();
        }
        return null;
    }

    @Nullable
    public static final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        p.k(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasDeveloperConsent()) {
            return sharedDataOrBuilder.getDeveloperConsent();
        }
        return null;
    }

    @Nullable
    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasDiagnosticEventRequest()) {
            return payloadOrBuilder.getDiagnosticEventRequest();
        }
        return null;
    }

    @Nullable
    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasGetTokenEventRequest()) {
            return payloadOrBuilder.getGetTokenEventRequest();
        }
        return null;
    }

    @Nullable
    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationCompletedEventRequest()) {
            return payloadOrBuilder.getInitializationCompletedEventRequest();
        }
        return null;
    }

    @Nullable
    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationRequest()) {
            return payloadOrBuilder.getInitializationRequest();
        }
        return null;
    }

    @Nullable
    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        p.k(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasLimitedSessionToken()) {
            return sharedDataOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    @Nullable
    public static final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEventOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasOperativeEvent()) {
            return payloadOrBuilder.getOperativeEvent();
        }
        return null;
    }

    @Nullable
    public static final UniversalRequestOuterClass.UniversalRequest.Payload getPayloadOrNull(@NotNull UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        p.k(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasPayload()) {
            return universalRequestOrBuilder.getPayload();
        }
        return null;
    }

    @Nullable
    public static final PiiOuterClass.Pii getPiiOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        p.k(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasPii()) {
            return sharedDataOrBuilder.getPii();
        }
        return null;
    }

    @Nullable
    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateRequest()) {
            return payloadOrBuilder.getPrivacyUpdateRequest();
        }
        return null;
    }

    @Nullable
    public static final Timestamp getSdkStartTimeOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        p.k(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasSdkStartTime()) {
            return sharedDataOrBuilder.getSdkStartTime();
        }
        return null;
    }

    @Nullable
    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(@NotNull UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        p.k(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasSharedData()) {
            return universalRequestOrBuilder.getSharedData();
        }
        return null;
    }

    @Nullable
    public static final TestDataOuterClass.TestData getTestDataOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        p.k(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTestData()) {
            return sharedDataOrBuilder.getTestData();
        }
        return null;
    }

    @Nullable
    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        p.k(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTimestamps()) {
            return sharedDataOrBuilder.getTimestamps();
        }
        return null;
    }

    @Nullable
    public static final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequestOrNull(@NotNull UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        p.k(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasTransactionEventRequest()) {
            return payloadOrBuilder.getTransactionEventRequest();
        }
        return null;
    }
}
