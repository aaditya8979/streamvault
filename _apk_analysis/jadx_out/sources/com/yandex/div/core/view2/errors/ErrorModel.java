package com.yandex.div.core.view2.errors;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import androidx.compose.material.TextFieldImplKt;
import androidx.webkit.internal.AssetHelper;
import bn.d;
import bn.r;
import cn.d0;
import cn.f0;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.errors.ErrorModel;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.JsonNode;
import com.yandex.div.json.ParsingException;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: ErrorVisualMonitor.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorModel {

    @Nullable
    private DivDataTag dataTag;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @Nullable
    private Disposable existingSubscription;
    private final boolean visualErrorsEnabled;

    @NotNull
    private final Set<l<ErrorViewModel, r>> observers = new LinkedHashSet();

    @NotNull
    private final List<Throwable> currentErrors = new ArrayList();

    @NotNull
    private final List<Throwable> currentWarnings = new ArrayList();

    @NotNull
    private final LogcatErrorDumper logcatErrorDumper = new LogcatErrorDumper();

    @NotNull
    private final p<List<? extends Throwable>, List<? extends Throwable>, r> updateOnErrors = new p<List<? extends Throwable>, List<? extends Throwable>, r>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$updateOnErrors$1
        {
            super(2);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(List<? extends Throwable> list, List<? extends Throwable> list2) {
            invoke2(list, list2);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<? extends Throwable> list, @NotNull List<? extends Throwable> list2) {
            if (this.this$0.visualErrorsEnabled) {
                List list3 = this.this$0.currentErrors;
                list3.clear();
                List listJ1 = f0.j1(list);
                d0.e0(listJ1);
                list3.addAll(listJ1);
                List list4 = this.this$0.currentWarnings;
                list4.clear();
                List listJ12 = f0.j1(list2);
                d0.e0(listJ12);
                list4.addAll(listJ12);
                ErrorModel errorModel = this.this$0;
                ErrorViewModel errorViewModel = errorModel.state;
                int size = this.this$0.currentErrors.size();
                ErrorModel errorModel2 = this.this$0;
                String strErrorsToDetails = errorModel2.errorsToDetails(errorModel2.currentErrors);
                int size2 = this.this$0.currentWarnings.size();
                ErrorModel errorModel3 = this.this$0;
                errorModel.setState(ErrorViewModel.copy$default(errorViewModel, false, size, size2, strErrorsToDetails, errorModel3.warningsToDetails(errorModel3.currentWarnings), 1, null));
                this.this$0.logcatErrorDumper.logErrors(this.this$0.currentErrors, this.this$0.currentWarnings, this.this$0.dataTag);
            }
        }
    };

    @NotNull
    private ErrorViewModel state = new ErrorViewModel(false, 0, 0, null, null, 31, null);

    /* JADX INFO: renamed from: com.yandex.div.core.view2.errors.ErrorModel$getErrorHandler$1, reason: invalid class name */
    /* JADX INFO: compiled from: ErrorVisualMonitor.kt */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements l<Throwable, r> {
        public AnonymousClass1(Object obj) {
            super(1, obj, DivActionTypedUtilsKt.class, "logError", "logError(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Throwable;)V", 1);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
            invoke2(th2);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th2) {
            DivActionTypedUtilsKt.logError((Div2View) this.receiver, th2);
        }
    }

    public ErrorModel(@NotNull ErrorCollectors errorCollectors, @NotNull Div2View div2View, boolean z10) {
        this.errorCollectors = errorCollectors;
        this.div2View = div2View;
        this.visualErrorsEnabled = z10;
    }

    private final JSONObject dumpCardWithContextVariables() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templates", new JSONObject());
        DivData divData = this.div2View.getDivData();
        jSONObject.put("card", divData != null ? divData.writeToJSON() : null);
        jSONObject.put("variables", dumpGlobalVariables());
        return jSONObject;
    }

    private final JSONArray dumpGlobalVariables() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.div2View.getDiv2Component$div_release().getDivVariableController().captureAllVariables().iterator();
        while (it.hasNext()) {
            jSONArray.put(((Variable) it.next()).writeToJSON());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String errorsToDetails(List<? extends Throwable> list) {
        return "Last 25 errors:\n" + f0.D0(f0.Y0(list, 25), "\n", null, null, 0, null, new l<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$errorsToDetails$errorsList$1
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull Throwable th2) {
                if (!(th2 instanceof ParsingException)) {
                    return " - " + ErrorVisualMonitorKt.getFullStackMessage(th2);
                }
                return " - " + ((ParsingException) th2).getReason() + ": " + ErrorVisualMonitorKt.getFullStackMessage(th2);
            }
        }, 30, null);
    }

    private final String generateReport(boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.currentErrors.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (Throwable th2 : this.currentErrors) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", ErrorVisualMonitorKt.getFullStackMessage(th2));
                jSONObject2.put("stacktrace", d.b(th2));
                if (th2 instanceof ParsingException) {
                    ParsingException parsingException = (ParsingException) th2;
                    jSONObject2.put("reason", parsingException.getReason());
                    JsonNode source = parsingException.getSource();
                    jSONObject2.put("json_source", source != null ? source.dump() : null);
                    jSONObject2.put("json_summary", parsingException.getJsonSummary());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("errors", jSONArray);
        }
        if (this.currentWarnings.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (Throwable th3 : this.currentWarnings) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("warning_message", th3.getMessage());
                jSONObject3.put("stacktrace", d.b(th3));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("warnings", jSONArray2);
        }
        if (z10) {
            jSONObject.put("card", dumpCardWithContextVariables());
        }
        return jSONObject.toString(4);
    }

    public static /* synthetic */ String generateReport$default(ErrorModel errorModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return errorModel.generateReport(z10);
    }

    private final VariableController getVariableController(ExpressionsRuntime expressionsRuntime) {
        return expressionsRuntime.getExpressionResolver().getVariableController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$0(ErrorModel errorModel, l lVar) {
        errorModel.observers.remove(lVar);
    }

    /* JADX INFO: renamed from: pasteToClipBoard-IoAF18A, reason: not valid java name */
    private final Object m7394pasteToClipBoardIoAF18A(String str) {
        Div2Context context$div_release = this.div2View.getContext$div_release();
        Object systemService = context$div_release.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(r.f5635a);
        }
        try {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{AssetHelper.DEFAULT_MIME_TYPE}, new ClipData.Item(str)));
            Toast.makeText(context$div_release, "Errors, DivData and Variables are dumped to clipboard!", 1).show();
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(r.f5635a);
        } catch (Exception e10) {
            Result.a aVar3 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new RuntimeException("Failed paste report to clipboard!", e10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ErrorViewModel errorViewModel) {
        this.state = errorViewModel;
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(errorViewModel);
        }
    }

    private final void showDetails() {
        setState(ErrorViewModel.copy$default(this.state, true, 0, 0, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String warningsToDetails(List<? extends Throwable> list) {
        return "Last 25 warnings:\n" + f0.D0(f0.Y0(list, 25), "\n", null, null, 0, null, new l<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$warningsToDetails$warningsList$1
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull Throwable th2) {
                return " - " + ErrorVisualMonitorKt.getFullStackMessage(th2);
            }
        }, 30, null);
    }

    public final void bind(@NotNull Binding binding) {
        this.dataTag = binding.getTag();
        Disposable disposable = this.existingSubscription;
        if (disposable != null) {
            disposable.close();
        }
        this.existingSubscription = this.errorCollectors.getOrCreate(binding.getTag(), binding.getData()).observeAndGet(this.updateOnErrors);
    }

    public final void copyReportToClipboard() {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(m7394pasteToClipBoardIoAF18A(generateReport$default(this, false, 1, null)));
        if (thM7537exceptionOrNullimpl == null || !ErrorVisualMonitorKt.causedByTransactionTooLargeException(thM7537exceptionOrNullimpl)) {
            return;
        }
        m7394pasteToClipBoardIoAF18A(generateReport(false));
    }

    @NotNull
    public final Map<String, VariableController> getAllControllers() {
        RuntimeStore runtimeStore$div_release = this.div2View.getRuntimeStore$div_release();
        Map<String, ExpressionsRuntime> uniquePathsAndRuntimes = runtimeStore$div_release.getUniquePathsAndRuntimes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("", getVariableController(runtimeStore$div_release.getRootRuntime()));
        for (Map.Entry<String, ExpressionsRuntime> entry : uniquePathsAndRuntimes.entrySet()) {
            linkedHashMap.put(entry.getKey(), getVariableController(entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public final l<Throwable, r> getErrorHandler() {
        return new AnonymousClass1(this.div2View);
    }

    public final void hideDetails() {
        setState(ErrorViewModel.copy$default(this.state, false, 0, 0, null, null, 30, null));
    }

    @NotNull
    public final Disposable observeAndGet(@NotNull final l<? super ErrorViewModel, r> lVar) {
        this.observers.add(lVar);
        lVar.invoke(this.state);
        return new Disposable() { // from class: mg.b
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorModel.observeAndGet$lambda$0(this.f74245b, lVar);
            }
        };
    }

    public final void onCounterClick(int i10, int i11) {
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(TextFieldImplKt.AnimationDuration), this.div2View.getContext$div_release().getResources().getDisplayMetrics());
        if (i10 < iDpToPx || i11 < iDpToPx) {
            copyReportToClipboard();
        } else {
            showDetails();
        }
    }
}
