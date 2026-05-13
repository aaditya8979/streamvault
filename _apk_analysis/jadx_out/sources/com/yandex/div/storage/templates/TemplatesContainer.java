package com.yandex.div.storage.templates;

import bn.g;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.a;

/* JADX INFO: compiled from: TemplatesContainer.kt */
/* JADX INFO: loaded from: classes11.dex */
public class TemplatesContainer {

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final ParsingErrorLogger errorLogger;

    @NotNull
    private final Map<String, Object> groupTemplateReferences;

    @Nullable
    private final String histogramComponentName;

    @Nullable
    private final HistogramNameProvider histogramNameProvider;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final g messageDigest$delegate;

    @NotNull
    private final a<DivParsingHistogramProxy> parsingHistogramProxy;

    @NotNull
    private final Map<String, DivParsingEnvironment> templateEnvironments;

    @NotNull
    private final CommonTemplatesPool templatesPool;

    public TemplatesContainer(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull HistogramRecorder histogramRecorder, @NotNull a<DivParsingHistogramProxy> aVar, @Nullable HistogramNameProvider histogramNameProvider) {
        this.divStorage = divStorage;
        this.errorLogger = parsingErrorLogger;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = aVar;
        this.histogramNameProvider = histogramNameProvider;
        String componentName = histogramNameProvider != null ? histogramNameProvider.getComponentName() : null;
        this.histogramComponentName = componentName;
        this.templatesPool = new CommonTemplatesPool(divStorage, parsingErrorLogger, componentName, histogramRecorder, aVar);
        this.groupTemplateReferences = new LinkedHashMap();
        this.templateEnvironments = new LinkedHashMap();
        this.messageDigest$delegate = b.b(new sn.a<MessageDigest>() { // from class: com.yandex.div.storage.templates.TemplatesContainer$messageDigest$2
            {
                super(0);
            }

            @Override // sn.a
            @Nullable
            public final MessageDigest invoke() {
                try {
                    return MessageDigest.getInstance(SameMD5.TAG);
                } catch (NoSuchAlgorithmException e10) {
                    this.this$0.errorLogger.logError(new IllegalStateException("Storage cannot work with templates!", e10));
                    return null;
                }
            }
        });
    }
}
