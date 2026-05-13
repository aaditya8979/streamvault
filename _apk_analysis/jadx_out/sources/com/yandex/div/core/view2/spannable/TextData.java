package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: TextData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TextData {

    @Nullable
    private final String fontFamily;
    private final int fontSize;

    @NotNull
    private final DivSizeUnit fontSizeUnit;
    private final int fontSizeValue;

    @Nullable
    private final DivFontWeight fontWeight;

    @Nullable
    private final Integer fontWeightValue;

    @Nullable
    private final Integer lineHeight;

    @NotNull
    private final String text;
    private final int textColor;
    private final int textLength;

    public TextData(@NotNull String str, @Px int i10, int i11, @NotNull DivSizeUnit divSizeUnit, @Nullable String str2, @Nullable DivFontWeight divFontWeight, @Nullable Integer num, @Px @Nullable Integer num2, @ColorInt int i12) {
        this.text = str;
        this.fontSize = i10;
        this.fontSizeValue = i11;
        this.fontSizeUnit = divSizeUnit;
        this.fontFamily = str2;
        this.fontWeight = divFontWeight;
        this.fontWeightValue = num;
        this.lineHeight = num2;
        this.textColor = i12;
        this.textLength = str.length();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) obj;
        return p.f(this.text, textData.text) && this.fontSize == textData.fontSize && this.fontSizeValue == textData.fontSizeValue && this.fontSizeUnit == textData.fontSizeUnit && p.f(this.fontFamily, textData.fontFamily) && this.fontWeight == textData.fontWeight && p.f(this.fontWeightValue, textData.fontWeightValue) && p.f(this.lineHeight, textData.lineHeight) && this.textColor == textData.textColor;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final int getFontSizeValue() {
        return this.fontSizeValue;
    }

    @Nullable
    public final DivFontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextLength() {
        return this.textLength;
    }

    public int hashCode() {
        int iHashCode = ((((((this.text.hashCode() * 31) + Integer.hashCode(this.fontSize)) * 31) + Integer.hashCode(this.fontSizeValue)) * 31) + this.fontSizeUnit.hashCode()) * 31;
        String str = this.fontFamily;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivFontWeight divFontWeight = this.fontWeight;
        int iHashCode3 = (iHashCode2 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num = this.fontWeightValue;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lineHeight;
        return ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.textColor);
    }

    @NotNull
    public String toString() {
        return "TextData(text=" + this.text + ", fontSize=" + this.fontSize + ", fontSizeValue=" + this.fontSizeValue + ", fontSizeUnit=" + this.fontSizeUnit + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ')';
    }
}
