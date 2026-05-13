package com.yandex.div.core.util.mask;

import bn.r;
import com.yandex.div.core.util.mask.BaseInputMask;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: FixedLengthInputMask.kt */
/* JADX INFO: loaded from: classes10.dex */
public class FixedLengthInputMask extends BaseInputMask {

    @NotNull
    private final l<Exception, r> onError;

    /* JADX WARN: Multi-variable type inference failed */
    public FixedLengthInputMask(@NotNull BaseInputMask.MaskData maskData, @NotNull l<? super Exception, r> lVar) {
        super(maskData);
        this.onError = lVar;
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exc) {
        this.onError.invoke(exc);
    }
}
