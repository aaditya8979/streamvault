package com.yandex.div.core.extension;

import ah.e2;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivExtension;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivExtensionController.kt */
/* JADX INFO: loaded from: classes2.dex */
public class DivExtensionController {

    @NotNull
    private final List<DivExtensionHandler> extensionHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public DivExtensionController(@NotNull List<? extends DivExtensionHandler> list) {
        this.extensionHandlers = list;
    }

    private boolean hasExtensions(e2 e2Var) {
        List<DivExtension> extensions = e2Var.getExtensions();
        return !(extensions == null || extensions.isEmpty()) && (this.extensionHandlers.isEmpty() ^ true);
    }

    public void beforeBindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull e2 e2Var) {
        if (hasExtensions(e2Var)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(e2Var)) {
                    divExtensionHandler.beforeBindView(div2View, expressionResolver, view, e2Var);
                }
            }
        }
    }

    public void bindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull e2 e2Var) {
        if (hasExtensions(e2Var)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(e2Var)) {
                    divExtensionHandler.bindView(div2View, expressionResolver, view, e2Var);
                }
            }
        }
    }

    public void preprocessExtensions(@NotNull e2 e2Var, @NotNull ExpressionResolver expressionResolver) {
        if (hasExtensions(e2Var)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(e2Var)) {
                    divExtensionHandler.preprocess(e2Var, expressionResolver);
                }
            }
        }
    }

    public void unbindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull e2 e2Var) {
        if (hasExtensions(e2Var)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(e2Var)) {
                    divExtensionHandler.unbindView(div2View, expressionResolver, view, e2Var);
                }
            }
        }
    }
}
