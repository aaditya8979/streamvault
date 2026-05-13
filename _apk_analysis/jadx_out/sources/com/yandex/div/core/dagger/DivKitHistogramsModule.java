package com.yandex.div.core.dagger;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporterImpl;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.util.DoubleCheckProvider;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DivKitHistogramsModule.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivKitHistogramsModule {

    @NotNull
    public static final DivKitHistogramsModule INSTANCE = new DivKitHistogramsModule();

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideDivParsingHistogramReporter$1, reason: invalid class name */
    /* JADX INFO: compiled from: DivKitHistogramsModule.kt */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sn.a<HistogramReporter> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ym.a.class, "get", "get()Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        public final HistogramReporter invoke() {
            return (HistogramReporter) ((ym.a) this.receiver).get();
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideDivParsingHistogramReporter$2, reason: invalid class name */
    /* JADX INFO: compiled from: DivKitHistogramsModule.kt */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sn.a<Executor> {
        public AnonymousClass2(Object obj) {
            super(0, obj, ym.a.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // sn.a
        public final Executor invoke() {
            return (Executor) ((ym.a) this.receiver).get();
        }
    }

    private DivKitHistogramsModule() {
    }

    private final ym.a<Executor> provideCalculateSizeExecutor(HistogramConfiguration histogramConfiguration, ym.a<ExecutorService> aVar) {
        if (!histogramConfiguration.isSizeRecordingEnabled()) {
            return new ym.a() { // from class: com.yandex.div.core.dagger.a
                @Override // ym.a
                public final Object get() {
                    return DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1();
                }
            };
        }
        p.i(aVar, "null cannot be cast to non-null type javax.inject.Provider<java.util.concurrent.Executor>");
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor provideCalculateSizeExecutor$lambda$1() {
        return new Executor() { // from class: com.yandex.div.core.dagger.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1$lambda$0(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideCalculateSizeExecutor$lambda$1$lambda$0(Runnable runnable) {
    }

    private final ym.a<HistogramReporter> provideHistogramReporter(final HistogramReporterDelegate histogramReporterDelegate) {
        return new DoubleCheckProvider(new sn.a<HistogramReporter>() { // from class: com.yandex.div.core.dagger.DivKitHistogramsModule.provideHistogramReporter.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final HistogramReporter invoke() {
                return DivHistogramsModuleKt.createHistogramReporter(histogramReporterDelegate);
            }
        });
    }

    @NotNull
    public final DivParsingHistogramReporter provideDivParsingHistogramReporter(@NotNull HistogramConfiguration histogramConfiguration, @NotNull ym.a<HistogramReporterDelegate> aVar, @NotNull ym.a<ExecutorService> aVar2) {
        if (!histogramConfiguration.isReportingEnabled()) {
            return DivParsingHistogramReporter.Companion.getDEFAULT();
        }
        return new DivParsingHistogramReporterImpl(new AnonymousClass1(provideHistogramReporter(aVar.get())), new AnonymousClass2(provideCalculateSizeExecutor(histogramConfiguration, aVar2)));
    }

    @NotNull
    public final HistogramReporterDelegate provideHistogramReporterDelegate(@NotNull HistogramConfiguration histogramConfiguration, @NotNull ym.a<HistogramRecorder> aVar, @NotNull ym.a<HistogramColdTypeChecker> aVar2) {
        return histogramConfiguration.isReportingEnabled() ? DivHistogramsModuleKt.createHistogramReporterDelegate(histogramConfiguration, aVar, aVar2) : HistogramReporterDelegate.NoOp.INSTANCE;
    }
}
