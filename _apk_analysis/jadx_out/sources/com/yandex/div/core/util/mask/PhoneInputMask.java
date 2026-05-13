package com.yandex.div.core.util.mask;

import bn.r;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.TextDiff;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import sn.l;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: PhoneInputMask.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PhoneInputMask extends BaseInputMask {

    @NotNull
    private final l<Exception, r> onError;

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneInputMask(@NotNull l<? super Exception, r> lVar) {
        super(PhoneInputMaskKt.getDEFAULT_MASK_DATA());
        this.onError = lVar;
    }

    private final void calculateCursorPositionBy(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < getDestructedValue().size() && i12 < i10) {
            int i13 = i11 + 1;
            if (getDestructedValue().get(i11) instanceof BaseInputMask.MaskChar.Dynamic) {
                i12++;
            }
            i11 = i13;
        }
        setCursorPosition(firstHolderAfter(i11));
    }

    private final String newMaskPatternFor(String str) throws JSONException {
        String phoneMaskPattern = PhoneInputMaskKt.getPhoneMaskPattern(str);
        if (p.f(phoneMaskPattern, getMaskData().getPattern())) {
            return null;
        }
        return phoneMaskPattern;
    }

    private final r tryInvalidateMaskDataWith(String str) throws JSONException {
        String strNewMaskPatternFor = newMaskPatternFor(str);
        if (strNewMaskPatternFor == null) {
            return null;
        }
        updateMaskDataWith(strNewMaskPatternFor);
        return r.f5635a;
    }

    private final void updateMaskDataWith(String str) {
        updateMaskData(new BaseInputMask.MaskData(str, PhoneInputMaskKt.getDEFAULT_DECODING_MASK_KEY(), getMaskData().getAlwaysVisible()), false);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(@NotNull String str, @Nullable Integer num) throws JSONException {
        TextDiff.Companion companion = TextDiff.Companion;
        TextDiff textDiffBuild = companion.build(getValue(), str);
        if (num != null) {
            textDiffBuild = new TextDiff(n.e(num.intValue() - textDiffBuild.getAdded(), 0), textDiffBuild.getAdded(), textDiffBuild.getRemoved());
        }
        String rawValue = getRawValue();
        int iReplaceBodyTail = replaceBodyTail(textDiffBuild, str);
        String rawValue2 = getRawValue();
        String strNewMaskPatternFor = newMaskPatternFor(rawValue2);
        if (strNewMaskPatternFor == null) {
            calculateCursorPosition(textDiffBuild, iReplaceBodyTail);
            return;
        }
        updateMaskDataWith(strNewMaskPatternFor);
        BaseInputMask.replaceChars$default(this, rawValue2, 0, null, 4, null);
        TextDiff textDiffBuild2 = companion.build(rawValue, rawValue2);
        calculateCursorPositionBy(textDiffBuild2.getStart() + textDiffBuild2.getAdded());
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exc) {
        this.onError.invoke(exc);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(@NotNull String str) throws JSONException {
        tryInvalidateMaskDataWith(str);
        super.overrideRawValue(str);
    }
}
