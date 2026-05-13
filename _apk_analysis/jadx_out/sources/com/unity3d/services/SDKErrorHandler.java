package com.unity3d.services;

import bn.r;
import cn.p0;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import hn.c;
import in.a;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import jn.d;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.i0;
import p000do.k0;
import p000do.l0;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: SDKErrorHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SDKErrorHandler implements i0 {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String UNITY_PACKAGE = "com.unity3d";

    @NotNull
    public static final String UNKNOWN_FILE = "unknown";

    @NotNull
    private final AlternativeFlowReader alternativeFlowReader;

    @NotNull
    private final h0 ioDispatcher;

    @NotNull
    private final i0.b key;

    @NotNull
    private final l0 scope;

    @NotNull
    private final SDKMetricsSender sdkMetricsSender;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: compiled from: SDKErrorHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.SDKErrorHandler$sendDiagnostic$1, reason: invalid class name */
    /* JADX INFO: compiled from: SDKErrorHandler.kt */
    @d(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ String $name;
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ String $reason;
        public final /* synthetic */ String $scopeName;
        public final /* synthetic */ String $stackTrace;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, String str4, ByteString byteString, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$name = str;
            this.$reason = str2;
            this.$stackTrace = str3;
            this.$scopeName = str4;
            this.$opportunityId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return SDKErrorHandler.this.new AnonymousClass1(this.$name, this.$reason, this.$stackTrace, this.$scopeName, this.$opportunityId, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            SendDiagnosticEvent sendDiagnosticEvent = SDKErrorHandler.this.sendDiagnosticEvent;
            String str = this.$name;
            String str2 = this.$reason;
            String str3 = this.$stackTrace;
            String str4 = this.$scopeName;
            ByteString byteString = this.$opportunityId;
            Map mapD = p0.d();
            mapD.put("reason", str2);
            mapD.put("reason_debug", str3);
            mapD.put("coroutine_name", str4);
            if (byteString != null) {
                String string = ProtobufExtensionsKt.toUUID(byteString).toString();
                tn.p.j(string, "it.toUUID().toString()");
                mapD.put("impressionOpportunityId", string);
            }
            r rVar = r.f5635a;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, null, p0.c(mapD), null, null, null, 58, null);
            return r.f5635a;
        }
    }

    public SDKErrorHandler(@NotNull h0 h0Var, @NotNull AlternativeFlowReader alternativeFlowReader, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SDKMetricsSender sDKMetricsSender) {
        tn.p.k(h0Var, "ioDispatcher");
        tn.p.k(alternativeFlowReader, "alternativeFlowReader");
        tn.p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        tn.p.k(sDKMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = h0Var;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sDKMetricsSender;
        this.scope = kotlinx.coroutines.d.i(kotlinx.coroutines.d.a(h0Var), new k0("SDKErrorHandler"));
        this.key = i0.D8;
    }

    private final String retrieveCoroutineName(kotlin.coroutines.d dVar) {
        String strI;
        k0 k0Var = (k0) dVar.get(k0.f59860c);
        return (k0Var == null || (strI = k0Var.I()) == null) ? "unknown" : strI;
    }

    private final ByteString retrieveOpportunityId(kotlin.coroutines.d dVar) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) dVar.get(CoroutineOpportunity.Key);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    private final void sendDiagnostic(String str, String str2, String str3, String str4, ByteString byteString) {
        p000do.i.d(this.scope, null, null, new AnonymousClass1(str, str2, str4, str3, byteString, null), 3, null);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) i0.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) i0.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @NotNull
    public i0.b getKey() {
        return this.key;
    }

    @Override // p000do.i0
    public void handleException(@NotNull kotlin.coroutines.d dVar, @NotNull Throwable th2) {
        tn.p.k(dVar, GAMConfig.KEY_CONTEXT);
        tn.p.k(th2, "exception");
        String strRetrieveCoroutineName = retrieveCoroutineName(dVar);
        ByteString byteStringRetrieveOpportunityId = retrieveOpportunityId(dVar);
        String str = th2 instanceof NullPointerException ? "native_exception_npe" : th2 instanceof OutOfMemoryError ? "native_exception_oom" : th2 instanceof IllegalStateException ? "native_exception_ise" : th2 instanceof SecurityException ? "native_exception_se" : th2 instanceof RuntimeException ? "native_exception_re" : "native_exception";
        boolean zInvoke = this.alternativeFlowReader.invoke();
        String strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(th2);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
        if (zInvoke) {
            sendDiagnostic(str, strRetrieveUnityCrashValue, strRetrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(th2, 15), byteStringRetrieveOpportunityId);
        } else {
            sendMetric(new Metric(str, strRetrieveUnityCrashValue, null, 4, null));
        }
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d minusKey(@NotNull d.c<?> cVar) {
        return i0.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d plus(@NotNull kotlin.coroutines.d dVar) {
        return i0.a.d(this, dVar);
    }
}
