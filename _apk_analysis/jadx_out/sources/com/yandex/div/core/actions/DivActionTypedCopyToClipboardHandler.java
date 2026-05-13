package com.yandex.div.core.actions;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.webkit.internal.AssetHelper;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionCopyToClipboardContent;
import com.yandex.div2.DivActionTyped;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivActionTypedCopyToClipboardHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivActionTypedCopyToClipboardHandler implements DivActionTypedHandler {
    private final ClipData getClipData(DivActionCopyToClipboardContent.b bVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied text", new String[]{AssetHelper.DEFAULT_MIME_TYPE}, new ClipData.Item(bVar.c().f54067a.evaluate(expressionResolver)));
    }

    private final ClipData getClipData(DivActionCopyToClipboardContent.c cVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied url", new String[]{"text/uri-list"}, new ClipData.Item(cVar.c().f54074a.evaluate(expressionResolver)));
    }

    private final ClipData getClipData(DivActionCopyToClipboardContent divActionCopyToClipboardContent, ExpressionResolver expressionResolver) {
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.b) {
            return getClipData((DivActionCopyToClipboardContent.b) divActionCopyToClipboardContent, expressionResolver);
        }
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.c) {
            return getClipData((DivActionCopyToClipboardContent.c) divActionCopyToClipboardContent, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void handleCopyToClipboard(DivActionCopyToClipboardContent divActionCopyToClipboardContent, Div2View div2View, ExpressionResolver expressionResolver) {
        Object systemService = div2View.getContext$div_release().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
        } else {
            clipboardManager.setPrimaryClip(getClipData(divActionCopyToClipboardContent, expressionResolver));
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.h)) {
            return false;
        }
        handleCopyToClipboard(((DivActionTyped.h) divActionTyped).c().f54268a, div2View, expressionResolver);
        return true;
    }
}
