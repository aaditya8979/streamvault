package com.unity3d.ads.core.data.repository;

import bn.r;
import cn.f0;
import cn.w;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import go.f;
import go.k;
import go.l;
import go.p;
import go.q;
import go.v;
import hn.c;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.i;
import p000do.k0;
import p000do.l0;

/* JADX INFO: compiled from: AndroidDiagnosticEventRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {

    @NotNull
    private final k<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;

    @NotNull
    private final l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;

    @NotNull
    private final l<Boolean> configured;

    @NotNull
    private final l0 coroutineScope;

    @NotNull
    private final p<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;

    @NotNull
    private final l<Boolean> enabled;

    @NotNull
    private final CoroutineTimer flushTimer;

    @NotNull
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidDiagnosticEventRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2", f = "AndroidDiagnosticEventRepository.kt", l = {70}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
        public final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$events = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return AndroidDiagnosticEventRepository.this.new AnonymousClass2(this.$events, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k kVar = AndroidDiagnosticEventRepository.this._diagnosticEvents;
                List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
                this.label = 1;
                if (kVar.emit(list, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public AndroidDiagnosticEventRepository(@NotNull CoroutineTimer coroutineTimer, @NotNull GetDiagnosticEventRequest getDiagnosticEventRequest, @NotNull h0 h0Var) {
        tn.p.k(coroutineTimer, "flushTimer");
        tn.p.k(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        tn.p.k(h0Var, "dispatcher");
        this.flushTimer = coroutineTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = kotlinx.coroutines.d.i(kotlinx.coroutines.d.a(h0Var), new k0("DiagnosticEventRepository"));
        this.batch = v.a(w.m());
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = v.a(bool);
        this.configured = v.a(bool);
        k<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> kVarB = q.b(100, 0, null, 6, null);
        this._diagnosticEvents = kVarB;
        this.diagnosticEvents = f.b(kVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flush$lambda$3(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List list) {
        tn.p.k(androidDiagnosticEventRepository, "this$0");
        tn.p.k(list, "$events");
        return "Unity Ads Sending diagnostic batch enabled: " + androidDiagnosticEventRepository.enabled.getValue().booleanValue() + " size: " + list.size() + " :: " + list;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value2;
        tn.p.k(diagnosticEvent, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> lVar = this.batch;
            do {
                value2 = lVar.getValue();
            } while (!lVar.b(value2, f0.P0(value2, diagnosticEvent)));
        } else if (this.enabled.getValue().booleanValue()) {
            l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> lVar2 = this.batch;
            do {
                value = lVar2.getValue();
            } while (!lVar2.b(value, f0.P0(value, diagnosticEvent)));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> lVar = this.batch;
        while (!lVar.b(lVar.getValue(), w.m())) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(@NotNull NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
        tn.p.k(diagnosticEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticEventsConfiguration.getAllowedEventsList();
        tn.p.j(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticEventsConfiguration.getBlockedEventsList();
        tn.p.j(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticEventsConfiguration.getMaxBatchIntervalMs(), new sn.a<r>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure.1
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AndroidDiagnosticEventRepository.this.flush();
            }
        });
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        if (this.enabled.getValue().booleanValue()) {
            l<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> lVar = this.batch;
            do {
                value = lVar.getValue();
            } while (!lVar.b(value, w.m()));
            final List listU = SequencesKt___SequencesKt.U(SequencesKt___SequencesKt.z(SequencesKt___SequencesKt.z(SequencesKt___SequencesKt.K(f0.g0(value), new sn.l<DiagnosticEventRequestOuterClass.DiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEvent>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$2
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(@Nullable DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                    return diagnosticEvent == null ? this.this$0.getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null, null) : diagnosticEvent;
                }
            }), new sn.l<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$3
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                    tn.p.k(diagnosticEvent, "it");
                    return Boolean.valueOf(this.this$0.allowedEvents.isEmpty() || this.this$0.allowedEvents.contains(diagnosticEvent.getEventType()));
                }
            }), new sn.l<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$4
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                    tn.p.k(diagnosticEvent, "it");
                    return Boolean.valueOf(!this.this$0.blockedEvents.contains(diagnosticEvent.getEventType()));
                }
            }));
            if (!listU.isEmpty()) {
                DeviceLog.debug((Callable<String>) new Callable() { // from class: com.unity3d.ads.core.data.repository.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AndroidDiagnosticEventRepository.flush$lambda$3(this.f53397b, listU);
                    }
                });
                i.d(this.coroutineScope, null, null, new AnonymousClass2(listU, null), 3, null);
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    @NotNull
    public p<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
