package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\fJ\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0004R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "Lbn/r;", "reset", "", "encodedString", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "encode", "Landroidx/compose/ui/graphics/Color;", "color", "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "", "byte", "", ImpressionLog.f51753w, "", TypedValues.Custom.S_FLOAT, "Lbn/m;", "uLong", "encode-VKZWuLQ", TypedValues.Custom.S_STRING, "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class EncodeHelper {

    @NotNull
    private Parcel parcel;

    public EncodeHelper() {
        Parcel parcelObtain = Parcel.obtain();
        tn.p.j(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
    }

    public final void encode(byte b10) {
        this.parcel.writeByte(b10);
    }

    public final void encode(float f10) {
        this.parcel.writeFloat(f10);
    }

    public final void encode(int i10) {
        this.parcel.writeInt(i10);
    }

    public final void encode(@NotNull Shadow shadow) {
        tn.p.k(shadow, "shadow");
        m3321encode8_81llA(shadow.getColor());
        encode(Offset.m1383getXimpl(shadow.getOffset()));
        encode(Offset.m1384getYimpl(shadow.getOffset()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(@NotNull SpanStyle spanStyle) {
        tn.p.k(spanStyle, "spanStyle");
        long jM3447getColor0d7_KjU = spanStyle.m3447getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m1620equalsimpl0(jM3447getColor0d7_KjU, companion.m1655getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m3321encode8_81llA(spanStyle.m3447getColor0d7_KjU());
        }
        long fontSize = spanStyle.getFontSize();
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        if (!TextUnit.m4004equalsimpl0(fontSize, companion2.m4018getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m3318encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int iM3555unboximpl = fontStyle.m3555unboximpl();
            encode((byte) 4);
            m3323encodenzbMABs(iM3555unboximpl);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m3320encode6p3vJLY(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m4004equalsimpl0(spanStyle.getLetterSpacing(), companion2.m4018getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m3318encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float fM3689unboximpl = baselineShift.m3689unboximpl();
            encode((byte) 8);
            m3319encode4Dl_Bck(fM3689unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m1620equalsimpl0(spanStyle.getBackground(), companion.m1655getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m3321encode8_81llA(spanStyle.getBackground());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    public final void encode(@NotNull FontWeight fontWeight) {
        tn.p.k(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(@NotNull TextDecoration textDecoration) {
        tn.p.k(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(@NotNull TextGeometricTransform textGeometricTransform) {
        tn.p.k(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(@NotNull String str) {
        tn.p.k(str, TypedValues.Custom.S_STRING);
        this.parcel.writeString(str);
    }

    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m3318encodeR2X_6o(long textUnit) {
        long jM4006getTypeUIouoOA = TextUnit.m4006getTypeUIouoOA(textUnit);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        byte b10 = 0;
        if (!TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4041getUnspecifiedUIouoOA())) {
            if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4040getSpUIouoOA())) {
                b10 = 1;
            } else if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4039getEmUIouoOA())) {
                b10 = 2;
            }
        }
        encode(b10);
        if (TextUnitType.m4035equalsimpl0(TextUnit.m4006getTypeUIouoOA(textUnit), companion.m4041getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m4007getValueimpl(textUnit));
    }

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m3319encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m3320encode6p3vJLY(int fontSynthesis) {
        FontSynthesis.Companion companion = FontSynthesis.INSTANCE;
        byte b10 = 0;
        if (!FontSynthesis.m3561equalsimpl0(fontSynthesis, companion.m3568getNoneGVVA2EU())) {
            if (FontSynthesis.m3561equalsimpl0(fontSynthesis, companion.m3567getAllGVVA2EU())) {
                b10 = 1;
            } else if (FontSynthesis.m3561equalsimpl0(fontSynthesis, companion.m3570getWeightGVVA2EU())) {
                b10 = 2;
            } else if (FontSynthesis.m3561equalsimpl0(fontSynthesis, companion.m3569getStyleGVVA2EU())) {
                b10 = 3;
            }
        }
        encode(b10);
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m3321encode8_81llA(long color) {
        m3322encodeVKZWuLQ(color);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m3322encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m3323encodenzbMABs(int fontStyle) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        byte b10 = 0;
        if (!FontStyle.m3552equalsimpl0(fontStyle, companion.m3557getNormal_LCdwA()) && FontStyle.m3552equalsimpl0(fontStyle, companion.m3556getItalic_LCdwA())) {
            b10 = 1;
        }
        encode(b10);
    }

    @NotNull
    public final String encodedString() {
        String strEncodeToString = Base64.encodeToString(this.parcel.marshall(), 0);
        tn.p.j(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return strEncodeToString;
    }

    public final void reset() {
        this.parcel.recycle();
        Parcel parcelObtain = Parcel.obtain();
        tn.p.j(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
    }
}
