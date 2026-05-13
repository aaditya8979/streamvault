package com.yandex.div.core.util.mask;

import bn.r;
import bo.a0;
import bo.d0;
import cn.w;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: CurrencyInputMask.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CurrencyInputMask extends BaseInputMask {

    @NotNull
    private NumberFormat currencyFormatter;
    private final char currencyKey;

    @NotNull
    private final l<Exception, r> onError;

    @NotNull
    private final List<Character> separators;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyInputMask(@NotNull Locale locale, @NotNull l<? super Exception, r> lVar) {
        super(new BaseInputMask.MaskData("", w.m(), false));
        this.onError = lVar;
        this.currencyKey = (char) 164;
        this.separators = w.p('.', ',');
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
    }

    private final NumberFormat clearFormatter(NumberFormat numberFormat) throws IOException {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            StringBuilder sb2 = new StringBuilder();
            int length = pattern.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = pattern.charAt(i10);
                if (cCharAt != this.currencyKey) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            p.j(string, "toString(...)");
            decimalFormat.applyPattern(d0.s1(string).toString());
        }
        return numberFormat;
    }

    private final String formatPattern(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append('#');
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        p.j(string, "toString(...)");
        return string;
    }

    private final DecimalFormatSymbols getDecimalFormatSymbols() {
        NumberFormat numberFormat = this.currencyFormatter;
        p.i(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        return ((DecimalFormat) numberFormat).getDecimalFormatSymbols();
    }

    private final String getWithNbsp(String str) {
        return a0.R(str, ' ', (char) 160, false, 4, null);
    }

    private final boolean inDiff(TextDiff textDiff, int i10) {
        return textDiff.getStart() <= i10 && i10 < textDiff.getStart() + textDiff.getAdded();
    }

    private final void invalidateMaskDataForFormatted(Number number) {
        String pattern = formatPattern(this.currencyFormatter.format(number));
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(getDecimalFormatSymbols().getDecimalSeparator());
        sb2.append(']');
        updateMaskData(new BaseInputMask.MaskData(pattern, w.p(new BaseInputMask.MaskKey('#', "\\d", '0'), new BaseInputMask.MaskKey(decimalSeparator, sb2.toString(), getDecimalFormatSymbols().getDecimalSeparator())), getMaskData().getAlwaysVisible()), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String toValidFormat(java.lang.String r18, com.yandex.div.core.util.mask.TextDiff r19) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.mask.CurrencyInputMask.toValidFormat(java.lang.String, com.yandex.div.core.util.mask.TextDiff):java.lang.String");
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(@NotNull String str, @Nullable Integer num) throws ParseException {
        String strValueOf;
        int iAbs;
        TextDiff textDiffBuild = TextDiff.Companion.build(getValue(), getWithNbsp(str));
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        String value = getValue();
        int length = value.length() - 1;
        boolean z10 = true;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (value.charAt(length) == decimalSeparator) {
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length = i10;
                }
            }
            length = -1;
        } else {
            length = -1;
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (str.charAt(length2) == decimalSeparator) {
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length2 = i11;
                }
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        if (length == length2 && (length != -1 || length2 != -1)) {
            z10 = false;
        }
        String validFormat = toValidFormat(str, textDiffBuild);
        NumberFormat numberFormat = this.currencyFormatter;
        if (d0.Y0(validFormat, decimalSeparator, false, 2, null)) {
            strValueOf = getDecimalFormatSymbols().getZeroDigit() + validFormat;
        } else {
            strValueOf = d0.u0(validFormat) ? String.valueOf(getDecimalFormatSymbols().getZeroDigit()) : validFormat;
        }
        Number number = numberFormat.parse(strValueOf);
        if (number == null) {
            number = 0;
        }
        cleanup(textDiffBuild);
        if (z10) {
            invalidateMaskDataForFormatted(number);
        }
        BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
        if (getValue().length() <= textDiffBuild.getStart() || getValue().charAt(textDiffBuild.getStart()) != getDecimalFormatSymbols().getGroupingSeparator()) {
            iAbs = Math.abs(getValue().length() - (str.length() - (num != null ? num.intValue() : getCursorPosition())));
        } else {
            iAbs = num != null ? num.intValue() : getCursorPosition();
        }
        setCursorPosition(n.j(iAbs, getValue().length()));
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exc) {
        this.onError.invoke(exc);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(@NotNull String str) throws ParseException {
        Number number = this.currencyFormatter.parse(str);
        if (number == null) {
            number = 0;
        }
        invalidateMaskDataForFormatted(number);
        super.overrideRawValue(str);
    }

    public final void updateCurrencyParams(@NotNull Locale locale) {
        String strR = a0.R(getRawValue(), getDecimalFormatSymbols().getDecimalSeparator(), '.', false, 4, null);
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
        BaseInputMask.applyChangeFrom$default(this, a0.R(strR, '.', getDecimalFormatSymbols().getDecimalSeparator(), false, 4, null), null, 2, null);
    }
}
